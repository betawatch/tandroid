// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq9 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lq9 b;

    public /* synthetic */ hq9(lq9 lq9Var, byte b) {
        this.a = b;
        this.b = lq9Var;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        lq9 lq9Var = this.b;
        switch (b) {
            case 0:
                kq9 kq9Var = (kq9) obj;
                lq9Var.I = null;
                lq9Var.F = kq9Var;
                lq9Var.E = kq9Var != null;
                lq9Var.a();
                lq9Var.invalidate();
                d6b d6bVar = lq9Var.b;
                if (d6bVar != null) {
                    d6bVar.run();
                    break;
                }
                break;
            default:
                d dVar = (d) obj;
                kq9 kq9Var2 = lq9Var.F;
                if (kq9Var2 != null || dVar == null) {
                    kq9Var2.c(dVar);
                    break;
                }
        }
    }
}
