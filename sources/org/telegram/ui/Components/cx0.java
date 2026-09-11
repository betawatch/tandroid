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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class cx0 extends FrameLayout {
    public static int G;
    public boolean E;
    public float F;
    public final int a;
    public float b;
    public boolean c;
    public boolean d;
    public final x9 e;
    public final ImageView f;
    public final bi.c4 h;
    public final View n;
    public boolean r;
    public final int s;
    public SvgHelper.SvgDrawable v;
    public boolean w;
    public ValueAnimator x;
    public float y;

    public cx0(Context context, int i10) {
        super(context);
        this.a = i10;
        int i11 = G;
        G = i11 + 1;
        this.s = i11;
        if (i10 == 2) {
            x9 x9Var = new x9(getContext());
            this.e = x9Var;
            x9Var.setLayerNum(1);
            x9Var.setAspectFit(false);
            x9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(x9Var, w7.x5.e(26, 26, 17));
            this.n = x9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, w7.x5.e(24, 24, 17));
            this.n = imageView;
        } else {
            x9 x9Var2 = new x9(getContext());
            this.e = x9Var2;
            x9Var2.setLayerNum(1);
            x9Var2.setAspectFit(true);
            x9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(x9Var2, w7.x5.e(26, 26, 17));
            this.n = x9Var2;
        }
        bi.c4 c4Var = new bi.c4(context, 24);
        this.h = c4Var;
        c4Var.addOnLayoutChangeListener(new e70(this, 1));
        c4Var.setLines(1);
        c4Var.setEllipsize(TextUtils.TruncateAt.END);
        c4Var.setTextSize(1, 11.0f);
        c4Var.setGravity(1);
        c4Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        addView(c4Var, w7.x5.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        c4Var.setVisibility(8);
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
        int i11 = im0.t0;
        float f12 = 1.0f - f7;
        view.setTranslationY((((AndroidUtilities.dp(36.0f - f10) / 2.0f) - (AndroidUtilities.dp(86.0f - f11) / 2.0f)) * f12) - (AndroidUtilities.dp(8.0f) * f7));
        view.setTranslationX(((AndroidUtilities.dp(33.0f - f10) / 2.0f) - (AndroidUtilities.dp(64.0f - f11) / 2.0f)) * f12);
        float max = Math.max(0.0f, (f7 - 0.5f) / 0.5f);
        bi.c4 c4Var = this.h;
        c4Var.setAlpha(max);
        c4Var.setTranslationY((-AndroidUtilities.dp(40.0f)) * f12);
        c4Var.setTranslationX((-AndroidUtilities.dp(12.0f)) * f12);
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
