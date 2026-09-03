package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class o4 extends e4 implements Runnable {
    public final Runnable n;

    public o4(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // com.google.android.gms.internal.cast.e4
    public final String b() {
        return android.support.v4.media.a.o("task=[", this.n.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e6) {
            if (e4.f.e(this, null, new x3(e6))) {
                e4.g(this);
            }
            throw e6;
        }
    }
}
