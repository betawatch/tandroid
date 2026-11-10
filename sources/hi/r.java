package hi;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.y4;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class r {
    public final RectF a = new RectF();
    public final v5 b;
    public final v5 c;
    public final v5 d;
    public final v5 e;
    public final y4 f;
    public final y4 g;
    public final v5 h;
    public final v5 i;
    public final hc j;
    public final Paint k;
    public final h6 l;
    public int m;
    public final org.telegram.ui.Cells.y n;
    public final cp o;
    public final org.telegram.ui.Components.voip.n p;

    public r(t tVar) {
        wq wqVar = wq.h;
        this.b = new v5(tVar, 0L, 320L, wqVar);
        this.c = new v5(tVar, 0L, 320L, wqVar);
        this.d = new v5(tVar, 0L, 320L, wqVar);
        this.e = new v5(tVar, 0L, 320L, wqVar);
        this.f = new y4(tVar, 320L, wqVar, 0);
        this.g = new y4(tVar, 320L, wqVar, 0);
        this.h = new v5(tVar, 0L, 320L, wqVar);
        this.i = new v5(tVar, 0L, 320L, wqVar);
        this.j = new hc(tVar);
        this.k = new Paint(1);
        h6 h6Var = new h6(true, false, true);
        this.l = h6Var;
        org.telegram.ui.Cells.y a02 = m6.a0(0, 9, 9);
        this.n = a02;
        cp cpVar = new cp(-1);
        this.o = cpVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.p = nVar;
        h6Var.b = 17;
        h6Var.w(org.telegram.messenger.g0.L(14.0f));
        h6Var.x(org.telegram.messenger.g0.o());
        h6Var.M = org.telegram.messenger.g0.q.x * 4;
        h6Var.q(true);
        h6Var.setCallback(tVar);
        cpVar.setCallback(tVar);
        a02.setCallback(tVar);
        nVar.l = true;
        nVar.m = 2.0f;
    }
}
