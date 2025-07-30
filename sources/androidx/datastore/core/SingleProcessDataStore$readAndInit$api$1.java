package androidx.datastore.core;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.sync.Mutex;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public final class SingleProcessDataStore$readAndInit$api$1 implements InitializerApi {
    final /* synthetic */ Ref$ObjectRef $initData;
    final /* synthetic */ Ref$BooleanRef $initializationComplete;
    final /* synthetic */ Mutex $updateLock;
    final /* synthetic */ SingleProcessDataStore this$0;

    SingleProcessDataStore$readAndInit$api$1(Mutex mutex, Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef ref$ObjectRef, SingleProcessDataStore singleProcessDataStore) {
        this.$updateLock = mutex;
        this.$initializationComplete = ref$BooleanRef;
        this.$initData = ref$ObjectRef;
        this.this$0 = singleProcessDataStore;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #1 {all -> 0x00d7, blocks: (B:40:0x0096, B:42:0x009a, B:46:0x00da, B:47:0x00e1), top: B:39:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da A[Catch: all -> 0x00d7, TRY_ENTER, TryCatch #1 {all -> 0x00d7, blocks: (B:40:0x0096, B:42:0x009a, B:46:0x00da, B:47:0x00e1), top: B:39:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // androidx.datastore.core.InitializerApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateData(Function2 function2, Continuation continuation) {
        SingleProcessDataStore$readAndInit$api$1$updateData$1 singleProcessDataStore$readAndInit$api$1$updateData$1;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        SingleProcessDataStore singleProcessDataStore;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        Mutex mutex2;
        Mutex mutex3;
        SingleProcessDataStore singleProcessDataStore2;
        Object obj;
        Ref$ObjectRef ref$ObjectRef2;
        try {
            if (continuation instanceof SingleProcessDataStore$readAndInit$api$1$updateData$1) {
                singleProcessDataStore$readAndInit$api$1$updateData$1 = (SingleProcessDataStore$readAndInit$api$1$updateData$1) continuation;
                int i2 = singleProcessDataStore$readAndInit$api$1$updateData$1.label;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    singleProcessDataStore$readAndInit$api$1$updateData$1.label = i2 - TLObject.FLAG_31;
                    Object obj2 = singleProcessDataStore$readAndInit$api$1$updateData$1.result;
                    coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = singleProcessDataStore$readAndInit$api$1$updateData$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        mutex = this.$updateLock;
                        Ref$BooleanRef ref$BooleanRef2 = this.$initializationComplete;
                        Ref$ObjectRef ref$ObjectRef3 = this.$initData;
                        singleProcessDataStore = this.this$0;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = function2;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = mutex;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = ref$BooleanRef2;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.L$3 = ref$ObjectRef3;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.L$4 = singleProcessDataStore;
                        singleProcessDataStore$readAndInit$api$1$updateData$1.label = 1;
                        if (mutex.lock(null, singleProcessDataStore$readAndInit$api$1$updateData$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$BooleanRef = ref$BooleanRef2;
                        ref$ObjectRef = ref$ObjectRef3;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                                ref$ObjectRef2 = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                                mutex2 = (Mutex) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                                try {
                                    ResultKt.throwOnFailure(obj2);
                                    ref$ObjectRef2.element = obj;
                                    ref$ObjectRef = ref$ObjectRef2;
                                    Object obj3 = ref$ObjectRef.element;
                                    mutex2.unlock(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    mutex2.unlock(null);
                                    throw th;
                                }
                            }
                            singleProcessDataStore2 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                            ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                            mutex3 = (Mutex) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj2);
                                if (!Intrinsics.areEqual(obj2, ref$ObjectRef.element)) {
                                    mutex2 = mutex3;
                                    Object obj32 = ref$ObjectRef.element;
                                    mutex2.unlock(null);
                                    return obj32;
                                }
                                singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = mutex3;
                                singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = ref$ObjectRef;
                                singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = obj2;
                                singleProcessDataStore$readAndInit$api$1$updateData$1.label = 3;
                                if (singleProcessDataStore2.writeData$datastore_core(obj2, singleProcessDataStore$readAndInit$api$1$updateData$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj = obj2;
                                ref$ObjectRef2 = ref$ObjectRef;
                                mutex2 = mutex3;
                                ref$ObjectRef2.element = obj;
                                ref$ObjectRef = ref$ObjectRef2;
                                Object obj322 = ref$ObjectRef.element;
                                mutex2.unlock(null);
                                return obj322;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2 = mutex3;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        SingleProcessDataStore singleProcessDataStore3 = (SingleProcessDataStore) singleProcessDataStore$readAndInit$api$1$updateData$1.L$4;
                        ref$ObjectRef = (Ref$ObjectRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$3;
                        ref$BooleanRef = (Ref$BooleanRef) singleProcessDataStore$readAndInit$api$1$updateData$1.L$2;
                        Mutex mutex4 = (Mutex) singleProcessDataStore$readAndInit$api$1$updateData$1.L$1;
                        Function2 function22 = (Function2) singleProcessDataStore$readAndInit$api$1$updateData$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        mutex = mutex4;
                        singleProcessDataStore = singleProcessDataStore3;
                        function2 = function22;
                    }
                    if (!ref$BooleanRef.element) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = ref$ObjectRef.element;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.L$0 = mutex;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.L$1 = ref$ObjectRef;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.L$2 = singleProcessDataStore;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.L$3 = null;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.L$4 = null;
                    singleProcessDataStore$readAndInit$api$1$updateData$1.label = 2;
                    Object invoke = function2.invoke(obj4, singleProcessDataStore$readAndInit$api$1$updateData$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex3 = mutex;
                    obj2 = invoke;
                    singleProcessDataStore2 = singleProcessDataStore;
                    if (!Intrinsics.areEqual(obj2, ref$ObjectRef.element)) {
                    }
                }
            }
            if (!ref$BooleanRef.element) {
            }
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        singleProcessDataStore$readAndInit$api$1$updateData$1 = new SingleProcessDataStore$readAndInit$api$1$updateData$1(this, continuation);
        Object obj22 = singleProcessDataStore$readAndInit$api$1$updateData$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = singleProcessDataStore$readAndInit$api$1$updateData$1.label;
        if (i != 0) {
        }
    }
}
