package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* loaded from: classes.dex */
public final class SingleProcessDataStore implements DataStore {
    public static final Companion Companion = new Companion(null);
    private static final Set activeFiles = new LinkedHashSet();
    private static final Object activeFilesLock = new Object();
    private final String SCRATCH_SUFFIX;
    private final SimpleActor actor;
    private final CorruptionHandler corruptionHandler;
    private final Flow data;
    private final MutableStateFlow downstreamFlow;
    private final Lazy file$delegate;
    private List initTasks;
    private final Function0 produceFile;
    private final CoroutineScope scope;
    private final Serializer serializer;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set getActiveFiles$datastore_core() {
            return SingleProcessDataStore.activeFiles;
        }

        public final Object getActiveFilesLock$datastore_core() {
            return SingleProcessDataStore.activeFilesLock;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class Message {

        public static final class Read extends Message {
            private final State lastState;

            public Read(State state) {
                super(null);
                this.lastState = state;
            }

            public State getLastState() {
                return this.lastState;
            }
        }

        public static final class Update extends Message {
            private final CompletableDeferred ack;
            private final CoroutineContext callerContext;
            private final State lastState;
            private final Function2 transform;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Update(Function2 transform, CompletableDeferred ack, State state, CoroutineContext callerContext) {
                super(null);
                Intrinsics.checkNotNullParameter(transform, "transform");
                Intrinsics.checkNotNullParameter(ack, "ack");
                Intrinsics.checkNotNullParameter(callerContext, "callerContext");
                this.transform = transform;
                this.ack = ack;
                this.lastState = state;
                this.callerContext = callerContext;
            }

            public final CompletableDeferred getAck() {
                return this.ack;
            }

            public final CoroutineContext getCallerContext() {
                return this.callerContext;
            }

            public State getLastState() {
                return this.lastState;
            }

            public final Function2 getTransform() {
                return this.transform;
            }
        }

        private Message() {
        }

        public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final class UncloseableOutputStream extends OutputStream {
        private final FileOutputStream fileOutputStream;

        public UncloseableOutputStream(FileOutputStream fileOutputStream) {
            Intrinsics.checkNotNullParameter(fileOutputStream, "fileOutputStream");
            this.fileOutputStream = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.fileOutputStream.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.fileOutputStream.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] b) {
            Intrinsics.checkNotNullParameter(b, "b");
            this.fileOutputStream.write(b);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bytes, int i, int i2) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            this.fileOutputStream.write(bytes, i, i2);
        }
    }

    public SingleProcessDataStore(Function0 produceFile, Serializer serializer, List initTasksList, CorruptionHandler corruptionHandler, CoroutineScope scope) {
        Lazy lazy;
        Intrinsics.checkNotNullParameter(produceFile, "produceFile");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        Intrinsics.checkNotNullParameter(corruptionHandler, "corruptionHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.produceFile = produceFile;
        this.serializer = serializer;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        this.data = FlowKt.flow(new SingleProcessDataStore$data$1(this, null));
        this.SCRATCH_SUFFIX = ".tmp";
        lazy = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: androidx.datastore.core.SingleProcessDataStore$file$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final File invoke() {
                Function0 function0;
                function0 = SingleProcessDataStore.this.produceFile;
                File file = (File) function0.invoke();
                String it = file.getAbsolutePath();
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.Companion;
                synchronized (companion.getActiveFilesLock$datastore_core()) {
                    if (!(!companion.getActiveFiles$datastore_core().contains(it))) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    Set activeFiles$datastore_core = companion.getActiveFiles$datastore_core();
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    activeFiles$datastore_core.add(it);
                }
                return file;
            }
        });
        this.file$delegate = lazy;
        this.downstreamFlow = StateFlowKt.MutableStateFlow(UnInitialized.INSTANCE);
        this.initTasks = CollectionsKt___CollectionsKt.toList(initTasksList);
        this.actor = new SimpleActor(scope, new Function1() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(Throwable th) {
                File file;
                MutableStateFlow mutableStateFlow;
                if (th != null) {
                    mutableStateFlow = SingleProcessDataStore.this.downstreamFlow;
                    mutableStateFlow.setValue(new Final(th));
                }
                SingleProcessDataStore.Companion companion = SingleProcessDataStore.Companion;
                Object activeFilesLock$datastore_core = companion.getActiveFilesLock$datastore_core();
                SingleProcessDataStore singleProcessDataStore = SingleProcessDataStore.this;
                synchronized (activeFilesLock$datastore_core) {
                    Set activeFiles$datastore_core = companion.getActiveFiles$datastore_core();
                    file = singleProcessDataStore.getFile();
                    activeFiles$datastore_core.remove(file.getAbsolutePath());
                    Unit unit = Unit.INSTANCE;
                }
            }
        }, new Function2() { // from class: androidx.datastore.core.SingleProcessDataStore$actor$2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((SingleProcessDataStore.Message) obj, (Throwable) obj2);
                return Unit.INSTANCE;
            }

            public final void invoke(SingleProcessDataStore.Message msg, Throwable th) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg instanceof SingleProcessDataStore.Message.Update) {
                    CompletableDeferred ack = ((SingleProcessDataStore.Message.Update) msg).getAck();
                    if (th == null) {
                        th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                    }
                    ack.completeExceptionally(th);
                }
            }
        }, new SingleProcessDataStore$actor$3(this, null));
    }

    private final void createParentDirectories(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(Intrinsics.stringPlus("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File getFile() {
        return (File) this.file$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleRead(Message.Read read, Continuation continuation) {
        Object coroutine_suspended;
        Object coroutine_suspended2;
        State state = (State) this.downstreamFlow.getValue();
        if (!(state instanceof Data)) {
            if (state instanceof ReadException) {
                if (state == read.getLastState()) {
                    Object readAndInitOrPropagateFailure = readAndInitOrPropagateFailure(continuation);
                    coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return readAndInitOrPropagateFailure == coroutine_suspended2 ? readAndInitOrPropagateFailure : Unit.INSTANCE;
                }
            } else {
                if (Intrinsics.areEqual(state, UnInitialized.INSTANCE)) {
                    Object readAndInitOrPropagateFailure2 = readAndInitOrPropagateFailure(continuation);
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return readAndInitOrPropagateFailure2 == coroutine_suspended ? readAndInitOrPropagateFailure2 : Unit.INSTANCE;
                }
                if (state instanceof Final) {
                    throw new IllegalStateException("Can't read in final state.".toString());
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(14:0|1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53))))|24|(1:27)|26|14|15|16))|59|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0034, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r9v20, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v27, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUpdate(Message.Update update, Continuation continuation) {
        SingleProcessDataStore$handleUpdate$1 singleProcessDataStore$handleUpdate$1;
        Object coroutine_suspended;
        int i;
        Object obj;
        ?? r9;
        CompletableDeferred ack;
        State state;
        SingleProcessDataStore singleProcessDataStore;
        Object transformAndWrite;
        Message.Update update2;
        Message.Update update3;
        if (continuation instanceof SingleProcessDataStore$handleUpdate$1) {
            singleProcessDataStore$handleUpdate$1 = (SingleProcessDataStore$handleUpdate$1) continuation;
            int i2 = singleProcessDataStore$handleUpdate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$handleUpdate$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = singleProcessDataStore$handleUpdate$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$handleUpdate$1.label;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        update3 = (CompletableDeferred) singleProcessDataStore$handleUpdate$1.L$0;
                    } else if (i == 2) {
                        CompletableDeferred completableDeferred = (CompletableDeferred) singleProcessDataStore$handleUpdate$1.L$2;
                        singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$handleUpdate$1.L$1;
                        Message.Update update4 = (Message.Update) singleProcessDataStore$handleUpdate$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        ack = completableDeferred;
                        update2 = update4;
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        update3 = (CompletableDeferred) singleProcessDataStore$handleUpdate$1.L$0;
                    }
                    ResultKt.throwOnFailure(obj2);
                    update = update3;
                    obj = Result.constructor-impl(obj2);
                    r9 = update;
                    CompletableDeferredKt.completeWith(r9, obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj2);
                ack = update.getAck();
                try {
                    Result.Companion companion = Result.Companion;
                    state = (State) this.downstreamFlow.getValue();
                } catch (Throwable th) {
                    th = th;
                    update = ack;
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.constructor-impl(ResultKt.createFailure(th));
                    r9 = update;
                    CompletableDeferredKt.completeWith(r9, obj);
                    return Unit.INSTANCE;
                }
                if (state instanceof Data) {
                    Function2 transform = update.getTransform();
                    CoroutineContext callerContext = update.getCallerContext();
                    singleProcessDataStore$handleUpdate$1.L$0 = ack;
                    singleProcessDataStore$handleUpdate$1.label = 1;
                    transformAndWrite = transformAndWrite(transform, callerContext, singleProcessDataStore$handleUpdate$1);
                    if (transformAndWrite == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Message.Update update5 = ack;
                    obj2 = transformAndWrite;
                    update = update5;
                    obj = Result.constructor-impl(obj2);
                    r9 = update;
                    CompletableDeferredKt.completeWith(r9, obj);
                    return Unit.INSTANCE;
                }
                if (!(state instanceof ReadException)) {
                    z = state instanceof UnInitialized;
                }
                if (!z) {
                    if (state instanceof Final) {
                        throw ((Final) state).getFinalException();
                    }
                    throw new NoWhenBranchMatchedException();
                }
                if (state != update.getLastState()) {
                    throw ((ReadException) state).getReadException();
                }
                singleProcessDataStore$handleUpdate$1.L$0 = update;
                singleProcessDataStore$handleUpdate$1.L$1 = this;
                singleProcessDataStore$handleUpdate$1.L$2 = ack;
                singleProcessDataStore$handleUpdate$1.label = 2;
                if (readAndInitOrPropagateAndThrowFailure(singleProcessDataStore$handleUpdate$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                singleProcessDataStore = this;
                update2 = update;
                Function2 transform2 = update2.getTransform();
                CoroutineContext callerContext2 = update2.getCallerContext();
                singleProcessDataStore$handleUpdate$1.L$0 = ack;
                singleProcessDataStore$handleUpdate$1.L$1 = null;
                singleProcessDataStore$handleUpdate$1.L$2 = null;
                singleProcessDataStore$handleUpdate$1.label = 3;
                transformAndWrite = singleProcessDataStore.transformAndWrite(transform2, callerContext2, singleProcessDataStore$handleUpdate$1);
                if (transformAndWrite == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Message.Update update52 = ack;
                obj2 = transformAndWrite;
                update = update52;
                obj = Result.constructor-impl(obj2);
                r9 = update;
                CompletableDeferredKt.completeWith(r9, obj);
                return Unit.INSTANCE;
            }
        }
        singleProcessDataStore$handleUpdate$1 = new SingleProcessDataStore$handleUpdate$1(this, continuation);
        Object obj22 = singleProcessDataStore$handleUpdate$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$handleUpdate$1.label;
        boolean z2 = true;
        if (i == 0) {
        }
        Function2 transform22 = update2.getTransform();
        CoroutineContext callerContext22 = update2.getCallerContext();
        singleProcessDataStore$handleUpdate$1.L$0 = ack;
        singleProcessDataStore$handleUpdate$1.L$1 = null;
        singleProcessDataStore$handleUpdate$1.L$2 = null;
        singleProcessDataStore$handleUpdate$1.label = 3;
        transformAndWrite = singleProcessDataStore.transformAndWrite(transform22, callerContext22, singleProcessDataStore$handleUpdate$1);
        if (transformAndWrite == coroutine_suspended) {
        }
        Message.Update update522 = ack;
        obj22 = transformAndWrite;
        update = update522;
        obj = Result.constructor-impl(obj22);
        r9 = update;
        CompletableDeferredKt.completeWith(r9, obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInit(Continuation continuation) {
        SingleProcessDataStore$readAndInit$1 singleProcessDataStore$readAndInit$1;
        Object coroutine_suspended;
        int i;
        Mutex Mutex$default;
        Ref$ObjectRef ref$ObjectRef;
        SingleProcessDataStore singleProcessDataStore;
        Ref$ObjectRef ref$ObjectRef2;
        List list;
        SingleProcessDataStore singleProcessDataStore2;
        Ref$ObjectRef ref$ObjectRef3;
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1;
        Iterator it;
        Mutex mutex;
        Ref$BooleanRef ref$BooleanRef;
        Ref$BooleanRef ref$BooleanRef2;
        SingleProcessDataStore$readAndInit$1 singleProcessDataStore$readAndInit$12;
        SingleProcessDataStore singleProcessDataStore3;
        Ref$ObjectRef ref$ObjectRef4;
        Mutex mutex2;
        if (continuation instanceof SingleProcessDataStore$readAndInit$1) {
            singleProcessDataStore$readAndInit$1 = (SingleProcessDataStore$readAndInit$1) continuation;
            int i2 = singleProcessDataStore$readAndInit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readAndInit$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readAndInit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (!(Intrinsics.areEqual(this.downstreamFlow.getValue(), UnInitialized.INSTANCE) || (this.downstreamFlow.getValue() instanceof ReadException))) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    Mutex$default = MutexKt.Mutex$default(false, 1, null);
                    ref$ObjectRef = new Ref$ObjectRef();
                    singleProcessDataStore$readAndInit$1.L$0 = this;
                    singleProcessDataStore$readAndInit$1.L$1 = Mutex$default;
                    singleProcessDataStore$readAndInit$1.L$2 = ref$ObjectRef;
                    singleProcessDataStore$readAndInit$1.L$3 = ref$ObjectRef;
                    singleProcessDataStore$readAndInit$1.label = 1;
                    obj = readDataOrHandleCorruption(singleProcessDataStore$readAndInit$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    singleProcessDataStore = this;
                    ref$ObjectRef2 = ref$ObjectRef;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) singleProcessDataStore$readAndInit$1.L$3;
                            ref$BooleanRef2 = (Ref$BooleanRef) singleProcessDataStore$readAndInit$1.L$2;
                            ref$ObjectRef4 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$1;
                            singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            try {
                                ref$BooleanRef2.element = true;
                                Unit unit = Unit.INSTANCE;
                                mutex2.unlock(null);
                                MutableStateFlow mutableStateFlow = singleProcessDataStore3.downstreamFlow;
                                Object obj2 = ref$ObjectRef4.element;
                                mutableStateFlow.setValue(new Data(obj2, obj2 != null ? obj2.hashCode() : 0));
                                return Unit.INSTANCE;
                            } catch (Throwable th) {
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        it = (Iterator) singleProcessDataStore$readAndInit$1.L$5;
                        singleProcessDataStore$readAndInit$api$1 = (SingleProcessDataStore$readAndInit$api$1) singleProcessDataStore$readAndInit$1.L$4;
                        ref$BooleanRef = (Ref$BooleanRef) singleProcessDataStore$readAndInit$1.L$3;
                        ref$ObjectRef3 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$2;
                        mutex = (Mutex) singleProcessDataStore$readAndInit$1.L$1;
                        singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        while (it.hasNext()) {
                            Function2 function2 = (Function2) it.next();
                            singleProcessDataStore$readAndInit$1.L$0 = singleProcessDataStore2;
                            singleProcessDataStore$readAndInit$1.L$1 = mutex;
                            singleProcessDataStore$readAndInit$1.L$2 = ref$ObjectRef3;
                            singleProcessDataStore$readAndInit$1.L$3 = ref$BooleanRef;
                            singleProcessDataStore$readAndInit$1.L$4 = singleProcessDataStore$readAndInit$api$1;
                            singleProcessDataStore$readAndInit$1.L$5 = it;
                            singleProcessDataStore$readAndInit$1.label = 2;
                            if (function2.invoke(singleProcessDataStore$readAndInit$api$1, singleProcessDataStore$readAndInit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        singleProcessDataStore$readAndInit$12 = singleProcessDataStore$readAndInit$1;
                        ref$BooleanRef2 = ref$BooleanRef;
                        ref$ObjectRef2 = ref$ObjectRef3;
                        Mutex$default = mutex;
                        singleProcessDataStore3 = singleProcessDataStore2;
                        singleProcessDataStore3.initTasks = null;
                        singleProcessDataStore$readAndInit$12.L$0 = singleProcessDataStore3;
                        singleProcessDataStore$readAndInit$12.L$1 = ref$ObjectRef2;
                        singleProcessDataStore$readAndInit$12.L$2 = ref$BooleanRef2;
                        singleProcessDataStore$readAndInit$12.L$3 = Mutex$default;
                        singleProcessDataStore$readAndInit$12.L$4 = null;
                        singleProcessDataStore$readAndInit$12.L$5 = null;
                        singleProcessDataStore$readAndInit$12.label = 3;
                        if (Mutex$default.lock(null, singleProcessDataStore$readAndInit$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$ObjectRef4 = ref$ObjectRef2;
                        mutex2 = Mutex$default;
                        ref$BooleanRef2.element = true;
                        Unit unit2 = Unit.INSTANCE;
                        mutex2.unlock(null);
                        MutableStateFlow mutableStateFlow2 = singleProcessDataStore3.downstreamFlow;
                        Object obj22 = ref$ObjectRef4.element;
                        mutableStateFlow2.setValue(new Data(obj22, obj22 != null ? obj22.hashCode() : 0));
                        return Unit.INSTANCE;
                    }
                    ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$3;
                    ref$ObjectRef2 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$1.L$2;
                    Mutex$default = (Mutex) singleProcessDataStore$readAndInit$1.L$1;
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInit$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                ref$ObjectRef.element = obj;
                Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
                SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$12 = new SingleProcessDataStore$readAndInit$api$1(Mutex$default, ref$BooleanRef3, ref$ObjectRef2, singleProcessDataStore);
                list = singleProcessDataStore.initTasks;
                if (list != null) {
                    ref$BooleanRef2 = ref$BooleanRef3;
                    singleProcessDataStore$readAndInit$12 = singleProcessDataStore$readAndInit$1;
                    singleProcessDataStore3 = singleProcessDataStore;
                    singleProcessDataStore3.initTasks = null;
                    singleProcessDataStore$readAndInit$12.L$0 = singleProcessDataStore3;
                    singleProcessDataStore$readAndInit$12.L$1 = ref$ObjectRef2;
                    singleProcessDataStore$readAndInit$12.L$2 = ref$BooleanRef2;
                    singleProcessDataStore$readAndInit$12.L$3 = Mutex$default;
                    singleProcessDataStore$readAndInit$12.L$4 = null;
                    singleProcessDataStore$readAndInit$12.L$5 = null;
                    singleProcessDataStore$readAndInit$12.label = 3;
                    if (Mutex$default.lock(null, singleProcessDataStore$readAndInit$12) == coroutine_suspended) {
                    }
                } else {
                    singleProcessDataStore2 = singleProcessDataStore;
                    ref$ObjectRef3 = ref$ObjectRef2;
                    singleProcessDataStore$readAndInit$api$1 = singleProcessDataStore$readAndInit$api$12;
                    it = list.iterator();
                    mutex = Mutex$default;
                    ref$BooleanRef = ref$BooleanRef3;
                    while (it.hasNext()) {
                    }
                    singleProcessDataStore$readAndInit$12 = singleProcessDataStore$readAndInit$1;
                    ref$BooleanRef2 = ref$BooleanRef;
                    ref$ObjectRef2 = ref$ObjectRef3;
                    Mutex$default = mutex;
                    singleProcessDataStore3 = singleProcessDataStore2;
                    singleProcessDataStore3.initTasks = null;
                    singleProcessDataStore$readAndInit$12.L$0 = singleProcessDataStore3;
                    singleProcessDataStore$readAndInit$12.L$1 = ref$ObjectRef2;
                    singleProcessDataStore$readAndInit$12.L$2 = ref$BooleanRef2;
                    singleProcessDataStore$readAndInit$12.L$3 = Mutex$default;
                    singleProcessDataStore$readAndInit$12.L$4 = null;
                    singleProcessDataStore$readAndInit$12.L$5 = null;
                    singleProcessDataStore$readAndInit$12.label = 3;
                    if (Mutex$default.lock(null, singleProcessDataStore$readAndInit$12) == coroutine_suspended) {
                    }
                }
            }
        }
        singleProcessDataStore$readAndInit$1 = new SingleProcessDataStore$readAndInit$1(this, continuation);
        Object obj3 = singleProcessDataStore$readAndInit$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readAndInit$1.label;
        if (i != 0) {
        }
        ref$ObjectRef.element = obj3;
        Ref$BooleanRef ref$BooleanRef32 = new Ref$BooleanRef();
        SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$122 = new SingleProcessDataStore$readAndInit$api$1(Mutex$default, ref$BooleanRef32, ref$ObjectRef2, singleProcessDataStore);
        list = singleProcessDataStore.initTasks;
        if (list != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateAndThrowFailure(Continuation continuation) {
        SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1;
        Object coroutine_suspended;
        int i;
        SingleProcessDataStore singleProcessDataStore;
        if (continuation instanceof SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) continuation;
            int i2 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.L$0 = this;
                        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label = 1;
                        if (readAndInit(singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        singleProcessDataStore = this;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1(this, continuation);
        Object obj2 = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readAndInitOrPropagateAndThrowFailure$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateFailure(Continuation continuation) {
        SingleProcessDataStore$readAndInitOrPropagateFailure$1 singleProcessDataStore$readAndInitOrPropagateFailure$1;
        Object coroutine_suspended;
        int i;
        SingleProcessDataStore singleProcessDataStore;
        if (continuation instanceof SingleProcessDataStore$readAndInitOrPropagateFailure$1) {
            singleProcessDataStore$readAndInitOrPropagateFailure$1 = (SingleProcessDataStore$readAndInitOrPropagateFailure$1) continuation;
            int i2 = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readAndInitOrPropagateFailure$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readAndInitOrPropagateFailure$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        singleProcessDataStore$readAndInitOrPropagateFailure$1.L$0 = this;
                        singleProcessDataStore$readAndInitOrPropagateFailure$1.label = 1;
                        if (readAndInit(singleProcessDataStore$readAndInitOrPropagateFailure$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        singleProcessDataStore = this;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readAndInitOrPropagateFailure$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        singleProcessDataStore.downstreamFlow.setValue(new ReadException(th));
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        singleProcessDataStore$readAndInitOrPropagateFailure$1 = new SingleProcessDataStore$readAndInitOrPropagateFailure$1(this, continuation);
        Object obj2 = singleProcessDataStore$readAndInitOrPropagateFailure$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readAndInitOrPropagateFailure$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.datastore.core.SingleProcessDataStore$readData$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.datastore.core.SingleProcessDataStore] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.datastore.core.Serializer] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readData(Continuation continuation) {
        ?? r0;
        Object coroutine_suspended;
        int i;
        ?? fileInputStream;
        Throwable th;
        Closeable closeable;
        try {
            if (continuation instanceof SingleProcessDataStore$readData$1) {
                SingleProcessDataStore$readData$1 singleProcessDataStore$readData$1 = (SingleProcessDataStore$readData$1) continuation;
                int i2 = singleProcessDataStore$readData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    singleProcessDataStore$readData$1.label = i2 - Integer.MIN_VALUE;
                    r0 = singleProcessDataStore$readData$1;
                    Object obj = r0.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = r0.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            fileInputStream = new FileInputStream(getFile());
                            try {
                                ?? r6 = this.serializer;
                                r0.L$0 = this;
                                r0.L$1 = fileInputStream;
                                r0.L$2 = null;
                                r0.label = 1;
                                obj = r6.readFrom(fileInputStream, r0);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                th = null;
                                closeable = fileInputStream;
                            } catch (Throwable th2) {
                                th = th2;
                                r0 = this;
                                throw th;
                            }
                        } catch (FileNotFoundException e) {
                            e = e;
                            r0 = this;
                            if (r0.getFile().exists()) {
                                throw e;
                            }
                            return r0.serializer.getDefaultValue();
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) r0.L$2;
                        fileInputStream = (Closeable) r0.L$1;
                        r0 = (SingleProcessDataStore) r0.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            closeable = fileInputStream;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } finally {
                                CloseableKt.closeFinally(fileInputStream, th);
                            }
                        }
                    }
                    return obj;
                }
            }
            if (i != 0) {
            }
            return obj;
        } catch (FileNotFoundException e2) {
            e = e2;
        }
        r0 = new SingleProcessDataStore$readData$1(this, continuation);
        Object obj2 = r0.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = r0.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readDataOrHandleCorruption(Continuation continuation) {
        SingleProcessDataStore$readDataOrHandleCorruption$1 singleProcessDataStore$readDataOrHandleCorruption$1;
        Object coroutine_suspended;
        int i;
        SingleProcessDataStore singleProcessDataStore;
        Object handleCorruption;
        CorruptionException corruptionException;
        SingleProcessDataStore singleProcessDataStore2;
        CorruptionException corruptionException2;
        if (continuation instanceof SingleProcessDataStore$readDataOrHandleCorruption$1) {
            singleProcessDataStore$readDataOrHandleCorruption$1 = (SingleProcessDataStore$readDataOrHandleCorruption$1) continuation;
            int i2 = singleProcessDataStore$readDataOrHandleCorruption$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$readDataOrHandleCorruption$1.label = i2 - Integer.MIN_VALUE;
                Object obj = singleProcessDataStore$readDataOrHandleCorruption$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$readDataOrHandleCorruption$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = this;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 1;
                        obj = readData(singleProcessDataStore$readDataOrHandleCorruption$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (CorruptionException e) {
                        e = e;
                        singleProcessDataStore = this;
                        CorruptionHandler corruptionHandler = singleProcessDataStore.corruptionHandler;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = singleProcessDataStore;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = e;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 2;
                        handleCorruption = corruptionHandler.handleCorruption(e, singleProcessDataStore$readDataOrHandleCorruption$1);
                        if (handleCorruption != coroutine_suspended) {
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj2 = singleProcessDataStore$readDataOrHandleCorruption$1.L$1;
                            corruptionException2 = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                return obj2;
                            } catch (IOException e2) {
                                e = e2;
                                ExceptionsKt__ExceptionsKt.addSuppressed(corruptionException2, e);
                                throw corruptionException2;
                            }
                        }
                        corruptionException = (CorruptionException) singleProcessDataStore$readDataOrHandleCorruption$1.L$1;
                        singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        try {
                            singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = corruptionException;
                            singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = obj;
                            singleProcessDataStore$readDataOrHandleCorruption$1.label = 3;
                            return singleProcessDataStore2.writeData$datastore_core(obj, singleProcessDataStore$readDataOrHandleCorruption$1) != coroutine_suspended ? coroutine_suspended : obj;
                        } catch (IOException e3) {
                            e = e3;
                            corruptionException2 = corruptionException;
                            ExceptionsKt__ExceptionsKt.addSuppressed(corruptionException2, e);
                            throw corruptionException2;
                        }
                    }
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$readDataOrHandleCorruption$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CorruptionException e4) {
                        e = e4;
                        CorruptionHandler corruptionHandler2 = singleProcessDataStore.corruptionHandler;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = singleProcessDataStore;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = e;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 2;
                        handleCorruption = corruptionHandler2.handleCorruption(e, singleProcessDataStore$readDataOrHandleCorruption$1);
                        if (handleCorruption != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        SingleProcessDataStore singleProcessDataStore3 = singleProcessDataStore;
                        corruptionException = e;
                        obj = handleCorruption;
                        singleProcessDataStore2 = singleProcessDataStore3;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$0 = corruptionException;
                        singleProcessDataStore$readDataOrHandleCorruption$1.L$1 = obj;
                        singleProcessDataStore$readDataOrHandleCorruption$1.label = 3;
                        if (singleProcessDataStore2.writeData$datastore_core(obj, singleProcessDataStore$readDataOrHandleCorruption$1) != coroutine_suspended) {
                        }
                    }
                }
                return obj;
            }
        }
        singleProcessDataStore$readDataOrHandleCorruption$1 = new SingleProcessDataStore$readDataOrHandleCorruption$1(this, continuation);
        Object obj3 = singleProcessDataStore$readDataOrHandleCorruption$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readDataOrHandleCorruption$1.label;
        if (i != 0) {
        }
        return obj3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transformAndWrite(Function2 function2, CoroutineContext coroutineContext, Continuation continuation) {
        SingleProcessDataStore$transformAndWrite$1 singleProcessDataStore$transformAndWrite$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        Data data;
        Object obj2;
        SingleProcessDataStore singleProcessDataStore;
        SingleProcessDataStore singleProcessDataStore2;
        if (continuation instanceof SingleProcessDataStore$transformAndWrite$1) {
            singleProcessDataStore$transformAndWrite$1 = (SingleProcessDataStore$transformAndWrite$1) continuation;
            int i2 = singleProcessDataStore$transformAndWrite$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleProcessDataStore$transformAndWrite$1.label = i2 - Integer.MIN_VALUE;
                obj = singleProcessDataStore$transformAndWrite$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = singleProcessDataStore$transformAndWrite$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Data data2 = (Data) this.downstreamFlow.getValue();
                    data2.checkHashCode();
                    Object value = data2.getValue();
                    SingleProcessDataStore$transformAndWrite$newData$1 singleProcessDataStore$transformAndWrite$newData$1 = new SingleProcessDataStore$transformAndWrite$newData$1(function2, value, null);
                    singleProcessDataStore$transformAndWrite$1.L$0 = this;
                    singleProcessDataStore$transformAndWrite$1.L$1 = data2;
                    singleProcessDataStore$transformAndWrite$1.L$2 = value;
                    singleProcessDataStore$transformAndWrite$1.label = 1;
                    Object withContext = BuildersKt.withContext(coroutineContext, singleProcessDataStore$transformAndWrite$newData$1, singleProcessDataStore$transformAndWrite$1);
                    if (withContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    data = data2;
                    obj = withContext;
                    obj2 = value;
                    singleProcessDataStore = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = singleProcessDataStore$transformAndWrite$1.L$1;
                        singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$transformAndWrite$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        singleProcessDataStore2.downstreamFlow.setValue(new Data(obj2, obj2 == null ? obj2.hashCode() : 0));
                        return obj2;
                    }
                    obj2 = singleProcessDataStore$transformAndWrite$1.L$2;
                    data = (Data) singleProcessDataStore$transformAndWrite$1.L$1;
                    singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$transformAndWrite$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                data.checkHashCode();
                if (!Intrinsics.areEqual(obj2, obj)) {
                    singleProcessDataStore$transformAndWrite$1.L$0 = singleProcessDataStore;
                    singleProcessDataStore$transformAndWrite$1.L$1 = obj;
                    singleProcessDataStore$transformAndWrite$1.L$2 = null;
                    singleProcessDataStore$transformAndWrite$1.label = 2;
                    if (singleProcessDataStore.writeData$datastore_core(obj, singleProcessDataStore$transformAndWrite$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj2 = obj;
                    singleProcessDataStore2 = singleProcessDataStore;
                    singleProcessDataStore2.downstreamFlow.setValue(new Data(obj2, obj2 == null ? obj2.hashCode() : 0));
                }
                return obj2;
            }
        }
        singleProcessDataStore$transformAndWrite$1 = new SingleProcessDataStore$transformAndWrite$1(this, continuation);
        obj = singleProcessDataStore$transformAndWrite$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$transformAndWrite$1.label;
        if (i != 0) {
        }
        data.checkHashCode();
        if (!Intrinsics.areEqual(obj2, obj)) {
        }
        return obj2;
    }

    @Override // androidx.datastore.core.DataStore
    public Flow getData() {
        return this.data;
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(Function2 function2, Continuation continuation) {
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        this.actor.offer(new Message.Update(function2, CompletableDeferred$default, (State) this.downstreamFlow.getValue(), continuation.getContext()));
        return CompletableDeferred$default.await(continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2 A[Catch: IOException -> 0x00be, TRY_ENTER, TryCatch #3 {IOException -> 0x00be, blocks: (B:14:0x0092, B:19:0x00a2, B:20:0x00bd, B:27:0x00c5, B:28:0x00c8, B:24:0x00c3), top: B:7:0x0021, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeData$datastore_core(Object obj, Continuation continuation) {
        SingleProcessDataStore$writeData$1 singleProcessDataStore$writeData$1;
        Object coroutine_suspended;
        int i;
        ?? r3;
        File file;
        ?? fileOutputStream;
        SingleProcessDataStore singleProcessDataStore;
        FileOutputStream fileOutputStream2;
        Throwable th;
        try {
            if (continuation instanceof SingleProcessDataStore$writeData$1) {
                singleProcessDataStore$writeData$1 = (SingleProcessDataStore$writeData$1) continuation;
                int i2 = singleProcessDataStore$writeData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    singleProcessDataStore$writeData$1.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = singleProcessDataStore$writeData$1.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = singleProcessDataStore$writeData$1.label;
                    r3 = 1;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        createParentDirectories(getFile());
                        file = new File(Intrinsics.stringPlus(getFile().getAbsolutePath(), this.SCRATCH_SUFFIX));
                        try {
                            fileOutputStream = new FileOutputStream(file);
                            try {
                                Serializer serializer = this.serializer;
                                UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream);
                                singleProcessDataStore$writeData$1.L$0 = this;
                                singleProcessDataStore$writeData$1.L$1 = file;
                                singleProcessDataStore$writeData$1.L$2 = fileOutputStream;
                                singleProcessDataStore$writeData$1.L$3 = null;
                                singleProcessDataStore$writeData$1.L$4 = fileOutputStream;
                                singleProcessDataStore$writeData$1.label = 1;
                                if (serializer.writeTo(obj, uncloseableOutputStream, singleProcessDataStore$writeData$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                singleProcessDataStore = this;
                                r3 = file;
                                fileOutputStream2 = fileOutputStream;
                                th = null;
                                fileOutputStream = fileOutputStream;
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = file;
                                throw th;
                            }
                        } catch (IOException e) {
                            e = e;
                            if (file.exists()) {
                                file.delete();
                            }
                            throw e;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        fileOutputStream2 = (FileOutputStream) singleProcessDataStore$writeData$1.L$4;
                        th = (Throwable) singleProcessDataStore$writeData$1.L$3;
                        fileOutputStream = (Closeable) singleProcessDataStore$writeData$1.L$2;
                        r3 = (File) singleProcessDataStore$writeData$1.L$1;
                        singleProcessDataStore = (SingleProcessDataStore) singleProcessDataStore$writeData$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj2);
                            fileOutputStream = fileOutputStream;
                            r3 = r3;
                        } catch (Throwable th3) {
                            th = th3;
                            try {
                                throw th;
                            } catch (Throwable th4) {
                                CloseableKt.closeFinally(fileOutputStream, th);
                                throw th4;
                            }
                        }
                    }
                    fileOutputStream2.getFD().sync();
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, th);
                    if (!r3.renameTo(singleProcessDataStore.getFile())) {
                        return Unit.INSTANCE;
                    }
                    throw new IOException("Unable to rename " + r3 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                }
            }
            if (i != 0) {
            }
            fileOutputStream2.getFD().sync();
            Unit unit2 = Unit.INSTANCE;
            CloseableKt.closeFinally(fileOutputStream, th);
            if (!r3.renameTo(singleProcessDataStore.getFile())) {
            }
        } catch (IOException e2) {
            e = e2;
            file = r3;
            if (file.exists()) {
            }
            throw e;
        }
        singleProcessDataStore$writeData$1 = new SingleProcessDataStore$writeData$1(this, continuation);
        Object obj22 = singleProcessDataStore$writeData$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$writeData$1.label;
        r3 = 1;
    }
}
