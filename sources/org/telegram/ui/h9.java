package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class h9 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.k9 b;
    public final ImageView c;
    public final org.telegram.ui.Cells.h6 d;
    public final org.telegram.ui.Components.xp e;

    public h9(Context context, int i10) {
        super(context);
        this.a = i10;
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.d = h6Var;
        h6Var.M0 = true;
        h6Var.E0 = true;
        h6Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(32.0f), 0);
        int dp = AndroidUtilities.dp(LocaleController.isRTL ? 2.0f : -2.0f);
        int i11 = -AndroidUtilities.dp(7.0f);
        h6Var.b0 = dp;
        h6Var.c0 = i11;
        addView(h6Var, w7.z5.d(-1.0f, -1));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context, false);
        this.b = k9Var;
        k9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        k9Var.setStepFactor(0.4f);
        k9Var.setSize(AndroidUtilities.dp(29.0f));
        k9Var.setCentered(true);
        k9Var.setVisibility(8);
        addView(k9Var, w7.z5.a(-1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 72, LocaleController.isRTL ? 5 : 3));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        addView(imageView, w7.z5.a(48.0f, 8.0f, 0.0f, 8.0f, 0.0f, 48, (LocaleController.isRTL ? 3 : 5) | 16));
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(context, 21, null);
        this.e = xpVar;
        CheckBoxBase checkBoxBase = xpVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.hl, false);
        if (checkBoxBase.x != x02) {
            checkBoxBase.x = x02;
            checkBoxBase.b();
        }
        xpVar.b(-1, org.telegram.ui.ActionBar.h6.d6, org.telegram.ui.ActionBar.h6.k7);
        xpVar.setDrawUnchecked(false);
        xpVar.setDrawBackgroundAsArc(3);
        addView(xpVar, w7.z5.a(24.0f, 42.0f, 32.0f, 42.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 48));
    }
}
