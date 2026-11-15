package bi;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.p41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2 b;

    public /* synthetic */ n1(s2 s2Var, int i7) {
        this.a = i7;
        this.b = s2Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                s2 s2Var = this.b;
                if (s2Var.n2 != intValue) {
                    s2Var.n2 = intValue;
                    s2Var.f2.g();
                    s2Var.U1.O(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                s2 s2Var2 = this.b;
                if (s2Var2.getContext() != null && !s2Var2.J) {
                    ArrayList b10 = wg.q.b(1, list);
                    s2Var2.V1 = b10;
                    List c10 = wg.q.c(b10);
                    s2Var2.V1 = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        s2Var2.f1();
                        p41 p41Var = s2Var2.U1;
                        if (p41Var != null) {
                            p41Var.O(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
