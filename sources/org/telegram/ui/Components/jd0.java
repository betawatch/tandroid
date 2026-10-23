package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class jd0 implements Runnable {
    public boolean a;
    public final /* synthetic */ od0 b;

    public jd0(od0 od0Var) {
        this.b = od0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        od0 od0Var = this.b;
        od0Var.a(z10);
        od0Var.postDelayed(this, od0Var.L);
    }
}
