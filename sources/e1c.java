// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e1c extends k69 {
    public final /* synthetic */ s1c a;

    public e1c(s1c s1cVar) {
        this.a = s1cVar;
    }

    @Override // k69
    public final void a(RecyclerView recyclerView, int i) {
        s1c s1cVar = this.a;
        d1c d1cVar = s1cVar.G1;
        if (i == 0) {
            s1cVar.F1 = false;
        } else if (i != 2) {
            return;
        }
        if (s1cVar.F0(false) <= 0.0f || s1cVar.F0(false) >= gm.L(96.0f) || !d1cVar.canScrollVertically(1) || !s1cVar.I0()) {
            return;
        }
        s1cVar.F1 = true;
        d1cVar.x0(0, (int) s1cVar.F0(false), null);
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        s1c s1cVar = this.a;
        s1cVar.b.invalidate();
        boolean canScrollVertically = s1cVar.G1.canScrollVertically(1);
        View view = s1cVar.K1;
        Boolean bool = s1cVar.Q1;
        if (bool == null || bool.booleanValue() != canScrollVertically) {
            s1cVar.Q1 = Boolean.valueOf(canScrollVertically);
            view.animate().cancel();
            wi8.t(view.animate().alpha(canScrollVertically ? 1.0f : 0.0f), d53.h, 320L);
        }
    }
}
