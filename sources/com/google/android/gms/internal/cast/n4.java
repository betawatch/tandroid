package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n4 extends d4 implements Runnable {
    public final Runnable n;

    public n4(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // com.google.android.gms.internal.cast.d4
    public final String a() {
        return a1.g.q("task=[", this.n.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e10) {
            if (d4.f.f(this, null, new w3(e10))) {
                d4.h(this);
            }
            throw e10;
        }
    }
}
