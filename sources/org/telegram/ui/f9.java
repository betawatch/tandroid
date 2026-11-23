package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f9 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.d9 b;
    public final ImageView c;
    public final org.telegram.ui.Cells.g6 d;
    public final org.telegram.ui.Components.lp e;
    public Drawable f;
    public Drawable h;

    public f9(Context context, int i7) {
        super(context);
        this.a = i7;
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, null);
        this.d = g6Var;
        g6Var.N0 = true;
        g6Var.F0 = true;
        g6Var.setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(32.0f) : 0, 0, org.telegram.messenger.gd.a0 ? 0 : org.telegram.messenger.g0.L(32.0f), 0);
        int L = org.telegram.messenger.g0.L(org.telegram.messenger.gd.a0 ? 2.0f : -2.0f);
        int i10 = -org.telegram.messenger.g0.L(7.0f);
        g6Var.c0 = L;
        g6Var.d0 = i10;
        addView(g6Var, c8.na.c(-1.0f, -1));
        org.telegram.ui.Components.d9 d9Var = new org.telegram.ui.Components.d9(context, false);
        this.b = d9Var;
        d9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        d9Var.setStepFactor(0.4f);
        d9Var.setSize(org.telegram.messenger.g0.L(29.0f));
        d9Var.setCentered(true);
        d9Var.setVisibility(8);
        addView(d9Var, c8.na.d(72, -1.0f, org.telegram.messenger.gd.a0 ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Zl, null, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.u6.j(imageView, h02, null, M, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131752622, null));
        addView(imageView, c8.na.d(48, 48.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(21, context, null);
        this.e = lpVar;
        CheckBoxBase checkBoxBase = lpVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Yl, false);
        if (checkBoxBase.x != x02) {
            checkBoxBase.x = x02;
            checkBoxBase.b();
        }
        lpVar.b(-1, org.telegram.ui.ActionBar.n6.d6, org.telegram.ui.ActionBar.n6.k7);
        lpVar.setDrawUnchecked(false);
        lpVar.setDrawBackgroundAsArc(3);
        addView(lpVar, c8.na.d(24, 24.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
