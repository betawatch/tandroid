package di;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.m90;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g4 extends org.telegram.ui.Cells.m4 {
    public final m90 r;

    public g4(Context context, f6 f6Var) {
        super(context, f6Var);
        m90 m90Var = new m90(context, f6Var);
        this.r = m90Var;
        m90Var.setTextSize(1, 14.0f);
        m90Var.setTextColor(j6.v0(j6.z6, f6Var));
        m90Var.setLinkTextColor(j6.v0(j6.L6, f6Var));
        m90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(m90Var, a6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
