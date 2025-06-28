package kotlinx.coroutines.flow;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.telegram.tgnet.TLRPC;

/* loaded from: classes3.dex */
final class FlowKt__LimitKt$dropWhile$1$1 implements FlowCollector {
    final /* synthetic */ Ref$BooleanRef $matched;
    final /* synthetic */ Function2 $predicate;
    final /* synthetic */ FlowCollector $this_unsafeFlow;

    FlowKt__LimitKt$dropWhile$1$1(Ref$BooleanRef ref$BooleanRef, FlowCollector flowCollector, Function2 function2) {
        this.$matched = ref$BooleanRef;
        this.$this_unsafeFlow = flowCollector;
        this.$predicate = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        Object coroutine_suspended;
        int i;
        FlowKt__LimitKt$dropWhile$1$1 flowKt__LimitKt$dropWhile$1$1;
        if (continuation instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) continuation;
            int i2 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
            if ((i2 & TLRPC.FLAG_31) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = i2 - TLRPC.FLAG_31;
                Object obj2 = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (this.$matched.element) {
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.label = 1;
                        if (flowCollector.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    Function2 function2 = this.$predicate;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = this;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = obj;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.label = 2;
                    obj2 = function2.invoke(obj, flowKt__LimitKt$dropWhile$1$1$emit$1);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__LimitKt$dropWhile$1$1 = this;
                    if (!((Boolean) obj2).booleanValue()) {
                    }
                } else {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj2);
                        return Unit.INSTANCE;
                    }
                    if (i == 2) {
                        obj = flowKt__LimitKt$dropWhile$1$1$emit$1.L$1;
                        flowKt__LimitKt$dropWhile$1$1 = (FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        if (!((Boolean) obj2).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        flowKt__LimitKt$dropWhile$1$1.$matched.element = true;
                        FlowCollector flowCollector2 = flowKt__LimitKt$dropWhile$1$1.$this_unsafeFlow;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
                        if (flowCollector2.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                }
                return Unit.INSTANCE;
            }
        }
        flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
        Object obj22 = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }
}
