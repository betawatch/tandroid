// default package

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dx4 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yx4 b;

    public /* synthetic */ dx4(yx4 yx4Var, byte b) {
        this.a = b;
        this.b = yx4Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        yx4 yx4Var = this.b;
        switch (b) {
            case 0:
                yx4Var.u2.setTitleMinSideInset(hl.L(6.0f) + ((Integer) obj).intValue());
                break;
            default:
                List list = (List) obj;
                if (yx4Var.getContext() != null && !yx4Var.J) {
                    ArrayList c = on0.c(1, list);
                    yx4Var.U1 = c;
                    List d = on0.d(c);
                    yx4Var.U1 = d;
                    if (!((ArrayList) d).isEmpty()) {
                        yx4Var.c1();
                        l9c l9cVar = yx4Var.T1;
                        if (l9cVar != null) {
                            l9cVar.O(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
