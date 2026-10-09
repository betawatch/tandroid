package ci;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.am0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class w extends s4.i0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ w2 d;
    public final /* synthetic */ y e;

    public w(y yVar, Context context, w2 w2Var) {
        this.e = yVar;
        this.c = context;
        this.d = w2Var;
    }

    @Override // s4.i0
    public final int h() {
        return t.a().size();
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        x xVar = (x) d1Var.a;
        t tVar = (t) t.a().get(i10);
        boolean z10 = i10 == xVar.s;
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.e.b), z10);
        xVar.s = i10;
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        x xVar = new x(this.c);
        xVar.setLayoutParams(new s4.q0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        xVar.setBackground(org.telegram.ui.ActionBar.i6.g0(553648127, 1, -1));
        return new am0(xVar);
    }

    @Override // s4.i0
    public final void y(s4.d1 d1Var) {
        x xVar = (x) d1Var.a;
        this.d.a(xVar);
        int i10 = xVar.s;
        if (i10 < 0 || i10 >= t.a().size()) {
            return;
        }
        t tVar = (t) t.a().get(xVar.s);
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.e.b), false);
    }

    @Override // s4.i0
    public final void z(s4.d1 d1Var) {
        this.d.d.remove((x) d1Var.a);
    }
}
