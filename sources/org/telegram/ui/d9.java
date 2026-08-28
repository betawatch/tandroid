package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d9 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.c9 b;
    public final ImageView c;
    public final org.telegram.ui.Cells.h6 d;
    public final org.telegram.ui.Components.dp e;

    public d9(Context context, int i9) {
        super(context);
        this.a = i9;
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.d = h6Var;
        h6Var.I0 = true;
        h6Var.A0 = true;
        h6Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(32.0f), 0);
        int dp = AndroidUtilities.dp(LocaleController.isRTL ? 2.0f : -2.0f);
        int i10 = -AndroidUtilities.dp(7.0f);
        h6Var.U = dp;
        h6Var.V = i10;
        addView(h6Var, g7.e6.c(-1.0f, -1));
        org.telegram.ui.Components.c9 c9Var = new org.telegram.ui.Components.c9(context, false);
        this.b = c9Var;
        c9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        c9Var.setStepFactor(0.4f);
        c9Var.setSize(AndroidUtilities.dp(29.0f));
        c9Var.setCentered(true);
        c9Var.setVisibility(8);
        addView(c9Var, g7.e6.d(72, -1.0f, LocaleController.isRTL ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        addView(imageView, g7.e6.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(context, 21, null);
        this.e = dpVar;
        CheckBoxBase checkBoxBase = dpVar.getCheckBoxBase();
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.hl, false);
        if (checkBoxBase.x != w02) {
            checkBoxBase.x = w02;
            checkBoxBase.b();
        }
        dpVar.b(-1, org.telegram.ui.ActionBar.f6.d6, org.telegram.ui.ActionBar.f6.k7);
        dpVar.setDrawUnchecked(false);
        dpVar.setDrawBackgroundAsArc(3);
        addView(dpVar, g7.e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
