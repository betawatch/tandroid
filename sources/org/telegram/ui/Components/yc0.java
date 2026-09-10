package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yc0 implements Runnable {
    public boolean a;
    public final /* synthetic */ dd0 b;

    public yc0(dd0 dd0Var) {
        this.b = dd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.a;
        dd0 dd0Var = this.b;
        dd0Var.a(z10);
        dd0Var.postDelayed(this, dd0Var.L);
    }
}
