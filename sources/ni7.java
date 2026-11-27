// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ni7 extends b3a {
    public final /* synthetic */ byte L;
    public boolean M;
    public final /* synthetic */ ny0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ni7(ny0 ny0Var, Context context, vnb vnbVar, byte b) {
        super(context, vnbVar);
        this.L = b;
        this.N = ny0Var;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.L;
        ny0 ny0Var = this.N;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                qi7 qi7Var = (qi7) ny0Var;
                qi7Var.g2 = hl.L(64.0f) + getMeasuredHeight();
                qi7Var.f2.G();
                boolean z2 = this.M;
                boolean z3 = qi7Var.d;
                if (z2 != z3) {
                    this.M = z3;
                    if (z3) {
                        d79 d79Var = qi7Var.n1;
                        z46 z46Var = new z46(qi7Var.getContext(), 2, 0.6f);
                        z46Var.a = 1;
                        z46Var.p = hl.L(36.0f);
                        d79Var.getLayoutManager().v0(z46Var);
                        break;
                    }
                }
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                sbc sbcVar = (sbc) ny0Var;
                sbcVar.k2 = hl.L(64.0f) + getMeasuredHeight();
                sbcVar.j2.G();
                boolean z4 = this.M;
                boolean z5 = sbcVar.d;
                if (z4 != z5) {
                    this.M = z5;
                    if (z5) {
                        d79 d79Var2 = sbcVar.n1;
                        z46 z46Var2 = new z46(sbcVar.getContext(), 2, 0.6f);
                        z46Var2.a = 1;
                        z46Var2.p = hl.L(36.0f);
                        d79Var2.getLayoutManager().v0(z46Var2);
                        break;
                    }
                }
                break;
        }
    }
}
