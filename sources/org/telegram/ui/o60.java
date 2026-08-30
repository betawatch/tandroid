package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y60 b;

    public /* synthetic */ o60(y60 y60Var, int i10) {
        this.a = i10;
        this.b = y60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                y60 y60Var = this.b;
                y60Var.i0();
                y60Var.e0();
                break;
            case 2:
                y60 y60Var2 = this.b;
                y60Var2.getClass();
                y60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                y60 y60Var3 = this.b;
                y60Var3.n.postOnAnimation(new o60(y60Var3, 1));
                break;
        }
    }
}
