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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ky0 extends FrameLayout {
    public static int G;
    public boolean E;
    public float F;
    public final int a;
    public float b;
    public boolean c;
    public boolean d;
    public final y9 e;
    public final ImageView f;
    public final bi.md h;
    public final View n;
    public boolean r;
    public final int s;
    public SvgHelper.SvgDrawable v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public ky0(Context context, int i10) {
        super(context);
        this.a = i10;
        int i11 = G;
        G = i11 + 1;
        this.s = i11;
        if (i10 == 2) {
            y9 y9Var = new y9(getContext());
            this.e = y9Var;
            y9Var.setLayerNum(1);
            y9Var.setAspectFit(false);
            y9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(y9Var, kb1.i(26, 26, 17));
            this.n = y9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, kb1.i(24, 24, 17));
            this.n = imageView;
        } else {
            y9 y9Var2 = new y9(getContext());
            this.e = y9Var2;
            y9Var2.setLayerNum(1);
            y9Var2.setAspectFit(true);
            y9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(y9Var2, kb1.i(26, 26, 17));
            this.n = y9Var2;
        }
        bi.md mdVar = new bi.md(context, 24);
        this.h = mdVar;
        mdVar.addOnLayoutChangeListener(new c80(this, 1));
        mdVar.setLines(1);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        mdVar.setTextSize(1, 11.0f);
        mdVar.setGravity(1);
        org.telegram.ui.ActionBar.f7.V(mdVar, org.telegram.ui.ActionBar.y6.G6, null);
        addView(mdVar, kb1.h(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        mdVar.setVisibility(8);
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
        int i11 = qn0.t0;
        float f12 = 1.0f - f7;
        view.setTranslationY((((AndroidUtilities.dp(36.0f - f10) / 2.0f) - (AndroidUtilities.dp(86.0f - f11) / 2.0f)) * f12) - (AndroidUtilities.dp(8.0f) * f7));
        view.setTranslationX(((AndroidUtilities.dp(33.0f - f10) / 2.0f) - (AndroidUtilities.dp(64.0f - f11) / 2.0f)) * f12);
        float max = Math.max(0.0f, (f7 - 0.5f) / 0.5f);
        bi.md mdVar = this.h;
        mdVar.setAlpha(max);
        mdVar.setTranslationY((-AndroidUtilities.dp(40.0f)) * f12);
        mdVar.setTranslationX((-AndroidUtilities.dp(12.0f)) * f12);
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
