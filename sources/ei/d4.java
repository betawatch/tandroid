package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.c90;
import w7.x5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class d4 extends org.telegram.ui.Cells.m4 {
    public final c90 r;

    public d4(Context context, e6 e6Var) {
        super(context, e6Var);
        c90 c90Var = new c90(context, e6Var);
        this.r = c90Var;
        c90Var.setTextSize(1, 14.0f);
        c90Var.setTextColor(i6.v0(i6.z6, e6Var));
        c90Var.setLinkTextColor(i6.v0(i6.L6, e6Var));
        c90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(c90Var, x5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
