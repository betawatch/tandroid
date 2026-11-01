package ei;

import ag.u;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.tc;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.xs;
import w7.f0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class r {
    public static s F;
    public static int G;
    public int A;
    public n a;
    public boolean f;
    public long g;
    public long h;
    public long i;
    public int j;
    public int k;
    public int l;
    public View m;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public int u;
    public boolean y;
    public int z;
    public final i b = new i(this);
    public final ArrayList c = new ArrayList();
    public gi.b d = gi.b.c;
    public final RectF e = new RectF();
    public final je.b n = new je.b();
    public final ArrayList o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect w = new Rect();
    public final Rect x = new Rect();
    public final gi.a B = new gi.a();
    public final gi.a C = new gi.a();
    public final gi.a D = new gi.a();
    public final ArrayList E = new ArrayList();

    public static s f() {
        boolean e = tc.e(256);
        boolean e7 = tc.e(262144);
        s sVar = F;
        if (sVar == null || sVar.a != e || sVar.b != e7) {
            F = new s(e, e7);
            G++;
        }
        return F;
    }

    public final void a(tg.f fVar) {
        this.o.add(fVar);
    }

    public final void b(uk0 uk0Var) {
        if (uk0Var == null) {
            return;
        }
        this.n.add(uk0Var);
        uk0Var.D2.b.add(new xs() { // from class: ei.g
            @Override // org.telegram.ui.Components.xs
            public final void a(int i10, boolean z10) {
                r rVar = r.this;
                rVar.h++;
                rVar.j += z10 ? 1 : -1;
            }
        });
        k kVar = new k(this);
        if (uk0Var.P == null) {
            uk0Var.P = new ArrayList();
        }
        uk0Var.P.add(kVar);
        uk0Var.j(new u(this, 3));
    }

    public final void c(x71 x71Var) {
        if (x71Var == null) {
            return;
        }
        h hVar = new h(this);
        ArrayList arrayList = x71Var.R;
        if (arrayList.contains(hVar)) {
            return;
        }
        arrayList.add(hVar);
    }

    public final hi.c d(o oVar) {
        hi.c cVar = new hi.c();
        this.E.add(new p(cVar, oVar));
        cVar.a(oVar.c());
        return cVar;
    }

    public final gi.a e() {
        gi.a aVar = this.D;
        gi.a aVar2 = this.C;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.b = 0;
        int i10 = aVar2.b;
        for (int i11 = 0; i11 < i10; i11++) {
            RectF rectF = (RectF) aVar2.a.get(i11);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.i++;
    }

    public final void h(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.g++;
        this.k += i10;
        this.l += i11;
    }

    public final void i(View view) {
        nf.b a2;
        nf.d dVar;
        View view2 = this.m;
        if (view2 != view) {
            i iVar = this.b;
            if (view2 != null && (dVar = (nf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.a;
                if (arrayList.remove(iVar)) {
                    nf.b bVar = dVar.b;
                    if (bVar != null) {
                        ((je.b) bVar.a.b).remove(iVar);
                    }
                    if (arrayList.isEmpty()) {
                        dVar.b = null;
                        view2.removeOnAttachStateChangeListener(dVar.c);
                        view2.setTag(R.id.tag_view_on_post_draw_state, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
                }
                nf.d dVar2 = (nf.d) view.getTag(R.id.tag_view_on_post_draw_state);
                if (dVar2 == null) {
                    dVar2 = new nf.d();
                    view.setTag(R.id.tag_view_on_post_draw_state, dVar2);
                    view.addOnAttachStateChangeListener(dVar2.c);
                }
                ArrayList arrayList2 = dVar2.a;
                if (!arrayList2.contains(iVar)) {
                    arrayList2.add(iVar);
                    if (view.isAttachedToWindow() && (a2 = f0.a(view, dVar2)) != null) {
                        ((je.b) a2.a.b).add(iVar);
                    }
                }
            }
            this.m = view;
        }
    }
}
