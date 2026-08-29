package ih;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.k51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;

    public /* synthetic */ e1(h2 h2Var, int i10) {
        this.a = i10;
        this.b = h2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                h2 h2Var = this.b;
                if (h2Var.o0 != intValue) {
                    h2Var.o0 = intValue;
                    h2Var.g0.g();
                    h2Var.U.N(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                h2 h2Var2 = this.b;
                if (h2Var2.getContext() != null && h2Var2.isShown()) {
                    ArrayList b10 = eg.q0.b(1, list);
                    h2Var2.V = b10;
                    List c3 = eg.q0.c(b10);
                    h2Var2.V = c3;
                    if (!((ArrayList) c3).isEmpty()) {
                        h2Var2.W();
                        k51 k51Var = h2Var2.U;
                        if (k51Var != null) {
                            k51Var.N(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
