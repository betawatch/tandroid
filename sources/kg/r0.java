package kg;

import java.util.ArrayList;
import org.telegram.messenger.ii;
import org.telegram.ui.Cells.g2;
import org.telegram.ui.Components.x80;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements ii, g2 {
    public final /* synthetic */ e1 a;

    public /* synthetic */ r0(e1 e1Var) {
        this.a = e1Var;
    }

    @Override // org.telegram.messenger.ii
    public void h(String str, ArrayList arrayList) {
        e1 e1Var = this.a;
        e1Var.O = arrayList;
        e1Var.J = null;
        e1Var.B0 = null;
        e1Var.y = null;
        e1Var.E = null;
        e1Var.K = null;
        e1Var.R = null;
        e1Var.N = null;
        e1Var.L = null;
        e1Var.Q = null;
        e1Var.f();
        x80 x80Var = e1Var.W;
        ArrayList arrayList2 = e1Var.O;
        x80Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
