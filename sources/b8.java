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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class b8 extends FrameLayout implements snb {
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public PorterDuffColorFilter J;
    public hf0 K;
    public byte L;
    public boolean M;
    public boolean N;
    public int O;
    public final vnb P;
    public Runnable Q;
    public boolean R;
    public ValueAnimator S;
    public boolean T;
    public int U;
    public float V;
    public final gm a;
    public TextView b;
    public final e29 c;
    public boolean d;
    public og2 e;
    public ImageView f;
    public de0 h;
    public int n;
    public int r;
    public PorterDuff.Mode s;
    public int w;
    public int x;
    public int y;

    public b8(int i, vnb vnbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i2 = aob.E8;
        this.x = i2;
        int i3 = aob.F8;
        this.y = i3;
        int i4 = aob.I5;
        this.E = i4;
        this.L = (byte) 12;
        this.O = 48;
        this.V = 1.0f;
        this.P = vnbVar;
        this.M = z;
        this.N = z2;
        this.n = aob.v0(i2, vnbVar);
        this.r = aob.v0(i3, vnbVar);
        this.s = PorterDuff.Mode.MULTIPLY;
        int v0 = aob.v0(i4, vnbVar);
        this.w = v0;
        this.F = this.n;
        this.G = this.r;
        this.H = v0;
        l();
        setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
        e29 e29Var = new e29(context);
        this.c = e29Var;
        e29Var.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.r, PorterDuff.Mode.SRC_IN);
        this.J = porterDuffColorFilter;
        e29Var.setColorFilter(porterDuffColorFilter);
        addView(e29Var, tre.e(-2, 40, (ob6.a0 ? 5 : 3) | 16));
        gm gmVar = new gm(context);
        this.a = gmVar;
        gmVar.setLines(1);
        gmVar.setSingleLine(true);
        gmVar.setGravity(3);
        gmVar.setEllipsize(TextUtils.TruncateAt.END);
        gmVar.setTextColor(this.n);
        gmVar.setTextSize(1, 16.0f);
        addView(gmVar, tre.e(-2, -2, (ob6.a0 ? 5 : 3) | 16));
        this.d = ob6.a0;
        a(i);
    }

    public final void a(int i) {
        if (i > 0) {
            og2 og2Var = new og2(26, this.P, getContext());
            this.e = og2Var;
            og2Var.setDrawUnchecked(false);
            this.e.b(-1, -1, aob.E8);
            this.e.setDrawBackgroundAsArc(-1);
            gm gmVar = this.a;
            if (i != 1) {
                addView(this.e, tre.e(26, -1, (ob6.a0 ? 3 : 5) | 16));
                gmVar.setPadding(ob6.a0 ? hl.L(34.0f) : 0, 0, ob6.a0 ? 0 : hl.L(34.0f), 0);
            } else {
                boolean z = ob6.a0;
                this.d = !z;
                addView(this.e, tre.e(26, -1, (z ? 5 : 3) | 16));
                gmVar.setPadding(!ob6.a0 ? hl.L(34.0f) : 0, 0, !ob6.a0 ? 0 : hl.L(34.0f), 0);
            }
        }
    }

    @Override // snb
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
        vnb vnbVar = this.P;
        d(aob.v0(i, vnbVar), aob.v0(i2, vnbVar));
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
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: y7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                int i4 = i;
                int i5 = i3;
                int f = vm2.f(floatValue, i4, i5);
                b8 b8Var = b8.this;
                b8Var.setTextColor(f);
                b8Var.setIconColor(vm2.f(floatValue, i2, i5));
            }
        });
        this.S.addListener(new a8(this, z, i, i3, i2));
        this.S.setInterpolator(k43.h);
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
        ofFloat.addUpdateListener(new g0(this, (byte) 2));
        this.S.addListener(new z7((byte) 0, (Object) this, z));
        this.S.setInterpolator(k43.h);
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

    public og2 getCheckView() {
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

    public gm getTextView() {
        return this.a;
    }

    public final void h(float f, int i) {
        this.V = f;
        setSelectorColor(aob.p1(f, aob.v0(i, this.P)));
        this.E = i;
        this.H = this.w;
    }

    public final void i(int i, CharSequence charSequence) {
        j(charSequence, i, null);
    }

    public final void j(CharSequence charSequence, int i, Drawable drawable) {
        int L;
        int L2;
        gm gmVar = this.a;
        gmVar.setText(charSequence);
        e29 e29Var = this.c;
        if (i == 0 && drawable == null && this.e == null) {
            this.U = 0;
            e29Var.setVisibility(4);
            gmVar.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.U = 0;
            e29Var.setImageDrawable(drawable);
        } else {
            this.U = i;
            e29Var.setImageResource(i);
        }
        e29Var.setVisibility(0);
        if (this.d) {
            L = this.e != null ? hl.L(43.0f) : 0;
        } else {
            L = hl.L((i == 0 && drawable == null) ? 0.0f : 43.0f);
        }
        if (this.d) {
            L2 = hl.L((i == 0 && drawable == null) ? 0.0f : 43.0f);
        } else {
            L2 = this.e != null ? hl.L(43.0f) : 0;
        }
        gmVar.setPadding(L, 0, L2, 0);
    }

    public final void k(CharSequence charSequence, jn5 jn5Var, String str, ggb ggbVar, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        gm gmVar = this.a;
        gmVar.setText(charSequence);
        gmVar.setPadding((this.d && this.e == null) ? 0 : hl.L(43.0f), 0, (this.d || this.e != null) ? hl.L(43.0f) : 0, 0);
        if (this.h == null) {
            de0 de0Var = new de0(getContext());
            this.h = de0Var;
            de0Var.setRoundRadius(hl.L(5.0f));
            addView(this.h, tre.e(28, 28, (ob6.a0 ? 5 : 3) | 16));
        }
        this.c.setVisibility(4);
        this.h.m(jn5Var, str, ggbVar, tL_attachMenuBot);
    }

    public void l() {
        hf0 Y = aob.Y(this.w, this.M ? this.L : (byte) 0, this.N ? this.L : (byte) 0);
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
        og2 og2Var = this.e;
        if (og2Var == null || !og2Var.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.a.q);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(this.O), TLObject.FLAG_30));
        if (!this.R || this.a.getLayout().getLineCount() <= 1) {
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(this.O + 8), TLObject.FLAG_30));
    }

    public void setAnimatedIcon(int i) {
        this.U = 0;
        this.c.f(i, 24, 24, null);
    }

    public void setCheckColor(int i) {
        this.e.b(-1, -1, i);
    }

    public void setChecked(boolean z) {
        og2 og2Var = this.e;
        if (og2Var == null) {
            return;
        }
        og2Var.a(z, true);
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
        de0 de0Var = this.h;
        if (de0Var != null) {
            de0Var.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i) {
        this.O = i;
    }

    public void setMultiline(boolean z) {
        gm gmVar = this.a;
        gmVar.setLines(2);
        if (z) {
            gmVar.setTextSize(1, 14.0f);
        } else {
            this.R = true;
        }
        gmVar.setSingleLine(false);
        gmVar.setGravity(16);
    }

    public void setRightIcon(int i) {
        if (this.f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f.setColorFilter(this.r, PorterDuff.Mode.MULTIPLY);
            if (ob6.a0) {
                this.f.setScaleX(-1.0f);
            }
            addView(this.f, tre.e(24, -1, (ob6.a0 ? 3 : 5) | 16));
        }
        gm gmVar = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gmVar.getLayoutParams();
        boolean z = ob6.a0;
        ImageView imageView2 = this.f;
        if (z) {
            layoutParams.leftMargin = imageView2 != null ? hl.L(32.0f) : 0;
        } else {
            layoutParams.rightMargin = imageView2 != null ? hl.L(32.0f) : 0;
        }
        gmVar.setLayoutParams(layoutParams);
        setPadding(hl.L(ob6.a0 ? 8.0f : 18.0f), 0, hl.L(ob6.a0 ? 18.0f : 8.0f), 0);
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
                hf0 hf0Var = this.K;
                if (background == hf0Var) {
                    aob.F1(hf0Var, i, true);
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
            yob.X(this.b, aob.Ri, this.P);
            this.b.setVisibility(8);
            this.b.setTextSize(1, 13.0f);
            this.b.setPadding(ob6.a0 ? 0 : hl.L(43.0f), 0, ob6.a0 ? hl.L(43.0f) : 0, 0);
            addView(this.b, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if ((!isEmpty) != (this.b.getVisibility() == 0)) {
            this.b.setVisibility(isEmpty ? 8 : 0);
            gm gmVar = this.a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) gmVar.getLayoutParams();
            layoutParams.bottomMargin = isEmpty ? 0 : hl.L(10.0f);
            gmVar.setLayoutParams(layoutParams);
        }
        this.b.setText(charSequence);
    }

    public void setSubtextColor(int i) {
        TextView textView = this.b;
        if (textView != null) {
            yob.q(textView);
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

    @Override // snb
    public final void updateColors() {
        e29 e29Var;
        PorterDuff.Mode mode;
        gm gmVar;
        try {
            int i = this.x;
            vnb vnbVar = this.P;
            if (i >= 0 && this.n == this.F && (gmVar = this.a) != null && gmVar.getCurrentTextColor() == this.n) {
                int v0 = aob.v0(this.x, vnbVar);
                setTextColor(v0);
                this.F = v0;
            }
            if (this.y >= 0 && this.r == this.G && (e29Var = this.c) != null && e29Var.getColorFilter() == this.J) {
                int v02 = aob.v0(this.y, vnbVar);
                if (v02 != this.r) {
                    this.r = v02;
                    if (!this.I || (mode = this.s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, mode);
                    this.J = porterDuffColorFilter;
                    e29Var.setColorFilter(porterDuffColorFilter);
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
            int p1 = aob.p1(this.V, aob.v0(i2, vnbVar));
            if (p1 != this.w) {
                this.w = p1;
                Drawable background = getBackground();
                if (background == this.K && (background instanceof RippleDrawable)) {
                    ((RippleDrawable) background).setColor(ColorStateList.valueOf(p1));
                }
            }
            this.H = p1;
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public void setIcon(int i) {
        this.U = i;
        this.c.setImageResource(i);
    }

    public b8(vnb vnbVar, Context context, boolean z, boolean z2) {
        this(0, vnbVar, context, z, z2);
    }

    public b8(Context context, boolean z, boolean z2) {
        this(0, null, context, z, z2);
    }
}
