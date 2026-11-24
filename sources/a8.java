// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class a8 extends FrameLayout implements vlb {
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public PorterDuffColorFilter J;
    public fg0 K;
    public byte L;
    public boolean M;
    public boolean N;
    public int O;
    public final ylb P;
    public Runnable Q;
    public boolean R;
    public ValueAnimator S;
    public boolean T;
    public int U;
    public float V;
    public final fn a;
    public TextView b;
    public final s09 c;
    public boolean d;
    public jh2 e;
    public ImageView f;
    public bf0 h;
    public int n;
    public int r;
    public PorterDuff.Mode s;
    public int w;
    public int x;
    public int y;

    public a8(int i, ylb ylbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i2 = cmb.D8;
        this.x = i2;
        int i3 = cmb.E8;
        this.y = i3;
        int i4 = cmb.H5;
        this.E = i4;
        this.L = (byte) 12;
        this.O = 48;
        this.V = 1.0f;
        this.P = ylbVar;
        this.M = z;
        this.N = z2;
        this.n = cmb.v0(i2, ylbVar);
        this.r = cmb.v0(i3, ylbVar);
        this.s = PorterDuff.Mode.MULTIPLY;
        int v0 = cmb.v0(i4, ylbVar);
        this.w = v0;
        this.F = this.n;
        this.G = this.r;
        this.H = v0;
        l();
        setPadding(gm.L(18.0f), 0, gm.L(18.0f), 0);
        s09 s09Var = new s09(context);
        this.c = s09Var;
        s09Var.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.r, PorterDuff.Mode.SRC_IN);
        this.J = porterDuffColorFilter;
        s09Var.setColorFilter(porterDuffColorFilter);
        addView(s09Var, qoe.e(-2, 40, (jb6.a0 ? 5 : 3) | 16));
        fn fnVar = new fn(context);
        this.a = fnVar;
        fnVar.setLines(1);
        fnVar.setSingleLine(true);
        fnVar.setGravity(3);
        fnVar.setEllipsize(TextUtils.TruncateAt.END);
        fnVar.setTextColor(this.n);
        fnVar.setTextSize(1, 16.0f);
        addView(fnVar, qoe.e(-2, -2, (jb6.a0 ? 5 : 3) | 16));
        this.d = jb6.a0;
        a(i);
    }

    public final void a(int i) {
        if (i > 0) {
            jh2 jh2Var = new jh2(26, this.P, getContext());
            this.e = jh2Var;
            jh2Var.setDrawUnchecked(false);
            this.e.b(-1, -1, cmb.D8);
            this.e.setDrawBackgroundAsArc(-1);
            fn fnVar = this.a;
            if (i != 1) {
                addView(this.e, qoe.e(26, -1, (jb6.a0 ? 3 : 5) | 16));
                fnVar.setPadding(jb6.a0 ? gm.L(34.0f) : 0, 0, jb6.a0 ? 0 : gm.L(34.0f), 0);
            } else {
                boolean z = jb6.a0;
                this.d = !z;
                addView(this.e, qoe.e(26, -1, (z ? 5 : 3) | 16));
                fnVar.setPadding(!jb6.a0 ? gm.L(34.0f) : 0, 0, !jb6.a0 ? 0 : gm.L(34.0f), 0);
            }
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        int i = this.x;
        if (i >= 0) {
            hashSet.add(Integer.valueOf(i));
        }
        int i2 = this.y;
        if (i2 >= 0) {
            hashSet.add(Integer.valueOf(i2));
        }
        int i3 = this.E;
        if (i3 >= 0) {
            hashSet.add(Integer.valueOf(i3));
        }
    }

    public final void b() {
        Runnable runnable = this.Q;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void c(int i, int i2) {
        ylb ylbVar = this.P;
        d(cmb.v0(i, ylbVar), cmb.v0(i2, ylbVar));
        this.x = i;
        this.y = i2;
        this.F = this.n;
        this.G = this.r;
    }

    public final void d(int i, int i2) {
        setTextColor(i);
        setIconColor(i2);
    }

    public final void e(final int i, final int i2, final int i3, boolean z) {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T ? 1.0f : 0.0f, z ? 1.0f : 0.0f);
        this.S = ofFloat;
        this.T = z;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: x7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                int i4 = i;
                int i5 = i3;
                int f = on2.f(floatValue, i4, i5);
                a8 a8Var = a8.this;
                a8Var.setTextColor(f);
                a8Var.setIconColor(on2.f(floatValue, i2, i5));
            }
        });
        this.S.addListener(new z7(this, z, i, i3, i2));
        this.S.setInterpolator(d53.h);
        this.S.start();
    }

    public final void f(boolean z) {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T ? 1.0f : 0.0f, z ? 1.0f : 0.0f);
        this.S = ofFloat;
        this.T = z;
        ofFloat.addUpdateListener(new f0(this, (byte) 2));
        this.S.addListener(new y7((byte) 0, (Object) this, z));
        this.S.setInterpolator(d53.h);
        this.S.start();
    }

    public final void g(int i, PorterDuff.Mode mode) {
        if (this.r == i && this.s == mode) {
            return;
        }
        this.r = i;
        this.s = mode;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        this.J = porterDuffColorFilter;
        this.c.setColorFilter(porterDuffColorFilter);
        this.I = true;
    }

    public jh2 getCheckView() {
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

    public fn getTextView() {
        return this.a;
    }

    public final void h(float f, int i) {
        this.V = f;
        setSelectorColor(cmb.p1(f, cmb.v0(i, this.P)));
        this.E = i;
        this.H = this.w;
    }

    public final void i(int i, CharSequence charSequence) {
        j(charSequence, i, null);
    }

    public final void j(CharSequence charSequence, int i, Drawable drawable) {
        int L;
        int L2;
        fn fnVar = this.a;
        fnVar.setText(charSequence);
        s09 s09Var = this.c;
        if (i == 0 && drawable == null && this.e == null) {
            this.U = 0;
            s09Var.setVisibility(4);
            fnVar.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.U = 0;
            s09Var.setImageDrawable(drawable);
        } else {
            this.U = i;
            s09Var.setImageResource(i);
        }
        s09Var.setVisibility(0);
        if (this.d) {
            L = this.e != null ? gm.L(43.0f) : 0;
        } else {
            L = gm.L((i == 0 && drawable == null) ? 0.0f : 43.0f);
        }
        if (this.d) {
            L2 = gm.L((i == 0 && drawable == null) ? 0.0f : 43.0f);
        } else {
            L2 = this.e != null ? gm.L(43.0f) : 0;
        }
        fnVar.setPadding(L, 0, L2, 0);
    }

    public final void k(CharSequence charSequence, gn5 gn5Var, String str, meb mebVar, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        fn fnVar = this.a;
        fnVar.setText(charSequence);
        fnVar.setPadding((this.d && this.e == null) ? 0 : gm.L(43.0f), 0, (this.d || this.e != null) ? gm.L(43.0f) : 0, 0);
        if (this.h == null) {
            bf0 bf0Var = new bf0(getContext());
            this.h = bf0Var;
            bf0Var.setRoundRadius(gm.L(5.0f));
            addView(this.h, qoe.e(28, 28, (jb6.a0 ? 5 : 3) | 16));
        }
        this.c.setVisibility(4);
        this.h.m(gn5Var, str, mebVar, tL_attachMenuBot);
    }

    public void l() {
        fg0 Y = cmb.Y(this.w, this.M ? this.L : (byte) 0, this.N ? this.L : (byte) 0);
        this.K = Y;
        setBackground(Y);
    }

    public final void m(boolean z, boolean z2) {
        if (this.M == z && this.N == z2) {
            return;
        }
        this.M = z;
        this.N = z2;
        l();
    }

    public final void n(boolean z, boolean z2) {
        if (this.M == z && this.N == z2 && this.L == 12) {
            return;
        }
        this.M = z;
        this.N = z2;
        this.L = (byte) 12;
        l();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(isEnabled());
        jh2 jh2Var = this.e;
        if (jh2Var == null || !jh2Var.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.a.q);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(this.O), TLObject.FLAG_30));
        if (!this.R || this.a.getLayout().getLineCount() <= 1) {
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(this.O + 8), TLObject.FLAG_30));
    }

    public void setAnimatedIcon(int i) {
        this.U = 0;
        this.c.f(i, 24, 24, null);
    }

    public void setCheckColor(int i) {
        this.e.b(-1, -1, i);
    }

    public void setChecked(boolean z) {
        jh2 jh2Var = this.e;
        if (jh2Var == null) {
            return;
        }
        jh2Var.a(z, true);
    }

    public void setEmojiCacheType(int i) {
        this.a.setCacheType(i);
    }

    public void setIcon(Drawable drawable) {
        this.U = 0;
        this.c.setImageDrawable(drawable);
    }

    public void setIconColor(int i) {
        g(i, PorterDuff.Mode.SRC_IN);
    }

    public void setIconColorImage(int i) {
        bf0 bf0Var = this.h;
        if (bf0Var != null) {
            bf0Var.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i) {
        this.O = i;
    }

    public void setMultiline(boolean z) {
        fn fnVar = this.a;
        fnVar.setLines(2);
        if (z) {
            fnVar.setTextSize(1, 14.0f);
        } else {
            this.R = true;
        }
        fnVar.setSingleLine(false);
        fnVar.setGravity(16);
    }

    public void setRightIcon(int i) {
        if (this.f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f.setColorFilter(this.r, PorterDuff.Mode.MULTIPLY);
            if (jb6.a0) {
                this.f.setScaleX(-1.0f);
            }
            addView(this.f, qoe.e(24, -1, (jb6.a0 ? 3 : 5) | 16));
        }
        fn fnVar = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fnVar.getLayoutParams();
        boolean z = jb6.a0;
        ImageView imageView2 = this.f;
        if (z) {
            layoutParams.leftMargin = imageView2 != null ? gm.L(32.0f) : 0;
        } else {
            layoutParams.rightMargin = imageView2 != null ? gm.L(32.0f) : 0;
        }
        fnVar.setLayoutParams(layoutParams);
        setPadding(gm.L(jb6.a0 ? 8.0f : 18.0f), 0, gm.L(jb6.a0 ? 18.0f : 8.0f), 0);
        ImageView imageView3 = this.f;
        if (i == 0) {
            imageView3.setVisibility(8);
        } else {
            imageView3.setVisibility(0);
            this.f.setImageResource(i);
        }
    }

    public void setSelectorColor(int i) {
        if (this.w != i) {
            this.w = i;
            if (this.K != null) {
                Drawable background = getBackground();
                fg0 fg0Var = this.K;
                if (background == fg0Var) {
                    cmb.F1(fg0Var, i, true);
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
            anb.X(this.b, cmb.Qi, this.P);
            this.b.setVisibility(8);
            this.b.setTextSize(1, 13.0f);
            this.b.setPadding(jb6.a0 ? 0 : gm.L(43.0f), 0, jb6.a0 ? gm.L(43.0f) : 0, 0);
            addView(this.b, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if ((!isEmpty) != (this.b.getVisibility() == 0)) {
            this.b.setVisibility(isEmpty ? 8 : 0);
            fn fnVar = this.a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fnVar.getLayoutParams();
            layoutParams.bottomMargin = isEmpty ? 0 : gm.L(10.0f);
            fnVar.setLayoutParams(layoutParams);
        }
        this.b.setText(charSequence);
    }

    public void setSubtextColor(int i) {
        TextView textView = this.b;
        if (textView != null) {
            anb.q(textView);
            this.b.setTextColor(i);
        }
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setTextColor(int i) {
        if (this.n != i) {
            this.n = i;
            this.a.setTextColor(i);
        }
    }

    @Override // vlb
    public final void updateColors() {
        s09 s09Var;
        PorterDuff.Mode mode;
        fn fnVar;
        try {
            int i = this.x;
            ylb ylbVar = this.P;
            if (i >= 0 && this.n == this.F && (fnVar = this.a) != null && fnVar.getCurrentTextColor() == this.n) {
                int v0 = cmb.v0(this.x, ylbVar);
                setTextColor(v0);
                this.F = v0;
            }
            if (this.y >= 0 && this.r == this.G && (s09Var = this.c) != null && s09Var.getColorFilter() == this.J) {
                int v02 = cmb.v0(this.y, ylbVar);
                if (v02 != this.r) {
                    this.r = v02;
                    if (!this.I || (mode = this.s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, mode);
                    this.J = porterDuffColorFilter;
                    s09Var.setColorFilter(porterDuffColorFilter);
                    ImageView imageView = this.f;
                    if (imageView != null) {
                        imageView.setColorFilter(v02, PorterDuff.Mode.MULTIPLY);
                    }
                }
                this.G = v02;
            }
            int i2 = this.E;
            if (i2 < 0 || this.w != this.H) {
                return;
            }
            int p1 = cmb.p1(this.V, cmb.v0(i2, ylbVar));
            if (p1 != this.w) {
                this.w = p1;
                Drawable background = getBackground();
                if (background == this.K && (background instanceof RippleDrawable)) {
                    ((RippleDrawable) background).setColor(ColorStateList.valueOf(p1));
                }
            }
            this.H = p1;
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public void setIcon(int i) {
        this.U = i;
        this.c.setImageResource(i);
    }

    public a8(ylb ylbVar, Context context, boolean z, boolean z2) {
        this(0, ylbVar, context, z, z2);
    }

    public a8(Context context, boolean z, boolean z2) {
        this(0, null, context, z, z2);
    }
}
