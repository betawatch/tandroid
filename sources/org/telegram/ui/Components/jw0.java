package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jw0 extends FrameLayout {
    public static int G;
    public float D;
    public boolean E;
    public float F;
    public final int a;
    public float b;
    public boolean c;
    public boolean d;
    public final g9 e;
    public final ImageView f;
    public final ag.j3 h;
    public final View n;
    public boolean r;
    public final int s;
    public org.telegram.messenger.c00 w;
    public boolean x;
    public ValueAnimator y;

    public jw0(Context context, int i10) {
        super(context);
        this.a = i10;
        int i11 = G;
        G = i11 + 1;
        this.s = i11;
        if (i10 == 2) {
            g9 g9Var = new g9(getContext());
            this.e = g9Var;
            g9Var.setLayerNum(1);
            g9Var.setAspectFit(false);
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(6.0f));
            addView(g9Var, w7.b6.e(26, 26, 17));
            this.n = g9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, w7.b6.e(24, 24, 17));
            this.n = imageView;
        } else {
            g9 g9Var2 = new g9(getContext());
            this.e = g9Var2;
            g9Var2.setLayerNum(1);
            g9Var2.setAspectFit(true);
            g9Var2.setRoundRadius(org.telegram.messenger.i0.L(6.0f));
            addView(g9Var2, w7.b6.e(26, 26, 17));
            this.n = g9Var2;
        }
        ag.j3 j3Var = new ag.j3(context, 23);
        this.h = j3Var;
        j3Var.addOnLayoutChangeListener(new o60(this, 1));
        j3Var.setLines(1);
        j3Var.setEllipsize(TextUtils.TruncateAt.END);
        j3Var.setTextSize(1, 11.0f);
        j3Var.setGravity(1);
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.G6, null);
        addView(j3Var, w7.b6.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        j3Var.setVisibility(8);
    }

    public final void a(float f7) {
        int i10 = this.a;
        if (i10 == 2) {
            return;
        }
        boolean z10 = this.r;
        View view = this.n;
        if (!z10) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        float f10 = i10 == 1 ? 24.0f : 26.0f;
        float f11 = i10 == 1 ? 38.0f : 44.0f;
        int i11 = ul0.t0;
        float f12 = 1.0f - f7;
        view.setTranslationY((((org.telegram.messenger.i0.L(36.0f - f10) / 2.0f) - (org.telegram.messenger.i0.L(86.0f - f11) / 2.0f)) * f12) - (org.telegram.messenger.i0.L(8.0f) * f7));
        view.setTranslationX(((org.telegram.messenger.i0.L(33.0f - f10) / 2.0f) - (org.telegram.messenger.i0.L(64.0f - f11) / 2.0f)) * f12);
        float max = Math.max(0.0f, (f7 - 0.5f) / 0.5f);
        ag.j3 j3Var = this.h;
        j3Var.setAlpha(max);
        j3Var.setTranslationY((-org.telegram.messenger.i0.L(40.0f)) * f12);
        j3Var.setTranslationX((-org.telegram.messenger.i0.L(12.0f)) * f12);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        float f13 = ((f10 / f11) * f12) + f7;
        view.setScaleX(f13);
        view.setScaleY(f13);
    }

    public float getTextWidth() {
        return this.F;
    }

    public void setExpanded(boolean z10) {
        int i10 = this.a;
        if (i10 == 2) {
            return;
        }
        this.r = z10;
        float f7 = i10 == 1 ? 24.0f : 26.0f;
        float f10 = i10 == 1 ? 38.0f : 44.0f;
        View view = this.n;
        view.getLayoutParams().width = org.telegram.messenger.i0.L(z10 ? f10 : f7);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z10) {
            f7 = f10;
        }
        layoutParams.height = org.telegram.messenger.i0.L(f7);
        this.h.setVisibility(z10 ? 0 : 8);
        if (i10 == 1 || !this.x) {
            return;
        }
        this.e.setRoundRadius(org.telegram.messenger.i0.L(view.getLayoutParams().width / 2.0f));
    }
}
