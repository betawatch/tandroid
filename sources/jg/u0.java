package jg;

import java.util.ArrayList;
import org.telegram.messenger.pi;
import org.telegram.ui.Cells.g2;
import org.telegram.ui.Components.d90;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        d90 d90Var = h1Var.W;
        ArrayList arrayList2 = h1Var.O;
        d90Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
