package androidx.datastore.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
public abstract class DataMigrationInitializer {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function2 getInitializer(List migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            return new DataMigrationInitializer$Companion$getInitializer$1(migrations, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:13:0x006b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x008b -> B:13:0x006b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object runMigrations(List list, InitializerApi initializerApi, Continuation continuation) {
            DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            int i;
            List list2;
            Ref$ObjectRef ref$ObjectRef;
            Iterator it;
            Throwable th;
            if (continuation instanceof DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) continuation;
                int i2 = dataMigrationInitializer$Companion$runMigrations$1.label;
                if ((i2 & TLObject.FLAG_31) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.label = i2 - TLObject.FLAG_31;
                    Object obj = dataMigrationInitializer$Companion$runMigrations$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = dataMigrationInitializer$Companion$runMigrations$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ArrayList arrayList = new ArrayList();
                        Function2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(list, arrayList, null);
                        dataMigrationInitializer$Companion$runMigrations$1.L$0 = arrayList;
                        dataMigrationInitializer$Companion$runMigrations$1.label = 1;
                        if (initializerApi.updateData(dataMigrationInitializer$Companion$runMigrations$2, dataMigrationInitializer$Companion$runMigrations$1) != coroutine_suspended) {
                            list2 = arrayList;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            it = (Iterator) dataMigrationInitializer$Companion$runMigrations$1.L$1;
                            ref$ObjectRef = (Ref$ObjectRef) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                            } catch (Throwable th2) {
                                Object obj2 = ref$ObjectRef.element;
                                if (obj2 == null) {
                                    ref$ObjectRef.element = th2;
                                } else {
                                    Intrinsics.checkNotNull(obj2);
                                    ExceptionsKt.addSuppressed((Throwable) ref$ObjectRef.element, th2);
                                }
                            }
                            while (it.hasNext()) {
                                Function1 function1 = (Function1) it.next();
                                dataMigrationInitializer$Companion$runMigrations$1.L$0 = ref$ObjectRef;
                                dataMigrationInitializer$Companion$runMigrations$1.L$1 = it;
                                dataMigrationInitializer$Companion$runMigrations$1.label = 2;
                                if (function1.invoke(dataMigrationInitializer$Companion$runMigrations$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            th = (Throwable) ref$ObjectRef.element;
                            if (th != null) {
                                throw th;
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    ref$ObjectRef = new Ref$ObjectRef();
                    it = list2.iterator();
                    while (it.hasNext()) {
                    }
                    th = (Throwable) ref$ObjectRef.element;
                    if (th != null) {
                    }
                }
            }
            dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(this, continuation);
            Object obj3 = dataMigrationInitializer$Companion$runMigrations$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = dataMigrationInitializer$Companion$runMigrations$1.label;
            if (i != 0) {
            }
            ref$ObjectRef = new Ref$ObjectRef();
            it = list2.iterator();
            while (it.hasNext()) {
            }
            th = (Throwable) ref$ObjectRef.element;
            if (th != null) {
            }
        }
    }
}
