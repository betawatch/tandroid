package nh;

import android.content.Context;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class r3 extends org.telegram.ui.Cells.j4 {
    public final p80 r;

    public r3(Context context, c6 c6Var) {
        super(context, c6Var);
        p80 p80Var = new p80(context, c6Var);
        this.r = p80Var;
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTextColor(g6.v0(g6.z6, c6Var));
        p80Var.setLinkTextColor(g6.v0(g6.L6, c6Var));
        p80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(p80Var, z5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
