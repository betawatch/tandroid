package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class m4 extends c4 implements Runnable {
    public final Runnable n;

    public m4(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // com.google.android.gms.internal.cast.c4
    public final String a() {
        return a8.p0.p("task=[", this.n.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e10) {
            if (c4.f.f(this, null, new v3(e10))) {
                c4.h(this);
            }
            throw e10;
        }
    }
}
