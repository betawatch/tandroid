package org.telegram.ui.Components;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
