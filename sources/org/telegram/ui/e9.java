package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class e9 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.y8 b;
    public final ImageView c;
    public final org.telegram.ui.Cells.g6 d;
    public final org.telegram.ui.Components.wo e;
    public Drawable f;
    public Drawable h;

    public e9(Context context, int i7) {
        super(context);
        this.a = i7;
        org.telegram.ui.Cells.g6 g6Var = new org.telegram.ui.Cells.g6(context, null);
        this.d = g6Var;
        g6Var.M0 = true;
        g6Var.E0 = true;
        g6Var.setPadding(org.telegram.messenger.id.a0 ? org.telegram.messenger.g0.L(32.0f) : 0, 0, org.telegram.messenger.id.a0 ? 0 : org.telegram.messenger.g0.L(32.0f), 0);
        int L = org.telegram.messenger.g0.L(org.telegram.messenger.id.a0 ? 2.0f : -2.0f);
        int i10 = -org.telegram.messenger.g0.L(7.0f);
        g6Var.b0 = L;
        g6Var.c0 = i10;
        addView(g6Var, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(context, false);
        this.b = y8Var;
        y8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        y8Var.setStepFactor(0.4f);
        y8Var.setSize(org.telegram.messenger.g0.L(29.0f));
        y8Var.setCentered(true);
        y8Var.setVisibility(8);
        addView(y8Var, c8.ha.d(72, -1.0f, org.telegram.messenger.id.a0 ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.Wl, null, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.m6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(imageView, h02, null, M, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131752634, null));
        addView(imageView, c8.ha.d(48, 48.0f, (org.telegram.messenger.id.a0 ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context, null);
        this.e = woVar;
        CheckBoxBase checkBoxBase = woVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Vl, false);
        if (checkBoxBase.x != x02) {
            checkBoxBase.x = x02;
            checkBoxBase.b();
        }
        woVar.b(-1, org.telegram.ui.ActionBar.m6.d6, org.telegram.ui.ActionBar.m6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar, c8.ha.d(24, 24.0f, (org.telegram.messenger.id.a0 ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
