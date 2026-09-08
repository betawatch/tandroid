package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class f9 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.l9 b;
    public final ImageView c;
    public final org.telegram.ui.Cells.h6 d;
    public final org.telegram.ui.Components.mp e;

    public f9(Context context, int i10) {
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
        addView(h6Var, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context, false);
        this.b = l9Var;
        l9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        l9Var.setStepFactor(0.4f);
        l9Var.setSize(AndroidUtilities.dp(29.0f));
        l9Var.setCentered(true);
        l9Var.setVisibility(8);
        addView(l9Var, w7.x5.d(72, -1.0f, LocaleController.isRTL ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        addView(imageView, w7.x5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(context, 21, null);
        this.e = mpVar;
        CheckBoxBase checkBoxBase = mpVar.getCheckBoxBase();
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false);
        if (checkBoxBase.x != w02) {
            checkBoxBase.x = w02;
            checkBoxBase.b();
        }
        mpVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
        mpVar.setDrawUnchecked(false);
        mpVar.setDrawBackgroundAsArc(3);
        addView(mpVar, w7.x5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
