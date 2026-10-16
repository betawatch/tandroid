package fi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.da0;
import w7.z5;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class e4 extends org.telegram.ui.Cells.m4 {
    public final da0 r;

    public e4(Context context, c6 c6Var) {
        super(context, c6Var);
        da0 da0Var = new da0(context, c6Var);
        this.r = da0Var;
        da0Var.setTextSize(1, 14.0f);
        da0Var.setTextColor(g6.w0(g6.z6, c6Var));
        da0Var.setLinkTextColor(g6.w0(g6.L6, c6Var));
        da0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(da0Var, z5.a(-2.0f, 10.0f, 14.0f, 10.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
    }
}
