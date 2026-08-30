package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class g1 extends FrameLayout {
    public int B;
    public final f6 C;
    public Runnable D;
    public boolean E;
    public ValueAnimator F;
    public boolean G;
    public int H;
    public final org.telegram.ui.Components.t5 a;
    public TextView b;
    public final jj0 c;
    public boolean d;
    public lp e;
    public ImageView f;
    public p9 h;
    public int n;
    public int r;
    public PorterDuff.Mode s;
    public int v;
    public int w;
    public boolean x;
    public boolean y;

    public g1(Context context, boolean z4, boolean z10) {
        this(0, context, null, z4, z10);
    }

    public final void a(int i10) {
        if (i10 > 0) {
            lp lpVar = new lp(getContext(), 26, this.C);
            this.e = lpVar;
            lpVar.setDrawUnchecked(false);
            this.e.b(-1, -1, j6.E8);
            this.e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.t5 t5Var = this.a;
            if (i10 != 1) {
                addView(this.e, k7.b6.e(26, -1, (LocaleController.isRTL ? 3 : 5) | 16));
                t5Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(34.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(34.0f), 0);
            } else {
                boolean z4 = LocaleController.isRTL;
                this.d = !z4;
                addView(this.e, k7.b6.e(26, -1, (z4 ? 5 : 3) | 16));
                t5Var.setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(34.0f) : 0, 0, !LocaleController.isRTL ? 0 : AndroidUtilities.dp(34.0f), 0);
            }
        }
    }

    public final void b() {
        Runnable runnable = this.D;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i10, int i11) {
        setTextColor(i10);
        setIconColor(i11);
    }

    public final void d(boolean z4) {
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G ? 1.0f : 0.0f, z4 ? 1.0f : 0.0f);
        this.F = ofFloat;
        this.G = z4;
        ofFloat.addUpdateListener(new x0(this, 1));
        this.F.addListener(new dg.w2(10, this, z4));
        this.F.setInterpolator(nr.h);
        this.F.start();
    }

    public final void e(int i10, PorterDuff.Mode mode) {
        if (this.r == i10 && this.s == mode) {
            return;
        }
        this.r = i10;
        this.s = mode;
        this.c.setColorFilter(new PorterDuffColorFilter(i10, mode));
    }

    public final void f(int i10, CharSequence charSequence) {
        g(charSequence, i10, null);
    }

    public final void g(CharSequence charSequence, int i10, Drawable drawable) {
        int dp;
        int dp2;
        org.telegram.ui.Components.t5 t5Var = this.a;
        t5Var.setText(charSequence);
        jj0 jj0Var = this.c;
        if (i10 == 0 && drawable == null && this.e == null) {
            this.H = 0;
            jj0Var.setVisibility(4);
            t5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.H = 0;
            jj0Var.setImageDrawable(drawable);
        } else {
            this.H = i10;
            jj0Var.setImageResource(i10);
        }
        jj0Var.setVisibility(0);
        if (this.d) {
            dp = this.e != null ? AndroidUtilities.dp(43.0f) : 0;
        } else {
            dp = AndroidUtilities.dp((i10 == 0 && drawable == null) ? 0.0f : 43.0f);
        }
        if (this.d) {
            dp2 = AndroidUtilities.dp((i10 == 0 && drawable == null) ? 0.0f : 43.0f);
        } else {
            dp2 = this.e != null ? AndroidUtilities.dp(43.0f) : 0;
        }
        t5Var.setPadding(dp, 0, dp2, 0);
    }

    public lp getCheckView() {
        return this.e;
    }

    public int getIconResId() {
        return this.H;
    }

    public ImageView getImageView() {
        return this.c;
    }

    public ImageView getRightIcon() {
        return this.f;
    }

    public org.telegram.ui.Components.t5 getTextView() {
        return this.a;
    }

    public final void h(CharSequence charSequence, ImageLocation imageLocation, String str, SvgHelper.SvgDrawable svgDrawable, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        org.telegram.ui.Components.t5 t5Var = this.a;
        t5Var.setText(charSequence);
        t5Var.setPadding((this.d && this.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!this.d && this.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        if (this.h == null) {
            p9 p9Var = new p9(getContext());
            this.h = p9Var;
            p9Var.setRoundRadius(AndroidUtilities.dp(5.0f));
            addView(this.h, k7.b6.e(28, 28, (LocaleController.isRTL ? 5 : 3) | 16));
        }
        this.c.setVisibility(4);
        this.h.h(imageLocation, str, svgDrawable, tL_attachMenuBot);
    }

    public void i() {
        setBackground(j6.Y(this.v, this.x ? this.w : 0, this.y ? this.w : 0));
    }

    public final void j(boolean z4, boolean z10) {
        if (this.x == z4 && this.y == z10) {
            return;
        }
        this.x = z4;
        this.y = z10;
        i();
    }

    public final void k(boolean z4, boolean z10) {
        if (this.x == z4 && this.y == z10 && this.w == 12) {
            return;
        }
        this.x = z4;
        this.y = z10;
        this.w = 12;
        i();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        lp lpVar = this.e;
        if (lpVar == null || !lpVar.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.a.q);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.B), TLObject.FLAG_30));
        if (!this.E || this.a.getLayout().getLineCount() <= 1) {
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.B + 8), TLObject.FLAG_30));
    }

    public void setAnimatedIcon(int i10) {
        this.H = 0;
        this.c.f(i10, 24, 24, null);
    }

    public void setCheckColor(int i10) {
        this.e.b(-1, -1, i10);
    }

    public void setChecked(boolean z4) {
        lp lpVar = this.e;
        if (lpVar == null) {
            return;
        }
        lpVar.a(z4, true);
    }

    public void setEmojiCacheType(int i10) {
        this.a.setCacheType(i10);
    }

    public void setIcon(int i10) {
        this.H = i10;
        this.c.setImageResource(i10);
    }

    public void setIconColor(int i10) {
        e(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i10) {
        p9 p9Var = this.h;
        if (p9Var != null) {
            p9Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i10) {
        this.B = i10;
    }

    public void setMultiline(boolean z4) {
        org.telegram.ui.Components.t5 t5Var = this.a;
        t5Var.setLines(2);
        if (z4) {
            t5Var.setTextSize(1, 14.0f);
        } else {
            this.E = true;
        }
        t5Var.setSingleLine(false);
        t5Var.setGravity(16);
    }

    public void setRightIcon(int i10) {
        if (this.f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f.setColorFilter(this.r, PorterDuff.Mode.MULTIPLY);
            if (LocaleController.isRTL) {
                this.f.setScaleX(-1.0f);
            }
            addView(this.f, k7.b6.e(24, -1, (LocaleController.isRTL ? 3 : 5) | 16));
        }
        org.telegram.ui.Components.t5 t5Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t5Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.leftMargin = this.f != null ? AndroidUtilities.dp(32.0f) : 0;
        } else {
            layoutParams.rightMargin = this.f != null ? AndroidUtilities.dp(32.0f) : 0;
        }
        t5Var.setLayoutParams(layoutParams);
        setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : 18.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : 8.0f), 0);
        if (i10 == 0) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
            this.f.setImageResource(i10);
        }
    }

    public void setSelectorColor(int i10) {
        if (this.v != i10) {
            this.v = i10;
            i();
        }
    }

    public void setSubtext(CharSequence charSequence) {
        if (this.b == null) {
            TextView textView = new TextView(getContext());
            this.b = textView;
            textView.setLines(1);
            this.b.setSingleLine(true);
            this.b.setGravity(3);
            this.b.setEllipsize(TextUtils.TruncateAt.END);
            this.b.setTextColor(j6.v0(j6.ai, this.C));
            this.b.setVisibility(8);
            this.b.setTextSize(1, 13.0f);
            this.b.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
            addView(this.b, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if ((!isEmpty) != (this.b.getVisibility() == 0)) {
            this.b.setVisibility(isEmpty ? 8 : 0);
            org.telegram.ui.Components.t5 t5Var = this.a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) t5Var.getLayoutParams();
            layoutParams.bottomMargin = isEmpty ? 0 : AndroidUtilities.dp(10.0f);
            t5Var.setLayoutParams(layoutParams);
        }
        this.b.setText(charSequence);
    }

    public void setSubtextColor(int i10) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(i10);
        }
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setTextColor(int i10) {
        if (this.n != i10) {
            this.n = i10;
            this.a.setTextColor(i10);
        }
    }

    public g1(Context context, f6 f6Var, boolean z4, boolean z10) {
        this(0, context, f6Var, z4, z10);
    }

    public void setIcon(Drawable drawable) {
        this.H = 0;
        this.c.setImageDrawable(drawable);
    }

    public g1(int i10, Context context, f6 f6Var, boolean z4, boolean z10) {
        super(context);
        this.w = 12;
        this.B = 48;
        this.C = f6Var;
        this.x = z4;
        this.y = z10;
        this.n = j6.v0(j6.E8, f6Var);
        this.r = j6.v0(j6.F8, f6Var);
        this.s = PorterDuff.Mode.MULTIPLY;
        this.v = j6.v0(j6.I5, f6Var);
        i();
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        jj0 jj0Var = new jj0(context);
        this.c = jj0Var;
        jj0Var.setScaleType(ImageView.ScaleType.CENTER);
        jj0Var.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.SRC_IN));
        addView(jj0Var, k7.b6.e(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(context);
        this.a = t5Var;
        t5Var.setLines(1);
        t5Var.setSingleLine(true);
        t5Var.setGravity(3);
        t5Var.setEllipsize(TextUtils.TruncateAt.END);
        t5Var.setTextColor(this.n);
        t5Var.setTextSize(1, 16.0f);
        addView(t5Var, k7.b6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        this.d = LocaleController.isRTL;
        a(i10);
    }
}
