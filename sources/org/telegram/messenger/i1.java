package org.telegram.messenger;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicInteger b;
    public final /* synthetic */ AtomicInteger c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ i1(AtomicInteger atomicInteger, AtomicInteger atomicInteger2, Runnable runnable, int i7) {
        this.a = i7;
        this.b = atomicInteger;
        this.c = atomicInteger2;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        switch (this.a) {
            case 0:
                if (this.b.incrementAndGet() == this.c.get() && (runnable = this.d) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                if (this.b.incrementAndGet() == this.c.get() && (runnable2 = this.d) != null) {
                    runnable2.run();
                    break;
                }
                break;
            default:
                if (this.b.incrementAndGet() == this.c.get() && (runnable3 = this.d) != null) {
                    runnable3.run();
                    break;
                }
                break;
        }
    }
}
