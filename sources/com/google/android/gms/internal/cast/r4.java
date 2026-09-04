package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class r4 extends h4 implements Runnable {
    public final Runnable n;

    public r4(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // com.google.android.gms.internal.cast.h4
    public final String c() {
        return a4.a.p("task=[", this.n.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e7) {
            if (h4.f.f(this, null, new a4(e7))) {
                h4.h(this);
            }
            throw e7;
        }
    }
}
