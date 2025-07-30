package androidx.datastore.core;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
final class SingleProcessDataStore$writeData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleProcessDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$writeData$1(SingleProcessDataStore singleProcessDataStore, Continuation continuation) {
        super(continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= TLObject.FLAG_31;
        return this.this$0.writeData$datastore_core(null, this);
    }
}
