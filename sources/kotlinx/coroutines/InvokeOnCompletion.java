package kotlinx.coroutines;

/* loaded from: classes3.dex */
final class InvokeOnCompletion extends JobNode {
    private final InternalCompletionHandler handler;

    public InvokeOnCompletion(InternalCompletionHandler internalCompletionHandler) {
        this.handler = internalCompletionHandler;
    }

    @Override // kotlinx.coroutines.InternalCompletionHandler
    public void invoke(Throwable th) {
        this.handler.invoke(th);
    }
}
