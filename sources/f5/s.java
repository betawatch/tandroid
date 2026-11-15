package f5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class s implements ThreadFactory {
    public final /* synthetic */ int a;
    public final ThreadFactory b;
    public final Serializable c;

    public s(b bVar) {
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
                Thread newThread2 = this.b.newThread(new o5.p(2, runnable));
                newThread2.setName((String) this.c);
                return newThread2;
        }
    }

    public s(String str) {
        this.a = 1;
        this.b = Executors.defaultThreadFactory();
        this.c = str;
    }
}
