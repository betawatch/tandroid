package ci;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.ct0;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.ra1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements qe.b, ct0, et0, org.telegram.ui.ActionBar.p1, s10 {
    public final /* synthetic */ v a;

    public /* synthetic */ e(v vVar) {
        this.a = vVar;
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        this.a.x0();
    }

    @Override // org.telegram.ui.Components.ct0
    public int c() {
        return this.a.n;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        v vVar = this.a;
        vVar.getClass();
        vVar.presentFragment(new ra1(6, null));
    }

    @Override // org.telegram.ui.Components.et0
    public /* synthetic */ float i(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        v.a0(this.a, (r31) obj);
    }

    @Override // org.telegram.ui.Components.et0
    public RecyclerView m(View view) {
        v vVar = this.a;
        if (vVar.a == 1) {
            return ((u) view).c;
        }
        vVar.L.getClass();
        return ((tb) view).a;
    }

    @Override // org.telegram.ui.Components.et0
    public /* synthetic */ void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
    }
}
