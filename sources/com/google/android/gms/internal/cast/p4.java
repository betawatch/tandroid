package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p4 extends g4 implements Runnable {
    public final Runnable n;

    public p4(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // com.google.android.gms.internal.cast.g4
    public final String b() {
        return a4.w.n("task=[", this.n.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e10) {
            if (g4.f.e(this, null, new z3(e10))) {
                g4.g(this);
            }
            throw e10;
        }
    }
}
