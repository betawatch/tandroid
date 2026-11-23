package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class rv0 extends FrameLayout {
    public static int H;
    public float E;
    public boolean F;
    public float G;
    public final int a;
    public float b;
    public boolean c;
    public boolean d;
    public final p9 e;
    public final ImageView f;
    public final di.xb h;
    public final View n;
    public boolean r;
    public final int s;
    public org.telegram.messenger.kz w;
    public boolean x;
    public ValueAnimator y;

    public rv0(Context context, int i7) {
        super(context);
        this.a = i7;
        int i10 = H;
        H = i10 + 1;
        this.s = i10;
        if (i7 == 2) {
            p9 p9Var = new p9(getContext());
            this.e = p9Var;
            p9Var.setLayerNum(1);
            p9Var.setAspectFit(false);
            p9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(p9Var, c8.na.e(26, 26, 17));
            this.n = p9Var;
        } else if (i7 == 1) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, c8.na.e(24, 24, 17));
            this.n = imageView;
        } else {
            p9 p9Var2 = new p9(getContext());
            this.e = p9Var2;
            p9Var2.setLayerNum(1);
            p9Var2.setAspectFit(true);
            p9Var2.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(p9Var2, c8.na.e(26, 26, 17));
            this.n = p9Var2;
        }
        di.xb xbVar = new di.xb(context, 26);
        this.h = xbVar;
        xbVar.addOnLayoutChangeListener(new l60(this, 1));
        xbVar.setLines(1);
        xbVar.setEllipsize(TextUtils.TruncateAt.END);
        xbVar.setTextSize(1, 11.0f);
        xbVar.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(xbVar, org.telegram.ui.ActionBar.n6.G6, null);
        addView(xbVar, c8.na.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
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
        int i10 = gl0.u0;
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
