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
import bi.e7;
import c8.ma;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.fc;
import org.telegram.messenger.gd;
import org.telegram.messenger.lz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.q9;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public class z0 extends FrameLayout implements c6 {
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public PorterDuffColorFilter J;
    public org.telegram.ui.Cells.y K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public final i6 P;
    public Runnable Q;
    public boolean R;
    public ValueAnimator S;
    public boolean T;
    public int U;
    public float V;
    public final org.telegram.ui.Components.w5 a;
    public TextView b;
    public final ph0 c;
    public boolean d;
    public mp e;
    public ImageView f;
    public q9 h;
    public int n;
    public int r;
    public PorterDuff.Mode s;
    public int w;
    public int x;
    public int y;

    public z0(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i7) {
        if (i7 > 0) {
            mp mpVar = new mp(26, getContext(), this.P);
            this.e = mpVar;
            mpVar.setDrawUnchecked(false);
            this.e.b(-1, -1, n6.E8);
            this.e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.w5 w5Var = this.a;
            if (i7 != 1) {
                addView(this.e, ma.e(26, -1, (gd.a0 ? 3 : 5) | 16));
                w5Var.setPadding(gd.a0 ? org.telegram.messenger.g0.L(34.0f) : 0, 0, gd.a0 ? 0 : org.telegram.messenger.g0.L(34.0f), 0);
            } else {
                boolean z10 = gd.a0;
                this.d = !z10;
                addView(this.e, ma.e(26, -1, (z10 ? 5 : 3) | 16));
                w5Var.setPadding(!gd.a0 ? org.telegram.messenger.g0.L(34.0f) : 0, 0, !gd.a0 ? 0 : org.telegram.messenger.g0.L(34.0f), 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        int i7 = this.x;
        if (i7 >= 0) {
            hashSet.add(Integer.valueOf(i7));
        }
        int i10 = this.y;
        if (i10 >= 0) {
            hashSet.add(Integer.valueOf(i10));
        }
        int i11 = this.E;
        if (i11 >= 0) {
            hashSet.add(Integer.valueOf(i11));
        }
    }

    public final void b() {
        Runnable runnable = this.Q;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i7, int i10) {
        i6 i6Var = this.P;
        d(n6.w0(i7, i6Var), n6.w0(i10, i6Var));
        this.x = i7;
        this.y = i10;
        this.F = this.n;
        this.G = this.r;
    }

    public final void d(int i7, int i10) {
        setTextColor(i7);
        setIconColor(i10);
    }

    public final void e(final int i7, final int i10, final int i11, boolean z10) {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f);
        this.S = ofFloat;
        this.T = z10;
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
        this.S.addListener(new y0(this, z10, i7, i11, i10));
        this.S.setInterpolator(lr.h);
        this.S.start();
    }

    public final void f(boolean z10) {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f);
        this.S = ofFloat;
        this.T = z10;
        ofFloat.addUpdateListener(new hi.k3(this, 11));
        this.S.addListener(new e7(19, this, z10));
        this.S.setInterpolator(lr.h);
        this.S.start();
    }

    public final void g(int i7, PorterDuff.Mode mode) {
        if (this.r == i7 && this.s == mode) {
            return;
        }
        this.r = i7;
        this.s = mode;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i7, mode);
        this.J = porterDuffColorFilter;
        this.c.setColorFilter(porterDuffColorFilter);
        this.I = true;
    }

    public mp getCheckView() {
        return this.e;
    }

    public int getIconResId() {
        return this.U;
    }

    public ImageView getImageView() {
        return this.c;
    }

    public ImageView getRightIcon() {
        return this.f;
    }

    public TextView getSubtextView() {
        return this.b;
    }

    public org.telegram.ui.Components.w5 getTextView() {
        return this.a;
    }

    public final void h(float f10, int i7) {
        this.V = f10;
        setSelectorColor(n6.r1(f10, n6.w0(i7, this.P)));
        this.E = i7;
        this.H = this.w;
    }

    public final void i(int i7, CharSequence charSequence) {
        j(charSequence, i7, null);
    }

    public final void j(CharSequence charSequence, int i7, Drawable drawable) {
        int L;
        int L2;
        org.telegram.ui.Components.w5 w5Var = this.a;
        w5Var.setText(charSequence);
        ph0 ph0Var = this.c;
        if (i7 == 0 && drawable == null && this.e == null) {
            this.U = 0;
            ph0Var.setVisibility(4);
            w5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.U = 0;
            ph0Var.setImageDrawable(drawable);
        } else {
            this.U = i7;
            ph0Var.setImageResource(i7);
        }
        ph0Var.setVisibility(0);
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
        w5Var.setPadding(L, 0, L2, 0);
    }

    public final void k(CharSequence charSequence, fc fcVar, String str, lz lzVar, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        org.telegram.ui.Components.w5 w5Var = this.a;
        w5Var.setText(charSequence);
        w5Var.setPadding((this.d && this.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0, (!this.d && this.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0);
        if (this.h == null) {
            q9 q9Var = new q9(getContext());
            this.h = q9Var;
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(5.0f));
            addView(this.h, ma.e(28, 28, (gd.a0 ? 5 : 3) | 16));
        }
        this.c.setVisibility(4);
        this.h.j(fcVar, str, lzVar, tL_attachMenuBot);
    }

    public void l() {
        org.telegram.ui.Cells.y a02 = n6.a0(this.w, this.M ? this.L : 0, this.N ? this.L : 0);
        this.K = a02;
        setBackground(a02);
    }

    public final void m(boolean z10, boolean z11) {
        if (this.M == z10 && this.N == z11) {
            return;
        }
        this.M = z10;
        this.N = z11;
        l();
    }

    public final void n(boolean z10, boolean z11) {
        if (this.M == z10 && this.N == z11 && this.L == 12) {
            return;
        }
        this.M = z10;
        this.N = z11;
        this.L = 12;
        l();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        mp mpVar = this.e;
        if (mpVar == null || !mpVar.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.a.q);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.O), TLObject.FLAG_30));
        if (!this.R || this.a.getLayout().getLineCount() <= 1) {
            return;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.O + 8), TLObject.FLAG_30));
    }

    public void setAnimatedIcon(int i7) {
        this.U = 0;
        this.c.f(i7, 24, 24, null);
    }

    public void setCheckColor(int i7) {
        this.e.b(-1, -1, i7);
    }

    public void setChecked(boolean z10) {
        mp mpVar = this.e;
        if (mpVar == null) {
            return;
        }
        mpVar.a(z10, true);
    }

    public void setEmojiCacheType(int i7) {
        this.a.setCacheType(i7);
    }

    public void setIcon(int i7) {
        this.U = i7;
        this.c.setImageResource(i7);
    }

    public void setIconColor(int i7) {
        g(i7, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i7) {
        q9 q9Var = this.h;
        if (q9Var != null) {
            q9Var.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i7) {
        this.O = i7;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.w5 w5Var = this.a;
        w5Var.setLines(2);
        if (z10) {
            w5Var.setTextSize(1, 14.0f);
        } else {
            this.R = true;
        }
        w5Var.setSingleLine(false);
        w5Var.setGravity(16);
    }

    public void setRightIcon(int i7) {
        if (this.f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f.setColorFilter(this.r, PorterDuff.Mode.MULTIPLY);
            if (gd.a0) {
                this.f.setScaleX(-1.0f);
            }
            addView(this.f, ma.e(24, -1, (gd.a0 ? 3 : 5) | 16));
        }
        org.telegram.ui.Components.w5 w5Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w5Var.getLayoutParams();
        if (gd.a0) {
            layoutParams.leftMargin = this.f != null ? org.telegram.messenger.g0.L(32.0f) : 0;
        } else {
            layoutParams.rightMargin = this.f != null ? org.telegram.messenger.g0.L(32.0f) : 0;
        }
        w5Var.setLayoutParams(layoutParams);
        setPadding(org.telegram.messenger.g0.L(gd.a0 ? 8.0f : 18.0f), 0, org.telegram.messenger.g0.L(gd.a0 ? 18.0f : 8.0f), 0);
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
            if (this.K != null) {
                Drawable background = getBackground();
                org.telegram.ui.Cells.y yVar = this.K;
                if (background == yVar) {
                    n6.H1(yVar, i7, true);
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
            u6.U(this.b, n6.Ri, this.P);
            this.b.setVisibility(8);
            this.b.setTextSize(1, 13.0f);
            this.b.setPadding(gd.a0 ? 0 : org.telegram.messenger.g0.L(43.0f), 0, gd.a0 ? org.telegram.messenger.g0.L(43.0f) : 0, 0);
            addView(this.b, ma.d(-2, -2.0f, (gd.a0 ? 5 : 3) | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if ((!isEmpty) != (this.b.getVisibility() == 0)) {
            this.b.setVisibility(isEmpty ? 8 : 0);
            org.telegram.ui.Components.w5 w5Var = this.a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) w5Var.getLayoutParams();
            layoutParams.bottomMargin = isEmpty ? 0 : org.telegram.messenger.g0.L(10.0f);
            w5Var.setLayoutParams(layoutParams);
        }
        this.b.setText(charSequence);
    }

    public void setSubtextColor(int i7) {
        TextView textView = this.b;
        if (textView != null) {
            u6.q(textView);
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

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        ph0 ph0Var;
        PorterDuff.Mode mode;
        org.telegram.ui.Components.w5 w5Var;
        try {
            int i7 = this.x;
            i6 i6Var = this.P;
            if (i7 >= 0 && this.n == this.F && (w5Var = this.a) != null && w5Var.getCurrentTextColor() == this.n) {
                int w02 = n6.w0(this.x, i6Var);
                setTextColor(w02);
                this.F = w02;
            }
            if (this.y >= 0 && this.r == this.G && (ph0Var = this.c) != null && ph0Var.getColorFilter() == this.J) {
                int w03 = n6.w0(this.y, i6Var);
                if (w03 != this.r) {
                    this.r = w03;
                    if (!this.I || (mode = this.s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, mode);
                    this.J = porterDuffColorFilter;
                    ph0Var.setColorFilter(porterDuffColorFilter);
                    ImageView imageView = this.f;
                    if (imageView != null) {
                        imageView.setColorFilter(w03, PorterDuff.Mode.MULTIPLY);
                    }
                }
                this.G = w03;
            }
            int i10 = this.E;
            if (i10 < 0 || this.w != this.H) {
                return;
            }
            int r12 = n6.r1(this.V, n6.w0(i10, i6Var));
            if (r12 != this.w) {
                this.w = r12;
                Drawable background = getBackground();
                if (background == this.K && (background instanceof RippleDrawable)) {
                    ((RippleDrawable) background).setColor(ColorStateList.valueOf(r12));
                }
            }
            this.H = r12;
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public z0(Context context, i6 i6Var, boolean z10, boolean z11) {
        this(0, context, i6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.U = 0;
        this.c.setImageDrawable(drawable);
    }

    public z0(int i7, Context context, i6 i6Var, boolean z10, boolean z11) {
        super(context);
        int i10 = n6.E8;
        this.x = i10;
        int i11 = n6.F8;
        this.y = i11;
        int i12 = n6.I5;
        this.E = i12;
        this.L = 12;
        this.O = 48;
        this.V = 1.0f;
        this.P = i6Var;
        this.M = z10;
        this.N = z11;
        this.n = n6.w0(i10, i6Var);
        this.r = n6.w0(i11, i6Var);
        this.s = PorterDuff.Mode.MULTIPLY;
        int w02 = n6.w0(i12, i6Var);
        this.w = w02;
        this.F = this.n;
        this.G = this.r;
        this.H = w02;
        l();
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        ph0 ph0Var = new ph0(context);
        this.c = ph0Var;
        ph0Var.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.r, PorterDuff.Mode.SRC_IN);
        this.J = porterDuffColorFilter;
        ph0Var.setColorFilter(porterDuffColorFilter);
        addView(ph0Var, ma.e(-2, 40, (gd.a0 ? 5 : 3) | 16));
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(context);
        this.a = w5Var;
        w5Var.setLines(1);
        w5Var.setSingleLine(true);
        w5Var.setGravity(3);
        w5Var.setEllipsize(TextUtils.TruncateAt.END);
        w5Var.setTextColor(this.n);
        w5Var.setTextSize(1, 16.0f);
        addView(w5Var, ma.e(-2, -2, (gd.a0 ? 5 : 3) | 16));
        this.d = gd.a0;
        a(i7);
    }
}
