// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dzb extends i49 {
    public final /* synthetic */ rzb a;

    public dzb(rzb rzbVar) {
        this.a = rzbVar;
    }

    @Override // i49
    public final void a(RecyclerView recyclerView, int i) {
        rzb rzbVar = this.a;
        czb czbVar = rzbVar.G1;
        if (i == 0) {
            rzbVar.F1 = false;
        } else if (i != 2) {
            return;
        }
        if (rzbVar.F0(false) <= 0.0f || rzbVar.F0(false) >= gl.L(96.0f) || !czbVar.canScrollVertically(1) || !rzbVar.I0()) {
            return;
        }
        rzbVar.F1 = true;
        czbVar.x0(0, (int) rzbVar.F0(false), null);
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        rzb rzbVar = this.a;
        rzbVar.b.invalidate();
        boolean canScrollVertically = rzbVar.G1.canScrollVertically(1);
        View view = rzbVar.K1;
        Boolean bool = rzbVar.Q1;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            rzbVar.Q1 = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            ug8.t(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), s33.h, 320L);
        }
    }
}
