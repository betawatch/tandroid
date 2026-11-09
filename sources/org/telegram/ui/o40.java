package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class o40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y40 b;

    public /* synthetic */ o40(y40 y40Var, int i7) {
        this.a = i7;
        this.b = y40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                y40 y40Var = this.b;
                y40Var.n0();
                y40Var.j0();
                break;
            case 2:
                y40 y40Var2 = this.b;
                y40Var2.getClass();
                y40Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                y40 y40Var3 = this.b;
                y40Var3.n.postOnAnimation(new o40(y40Var3, 1));
                break;
        }
    }
}
