package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.n90;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class d4 extends org.telegram.ui.Cells.m4 {
    public final n90 r;

    public d4(Context context, d6 d6Var) {
        super(context, d6Var);
        n90 n90Var = new n90(context, d6Var);
        this.r = n90Var;
        n90Var.setTextSize(1, 14.0f);
        n90Var.setTextColor(h6.v0(h6.z6, d6Var));
        n90Var.setLinkTextColor(h6.v0(h6.L6, d6Var));
        n90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(n90Var, y5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
