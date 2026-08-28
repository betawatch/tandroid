package e9;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class v implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public v(String str) {
        this.a = 1;
        this.c = Executors.defaultThreadFactory();
        this.b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new u(runnable));
                newThread.setName(((String) this.b) + ((AtomicLong) this.c).getAndIncrement());
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.c).newThread(new f6.c(0, runnable));
                newThread2.setName((String) this.b);
                return newThread2;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.c;
                Thread newThread3 = ((ThreadFactory) this.b).newThread(runnable);
                newThread3.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return newThread3;
        }
    }

    public v(n2.b bVar) {
        this.a = 2;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(1);
    }

    public v(String str, AtomicLong atomicLong) {
        this.a = 0;
        this.b = str;
        this.c = atomicLong;
    }
}
