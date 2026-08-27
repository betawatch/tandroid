package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e9 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.b9 b;
    public final ImageView c;
    public final org.telegram.ui.Cells.e6 d;
    public final org.telegram.ui.Components.bp e;

    public e9(Context context, int i10) {
        super(context);
        this.a = i10;
        org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(context, null);
        this.d = e6Var;
        e6Var.I0 = true;
        e6Var.A0 = true;
        e6Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(32.0f), 0);
        int dp = AndroidUtilities.dp(LocaleController.isRTL ? 2.0f : -2.0f);
        int i11 = -AndroidUtilities.dp(7.0f);
        e6Var.U = dp;
        e6Var.V = i11;
        addView(e6Var, h7.z5.c(-1.0f, -1));
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9(context, false);
        this.b = b9Var;
        b9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        b9Var.setStepFactor(0.4f);
        b9Var.setSize(AndroidUtilities.dp(29.0f));
        b9Var.setCentered(true);
        b9Var.setVisibility(8);
        addView(b9Var, h7.z5.d(72, -1.0f, LocaleController.isRTL ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.il, false), PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), 1, -1));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        addView(imageView, h7.z5.d(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(context, 21, null);
        this.e = bpVar;
        CheckBoxBase checkBoxBase = bpVar.getCheckBoxBase();
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.hl, false);
        if (checkBoxBase.x != w02) {
            checkBoxBase.x = w02;
            checkBoxBase.b();
        }
        bpVar.b(-1, org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.k7);
        bpVar.setDrawUnchecked(false);
        bpVar.setDrawBackgroundAsArc(3);
        addView(bpVar, h7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
