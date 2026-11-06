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
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.rz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class z0 extends FrameLayout implements a6 {
    public int D;
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
    public final f6 O;
    public Runnable P;
    public boolean Q;
    public ValueAnimator R;
    public boolean S;
    public int T;
    public float U;
    public final org.telegram.ui.Components.q5 a;
    public TextView b;
    public final ch0 c;
    public boolean d;
    public wo e;
    public ImageView f;
    public l9 h;
    public int n;
    public int r;
    public PorterDuff.Mode s;
    public int w;
    public int x;
    public int y;

    public z0(Context context, boolean z9, boolean z10) {
        this(0, context, null, z9, z10);
    }

    public final void a(int i7) {
        if (i7 > 0) {
            wo woVar = new wo(26, getContext(), this.O);
            this.e = woVar;
            woVar.setDrawUnchecked(false);
            this.e.b(-1, -1, k6.E8);
            this.e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.q5 q5Var = this.a;
            if (i7 != 1) {
                addView(this.e, ha.e(26, -1, (hd.a0 ? 3 : 5) | 16));
                q5Var.setPadding(hd.a0 ? org.telegram.messenger.g0.L(34.0f) : 0, 0, hd.a0 ? 0 : org.telegram.messenger.g0.L(34.0f), 0);
            } else {
                boolean z9 = hd.a0;
                this.d = !z9;
                addView(this.e, ha.e(26, -1, (z9 ? 5 : 3) | 16));
                q5Var.setPadding(!hd.a0 ? org.telegram.messenger.g0.L(34.0f) : 0, 0, !hd.a0 ? 0 : org.telegram.messenger.g0.L(34.0f), 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        int i7 = this.x;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
        int i10 = this.y;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
        int i11 = this.D;
        if (i11 >= 0) {
            hashSet.add(Integer.valueOf(i11));
        }
    }

    public final void b() {
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i7, int i10) {
        f6 f6Var = this.O;
        d(k6.w0(i7, f6Var), k6.w0(i10, f6Var));
        this.x = i7;
        this.y = i10;
        this.E = this.n;
        this.F = this.r;
    }

    public final void d(int i7, int i10) {
        setTextColor(i7);
        setIconColor(i10);
    }

    public final void e(final int i7, final int i10, final int i11, boolean z9) {
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S ? 1.0f : 0.0f, z9 ? 1.0f : 0.0f);
        this.R = ofFloat;
        this.S = z9;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ActionBar.x0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                z0 z0Var = z0.this;
                z0Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                int i12 = i7;
                int i13 = i11;
                z0Var.setTextColor(i0.a.f(floatValue, i12, i13));
                z0Var.setIconColor(i0.a.f(floatValue, i10, i13));
            }
        });
        this.R.addListener(new y0(this, z9, i7, i11, i10));
        this.R.setInterpolator(xq.h);
        this.R.start();
    }

    public final void f(boolean z9) {
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.S ? 1.0f : 0.0f, z9 ? 1.0f : 0.0f);
        this.R = ofFloat;
        this.S = z9;
        ofFloat.addUpdateListener(new fi.v3(this, 11));
        this.R.addListener(new ch.y(18, this, z9));
        this.R.setInterpolator(xq.h);
        this.R.start();
    }

    public final void g(int i7, PorterDuff.Mode mode) {
        if (this.r == i7 && this.s == mode) {
            return;
        }
        this.r = i7;
        this.s = mode;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
        this.I = porterDuffColorFilter;
        this.c.setColorFilter(porterDuffColorFilter);
        this.H = true;
    }

    public wo getCheckView() {
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

    public org.telegram.ui.Components.q5 getTextView() {
        return this.a;
    }

    public final void h(float f10, int i7) {
        this.U = f10;
        setSelectorColor(k6.r1(f10, k6.w0(i7, this.O)));
        this.D = i7;
        this.G = this.w;
    }

    public final void i(int i7, CharSequence charSequence) {
        j(charSequence, i7, null);
    }

    public final void j(CharSequence charSequence, int i7, Drawable drawable) {
        int L;
        int L2;
        org.telegram.ui.Components.q5 q5Var = this.a;
        q5Var.setText(charSequence);
        ch0 ch0Var = this.c;
        if (i7 == 0 && drawable == null && this.e == null) {
            this.T = 0;
            ch0Var.setVisibility(4);
            q5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.T = 0;
            ch0Var.setImageDrawable(drawable);
        } else {
            this.T = i7;
            ch0Var.setImageResource(i7);
        }
        ch0Var.setVisibility(0);
        if (this.d) {
            L = this.e != null ? org.telegram.messenger.g0.L(43.0f) : 0;
        } else {
            L = org.telegram.messenger.g0.L((i7 == 0 && drawable == null) ? 0.0f : 43.0f);
        }
        if (this.d) {
            L2 = org.telegram.messenger.g0.L((i7 == 0 && drawable == null) ? 0.0f : 43.0f);
        } else {
            L2 = this.e != null ? org.telegram.messenger.g0.L(43.0f) : 0;
        }
        q5Var.setPadding(L, 0, L2, 0);
    }

    public final void k(CharSequence charSequence, hc hcVar, String str, rz rzVar, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        org.telegram.ui.Components.q5 q5Var = this.a;
        q5Var.setText(charSequence);
        q5Var.setPadding((this.d && this.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0, (!this.d && this.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0);
        if (this.h == null) {
            l9 l9Var = new l9(getContext());
            this.h = l9Var;
            l9Var.setRoundRadius(org.telegram.messenger.g0.L(5.0f));
            addView(this.h, ha.e(28, 28, (hd.a0 ? 5 : 3) | 16));
        }
        this.c.setVisibility(4);
        this.h.j(hcVar, str, rzVar, tL_attachMenuBot);
    }

    public void l() {
        org.telegram.ui.Cells.y a02 = k6.a0(this.w, this.L ? this.K : 0, this.M ? this.K : 0);
        this.J = a02;
        setBackground(a02);
    }

    public final void m(boolean z9, boolean z10) {
        if (this.L == z9 && this.M == z10) {
            return;
        }
        this.L = z9;
        this.M = z10;
        l();
    }

    public final void n(boolean z9, boolean z10) {
        if (this.L == z9 && this.M == z10 && this.K == 12) {
            return;
        }
        this.L = z9;
        this.M = z10;
        this.K = 12;
        l();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        wo woVar = this.e;
        if (woVar == null || !woVar.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.a.q);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.N), TLObject.FLAG_30));
        if (!this.Q || this.a.getLayout().getLineCount() <= 1) {
            return;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.N + 8), TLObject.FLAG_30));
    }

    public void setAnimatedIcon(int i7) {
        this.T = 0;
        this.c.f(i7, 24, 24, null);
    }

    public void setCheckColor(int i7) {
        this.e.b(-1, -1, i7);
    }

    public void setChecked(boolean z9) {
        wo woVar = this.e;
        if (woVar == null) {
            return;
        }
        woVar.a(z9, true);
    }

    public void setEmojiCacheType(int i7) {
        this.a.setCacheType(i7);
    }

    public void setIcon(int i7) {
        this.T = i7;
        this.c.setImageResource(i7);
    }

    public void setIconColor(int i7) {
        g(i7, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i7) {
        l9 l9Var = this.h;
        if (l9Var != null) {
            l9Var.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i7) {
        this.N = i7;
    }

    public void setMultiline(boolean z9) {
        org.telegram.ui.Components.q5 q5Var = this.a;
        q5Var.setLines(2);
        if (z9) {
            q5Var.setTextSize(1, 14.0f);
        } else {
            this.Q = true;
        }
        q5Var.setSingleLine(false);
        q5Var.setGravity(16);
    }

    public void setRightIcon(int i7) {
        if (this.f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f.setColorFilter(this.r, PorterDuff.Mode.MULTIPLY);
            if (hd.a0) {
                this.f.setScaleX(-1.0f);
            }
            addView(this.f, ha.e(24, -1, (hd.a0 ? 3 : 5) | 16));
        }
        org.telegram.ui.Components.q5 q5Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
        if (hd.a0) {
            layoutParams.leftMargin = this.f != null ? org.telegram.messenger.g0.L(32.0f) : 0;
        } else {
            layoutParams.rightMargin = this.f != null ? org.telegram.messenger.g0.L(32.0f) : 0;
        }
        q5Var.setLayoutParams(layoutParams);
        setPadding(org.telegram.messenger.g0.L(hd.a0 ? 8.0f : 18.0f), 0, org.telegram.messenger.g0.L(hd.a0 ? 18.0f : 8.0f), 0);
        if (i7 == 0) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
            this.f.setImageResource(i7);
        }
    }

    public void setSelectorColor(int i7) {
        if (this.w != i7) {
            this.w = i7;
            if (this.J != null) {
                Drawable background = getBackground();
                org.telegram.ui.Cells.y yVar = this.J;
                if (background == yVar) {
                    k6.H1(yVar, i7, true);
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
            r6.V(this.b, k6.Oi, this.O);
            this.b.setVisibility(8);
            this.b.setTextSize(1, 13.0f);
            this.b.setPadding(hd.a0 ? 0 : org.telegram.messenger.g0.L(43.0f), 0, hd.a0 ? org.telegram.messenger.g0.L(43.0f) : 0, 0);
            addView(this.b, ha.d(-2, -2.0f, (hd.a0 ? 5 : 3) | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if ((!isEmpty) != (this.b.getVisibility() == 0)) {
            this.b.setVisibility(isEmpty ? 8 : 0);
            org.telegram.ui.Components.q5 q5Var = this.a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q5Var.getLayoutParams();
            layoutParams.bottomMargin = isEmpty ? 0 : org.telegram.messenger.g0.L(10.0f);
            q5Var.setLayoutParams(layoutParams);
        }
        this.b.setText(charSequence);
    }

    public void setSubtextColor(int i7) {
        TextView textView = this.b;
        if (textView != null) {
            r6.r(textView);
            this.b.setTextColor(i7);
        }
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setTextColor(int i7) {
        if (this.n != i7) {
            this.n = i7;
            this.a.setTextColor(i7);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        ch0 ch0Var;
        PorterDuff.Mode mode;
        org.telegram.ui.Components.q5 q5Var;
        try {
            int i7 = this.x;
            f6 f6Var = this.O;
            if (i7 >= 0 && this.n == this.E && (q5Var = this.a) != null && q5Var.getCurrentTextColor() == this.n) {
                int w02 = k6.w0(this.x, f6Var);
                setTextColor(w02);
                this.E = w02;
            }
            if (this.y >= 0 && this.r == this.F && (ch0Var = this.c) != null && ch0Var.getColorFilter() == this.I) {
                int w03 = k6.w0(this.y, f6Var);
                if (w03 != this.r) {
                    this.r = w03;
                    if (!this.H || (mode = this.s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, mode);
                    this.I = porterDuffColorFilter;
                    ch0Var.setColorFilter(porterDuffColorFilter);
                    ImageView imageView = this.f;
                    if (imageView != null) {
                        imageView.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                    }
                }
                this.F = w03;
            }
            int i10 = this.D;
            if (i10 < 0 || this.w != this.G) {
                return;
            }
            int r12 = k6.r1(this.U, k6.w0(i10, f6Var));
            if (r12 != this.w) {
                this.w = r12;
                Drawable background = getBackground();
                if (background == this.J && (background instanceof RippleDrawable)) {
                    ((RippleDrawable) background).setColor(ColorStateList.valueOf(r12));
                }
            }
            this.G = r12;
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public z0(Context context, f6 f6Var, boolean z9, boolean z10) {
        this(0, context, f6Var, z9, z10);
    }

    public void setIcon(Drawable drawable) {
        this.T = 0;
        this.c.setImageDrawable(drawable);
    }

    public z0(int i7, Context context, f6 f6Var, boolean z9, boolean z10) {
        super(context);
        int i10 = k6.E8;
        this.x = i10;
        int i11 = k6.F8;
        this.y = i11;
        int i12 = k6.I5;
        this.D = i12;
        this.K = 12;
        this.N = 48;
        this.U = 1.0f;
        this.O = f6Var;
        this.L = z9;
        this.M = z10;
        this.n = k6.w0(i10, f6Var);
        this.r = k6.w0(i11, f6Var);
        this.s = PorterDuff.Mode.MULTIPLY;
        int w02 = k6.w0(i12, f6Var);
        this.w = w02;
        this.E = this.n;
        this.F = this.r;
        this.G = w02;
        l();
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        ch0 ch0Var = new ch0(context);
        this.c = ch0Var;
        ch0Var.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.r, PorterDuff.Mode.SRC_IN);
        this.I = porterDuffColorFilter;
        ch0Var.setColorFilter(porterDuffColorFilter);
        addView(ch0Var, ha.e(-2, 40, (hd.a0 ? 5 : 3) | 16));
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(context);
        this.a = q5Var;
        q5Var.setLines(1);
        q5Var.setSingleLine(true);
        q5Var.setGravity(3);
        q5Var.setEllipsize(TextUtils.TruncateAt.END);
        q5Var.setTextColor(this.n);
        q5Var.setTextSize(1, 16.0f);
        addView(q5Var, ha.e(-2, -2, (hd.a0 ? 5 : 3) | 16));
        this.d = hd.a0;
        a(i7);
    }
}
