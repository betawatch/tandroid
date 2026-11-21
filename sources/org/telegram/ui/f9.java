package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class f9 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.e9 b;
    public final ImageView c;
    public final org.telegram.ui.Cells.h6 d;
    public final org.telegram.ui.Components.op e;
    public Drawable f;
    public Drawable h;

    public f9(Context context, int i7) {
        super(context);
        this.a = i7;
        org.telegram.ui.Cells.h6 h6Var = new org.telegram.ui.Cells.h6(context, null);
        this.d = h6Var;
        h6Var.N0 = true;
        h6Var.F0 = true;
        h6Var.setPadding(org.telegram.messenger.gd.a0 ? org.telegram.messenger.g0.L(32.0f) : 0, 0, org.telegram.messenger.gd.a0 ? 0 : org.telegram.messenger.g0.L(32.0f), 0);
        int L = org.telegram.messenger.g0.L(org.telegram.messenger.gd.a0 ? 2.0f : -2.0f);
        int i10 = -org.telegram.messenger.g0.L(7.0f);
        h6Var.c0 = L;
        h6Var.d0 = i10;
        addView(h6Var, c8.ma.c(-1.0f, -1));
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9(context, false);
        this.b = e9Var;
        e9Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        e9Var.setStepFactor(0.4f);
        e9Var.setSize(org.telegram.messenger.g0.L(29.0f));
        e9Var.setCentered(true);
        e9Var.setVisibility(8);
        addView(e9Var, c8.ma.d(72, -1.0f, org.telegram.messenger.gd.a0 ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Zl, null, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131752622, null));
        addView(imageView, c8.ma.d(48, 48.0f, (org.telegram.messenger.gd.a0 ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(21, context, null);
        this.e = opVar;
        CheckBoxBase checkBoxBase = opVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Yl, false);
        if (checkBoxBase.x != x02) {
            checkBoxBase.x = x02;
            checkBoxBase.b();
        }
        opVar.b(-1, org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.k7);
        opVar.setDrawUnchecked(false);
        opVar.setDrawBackgroundAsArc(3);
        addView(opVar, c8.ma.d(24, 24.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
