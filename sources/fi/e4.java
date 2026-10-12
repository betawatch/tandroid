package fi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.da0;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        addView(da0Var, a6.a(-2.0f, 10.0f, 14.0f, 10.0f, 0.0f, -2, (LocaleController.isRTL ? 3 : 5) | 48));
    }
}
