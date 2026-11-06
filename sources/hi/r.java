package hi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.z4;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class r {
    public final RectF a = new RectF();
    public final w5 b;
    public final w5 c;
    public final w5 d;
    public final w5 e;
    public final z4 f;
    public final z4 g;
    public final w5 h;
    public final w5 i;
    public final ic j;
    public final Paint k;
    public final i6 l;
    public int m;
    public final org.telegram.ui.Cells.y n;
    public final cp o;
    public final org.telegram.ui.Components.voip.n p;

    public r(t tVar) {
        xq xqVar = xq.h;
        this.b = new w5(tVar, 0L, 320L, xqVar);
        this.c = new w5(tVar, 0L, 320L, xqVar);
        this.d = new w5(tVar, 0L, 320L, xqVar);
        this.e = new w5(tVar, 0L, 320L, xqVar);
        this.f = new z4(tVar, 320L, xqVar, 0);
        this.g = new z4(tVar, 320L, xqVar, 0);
        this.h = new w5(tVar, 0L, 320L, xqVar);
        this.i = new w5(tVar, 0L, 320L, xqVar);
        this.j = new ic(tVar);
        this.k = new Paint(1);
        i6 i6Var = new i6(true, false, true);
        this.l = i6Var;
        org.telegram.ui.Cells.y a02 = k6.a0(0, 9, 9);
        this.n = a02;
        cp cpVar = new cp(-1);
        this.o = cpVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.p = nVar;
        i6Var.b = 17;
        i6Var.w(org.telegram.messenger.g0.L(14.0f));
        i6Var.x(org.telegram.messenger.g0.o());
        i6Var.M = org.telegram.messenger.g0.q.x * 4;
        i6Var.q(true);
        i6Var.setCallback(tVar);
        cpVar.setCallback(tVar);
        a02.setCallback(tVar);
        nVar.l = true;
        nVar.m = 2.0f;
    }
}
