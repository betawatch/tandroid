package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.telegram.tgnet.TLRPC;

/* loaded from: classes3.dex */
final class StateFlowImpl$collect$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ StateFlowImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StateFlowImpl$collect$1(StateFlowImpl stateFlowImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = stateFlowImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= TLRPC.FLAG_31;
        return this.this$0.collect(null, this);
    }
}
