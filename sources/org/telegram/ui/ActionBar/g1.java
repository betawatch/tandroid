package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class g1 extends FrameLayout implements p6 {
    public int E;
    public int F;
    public int G;
    public boolean H;
    public PorterDuffColorFilter I;
    public org.telegram.ui.Cells.y J;
    public int K;
    public boolean L;
    public boolean M;
    public int N;
    public final u6 O;
    public Runnable P;
    public boolean Q;
    public ValueAnimator R;
    public boolean S;
    public int T;
    public float U;
    public final org.telegram.ui.Components.b6 a;
    public TextView b;
    public final bk0 c;
    public boolean d;
    public aq e;
    public ImageView f;
    public y9 h;
    public int n;
    public int r;
    public PorterDuff.Mode s;
    public int v;
    public int w;
    public int x;
    public int y;

    public g1(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i10) {
        if (i10 > 0) {
            aq aqVar = new aq(getContext(), 26, this.O);
            this.e = aqVar;
            aqVar.setDrawUnchecked(false);
            this.e.b(-1, -1, y6.E8);
            this.e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.b6 b6Var = this.a;
            if (i10 != 1) {
                addView(this.e, kb1.i(26, -1, (LocaleController.isRTL ? 3 : 5) | 16));
                b6Var.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(34.0f) : 0, 0, LocaleController.isRTL ? 0 : AndroidUtilities.dp(34.0f), 0);
            } else {
                boolean z10 = LocaleController.isRTL;
                this.d = !z10;
                addView(this.e, kb1.i(26, -1, (z10 ? 5 : 3) | 16));
                b6Var.setPadding(!LocaleController.isRTL ? AndroidUtilities.dp(34.0f) : 0, 0, !LocaleController.isRTL ? 0 : AndroidUtilities.dp(34.0f), 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        int i10 = this.w;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
        int i11 = this.x;
        if (i11 >= 0) {
            hashSet.add(Integer.valueOf(i11));
        }
        int i12 = this.y;
        if (i12 >= 0) {
            hashSet.add(Integer.valueOf(i12));
        }
    }

    public final void b() {
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i10, int i11) {
        u6 u6Var = this.O;
        d(y6.w0(i10, u6Var), y6.w0(i11, u6Var));
        this.w = i10;
        this.x = i11;
        this.E = this.n;
        this.F = this.r;
    }

    public final void d(int i10, int i11) {
        setTextColor(i10);
        setIconColor(i11);
    }

    public final void e(final int i10, final int i11, final int i12, boolean z10) {
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f);
        this.R = ofFloat;
        this.S = z10;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ActionBar.e1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                g1 g1Var = g1.this;
                g1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                int i13 = i10;
                int i14 = i12;
                g1Var.setTextColor(i0.a.f(floatValue, i13, i14));
                g1Var.setIconColor(i0.a.f(floatValue, i11, i14));
            }
        });
        this.R.addListener(new f1(this, z10, i10, i12, i11));
        this.R.setInterpolator(ds.h);
        this.R.start();
    }

    public final void f(boolean z10) {
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f);
        this.R = ofFloat;
        this.S = z10;
        ofFloat.addUpdateListener(new x0(this, 1));
        this.R.addListener(new bh.f0(19, this, z10));
        this.R.setInterpolator(ds.h);
        this.R.start();
    }

    public final void g(int i10, PorterDuff.Mode mode) {
        if (this.r == i10 && this.s == mode) {
            return;
        }
        this.r = i10;
        this.s = mode;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        this.I = porterDuffColorFilter;
        this.c.setColorFilter(porterDuffColorFilter);
        this.H = true;
    }

    public aq getCheckView() {
        return this.e;
    }

    public int getIconResId() {
        return this.T;
    }

    public ImageView getImageView() {
        return this.c;
    }

    public ImageView getRightIcon() {
        return this.f;
    }

    public org.telegram.ui.Components.b6 getTextView() {
        return this.a;
    }

    public final void h(float f7, int i10) {
        this.U = f7;
        setSelectorColor(y6.o1(f7, y6.w0(i10, this.O)));
        this.y = i10;
        this.G = this.v;
    }

    public final void i(int i10, CharSequence charSequence) {
        j(charSequence, i10, null);
    }

    public final void j(CharSequence charSequence, int i10, Drawable drawable) {
        int dp;
        int dp2;
        org.telegram.ui.Components.b6 b6Var = this.a;
        b6Var.setText(charSequence);
        bk0 bk0Var = this.c;
        if (i10 == 0 && drawable == null && this.e == null) {
            this.T = 0;
            bk0Var.setVisibility(4);
            b6Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.T = 0;
            bk0Var.setImageDrawable(drawable);
        } else {
            this.T = i10;
            bk0Var.setImageResource(i10);
        }
        bk0Var.setVisibility(0);
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
        b6Var.setPadding(dp, 0, dp2, 0);
    }

    public final void k(CharSequence charSequence, ImageLocation imageLocation, String str, SvgHelper.SvgDrawable svgDrawable, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        org.telegram.ui.Components.b6 b6Var = this.a;
        b6Var.setText(charSequence);
        b6Var.setPadding((this.d && this.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0, (!this.d && this.e == null) ? 0 : AndroidUtilities.dp(43.0f), 0);
        if (this.h == null) {
            y9 y9Var = new y9(getContext());
            this.h = y9Var;
            y9Var.setRoundRadius(AndroidUtilities.dp(5.0f));
            addView(this.h, kb1.i(28, 28, (LocaleController.isRTL ? 5 : 3) | 16));
        }
        this.c.setVisibility(4);
        this.h.h(imageLocation, str, svgDrawable, tL_attachMenuBot);
    }

    public void l() {
        org.telegram.ui.Cells.y Z = y6.Z(this.v, this.L ? this.K : 0, this.M ? this.K : 0);
        this.J = Z;
        setBackground(Z);
    }

    public final void m(boolean z10, boolean z11) {
        if (this.L == z10 && this.M == z11) {
            return;
        }
        this.L = z10;
        this.M = z11;
        l();
    }

    public final void n(boolean z10, boolean z11) {
        if (this.L == z10 && this.M == z11 && this.K == 12) {
            return;
        }
        this.L = z10;
        this.M = z11;
        this.K = 12;
        l();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        aq aqVar = this.e;
        if (aqVar == null || !aqVar.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.a.q);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.N), TLObject.FLAG_30));
        if (!this.Q || this.a.getLayout().getLineCount() <= 1) {
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.N + 8), TLObject.FLAG_30));
    }

    public void setAnimatedIcon(int i10) {
        this.T = 0;
        this.c.f(i10, 24, 24, null);
    }

    public void setCheckColor(int i10) {
        this.e.b(-1, -1, i10);
    }

    public void setChecked(boolean z10) {
        aq aqVar = this.e;
        if (aqVar == null) {
            return;
        }
        aqVar.a(z10, true);
    }

    public void setEmojiCacheType(int i10) {
        this.a.setCacheType(i10);
    }

    public void setIcon(int i10) {
        this.T = i10;
        this.c.setImageResource(i10);
    }

    public void setIconColor(int i10) {
        g(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i10) {
        y9 y9Var = this.h;
        if (y9Var != null) {
            y9Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i10) {
        this.N = i10;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.b6 b6Var = this.a;
        b6Var.setLines(2);
        if (z10) {
            b6Var.setTextSize(1, 14.0f);
        } else {
            this.Q = true;
        }
        b6Var.setSingleLine(false);
        b6Var.setGravity(16);
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
            addView(this.f, kb1.i(24, -1, (LocaleController.isRTL ? 3 : 5) | 16));
        }
        org.telegram.ui.Components.b6 b6Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b6Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.leftMargin = this.f != null ? AndroidUtilities.dp(32.0f) : 0;
        } else {
            layoutParams.rightMargin = this.f != null ? AndroidUtilities.dp(32.0f) : 0;
        }
        b6Var.setLayoutParams(layoutParams);
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
            if (this.J != null) {
                Drawable background = getBackground();
                org.telegram.ui.Cells.y yVar = this.J;
                if (background == yVar) {
                    y6.E1(yVar, i10, true);
                    return;
                }
            }
            l();
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
            f7.V(this.b, y6.ai, this.O);
            this.b.setVisibility(8);
            this.b.setTextSize(1, 13.0f);
            this.b.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(43.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(43.0f) : 0, 0);
            addView(this.b, kb1.h(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if ((!isEmpty) != (this.b.getVisibility() == 0)) {
            this.b.setVisibility(isEmpty ? 8 : 0);
            org.telegram.ui.Components.b6 b6Var = this.a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b6Var.getLayoutParams();
            layoutParams.bottomMargin = isEmpty ? 0 : AndroidUtilities.dp(10.0f);
            b6Var.setLayoutParams(layoutParams);
        }
        this.b.setText(charSequence);
    }

    public void setSubtextColor(int i10) {
        TextView textView = this.b;
        if (textView != null) {
            f7.r(textView);
            this.b.setTextColor(i10);
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        bk0 bk0Var;
        PorterDuff.Mode mode;
        org.telegram.ui.Components.b6 b6Var;
        try {
            int i10 = this.w;
            u6 u6Var = this.O;
            if (i10 >= 0 && this.n == this.E && (b6Var = this.a) != null && b6Var.getCurrentTextColor() == this.n) {
                int w02 = y6.w0(this.w, u6Var);
                setTextColor(w02);
                this.E = w02;
            }
            if (this.x >= 0 && this.r == this.F && (bk0Var = this.c) != null && bk0Var.getColorFilter() == this.I) {
                int w03 = y6.w0(this.x, u6Var);
                if (w03 != this.r) {
                    this.r = w03;
                    if (!this.H || (mode = this.s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, mode);
                    this.I = porterDuffColorFilter;
                    bk0Var.setColorFilter(porterDuffColorFilter);
                    ImageView imageView = this.f;
                    if (imageView != null) {
                        imageView.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                    }
                }
                this.F = w03;
            }
            int i11 = this.y;
            if (i11 < 0 || this.v != this.G) {
                return;
            }
            int o12 = y6.o1(this.U, y6.w0(i11, u6Var));
            if (o12 != this.v) {
                this.v = o12;
                Drawable background = getBackground();
                if (background == this.J && (background instanceof RippleDrawable)) {
                    ((RippleDrawable) background).setColor(ColorStateList.valueOf(o12));
                }
            }
            this.G = o12;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public g1(Context context, u6 u6Var, boolean z10, boolean z11) {
        this(0, context, u6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.T = 0;
        this.c.setImageDrawable(drawable);
    }

    public g1(int i10, Context context, u6 u6Var, boolean z10, boolean z11) {
        super(context);
        int i11 = y6.E8;
        this.w = i11;
        int i12 = y6.F8;
        this.x = i12;
        int i13 = y6.I5;
        this.y = i13;
        this.K = 12;
        this.N = 48;
        this.U = 1.0f;
        this.O = u6Var;
        this.L = z10;
        this.M = z11;
        this.n = y6.w0(i11, u6Var);
        this.r = y6.w0(i12, u6Var);
        this.s = PorterDuff.Mode.MULTIPLY;
        int w02 = y6.w0(i13, u6Var);
        this.v = w02;
        this.E = this.n;
        this.F = this.r;
        this.G = w02;
        l();
        setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        bk0 bk0Var = new bk0(context);
        this.c = bk0Var;
        bk0Var.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.r, PorterDuff.Mode.SRC_IN);
        this.I = porterDuffColorFilter;
        bk0Var.setColorFilter(porterDuffColorFilter);
        addView(bk0Var, kb1.i(-2, 40, (LocaleController.isRTL ? 5 : 3) | 16));
        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(context);
        this.a = b6Var;
        b6Var.setLines(1);
        b6Var.setSingleLine(true);
        b6Var.setGravity(3);
        b6Var.setEllipsize(TextUtils.TruncateAt.END);
        b6Var.setTextColor(this.n);
        b6Var.setTextSize(1, 16.0f);
        addView(b6Var, kb1.i(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
        this.d = LocaleController.isRTL;
        a(i10);
    }
}
