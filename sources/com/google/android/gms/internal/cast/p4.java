package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class p4 extends f4 implements Runnable {
    public final Runnable n;

    public p4(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // com.google.android.gms.internal.cast.f4
    public final String c() {
        return a1.g.q("task=[", this.n.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e7) {
            if (f4.f.f(this, null, new y3(e7))) {
                f4.h(this);
            }
            throw e7;
        }
    }
}
