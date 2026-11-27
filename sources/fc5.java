// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class fc5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rc5 b;

    public /* synthetic */ fc5(rc5 rc5Var, byte b) {
        this.a = b;
        this.b = rc5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        rc5 rc5Var = this.b;
        switch (b) {
            case 0:
                rc5Var.Y = null;
                rc5Var.a0.b();
                rc5Var.h.b();
                rc5Var.l0();
                rc5Var.w0();
                rc5Var.x0();
                break;
            case 1:
                rc5Var.f.r.clearFocus();
                rc5Var.f.r.requestFocus();
                hl.E3(rc5Var.f.r);
                break;
            case 2:
                rc5Var.r0();
                break;
            case 3:
                rc5Var.q0(rc5Var.n0());
                break;
            default:
                rc5Var.q0(rc5Var.n0());
                break;
        }
    }
}
