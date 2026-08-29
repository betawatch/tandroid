package ih;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.y80;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t3 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new t3());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        y80 y80Var = (y80) view;
        y80Var.setGravity(w41Var.z);
        y80Var.setTextColor((int) w41Var.B);
        y80Var.setTextSize(1, w41Var.A);
        y80Var.setTypeface(w41Var.q ? AndroidUtilities.bold() : null);
        int i10 = w41Var.i;
        y80Var.setPadding(i10, 0, i10, w41Var.k);
        y80Var.setText(w41Var.l);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new cg.c2(context, 1, null);
    }
}
