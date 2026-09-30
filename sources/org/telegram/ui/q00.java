package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class q00 extends org.telegram.ui.Cells.m4 {
    public final org.telegram.ui.Cells.u3 r;

    public q00(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, true, 3);
        this.r = u3Var;
        u3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        u3Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L6, d6Var));
        u3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(u3Var, w7.y5.d(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        w7.a6.b(u3Var, 0.04f, 1.2f);
    }
}
