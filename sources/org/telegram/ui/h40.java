package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r40 b;

    public /* synthetic */ h40(r40 r40Var, int i3) {
        this.a = i3;
        this.b = r40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                r40 r40Var = this.b;
                r40Var.n0();
                r40Var.j0();
                break;
            case 2:
                r40 r40Var2 = this.b;
                r40Var2.getClass();
                r40Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                r40 r40Var3 = this.b;
                r40Var3.n.postOnAnimation(new h40(r40Var3, 1));
                break;
        }
    }
}
