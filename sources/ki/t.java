package ki;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.x4;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
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
    public final dc j;
    public final Paint k;
    public final g6 l;
    public int m;
    public final org.telegram.ui.Cells.y n;
    public final lp o;
    public final org.telegram.ui.Components.voip.n p;

    public t(v vVar) {
        er erVar = er.h;
        this.b = new u5(vVar, 0L, 320L, erVar);
        this.c = new u5(vVar, 0L, 320L, erVar);
        this.d = new u5(vVar, 0L, 320L, erVar);
        this.e = new u5(vVar, 0L, 320L, erVar);
        this.f = new x4(vVar, 320L, erVar, 0);
        this.g = new x4(vVar, 320L, erVar, 0);
        this.h = new u5(vVar, 0L, 320L, erVar);
        this.i = new u5(vVar, 0L, 320L, erVar);
        this.j = new dc(vVar);
        this.k = new Paint(1);
        g6 g6Var = new g6(true, false, true);
        this.l = g6Var;
        org.telegram.ui.Cells.y a02 = j6.a0(0, 9, 9);
        this.n = a02;
        lp lpVar = new lp(-1);
        this.o = lpVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.p = nVar;
        g6Var.b = 17;
        g6Var.w(org.telegram.messenger.g0.L(14.0f));
        g6Var.x(org.telegram.messenger.g0.o());
        g6Var.N = org.telegram.messenger.g0.q.x * 4;
        g6Var.q(true);
        g6Var.setCallback(vVar);
        lpVar.setCallback(vVar);
        a02.setCallback(vVar);
        nVar.l = true;
        nVar.m = 2.0f;
    }
}
