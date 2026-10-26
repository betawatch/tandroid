package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d00 extends org.telegram.ui.Cells.q4 {
    public final org.telegram.ui.Cells.y3 r;

    public d00(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(context, true, true, true, 3);
        this.r = y3Var;
        y3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        org.telegram.ui.ActionBar.f7.Z(y3Var, org.telegram.ui.ActionBar.y6.L6, u6Var);
        y3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(y3Var, org.telegram.ui.Components.gb1.h(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        org.telegram.ui.Components.gb1.c(y3Var, 0.04f, 1.2f);
    }
}
