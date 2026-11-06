package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class e9 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.Components.z8 b;
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
        g6Var.setPadding(org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(32.0f) : 0, 0, org.telegram.messenger.hd.a0 ? 0 : org.telegram.messenger.g0.L(32.0f), 0);
        int L = org.telegram.messenger.g0.L(org.telegram.messenger.hd.a0 ? 2.0f : -2.0f);
        int i10 = -org.telegram.messenger.g0.L(7.0f);
        g6Var.b0 = L;
        g6Var.c0 = i10;
        addView(g6Var, c8.ha.c(-1.0f, -1));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(context, false);
        this.b = z8Var;
        z8Var.setAvatarsTextSize(org.telegram.messenger.g0.L(18.0f));
        z8Var.setStepFactor(0.4f);
        z8Var.setSize(org.telegram.messenger.g0.L(29.0f));
        z8Var.setCentered(true);
        z8Var.setVisibility(8);
        addView(z8Var, c8.ha.d(72, -1.0f, org.telegram.messenger.hd.a0 ? 5 : 3, -2.0f, 0.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Wl, null, PorterDuff.Mode.SRC_IN);
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131752634, null));
        addView(imageView, c8.ha.d(48, 48.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 8.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context, null);
        this.e = woVar;
        CheckBoxBase checkBoxBase = woVar.getCheckBoxBase();
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Vl, false);
        if (checkBoxBase.x != x02) {
            checkBoxBase.x = x02;
            checkBoxBase.b();
        }
        woVar.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
        woVar.setDrawUnchecked(false);
        woVar.setDrawBackgroundAsArc(3);
        addView(woVar, c8.ha.d(24, 24.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 42.0f, 32.0f, 42.0f, 0.0f));
    }
}
