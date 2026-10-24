package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class p4 extends f4 implements Runnable {
    public final Runnable n;

    public p4(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // com.google.android.gms.internal.cast.f4
    public final String c() {
        return a1.g.p("task=[", this.n.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e) {
            if (f4.f.f(this, null, new y3(e))) {
                f4.h(this);
            }
            throw e;
        }
    }
}
