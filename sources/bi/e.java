package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.x31;
import org.telegram.ui.cb1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements te.b, et0, gt0, org.telegram.ui.ActionBar.r1, a20 {
    public final /* synthetic */ z a;

    public /* synthetic */ e(z zVar) {
        this.a = zVar;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.a.x0();
    }

    @Override // org.telegram.ui.Components.et0
    public int b() {
        return this.a.n;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        z zVar = this.a;
        zVar.getClass();
        zVar.presentFragment(new cb1(6, null));
    }

    @Override // org.telegram.ui.Components.gt0
    public /* synthetic */ float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        z.a0(this.a, (x31) obj);
    }

    @Override // org.telegram.ui.Components.gt0
    public RecyclerView l(View view) {
        z zVar = this.a;
        if (zVar.a == 1) {
            return ((y) view).c;
        }
        zVar.K.getClass();
        return ((ad) view).a;
    }

    @Override // org.telegram.ui.Components.gt0
    public /* synthetic */ void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }
}
