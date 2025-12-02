package kotlinx.coroutines;

/* loaded from: classes3.dex */
public final class DisposeOnCompletion extends JobNode {
    private final DisposableHandle handle;

    public DisposeOnCompletion(DisposableHandle disposableHandle) {
        this.handle = disposableHandle;
    }

    @Override // kotlinx.coroutines.InternalCompletionHandler
    public void invoke(Throwable th) {
        this.handle.dispose();
    }
}
