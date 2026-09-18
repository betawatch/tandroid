package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class h9 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.i9 b;
    public final ImageView c;
    public final org.telegram.ui.Cells.h6 d;
    public final org.telegram.ui.Components.np e;

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
        addView(h6Var, w7.x5.c(-1.0f, -1));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context, false);
        this.b = i9Var;
        i9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        i9Var.setStepFactor(0.4f);
        i9Var.setSize(AndroidUtilities.dp(29.0f));
        i9Var.setCentered(true);
        i9Var.setVisibility(8);
        addView(i9Var, w7.x5.d(72, -1.0f, LocaleController.isRTL ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        addView(imageView, w7.x5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(context, 21, null);
        this.e = npVar;
        CheckBoxBase checkBoxBase = npVar.getCheckBoxBase();
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false);
        if (checkBoxBase.x != w02) {
            checkBoxBase.x = w02;
            checkBoxBase.b();
        }
        npVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
        npVar.setDrawUnchecked(false);
        npVar.setDrawBackgroundAsArc(3);
        addView(npVar, w7.x5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
