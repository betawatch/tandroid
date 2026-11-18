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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public class m6 extends Drawable {
    public static final LinearInterpolator d0 = new LinearInterpolator();
    public boolean A;
    public float B;
    public int C;
    public final Rect D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public lg J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public float O;
    public boolean P;
    public LinearGradient Q;
    public Matrix R;
    public Paint S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public float X;
    public int Y;
    public ValueAnimator Z;
    public final TextPaint a;
    public int a0;
    public int b;
    public ColorFilter b0;
    public boolean c;
    public Runnable c0;
    public float d;
    public float e;
    public float f;
    public float g;
    public j6[] h;
    public CharSequence i;
    public float j;
    public float k;
    public float l;
    public float m;
    public j6[] n;
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

    public m6(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean l(int i7, int i10, CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        if (!(charSequence instanceof l6) || !(charSequence2 instanceof l6)) {
            return charSequence.charAt(i7) == charSequence2.charAt(i10);
        }
        l6 l6Var = (l6) charSequence;
        CharSequence charSequence4 = null;
        if (i7 >= 0) {
            CharSequence[] charSequenceArr = l6Var.a;
            if (i7 < charSequenceArr.length) {
                charSequence3 = charSequenceArr[i7];
                l6 l6Var2 = (l6) charSequence2;
                if (i10 >= 0) {
                    CharSequence[] charSequenceArr2 = l6Var2.a;
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
        l6 l6Var22 = (l6) charSequence2;
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
                j6[] j6VarArr = this.n;
                if (i7 >= j6VarArr.length) {
                    break;
                }
                j6 j6Var = j6VarArr[i7];
                m6 m6Var = j6Var.i;
                if (m6Var.getCallback() instanceof View) {
                    x5.release((View) m6Var.getCallback(), j6Var.a);
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
    public final float d(j6 j6Var, float f10) {
        float f11 = 0.0f;
        if (this.y <= 0.0f) {
            return this.r;
        }
        float max = Math.max(this.j, this.d);
        float textSize = this.a.getTextSize() * this.y;
        if (max <= 0.0f || textSize <= 0.0f) {
            return this.r;
        }
        boolean z10 = this.c && !this.L;
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
        float f13 = j6Var.c;
        if (z10) {
            f11 = f12 - f11;
        }
        float s5 = org.telegram.messenger.g0.s(this.q, f13 + f11, max, textSize);
        TimeInterpolator timeInterpolator = this.x;
        return timeInterpolator == null ? s5 : timeInterpolator.getInterpolation(s5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0104, code lost:
    
        if (r22.L == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0140  */
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
        float f14;
        float f15;
        boolean z10 = this.P;
        Rect rect = this.D;
        if (z10) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(rect);
            rectF.right -= this.O;
            canvas.saveLayerAlpha(rectF, org.telegram.messenger.ks.e4, 31);
        }
        canvas.save();
        canvas.translate(rect.left, rect.top);
        int width = rect.width();
        int height = rect.height();
        float f16 = 0.0f;
        float f17 = 1.0f;
        if (this.h != null && this.n != null) {
            float f18 = this.r;
            if (f18 != 1.0f) {
                float T1 = org.telegram.messenger.g0.T1(this.j, this.d, f18);
                float T12 = org.telegram.messenger.g0.T1(this.k, this.e, this.r);
                float T13 = org.telegram.messenger.g0.T1(this.l, this.f, this.r);
                if (this.U) {
                    canvas.translate(0.0f, (height - T12) / 2.0f);
                }
                int i7 = 0;
                while (true) {
                    j6[] j6VarArr = this.h;
                    int length = j6VarArr.length;
                    textPaint = this.a;
                    if (i7 >= length) {
                        break;
                    }
                    j6 j6Var = j6VarArr[i7];
                    int i10 = j6Var.d;
                    float f19 = j6Var.c;
                    float f20 = T13 - j6Var.g;
                    float f21 = f16;
                    if (!this.c || this.L) {
                        f13 = f17;
                    } else {
                        f13 = f17;
                        f19 = this.d - (f19 + j6Var.f);
                    }
                    float d = d(j6Var, this.d);
                    if (i10 >= 0) {
                        j6 j6Var2 = this.n[i10];
                        float f22 = j6Var2.c;
                        if (this.c && !this.L) {
                            f22 = this.j - (f22 + j6Var2.f);
                        }
                        f14 = org.telegram.messenger.g0.T1(f22 - j6Var2.e, f19 - j6Var.e, this.r);
                    } else {
                        float f23 = f19 - j6Var.e;
                        f20 -= ((f13 - d) * (textPaint.getTextSize() * this.z)) * (this.s ? f13 : -1.0f);
                        f14 = f23;
                    }
                    canvas.save();
                    float f24 = i10 >= 0 ? T1 : this.d;
                    int i11 = this.b;
                    if ((i11 | (-4)) != -1) {
                        if ((i11 | (-6)) != -1) {
                            if ((i11 | (-2)) == -1) {
                                f14 = com.google.android.gms.internal.vision.e2.A(width, f24, 2.0f, f14);
                            } else if (this.c) {
                            }
                        }
                        f14 += width - f24;
                    }
                    canvas.translate(f14, f20);
                    if (i10 < 0) {
                        float f25 = this.B;
                        if (f25 > f21) {
                            float f26 = f13 - f25;
                            float f27 = f13;
                            float T14 = org.telegram.messenger.g0.T1(f26, f27, d);
                            if (Math.abs(f27 - T14) < 0.001f) {
                                T14 = 1.0f;
                            }
                            f15 = 2.0f;
                            canvas.scale(T14, T14, j6Var.f / 2.0f, j6Var.b.getHeight() / 2.0f);
                            if (i10 < 0) {
                                d = 1.0f;
                            } else if (this.A) {
                                d = Math.max(f21, (d * f15) - 1.0f);
                            }
                            j6Var.a(canvas, d);
                            canvas.restore();
                            i7++;
                            f16 = 0.0f;
                            f17 = 1.0f;
                        }
                    }
                    f15 = 2.0f;
                    if (i10 < 0) {
                    }
                    j6Var.a(canvas, d);
                    canvas.restore();
                    i7++;
                    f16 = 0.0f;
                    f17 = 1.0f;
                }
                int i12 = 0;
                while (true) {
                    j6[] j6VarArr2 = this.n;
                    if (i12 >= j6VarArr2.length) {
                        break;
                    }
                    j6 j6Var3 = j6VarArr2[i12];
                    if (j6Var3.d < 0) {
                        float d2 = d(j6Var3, this.j);
                        float f28 = j6Var3.c;
                        float textSize = (textPaint.getTextSize() * this.z * d2 * (this.s ? 1.0f : -1.0f)) + (T13 - j6Var3.g);
                        canvas.save();
                        boolean z11 = this.c;
                        if (z11 && !this.L) {
                            f28 = this.j - (f28 + j6Var3.f);
                        }
                        float f29 = f28 - j6Var3.e;
                        int i13 = this.b;
                        if ((i13 | (-4)) != -1) {
                            if ((i13 | (-6)) == -1) {
                                f11 = width;
                                f12 = this.j;
                            } else if ((i13 | (-2)) == -1) {
                                f29 = com.google.android.gms.internal.vision.e2.A(width, this.j, 2.0f, f29);
                            } else if (z11 && !this.L) {
                                f11 = width;
                                f12 = this.j;
                            }
                            f29 += f11 - f12;
                        }
                        canvas.translate(f29, textSize);
                        float f30 = this.B;
                        if (f30 > 0.0f) {
                            float T15 = org.telegram.messenger.g0.T1(1.0f, 1.0f - f30, d2);
                            if (Math.abs(1.0f - T15) < 0.001f) {
                                T15 = 1.0f;
                            }
                            f10 = 2.0f;
                            canvas.scale(T15, T15, j6Var3.f / 2.0f, j6Var3.b.getHeight() / 2.0f);
                        } else {
                            f10 = 2.0f;
                        }
                        j6Var3.a(canvas, this.A ? Math.max(0.0f, 1.0f - (d2 * f10)) : 1.0f - d2);
                        canvas.restore();
                    }
                    i12++;
                }
                canvas.restore();
                if (this.P) {
                    return;
                }
                float L = org.telegram.messenger.g0.L(16.0f);
                if (this.Q == null) {
                    this.Q = new LinearGradient(0.0f, 0.0f, L, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.R = new Matrix();
                    Paint paint = new Paint(1);
                    this.S = paint;
                    paint.setShader(this.Q);
                    this.S.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                }
                this.R.reset();
                this.R.postTranslate((rect.right - this.O) - L, 0.0f);
                this.Q.setLocalMatrix(this.R);
                float f31 = rect.right - this.O;
                canvas.drawRect(f31 - L, rect.top, f31 + org.telegram.messenger.g0.L(1.0f), rect.bottom, this.S);
                canvas.restore();
                return;
            }
        }
        if (this.U) {
            canvas.translate(0.0f, (height - this.e) / 2.0f);
        }
        if (this.h != null) {
            for (int i14 = 0; i14 < this.h.length; i14++) {
                canvas.save();
                j6 j6Var4 = this.h[i14];
                float f32 = j6Var4.c;
                boolean z12 = this.c;
                if (z12 && !this.L) {
                    f32 = this.d - (f32 + j6Var4.f);
                }
                float f33 = f32 - j6Var4.e;
                int i15 = this.b;
                if ((i15 | (-4)) != -1) {
                    if ((i15 | (-6)) == -1) {
                        f33 += width - this.d;
                    } else {
                        if ((i15 | (-2)) == -1) {
                            f33 = com.google.android.gms.internal.vision.e2.A(width, this.d, 2.0f, f33);
                        } else if (z12 && !this.L) {
                            f33 += width - this.d;
                        }
                        canvas.translate(f33, this.f - j6Var4.g);
                        j6Var4.a(canvas, 1.0f);
                        canvas.restore();
                    }
                }
                canvas.translate(f33, this.f - j6Var4.g);
                j6Var4.a(canvas, 1.0f);
                canvas.restore();
            }
        }
        canvas.restore();
        if (this.P) {
        }
    }

    public final float e() {
        return Math.max(this.d, this.j);
    }

    public final void f(j6 j6Var) {
        this.f = Math.max(this.f, j6Var.g);
        float max = Math.max(this.g, j6Var.h);
        this.g = max;
        this.e = this.f + max;
    }

    public final void g(j6 j6Var) {
        this.l = Math.max(this.l, j6Var.g);
        float max = Math.max(this.m, j6Var.h);
        this.m = max;
        this.k = this.l + max;
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.D;
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
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.a, i7).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i7).setIncludePad(this.T).build();
    }

    public final void k(k6 k6Var, CharSequence charSequence, int i7, int i10) {
        if (!this.H || charSequence.length() <= 1) {
            k6Var.f(charSequence);
            return;
        }
        int i11 = 0;
        while (i11 < charSequence.length()) {
            int i12 = i11 + 1;
            k6Var.f(charSequence.subSequence(i11, i12));
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
        this.D.set(i7, i10, i11, i12);
    }

    public final void p(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void q(boolean z10) {
        this.P = z10;
        invalidateSelf();
    }

    public final void r(boolean z10, boolean z11) {
        this.E = z10;
        this.F = true;
        this.G = z11;
        this.H = false;
        this.I = false;
    }

    public final void s(float f10, float f11, int i7) {
        this.V = true;
        this.W = f10;
        this.X = f11;
        this.Y = i7;
        this.a.setShadowLayer(f10, 0.0f, f11, i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.C = i7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.D.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public final void t(CharSequence charSequence, boolean z10, boolean z11) {
        float f10;
        int i7;
        int i10;
        int i11;
        final int i12 = 0;
        boolean z12 = (this.i == null || charSequence == null) ? false : z10;
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        int i13 = this.N;
        if (i13 <= 0) {
            i13 = this.D.width();
        }
        final int i14 = 1;
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
                    int i15 = 0;
                    while (true) {
                        j6[] j6VarArr = this.n;
                        if (i15 >= j6VarArr.length) {
                            break;
                        }
                        j6 j6Var = j6VarArr[i15];
                        m6 m6Var = j6Var.i;
                        if (m6Var.getCallback() instanceof View) {
                            x5.release((View) m6Var.getCallback(), j6Var.a);
                        }
                        i15++;
                    }
                }
                this.n = null;
                this.h = new j6[]{new j6(this, j(i13, charSequence2), 0.0f, -1)};
                this.i = charSequence2;
                f10 = 0.0f;
                j6 j6Var2 = this.h[0];
                this.d = j6Var2.f;
                this.g = 0.0f;
                this.f = 0.0f;
                this.e = 0.0f;
                f(j6Var2);
                this.c = org.telegram.messenger.g0.L1(this.i);
            }
            b();
            this.o = null;
            this.j = f10;
            this.m = f10;
            this.l = f10;
            this.k = f10;
            invalidateSelf();
            Runnable runnable = this.c0;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (TextUtils.equals(charSequence2, this.i)) {
            return;
        }
        if (this.K) {
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
        final int i16 = i13;
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
        bg.g0 g0Var = new bg.g0(this, i16, arrayList2, arrayList, 2);
        k6 k6Var = new k6(this) { // from class: org.telegram.ui.Components.i6
            public final /* synthetic */ m6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.k6
            public final void f(CharSequence charSequence3) {
                switch (i12) {
                    case 0:
                        m6 m6Var2 = this.b;
                        j6 j6Var3 = new j6(m6Var2, m6Var2.j(i16 - ((int) Math.ceil(m6Var2.d)), charSequence3), m6Var2.d, -1);
                        arrayList.add(j6Var3);
                        m6Var2.d += j6Var3.f;
                        m6Var2.f(j6Var3);
                        break;
                    default:
                        m6 m6Var3 = this.b;
                        j6 j6Var4 = new j6(m6Var3, m6Var3.j(i16 - ((int) Math.ceil(m6Var3.j)), charSequence3), m6Var3.j, -1);
                        arrayList.add(j6Var4);
                        m6Var3.j += j6Var4.f;
                        m6Var3.g(j6Var4);
                        break;
                }
            }
        };
        k6 k6Var2 = new k6(this) { // from class: org.telegram.ui.Components.i6
            public final /* synthetic */ m6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.k6
            public final void f(CharSequence charSequence3) {
                switch (i14) {
                    case 0:
                        m6 m6Var2 = this.b;
                        j6 j6Var3 = new j6(m6Var2, m6Var2.j(i16 - ((int) Math.ceil(m6Var2.d)), charSequence3), m6Var2.d, -1);
                        arrayList2.add(j6Var3);
                        m6Var2.d += j6Var3.f;
                        m6Var2.f(j6Var3);
                        break;
                    default:
                        m6 m6Var3 = this.b;
                        j6 j6Var4 = new j6(m6Var3, m6Var3.j(i16 - ((int) Math.ceil(m6Var3.j)), charSequence3), m6Var3.j, -1);
                        arrayList2.add(j6Var4);
                        m6Var3.j += j6Var4.f;
                        m6Var3.g(j6Var4);
                        break;
                }
            }
        };
        CharSequence l6Var = this.E ? new l6(this.o) : this.o;
        CharSequence l6Var2 = this.E ? new l6(this.i) : this.i;
        if (this.M) {
            k(k6Var2, l6Var, 0, l6Var.length());
            k(k6Var, l6Var2, 0, l6Var2.length());
            i7 = 1;
        } else if (this.I) {
            int min = Math.min(l6Var2.length(), l6Var.length());
            int i17 = 0;
            while (i17 < min && l(i17, i17, l6Var2, l6Var)) {
                i17++;
            }
            int length = l6Var2.length();
            int length2 = l6Var.length();
            while (length > i17 && length2 > i17) {
                i7 = i14;
                if (!l(length - 1, length2 - 1, l6Var2, l6Var)) {
                    break;
                }
                length--;
                length2--;
                i14 = i7;
            }
            i7 = i14;
            if (i17 > 0) {
                g0Var.f(l6Var2.subSequence(0, i17));
            }
            if (length > i17) {
                k(k6Var, l6Var2.subSequence(i17, length), i17, length);
            }
            if (length2 > i17) {
                k(k6Var2, l6Var.subSequence(i17, length2), i17, length2);
            }
            if (length < l6Var2.length()) {
                CharSequence subSequence = l6Var2.subSequence(length, l6Var2.length());
                l6Var2.length();
                g0Var.f(subSequence);
            }
        } else {
            i7 = 1;
            if (this.F) {
                int min2 = Math.min(l6Var2.length(), l6Var.length());
                if (this.G) {
                    ArrayList arrayList3 = new ArrayList();
                    boolean z13 = true;
                    boolean z14 = true;
                    int i18 = 0;
                    for (int i19 = 0; i19 <= min2; i19++) {
                        int length3 = (l6Var2.length() - i19) - 1;
                        int length4 = (l6Var.length() - i19) - 1;
                        boolean z15 = length3 >= 0 && length4 >= 0 && l(length3, length4, l6Var2, l6Var);
                        if (z13 != z15 || i19 == min2) {
                            int i20 = i19 - i18;
                            if (i20 > 0) {
                                if (arrayList3.size() != 0) {
                                    z13 = z14;
                                }
                                arrayList3.add(Integer.valueOf(i20));
                                z14 = z13;
                            }
                            z13 = z15;
                            i18 = i19;
                        }
                    }
                    int length5 = l6Var2.length() - min2;
                    int length6 = l6Var.length() - min2;
                    if (length5 > 0) {
                        k(k6Var, l6Var2.subSequence(0, length5), 0, length5);
                    }
                    if (length6 > 0) {
                        k(k6Var2, l6Var.subSequence(0, length6), 0, length6);
                    }
                    int size = arrayList3.size() - 1;
                    while (size >= 0) {
                        int intValue = ((Integer) arrayList3.get(size)).intValue();
                        if ((size % 2 == 0) == z14) {
                            i11 = size;
                            if (l6Var2.length() > l6Var.length()) {
                                g0Var.f(l6Var2.subSequence(length5, length5 + intValue));
                            } else {
                                g0Var.f(l6Var.subSequence(length6, length6 + intValue));
                            }
                        } else {
                            i11 = size;
                            int i21 = length5 + intValue;
                            k(k6Var, l6Var2.subSequence(length5, i21), length5, i21);
                            int i22 = length6 + intValue;
                            k(k6Var2, l6Var.subSequence(length6, i22), length6, i22);
                        }
                        length5 += intValue;
                        length6 += intValue;
                        size = i11 - 1;
                    }
                } else {
                    boolean z16 = true;
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 <= min2) {
                        boolean z17 = i23 < min2 && l(i23, i23, l6Var2, l6Var);
                        if (z16 != z17 || i23 == min2) {
                            if (i23 - i24 > 0) {
                                if (z16) {
                                    k(g0Var, l6Var2.subSequence(i24, i23), i24, i23);
                                } else {
                                    k(k6Var, l6Var2.subSequence(i24, i23), i24, i23);
                                    k(k6Var2, l6Var.subSequence(i24, i23), i24, i23);
                                }
                            }
                            i24 = i23;
                            z16 = z17;
                        }
                        i23++;
                    }
                    if (l6Var2.length() - min2 > 0) {
                        k(k6Var, l6Var2.subSequence(min2, l6Var2.length()), min2, l6Var2.length());
                    }
                    if (l6Var.length() - min2 > 0) {
                        k(k6Var2, l6Var.subSequence(min2, l6Var.length()), min2, l6Var.length());
                    }
                }
            } else {
                int min3 = Math.min(l6Var2.length(), l6Var.length());
                boolean z18 = true;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                while (i25 <= min3) {
                    boolean z19 = i25 < min3 && l(i25, i26, l6Var2, l6Var);
                    if (z18 != z19 || i25 == min3) {
                        if (i25 == min3) {
                            i25 = l6Var2.length();
                            i26 = l6Var.length();
                        }
                        i10 = min3;
                        int i29 = i25 - i27;
                        boolean z20 = z18;
                        int i30 = i26 - i28;
                        if (i29 > 0 || i30 > 0) {
                            if (i29 == i30 && z20) {
                                g0Var.f(l6Var2.subSequence(i27, i25));
                            } else {
                                if (i29 > 0) {
                                    k(k6Var, l6Var2.subSequence(i27, i25), i27, i25);
                                }
                                if (i30 > 0) {
                                    k(k6Var2, l6Var.subSequence(i28, i26), i28, i26);
                                }
                            }
                        }
                        i27 = i25;
                        i28 = i26;
                        z18 = z19;
                    } else {
                        i10 = min3;
                    }
                    if (z19) {
                        i26++;
                    }
                    i25++;
                    min3 = i10;
                }
            }
        }
        if (this.n != null) {
            int i31 = 0;
            while (true) {
                j6[] j6VarArr2 = this.n;
                if (i31 >= j6VarArr2.length) {
                    break;
                }
                j6 j6Var3 = j6VarArr2[i31];
                m6 m6Var2 = j6Var3.i;
                if (m6Var2.getCallback() instanceof View) {
                    x5.release((View) m6Var2.getCallback(), j6Var3.a);
                }
                i31++;
            }
        }
        this.n = null;
        j6[] j6VarArr3 = this.h;
        if (j6VarArr3 == null || j6VarArr3.length != arrayList.size()) {
            this.h = new j6[arrayList.size()];
        }
        arrayList.toArray(this.h);
        b();
        j6[] j6VarArr4 = this.n;
        if (j6VarArr4 == null || j6VarArr4.length != arrayList2.size()) {
            this.n = new j6[arrayList2.size()];
        }
        arrayList2.toArray(this.n);
        ValueAnimator valueAnimator3 = this.t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.s = z11;
        this.r = 0.0f;
        this.q = 0.0f;
        this.t = ValueAnimator.ofFloat(0.0f, 1.0f);
        Runnable runnable2 = this.c0;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.t.addUpdateListener(new w(this, i7));
        this.t.addListener(new x(this, 3));
        this.t.setStartDelay(0L);
        this.t.setDuration(this.w);
        this.t.setInterpolator(d0);
        this.t.start();
    }

    public final void u(int i7) {
        this.a.setColor(i7);
        this.C = Color.alpha(i7);
    }

    public final void v(int i7, boolean z10) {
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Z = null;
        }
        if (!z10) {
            u(i7);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Z = ofFloat;
        ofFloat.addUpdateListener(new hi.g4(this, this.a.getColor(), i7, 2));
        this.Z.addListener(new ki.f2(this, i7, 7));
        this.Z.setDuration(240L);
        this.Z.setInterpolator(lr.h);
        this.Z.start();
    }

    public final void w(float f10) {
        TextPaint textPaint = this.a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f10);
        if (Math.abs(textSize - f10) > 0.5f) {
            int i7 = this.N;
            if (i7 <= 0) {
                i7 = this.D.width();
            }
            int i10 = 0;
            if (this.h != null) {
                this.d = 0.0f;
                this.g = 0.0f;
                this.f = 0.0f;
                this.e = 0.0f;
                int i11 = 0;
                while (true) {
                    j6[] j6VarArr = this.h;
                    if (i11 >= j6VarArr.length) {
                        break;
                    }
                    StaticLayout j3 = j(i7 - ((int) Math.ceil(Math.min(this.d, this.j))), j6VarArr[i11].b.getText());
                    j6[] j6VarArr2 = this.h;
                    j6 j6Var = j6VarArr2[i11];
                    j6VarArr2[i11] = new j6(this, j3, j6Var.c, j6Var.d);
                    float f11 = this.d;
                    j6 j6Var2 = this.h[i11];
                    this.d = f11 + j6Var2.f;
                    f(j6Var2);
                    i11++;
                }
            }
            if (this.n != null) {
                this.j = 0.0f;
                this.m = 0.0f;
                this.l = 0.0f;
                this.k = 0.0f;
                while (true) {
                    j6[] j6VarArr3 = this.n;
                    if (i10 >= j6VarArr3.length) {
                        break;
                    }
                    StaticLayout j10 = j(i7 - ((int) Math.ceil(Math.min(this.d, this.j))), j6VarArr3[i10].b.getText());
                    j6[] j6VarArr4 = this.n;
                    j6 j6Var3 = j6VarArr4[i10];
                    j6VarArr4[i10] = new j6(this, j10, j6Var3.c, j6Var3.d);
                    float f12 = this.j;
                    j6 j6Var4 = this.n[i10];
                    this.j = f12 + j6Var4.f;
                    g(j6Var4);
                    i10++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.a.setTypeface(typeface);
    }

    public m6(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.a = new TextPaint(1);
        this.b = 0;
        this.c = false;
        this.p = 0;
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = true;
        this.w = 320L;
        this.x = lr.h;
        this.y = -1.0f;
        this.z = 0.3f;
        this.B = 0.0f;
        this.C = org.telegram.messenger.ks.e4;
        this.D = new Rect();
        this.T = true;
        this.U = true;
        this.V = false;
        this.E = z10;
        this.F = z11;
        this.G = z12;
        this.H = z13;
        this.I = z14;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        this.D.set(i7, i10, i11, i12);
    }
}
