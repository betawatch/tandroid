package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.telegram.tgnet.TLObject;

/* loaded from: classes3.dex */
final class FlowKt__ReduceKt$first$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    FlowKt__ReduceKt$first$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= TLObject.FLAG_31;
        return FlowKt.first(null, this);
    }
}
