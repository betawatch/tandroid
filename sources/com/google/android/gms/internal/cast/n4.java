package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n4 extends e4 implements Runnable {
    public final Runnable n;

    public n4(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // com.google.android.gms.internal.cast.e4
    public final String c() {
        return a1.g.n("task=[", this.n.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e) {
            if (e4.f.f(this, null, new x3(e))) {
                e4.h(this);
            }
            throw e;
        }
    }
}
