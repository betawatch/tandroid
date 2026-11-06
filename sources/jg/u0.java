package jg;

import java.util.ArrayList;
import org.telegram.messenger.ri;
import org.telegram.ui.Cells.g2;
import org.telegram.ui.Components.b90;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements ri, g2 {
    public final /* synthetic */ i1 a;

    public /* synthetic */ u0(i1 i1Var) {
        this.a = i1Var;
    }

    @Override // org.telegram.messenger.ri
    public void e(String str, ArrayList arrayList) {
        i1 i1Var = this.a;
        i1Var.N = arrayList;
        i1Var.I = null;
        i1Var.A0 = null;
        i1Var.y = null;
        i1Var.D = null;
        i1Var.J = null;
        i1Var.Q = null;
        i1Var.M = null;
        i1Var.K = null;
        i1Var.P = null;
        i1Var.f();
        b90 b90Var = i1Var.V;
        ArrayList arrayList2 = i1Var.N;
        b90Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
