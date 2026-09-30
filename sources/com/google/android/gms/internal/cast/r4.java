package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class r4 extends h4 implements Runnable {
    public final Runnable n;

    public r4(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // com.google.android.gms.internal.cast.h4
    public final String c() {
        return a4.a.q("task=[", this.n.toString(), "]");
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
