package androidx.datastore.core;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;

/* loaded from: classes.dex */
final class SimpleActor$offer$2 extends SuspendLambda implements Function2 {
    Object L$0;
    int label;
    final /* synthetic */ SimpleActor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleActor$offer$2(SimpleActor simpleActor, Continuation continuation) {
        super(2, continuation);
        this.this$0 = simpleActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleActor$offer$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SimpleActor$offer$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        if (r1.invoke(r6, r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
    
        if (r6 != r0) goto L18;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005f -> B:6:0x0062). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AtomicInteger atomicInteger;
        Function2 function2;
        CoroutineScope coroutineScope;
        AtomicInteger atomicInteger2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            atomicInteger = this.this$0.remainingMessages;
            if (!(atomicInteger.get() > 0)) {
                throw new IllegalStateException("Check failed.");
            }
            coroutineScope = this.this$0.scope;
            CoroutineScopeKt.ensureActive(coroutineScope);
            function2 = this.this$0.consumeMessage;
            Channel channel = this.this$0.messageQueue;
            this.L$0 = function2;
            this.label = 1;
            obj = channel.receive(this);
        } else if (i == 1) {
            function2 = (Function2) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.L$0 = null;
            this.label = 2;
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            atomicInteger2 = this.this$0.remainingMessages;
            if (atomicInteger2.decrementAndGet() == 0) {
                return Unit.INSTANCE;
            }
            coroutineScope = this.this$0.scope;
            CoroutineScopeKt.ensureActive(coroutineScope);
            function2 = this.this$0.consumeMessage;
            Channel channel2 = this.this$0.messageQueue;
            this.L$0 = function2;
            this.label = 1;
            obj = channel2.receive(this);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
