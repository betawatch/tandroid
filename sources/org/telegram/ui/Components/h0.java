package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.s2 b;

    public /* synthetic */ h0(org.telegram.ui.ActionBar.s2 s2Var, int i3) {
        this.a = i3;
        this.b = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                break;
            default:
                org.telegram.ui.ActionBar.s2 s2Var = this.b;
                ((u5) s2Var.d).e(true, 0.0f);
                s2Var.invalidateSelf();
                break;
        }
    }
}
