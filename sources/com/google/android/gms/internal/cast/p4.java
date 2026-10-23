package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
