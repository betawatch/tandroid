package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
        } catch (Error | RuntimeException e) {
            if (h4.f.f(this, null, new a4(e))) {
                h4.h(this);
            }
            throw e;
        }
    }
}
