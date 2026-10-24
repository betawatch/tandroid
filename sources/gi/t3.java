package gi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.y90;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class t3 extends org.telegram.ui.Cells.l4 {
    public final y90 r;

    public t3(Context context, g6 g6Var) {
        super(context, g6Var);
        y90 y90Var = new y90(context, g6Var);
        this.r = y90Var;
        y90Var.setTextSize(1, 14.0f);
        r6.W(y90Var, k6.z6, g6Var);
        r6.I(y90Var, k6.L6, g6Var);
        y90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(y90Var, z5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
