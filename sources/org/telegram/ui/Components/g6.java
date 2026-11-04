package org.telegram.ui.Components;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class g6 extends Drawable {
    public static final LinearInterpolator c0 = new LinearInterpolator();
    public float A;
    public int B;
    public final Rect C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public vf I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public float N;
    public boolean O;
    public LinearGradient P;
    public Matrix Q;
    public Paint R;
    public boolean S;
    public boolean T;
    public boolean U;
    public float V;
    public float W;
    public int X;
    public ValueAnimator Y;
    public int Z;
    public final TextPaint a;
    public ColorFilter a0;
    public int b;
    public Runnable b0;
    public boolean c;
    public float d;
    public float e;
    public float f;
    public float g;
    public d6[] h;
    public CharSequence i;
    public float j;
    public float k;
    public float l;
    public float m;
    public d6[] n;
    public CharSequence o;
    public int p;
    public float q;
    public float r;
    public boolean s;
    public ValueAnimator t;
    public CharSequence u;
    public boolean v;
    public long w;
    public TimeInterpolator x;
    public float y;
    public float z;

    public g6(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean l(int i3, int i10, CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        if (!(charSequence instanceof f6) || !(charSequence2 instanceof f6)) {
            return charSequence.charAt(i3) == charSequence2.charAt(i10);
        }
        f6 f6Var = (f6) charSequence;
        CharSequence charSequence4 = null;
        if (i3 >= 0) {
            CharSequence[] charSequenceArr = f6Var.a;
            if (i3 < charSequenceArr.length) {
                charSequence3 = charSequenceArr[i3];
                f6 f6Var2 = (f6) charSequence2;
                if (i10 >= 0) {
                    CharSequence[] charSequenceArr2 = f6Var2.a;
                    if (i10 < charSequenceArr2.length) {
                        charSequence4 = charSequenceArr2[i10];
                    }
                }
                if (charSequence3 == null || charSequence4 != null) {
                    return charSequence3 != null && charSequence3.equals(charSequence4);
                }
                return true;
            }
        }
        charSequence3 = null;
        f6 f6Var22 = (f6) charSequence2;
        if (i10 >= 0) {
        }
        if (charSequence3 == null) {
        }
        if (charSequence3 != null) {
            return false;
        }
    }

    public final void a() {
        ValueAnimator valueAnimator = this.t;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void b() {
        if (this.n != null) {
            int i3 = 0;
            while (true) {
                d6[] d6VarArr = this.n;
                if (i3 >= d6VarArr.length) {
                    break;
                }
                d6 d6Var = d6VarArr[i3];
                g6 g6Var = d6Var.i;
                if (g6Var.getCallback() instanceof View) {
                    p5.release((View) g6Var.getCallback(), d6Var.a);
                }
                i3++;
            }
        }
        this.n = null;
    }

    public final float c() {
        return (this.h == null || this.n == null) ? this.d : org.telegram.messenger.g0.T1(this.j, this.d, this.r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r2 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float d(d6 d6Var, float f10) {
        float f11 = 0.0f;
        if (this.y <= 0.0f) {
            return this.r;
        }
        float max = Math.max(this.j, this.d);
        float textSize = this.a.getTextSize() * this.y;
        if (max <= 0.0f || textSize <= 0.0f) {
            return this.r;
        }
        boolean z10 = this.c && !this.K;
        float f12 = max - f10;
        int i3 = this.b;
        if ((i3 | (-4)) != -1) {
            if ((i3 | (-6)) != -1) {
                if ((i3 | (-2)) == -1) {
                    f11 = f12 / 2.0f;
                }
            }
            f11 = f12;
        }
        float f13 = d6Var.c;
        if (z10) {
            f11 = f12 - f11;
        }
        float s6 = org.telegram.messenger.g0.s(this.q, f13 + f11, max, textSize);
        TimeInterpolator timeInterpolator = this.x;
        return timeInterpolator == null ? s6 : timeInterpolator.getInterpolation(s6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0104, code lost:
    
        if (r22.K == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        TextPaint textPaint;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z10 = this.O;
        Rect rect = this.C;
        if (z10) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            rectF.right -= this.N;
            canvas.saveLayerAlpha(rectF, org.telegram.messenger.hs.e4, 31);
        }
        canvas.save();
        canvas.translate(rect.left, rect.top);
        int width = rect.width();
        int height = rect.height();
        float f14 = 0.0f;
        float f15 = 1.0f;
        if (this.h != null && this.n != null) {
            float f16 = this.r;
            if (f16 != 1.0f) {
                float T1 = org.telegram.messenger.g0.T1(this.j, this.d, f16);
                float T12 = org.telegram.messenger.g0.T1(this.k, this.e, this.r);
                float T13 = org.telegram.messenger.g0.T1(this.l, this.f, this.r);
                if (this.T) {
                    canvas.translate(0.0f, (height - T12) / 2.0f);
                }
                int i3 = 0;
                while (true) {
                    d6[] d6VarArr = this.h;
                    int length = d6VarArr.length;
                    textPaint = this.a;
                    if (i3 >= length) {
                        break;
                    }
                    d6 d6Var = d6VarArr[i3];
                    int i10 = d6Var.d;
                    float f17 = d6Var.c;
                    float f18 = T13 - d6Var.g;
                    float f19 = f14;
                    if (!this.c || this.K) {
                        f12 = f15;
                    } else {
                        f12 = f15;
                        f17 = this.d - (f17 + d6Var.f);
                    }
                    float d = d(d6Var, this.d);
                    if (i10 >= 0) {
                        d6 d6Var2 = this.n[i10];
                        float f20 = d6Var2.c;
                        if (this.c && !this.K) {
                            f20 = this.j - (f20 + d6Var2.f);
                        }
                        f13 = org.telegram.messenger.g0.T1(f20 - d6Var2.e, f17 - d6Var.e, this.r);
                    } else {
                        float f21 = f17 - d6Var.e;
                        f18 -= ((f12 - d) * (textPaint.getTextSize() * this.z)) * (this.s ? f12 : -1.0f);
                        f13 = f21;
                    }
                    canvas.save();
                    float f22 = i10 >= 0 ? T1 : this.d;
                    int i11 = this.b;
                    if ((i11 | (-4)) != -1) {
                        if ((i11 | (-6)) != -1) {
                            if ((i11 | (-2)) == -1) {
                                f13 = com.google.android.recaptcha.internal.a.z(width, f22, 2.0f, f13);
                            } else if (this.c) {
                            }
                        }
                        f13 += width - f22;
                    }
                    canvas.translate(f13, f18);
                    if (i10 < 0) {
                        float f23 = this.A;
                        if (f23 > f19) {
                            float f24 = f12 - f23;
                            float f25 = f12;
                            float T14 = org.telegram.messenger.g0.T1(f24, f25, d);
                            if (Math.abs(f25 - T14) < 0.001f) {
                                T14 = 1.0f;
                            }
                            canvas.scale(T14, T14, d6Var.f / 2.0f, d6Var.b.getHeight() / 2.0f);
                        }
                    }
                    if (i10 >= 0) {
                        d = 1.0f;
                    }
                    d6Var.a(canvas, d);
                    canvas.restore();
                    i3++;
                    f14 = f19;
                    f15 = 1.0f;
                }
                float f26 = f14;
                int i12 = 0;
                while (true) {
                    d6[] d6VarArr2 = this.n;
                    if (i12 >= d6VarArr2.length) {
                        break;
                    }
                    d6 d6Var3 = d6VarArr2[i12];
                    if (d6Var3.d < 0) {
                        float d10 = d(d6Var3, this.j);
                        float f27 = d6Var3.c;
                        float textSize = (textPaint.getTextSize() * this.z * d10 * (this.s ? 1.0f : -1.0f)) + (T13 - d6Var3.g);
                        canvas.save();
                        boolean z11 = this.c;
                        if (z11 && !this.K) {
                            f27 = this.j - (f27 + d6Var3.f);
                        }
                        float f28 = f27 - d6Var3.e;
                        int i13 = this.b;
                        if ((i13 | (-4)) != -1) {
                            if ((i13 | (-6)) == -1) {
                                f10 = width;
                                f11 = this.j;
                            } else if ((i13 | (-2)) == -1) {
                                f28 = com.google.android.recaptcha.internal.a.z(width, this.j, 2.0f, f28);
                            } else if (z11 && !this.K) {
                                f10 = width;
                                f11 = this.j;
                            }
                            f28 += f10 - f11;
                        }
                        canvas.translate(f28, textSize);
                        float f29 = this.A;
                        if (f29 > f26) {
                            float T15 = org.telegram.messenger.g0.T1(1.0f, 1.0f - f29, d10);
                            if (Math.abs(1.0f - T15) < 0.001f) {
                                T15 = 1.0f;
                            }
                            canvas.scale(T15, T15, d6Var3.f / 2.0f, d6Var3.b.getHeight() / 2.0f);
                        }
                        d6Var3.a(canvas, 1.0f - d10);
                        canvas.restore();
                    }
                    i12++;
                }
                canvas.restore();
                if (this.O) {
                    return;
                }
                float L = org.telegram.messenger.g0.L(16.0f);
                if (this.P == null) {
                    this.P = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.Q = new Matrix();
                    Paint paint = new Paint(1);
                    this.R = paint;
                    paint.setShader(this.P);
                    this.R.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                }
                this.Q.reset();
                this.Q.postTranslate((rect.right - this.N) - L, 0.0f);
                this.P.setLocalMatrix(this.Q);
                float f30 = rect.right - this.N;
                canvas.drawRect(f30 - L, rect.top, f30 + org.telegram.messenger.g0.L(1.0f), rect.bottom, this.R);
                canvas.restore();
                return;
            }
        }
        if (this.T) {
            canvas.translate(0.0f, (height - this.e) / 2.0f);
        }
        if (this.h != null) {
            for (int i14 = 0; i14 < this.h.length; i14++) {
                canvas.save();
                d6 d6Var4 = this.h[i14];
                float f31 = d6Var4.c;
                boolean z12 = this.c;
                if (z12 && !this.K) {
                    f31 = this.d - (f31 + d6Var4.f);
                }
                float f32 = f31 - d6Var4.e;
                int i15 = this.b;
                if ((i15 | (-4)) != -1) {
                    if ((i15 | (-6)) == -1) {
                        f32 += width - this.d;
                    } else {
                        if ((i15 | (-2)) == -1) {
                            f32 = com.google.android.recaptcha.internal.a.z(width, this.d, 2.0f, f32);
                        } else if (z12 && !this.K) {
                            f32 += width - this.d;
                        }
                        canvas.translate(f32, this.f - d6Var4.g);
                        d6Var4.a(canvas, 1.0f);
                        canvas.restore();
                    }
                }
                canvas.translate(f32, this.f - d6Var4.g);
                d6Var4.a(canvas, 1.0f);
                canvas.restore();
            }
        }
        canvas.restore();
        if (this.O) {
        }
    }

    public final float e() {
        return Math.max(this.d, this.j);
    }

    public final void f(d6 d6Var) {
        this.f = Math.max(this.f, d6Var.g);
        float max = Math.max(this.g, d6Var.h);
        this.g = max;
        this.e = this.f + max;
    }

    public final void g(d6 d6Var) {
        this.l = Math.max(this.l, d6Var.g);
        float max = Math.max(this.m, d6Var.h);
        this.m = max;
        this.k = this.l + max;
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.C;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final boolean h() {
        ValueAnimator valueAnimator = this.t;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final float i() {
        CharSequence charSequence = this.o;
        float f10 = 0.0f;
        float f11 = (charSequence == null || charSequence.length() <= 0) ? 0.0f : 1.0f;
        CharSequence charSequence2 = this.i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        return org.telegram.messenger.g0.T1(f11, f10, this.o != null ? this.r : 1.0f);
    }

    public final StaticLayout j(int i3, CharSequence charSequence) {
        if (i3 <= 0) {
            Point point = org.telegram.messenger.g0.q;
            i3 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.a, i3).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i3).setIncludePad(this.S).build();
    }

    public final void k(e6 e6Var, CharSequence charSequence, int i3, int i10) {
        if (!this.G || charSequence.length() <= 1) {
            e6Var.b(charSequence);
            return;
        }
        int i11 = 0;
        while (i11 < charSequence.length()) {
            int i12 = i11 + 1;
            e6Var.b(charSequence.subSequence(i11, i12));
            i11 = i12;
        }
    }

    public final void m(float f10, long j10, float f11, TimeInterpolator timeInterpolator) {
        this.z = f10;
        this.w = j10;
        this.y = f11;
        this.x = timeInterpolator;
    }

    public final void n(float f10, long j10, TimeInterpolator timeInterpolator) {
        m(f10, j10, 1.0f, timeInterpolator);
    }

    public final void o(float f10, float f11, float f12, float f13) {
        int i3 = (int) f10;
        int i10 = (int) f11;
        int i11 = (int) f12;
        int i12 = (int) f13;
        super.setBounds(i3, i10, i11, i12);
        this.C.set(i3, i10, i11, i12);
    }

    public final void p(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void q(boolean z10) {
        this.O = z10;
        invalidateSelf();
    }

    public final void r(boolean z10, boolean z11) {
        this.D = z10;
        this.E = true;
        this.F = z11;
        this.G = false;
        this.H = false;
    }

    public final void s(float f10, float f11, int i3) {
        this.U = true;
        this.V = f10;
        this.W = f11;
        this.X = i3;
        this.a.setShadowLayer(f10, 0.0f, f11, i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.B = i3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.C.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f3, code lost:
    
        r0.b(r12.subSequence(0, r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(CharSequence charSequence, boolean z10, boolean z11) {
        float f10;
        int i3;
        int i10;
        final int i11 = 0;
        boolean z12 = (this.i == null || charSequence == null) ? false : z10;
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        int i12 = this.M;
        if (i12 <= 0) {
            i12 = this.C.width();
        }
        final int i13 = 1;
        if (!z12) {
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.t = null;
            this.u = null;
            this.v = false;
            this.r = 0.0f;
            this.q = 0.0f;
            if (charSequence2.equals(this.i)) {
                f10 = 0.0f;
            } else {
                if (this.n != null) {
                    int i14 = 0;
                    while (true) {
                        d6[] d6VarArr = this.n;
                        if (i14 >= d6VarArr.length) {
                            break;
                        }
                        d6 d6Var = d6VarArr[i14];
                        g6 g6Var = d6Var.i;
                        if (g6Var.getCallback() instanceof View) {
                            p5.release((View) g6Var.getCallback(), d6Var.a);
                        }
                        i14++;
                    }
                }
                this.n = null;
                this.h = new d6[]{new d6(this, j(i12, charSequence2), 0.0f, -1)};
                this.i = charSequence2;
                f10 = 0.0f;
                d6 d6Var2 = this.h[0];
                this.d = d6Var2.f;
                this.g = 0.0f;
                this.f = 0.0f;
                this.e = 0.0f;
                f(d6Var2);
                this.c = org.telegram.messenger.g0.L1(this.i);
            }
            b();
            this.o = null;
            this.j = f10;
            this.m = f10;
            this.l = f10;
            this.k = f10;
            invalidateSelf();
            Runnable runnable = this.b0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (TextUtils.equals(charSequence2, this.i)) {
            return;
        }
        if (this.J) {
            ValueAnimator valueAnimator2 = this.t;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.t = null;
            }
        } else if (h()) {
            this.u = charSequence2;
            this.v = z11;
            return;
        }
        this.o = this.i;
        this.i = charSequence2;
        final ArrayList arrayList = new ArrayList();
        final int i15 = i12;
        final ArrayList arrayList2 = new ArrayList();
        this.d = 0.0f;
        this.j = 0.0f;
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = 0.0f;
        this.m = 0.0f;
        this.l = 0.0f;
        this.k = 0.0f;
        this.c = org.telegram.messenger.g0.L1(this.i);
        cg.e0 e0Var = new cg.e0(this, i15, arrayList2, arrayList, 2);
        e6 e6Var = new e6(this) { // from class: org.telegram.ui.Components.b6
            public final /* synthetic */ g6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.e6
            public final void b(CharSequence charSequence3) {
                switch (i11) {
                    case 0:
                        g6 g6Var2 = this.b;
                        d6 d6Var3 = new d6(g6Var2, g6Var2.j(i15 - ((int) Math.ceil(g6Var2.d)), charSequence3), g6Var2.d, -1);
                        arrayList.add(d6Var3);
                        g6Var2.d += d6Var3.f;
                        g6Var2.f(d6Var3);
                        break;
                    default:
                        g6 g6Var3 = this.b;
                        d6 d6Var4 = new d6(g6Var3, g6Var3.j(i15 - ((int) Math.ceil(g6Var3.j)), charSequence3), g6Var3.j, -1);
                        arrayList.add(d6Var4);
                        g6Var3.j += d6Var4.f;
                        g6Var3.g(d6Var4);
                        break;
                }
            }
        };
        e6 e6Var2 = new e6(this) { // from class: org.telegram.ui.Components.b6
            public final /* synthetic */ g6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.e6
            public final void b(CharSequence charSequence3) {
                switch (i13) {
                    case 0:
                        g6 g6Var2 = this.b;
                        d6 d6Var3 = new d6(g6Var2, g6Var2.j(i15 - ((int) Math.ceil(g6Var2.d)), charSequence3), g6Var2.d, -1);
                        arrayList2.add(d6Var3);
                        g6Var2.d += d6Var3.f;
                        g6Var2.f(d6Var3);
                        break;
                    default:
                        g6 g6Var3 = this.b;
                        d6 d6Var4 = new d6(g6Var3, g6Var3.j(i15 - ((int) Math.ceil(g6Var3.j)), charSequence3), g6Var3.j, -1);
                        arrayList2.add(d6Var4);
                        g6Var3.j += d6Var4.f;
                        g6Var3.g(d6Var4);
                        break;
                }
            }
        };
        CharSequence f6Var = this.D ? new f6(this.o) : this.o;
        CharSequence f6Var2 = this.D ? new f6(this.i) : this.i;
        if (this.L) {
            k(e6Var2, f6Var, 0, f6Var.length());
            k(e6Var, f6Var2, 0, f6Var2.length());
        } else if (this.H) {
            int min = Math.min(f6Var2.length(), f6Var.length());
            int i16 = 0;
            while (i16 < min && l(i16, i16, f6Var2, f6Var)) {
                i16++;
            }
            int length = f6Var2.length();
            int length2 = f6Var.length();
            while (length > i16 && length2 > i16 && l(length - 1, length2 - 1, f6Var2, f6Var)) {
                length--;
                length2--;
            }
            if (length > i16) {
                k(e6Var, f6Var2.subSequence(i16, length), i16, length);
            }
            if (length2 > i16) {
                k(e6Var2, f6Var.subSequence(i16, length2), i16, length2);
            }
            if (length < f6Var2.length()) {
                CharSequence subSequence = f6Var2.subSequence(length, f6Var2.length());
                f6Var2.length();
                e0Var.b(subSequence);
            }
        } else if (this.E) {
            int min2 = Math.min(f6Var2.length(), f6Var.length());
            if (this.F) {
                ArrayList arrayList3 = new ArrayList();
                int i17 = 0;
                int i18 = 1;
                for (int i19 = 0; i19 <= min2; i19++) {
                    int length3 = (f6Var2.length() - i19) - 1;
                    int length4 = (f6Var.length() - i19) - 1;
                    int i20 = (length3 < 0 || length4 < 0 || !l(length3, length4, f6Var2, f6Var)) ? 0 : 1;
                    if (i18 != i20 || i19 == min2) {
                        int i21 = i19 - i17;
                        if (i21 > 0) {
                            if (arrayList3.size() != 0) {
                                i18 = i13;
                            }
                            arrayList3.add(Integer.valueOf(i21));
                            i13 = i18;
                        }
                        i18 = i20;
                        i17 = i19;
                    }
                }
                int length5 = f6Var2.length() - min2;
                int length6 = f6Var.length() - min2;
                if (length5 > 0) {
                    k(e6Var, f6Var2.subSequence(0, length5), 0, length5);
                }
                if (length6 > 0) {
                    k(e6Var2, f6Var.subSequence(0, length6), 0, length6);
                }
                int size = arrayList3.size() - 1;
                while (size >= 0) {
                    int intValue = ((Integer) arrayList3.get(size)).intValue();
                    if ((size % 2 == 0 ? 1 : 0) == i13) {
                        i10 = i13;
                        if (f6Var2.length() > f6Var.length()) {
                            e0Var.b(f6Var2.subSequence(length5, length5 + intValue));
                        } else {
                            e0Var.b(f6Var.subSequence(length6, length6 + intValue));
                        }
                    } else {
                        i10 = i13;
                        int i22 = length5 + intValue;
                        k(e6Var, f6Var2.subSequence(length5, i22), length5, i22);
                        int i23 = length6 + intValue;
                        k(e6Var2, f6Var.subSequence(length6, i23), length6, i23);
                    }
                    length5 += intValue;
                    length6 += intValue;
                    size--;
                    i13 = i10;
                }
            } else {
                boolean z13 = true;
                int i24 = 0;
                int i25 = 0;
                while (i24 <= min2) {
                    boolean z14 = i24 < min2 && l(i24, i24, f6Var2, f6Var);
                    if (z13 != z14 || i24 == min2) {
                        if (i24 - i25 > 0) {
                            if (z13) {
                                k(e0Var, f6Var2.subSequence(i25, i24), i25, i24);
                            } else {
                                k(e6Var, f6Var2.subSequence(i25, i24), i25, i24);
                                k(e6Var2, f6Var.subSequence(i25, i24), i25, i24);
                            }
                        }
                        i25 = i24;
                        z13 = z14;
                    }
                    i24++;
                }
                if (f6Var2.length() - min2 > 0) {
                    k(e6Var, f6Var2.subSequence(min2, f6Var2.length()), min2, f6Var2.length());
                }
                if (f6Var.length() - min2 > 0) {
                    k(e6Var2, f6Var.subSequence(min2, f6Var.length()), min2, f6Var.length());
                }
            }
        } else {
            int min3 = Math.min(f6Var2.length(), f6Var.length());
            boolean z15 = true;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i26 <= min3) {
                boolean z16 = i26 < min3 && l(i26, i27, f6Var2, f6Var);
                if (z15 != z16 || i26 == min3) {
                    if (i26 == min3) {
                        i26 = f6Var2.length();
                        i27 = f6Var.length();
                    }
                    i3 = min3;
                    int i30 = i26 - i28;
                    boolean z17 = z15;
                    int i31 = i27 - i29;
                    if (i30 > 0 || i31 > 0) {
                        if (i30 == i31 && z17) {
                            e0Var.b(f6Var2.subSequence(i28, i26));
                        } else {
                            if (i30 > 0) {
                                k(e6Var, f6Var2.subSequence(i28, i26), i28, i26);
                            }
                            if (i31 > 0) {
                                k(e6Var2, f6Var.subSequence(i29, i27), i29, i27);
                            }
                        }
                    }
                    i28 = i26;
                    i29 = i27;
                    z15 = z16;
                } else {
                    i3 = min3;
                }
                if (z16) {
                    i27++;
                }
                i26++;
                min3 = i3;
            }
        }
        if (this.n != null) {
            int i32 = 0;
            while (true) {
                d6[] d6VarArr2 = this.n;
                if (i32 >= d6VarArr2.length) {
                    break;
                }
                d6 d6Var3 = d6VarArr2[i32];
                g6 g6Var2 = d6Var3.i;
                if (g6Var2.getCallback() instanceof View) {
                    p5.release((View) g6Var2.getCallback(), d6Var3.a);
                }
                i32++;
            }
        }
        this.n = null;
        d6[] d6VarArr3 = this.h;
        if (d6VarArr3 == null || d6VarArr3.length != arrayList.size()) {
            this.h = new d6[arrayList.size()];
        }
        arrayList.toArray(this.h);
        b();
        d6[] d6VarArr4 = this.n;
        if (d6VarArr4 == null || d6VarArr4.length != arrayList2.size()) {
            this.n = new d6[arrayList2.size()];
        }
        arrayList2.toArray(this.n);
        ValueAnimator valueAnimator3 = this.t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.s = z11;
        this.r = 0.0f;
        this.q = 0.0f;
        int i33 = 2;
        this.t = ValueAnimator.ofFloat(0.0f, 1.0f);
        Runnable runnable2 = this.b0;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.t.addUpdateListener(new c6(this, 0));
        this.t.addListener(new x5(this, i33));
        this.t.setStartDelay(0L);
        this.t.setDuration(this.w);
        this.t.setInterpolator(c0);
        this.t.start();
    }

    public final void u(int i3) {
        this.a.setColor(i3);
        this.B = Color.alpha(i3);
    }

    public final void v(int i3, boolean z10) {
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        if (!z10) {
            u(i3);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y = ofFloat;
        ofFloat.addUpdateListener(new gi.h4(this, this.a.getColor(), i3, 2));
        this.Y.addListener(new ii.m2(this, i3, 7));
        this.Y.setDuration(240L);
        this.Y.setInterpolator(xq.h);
        this.Y.start();
    }

    public final void w(float f10) {
        TextPaint textPaint = this.a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f10);
        if (Math.abs(textSize - f10) > 0.5f) {
            int i3 = this.M;
            if (i3 <= 0) {
                i3 = this.C.width();
            }
            int i10 = 0;
            if (this.h != null) {
                this.d = 0.0f;
                this.g = 0.0f;
                this.f = 0.0f;
                this.e = 0.0f;
                int i11 = 0;
                while (true) {
                    d6[] d6VarArr = this.h;
                    if (i11 >= d6VarArr.length) {
                        break;
                    }
                    StaticLayout j10 = j(i3 - ((int) Math.ceil(Math.min(this.d, this.j))), d6VarArr[i11].b.getText());
                    d6[] d6VarArr2 = this.h;
                    d6 d6Var = d6VarArr2[i11];
                    d6VarArr2[i11] = new d6(this, j10, d6Var.c, d6Var.d);
                    float f11 = this.d;
                    d6 d6Var2 = this.h[i11];
                    this.d = f11 + d6Var2.f;
                    f(d6Var2);
                    i11++;
                }
            }
            if (this.n != null) {
                this.j = 0.0f;
                this.m = 0.0f;
                this.l = 0.0f;
                this.k = 0.0f;
                while (true) {
                    d6[] d6VarArr3 = this.n;
                    if (i10 >= d6VarArr3.length) {
                        break;
                    }
                    StaticLayout j11 = j(i3 - ((int) Math.ceil(Math.min(this.d, this.j))), d6VarArr3[i10].b.getText());
                    d6[] d6VarArr4 = this.n;
                    d6 d6Var3 = d6VarArr4[i10];
                    d6VarArr4[i10] = new d6(this, j11, d6Var3.c, d6Var3.d);
                    float f12 = this.j;
                    d6 d6Var4 = this.n[i10];
                    this.j = f12 + d6Var4.f;
                    g(d6Var4);
                    i10++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.a.setTypeface(typeface);
    }

    public g6(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.a = new TextPaint(1);
        this.b = 0;
        this.c = false;
        this.p = 0;
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = true;
        this.w = 320L;
        this.x = xq.h;
        this.y = -1.0f;
        this.z = 0.3f;
        this.A = 0.0f;
        this.B = org.telegram.messenger.hs.e4;
        this.C = new Rect();
        this.S = true;
        this.T = true;
        this.U = false;
        this.D = z10;
        this.E = z11;
        this.F = z12;
        this.G = z13;
        this.H = z14;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i3, int i10, int i11, int i12) {
        super.setBounds(i3, i10, i11, i12);
        this.C.set(i3, i10, i11, i12);
    }
}
