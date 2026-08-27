package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o60 b;

    public /* synthetic */ e60(o60 o60Var, int i10) {
        this.a = i10;
        this.b = o60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                o60 o60Var = this.b;
                o60Var.i0();
                o60Var.e0();
                break;
            case 2:
                o60 o60Var2 = this.b;
                o60Var2.getClass();
                o60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                o60 o60Var3 = this.b;
                o60Var3.n.postOnAnimation(new e60(o60Var3, 1));
                break;
        }
    }
}
