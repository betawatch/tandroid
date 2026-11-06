package oi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import c8.ud;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.rc;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.v61;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class q {
    public static r F;
    public static int G;
    public int A;
    public m a;
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
    public final h b = new h(this);
    public final ArrayList c = new ArrayList();
    public qi.b d = qi.b.c;
    public final RectF e = new RectF();
    public final xe.b n = new xe.b();
    public final ArrayList o = new ArrayList();
    public final RectF v = new RectF();
    public final Rect w = new Rect();
    public final Rect x = new Rect();
    public final qi.a B = new qi.a();
    public final qi.a C = new qi.a();
    public final qi.a D = new qi.a();
    public final ArrayList E = new ArrayList();

    public static r f() {
        boolean e10 = rc.e(256);
        boolean e11 = rc.e(262144);
        r rVar = F;
        if (rVar == null || rVar.a != e10 || rVar.b != e11) {
            F = new r(e10, e11);
            G++;
        }
        return F;
    }

    public final void a(dh.g gVar) {
        this.o.add(gVar);
    }

    public final void b(pj0 pj0Var) {
        if (pj0Var == null) {
            return;
        }
        this.n.add(pj0Var);
        pj0Var.D2.b.add(new ms() { // from class: oi.f
            @Override // org.telegram.ui.Components.ms
            public final void a(int i7, boolean z9) {
                q qVar = q.this;
                qVar.h++;
                qVar.j += z9 ? 1 : -1;
            }
        });
        j jVar = new j(this);
        if (pj0Var.P == null) {
            pj0Var.P = new ArrayList();
        }
        pj0Var.P.add(jVar);
        pj0Var.j(new ai.b(this, 23));
    }

    public final void c(v61 v61Var) {
        if (v61Var == null) {
            return;
        }
        g gVar = new g(this);
        ArrayList arrayList = v61Var.R;
        if (arrayList.contains(gVar)) {
            return;
        }
        arrayList.add(gVar);
    }

    public final ri.c d(n nVar) {
        ri.c cVar = new ri.c();
        this.E.add(new o(cVar, nVar));
        cVar.a(nVar.h());
        return cVar;
    }

    public final qi.a e() {
        qi.a aVar = this.D;
        qi.a aVar2 = this.C;
        if (aVar == aVar2) {
            aVar.getClass();
            return aVar;
        }
        aVar.b = 0;
        int i7 = aVar2.b;
        for (int i10 = 0; i10 < i7; i10++) {
            RectF rectF = (RectF) aVar2.a.get(i10);
            aVar.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
        return aVar;
    }

    public final void g() {
        this.i++;
    }

    public final void h(int i7, int i10) {
        if (i7 == 0 && i10 == 0) {
            return;
        }
        this.g++;
        this.k += i7;
        this.l += i10;
    }

    public final void i(View view) {
        xf.a a10;
        xf.c cVar;
        View view2 = this.m;
        if (view2 != view) {
            h hVar = this.b;
            if (view2 != null && (cVar = (xf.c) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = cVar.a;
                if (arrayList.remove(hVar)) {
                    xf.a aVar = cVar.b;
                    if (aVar != null) {
                        ((xe.b) aVar.a.b).remove(hVar);
                    }
                    if (arrayList.isEmpty()) {
                        cVar.b = null;
                        view2.removeOnAttachStateChangeListener(cVar.c);
                        view2.setTag(R.id.tag_view_on_post_draw_state, null);
                    }
                }
            }
            if (view != null) {
                if (view.isAttachedToWindow() && view == view.getRootView()) {
                    throw new IllegalArgumentException("Cannot add OnPostDrawListener to root view");
                }
                xf.c cVar2 = (xf.c) view.getTag(R.id.tag_view_on_post_draw_state);
                if (cVar2 == null) {
                    cVar2 = new xf.c();
                    view.setTag(R.id.tag_view_on_post_draw_state, cVar2);
                    view.addOnAttachStateChangeListener(cVar2.c);
                }
                ArrayList arrayList2 = cVar2.a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a10 = ud.a(view, cVar2)) != null) {
                        ((xe.b) a10.a.b).add(hVar);
                    }
                }
            }
            this.m = view;
        }
    }
}
