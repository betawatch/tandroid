package kotlinx.coroutines.flow;

import java.util.NoSuchElementException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import org.telegram.tgnet.TLRPC;

/* loaded from: classes3.dex */
abstract /* synthetic */ class FlowKt__ReduceKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object first(Flow flow, Continuation continuation) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Object coroutine_suspended;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e;
        FlowCollector flowCollector;
        Object obj;
        if (continuation instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) continuation;
            int i2 = flowKt__ReduceKt$first$1.label;
            if ((i2 & TLRPC.FLAG_31) != 0) {
                flowKt__ReduceKt$first$1.label = i2 - TLRPC.FLAG_31;
                Object obj2 = flowKt__ReduceKt$first$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$first$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ref$ObjectRef2.element = NullSurrogateKt.NULL;
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public Object emit(Object obj3, Continuation continuation2) {
                            Ref$ObjectRef.this.element = obj3;
                            throw new AbortFlowException(this);
                        }
                    };
                    try {
                        flowKt__ReduceKt$first$1.L$0 = ref$ObjectRef2;
                        flowKt__ReduceKt$first$1.L$1 = flowCollector2;
                        flowKt__ReduceKt$first$1.label = 1;
                        if (flow.collect(flowCollector2, flowKt__ReduceKt$first$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ref$ObjectRef = ref$ObjectRef2;
                    } catch (AbortFlowException e2) {
                        ref$ObjectRef = ref$ObjectRef2;
                        e = e2;
                        flowCollector = flowCollector2;
                        FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        obj = ref$ObjectRef.element;
                        if (obj == NullSurrogateKt.NULL) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowKt__ReduceKt$first$$inlined$collectWhile$1) flowKt__ReduceKt$first$1.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ReduceKt$first$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj2);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        obj = ref$ObjectRef.element;
                        if (obj == NullSurrogateKt.NULL) {
                        }
                    }
                }
                obj = ref$ObjectRef.element;
                if (obj == NullSurrogateKt.NULL) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(continuation);
        Object obj22 = flowKt__ReduceKt$first$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$first$1.label;
        if (i != 0) {
        }
        obj = ref$ObjectRef.element;
        if (obj == NullSurrogateKt.NULL) {
        }
    }
}
