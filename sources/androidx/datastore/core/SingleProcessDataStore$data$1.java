package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.telegram.tgnet.TLRPC;

/* loaded from: classes.dex */
final class SingleProcessDataStore$data$1 extends SuspendLambda implements Function2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore this$0;

    static final class 1 extends SuspendLambda implements Function2 {
        final /* synthetic */ State $currentDownStreamFlowState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        1(State state, Continuation continuation) {
            super(2, continuation);
            this.$currentDownStreamFlowState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            1 r0 = new 1(this.$currentDownStreamFlowState, continuation);
            r0.L$0 = obj;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(State state, Continuation continuation) {
            return ((1) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            State state = (State) this.L$0;
            State state2 = this.$currentDownStreamFlowState;
            boolean z = false;
            if (!(state2 instanceof Data) && !(state2 instanceof Final) && state == state2) {
                z = true;
            }
            return Boxing.boxBoolean(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleProcessDataStore$data$1(SingleProcessDataStore singleProcessDataStore, Continuation continuation) {
        super(2, continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.this$0, continuation);
        singleProcessDataStore$data$1.L$0 = obj;
        return singleProcessDataStore$data$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
        return ((SingleProcessDataStore$data$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        SimpleActor simpleActor;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            mutableStateFlow = this.this$0.downstreamFlow;
            State state = (State) mutableStateFlow.getValue();
            if (!(state instanceof Data)) {
                simpleActor = this.this$0.actor;
                simpleActor.offer(new SingleProcessDataStore.Message.Read(state));
            }
            mutableStateFlow2 = this.this$0.downstreamFlow;
            final Flow dropWhile = FlowKt.dropWhile(mutableStateFlow2, new 1(state, null));
            Flow flow = new Flow() { // from class: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1

                public static final class 2 implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;

                    public static final class 1 extends ContinuationImpl {
                        int label;
                        /* synthetic */ Object result;

                        public 1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= TLRPC.FLAG_31;
                            return 2.this.emit(null, this);
                        }
                    }

                    public 2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow$inlined = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public Object emit(Object obj, Continuation continuation) {
                        1 r0;
                        Object coroutine_suspended;
                        int i;
                        if (continuation instanceof 1) {
                            r0 = (1) continuation;
                            int i2 = r0.label;
                            if ((i2 & TLRPC.FLAG_31) != 0) {
                                r0.label = i2 - TLRPC.FLAG_31;
                                Object obj2 = r0.result;
                                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = r0.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow$inlined;
                                    State state = (State) obj;
                                    if (state instanceof ReadException) {
                                        throw ((ReadException) state).getReadException();
                                    }
                                    if (state instanceof Final) {
                                        throw ((Final) state).getFinalException();
                                    }
                                    if (!(state instanceof Data)) {
                                        if (state instanceof UnInitialized) {
                                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542".toString());
                                        }
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Object value = ((Data) state).getValue();
                                    r0.label = 1;
                                    if (flowCollector.emit(value, r0) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        r0 = new 1(continuation);
                        Object obj22 = r0.result;
                        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = r0.label;
                        if (i != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector flowCollector2, Continuation continuation) {
                    Object coroutine_suspended2;
                    Object collect = Flow.this.collect(new 2(flowCollector2), continuation);
                    coroutine_suspended2 = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return collect == coroutine_suspended2 ? collect : Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, flow, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
