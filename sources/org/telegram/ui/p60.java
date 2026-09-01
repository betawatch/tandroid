package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z60 b;

    public /* synthetic */ p60(z60 z60Var, int i10) {
        this.a = i10;
        this.b = z60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                z60 z60Var = this.b;
                z60Var.i0();
                z60Var.e0();
                break;
            case 2:
                z60 z60Var2 = this.b;
                z60Var2.getClass();
                z60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                z60 z60Var3 = this.b;
                z60Var3.n.postOnAnimation(new p60(z60Var3, 1));
                break;
        }
    }
}
