package kh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class t3 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new t3());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        e90 e90Var = (e90) view;
        e90Var.setGravity(i51Var.z);
        e90Var.setTextColor((int) i51Var.B);
        e90Var.setTextSize(1, i51Var.A);
        e90Var.setTypeface(i51Var.q ? AndroidUtilities.bold() : null);
        int i10 = i51Var.i;
        e90Var.setPadding(i10, 0, i10, i51Var.k);
        e90Var.setText(i51Var.l);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new eg.b2(context, 1, null);
    }
}
