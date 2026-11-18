package di;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.bb1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements te.b, mt0, ot0, org.telegram.ui.ActionBar.r1, v10 {
    public final /* synthetic */ t a;

    public /* synthetic */ d(t tVar) {
        this.a = tVar;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.a.y0();
    }

    @Override // org.telegram.ui.Components.mt0
    public int b() {
        return this.a.n;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        t tVar = this.a;
        tVar.getClass();
        tVar.presentFragment(new bb1(6, null));
    }

    @Override // org.telegram.ui.Components.ot0
    public /* synthetic */ float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        t.a0(this.a, (l41) obj);
    }

    @Override // org.telegram.ui.Components.ot0
    public RecyclerView n(View view) {
        t tVar = this.a;
        if (tVar.a == 1) {
            return ((s) view).c;
        }
        tVar.L.getClass();
        return ((mb) view).a;
    }

    @Override // org.telegram.ui.Components.ot0
    public /* synthetic */ void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }
}
