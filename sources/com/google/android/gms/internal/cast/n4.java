package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class n4 extends e4 implements Runnable {
    public final Runnable n;

    public n4(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // com.google.android.gms.internal.cast.e4
    public final String b() {
        return a9.p.m("task=[", this.n.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e9) {
            if (e4.f.e(this, null, new x3(e9))) {
                e4.g(this);
            }
            throw e9;
        }
    }
}
