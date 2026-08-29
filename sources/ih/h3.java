package ih;

import android.content.Context;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h3 extends u51 {
    public final /* synthetic */ gr0 b3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(Context context, int i10, bg.t1 t1Var, f3 f3Var, f3 f3Var2, org.telegram.ui.ActionBar.c6 c6Var, gr0 gr0Var) {
        super(context, i10, 0, false, t1Var, f3Var, f3Var2, c6Var, 3, 1);
        this.b3 = gr0Var;
    }

    @Override // org.telegram.ui.Components.jl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.b3.o();
    }
}
