package hi;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c4 extends org.telegram.ui.Cells.q4 {
    public final aa0 r;

    public c4(Context context, u6 u6Var) {
        super(context, u6Var);
        aa0 aa0Var = new aa0(context, u6Var);
        this.r = aa0Var;
        aa0Var.setTextSize(1, 14.0f);
        f7.V(aa0Var, y6.z6, u6Var);
        f7.H(aa0Var, y6.L6, u6Var);
        aa0Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(aa0Var, kb1.h(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 48, 10.0f, 14.0f, 10.0f, 0.0f));
    }
}
