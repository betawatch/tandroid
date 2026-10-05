package li;

import ai.r;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class p {
    public static q B;
    public static int C;
    public l a;
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
    public ni.b d = ni.b.c;
    public final pe.b l = new pe.b();
    public final ArrayList m = new ArrayList();
    public final RectF t = new RectF();
    public final Rect u = new Rect();
    public final ni.a x = new ni.a();
    public final ni.a y = new ni.a();
    public final ni.a z = new ni.a();
    public final ArrayList A = new ArrayList();

    public static q f() {
        boolean isEnabled = LiteMode.isEnabled(256);
        boolean isEnabled2 = LiteMode.isEnabled(262144);
        q qVar = B;
        if (qVar == null || qVar.a != isEnabled || qVar.b != isEnabled2) {
            B = new q(isEnabled, isEnabled2);
            C++;
        }
        return B;
    }

    public final void a(ah.i iVar) {
        this.m.add(iVar);
    }

    public final void b(zl0 zl0Var) {
        if (zl0Var == null) {
            return;
        }
        this.l.add(zl0Var);
        zl0Var.E2.b.add(new pt() { // from class: li.f
            @Override // org.telegram.ui.Components.pt
            public final void a(int i10, boolean z10) {
                p pVar = p.this;
                pVar.f++;
                pVar.h += z10 ? 1 : -1;
            }
        });
        zl0Var.j(new r(this, 12));
    }

    public final void c(h91 h91Var) {
        if (h91Var == null) {
            return;
        }
        g gVar = new g(this);
        ArrayList arrayList = h91Var.R;
        if (arrayList.contains(gVar)) {
            return;
        }
        arrayList.add(gVar);
    }

    public final fh.c d(m mVar) {
        fh.c cVar = new fh.c();
        this.A.add(new n(cVar, mVar));
        cVar.a(mVar.f());
        return cVar;
    }

    public final ni.a e() {
        ni.a aVar = this.z;
        ni.a aVar2 = this.y;
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
        tf.b a2;
        tf.d dVar;
        View view2 = this.k;
        if (view2 != view) {
            h hVar = this.b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.a;
                if (arrayList.remove(hVar)) {
                    tf.b bVar = dVar.b;
                    if (bVar != null) {
                        ((pe.b) bVar.a.b).remove(hVar);
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
                tf.d dVar2 = (tf.d) view.getTag(R.id.tag_view_on_post_draw_state);
                if (dVar2 == null) {
                    dVar2 = new tf.d();
                    view.setTag(R.id.tag_view_on_post_draw_state, dVar2);
                    view.addOnAttachStateChangeListener(dVar2.c);
                }
                ArrayList arrayList2 = dVar2.a;
                if (!arrayList2.contains(hVar)) {
                    arrayList2.add(hVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.a.b).add(hVar);
                    }
                }
            }
            this.k = view;
        }
    }
}
