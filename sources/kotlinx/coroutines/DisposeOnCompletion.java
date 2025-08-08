package kotlinx.coroutines;

import kotlin.Unit;

/* loaded from: classes.dex */
public final class DisposeOnCompletion extends JobNode {
    private final DisposableHandle handle;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public DisposeOnCompletion(DisposableHandle disposableHandle) {
        this.handle = disposableHandle;
    }

    @Override // kotlinx.coroutines.CompletionHandlerBase
    public void invoke(Throwable th) {
        this.handle.dispose();
    }
}
