package ki;

import android.graphics.Paint;
import android.graphics.RectF;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.rp;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class r {
    public final RectF a = new RectF();
    public final c6 b;
    public final c6 c;
    public final c6 d;
    public final c6 e;
    public final f5 f;
    public final f5 g;
    public final c6 h;
    public final c6 i;
    public final lc j;
    public final Paint k;
    public final m6 l;
    public int m;
    public final org.telegram.ui.Cells.y n;
    public final rp o;
    public final org.telegram.ui.Components.voip.n p;

    public r(t tVar) {
        kr krVar = kr.h;
        this.b = new c6(tVar, 0L, 320L, krVar);
        this.c = new c6(tVar, 0L, 320L, krVar);
        this.d = new c6(tVar, 0L, 320L, krVar);
        this.e = new c6(tVar, 0L, 320L, krVar);
        this.f = new f5(tVar, 320L, krVar, 0);
        this.g = new f5(tVar, 320L, krVar, 0);
        this.h = new c6(tVar, 0L, 320L, krVar);
        this.i = new c6(tVar, 0L, 320L, krVar);
        this.j = new lc(tVar);
        this.k = new Paint(1);
        m6 m6Var = new m6(true, false, true);
        this.l = m6Var;
        org.telegram.ui.Cells.y a02 = n6.a0(0, 9, 9);
        this.n = a02;
        rp rpVar = new rp(-1);
        this.o = rpVar;
        org.telegram.ui.Components.voip.n nVar = new org.telegram.ui.Components.voip.n();
        this.p = nVar;
        m6Var.b = 17;
        m6Var.w(org.telegram.messenger.g0.L(14.0f));
        m6Var.x(org.telegram.messenger.g0.o());
        m6Var.N = org.telegram.messenger.g0.q.x * 4;
        m6Var.q(true);
        m6Var.setCallback(tVar);
        rpVar.setCallback(tVar);
        a02.setCallback(tVar);
        nVar.l = true;
        nVar.m = 2.0f;
    }
}
