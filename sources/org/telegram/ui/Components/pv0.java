package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class pv0 extends FrameLayout {
    public static int H;
    public float E;
    public boolean F;
    public float G;
    public final int a;
    public float b;
    public boolean c;
    public boolean d;
    public final q9 e;
    public final ImageView f;
    public final di.xb h;
    public final View n;
    public boolean r;
    public final int s;
    public org.telegram.messenger.lz w;
    public boolean x;
    public ValueAnimator y;

    public pv0(Context context, int i7) {
        super(context);
        this.a = i7;
        int i10 = H;
        H = i10 + 1;
        this.s = i10;
        if (i7 == 2) {
            q9 q9Var = new q9(getContext());
            this.e = q9Var;
            q9Var.setLayerNum(1);
            q9Var.setAspectFit(false);
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(q9Var, c8.ma.e(26, 26, 17));
            this.n = q9Var;
        } else if (i7 == 1) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, c8.ma.e(24, 24, 17));
            this.n = imageView;
        } else {
            q9 q9Var2 = new q9(getContext());
            this.e = q9Var2;
            q9Var2.setLayerNum(1);
            q9Var2.setAspectFit(true);
            q9Var2.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(q9Var2, c8.ma.e(26, 26, 17));
            this.n = q9Var2;
        }
        di.xb xbVar = new di.xb(context, 26);
        this.h = xbVar;
        xbVar.addOnLayoutChangeListener(new m60(this, 1));
        xbVar.setLines(1);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        xbVar.setTextSize(1, 11.0f);
        xbVar.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.G6, null);
        addView(xbVar, c8.ma.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        xbVar.setVisibility(8);
    }

    public final void a(float f10) {
        int i7 = this.a;
        if (i7 == 2) {
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
        float f11 = i7 == 1 ? 24.0f : 26.0f;
        float f12 = i7 == 1 ? 38.0f : 44.0f;
        int i10 = el0.u0;
        float f13 = 1.0f - f10;
        view.setTranslationY((((org.telegram.messenger.g0.L(36.0f - f11) / 2.0f) - (org.telegram.messenger.g0.L(86.0f - f12) / 2.0f)) * f13) - (org.telegram.messenger.g0.L(8.0f) * f10));
        view.setTranslationX(((org.telegram.messenger.g0.L(33.0f - f11) / 2.0f) - (org.telegram.messenger.g0.L(64.0f - f12) / 2.0f)) * f13);
        float max = Math.max(0.0f, (f10 - 0.5f) / 0.5f);
        di.xb xbVar = this.h;
        xbVar.setAlpha(max);
        xbVar.setTranslationY((-org.telegram.messenger.g0.L(40.0f)) * f13);
        xbVar.setTranslationX((-org.telegram.messenger.g0.L(12.0f)) * f13);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        float f14 = ((f11 / f12) * f13) + f10;
        view.setScaleX(f14);
        view.setScaleY(f14);
    }

    public float getTextWidth() {
        return this.G;
    }

    public void setExpanded(boolean z10) {
        int i7 = this.a;
        if (i7 == 2) {
            return;
        }
        this.r = z10;
        float f10 = i7 == 1 ? 24.0f : 26.0f;
        float f11 = i7 == 1 ? 38.0f : 44.0f;
        View view = this.n;
        view.getLayoutParams().width = org.telegram.messenger.g0.L(z10 ? f11 : f10);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z10) {
            f10 = f11;
        }
        layoutParams.height = org.telegram.messenger.g0.L(f10);
        this.h.setVisibility(z10 ? 0 : 8);
        if (i7 == 1 || !this.x) {
            return;
        }
        this.e.setRoundRadius(org.telegram.messenger.g0.L(view.getLayoutParams().width / 2.0f));
    }
}
