package kotlinx.coroutines;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
final class ResumeOnCompletion extends JobNode {
    private final Continuation continuation;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public ResumeOnCompletion(Continuation continuation) {
        this.continuation = continuation;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    public void invoke(Throwable th) {
        Continuation continuation = this.continuation;
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.constructor-impl(Unit.INSTANCE));
    }
}
