// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
                rbb rbbVar = (rbb) obj;
                if (!z) {
                    rbbVar.N0.setTranslationY(f3);
                    rbbVar.N0.L = false;
                    rbbVar.p2 = null;
                    rbbVar.q2 = null;
                    break;
                }
                break;
        }
    }
}
