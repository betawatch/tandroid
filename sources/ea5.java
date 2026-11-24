// default package

import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ea5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qa5 b;

    public /* synthetic */ ea5(qa5 qa5Var, byte b) {
        this.a = b;
        this.b = qa5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        qa5 qa5Var = this.b;
        switch (b) {
            case 0:
                qa5Var.Y = null;
                qa5Var.a0.b();
                qa5Var.h.b();
                qa5Var.l0();
                qa5Var.v0();
                qa5Var.w0();
                break;
            case 1:
                qa5Var.f.r.clearFocus();
                qa5Var.f.r.requestFocus();
                gl.F3(qa5Var.f.r);
                break;
            case 2:
                qa5Var.r0();
                break;
            case 3:
                qa5Var.q0(qa5Var.n0());
                break;
            default:
                qa5Var.q0(qa5Var.n0());
                break;
        }
    }
}
