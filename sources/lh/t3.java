package lh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class t3 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new t3());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        g90 g90Var = (g90) view;
        g90Var.setGravity(h51Var.z);
        g90Var.setTextColor((int) h51Var.B);
        g90Var.setTextSize(1, h51Var.A);
        g90Var.setTypeface(h51Var.q ? AndroidUtilities.bold() : null);
        int i10 = h51Var.i;
        g90Var.setPadding(i10, 0, i10, h51Var.k);
        g90Var.setText(h51Var.l);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new fg.a2(context, 1, null);
    }
}
