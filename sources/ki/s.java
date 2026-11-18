package ki;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.sp;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class s {
    public final RectF a = new RectF();
    public final c6 b;
    public final c6 c;
    public final c6 d;
    public final c6 e;
    public final f5 f;
    public final f5 g;
    public final c6 h;
    public final c6 i;
    public final mc j;
    public final Paint k;
    public final m6 l;
    public int m;
    public final org.telegram.ui.Cells.y n;
    public final sp o;
    public final org.telegram.ui.Components.voip.n p;

    public s(u uVar) {
        lr lrVar = lr.h;
        this.b = new c6(uVar, 0L, 320L, lrVar);
        this.c = new c6(uVar, 0L, 320L, lrVar);
        this.d = new c6(uVar, 0L, 320L, lrVar);
        this.e = new c6(uVar, 0L, 320L, lrVar);
        this.f = new f5(uVar, 320L, lrVar, 0);
        this.g = new f5(uVar, 320L, lrVar, 0);
        this.h = new c6(uVar, 0L, 320L, lrVar);
        this.i = new c6(uVar, 0L, 320L, lrVar);
        this.j = new mc(uVar);
        this.k = new Paint(1);
        m6 m6Var = new m6(true, false, true);
        this.l = m6Var;
        org.telegram.ui.Cells.y a02 = n6.a0(0, 9, 9);
        this.n = a02;
        sp spVar = new sp(-1);
        this.o = spVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.p = nVar;
        m6Var.b = 17;
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.N = org.telegram.messenger.g0.q.x * 4;
        m6Var.q(true);
        m6Var.setCallback(uVar);
        spVar.setCallback(uVar);
        a02.setCallback(uVar);
        nVar.l = true;
        nVar.m = 2.0f;
    }
}
