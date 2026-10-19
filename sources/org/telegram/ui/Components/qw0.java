package org.telegram.ui.Components;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class qw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sw0 b;

    public /* synthetic */ qw0(sw0 sw0Var, int i10) {
        this.a = i10;
        this.b = sw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sw0 sw0Var = this.b;
                sw0Var.V0 = false;
                if (!sw0Var.Y0 && sw0Var.W0) {
                    sw0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                sw0 sw0Var2 = this.b;
                sw0Var2.Y0 = false;
                if (!sw0Var2.V0 && sw0Var2.W0) {
                    sw0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
