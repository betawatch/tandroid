package oi;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.wt;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class q {
    public static r B;
    public static int C;
    public m a;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public int j;
    public View k;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int v;
    public int w;
    public final h b = new h(this);
    public final ArrayList c = new ArrayList();
    public qi.b d = qi.b.c;
    public final se.b l = new se.b();
    public final ArrayList m = new ArrayList();
    public final RectF t = new RectF();
    public final Rect u = new Rect();
    public final qi.a x = new qi.a();
    public final qi.a y = new qi.a();
    public final qi.a z = new qi.a();
    public final ArrayList A = new ArrayList();

    public static r f() {
        boolean isEnabled = LiteMode.isEnabled(256);
        boolean isEnabled2 = LiteMode.isEnabled(262144);
        r rVar = B;
        if (rVar == null || rVar.a != isEnabled || rVar.b != isEnabled2) {
            B = new r(isEnabled, isEnabled2);
            C++;
        }
        return B;
    }

    public final void a(ch.f fVar) {
        this.m.add(fVar);
    }

    public final void b(mm0 mm0Var) {
        if (mm0Var == null) {
            return;
        }
        this.l.add(mm0Var);
        mm0Var.D2.b.add(new wt() { // from class: oi.f
            @Override // org.telegram.ui.Components.wt
            public final void a(int i10, boolean z10) {
                q qVar = q.this;
                qVar.f++;
                qVar.h += z10 ? 1 : -1;
            }
        });
        j jVar = new j(this);
        if (mm0Var.P == null) {
            mm0Var.P = new ArrayList();
        }
        mm0Var.P.add(jVar);
        mm0Var.j(new ai.b(this, 20));
    }

    public final void c(u91 u91Var) {
        if (u91Var == null) {
            return;
        }
        g gVar = new g(this);
        ArrayList arrayList = u91Var.R;
        if (arrayList.contains(gVar)) {
            return;
        }
        arrayList.add(gVar);
    }

    public final hh.c d(n nVar) {
        hh.c cVar = new hh.c();
        this.A.add(new o(cVar, nVar));
        cVar.a(nVar.f());
        return cVar;
    }

    public final qi.a e() {
        qi.a aVar = this.z;
        qi.a aVar2 = this.y;
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
        this.g++;
    }

    public final void h(int i10, int i11) {
        if (i10 == 0 && i11 == 0) {
            return;
        }
        this.e++;
        this.i += i10;
        this.j += i11;
    }

    public final void i(View view) {
        wf.a a2;
        wf.c cVar;
        View view2 = this.k;
        if (view2 != view) {
            h hVar = this.b;
            if (view2 != null && (cVar = (wf.c) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = cVar.a;
                if (arrayList.remove(hVar)) {
                    wf.a aVar = cVar.b;
                    if (aVar != null) {
                        ((se.b) aVar.a.b).remove(hVar);
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
                wf.c cVar2 = (wf.c) view.getTag(R.id.tag_view_on_post_draw_state);
                if (cVar2 == null) {
                    cVar2 = new wf.c();
                    view.setTag(R.id.tag_view_on_post_draw_state, cVar2);
                    view.addOnAttachStateChangeListener(cVar2.c);
                }
                ArrayList arrayList2 = cVar2.a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a2 = wf.d.a(view, cVar2)) != null) {
                        ((se.b) a2.a.b).add(hVar);
                    }
                }
            }
            this.k = view;
        }
    }
}
