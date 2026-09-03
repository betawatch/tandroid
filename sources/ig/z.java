package ig;

import android.content.Context;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class z extends l4 {
    public final k6 r;

    public z(Context context, f6 f6Var) {
        super(context, f6Var);
        k6 k6Var = new k6(context, true, true, true);
        this.r = k6Var;
        k6Var.b(0.45f, 240L, mr.h);
        k6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setTextColor(j6.v0(j6.L6, f6Var));
        addView(k6Var, b6.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(j6.v0(j6.h5, f6Var));
    }
}
