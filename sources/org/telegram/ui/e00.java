package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e00 extends org.telegram.ui.Cells.k4 {
    public final org.telegram.ui.Cells.r3 r;

    public e00(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        org.telegram.ui.Cells.r3 r3Var = new org.telegram.ui.Cells.r3(context, true, true, true, 3);
        this.r = r3Var;
        r3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        r3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L6, c6Var));
        r3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(r3Var, i7.f6.d(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        i7.h6.b(r3Var, 0.04f, 1.2f);
    }
}
