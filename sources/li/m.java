package li;

import ai.r;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class m {
    public static n A;
    public static int B;
    public i a;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public int j;
    public View k;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public int r;
    public int u;
    public int v;
    public final h b = new h(this);
    public final ArrayList c = new ArrayList();
    public ni.b d = ni.b.c;
    public final ArrayList l = new ArrayList();
    public final RectF s = new RectF();
    public final Rect t = new Rect();
    public final ni.a w = new ni.a();
    public final ni.a x = new ni.a();
    public final ni.a y = new ni.a();
    public final ArrayList z = new ArrayList();

    public static n f() {
        boolean isEnabled = LiteMode.isEnabled(256);
        boolean isEnabled2 = LiteMode.isEnabled(262144);
        n nVar = A;
        if (nVar == null || nVar.a != isEnabled || nVar.b != isEnabled2) {
            A = new n(isEnabled, isEnabled2);
            B++;
        }
        return A;
    }

    public final void a(ah.i iVar) {
        this.l.add(iVar);
    }

    public final void b(zl0 zl0Var) {
        if (zl0Var == null) {
            return;
        }
        zl0Var.E2.b.add(new pt() { // from class: li.f
            @Override // org.telegram.ui.Components.pt
            public final void a(int i10, boolean z10) {
                m mVar = m.this;
                mVar.f++;
                mVar.h += z10 ? 1 : -1;
            }
        });
        zl0Var.j(new r(this, 12));
    }

    public final void c(g91 g91Var) {
        g91Var.Q.add(new g(this));
    }

    public final fh.c d(j jVar) {
        fh.c cVar = new fh.c();
        this.z.add(new k(cVar, jVar));
        cVar.a(jVar.f());
        return cVar;
    }

    public final ni.a e() {
        ni.a aVar = this.y;
        ni.a aVar2 = this.x;
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

    public final void h(View view) {
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
