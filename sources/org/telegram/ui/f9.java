package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f9 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.u8 b;
    public final ImageView c;
    public final org.telegram.ui.Cells.k6 d;
    public final org.telegram.ui.Components.ep e;
    public Drawable f;
    public Drawable h;

    public f9(Context context, int i10) {
        super(context);
        this.a = i10;
        org.telegram.ui.Cells.k6 k6Var = new org.telegram.ui.Cells.k6(context, null);
        this.d = k6Var;
        k6Var.M0 = true;
        k6Var.E0 = true;
        k6Var.setPadding(org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(32.0f) : 0, 0, org.telegram.messenger.cd.X ? 0 : org.telegram.messenger.i0.L(32.0f), 0);
        int L = org.telegram.messenger.i0.L(org.telegram.messenger.cd.X ? 2.0f : -2.0f);
        int i11 = -org.telegram.messenger.i0.L(7.0f);
        k6Var.b0 = L;
        k6Var.c0 = i11;
        addView(k6Var, w7.b6.c(-1.0f, -1));
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8(context, false);
        this.b = u8Var;
        u8Var.setAvatarsTextSize(org.telegram.messenger.i0.L(18.0f));
        u8Var.setStepFactor(0.4f);
        u8Var.setSize(org.telegram.messenger.i0.L(29.0f));
        u8Var.setCentered(true);
        u8Var.setVisibility(8);
        addView(u8Var, w7.b6.d(72, -1.0f, org.telegram.messenger.cd.X ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.Wl, null, PorterDuff.Mode.SRC_IN);
        int i12 = org.telegram.ui.ActionBar.t6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(imageView, h02, null, N, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.cd.L0(2131752634, null));
        addView(imageView, w7.b6.d(48, 48.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.ep epVar = new org.telegram.ui.Components.ep(21, context, null);
        this.e = epVar;
        CheckBoxBase checkBoxBase = epVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vl, false);
        if (checkBoxBase.x != x02) {
            checkBoxBase.x = x02;
            checkBoxBase.b();
        }
        epVar.b(-1, org.telegram.ui.ActionBar.t6.d6, org.telegram.ui.ActionBar.t6.k7);
        epVar.setDrawUnchecked(false);
        epVar.setDrawBackgroundAsArc(3);
        addView(epVar, w7.b6.d(24, 24.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
