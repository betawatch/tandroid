package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i9 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.n9 b;
    public final ImageView c;
    public final org.telegram.ui.Cells.i6 d;
    public final org.telegram.ui.Components.aq e;

    public i9(Context context, int i10) {
        super(context);
        this.a = i10;
        org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
        this.d = i6Var;
        i6Var.M0 = true;
        i6Var.E0 = true;
        i6Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(32.0f), 0);
        int dp = AndroidUtilities.dp(LocaleController.isRTL ? 2.0f : -2.0f);
        int i11 = -AndroidUtilities.dp(7.0f);
        i6Var.b0 = dp;
        i6Var.c0 = i11;
        addView(i6Var, w7.a6.d(-1.0f, -1));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context, false);
        this.b = n9Var;
        n9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        n9Var.setStepFactor(0.4f);
        n9Var.setSize(AndroidUtilities.dp(29.0f));
        n9Var.setCentered(true);
        n9Var.setVisibility(8);
        addView(n9Var, w7.a6.a(-1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 72, LocaleController.isRTL ? 5 : 3));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        addView(imageView, w7.a6.a(48.0f, 8.0f, 0.0f, 8.0f, 0.0f, 48, (LocaleController.isRTL ? 3 : 5) | 16));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 21, null);
        this.e = aqVar;
        CheckBoxBase checkBoxBase = aqVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.hl, false);
        if (checkBoxBase.x != x02) {
            checkBoxBase.x = x02;
            checkBoxBase.b();
        }
        aqVar.b(-1, org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.k7);
        aqVar.setDrawUnchecked(false);
        aqVar.setDrawBackgroundAsArc(3);
        addView(aqVar, w7.a6.a(24.0f, 42.0f, 32.0f, 42.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 48));
    }
}
