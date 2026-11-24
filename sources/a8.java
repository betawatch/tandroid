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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class a8 extends FrameLayout implements tjb {
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public PorterDuffColorFilter J;
    public ff0 K;
    public byte L;
    public boolean M;
    public boolean N;
    public int O;
    public final wjb P;
    public Runnable Q;
    public boolean R;
    public ValueAnimator S;
    public boolean T;
    public int U;
    public float V;
    public final fm a;
    public TextView b;
    public final ry8 c;
    public boolean d;
    public wf2 e;
    public ImageView f;
    public be0 h;
    public int n;
    public int r;
    public PorterDuff.Mode s;
    public int w;
    public int x;
    public int y;

    public a8(int i, wjb wjbVar, Context context, boolean z, boolean z2) {
        super(context);
        int i2 = bkb.D8;
        this.x = i2;
        int i3 = bkb.E8;
        this.y = i3;
        int i4 = bkb.H5;
        this.E = i4;
        this.L = (byte) 12;
        this.O = 48;
        this.V = 1.0f;
        this.P = wjbVar;
        this.M = z;
        this.N = z2;
        this.n = bkb.v0(i2, wjbVar);
        this.r = bkb.v0(i3, wjbVar);
        this.s = PorterDuff.Mode.MULTIPLY;
        int v0 = bkb.v0(i4, wjbVar);
        this.w = v0;
        this.F = this.n;
        this.G = this.r;
        this.H = v0;
        l();
        setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
        ry8 ry8Var = new ry8(context);
        this.c = ry8Var;
        ry8Var.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.r, PorterDuff.Mode.SRC_IN);
        this.J = porterDuffColorFilter;
        ry8Var.setColorFilter(porterDuffColorFilter);
        addView(ry8Var, nme.e(-2, 40, (k96.a0 ? 5 : 3) | 16));
        fm fmVar = new fm(context);
        this.a = fmVar;
        fmVar.setLines(1);
        fmVar.setSingleLine(true);
        fmVar.setGravity(3);
        fmVar.setEllipsize(TextUtils.TruncateAt.END);
        fmVar.setTextColor(this.n);
        fmVar.setTextSize(1, 16.0f);
        addView(fmVar, nme.e(-2, -2, (k96.a0 ? 5 : 3) | 16));
        this.d = k96.a0;
        a(i);
    }

    public final void a(int i) {
        if (i > 0) {
            wf2 wf2Var = new wf2(26, this.P, getContext());
            this.e = wf2Var;
            wf2Var.setDrawUnchecked(false);
            this.e.b(-1, -1, bkb.D8);
            this.e.setDrawBackgroundAsArc(-1);
            fm fmVar = this.a;
            if (i != 1) {
                addView(this.e, nme.e(26, -1, (k96.a0 ? 3 : 5) | 16));
                fmVar.setPadding(k96.a0 ? gl.L(34.0f) : 0, 0, k96.a0 ? 0 : gl.L(34.0f), 0);
            } else {
                boolean z = k96.a0;
                this.d = !z;
                addView(this.e, nme.e(26, -1, (z ? 5 : 3) | 16));
                fmVar.setPadding(!k96.a0 ? gl.L(34.0f) : 0, 0, !k96.a0 ? 0 : gl.L(34.0f), 0);
            }
        }
    }

    @Override // tjb
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
        wjb wjbVar = this.P;
        d(bkb.v0(i, wjbVar), bkb.v0(i2, wjbVar));
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
                int f = bm2.f(floatValue, i4, i5);
                a8 a8Var = a8.this;
                a8Var.setTextColor(f);
                a8Var.setIconColor(bm2.f(floatValue, i2, i5));
            }
        });
        this.S.addListener(new z7(this, z, i, i3, i2));
        this.S.setInterpolator(s33.h);
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
        this.S.setInterpolator(s33.h);
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

    public wf2 getCheckView() {
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

    public fm getTextView() {
        return this.a;
    }

    public final void h(float f, int i) {
        this.V = f;
        setSelectorColor(bkb.p1(f, bkb.v0(i, this.P)));
        this.E = i;
        this.H = this.w;
    }

    public final void i(int i, CharSequence charSequence) {
        j(charSequence, i, null);
    }

    public final void j(CharSequence charSequence, int i, Drawable drawable) {
        int L;
        int L2;
        fm fmVar = this.a;
        fmVar.setText(charSequence);
        ry8 ry8Var = this.c;
        if (i == 0 && drawable == null && this.e == null) {
            this.U = 0;
            ry8Var.setVisibility(4);
            fmVar.setPadding(0, 0, 0, 0);
            return;
        }
        if (drawable != null) {
            this.U = 0;
            ry8Var.setImageDrawable(drawable);
        } else {
            this.U = i;
            ry8Var.setImageResource(i);
        }
        ry8Var.setVisibility(0);
        if (this.d) {
            L = this.e != null ? gl.L(43.0f) : 0;
        } else {
            L = gl.L((i == 0 && drawable == null) ? 0.0f : 43.0f);
        }
        if (this.d) {
            L2 = gl.L((i == 0 && drawable == null) ? 0.0f : 43.0f);
        } else {
            L2 = this.e != null ? gl.L(43.0f) : 0;
        }
        fmVar.setPadding(L, 0, L2, 0);
    }

    public final void k(CharSequence charSequence, gl5 gl5Var, String str, kcb kcbVar, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        fm fmVar = this.a;
        fmVar.setText(charSequence);
        fmVar.setPadding((this.d && this.e == null) ? 0 : gl.L(43.0f), 0, (this.d || this.e != null) ? gl.L(43.0f) : 0, 0);
        if (this.h == null) {
            be0 be0Var = new be0(getContext());
            this.h = be0Var;
            be0Var.setRoundRadius(gl.L(5.0f));
            addView(this.h, nme.e(28, 28, (k96.a0 ? 5 : 3) | 16));
        }
        this.c.setVisibility(4);
        this.h.m(gl5Var, str, kcbVar, tL_attachMenuBot);
    }

    public void l() {
        ff0 Y = bkb.Y(this.w, this.M ? this.L : (byte) 0, this.N ? this.L : (byte) 0);
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
        wf2 wf2Var = this.e;
        if (wf2Var == null || !wf2Var.a.q) {
            return;
        }
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.e.a.q);
        accessibilityNodeInfo.setClassName("android.widget.CheckBox");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(this.O), TLObject.FLAG_30));
        if (!this.R || this.a.getLayout().getLineCount() <= 1) {
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(this.O + 8), TLObject.FLAG_30));
    }

    public void setAnimatedIcon(int i) {
        this.U = 0;
        this.c.f(i, 24, 24, null);
    }

    public void setCheckColor(int i) {
        this.e.b(-1, -1, i);
    }

    public void setChecked(boolean z) {
        wf2 wf2Var = this.e;
        if (wf2Var == null) {
            return;
        }
        wf2Var.a(z, true);
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
        be0 be0Var = this.h;
        if (be0Var != null) {
            be0Var.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setItemHeight(int i) {
        this.O = i;
    }

    public void setMultiline(boolean z) {
        fm fmVar = this.a;
        fmVar.setLines(2);
        if (z) {
            fmVar.setTextSize(1, 14.0f);
        } else {
            this.R = true;
        }
        fmVar.setSingleLine(false);
        fmVar.setGravity(16);
    }

    public void setRightIcon(int i) {
        if (this.f == null) {
            ImageView imageView = new ImageView(getContext());
            this.f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f.setColorFilter(this.r, PorterDuff.Mode.MULTIPLY);
            if (k96.a0) {
                this.f.setScaleX(-1.0f);
            }
            addView(this.f, nme.e(24, -1, (k96.a0 ? 3 : 5) | 16));
        }
        fm fmVar = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fmVar.getLayoutParams();
        boolean z = k96.a0;
        ImageView imageView2 = this.f;
        if (z) {
            layoutParams.leftMargin = imageView2 != null ? gl.L(32.0f) : 0;
        } else {
            layoutParams.rightMargin = imageView2 != null ? gl.L(32.0f) : 0;
        }
        fmVar.setLayoutParams(layoutParams);
        setPadding(gl.L(k96.a0 ? 8.0f : 18.0f), 0, gl.L(k96.a0 ? 18.0f : 8.0f), 0);
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
                ff0 ff0Var = this.K;
                if (background == ff0Var) {
                    bkb.F1(ff0Var, i, true);
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
            zkb.X(this.b, bkb.Qi, this.P);
            this.b.setVisibility(8);
            this.b.setTextSize(1, 13.0f);
            this.b.setPadding(k96.a0 ? 0 : gl.L(43.0f), 0, k96.a0 ? gl.L(43.0f) : 0, 0);
            addView(this.b, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 16, 0.0f, 10.0f, 0.0f, 0.0f));
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        if ((!isEmpty) != (this.b.getVisibility() == 0)) {
            this.b.setVisibility(isEmpty ? 8 : 0);
            fm fmVar = this.a;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) fmVar.getLayoutParams();
            layoutParams.bottomMargin = isEmpty ? 0 : gl.L(10.0f);
            fmVar.setLayoutParams(layoutParams);
        }
        this.b.setText(charSequence);
    }

    public void setSubtextColor(int i) {
        TextView textView = this.b;
        if (textView != null) {
            zkb.q(textView);
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

    @Override // tjb
    public final void updateColors() {
        ry8 ry8Var;
        PorterDuff.Mode mode;
        fm fmVar;
        try {
            int i = this.x;
            wjb wjbVar = this.P;
            if (i >= 0 && this.n == this.F && (fmVar = this.a) != null && fmVar.getCurrentTextColor() == this.n) {
                int v0 = bkb.v0(this.x, wjbVar);
                setTextColor(v0);
                this.F = v0;
            }
            if (this.y >= 0 && this.r == this.G && (ry8Var = this.c) != null && ry8Var.getColorFilter() == this.J) {
                int v02 = bkb.v0(this.y, wjbVar);
                if (v02 != this.r) {
                    this.r = v02;
                    if (!this.I || (mode = this.s) == null) {
                        mode = PorterDuff.Mode.SRC_IN;
                    }
                    PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(v02, mode);
                    this.J = porterDuffColorFilter;
                    ry8Var.setColorFilter(porterDuffColorFilter);
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
            int p1 = bkb.p1(this.V, bkb.v0(i2, wjbVar));
            if (p1 != this.w) {
                this.w = p1;
                Drawable background = getBackground();
                if (background == this.K && (background instanceof RippleDrawable)) {
                    ((RippleDrawable) background).setColor(ColorStateList.valueOf(p1));
                }
            }
            this.H = p1;
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public void setIcon(int i) {
        this.U = i;
        this.c.setImageResource(i);
    }

    public a8(wjb wjbVar, Context context, boolean z, boolean z2) {
        this(0, wjbVar, context, z, z2);
    }

    public a8(Context context, boolean z, boolean z2) {
        this(0, null, context, z, z2);
    }
}
