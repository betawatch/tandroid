package fh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ p2 b;

    public /* synthetic */ j1(p2 p2Var, int i9) {
        this.a = i9;
        this.b = p2Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                p2 p2Var = this.b;
                if (p2Var.o0 != intValue) {
                    p2Var.o0 = intValue;
                    p2Var.g0.g();
                    p2Var.U.N(true);
                    break;
                }
                break;
            default:
                List list = (List) obj;
                p2 p2Var2 = this.b;
                if (p2Var2.getContext() != null && p2Var2.isShown()) {
                    ArrayList b10 = bg.u0.b(1, list);
                    p2Var2.V = b10;
                    List c10 = bg.u0.c(b10);
                    p2Var2.V = c10;
                    if (!((ArrayList) c10).isEmpty()) {
                        p2Var2.V();
                        z41 z41Var = p2Var2.U;
                        if (z41Var != null) {
                            z41Var.N(true);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
