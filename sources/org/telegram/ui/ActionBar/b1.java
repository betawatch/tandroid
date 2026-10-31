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
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.ic;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class b1 extends FrameLayout implements k6 {
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
    public final p6 O;
    public Runnable P;
    public boolean Q;
    public ValueAnimator R;
    public boolean S;
    public int T;
    public float U;
    public final org.telegram.ui.Components.n5 a;
    public TextView b;
    public final ei0 c;
    public boolean d;
    public ep e;
    public ImageView f;
    public g9 h;
    public int n;
    public int r;
    public PorterDuff.Mode s;
    public int w;
    public int x;
    public int y;

    public b1(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i10) {
        if (i10 > 0) {
            ep epVar = new ep(26, getContext(), this.O);
            this.e = epVar;
            epVar.setDrawUnchecked(false);
            this.e.b(-1, -1, t6.E8);
            this.e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.n5 n5Var = this.a;
            if (i10 != 1) {
                addView(this.e, w7.b6.e(26, -1, (cd.X ? 3 : 5) | 16));
                n5Var.setPadding(cd.X ? org.telegram.messenger.i0.L(34.0f) : 0, 0, cd.X ? 0 : org.telegram.messenger.i0.L(34.0f), 0);
            } else {
                boolean z10 = cd.X;
                this.d = !z10;
                addView(this.e, w7.b6.e(26, -1, (z10 ? 5 : 3) | 16));
                n5Var.setPadding(!cd.X ? org.telegram.messenger.i0.L(34.0f) : 0, 0, !cd.X ? 0 : org.telegram.messenger.i0.L(34.0f), 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        int i10 = this.x;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
        int i11 = this.y;
        if (i11 >= 0) {
            hashSet.add(Integer.valueOf(i11));
        }
        int i12 = this.D;
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
        p6 p6Var = this.O;
        d(t6.w0(i10, p6Var), t6.w0(i11, p6Var));
        this.x = i10;
        this.y = i11;
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ActionBar.z0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b1 b1Var = b1.this;
                b1Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                int i13 = i10;
                int i14 = i12;
                b1Var.setTextColor(i0.b.f(floatValue, i13, i14));
                b1Var.setIconColor(i0.b.f(floatValue, i11, i14));
            }
        });
        this.R.addListener(new a1(this, z10, i10, i12, i11));
        this.R.setInterpolator(gr.h);
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
        ofFloat.addUpdateListener(new bg.k(this, 15));
        this.R.addListener(new eg.m(4, this, z10));
        this.R.setInterpolator(gr.h);
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

    public ep getCheckView() {
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

    public org.telegram.ui.Components.n5 getTextView() {
        return this.a;
    }

    public final void h(float f7, int i10) {
        this.U = f7;
        setSelectorColor(t6.r1(f7, t6.w0(i10, this.O)));
        this.D = i10;
        this.G = this.w;
    }

    public final void i(int i10, CharSequence charSequence) {
        j(charSequence, i10, null);
    }

    public final void j(CharSequence charSequence, int i10, Drawable drawable) {
        int L;
        int L2;
        org.telegram.ui.Components.n5 n5Var = this.a;
        n5Var.setText(charSequence);
        ei0 ei0Var = this.c;
        if (i10 == 0 && drawable == null && this.e == null) {
            this.T = 0;
            ei0Var.setVisibility(4);
            n5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.T = 0;
            ei0Var.setImageDrawable(drawable);
        } else {
            this.T = i10;
            ei0Var.setImageResource(i10);
        }
        ei0Var.setVisibility(0);
        if (this.d) {
            L = this.e != null ? org.telegram.messenger.i0.L(43.0f) : 0;
        } else {
            L = org.telegram.messenger.i0.L((i10 == 0 && drawable == null) ? 0.0f : 43.0f);
        }
        if (this.d) {
            L2 = org.telegram.messenger.i0.L((i10 == 0 && drawable == null) ? 0.0f : 43.0f);
        } else {
            L2 = this.e != null ? org.telegram.messenger.i0.L(43.0f) : 0;
        }
        n5Var.setPadding(L, 0, L2, 0);
    }

    public final void k(CharSequence charSequence, ic icVar, String str, c00 c00Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        org.telegram.ui.Components.n5 n5Var = this.a;
        n5Var.setText(charSequence);
        n5Var.setPadding((this.d && this.e == null) ? 0 : org.telegram.messenger.i0.L(43.0f), 0, (!this.d && this.e == null) ? 0 : org.telegram.messenger.i0.L(43.0f), 0);
        if (this.h == null) {
            g9 g9Var = new g9(getContext());
            this.h = g9Var;
            g9Var.setRoundRadius(org.telegram.messenger.i0.L(5.0f));
            addView(this.h, w7.b6.e(28, 28, (cd.X ? 5 : 3) | 16));
        }
        this.c.setVisibility(4);
        this.h.j(icVar, str, c00Var, tL_attachMenuBot);
    }

    public void l() {
        org.telegram.ui.Cells.y a02 = t6.a0(this.w, this.L ? this.K : 0, this.M ? this.K : 0);
        this.J = a02;
        setBackground(a02);
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
        ep epVar = this.e;
        if (epVar == null || !epVar.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.a.q);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.N), TLObject.FLAG_30));
        if (!this.Q || this.a.getLayout().getLineCount() <= 1) {
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.N + 8), TLObject.FLAG_30));
    }

    public void setAnimatedIcon(int i10) {
        this.T = 0;
        this.c.f(i10, 24, 24, null);
    }

    public void setCheckColor(int i10) {
        this.e.b(-1, -1, i10);
    }

    public void setChecked(boolean z10) {
        ep epVar = this.e;
        if (epVar == null) {
            return;
        }
        epVar.a(z10, true);
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
        g9 g9Var = this.h;
        if (g9Var != null) {
            g9Var.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i10) {
        this.N = i10;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.n5 n5Var = this.a;
        n5Var.setLines(2);
        if (z10) {
            n5Var.setTextSize(1, 14.0f);
        } else {
            this.Q = true;
        }
        n5Var.setSingleLine(false);
        n5Var.setGravity(16);
    }

    public void setRightIcon(int i10) {
        if (this.f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f.setColorFilter(this.r, PorterDuff.Mode.MULTIPLY);
            if (cd.X) {
                this.f.setScaleX(-1.0f);
            }
            addView(this.f, w7.b6.e(24, -1, (cd.X ? 3 : 5) | 16));
        }
        org.telegram.ui.Components.n5 n5Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n5Var.getLayoutParams();
        if (cd.X) {
            layoutParams.leftMargin = this.f != null ? org.telegram.messenger.i0.L(32.0f) : 0;
        } else {
            layoutParams.rightMargin = this.f != null ? org.telegram.messenger.i0.L(32.0f) : 0;
        }
        n5Var.setLayoutParams(layoutParams);
        setPadding(org.telegram.messenger.i0.L(cd.X ? 8.0f : 18.0f), 0, org.telegram.messenger.i0.L(cd.X ? 18.0f : 8.0f), 0);
        if (i10 == 0) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
            this.f.setImageResource(i10);
        }
    }

    public void setSelectorColor(int i10) {
        if (this.w != i10) {
            this.w = i10;
            if (this.J != null) {
                Drawable background = getBackground();
                org.telegram.ui.Cells.y yVar = this.J;
                if (background == yVar) {
                    t6.H1(yVar, i10, true);
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
            a7.V(this.b, t6.Oi, this.O);
            this.b.setVisibility(8);
            this.b.setTextSize(1, 13.0f);
            this.b.setPadding(cd.X ? 0 : org.telegram.messenger.i0.L(43.0f), 0, cd.X ? org.telegram.messenger.i0.L(43.0f) : 0, 0);
            addView(this.b, w7.b6.d(-2, -2.0f, (cd.X ? 5 : 3) | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if ((!isEmpty) != (this.b.getVisibility() == 0)) {
            this.b.setVisibility(isEmpty ? 8 : 0);
            org.telegram.ui.Components.n5 n5Var = this.a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) n5Var.getLayoutParams();
            layoutParams.bottomMargin = isEmpty ? 0 : org.telegram.messenger.i0.L(10.0f);
            n5Var.setLayoutParams(layoutParams);
        }
        this.b.setText(charSequence);
    }

    public void setSubtextColor(int i10) {
        TextView textView = this.b;
        if (textView != null) {
            a7.r(textView);
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

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        ei0 ei0Var;
        PorterDuff.Mode mode;
        org.telegram.ui.Components.n5 n5Var;
        try {
            int i10 = this.x;
            p6 p6Var = this.O;
            if (i10 >= 0 && this.n == this.E && (n5Var = this.a) != null && n5Var.getCurrentTextColor() == this.n) {
                int w02 = t6.w0(this.x, p6Var);
                setTextColor(w02);
                this.E = w02;
            }
            if (this.y >= 0 && this.r == this.F && (ei0Var = this.c) != null && ei0Var.getColorFilter() == this.I) {
                int w03 = t6.w0(this.y, p6Var);
                if (w03 != this.r) {
                    this.r = w03;
                    if (!this.H || (mode = this.s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, mode);
                    this.I = porterDuffColorFilter;
                    ei0Var.setColorFilter(porterDuffColorFilter);
                    ImageView imageView = this.f;
                    if (imageView != null) {
                        imageView.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                    }
                }
                this.F = w03;
            }
            int i11 = this.D;
            if (i11 < 0 || this.w != this.G) {
                return;
            }
            int r12 = t6.r1(this.U, t6.w0(i11, p6Var));
            if (r12 != this.w) {
                this.w = r12;
                Drawable background = getBackground();
                if (background == this.J && (background instanceof RippleDrawable)) {
                    ((RippleDrawable) background).setColor(ColorStateList.valueOf(r12));
                }
            }
            this.G = r12;
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public b1(Context context, p6 p6Var, boolean z10, boolean z11) {
        this(0, context, p6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.T = 0;
        this.c.setImageDrawable(drawable);
    }

    public b1(int i10, Context context, p6 p6Var, boolean z10, boolean z11) {
        super(context);
        int i11 = t6.E8;
        this.x = i11;
        int i12 = t6.F8;
        this.y = i12;
        int i13 = t6.I5;
        this.D = i13;
        this.K = 12;
        this.N = 48;
        this.U = 1.0f;
        this.O = p6Var;
        this.L = z10;
        this.M = z11;
        this.n = t6.w0(i11, p6Var);
        this.r = t6.w0(i12, p6Var);
        this.s = PorterDuff.Mode.MULTIPLY;
        int w02 = t6.w0(i13, p6Var);
        this.w = w02;
        this.E = this.n;
        this.F = this.r;
        this.G = w02;
        l();
        setPadding(org.telegram.messenger.i0.L(18.0f), 0, org.telegram.messenger.i0.L(18.0f), 0);
        ei0 ei0Var = new ei0(context);
        this.c = ei0Var;
        ei0Var.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.r, PorterDuff.Mode.SRC_IN);
        this.I = porterDuffColorFilter;
        ei0Var.setColorFilter(porterDuffColorFilter);
        addView(ei0Var, w7.b6.e(-2, 40, (cd.X ? 5 : 3) | 16));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(context);
        this.a = n5Var;
        n5Var.setLines(1);
        n5Var.setSingleLine(true);
        n5Var.setGravity(3);
        n5Var.setEllipsize(TextUtils.TruncateAt.END);
        n5Var.setTextColor(this.n);
        n5Var.setTextSize(1, 16.0f);
        addView(n5Var, w7.b6.e(-2, -2, (cd.X ? 5 : 3) | 16));
        this.d = cd.X;
        a(i10);
    }
}
