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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class vw0 extends FrameLayout {
    public static int C;
    public boolean A;
    public float B;
    public final int a;
    public float b;
    public boolean c;
    public boolean d;
    public final t9 e;
    public final ImageView f;
    public final eg.r h;
    public final View n;
    public boolean r;
    public final int s;
    public SvgHelper.SvgDrawable v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public vw0(Context context, int i10) {
        super(context);
        this.a = i10;
        int i11 = C;
        C = i11 + 1;
        this.s = i11;
        if (i10 == 2) {
            t9 t9Var = new t9(getContext());
            this.e = t9Var;
            t9Var.setLayerNum(1);
            t9Var.setAspectFit(false);
            t9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(t9Var, i7.f6.e(26, 26, 17));
            this.n = t9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, i7.f6.e(24, 24, 17));
            this.n = imageView;
        } else {
            t9 t9Var2 = new t9(getContext());
            this.e = t9Var2;
            t9Var2.setLayerNum(1);
            t9Var2.setAspectFit(true);
            t9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(t9Var2, i7.f6.e(26, 26, 17));
            this.n = t9Var2;
        }
        eg.r rVar = new eg.r(context, 23);
        this.h = rVar;
        rVar.addOnLayoutChangeListener(new a70(this, 1));
        rVar.setLines(1);
        rVar.setEllipsize(TextUtils.TruncateAt.END);
        rVar.setTextSize(1, 11.0f);
        rVar.setGravity(1);
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        addView(rVar, i7.f6.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        rVar.setVisibility(8);
    }

    public final void a(float f9) {
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
        int i11 = fm0.p0;
        float f12 = 1.0f - f9;
        view.setTranslationY((((AndroidUtilities.dp(36.0f - f10) / 2.0f) - (AndroidUtilities.dp(86.0f - f11) / 2.0f)) * f12) - (AndroidUtilities.dp(8.0f) * f9));
        view.setTranslationX(((AndroidUtilities.dp(33.0f - f10) / 2.0f) - (AndroidUtilities.dp(64.0f - f11) / 2.0f)) * f12);
        float max = Math.max(0.0f, (f9 - 0.5f) / 0.5f);
        eg.r rVar = this.h;
        rVar.setAlpha(max);
        rVar.setTranslationY((-AndroidUtilities.dp(40.0f)) * f12);
        rVar.setTranslationX((-AndroidUtilities.dp(12.0f)) * f12);
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        float f13 = ((f10 / f11) * f12) + f9;
        view.setScaleX(f13);
        view.setScaleY(f13);
    }

    public float getTextWidth() {
        return this.B;
    }

    public void setExpanded(boolean z10) {
        int i10 = this.a;
        if (i10 == 2) {
            return;
        }
        this.r = z10;
        float f9 = i10 == 1 ? 24.0f : 26.0f;
        float f10 = i10 == 1 ? 38.0f : 44.0f;
        View view = this.n;
        view.getLayoutParams().width = AndroidUtilities.dp(z10 ? f10 : f9);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (z10) {
            f9 = f10;
        }
        layoutParams.height = AndroidUtilities.dp(f9);
        this.h.setVisibility(z10 ? 0 : 8);
        if (i10 == 1 || !this.w) {
            return;
        }
        this.e.setRoundRadius(AndroidUtilities.dp(view.getLayoutParams().width / 2.0f));
    }
}
