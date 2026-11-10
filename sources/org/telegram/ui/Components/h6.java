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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class h6 extends Drawable {
    public static final LinearInterpolator c0 = new LinearInterpolator();
    public float A;
    public int B;
    public final Rect C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public wf I;
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
    public e6[] h;
    public CharSequence i;
    public float j;
    public float k;
    public float l;
    public float m;
    public e6[] n;
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

    public h6(boolean z9, boolean z10, boolean z11) {
        this(z9, z10, z11, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean l(int i7, int i10, CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        if (!(charSequence instanceof g6) || !(charSequence2 instanceof g6)) {
            return charSequence.charAt(i7) == charSequence2.charAt(i10);
        }
        g6 g6Var = (g6) charSequence;
        CharSequence charSequence4 = null;
        if (i7 >= 0) {
            CharSequence[] charSequenceArr = g6Var.a;
            if (i7 < charSequenceArr.length) {
                charSequence3 = charSequenceArr[i7];
                g6 g6Var2 = (g6) charSequence2;
                if (i10 >= 0) {
                    CharSequence[] charSequenceArr2 = g6Var2.a;
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
        g6 g6Var22 = (g6) charSequence2;
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
            int i7 = 0;
            while (true) {
                e6[] e6VarArr = this.n;
                if (i7 >= e6VarArr.length) {
                    break;
                }
                e6 e6Var = e6VarArr[i7];
                h6 h6Var = e6Var.i;
                if (h6Var.getCallback() instanceof View) {
                    q5.release((View) h6Var.getCallback(), e6Var.a);
                }
                i7++;
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
    public final float d(e6 e6Var, float f10) {
        float f11 = 0.0f;
        if (this.y <= 0.0f) {
            return this.r;
        }
        float max = Math.max(this.j, this.d);
        float textSize = this.a.getTextSize() * this.y;
        if (max <= 0.0f || textSize <= 0.0f) {
            return this.r;
        }
        boolean z9 = this.c && !this.K;
        float f12 = max - f10;
        int i7 = this.b;
        if ((i7 | (-4)) != -1) {
            if ((i7 | (-6)) != -1) {
                if ((i7 | (-2)) == -1) {
                    f11 = f12 / 2.0f;
                }
            }
            f11 = f12;
        }
        float f13 = e6Var.c;
        if (z9) {
            f11 = f12 - f11;
        }
        float s5 = org.telegram.messenger.g0.s(this.q, f13 + f11, max, textSize);
        TimeInterpolator timeInterpolator = this.x;
        return timeInterpolator == null ? s5 : timeInterpolator.getInterpolation(s5);
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
        boolean z9 = this.O;
        Rect rect = this.C;
        if (z9) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            rectF.right -= this.N;
            canvas.saveLayerAlpha(rectF, org.telegram.messenger.qs.e4, 31);
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
                int i7 = 0;
                while (true) {
                    e6[] e6VarArr = this.h;
                    int length = e6VarArr.length;
                    textPaint = this.a;
                    if (i7 >= length) {
                        break;
                    }
                    e6 e6Var = e6VarArr[i7];
                    int i10 = e6Var.d;
                    float f17 = e6Var.c;
                    float f18 = T13 - e6Var.g;
                    float f19 = f14;
                    if (!this.c || this.K) {
                        f12 = f15;
                    } else {
                        f12 = f15;
                        f17 = this.d - (f17 + e6Var.f);
                    }
                    float d = d(e6Var, this.d);
                    if (i10 >= 0) {
                        e6 e6Var2 = this.n[i10];
                        float f20 = e6Var2.c;
                        if (this.c && !this.K) {
                            f20 = this.j - (f20 + e6Var2.f);
                        }
                        f13 = org.telegram.messenger.g0.T1(f20 - e6Var2.e, f17 - e6Var.e, this.r);
                    } else {
                        float f21 = f17 - e6Var.e;
                        f18 -= ((f12 - d) * (textPaint.getTextSize() * this.z)) * (this.s ? f12 : -1.0f);
                        f13 = f21;
                    }
                    canvas.save();
                    float f22 = i10 >= 0 ? T1 : this.d;
                    int i11 = this.b;
                    if ((i11 | (-4)) != -1) {
                        if ((i11 | (-6)) != -1) {
                            if ((i11 | (-2)) == -1) {
                                f13 = com.google.android.recaptcha.internal.a.A(width, f22, 2.0f, f13);
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
                            canvas.scale(T14, T14, e6Var.f / 2.0f, e6Var.b.getHeight() / 2.0f);
                        }
                    }
                    if (i10 >= 0) {
                        d = 1.0f;
                    }
                    e6Var.a(canvas, d);
                    canvas.restore();
                    i7++;
                    f14 = f19;
                    f15 = 1.0f;
                }
                float f26 = f14;
                int i12 = 0;
                while (true) {
                    e6[] e6VarArr2 = this.n;
                    if (i12 >= e6VarArr2.length) {
                        break;
                    }
                    e6 e6Var3 = e6VarArr2[i12];
                    if (e6Var3.d < 0) {
                        float d2 = d(e6Var3, this.j);
                        float f27 = e6Var3.c;
                        float textSize = (textPaint.getTextSize() * this.z * d2 * (this.s ? 1.0f : -1.0f)) + (T13 - e6Var3.g);
                        canvas.save();
                        boolean z10 = this.c;
                        if (z10 && !this.K) {
                            f27 = this.j - (f27 + e6Var3.f);
                        }
                        float f28 = f27 - e6Var3.e;
                        int i13 = this.b;
                        if ((i13 | (-4)) != -1) {
                            if ((i13 | (-6)) == -1) {
                                f10 = width;
                                f11 = this.j;
                            } else if ((i13 | (-2)) == -1) {
                                f28 = com.google.android.recaptcha.internal.a.A(width, this.j, 2.0f, f28);
                            } else if (z10 && !this.K) {
                                f10 = width;
                                f11 = this.j;
                            }
                            f28 += f10 - f11;
                        }
                        canvas.translate(f28, textSize);
                        float f29 = this.A;
                        if (f29 > f26) {
                            float T15 = org.telegram.messenger.g0.T1(1.0f, 1.0f - f29, d2);
                            if (Math.abs(1.0f - T15) < 0.001f) {
                                T15 = 1.0f;
                            }
                            canvas.scale(T15, T15, e6Var3.f / 2.0f, e6Var3.b.getHeight() / 2.0f);
                        }
                        e6Var3.a(canvas, 1.0f - d2);
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
                e6 e6Var4 = this.h[i14];
                float f31 = e6Var4.c;
                boolean z11 = this.c;
                if (z11 && !this.K) {
                    f31 = this.d - (f31 + e6Var4.f);
                }
                float f32 = f31 - e6Var4.e;
                int i15 = this.b;
                if ((i15 | (-4)) != -1) {
                    if ((i15 | (-6)) == -1) {
                        f32 += width - this.d;
                    } else {
                        if ((i15 | (-2)) == -1) {
                            f32 = com.google.android.recaptcha.internal.a.A(width, this.d, 2.0f, f32);
                        } else if (z11 && !this.K) {
                            f32 += width - this.d;
                        }
                        canvas.translate(f32, this.f - e6Var4.g);
                        e6Var4.a(canvas, 1.0f);
                        canvas.restore();
                    }
                }
                canvas.translate(f32, this.f - e6Var4.g);
                e6Var4.a(canvas, 1.0f);
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

    public final void f(e6 e6Var) {
        this.f = Math.max(this.f, e6Var.g);
        float max = Math.max(this.g, e6Var.h);
        this.g = max;
        this.e = this.f + max;
    }

    public final void g(e6 e6Var) {
        this.l = Math.max(this.l, e6Var.g);
        float max = Math.max(this.m, e6Var.h);
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

    public final StaticLayout j(int i7, CharSequence charSequence) {
        if (i7 <= 0) {
            Point point = org.telegram.messenger.g0.q;
            i7 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.a, i7).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i7).setIncludePad(this.S).build();
    }

    public final void k(f6 f6Var, CharSequence charSequence, int i7, int i10) {
        if (!this.G || charSequence.length() <= 1) {
            f6Var.f(charSequence);
            return;
        }
        int i11 = 0;
        while (i11 < charSequence.length()) {
            int i12 = i11 + 1;
            f6Var.f(charSequence.subSequence(i11, i12));
            i11 = i12;
        }
    }

    public final void m(float f10, long j3, float f11, TimeInterpolator timeInterpolator) {
        this.z = f10;
        this.w = j3;
        this.y = f11;
        this.x = timeInterpolator;
    }

    public final void n(float f10, long j3, TimeInterpolator timeInterpolator) {
        m(f10, j3, 1.0f, timeInterpolator);
    }

    public final void o(float f10, float f11, float f12, float f13) {
        int i7 = (int) f10;
        int i10 = (int) f11;
        int i11 = (int) f12;
        int i12 = (int) f13;
        super.setBounds(i7, i10, i11, i12);
        this.C.set(i7, i10, i11, i12);
    }

    public final void p(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void q(boolean z9) {
        this.O = z9;
        invalidateSelf();
    }

    public final void r(boolean z9, boolean z10) {
        this.D = z9;
        this.E = true;
        this.F = z10;
        this.G = false;
        this.H = false;
    }

    public final void s(float f10, float f11, int i7) {
        this.U = true;
        this.V = f10;
        this.W = f11;
        this.X = i7;
        this.a.setShadowLayer(f10, 0.0f, f11, i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.B = i7;
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
    
        r0.f(r12.subSequence(0, r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(CharSequence charSequence, boolean z9, boolean z10) {
        float f10;
        int i7;
        int i10;
        final int i11 = 0;
        boolean z11 = (this.i == null || charSequence == null) ? false : z9;
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        int i12 = this.M;
        if (i12 <= 0) {
            i12 = this.C.width();
        }
        final int i13 = 1;
        if (!z11) {
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
                        e6[] e6VarArr = this.n;
                        if (i14 >= e6VarArr.length) {
                            break;
                        }
                        e6 e6Var = e6VarArr[i14];
                        h6 h6Var = e6Var.i;
                        if (h6Var.getCallback() instanceof View) {
                            q5.release((View) h6Var.getCallback(), e6Var.a);
                        }
                        i14++;
                    }
                }
                this.n = null;
                this.h = new e6[]{new e6(this, j(i12, charSequence2), 0.0f, -1)};
                this.i = charSequence2;
                f10 = 0.0f;
                e6 e6Var2 = this.h[0];
                this.d = e6Var2.f;
                this.g = 0.0f;
                this.f = 0.0f;
                this.e = 0.0f;
                f(e6Var2);
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
            this.v = z10;
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
        bg.f0 f0Var = new bg.f0(this, i15, arrayList2, arrayList, 2);
        f6 f6Var = new f6(this) { // from class: org.telegram.ui.Components.c6
            public final /* synthetic */ h6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.f6
            public final void f(CharSequence charSequence3) {
                switch (i11) {
                    case 0:
                        h6 h6Var2 = this.b;
                        e6 e6Var3 = new e6(h6Var2, h6Var2.j(i15 - ((int) Math.ceil(h6Var2.d)), charSequence3), h6Var2.d, -1);
                        arrayList.add(e6Var3);
                        h6Var2.d += e6Var3.f;
                        h6Var2.f(e6Var3);
                        break;
                    default:
                        h6 h6Var3 = this.b;
                        e6 e6Var4 = new e6(h6Var3, h6Var3.j(i15 - ((int) Math.ceil(h6Var3.j)), charSequence3), h6Var3.j, -1);
                        arrayList.add(e6Var4);
                        h6Var3.j += e6Var4.f;
                        h6Var3.g(e6Var4);
                        break;
                }
            }
        };
        f6 f6Var2 = new f6(this) { // from class: org.telegram.ui.Components.c6
            public final /* synthetic */ h6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.f6
            public final void f(CharSequence charSequence3) {
                switch (i13) {
                    case 0:
                        h6 h6Var2 = this.b;
                        e6 e6Var3 = new e6(h6Var2, h6Var2.j(i15 - ((int) Math.ceil(h6Var2.d)), charSequence3), h6Var2.d, -1);
                        arrayList2.add(e6Var3);
                        h6Var2.d += e6Var3.f;
                        h6Var2.f(e6Var3);
                        break;
                    default:
                        h6 h6Var3 = this.b;
                        e6 e6Var4 = new e6(h6Var3, h6Var3.j(i15 - ((int) Math.ceil(h6Var3.j)), charSequence3), h6Var3.j, -1);
                        arrayList2.add(e6Var4);
                        h6Var3.j += e6Var4.f;
                        h6Var3.g(e6Var4);
                        break;
                }
            }
        };
        CharSequence g6Var = this.D ? new g6(this.o) : this.o;
        CharSequence g6Var2 = this.D ? new g6(this.i) : this.i;
        if (this.L) {
            k(f6Var2, g6Var, 0, g6Var.length());
            k(f6Var, g6Var2, 0, g6Var2.length());
        } else if (this.H) {
            int min = Math.min(g6Var2.length(), g6Var.length());
            int i16 = 0;
            while (i16 < min && l(i16, i16, g6Var2, g6Var)) {
                i16++;
            }
            int length = g6Var2.length();
            int length2 = g6Var.length();
            while (length > i16 && length2 > i16 && l(length - 1, length2 - 1, g6Var2, g6Var)) {
                length--;
                length2--;
            }
            if (length > i16) {
                k(f6Var, g6Var2.subSequence(i16, length), i16, length);
            }
            if (length2 > i16) {
                k(f6Var2, g6Var.subSequence(i16, length2), i16, length2);
            }
            if (length < g6Var2.length()) {
                CharSequence subSequence = g6Var2.subSequence(length, g6Var2.length());
                g6Var2.length();
                f0Var.f(subSequence);
            }
        } else if (this.E) {
            int min2 = Math.min(g6Var2.length(), g6Var.length());
            if (this.F) {
                ArrayList arrayList3 = new ArrayList();
                int i17 = 0;
                int i18 = 1;
                for (int i19 = 0; i19 <= min2; i19++) {
                    int length3 = (g6Var2.length() - i19) - 1;
                    int length4 = (g6Var.length() - i19) - 1;
                    int i20 = (length3 < 0 || length4 < 0 || !l(length3, length4, g6Var2, g6Var)) ? 0 : 1;
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
                int length5 = g6Var2.length() - min2;
                int length6 = g6Var.length() - min2;
                if (length5 > 0) {
                    k(f6Var, g6Var2.subSequence(0, length5), 0, length5);
                }
                if (length6 > 0) {
                    k(f6Var2, g6Var.subSequence(0, length6), 0, length6);
                }
                int size = arrayList3.size() - 1;
                while (size >= 0) {
                    int intValue = ((Integer) arrayList3.get(size)).intValue();
                    if ((size % 2 == 0 ? 1 : 0) == i13) {
                        i10 = i13;
                        if (g6Var2.length() > g6Var.length()) {
                            f0Var.f(g6Var2.subSequence(length5, length5 + intValue));
                        } else {
                            f0Var.f(g6Var.subSequence(length6, length6 + intValue));
                        }
                    } else {
                        i10 = i13;
                        int i22 = length5 + intValue;
                        k(f6Var, g6Var2.subSequence(length5, i22), length5, i22);
                        int i23 = length6 + intValue;
                        k(f6Var2, g6Var.subSequence(length6, i23), length6, i23);
                    }
                    length5 += intValue;
                    length6 += intValue;
                    size--;
                    i13 = i10;
                }
            } else {
                boolean z12 = true;
                int i24 = 0;
                int i25 = 0;
                while (i24 <= min2) {
                    boolean z13 = i24 < min2 && l(i24, i24, g6Var2, g6Var);
                    if (z12 != z13 || i24 == min2) {
                        if (i24 - i25 > 0) {
                            if (z12) {
                                k(f0Var, g6Var2.subSequence(i25, i24), i25, i24);
                            } else {
                                k(f6Var, g6Var2.subSequence(i25, i24), i25, i24);
                                k(f6Var2, g6Var.subSequence(i25, i24), i25, i24);
                            }
                        }
                        i25 = i24;
                        z12 = z13;
                    }
                    i24++;
                }
                if (g6Var2.length() - min2 > 0) {
                    k(f6Var, g6Var2.subSequence(min2, g6Var2.length()), min2, g6Var2.length());
                }
                if (g6Var.length() - min2 > 0) {
                    k(f6Var2, g6Var.subSequence(min2, g6Var.length()), min2, g6Var.length());
                }
            }
        } else {
            int min3 = Math.min(g6Var2.length(), g6Var.length());
            boolean z14 = true;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            while (i26 <= min3) {
                boolean z15 = i26 < min3 && l(i26, i27, g6Var2, g6Var);
                if (z14 != z15 || i26 == min3) {
                    if (i26 == min3) {
                        i26 = g6Var2.length();
                        i27 = g6Var.length();
                    }
                    i7 = min3;
                    int i30 = i26 - i28;
                    boolean z16 = z14;
                    int i31 = i27 - i29;
                    if (i30 > 0 || i31 > 0) {
                        if (i30 == i31 && z16) {
                            f0Var.f(g6Var2.subSequence(i28, i26));
                        } else {
                            if (i30 > 0) {
                                k(f6Var, g6Var2.subSequence(i28, i26), i28, i26);
                            }
                            if (i31 > 0) {
                                k(f6Var2, g6Var.subSequence(i29, i27), i29, i27);
                            }
                        }
                    }
                    i28 = i26;
                    i29 = i27;
                    z14 = z15;
                } else {
                    i7 = min3;
                }
                if (z15) {
                    i27++;
                }
                i26++;
                min3 = i7;
            }
        }
        if (this.n != null) {
            int i32 = 0;
            while (true) {
                e6[] e6VarArr2 = this.n;
                if (i32 >= e6VarArr2.length) {
                    break;
                }
                e6 e6Var3 = e6VarArr2[i32];
                h6 h6Var2 = e6Var3.i;
                if (h6Var2.getCallback() instanceof View) {
                    q5.release((View) h6Var2.getCallback(), e6Var3.a);
                }
                i32++;
            }
        }
        this.n = null;
        e6[] e6VarArr3 = this.h;
        if (e6VarArr3 == null || e6VarArr3.length != arrayList.size()) {
            this.h = new e6[arrayList.size()];
        }
        arrayList.toArray(this.h);
        b();
        e6[] e6VarArr4 = this.n;
        if (e6VarArr4 == null || e6VarArr4.length != arrayList2.size()) {
            this.n = new e6[arrayList2.size()];
        }
        arrayList2.toArray(this.n);
        ValueAnimator valueAnimator3 = this.t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.s = z10;
        this.r = 0.0f;
        this.q = 0.0f;
        int i33 = 2;
        this.t = ValueAnimator.ofFloat(0.0f, 1.0f);
        Runnable runnable2 = this.b0;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.t.addUpdateListener(new d6(this, 0));
        this.t.addListener(new y5(this, i33));
        this.t.setStartDelay(0L);
        this.t.setDuration(this.w);
        this.t.setInterpolator(c0);
        this.t.start();
    }

    public final void u(int i7) {
        this.a.setColor(i7);
        this.B = Color.alpha(i7);
    }

    public final void v(int i7, boolean z9) {
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        if (!z9) {
            u(i7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y = ofFloat;
        ofFloat.addUpdateListener(new fi.k4(this, this.a.getColor(), i7, 2));
        this.Y.addListener(new hi.m2(this, i7, 7));
        this.Y.setDuration(240L);
        this.Y.setInterpolator(wq.h);
        this.Y.start();
    }

    public final void w(float f10) {
        TextPaint textPaint = this.a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f10);
        if (Math.abs(textSize - f10) > 0.5f) {
            int i7 = this.M;
            if (i7 <= 0) {
                i7 = this.C.width();
            }
            int i10 = 0;
            if (this.h != null) {
                this.d = 0.0f;
                this.g = 0.0f;
                this.f = 0.0f;
                this.e = 0.0f;
                int i11 = 0;
                while (true) {
                    e6[] e6VarArr = this.h;
                    if (i11 >= e6VarArr.length) {
                        break;
                    }
                    StaticLayout j3 = j(i7 - ((int) Math.ceil(Math.min(this.d, this.j))), e6VarArr[i11].b.getText());
                    e6[] e6VarArr2 = this.h;
                    e6 e6Var = e6VarArr2[i11];
                    e6VarArr2[i11] = new e6(this, j3, e6Var.c, e6Var.d);
                    float f11 = this.d;
                    e6 e6Var2 = this.h[i11];
                    this.d = f11 + e6Var2.f;
                    f(e6Var2);
                    i11++;
                }
            }
            if (this.n != null) {
                this.j = 0.0f;
                this.m = 0.0f;
                this.l = 0.0f;
                this.k = 0.0f;
                while (true) {
                    e6[] e6VarArr3 = this.n;
                    if (i10 >= e6VarArr3.length) {
                        break;
                    }
                    StaticLayout j10 = j(i7 - ((int) Math.ceil(Math.min(this.d, this.j))), e6VarArr3[i10].b.getText());
                    e6[] e6VarArr4 = this.n;
                    e6 e6Var3 = e6VarArr4[i10];
                    e6VarArr4[i10] = new e6(this, j10, e6Var3.c, e6Var3.d);
                    float f12 = this.j;
                    e6 e6Var4 = this.n[i10];
                    this.j = f12 + e6Var4.f;
                    g(e6Var4);
                    i10++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.a.setTypeface(typeface);
    }

    public h6(boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = new TextPaint(1);
        this.b = 0;
        this.c = false;
        this.p = 0;
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = true;
        this.w = 320L;
        this.x = wq.h;
        this.y = -1.0f;
        this.z = 0.3f;
        this.A = 0.0f;
        this.B = org.telegram.messenger.qs.e4;
        this.C = new Rect();
        this.S = true;
        this.T = true;
        this.U = false;
        this.D = z9;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        this.H = z13;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.C.set(i7, i10, i11, i12);
    }
}
