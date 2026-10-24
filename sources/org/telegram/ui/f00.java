package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class f00 extends org.telegram.ui.Cells.l4 {
    public final org.telegram.ui.Cells.t3 r;

    public f00(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        org.telegram.ui.Cells.t3 t3Var = new org.telegram.ui.Cells.t3(context, true, true, true, 3);
        this.r = t3Var;
        t3Var.setGravity(LocaleController.isRTL ? 3 : 5);
        org.telegram.ui.ActionBar.r6.a0(t3Var, org.telegram.ui.ActionBar.k6.L6, g6Var);
        t3Var.setTextSize(AndroidUtilities.dpf2(15.0f));
        addView(t3Var, w7.z5.d(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        w7.b6.b(t3Var, 0.04f, 1.2f);
    }
}
