package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.telegram.tgnet.TLObject;

/* loaded from: classes.dex */
final class FlowKt__ErrorsKt$catchImpl$2 implements FlowCollector {
    final /* synthetic */ FlowCollector $collector;
    final /* synthetic */ Ref$ObjectRef $fromDownstream;

    FlowKt__ErrorsKt$catchImpl$2(FlowCollector flowCollector, Ref$ObjectRef ref$ObjectRef) {
        this.$collector = flowCollector;
        this.$fromDownstream = ref$ObjectRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
        int i;
        FlowKt__ErrorsKt$catchImpl$2 flowKt__ErrorsKt$catchImpl$2;
        if (continuation instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
            flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) continuation;
            int i2 = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
            if ((i2 & TLObject.FLAG_31) != 0) {
                flowKt__ErrorsKt$catchImpl$2$emit$1.label = i2 - TLObject.FLAG_31;
                Object obj2 = flowKt__ErrorsKt$catchImpl$2$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    try {
                        FlowCollector flowCollector = this.$collector;
                        flowKt__ErrorsKt$catchImpl$2$emit$1.L$0 = this;
                        flowKt__ErrorsKt$catchImpl$2$emit$1.label = 1;
                        if (flowCollector.emit(obj, flowKt__ErrorsKt$catchImpl$2$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        flowKt__ErrorsKt$catchImpl$2 = this;
                        flowKt__ErrorsKt$catchImpl$2.$fromDownstream.element = th;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowKt__ErrorsKt$catchImpl$2 = (FlowKt__ErrorsKt$catchImpl$2) flowKt__ErrorsKt$catchImpl$2$emit$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj2);
                    } catch (Throwable th2) {
                        th = th2;
                        flowKt__ErrorsKt$catchImpl$2.$fromDownstream.element = th;
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, continuation);
        Object obj22 = flowKt__ErrorsKt$catchImpl$2$emit$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
