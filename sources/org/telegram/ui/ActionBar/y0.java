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
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.ac;
import org.telegram.messenger.bd;
import org.telegram.messenger.jz;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class y0 extends FrameLayout implements z5 {
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
    public final e6 P;
    public Runnable Q;
    public boolean R;
    public ValueAnimator S;
    public boolean T;
    public int U;
    public float V;
    public final org.telegram.ui.Components.o5 a;
    public TextView b;
    public final fh0 c;
    public boolean d;
    public wo e;
    public ImageView f;
    public k9 h;
    public int n;
    public int r;
    public PorterDuff.Mode s;
    public int w;
    public int x;
    public int y;

    public y0(Context context, boolean z10, boolean z11) {
        this(0, context, null, z10, z11);
    }

    public final void a(int i3) {
        if (i3 > 0) {
            wo woVar = new wo(26, getContext(), this.P);
            this.e = woVar;
            woVar.setDrawUnchecked(false);
            this.e.b(-1, -1, k6.E8);
            this.e.setDrawBackgroundAsArc(-1);
            org.telegram.ui.Components.o5 o5Var = this.a;
            if (i3 != 1) {
                addView(this.e, mf.e(26, -1, (bd.a0 ? 3 : 5) | 16));
                o5Var.setPadding(bd.a0 ? org.telegram.messenger.g0.L(34.0f) : 0, 0, bd.a0 ? 0 : org.telegram.messenger.g0.L(34.0f), 0);
            } else {
                boolean z10 = bd.a0;
                this.d = !z10;
                addView(this.e, mf.e(26, -1, (z10 ? 5 : 3) | 16));
                o5Var.setPadding(!bd.a0 ? org.telegram.messenger.g0.L(34.0f) : 0, 0, !bd.a0 ? 0 : org.telegram.messenger.g0.L(34.0f), 0);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        int i3 = this.x;
        if (i3 >= 0) {
            hashSet.add(Integer.valueOf(i3));
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

    public final void c(int i3, int i10) {
        e6 e6Var = this.P;
        d(k6.w0(i3, e6Var), k6.w0(i10, e6Var));
        this.x = i3;
        this.y = i10;
        this.F = this.n;
        this.G = this.r;
    }

    public final void d(int i3, int i10) {
        setTextColor(i3);
        setIconColor(i10);
    }

    public final void e(final int i3, final int i10, final int i11, boolean z10) {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T ? 1.0f : 0.0f, z10 ? 1.0f : 0.0f);
        this.S = ofFloat;
        this.T = z10;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.ActionBar.w0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                y0 y0Var = y0.this;
                y0Var.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                int i12 = i3;
                int i13 = i11;
                y0Var.setTextColor(i0.a.f(floatValue, i12, i13));
                y0Var.setIconColor(i0.a.f(floatValue, i10, i13));
            }
        });
        this.S.addListener(new x0(this, z10, i3, i11, i10));
        this.S.setInterpolator(xq.h);
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
        ofFloat.addUpdateListener(new gi.j3(this, 12));
        this.S.addListener(new dh.x(18, this, z10));
        this.S.setInterpolator(xq.h);
        this.S.start();
    }

    public final void g(int i3, PorterDuff.Mode mode) {
        if (this.r == i3 && this.s == mode) {
            return;
        }
        this.r = i3;
        this.s = mode;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i3, mode);
        this.J = porterDuffColorFilter;
        this.c.setColorFilter(porterDuffColorFilter);
        this.I = true;
    }

    public wo getCheckView() {
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

    public org.telegram.ui.Components.o5 getTextView() {
        return this.a;
    }

    public final void h(float f10, int i3) {
        this.V = f10;
        setSelectorColor(k6.r1(f10, k6.w0(i3, this.P)));
        this.E = i3;
        this.H = this.w;
    }

    public final void i(int i3, CharSequence charSequence) {
        j(charSequence, i3, null);
    }

    public final void j(CharSequence charSequence, int i3, Drawable drawable) {
        int L;
        int L2;
        org.telegram.ui.Components.o5 o5Var = this.a;
        o5Var.setText(charSequence);
        fh0 fh0Var = this.c;
        if (i3 == 0 && drawable == null && this.e == null) {
            this.U = 0;
            fh0Var.setVisibility(4);
            o5Var.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.U = 0;
            fh0Var.setImageDrawable(drawable);
        } else {
            this.U = i3;
            fh0Var.setImageResource(i3);
        }
        fh0Var.setVisibility(0);
        if (this.d) {
            L = this.e != null ? org.telegram.messenger.g0.L(43.0f) : 0;
        } else {
            L = org.telegram.messenger.g0.L((i3 == 0 && drawable == null) ? 0.0f : 43.0f);
        }
        if (this.d) {
            L2 = org.telegram.messenger.g0.L((i3 == 0 && drawable == null) ? 0.0f : 43.0f);
        } else {
            L2 = this.e != null ? org.telegram.messenger.g0.L(43.0f) : 0;
        }
        o5Var.setPadding(L, 0, L2, 0);
    }

    public final void k(CharSequence charSequence, ac acVar, String str, jz jzVar, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        org.telegram.ui.Components.o5 o5Var = this.a;
        o5Var.setText(charSequence);
        o5Var.setPadding((this.d && this.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0, (!this.d && this.e == null) ? 0 : org.telegram.messenger.g0.L(43.0f), 0);
        if (this.h == null) {
            k9 k9Var = new k9(getContext());
            this.h = k9Var;
            k9Var.setRoundRadius(org.telegram.messenger.g0.L(5.0f));
            addView(this.h, mf.e(28, 28, (bd.a0 ? 5 : 3) | 16));
        }
        this.c.setVisibility(4);
        this.h.j(acVar, str, jzVar, tL_attachMenuBot);
    }

    public void l() {
        org.telegram.ui.Cells.y a02 = k6.a0(this.w, this.M ? this.L : 0, this.N ? this.L : 0);
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
        wo woVar = this.e;
        if (woVar == null || !woVar.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.a.q);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.O), TLObject.FLAG_30));
        if (!this.R || this.a.getLayout().getLineCount() <= 1) {
            return;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.O + 8), TLObject.FLAG_30));
    }

    public void setAnimatedIcon(int i3) {
        this.U = 0;
        this.c.f(i3, 24, 24, null);
    }

    public void setCheckColor(int i3) {
        this.e.b(-1, -1, i3);
    }

    public void setChecked(boolean z10) {
        wo woVar = this.e;
        if (woVar == null) {
            return;
        }
        woVar.a(z10, true);
    }

    public void setEmojiCacheType(int i3) {
        this.a.setCacheType(i3);
    }

    public void setIcon(int i3) {
        this.U = i3;
        this.c.setImageResource(i3);
    }

    public void setIconColor(int i3) {
        g(i3, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i3) {
        k9 k9Var = this.h;
        if (k9Var != null) {
            k9Var.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i3) {
        this.O = i3;
    }

    public void setMultiline(boolean z10) {
        org.telegram.ui.Components.o5 o5Var = this.a;
        o5Var.setLines(2);
        if (z10) {
            o5Var.setTextSize(1, 14.0f);
        } else {
            this.R = true;
        }
        o5Var.setSingleLine(false);
        o5Var.setGravity(16);
    }

    public void setRightIcon(int i3) {
        if (this.f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f.setColorFilter(this.r, PorterDuff.Mode.MULTIPLY);
            if (bd.a0) {
                this.f.setScaleX(-1.0f);
            }
            addView(this.f, mf.e(24, -1, (bd.a0 ? 3 : 5) | 16));
        }
        org.telegram.ui.Components.o5 o5Var = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o5Var.getLayoutParams();
        if (bd.a0) {
            layoutParams.leftMargin = this.f != null ? org.telegram.messenger.g0.L(32.0f) : 0;
        } else {
            layoutParams.rightMargin = this.f != null ? org.telegram.messenger.g0.L(32.0f) : 0;
        }
        o5Var.setLayoutParams(layoutParams);
        setPadding(org.telegram.messenger.g0.L(bd.a0 ? 8.0f : 18.0f), 0, org.telegram.messenger.g0.L(bd.a0 ? 18.0f : 8.0f), 0);
        if (i3 == 0) {
            this.f.setVisibility(8);
        } else {
            this.f.setVisibility(0);
            this.f.setImageResource(i3);
        }
    }

    public void setSelectorColor(int i3) {
        if (this.w != i3) {
            this.w = i3;
            if (this.K != null) {
                Drawable background = getBackground();
                org.telegram.ui.Cells.y yVar = this.K;
                if (background == yVar) {
                    k6.H1(yVar, i3, true);
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
            r6.V(this.b, k6.Oi, this.P);
            this.b.setVisibility(8);
            this.b.setTextSize(1, 13.0f);
            this.b.setPadding(bd.a0 ? 0 : org.telegram.messenger.g0.L(43.0f), 0, bd.a0 ? org.telegram.messenger.g0.L(43.0f) : 0, 0);
            addView(this.b, mf.d(-2, -2.0f, (bd.a0 ? 5 : 3) | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if ((!isEmpty) != (this.b.getVisibility() == 0)) {
            this.b.setVisibility(isEmpty ? 8 : 0);
            org.telegram.ui.Components.o5 o5Var = this.a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o5Var.getLayoutParams();
            layoutParams.bottomMargin = isEmpty ? 0 : org.telegram.messenger.g0.L(10.0f);
            o5Var.setLayoutParams(layoutParams);
        }
        this.b.setText(charSequence);
    }

    public void setSubtextColor(int i3) {
        TextView textView = this.b;
        if (textView != null) {
            r6.r(textView);
            this.b.setTextColor(i3);
        }
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setTextColor(int i3) {
        if (this.n != i3) {
            this.n = i3;
            this.a.setTextColor(i3);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        fh0 fh0Var;
        PorterDuff.Mode mode;
        org.telegram.ui.Components.o5 o5Var;
        try {
            int i3 = this.x;
            e6 e6Var = this.P;
            if (i3 >= 0 && this.n == this.F && (o5Var = this.a) != null && o5Var.getCurrentTextColor() == this.n) {
                int w02 = k6.w0(this.x, e6Var);
                setTextColor(w02);
                this.F = w02;
            }
            if (this.y >= 0 && this.r == this.G && (fh0Var = this.c) != null && fh0Var.getColorFilter() == this.J) {
                int w03 = k6.w0(this.y, e6Var);
                if (w03 != this.r) {
                    this.r = w03;
                    if (!this.I || (mode = this.s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(w03, mode);
                    this.J = porterDuffColorFilter;
                    fh0Var.setColorFilter(porterDuffColorFilter);
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
            int r12 = k6.r1(this.V, k6.w0(i10, e6Var));
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

    public y0(Context context, e6 e6Var, boolean z10, boolean z11) {
        this(0, context, e6Var, z10, z11);
    }

    public void setIcon(Drawable drawable) {
        this.U = 0;
        this.c.setImageDrawable(drawable);
    }

    public y0(int i3, Context context, e6 e6Var, boolean z10, boolean z11) {
        super(context);
        int i10 = k6.E8;
        this.x = i10;
        int i11 = k6.F8;
        this.y = i11;
        int i12 = k6.I5;
        this.E = i12;
        this.L = 12;
        this.O = 48;
        this.V = 1.0f;
        this.P = e6Var;
        this.M = z10;
        this.N = z11;
        this.n = k6.w0(i10, e6Var);
        this.r = k6.w0(i11, e6Var);
        this.s = PorterDuff.Mode.MULTIPLY;
        int w02 = k6.w0(i12, e6Var);
        this.w = w02;
        this.F = this.n;
        this.G = this.r;
        this.H = w02;
        l();
        setPadding(org.telegram.messenger.g0.L(18.0f), 0, org.telegram.messenger.g0.L(18.0f), 0);
        fh0 fh0Var = new fh0(context);
        this.c = fh0Var;
        fh0Var.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.r, PorterDuff.Mode.SRC_IN);
        this.J = porterDuffColorFilter;
        fh0Var.setColorFilter(porterDuffColorFilter);
        addView(fh0Var, mf.e(-2, 40, (bd.a0 ? 5 : 3) | 16));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.a = o5Var;
        o5Var.setLines(1);
        o5Var.setSingleLine(true);
        o5Var.setGravity(3);
        o5Var.setEllipsize(TextUtils.TruncateAt.END);
        o5Var.setTextColor(this.n);
        o5Var.setTextSize(1, 16.0f);
        addView(o5Var, mf.e(-2, -2, (bd.a0 ? 5 : 3) | 16));
        this.d = bd.a0;
        a(i3);
    }
}
