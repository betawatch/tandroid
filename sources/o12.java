// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class o12 implements xr3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o12(Object obj, float f, byte b) {
        this.a = b;
        this.c = obj;
        this.b = f;
    }

    @Override // xr3
    public final void a(yla ylaVar, boolean z, float f, float f2) {
        byte b = this.a;
        float f3 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                r12 r12Var = (r12) obj;
                r12Var.w = null;
                if (!z) {
                    r12Var.f = f3;
                    r12Var.c();
                    break;
                } else {
                    r12Var.h = f3;
                    break;
                }
            case 1:
                nn9 nn9Var = (nn9) obj;
                on9 on9Var = nn9Var.P;
                if (on9Var.l0 == ylaVar) {
                    on9Var.l0 = null;
                    if (!z) {
                        nn9Var.k(f3);
                        break;
                    }
                }
                break;
            default:
                t7b t7bVar = (t7b) obj;
                if (!z) {
                    t7bVar.N0.setTranslationY(f3);
                    t7bVar.N0.L = false;
                    t7bVar.p2 = null;
                    t7bVar.q2 = null;
                    break;
                }
                break;
        }
    }
}
