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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.t9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class g1 extends FrameLayout {
    public int A;
    public final c6 B;
    public Runnable C;
    public boolean D;
    public ValueAnimator E;
    public boolean F;
    public int G;
    public final org.telegram.ui.Components.x5 a;
    public TextView b;
    public final aj0 c;
    public boolean d;
    public hp e;
    public ImageView f;
    public t9 h;
    public int n;
    public int r;
    public PorterDuff.Mode s;
    public int v;
    public int w;
    public boolean x;
    public boolean y;

    public g1(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i10) {
        if (i10 > 0) {
            hp hpVar = new hp(getContext(), 26, this.B);
            this.e = hpVar;
            hpVar.setDrawUnchecked(false);
            this.e.b(-1, -1, g6.E8);
            this.e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.x5 x5Var = this.a;
            if (i10 != 1) {
                addView(this.e, i7.f6.e(26, -1, (LocaleController.isRTL ? 3 : 5) | 16));
                x5Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(34.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(34.0f), 0);
            } else {
                boolean z10 = LocaleController.isRTL;
                this.d = !z10;
                addView(this.e, i7.f6.e(26, -1, (z10 ? 5 : 3) | 16));
                x5Var.setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(34.0f) : 0, 0, !LocaleController.isRTL ? 0 : AndroidUtilities.dp(34.0f), 0);
            }
        }
    }

    public final void b() {
        Runnable runnable = this.C;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i10, int i11) {
        setTextColor(i10);
        setIconColor(i11);
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f);
        this.E = ofFloat;
        this.F = z10;
        ofFloat.addUpdateListener(new x0(this, 1));
        this.E.addListener(new bg.z2(18, this, z10));
        this.E.setInterpolator(jr.h);
        this.E.start();
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
        org.telegram.ui.Components.x5 x5Var = this.a;
        x5Var.setText(charSequence);
        aj0 aj0Var = this.c;
        if (i10 == 0 && drawable == null && this.e == null) {
            this.G = 0;
            aj0Var.setVisibility(4);
            x5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.G = 0;
            aj0Var.setImageDrawable(drawable);
        } else {
            this.G = i10;
            aj0Var.setImageResource(i10);
        }
        aj0Var.setVisibility(0);
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
        x5Var.setPadding(dp, 0, dp2, 0);
    }

    public hp getCheckView() {
        return this.e;
    }

    public int getIconResId() {
        return this.G;
    }

    public ImageView getImageView() {
        return this.c;
    }

    public ImageView getRightIcon() {
        return this.f;
    }

    public org.telegram.ui.Components.x5 getTextView() {
        return this.a;
    }

    public final void h(CharSequence charSequence, ImageLocation imageLocation, String str, SvgHelper.SvgDrawable svgDrawable, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        org.telegram.ui.Components.x5 x5Var = this.a;
        x5Var.setText(charSequence);
        x5Var.setPadding((this.d && this.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!this.d && this.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        if (this.h == null) {
            t9 t9Var = new t9(getContext());
            this.h = t9Var;
            t9Var.setRoundRadius(AndroidUtilities.dp(5.0f));
            addView(this.h, i7.f6.e(28, 28, (LocaleController.isRTL ? 5 : 3) | 16));
        }
        this.c.setVisibility(4);
        this.h.h(imageLocation, str, svgDrawable, tL_attachMenuBot);
    }

    public void i() {
        setBackground(g6.Y(this.v, this.x ? this.w : 0, this.y ? this.w : 0));
    }

    public final void j(boolean z10, boolean z11) {
        if (this.x == z10 && this.y == z11) {
            return;
        }
        this.x = z10;
        this.y = z11;
        i();
    }

    public final void k(boolean z10, boolean z11) {
        if (this.x == z10 && this.y == z11 && this.w == 12) {
            return;
        }
        this.x = z10;
        this.y = z11;
        this.w = 12;
        i();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        hp hpVar = this.e;
        if (hpVar == null || !hpVar.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.a.q);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.A), TLObject.FLAG_30));
        if (!this.D || this.a.getLayout().getLineCount() <= 1) {
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.A + 8), TLObject.FLAG_30));
    }

    public void setAnimatedIcon(int i10) {
        this.G = 0;
        this.c.f(i10, 24, 24, null);
    }

    public void setCheckColor(int i10) {
        this.e.b(-1, -1, i10);
    }

    public void setChecked(boolean z10) {
        hp hpVar = this.e;
        if (hpVar == null) {
            return;
        }
        hpVar.a(z10, true);
    }

    public void setEmojiCacheType(int i10) {
        this.a.setCacheType(i10);
    }

    public void setIcon(int i10) {
        this.G = i10;
        this.c.setImageResource(i10);
    }

    public void setIconColor(int i10) {
        e(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i10) {
        t9 t9Var = this.h;
        if (t9Var != null) {
            t9Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i10) {
        this.A = i10;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.x5 x5Var = this.a;
        x5Var.setLines(2);
        if (z10) {
            x5Var.setTextSize(1, 14.0f);
        } else {
            this.D = true;
        }
        x5Var.setSingleLine(false);
        x5Var.setGravity(16);
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
            addView(this.f, i7.f6.e(24, -1, (LocaleController.isRTL ? 3 : 5) | 16));
        }
        org.telegram.ui.Components.x5 x5Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.leftMargin = this.f != null ? AndroidUtilities.dp(32.0f) : 0;
        } else {
            layoutParams.rightMargin = this.f != null ? AndroidUtilities.dp(32.0f) : 0;
        }
        x5Var.setLayoutParams(layoutParams);
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
            this.b.setTextColor(g6.v0(g6.ai, this.B));
            this.b.setVisibility(8);
            this.b.setTextSize(1, 13.0f);
            this.b.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
            addView(this.b, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if ((!isEmpty) != (this.b.getVisibility() == 0)) {
            this.b.setVisibility(isEmpty ? 8 : 0);
            org.telegram.ui.Components.x5 x5Var = this.a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) x5Var.getLayoutParams();
            layoutParams.bottomMargin = isEmpty ? 0 : AndroidUtilities.dp(10.0f);
            x5Var.setLayoutParams(layoutParams);
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

    public g1(Context context, c6 c6Var, boolean z10, boolean z11) {
        this(0, context, c6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.G = 0;
        this.c.setImageDrawable(drawable);
    }

    public g1(int i10, Context context, c6 c6Var, boolean z10, boolean z11) {
        super(context);
        this.w = 12;
        this.A = 48;
        this.B = c6Var;
        this.x = z10;
        this.y = z11;
        this.n = g6.v0(g6.E8, c6Var);
        this.r = g6.v0(g6.F8, c6Var);
        this.s = PorterDuff.Mode.MULTIPLY;
        this.v = g6.v0(g6.I5, c6Var);
        i();
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        aj0 aj0Var = new aj0(context);
        this.c = aj0Var;
        aj0Var.setScaleType(ImageView.ScaleType.CENTER);
        aj0Var.setColorFilter(new PorterDuffColorFilter(this.r, PorterDuff.Mode.SRC_IN));
        addView(aj0Var, i7.f6.e(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.a = x5Var;
        x5Var.setLines(1);
        x5Var.setSingleLine(true);
        x5Var.setGravity(3);
        x5Var.setEllipsize(TextUtils.TruncateAt.END);
        x5Var.setTextColor(this.n);
        x5Var.setTextSize(1, 16.0f);
        addView(x5Var, i7.f6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        this.d = LocaleController.isRTL;
        a(i10);
    }
}
