package gi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.x90;
import w7.z5;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class t3 extends org.telegram.ui.Cells.l4 {
    public final x90 r;

    public t3(Context context, d6 d6Var) {
        super(context, d6Var);
        x90 x90Var = new x90(context, d6Var);
        this.r = x90Var;
        x90Var.setTextSize(1, 14.0f);
        x90Var.setTextColor(h6.w0(h6.z6, d6Var));
        x90Var.setLinkTextColor(h6.w0(h6.L6, d6Var));
        x90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(x90Var, z5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
