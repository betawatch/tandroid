// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class a42 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h42 b;

    public /* synthetic */ a42(h42 h42Var, byte b) {
        this.a = b;
        this.b = h42Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 4;
        h42 h42Var = this.b;
        switch (b) {
            case 0:
                h42Var.Y();
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = h42Var.T;
                if (!h42Var.L && !h42Var.O0 && !h42Var.b.J && h42Var.M0 && h42Var.U0 == null && editTextBoldCursor.hasFocus() && h42Var.isShown()) {
                    hl.E3(editTextBoldCursor);
                    break;
                }
                break;
            case 2:
                if (!h42Var.L && h42Var.M0 && h42Var.isShown()) {
                    h42Var.b0();
                    break;
                }
                break;
            case 3:
                if (!h42Var.L) {
                    float f = h42Var.n0;
                    if (f < 1.0f && h42Var.m0 == null) {
                        vpa vpaVar = new vpa(new xk4(f));
                        h42Var.m0 = vpaVar;
                        wpa wpaVar = new wpa(1.0f);
                        wpaVar.a(0.55f);
                        wpaVar.b(65.0f);
                        vpaVar.m = wpaVar;
                        h42Var.m0.f(0.001f);
                        h42Var.m0.b(new i10(h42Var, b2));
                        h42Var.m0.a(new iw0(h42Var, b2));
                        h42Var.m0.h();
                        break;
                    }
                }
                break;
            case 4:
                if (h42Var.M0 && !h42Var.L) {
                    h42Var.a0();
                    if (h42Var.N0) {
                        h42Var.b0();
                        break;
                    }
                }
                break;
            default:
                if (!h42Var.q0) {
                    h42Var.p0.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
