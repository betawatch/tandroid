package androidx.datastore.core;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
final class DataMigrationInitializer$Companion$runMigrations$2 extends SuspendLambda implements Function2 {
    final /* synthetic */ List $cleanUps;
    final /* synthetic */ List $migrations;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer$Companion$runMigrations$2(List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, continuation);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Continuation continuation) {
        return ((DataMigrationInitializer$Companion$runMigrations$2) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        Iterator it;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            obj = this.L$0;
            List list2 = this.$migrations;
            list = this.$cleanUps;
            it = list2.iterator();
        } else if (i == 1) {
            Object obj2 = this.L$3;
            WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(this.L$2);
            Iterator it2 = (Iterator) this.L$1;
            List list3 = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                list3.add(new DataMigrationInitializer$Companion$runMigrations$2$1$1(null, null));
                this.L$0 = list3;
                this.L$1 = it2;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list3;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            list = (List) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(it.next());
        this.L$0 = list;
        this.L$1 = it;
        this.L$2 = null;
        this.L$3 = obj;
        this.label = 1;
        throw null;
    }
}
