package aa;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class y implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Number b;

    public y() {
        this.a = 1;
        this.b = new AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new x(runnable));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.b).getAndIncrement());
                return newThread;
            default:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.b).getAndIncrement());
                return thread;
        }
    }

    public y(AtomicLong atomicLong) {
        this.a = 0;
        this.b = atomicLong;
    }
}
