// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hkc implements yr3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nkc b;

    public /* synthetic */ hkc(nkc nkcVar, byte b) {
        this.a = b;
        this.b = nkcVar;
    }

    @Override // yr3
    public final void a(yla ylaVar, float f, float f2) {
        byte b = this.a;
        nkc nkcVar = this.b;
        switch (b) {
            case 0:
                nkcVar.C = f;
                nkcVar.a.invalidate();
                break;
            case 1:
                nkcVar.c0 = f;
                uk1 uk1Var = nkcVar.a;
                uk1Var.invalidate();
                if (uk1Var.getParent() instanceof View) {
                    ((View) uk1Var.getParent()).invalidate();
                    break;
                }
                break;
            default:
                nkcVar.a0 = f;
                uk1 uk1Var2 = nkcVar.a;
                uk1Var2.invalidate();
                if (uk1Var2.getParent() instanceof View) {
                    ((View) uk1Var2.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
