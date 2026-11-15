package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e9 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.w8 b;
    public final ImageView c;
    public final org.telegram.ui.Cells.f6 d;
    public final org.telegram.ui.Components.fp e;
    public Drawable f;
    public Drawable h;

    public e9(Context context, int i7) {
        super(context);
        this.a = i7;
        org.telegram.ui.Cells.f6 f6Var = new org.telegram.ui.Cells.f6(context, null);
        this.d = f6Var;
        f6Var.N0 = true;
        f6Var.F0 = true;
        f6Var.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(32.0f) : 0, 0, org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(32.0f), 0);
        int L = org.telegram.messenger.g0.L(org.telegram.messenger.hd.a0 ? 2.0f : -2.0f);
        int i10 = -org.telegram.messenger.g0.L(7.0f);
        f6Var.c0 = L;
        f6Var.d0 = i10;
        addView(f6Var, c8.ja.c(-1.0f, -1));
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8(context, false);
        this.b = w8Var;
        w8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        w8Var.setStepFactor(0.4f);
        w8Var.setSize(org.telegram.messenger.g0.L(29.0f));
        w8Var.setCentered(true);
        w8Var.setVisibility(8);
        addView(w8Var, c8.ja.d(72, -1.0f, org.telegram.messenger.hd.a0 ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.Zl, null, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.j6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.q6.j(imageView, h02, null, M, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131752634, null));
        addView(imageView, c8.ja.d(48, 48.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.fp fpVar = new org.telegram.ui.Components.fp(21, context, null);
        this.e = fpVar;
        CheckBoxBase checkBoxBase = fpVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Yl, false);
        if (checkBoxBase.x != x02) {
            checkBoxBase.x = x02;
            checkBoxBase.b();
        }
        fpVar.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
        fpVar.setDrawUnchecked(false);
        fpVar.setDrawBackgroundAsArc(3);
        addView(fpVar, c8.ja.d(24, 24.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
