package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
