package org.telegram.messenger;

import android.os.Looper;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class b implements org.telegram.ui.Components.j00 {
    public final Thread c;
    public final ai.o d;
    public volatile boolean e;
    public volatile int f;
    public int g;
    public volatile boolean i;
    public final Object a = new Object();
    public volatile int h = -1;
    public final android.support.v4.media.session.q b = new android.support.v4.media.session.q(this, Looper.getMainLooper(), 4);

    public b(ai.o oVar) {
        this.d = oVar;
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
