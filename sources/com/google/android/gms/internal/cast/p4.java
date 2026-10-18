package com.google.android.gms.internal.cast;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class p4 extends f4 implements Runnable {
    public final Runnable n;

    public p4(Runnable runnable) {
        runnable.getClass();
        this.n = runnable;
    }

    @Override // com.google.android.gms.internal.cast.f4
    public final String c() {
        return a1.g.p("task=[", this.n.toString(), "]");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.n.run();
        } catch (Error | RuntimeException e) {
            if (f4.f.f(this, null, new y3(e))) {
                f4.h(this);
            }
            throw e;
        }
    }
}
