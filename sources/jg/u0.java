package jg;

import java.util.ArrayList;
import org.telegram.messenger.oi;
import org.telegram.ui.Cells.g2;
import org.telegram.ui.Components.o90;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements oi, g2 {
    public final /* synthetic */ h1 a;

    public /* synthetic */ u0(h1 h1Var) {
        this.a = h1Var;
    }

    @Override // org.telegram.messenger.oi
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
        o90 o90Var = h1Var.W;
        ArrayList arrayList2 = h1Var.O;
        o90Var.a((arrayList2 == null || arrayList2.isEmpty()) ? false : true);
    }
}
