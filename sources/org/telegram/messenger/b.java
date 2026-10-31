package org.telegram.messenger;

import android.os.Looper;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b implements org.telegram.ui.Components.m00 {
    public final Thread c;
    public final ag.f3 d;
    public volatile boolean e;
    public volatile int f;
    public int g;
    public volatile boolean i;
    public final Object a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 9);

    public b(ag.f3 f3Var) {
        this.d = f3Var;
        u0 u0Var = u0.f;
        this.e = u0Var.a > 0;
        u0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.c = thread;
        thread.start();
    }

    @Override // org.telegram.ui.Components.m00
    public final void a() {
        synchronized (this.a) {
            this.f++;
            this.e = false;
        }
        this.b.removeMessages(1);
        this.c.interrupt();
    }

    @Override // org.telegram.ui.Components.m00
    public final void b() {
        synchronized (this.a) {
            this.f++;
            this.e = true;
            this.i = false;
            this.a.notifyAll();
        }
        this.c.interrupt();
    }
}
