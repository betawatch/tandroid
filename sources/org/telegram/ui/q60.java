package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a70 b;

    public /* synthetic */ q60(a70 a70Var, int i10) {
        this.a = i10;
        this.b = a70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                a70 a70Var = this.b;
                a70Var.i0();
                a70Var.e0();
                break;
            case 2:
                a70 a70Var2 = this.b;
                a70Var2.getClass();
                a70Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                a70 a70Var3 = this.b;
                a70Var3.n.postOnAnimation(new q60(a70Var3, 1));
                break;
        }
    }
}
