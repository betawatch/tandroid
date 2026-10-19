package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
