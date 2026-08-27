package gh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.b51;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k2 b;

    public /* synthetic */ h1(k2 k2Var, int i10) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                k2 k2Var = this.b;
                if (k2Var.o0 != intValue) {
                    k2Var.o0 = intValue;
                    k2Var.g0.g();
                    k2Var.U.N(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                k2 k2Var2 = this.b;
                if (k2Var2.getContext() != null && k2Var2.isShown()) {
                    ArrayList b10 = cg.q0.b(1, list);
                    k2Var2.V = b10;
                    List c10 = cg.q0.c(b10);
                    k2Var2.V = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        k2Var2.W();
                        b51 b51Var = k2Var2.U;
                        if (b51Var != null) {
                            b51Var.N(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
