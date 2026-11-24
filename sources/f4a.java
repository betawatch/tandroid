// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class f4a extends i49 {
    public final /* synthetic */ uw1 a;

    public f4a(uw1 uw1Var) {
        this.a = uw1Var;
    }

    @Override // i49
    public final void b(RecyclerView recyclerView, int i, int i2) {
        uw1 uw1Var = this.a;
        View view = uw1Var.u;
        boolean z = uw1Var.w.H0() != 0;
        Boolean bool = uw1Var.x;
        if (bool == null || z != bool.booleanValue()) {
            view.animate().cancel();
            view.animate().alpha(z ? 1.0f : 0.0f).setDuration(150L).start();
            uw1Var.x = Boolean.valueOf(z);
        }
    }
}
