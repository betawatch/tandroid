package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class g9 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.j9 b;
    public final ImageView c;
    public final org.telegram.ui.Cells.j6 d;
    public final org.telegram.ui.Components.np e;

    public g9(Context context, int i10) {
        super(context);
        this.a = i10;
        org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
        this.d = j6Var;
        j6Var.M0 = true;
        j6Var.E0 = true;
        j6Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(32.0f), 0);
        int dp = AndroidUtilities.dp(LocaleController.isRTL ? 2.0f : -2.0f);
        int i11 = -AndroidUtilities.dp(7.0f);
        j6Var.b0 = dp;
        j6Var.c0 = i11;
        addView(j6Var, w7.y5.c(-1.0f, -1));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(context, false);
        this.b = j9Var;
        j9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        j9Var.setStepFactor(0.4f);
        j9Var.setSize(AndroidUtilities.dp(29.0f));
        j9Var.setCentered(true);
        j9Var.setVisibility(8);
        addView(j9Var, w7.y5.d(72, -1.0f, LocaleController.isRTL ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        addView(imageView, w7.y5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
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
        addView(npVar, w7.y5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
