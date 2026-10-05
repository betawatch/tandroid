package ai;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class k1 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new k1());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        ((l1) view).set((n1) h61Var.G);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new l1(context);
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean equals(h61 h61Var, h61 h61Var2) {
        return h61Var.G == h61Var2.G;
    }
}
