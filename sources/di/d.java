package di;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.za1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements te.b, ot0, qt0, org.telegram.ui.ActionBar.q1, u10 {
    public final /* synthetic */ t a;

    public /* synthetic */ d(t tVar) {
        this.a = tVar;
    }

    @Override // te.b
    public void K(int i7, float f10, float f11, te.c cVar) {
        this.a.y0();
    }

    @Override // org.telegram.ui.Components.ot0
    public int b() {
        return this.a.n;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        t tVar = this.a;
        tVar.getClass();
        tVar.presentFragment(new za1(6, null));
    }

    @Override // org.telegram.ui.Components.qt0
    public /* synthetic */ float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override // org.telegram.messenger.u10
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        t.a0(this.a, (n41) obj);
    }

    @Override // org.telegram.ui.Components.qt0
    public RecyclerView l(View view) {
        t tVar = this.a;
        if (tVar.a == 1) {
            return ((s) view).c;
        }
        tVar.L.getClass();
        return ((mb) view).a;
    }

    @Override // org.telegram.ui.Components.qt0
    public /* synthetic */ void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    @Override // te.b
    public /* synthetic */ void G(float f10, int i7) {
    }
}
