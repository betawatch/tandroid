package kh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ g2 b;

    public /* synthetic */ d1(g2 g2Var, int i10) {
        this.a = i10;
        this.b = g2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                g2 g2Var = this.b;
                if (g2Var.p0 != intValue) {
                    g2Var.p0 = intValue;
                    g2Var.h0.g();
                    g2Var.V.N(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                g2 g2Var2 = this.b;
                if (g2Var2.getContext() != null && g2Var2.isShown()) {
                    ArrayList b10 = gg.p0.b(1, list);
                    g2Var2.W = b10;
                    List c3 = gg.p0.c(b10);
                    g2Var2.W = c3;
                    if (!((ArrayList) c3).isEmpty()) {
                        g2Var2.W();
                        w51 w51Var = g2Var2.V;
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
