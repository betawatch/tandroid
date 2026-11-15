package di;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.xa1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements te.b, et0, gt0, org.telegram.ui.ActionBar.q1, x10 {
    public final /* synthetic */ t a;

    public /* synthetic */ d(t tVar) {
        this.a = tVar;
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        this.a.x0();
    }

    @Override // org.telegram.ui.Components.et0
    public int b() {
        return this.a.n;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        t tVar = this.a;
        tVar.getClass();
        tVar.presentFragment(new xa1(6, null));
    }

    @Override // org.telegram.ui.Components.gt0
    public /* synthetic */ float k(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.y0.c(recyclerView);
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        t.a0(this.a, (b41) obj);
    }

    @Override // org.telegram.ui.Components.gt0
    public RecyclerView n(View view) {
        t tVar = this.a;
        if (tVar.a == 1) {
            return ((s) view).c;
        }
        tVar.L.getClass();
        return ((ib) view).a;
    }

    @Override // org.telegram.ui.Components.gt0
    public /* synthetic */ void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.y0.b(recyclerView);
    }

    @Override // te.b
    public /* synthetic */ void E(float f10, int i7) {
    }
}
