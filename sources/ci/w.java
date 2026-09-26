package ci;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gl0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class w extends s4.h0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ x2 d;
    public final /* synthetic */ y e;

    public w(y yVar, Context context, x2 x2Var) {
        this.e = yVar;
        this.c = context;
        this.d = x2Var;
    }

    @Override // s4.h0
    public final int h() {
        return t.a().size();
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        x xVar = (x) c1Var.a;
        t tVar = (t) t.a().get(i10);
        boolean z10 = i10 == xVar.s;
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.e.b), z10);
        xVar.s = i10;
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        x xVar = new x(this.c);
        xVar.setLayoutParams(new s4.p0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        xVar.setBackground(org.telegram.ui.ActionBar.h6.f0(553648127, 1, -1));
        return new gl0(xVar);
    }

    @Override // s4.h0
    public final void y(s4.c1 c1Var) {
        x xVar = (x) c1Var.a;
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
    public final void z(s4.c1 c1Var) {
        this.d.d.remove((x) c1Var.a);
    }
}
