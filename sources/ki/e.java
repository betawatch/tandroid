package ki;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nt;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class e {
    public c a;
    public long f;
    public long g;
    public long h;
    public View i;
    public long j;
    public long k;
    public long l;
    public int n;
    public int o;
    public final a b = new a(this);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public li.b e = li.b.c;
    public final RectF m = new RectF();
    public final li.a p = new li.a();
    public final li.a q = new li.a();
    public final li.a r = new li.a();
    public final ArrayList s = new ArrayList();

    public final void a(ml0 ml0Var) {
        if (ml0Var == null) {
            return;
        }
        ml0Var.E2.b.add(new nt() { // from class: ki.b
            @Override // org.telegram.ui.Components.nt
            public final void a(int i10, boolean z10) {
                e.this.g++;
            }
        });
        ml0Var.j(new r(this, 11));
    }

    public final void b(View view) {
        tf.b a2;
        tf.d dVar;
        View view2 = this.i;
        if (view2 != view) {
            a aVar = this.b;
            if (view2 != null && (dVar = (tf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.a;
                if (arrayList.remove(aVar)) {
                    tf.b bVar = dVar.b;
                    if (bVar != null) {
                        ((pe.b) bVar.a.b).remove(aVar);
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
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = tf.e.a(view, dVar2)) != null) {
                        ((pe.b) a2.a.b).add(aVar);
                    }
                }
            }
            this.i = view;
        }
    }
}
