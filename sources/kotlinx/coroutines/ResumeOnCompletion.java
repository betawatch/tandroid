package kotlinx.coroutines;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
final class ResumeOnCompletion extends JobNode {
    private final Continuation continuation;

    public ResumeOnCompletion(Continuation continuation) {
        this.continuation = continuation;
    }

    @Override // kotlinx.coroutines.InternalCompletionHandler
    public void invoke(Throwable th) {
        Continuation continuation = this.continuation;
        Result.Companion companion = Result.Companion;
        continuation.resumeWith(Result.constructor-impl(Unit.INSTANCE));
    }
}
