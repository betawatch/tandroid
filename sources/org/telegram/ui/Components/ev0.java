package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ev0 extends FrameLayout {
    public static int H;
    public float E;
    public boolean F;
    public float G;
    public final int a;
    public float b;
    public boolean c;
    public boolean d;
    public final k9 e;
    public final ImageView f;
    public final ci.ec h;
    public final View n;
    public boolean r;
    public final int s;
    public org.telegram.messenger.jz w;
    public boolean x;
    public ValueAnimator y;

    public ev0(Context context, int i3) {
        super(context);
        this.a = i3;
        int i10 = H;
        H = i10 + 1;
        this.s = i10;
        if (i3 == 2) {
            k9 k9Var = new k9(getContext());
            this.e = k9Var;
            k9Var.setLayerNum(1);
            k9Var.setAspectFit(false);
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(k9Var, b8.mf.e(26, 26, 17));
            this.n = k9Var;
        } else if (i3 == 1) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, b8.mf.e(24, 24, 17));
            this.n = imageView;
        } else {
            k9 k9Var2 = new k9(getContext());
            this.e = k9Var2;
            k9Var2.setLayerNum(1);
            k9Var2.setAspectFit(true);
            k9Var2.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
            addView(k9Var2, b8.mf.e(26, 26, 17));
            this.n = k9Var2;
        }
        ci.ec ecVar = new ci.ec(context, 26);
        this.h = ecVar;
        ecVar.addOnLayoutChangeListener(new v50(this, 1));
        ecVar.setLines(1);
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        ecVar.setTextSize(1, 11.0f);
        ecVar.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.G6, null);
        addView(ecVar, b8.mf.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        ecVar.setVisibility(8);
    }

    public final void a(float f10) {
        int i3 = this.a;
        if (i3 == 2) {
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
        float f11 = i3 == 1 ? 24.0f : 26.0f;
        float f12 = i3 == 1 ? 38.0f : 44.0f;
        int i10 = vk0.u0;
        float f13 = 1.0f - f10;
        view.setTranslationY((((org.telegram.messenger.g0.L(36.0f - f11) / 2.0f) - (org.telegram.messenger.g0.L(86.0f - f12) / 2.0f)) * f13) - (org.telegram.messenger.g0.L(8.0f) * f10));
        view.setTranslationX(((org.telegram.messenger.g0.L(33.0f - f11) / 2.0f) - (org.telegram.messenger.g0.L(64.0f - f12) / 2.0f)) * f13);
        float max = Math.max(0.0f, (f10 - 0.5f) / 0.5f);
        ci.ec ecVar = this.h;
        ecVar.setAlpha(max);
        ecVar.setTranslationY((-org.telegram.messenger.g0.L(40.0f)) * f13);
        ecVar.setTranslationX((-org.telegram.messenger.g0.L(12.0f)) * f13);
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
        int i3 = this.a;
        if (i3 == 2) {
            return;
        }
        this.r = z10;
        float f10 = i3 == 1 ? 24.0f : 26.0f;
        float f11 = i3 == 1 ? 38.0f : 44.0f;
        View view = this.n;
        view.getLayoutParams().width = org.telegram.messenger.g0.L(z10 ? f11 : f10);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z10) {
            f10 = f11;
        }
        layoutParams.height = org.telegram.messenger.g0.L(f10);
        this.h.setVisibility(z10 ? 0 : 8);
        if (i3 == 1 || !this.x) {
            return;
        }
        this.e.setRoundRadius(org.telegram.messenger.g0.L(view.getLayoutParams().width / 2.0f));
    }
}
