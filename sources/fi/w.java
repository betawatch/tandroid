package fi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class w extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ q2 d;
    public final /* synthetic */ y e;

    public w(y yVar, Context context, q2 q2Var) {
        this.e = yVar;
        this.c = context;
        this.d = q2Var;
    }

    @Override // s4.h0
    public final int h() {
        return t.a().size();
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        x xVar = (x) e1Var.a;
        t tVar = (t) t.a().get(i10);
        boolean z10 = i10 == xVar.s;
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.e.b), z10);
        xVar.s = i10;
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        x xVar = new x(this.c);
        xVar.setLayoutParams(new s4.q0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        xVar.setBackground(org.telegram.ui.ActionBar.y6.g0(553648127, 1, -1));
        return new vl0(xVar);
    }

    @Override // s4.h0
    public final void y(s4.e1 e1Var) {
        x xVar = (x) e1Var.a;
        this.d.a(xVar);
        int i10 = xVar.s;
        if (i10 < 0 || i10 >= t.a().size()) {
            return;
        }
        t tVar = (t) t.a().get(xVar.s);
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.e.b), false);
    }

    @Override // s4.h0
    public final void z(s4.e1 e1Var) {
        this.d.d.remove((x) e1Var.a);
    }
}
