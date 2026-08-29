package nh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class w extends f2.p0 {
    public final /* synthetic */ Context c;
    public final /* synthetic */ p2 d;
    public final /* synthetic */ y e;

    public w(y yVar, Context context, p2 p2Var) {
        this.e = yVar;
        this.c = context;
        this.d = p2Var;
    }

    @Override // f2.p0
    public final int h() {
        return t.a().size();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        x xVar = (x) n1Var.a;
        t tVar = (t) t.a().get(i10);
        boolean z10 = i10 == xVar.s;
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.e.b), z10);
        xVar.s = i10;
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        x xVar = new x(this.c);
        xVar.setLayoutParams(new f2.x0(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
        xVar.setBackground(org.telegram.ui.ActionBar.g6.f0(553648127, 1, -1));
        return new vk0(xVar);
    }

    @Override // f2.p0
    public final void y(f2.n1 n1Var) {
        x xVar = (x) n1Var.a;
        this.d.a(xVar);
        int i10 = xVar.s;
        if (i10 < 0 || i10 >= t.a().size()) {
            return;
        }
        t tVar = (t) t.a().get(xVar.s);
        xVar.setDrawable(new u(tVar, false));
        xVar.b(tVar.equals(this.e.b), false);
    }

    @Override // f2.p0
    public final void z(f2.n1 n1Var) {
        this.d.d.remove((x) n1Var.a);
    }
}
