package org.telegram.messenger;

import android.os.Looper;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b implements org.telegram.ui.Components.j00 {
    public final Thread c;
    public final ai.k d;
    public volatile boolean e;
    public volatile int f;
    public int g;
    public volatile boolean i;
    public final Object a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 4);

    public b(ai.k kVar) {
        this.d = kVar;
        r0 r0Var = r0.f;
        this.e = r0Var.a > 0;
        r0Var.d.add(this);
        Thread thread = new Thread(new a(this, 0), "ANRDetector");
        this.c = thread;
        thread.start();
    }

    @Override // org.telegram.ui.Components.j00
    public final void a() {
        synchronized (this.a) {
            this.f++;
            this.e = false;
        }
        this.b.removeMessages(1);
        this.c.interrupt();
    }

    @Override // org.telegram.ui.Components.j00
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
