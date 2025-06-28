package androidx.datastore.core;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.telegram.tgnet.TLRPC;

/* loaded from: classes.dex */
final class SingleProcessDataStore$readDataOrHandleCorruption$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleProcessDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$readDataOrHandleCorruption$1(SingleProcessDataStore singleProcessDataStore, Continuation continuation) {
        super(continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object readDataOrHandleCorruption;
        this.result = obj;
        this.label |= TLRPC.FLAG_31;
        readDataOrHandleCorruption = this.this$0.readDataOrHandleCorruption(this);
        return readDataOrHandleCorruption;
    }
}
