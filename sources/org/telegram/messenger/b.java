package org.telegram.messenger;

import android.os.Looper;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b implements org.telegram.ui.Components.zz {
    public final Thread c;
    public final ai.m0 d;
    public volatile boolean e;
    public volatile int f;
    public int g;
    public volatile boolean i;
    public final Object a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 4);

    public b(ai.m0 m0Var) {
        this.d = m0Var;
        r0 r0Var = r0.f;
        this.e = r0Var.a > 0;
        r0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.c = thread;
        thread.start();
    }

    @Override // org.telegram.ui.Components.zz
    public final void a() {
        synchronized (this.a) {
            this.f++;
            this.e = false;
        }
        this.b.removeMessages(1);
        this.c.interrupt();
    }

    @Override // org.telegram.ui.Components.zz
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
