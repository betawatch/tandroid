package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.k90;
import w7.y5;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class d4 extends org.telegram.ui.Cells.n4 {
    public final k90 r;

    public d4(Context context, f6 f6Var) {
        super(context, f6Var);
        k90 k90Var = new k90(context, f6Var);
        this.r = k90Var;
        k90Var.setTextSize(1, 14.0f);
        k90Var.setTextColor(j6.v0(j6.z6, f6Var));
        k90Var.setLinkTextColor(j6.v0(j6.L6, f6Var));
        k90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(k90Var, y5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
