package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class e00 extends org.telegram.ui.Cells.l4 {
    public final org.telegram.ui.Cells.t3 r;

    public e00(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, true, true, true, 3);
        this.r = t3Var;
        t3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        t3Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L6, d6Var));
        t3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(t3Var, w7.z5.a(18.0f, 22.0f, 17.0f, 22.0f, 0.0f, -1, (LocaleController.isRTL ? 3 : 5) | 48));
        w7.b6.b(t3Var, 0.04f, 1.2f);
    }
}
