// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
                gl.E3(qa5Var.f.r);
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
