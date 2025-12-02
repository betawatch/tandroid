package kotlinx.coroutines;

/* loaded from: classes3.dex */
public final class BlockingEventLoop extends EventLoopImplBase {
    private final Thread thread;

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    protected Thread getThread() {
        return this.thread;
    }

    public BlockingEventLoop(Thread thread) {
        this.thread = thread;
    }
}
