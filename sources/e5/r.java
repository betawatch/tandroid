package e5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r implements ThreadFactory {
    public final /* synthetic */ int a;
    public final ThreadFactory b;
    public final Serializable c;

    public r(b bVar) {
        this.a = 0;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.c;
                Thread newThread = this.b.newThread(runnable);
                newThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return newThread;
            default:
                Thread newThread2 = this.b.newThread(new n5.o(2, runnable));
                newThread2.setName((String) this.c);
                return newThread2;
        }
    }

    public r(String str) {
        this.a = 1;
        this.b = Executors.defaultThreadFactory();
        this.c = str;
    }
}
