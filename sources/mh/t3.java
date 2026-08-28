package mh;

import android.content.Context;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class t3 extends org.telegram.ui.Cells.m4 {
    public final l80 r;

    public t3(Context context, b6 b6Var) {
        super(context, b6Var);
        l80 l80Var = new l80(context, b6Var);
        this.r = l80Var;
        l80Var.setTextSize(1, 14.0f);
        l80Var.setTextColor(f6.v0(f6.z6, b6Var));
        l80Var.setLinkTextColor(f6.v0(f6.L6, b6Var));
        l80Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(l80Var, e6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
