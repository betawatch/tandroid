package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r60 b;

    public /* synthetic */ h60(r60 r60Var, int i10) {
        this.a = i10;
        this.b = r60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                r60 r60Var = this.b;
                r60Var.j0();
                r60Var.f0();
                break;
            case 2:
                r60 r60Var2 = this.b;
                r60Var2.getClass();
                r60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                r60 r60Var3 = this.b;
                r60Var3.n.postOnAnimation(new h60(r60Var3, 1));
                break;
        }
    }
}
