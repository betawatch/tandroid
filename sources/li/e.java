package li;

import ai.r;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
    public mi.b e = mi.b.c;
    public final RectF m = new RectF();
    public final mi.a p = new mi.a();
    public final mi.a q = new mi.a();
    public final mi.a r = new mi.a();
    public final ArrayList s = new ArrayList();

    public final void a(qm0 qm0Var) {
        if (qm0Var == null) {
            return;
        }
        qm0Var.C2.b.add(new cu() { // from class: li.b
            @Override // org.telegram.ui.Components.cu
            public final void a(int i10, boolean z10) {
                e.this.g++;
            }
        });
        qm0Var.j(new r(this, 11));
    }

    public final void b(View view) {
        uf.b a2;
        uf.d dVar;
        View view2 = this.i;
        if (view2 != view) {
            a aVar = this.b;
            if (view2 != null && (dVar = (uf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.a;
                if (arrayList.remove(aVar)) {
                    uf.b bVar = dVar.b;
                    if (bVar != null) {
                        ((qe.b) bVar.a.b).remove(aVar);
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
                uf.d dVar2 = (uf.d) view.getTag(R.id.tag_view_on_post_draw_state);
                if (dVar2 == null) {
                    dVar2 = new uf.d();
                    view.setTag(R.id.tag_view_on_post_draw_state, dVar2);
                    view.addOnAttachStateChangeListener(dVar2.c);
                }
                ArrayList arrayList2 = dVar2.a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = uf.e.a(view, dVar2)) != null) {
                        ((qe.b) a2.a.b).add(aVar);
                    }
                }
            }
            this.i = view;
        }
    }
}
