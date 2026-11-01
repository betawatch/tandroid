package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
