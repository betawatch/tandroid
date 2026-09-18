package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l90;
import w7.y5;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class d4 extends org.telegram.ui.Cells.m4 {
    public final l90 r;

    public d4(Context context, e6 e6Var) {
        super(context, e6Var);
        l90 l90Var = new l90(context, e6Var);
        this.r = l90Var;
        l90Var.setTextSize(1, 14.0f);
        l90Var.setTextColor(j6.v0(j6.z6, e6Var));
        l90Var.setLinkTextColor(j6.v0(j6.L6, e6Var));
        l90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(l90Var, y5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
