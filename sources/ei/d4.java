package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.n90;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class d4 extends org.telegram.ui.Cells.n4 {
    public final n90 r;

    public d4(Context context, f6 f6Var) {
        super(context, f6Var);
        n90 n90Var = new n90(context, f6Var);
        this.r = n90Var;
        n90Var.setTextSize(1, 14.0f);
        n90Var.setTextColor(j6.v0(j6.z6, f6Var));
        n90Var.setLinkTextColor(j6.v0(j6.L6, f6Var));
        n90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(n90Var, y5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
