package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class fv0 extends FrameLayout {
    public static int G;
    public float D;
    public boolean E;
    public float F;
    public final int a;
    public float b;
    public boolean c;
    public boolean d;
    public final l9 e;
    public final ImageView f;
    public final bi.md h;
    public final View n;
    public boolean r;
    public final int s;
    public org.telegram.messenger.rz w;
    public boolean x;
    public ValueAnimator y;

    public fv0(Context context, int i7) {
        super(context);
        this.a = i7;
        int i10 = G;
        G = i10 + 1;
        this.s = i10;
        if (i7 == 2) {
            l9 l9Var = new l9(getContext());
            this.e = l9Var;
            l9Var.setLayerNum(1);
            l9Var.setAspectFit(false);
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(l9Var, c8.ha.e(26, 26, 17));
            this.n = l9Var;
        } else if (i7 == 1) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, c8.ha.e(24, 24, 17));
            this.n = imageView;
        } else {
            l9 l9Var2 = new l9(getContext());
            this.e = l9Var2;
            l9Var2.setLayerNum(1);
            l9Var2.setAspectFit(true);
            l9Var2.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(l9Var2, c8.ha.e(26, 26, 17));
            this.n = l9Var2;
        }
        bi.md mdVar = new bi.md(context, 26);
        this.h = mdVar;
        mdVar.addOnLayoutChangeListener(new z50(this, 1));
        mdVar.setLines(1);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        mdVar.setTextSize(1, 11.0f);
        mdVar.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(mdVar, org.telegram.ui.ActionBar.k6.G6, null);
        addView(mdVar, c8.ha.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        mdVar.setVisibility(8);
    }

    public final void a(float f10) {
        int i7 = this.a;
        if (i7 == 2) {
            return;
        }
        boolean z9 = this.r;
        View view = this.n;
        if (!z9) {
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            return;
        }
        float f11 = i7 == 1 ? 24.0f : 26.0f;
        float f12 = i7 == 1 ? 38.0f : 44.0f;
        int i10 = rk0.t0;
        float f13 = 1.0f - f10;
        view.setTranslationY((((org.telegram.messenger.g0.L(36.0f - f11) / 2.0f) - (org.telegram.messenger.g0.L(86.0f - f12) / 2.0f)) * f13) - (org.telegram.messenger.g0.L(8.0f) * f10));
        view.setTranslationX(((org.telegram.messenger.g0.L(33.0f - f11) / 2.0f) - (org.telegram.messenger.g0.L(64.0f - f12) / 2.0f)) * f13);
        float max = Math.max(0.0f, (f10 - 0.5f) / 0.5f);
        bi.md mdVar = this.h;
        mdVar.setAlpha(max);
        mdVar.setTranslationY((-org.telegram.messenger.g0.L(40.0f)) * f13);
        mdVar.setTranslationX((-org.telegram.messenger.g0.L(12.0f)) * f13);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        float f14 = ((f11 / f12) * f13) + f10;
        view.setScaleX(f14);
        view.setScaleY(f14);
    }

    public float getTextWidth() {
        return this.F;
    }

    public void setExpanded(boolean z9) {
        int i7 = this.a;
        if (i7 == 2) {
            return;
        }
        this.r = z9;
        float f10 = i7 == 1 ? 24.0f : 26.0f;
        float f11 = i7 == 1 ? 38.0f : 44.0f;
        View view = this.n;
        view.getLayoutParams().width = org.telegram.messenger.g0.L(z9 ? f11 : f10);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z9) {
            f10 = f11;
        }
        layoutParams.height = org.telegram.messenger.g0.L(f10);
        this.h.setVisibility(z9 ? 0 : 8);
        if (i7 == 1 || !this.x) {
            return;
        }
        this.e.setRoundRadius(org.telegram.messenger.g0.L(view.getLayoutParams().width / 2.0f));
    }
}
