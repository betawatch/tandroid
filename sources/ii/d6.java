package ii;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class d6 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new d6());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        ((f6) view).g((a) h61Var.G, (c6) h61Var.H, h61Var.r);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        f6 f6Var = new f6(context, d6Var);
        f6Var.setBackground(new b2(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, d6Var)));
        return f6Var;
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean isClickable() {
        return false;
    }
}
