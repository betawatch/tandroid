package kh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h2 b;

    public /* synthetic */ d1(h2 h2Var, int i10) {
        this.a = i10;
        this.b = h2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                h2 h2Var = this.b;
                if (h2Var.p0 != intValue) {
                    h2Var.p0 = intValue;
                    h2Var.h0.g();
                    h2Var.V.N(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                h2 h2Var2 = this.b;
                if (h2Var2.getContext() != null && h2Var2.isShown()) {
                    ArrayList b10 = gg.p0.b(1, list);
                    h2Var2.W = b10;
                    List c3 = gg.p0.c(b10);
                    h2Var2.W = c3;
                    if (!((ArrayList) c3).isEmpty()) {
                        h2Var2.W();
                        w51 w51Var = h2Var2.V;
                        if (w51Var != null) {
                            w51Var.N(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
