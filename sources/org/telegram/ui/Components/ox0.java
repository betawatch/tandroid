package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ox0 extends FrameLayout {
    public static int G;
    public boolean E;
    public float F;
    public final int a;
    public float b;
    public boolean c;
    public boolean d;
    public final w9 e;
    public final ImageView f;
    public final di.h h;
    public final View n;
    public boolean r;
    public final int s;
    public SvgHelper.SvgDrawable v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public ox0(Context context, int i10) {
        super(context);
        this.a = i10;
        int i11 = G;
        G = i11 + 1;
        this.s = i11;
        if (i10 == 2) {
            w9 w9Var = new w9(getContext());
            this.e = w9Var;
            w9Var.setLayerNum(1);
            w9Var.setAspectFit(false);
            w9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(w9Var, w7.a6.e(26, 26, 17));
            this.n = w9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, w7.a6.e(24, 24, 17));
            this.n = imageView;
        } else {
            w9 w9Var2 = new w9(getContext());
            this.e = w9Var2;
            w9Var2.setLayerNum(1);
            w9Var2.setAspectFit(true);
            w9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(w9Var2, w7.a6.e(26, 26, 17));
            this.n = w9Var2;
        }
        di.h hVar = new di.h(context, 23);
        this.h = hVar;
        hVar.addOnLayoutChangeListener(new n70(this, 1));
        hVar.setLines(1);
        hVar.setEllipsize(TextUtils.TruncateAt.END);
        hVar.setTextSize(1, 11.0f);
        hVar.setGravity(1);
        hVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        addView(hVar, w7.a6.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        hVar.setVisibility(8);
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
        int i11 = sm0.t0;
        float f12 = 1.0f - f7;
        view.setTranslationY((((AndroidUtilities.dp(36.0f - f10) / 2.0f) - (AndroidUtilities.dp(86.0f - f11) / 2.0f)) * f12) - (AndroidUtilities.dp(8.0f) * f7));
        view.setTranslationX(((AndroidUtilities.dp(33.0f - f10) / 2.0f) - (AndroidUtilities.dp(64.0f - f11) / 2.0f)) * f12);
        float max = Math.max(0.0f, (f7 - 0.5f) / 0.5f);
        di.h hVar = this.h;
        hVar.setAlpha(max);
        hVar.setTranslationY((-AndroidUtilities.dp(40.0f)) * f12);
        hVar.setTranslationX((-AndroidUtilities.dp(12.0f)) * f12);
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
        view.getLayoutParams().width = AndroidUtilities.dp(z10 ? f10 : f7);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z10) {
            f7 = f10;
        }
        layoutParams.height = AndroidUtilities.dp(f7);
        this.h.setVisibility(z10 ? 0 : 8);
        if (i10 == 1 || !this.w) {
            return;
        }
        this.e.setRoundRadius(AndroidUtilities.dp(view.getLayoutParams().width / 2.0f));
    }
}
