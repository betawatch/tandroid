package ei;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class w extends s4.g0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ s2 d;
    public final /* synthetic */ y e;

    public w(y yVar, Context context, s2 s2Var) {
        this.e = yVar;
        this.c = context;
        this.d = s2Var;
    }

    @Override // s4.g0
    public final int h() {
        return t.a().size();
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        x xVar = (x) b1Var.a;
        t tVar = (t) t.a().get(i10);
        boolean z10 = i10 == xVar.s;
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.e.b), z10);
        xVar.s = i10;
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        x xVar = new x(this.c);
        xVar.setLayoutParams(new s4.o0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        xVar.setBackground(org.telegram.ui.ActionBar.k6.g0(553648127, 1, -1));
        return new wl0(xVar);
    }

    @Override // s4.g0
    public final void y(s4.b1 b1Var) {
        x xVar = (x) b1Var.a;
        this.d.a(xVar);
        int i10 = xVar.s;
        if (i10 < 0 || i10 >= t.a().size()) {
            return;
        }
        t tVar = (t) t.a().get(xVar.s);
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.e.b), false);
    }

    @Override // s4.g0
    public final void z(s4.b1 b1Var) {
        this.d.d.remove((x) b1Var.a);
    }
}
