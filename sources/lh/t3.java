package lh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class t3 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new t3());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        g90 g90Var = (g90) view;
        g90Var.setGravity(j51Var.z);
        g90Var.setTextColor((int) j51Var.B);
        g90Var.setTextSize(1, j51Var.A);
        g90Var.setTypeface(j51Var.q ? AndroidUtilities.bold() : null);
        int i10 = j51Var.i;
        g90Var.setPadding(i10, 0, i10, j51Var.k);
        g90Var.setText(j51Var.l);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new fg.a2(context, 1, null);
    }
}
