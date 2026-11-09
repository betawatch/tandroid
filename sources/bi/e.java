package bi;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.y31;
import org.telegram.ui.bb1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements te.b, ft0, ht0, org.telegram.ui.ActionBar.r1, a20 {
    public final /* synthetic */ z a;

    public /* synthetic */ e(z zVar) {
        this.a = zVar;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.a.x0();
    }

    @Override // org.telegram.ui.Components.ft0
    public int b() {
        return this.a.n;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        z zVar = this.a;
        zVar.getClass();
        zVar.presentFragment(new bb1(6, null));
    }

    @Override // org.telegram.ui.Components.ht0
    public /* synthetic */ float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        z.a0(this.a, (y31) obj);
    }

    @Override // org.telegram.ui.Components.ht0
    public RecyclerView l(View view) {
        z zVar = this.a;
        if (zVar.a == 1) {
            return ((y) view).c;
        }
        zVar.K.getClass();
        return ((ad) view).a;
    }

    @Override // org.telegram.ui.Components.ht0
    public /* synthetic */ void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }
}
