package dg;

import android.content.Context;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b0 extends m4 {
    public final j6 r;

    public b0(Context context, b6 b6Var) {
        super(context, b6Var);
        j6 j6Var = new j6(context, true, true, true);
        this.r = j6Var;
        j6Var.b(0.45f, 240L, gr.h);
        j6Var.setGravity(LocaleController.isRTL ? 3 : 5);
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setTextColor(f6.v0(f6.L6, b6Var));
        addView(j6Var, e6.d(-2, 24.0f, (LocaleController.isRTL ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        setBackgroundColor(f6.v0(f6.h5, b6Var));
    }
}
