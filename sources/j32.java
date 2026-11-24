// default package

import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class j32 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r32 b;

    public /* synthetic */ j32(r32 r32Var, byte b) {
        this.a = b;
        this.b = r32Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 4;
        r32 r32Var = this.b;
        switch (b) {
            case 0:
                r32Var.Z();
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = r32Var.T;
                if (!r32Var.L && !r32Var.O0 && !r32Var.b.J && r32Var.M0 && r32Var.U0 == null && editTextBoldCursor.hasFocus() && r32Var.isShown()) {
                    gl.E3(editTextBoldCursor);
                    break;
                }
                break;
            case 2:
                if (!r32Var.L && r32Var.M0 && r32Var.isShown()) {
                    r32Var.c0();
                    break;
                }
                break;
            case 3:
                if (!r32Var.L) {
                    float f = r32Var.n0;
                    if (f < 1.0f && r32Var.m0 == null) {
                        yla ylaVar = new yla(new ti4(f));
                        r32Var.m0 = ylaVar;
                        zla zlaVar = new zla(1.0f);
                        zlaVar.a(0.55f);
                        zlaVar.b(65.0f);
                        ylaVar.m = zlaVar;
                        r32Var.m0.f(0.001f);
                        r32Var.m0.b(new h10(r32Var, b2));
                        r32Var.m0.a(new zv0(r32Var, b2));
                        r32Var.m0.h();
                        break;
                    }
                }
                break;
            case 4:
                if (r32Var.M0 && !r32Var.L) {
                    r32Var.b0();
                    if (r32Var.N0) {
                        r32Var.c0();
                        break;
                    }
                }
                break;
            default:
                if (!r32Var.q0) {
                    r32Var.p0.setVisibility(4);
                    break;
                }
                break;
        }
    }
}
