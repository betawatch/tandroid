package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class j9 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.m9 b;
    public final ImageView c;
    public final org.telegram.ui.Cells.m6 d;
    public final org.telegram.ui.Components.aq e;
    public Drawable f;
    public Drawable h;

    public j9(Context context, int i10) {
        super(context);
        this.a = i10;
        org.telegram.ui.Cells.m6 m6Var = new org.telegram.ui.Cells.m6(context, null);
        this.d = m6Var;
        m6Var.M0 = true;
        m6Var.E0 = true;
        m6Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(32.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(32.0f), 0);
        int dp = AndroidUtilities.dp(LocaleController.isRTL ? 2.0f : -2.0f);
        int i11 = -AndroidUtilities.dp(7.0f);
        m6Var.b0 = dp;
        m6Var.c0 = i11;
        addView(m6Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        org.telegram.ui.Components.m9 m9Var = new org.telegram.ui.Components.m9(context, false);
        this.b = m9Var;
        m9Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
        m9Var.setStepFactor(0.4f);
        m9Var.setSize(AndroidUtilities.dp(29.0f));
        m9Var.setCentered(true);
        m9Var.setVisibility(8);
        addView(m9Var, org.telegram.ui.Components.kb1.h(72, -1.0f, LocaleController.isRTL ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.il, null, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.y6.i6;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        imageView.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(imageView, g02, null, N, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Call));
        addView(imageView, org.telegram.ui.Components.kb1.h(48, 48.0f, (LocaleController.isRTL ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 21, null);
        this.e = aqVar;
        CheckBoxBase checkBoxBase = aqVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.hl, false);
        if (checkBoxBase.x != x02) {
            checkBoxBase.x = x02;
            checkBoxBase.b();
        }
        aqVar.b(-1, org.telegram.ui.ActionBar.y6.d6, org.telegram.ui.ActionBar.y6.k7);
        aqVar.setDrawUnchecked(false);
        aqVar.setDrawBackgroundAsArc(3);
        addView(aqVar, org.telegram.ui.Components.kb1.h(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
