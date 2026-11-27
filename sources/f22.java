// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f22 implements ps3 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f22(Object obj, float f, byte b) {
        this.a = b;
        this.c = obj;
        this.b = f;
    }

    @Override // ps3
    public final void a(vpa vpaVar, boolean z, float f, float f2) {
        byte b = this.a;
        float f3 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                i22 i22Var = (i22) obj;
                i22Var.w = null;
                if (!z) {
                    i22Var.f = f3;
                    i22Var.c();
                    break;
                } else {
                    i22Var.h = f3;
                    break;
                }
            case 1:
                dr9 dr9Var = (dr9) obj;
                er9 er9Var = dr9Var.P;
                if (er9Var.l0 == vpaVar) {
                    er9Var.l0 = null;
                    if (!z) {
                        dr9Var.k(f3);
                        break;
                    }
                }
                break;
            default:
                sbb sbbVar = (sbb) obj;
                if (!z) {
                    sbbVar.N0.setTranslationY(f3);
                    sbbVar.N0.L = false;
                    sbbVar.p2 = null;
                    sbbVar.q2 = null;
                    break;
                }
                break;
        }
    }
}
