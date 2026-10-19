package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class x implements ThreadFactory {
    public final /* synthetic */ int a;
    public final Object b;
    public final Serializable c;

    public x(c cVar) {
        this.a = 0;
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                AtomicInteger atomicInteger = (AtomicInteger) this.c;
                Thread newThread = ((ThreadFactory) this.b).newThread(runnable);
                newThread.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.b).newThread(new l5.p(2, runnable));
                newThread2.setName((String) this.c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new x9.s(runnable));
                newThread3.setName(((String) this.b) + ((AtomicLong) this.c).getAndIncrement());
                return newThread3;
        }
    }

    public x(String str) {
        this.a = 1;
        this.b = Executors.defaultThreadFactory();
        this.c = str;
    }

    public x(String str, AtomicLong atomicLong) {
        this.a = 2;
        this.b = str;
        this.c = atomicLong;
    }
}
