package eg;

import android.content.Context;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.j6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a0 extends j4 {
    public final j6 r;

    public a0(Context context, c6 c6Var) {
        super(context, c6Var);
        j6 j6Var = new j6(context, true, true, true);
        this.r = j6Var;
        j6Var.b(0.45f, 240L, er.h);
        j6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTextColor(g6.v0(g6.L6, c6Var));
        addView(j6Var, z5.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(g6.v0(g6.h5, c6Var));
    }
}
