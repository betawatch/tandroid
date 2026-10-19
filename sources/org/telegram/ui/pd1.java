package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ re1 b;

    public /* synthetic */ pd1(re1 re1Var, int i10) {
        this.a = i10;
        this.b = re1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                re1 re1Var = this.b;
                re1Var.x0();
                re1Var.B0();
                break;
            case 1:
                this.b.x0();
                break;
            case 2:
                this.b.O0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                re1 re1Var2 = this.b;
                re1Var2.A0 = null;
                re1Var2.U0(true, false);
                break;
            default:
                re1 re1Var3 = this.b;
                re1Var3.N.postOnAnimation(new pd1(re1Var3, 1));
                break;
        }
    }
}
