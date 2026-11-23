package jg;

import java.util.ArrayList;
import org.telegram.messenger.pi;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Components.q90;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements pi, h2 {
    public final /* synthetic */ h1 a;

    public /* synthetic */ u0(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.telegram.messenger.pi
    public void e(String str, ArrayList arrayList) {
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
        q90 q90Var = h1Var.W;
        ArrayList arrayList2 = h1Var.O;
        q90Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
