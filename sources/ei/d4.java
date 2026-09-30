package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.p90;
import w7.y5;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class d4 extends org.telegram.ui.Cells.m4 {
    public final p90 r;

    public d4(Context context, d6 d6Var) {
        super(context, d6Var);
        p90 p90Var = new p90(context, d6Var);
        this.r = p90Var;
        p90Var.setTextSize(1, 14.0f);
        p90Var.setTextColor(h6.v0(h6.z6, d6Var));
        p90Var.setLinkTextColor(h6.v0(h6.L6, d6Var));
        p90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(p90Var, y5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
