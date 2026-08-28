package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k60 b;

    public /* synthetic */ a60(k60 k60Var, int i9) {
        this.a = i9;
        this.b = k60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                k60 k60Var = this.b;
                k60Var.h0();
                k60Var.d0();
                break;
            case 2:
                k60 k60Var2 = this.b;
                k60Var2.getClass();
                k60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                k60 k60Var3 = this.b;
                k60Var3.n.postOnAnimation(new a60(k60Var3, 1));
                break;
        }
    }
}
