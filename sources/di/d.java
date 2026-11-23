package di;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.bb1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements te.b, pt0, rt0, org.telegram.ui.ActionBar.q1, w10 {
    public final /* synthetic */ t a;

    public /* synthetic */ d(t tVar) {
        this.a = tVar;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.a.y0();
    }

    @Override // org.telegram.ui.Components.pt0
    public int b() {
        return this.a.n;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        t tVar = this.a;
        tVar.getClass();
        tVar.presentFragment(new bb1(6, null));
    }

    @Override // org.telegram.ui.Components.rt0
    public /* synthetic */ float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override // org.telegram.messenger.w10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        t.a0(this.a, (o41) obj);
    }

    @Override // org.telegram.ui.Components.rt0
    public RecyclerView n(View view) {
        t tVar = this.a;
        if (tVar.a == 1) {
            return ((s) view).c;
        }
        tVar.L.getClass();
        return ((mb) view).a;
    }

    @Override // org.telegram.ui.Components.rt0
    public /* synthetic */ void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }
}
