package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
