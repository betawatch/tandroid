// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class d3c extends v79 {
    public final /* synthetic */ r3c a;

    public d3c(r3c r3cVar) {
        this.a = r3cVar;
    }

    @Override // v79
    public final void a(RecyclerView recyclerView, int i) {
        r3c r3cVar = this.a;
        c3c c3cVar = r3cVar.G1;
        if (i == 0) {
            r3cVar.F1 = false;
        } else if (i != 2) {
            return;
        }
        if (r3cVar.G0(false) <= 0.0f || r3cVar.G0(false) >= hl.L(96.0f) || !c3cVar.canScrollVertically(1) || !r3cVar.J0()) {
            return;
        }
        r3cVar.F1 = true;
        c3cVar.y0(0, (int) r3cVar.G0(false), null);
    }

    @Override // v79
    public final void b(RecyclerView recyclerView, int i, int i2) {
        r3c r3cVar = this.a;
        r3cVar.b.invalidate();
        boolean canScrollVertically = r3cVar.G1.canScrollVertically(1);
        View view = r3cVar.K1;
        Boolean bool = r3cVar.Q1;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            r3cVar.Q1 = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            ik8.t(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), k43.h, 320L);
        }
    }
}
