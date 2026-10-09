package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ea0;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class d4 extends org.telegram.ui.Cells.m4 {
    public final ea0 r;

    public d4(Context context, e6 e6Var) {
        super(context, e6Var);
        ea0 ea0Var = new ea0(context, e6Var);
        this.r = ea0Var;
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setTextColor(i6.w0(i6.z6, e6Var));
        ea0Var.setLinkTextColor(i6.w0(i6.L6, e6Var));
        ea0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(ea0Var, x5.a(-2.0f, 10.0f, 14.0f, 10.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
    }
}
