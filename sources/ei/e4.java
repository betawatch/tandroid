package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.q90;
import w7.z5;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class e4 extends org.telegram.ui.Cells.m4 {
    public final q90 r;

    public e4(Context context, d6 d6Var) {
        super(context, d6Var);
        q90 q90Var = new q90(context, d6Var);
        this.r = q90Var;
        q90Var.setTextSize(1, 14.0f);
        q90Var.setTextColor(i6.v0(i6.z6, d6Var));
        q90Var.setLinkTextColor(i6.v0(i6.L6, d6Var));
        q90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(q90Var, z5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
