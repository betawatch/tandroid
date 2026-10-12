package ni;

import ah.d0;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.zt;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
    public oi.b e = oi.b.c;
    public final RectF m = new RectF();
    public final oi.a p = new oi.a();
    public final oi.a q = new oi.a();
    public final oi.a r = new oi.a();
    public final ArrayList s = new ArrayList();

    public final void a(mm0 mm0Var) {
        if (mm0Var == null) {
            return;
        }
        mm0Var.C2.b.add(new zt() { // from class: ni.b
            @Override // org.telegram.ui.Components.zt
            public final void a(int i10, boolean z10) {
                e.this.g++;
            }
        });
        mm0Var.j(new d0(this, 12));
    }

    public final void b(View view) {
        vf.b a2;
        vf.d dVar;
        View view2 = this.i;
        if (view2 != view) {
            a aVar = this.b;
            if (view2 != null && (dVar = (vf.d) view2.getTag(R.id.tag_view_on_post_draw_state)) != null) {
                ArrayList arrayList = dVar.a;
                if (arrayList.remove(aVar)) {
                    vf.b bVar = dVar.b;
                    if (bVar != null) {
                        ((re.b) bVar.a.b).remove(aVar);
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
                vf.d dVar2 = (vf.d) view.getTag(R.id.tag_view_on_post_draw_state);
                if (dVar2 == null) {
                    dVar2 = new vf.d();
                    view.setTag(R.id.tag_view_on_post_draw_state, dVar2);
                    view.addOnAttachStateChangeListener(dVar2.c);
                }
                ArrayList arrayList2 = dVar2.a;
                if (!arrayList2.contains(aVar)) {
                    arrayList2.add(aVar);
                    if (view.isAttachedToWindow() && (a2 = vf.e.a(view, dVar2)) != null) {
                        ((re.b) a2.a.b).add(aVar);
                    }
                }
            }
            this.i = view;
        }
    }
}
