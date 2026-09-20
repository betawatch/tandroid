package li;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class i {
    public f a;
    public long e;
    public long f;
    public long g;
    public View h;
    public long j;
    public long k;
    public long l;
    public int n;
    public int o;
    public final c b = new c(this);
    public final ArrayList c = new ArrayList();
    public mi.b d = mi.b.c;
    public final ArrayList i = new ArrayList();
    public final RectF m = new RectF();
    public final mi.a p = new mi.a();
    public final mi.a q = new mi.a();
    public final mi.a r = new mi.a();
    public final ArrayList s = new ArrayList();

    public final void a(vl0 vl0Var) {
        if (vl0Var == null) {
            return;
        }
        vl0Var.E2.b.add(new mt() { // from class: li.d
            @Override // org.telegram.ui.Components.mt
            public final void a(int i10, boolean z10) {
                i.this.f++;
            }
        });
        vl0Var.j(new r(this, 12));
    }

    public final mi.a b() {
        mi.a aVar = this.r;
        mi.a aVar2 = this.q;
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

    public final void c(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.h;
        if (view2 != view) {
            c cVar = this.b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.a;
                if (arrayList.remove(cVar)) {
                    tf.b bVar = dVar.b;
                    if (bVar != null) {
                        ((pe.b) bVar.a.b).remove(cVar);
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
                if (!arrayList2.contains(cVar)) {
                    arrayList2.add(cVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.a.b).add(cVar);
                    }
                }
            }
            this.h = view;
        }
    }
}
