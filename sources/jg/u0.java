package jg;

import java.util.ArrayList;
import org.telegram.messenger.pi;
import org.telegram.ui.Cells.g2;
import org.telegram.ui.Components.e90;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements pi, g2 {
    public final /* synthetic */ h1 a;

    public /* synthetic */ u0(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.telegram.messenger.pi
    public void c(String str, ArrayList arrayList) {
        h1 h1Var = this.a;
        h1Var.O = arrayList;
        h1Var.J = null;
        h1Var.B0 = null;
        h1Var.y = null;
        h1Var.E = null;
        h1Var.K = null;
        h1Var.R = null;
        h1Var.N = null;
        h1Var.L = null;
        h1Var.Q = null;
        h1Var.f();
        e90 e90Var = h1Var.W;
        ArrayList arrayList2 = h1Var.O;
        e90Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
