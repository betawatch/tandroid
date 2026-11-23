package jg;

import java.util.ArrayList;
import org.telegram.messenger.oi;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Components.n90;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements oi, h2 {
    public final /* synthetic */ h1 a;

    public /* synthetic */ u0(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.telegram.messenger.oi
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
        n90 n90Var = h1Var.W;
        ArrayList arrayList2 = h1Var.O;
        n90Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
