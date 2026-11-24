// default package

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ax4 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ux4 b;

    public /* synthetic */ ax4(ux4 ux4Var, byte b) {
        this.a = b;
        this.b = ux4Var;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        ux4 ux4Var = this.b;
        switch (b) {
            case 0:
                ux4Var.u2.setTitleMinSideInset(gm.L(6.0f) + ((Integer) obj).intValue());
                break;
            default:
                List list = (List) obj;
                if (ux4Var.getContext() != null && !ux4Var.J) {
                    ArrayList c = oo0.c(1, list);
                    ux4Var.U1 = c;
                    List d = oo0.d(c);
                    ux4Var.U1 = d;
                    if (!((ArrayList) d).isEmpty()) {
                        ux4Var.b1();
                        l7c l7cVar = ux4Var.T1;
                        if (l7cVar != null) {
                            l7cVar.O(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
