package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c00 extends org.telegram.ui.Cells.m4 {
    public final org.telegram.ui.Cells.u3 r;

    public c00(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        org.telegram.ui.Cells.u3 u3Var = new org.telegram.ui.Cells.u3(context, true, true, true, 3);
        this.r = u3Var;
        u3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        u3Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L6, b6Var));
        u3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(u3Var, g7.e6.d(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        g7.g6.b(u3Var, 0.04f, 1.2f);
    }
}
