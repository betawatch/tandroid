package ii;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class t {
    public final RectF a = new RectF();
    public final u5 b;
    public final u5 c;
    public final u5 d;
    public final u5 e;
    public final x4 f;
    public final x4 g;
    public final u5 h;
    public final u5 i;
    public final gc j;
    public final Paint k;
    public final g6 l;
    public int m;
    public final org.telegram.ui.Cells.y n;
    public final cp o;
    public final org.telegram.ui.Components.voip.g p;

    public t(v vVar) {
        xq xqVar = xq.h;
        this.b = new u5(vVar, 0L, 320L, xqVar);
        this.c = new u5(vVar, 0L, 320L, xqVar);
        this.d = new u5(vVar, 0L, 320L, xqVar);
        this.e = new u5(vVar, 0L, 320L, xqVar);
        this.f = new x4(vVar, 320L, xqVar, 0);
        this.g = new x4(vVar, 320L, xqVar, 0);
        this.h = new u5(vVar, 0L, 320L, xqVar);
        this.i = new u5(vVar, 0L, 320L, xqVar);
        this.j = new gc(vVar);
        this.k = new Paint(1);
        g6 g6Var = new g6(true, false, true);
        this.l = g6Var;
        org.telegram.ui.Cells.y a02 = k6.a0(0, 9, 9);
        this.n = a02;
        cp cpVar = new cp(-1);
        this.o = cpVar;
        org.telegram.ui.Components.voip.g gVar = new org.telegram.ui.Components.voip.g();
        this.p = gVar;
        g6Var.b = 17;
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.M = org.telegram.messenger.g0.q.x * 4;
        g6Var.q(true);
        g6Var.setCallback(vVar);
        cpVar.setCallback(vVar);
        a02.setCallback(vVar);
        gVar.l = true;
        gVar.m = 2.0f;
    }
}
