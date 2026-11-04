package ai;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.f41;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b3 b;

    public /* synthetic */ u1(b3 b3Var, int i3) {
        this.a = i3;
        this.b = b3Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                b3 b3Var = this.b;
                if (b3Var.k2 != intValue) {
                    b3Var.k2 = intValue;
                    b3Var.c2.g();
                    b3Var.R1.O(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                b3 b3Var2 = this.b;
                if (b3Var2.getContext() != null && !b3Var2.J) {
                    ArrayList b10 = xg.s.b(1, list);
                    b3Var2.S1 = b10;
                    List c2 = xg.s.c(b10);
                    b3Var2.S1 = c2;
                    if (!((ArrayList) c2).isEmpty()) {
                        b3Var2.f1();
                        f41 f41Var = b3Var2.R1;
                        if (f41Var != null) {
                            f41Var.O(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
