package hi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.z90;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class c4 extends org.telegram.ui.Cells.q4 {
    public final z90 r;

    public c4(Context context, u6 u6Var) {
        super(context, u6Var);
        z90 z90Var = new z90(context, u6Var);
        this.r = z90Var;
        z90Var.setTextSize(1, 14.0f);
        f7.V(z90Var, y6.z6, u6Var);
        f7.H(z90Var, y6.L6, u6Var);
        z90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(z90Var, gb1.h(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
