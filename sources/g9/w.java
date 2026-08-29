package g9;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class w implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public w(String str) {
        this.a = 1;
        this.c = Executors.defaultThreadFactory();
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new v(runnable));
                newThread.setName(((String) this.b) + ((AtomicLong) this.c).getAndIncrement());
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.c).newThread(new b9.k(1, runnable));
                newThread2.setName((String) this.b);
                return newThread2;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.c;
                Thread newThread3 = ((ThreadFactory) this.b).newThread(runnable);
                newThread3.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return newThread3;
        }
    }

    public w(p2.b bVar) {
        this.a = 2;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(1);
    }

    public w(String str, AtomicLong atomicLong) {
        this.a = 0;
        this.b = str;
        this.c = atomicLong;
    }
}
