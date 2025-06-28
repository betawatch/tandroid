package kotlinx.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.telegram.tgnet.TLRPC;

/* loaded from: classes3.dex */
final class AwaitKt$joinAll$3 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    AwaitKt$joinAll$3(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= TLRPC.FLAG_31;
        return AwaitKt.joinAll(null, this);
    }
}
