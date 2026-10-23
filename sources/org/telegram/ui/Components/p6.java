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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public class p6 extends Drawable {
    public static final LinearInterpolator c0 = new LinearInterpolator();
    public float A;
    public int B;
    public final Rect C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public pg I;
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
    public m6[] h;
    public CharSequence i;
    public float j;
    public float k;
    public float l;
    public float m;
    public m6[] n;
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

    public p6(boolean z10, boolean z11, boolean z12) {
        this(z10, z11, z12, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean l(int i10, int i11, CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        if (!(charSequence instanceof o6) || !(charSequence2 instanceof o6)) {
            return charSequence.charAt(i10) == charSequence2.charAt(i11);
        }
        o6 o6Var = (o6) charSequence;
        CharSequence charSequence4 = null;
        if (i10 >= 0) {
            CharSequence[] charSequenceArr = o6Var.a;
            if (i10 < charSequenceArr.length) {
                charSequence3 = charSequenceArr[i10];
                o6 o6Var2 = (o6) charSequence2;
                if (i11 >= 0) {
                    CharSequence[] charSequenceArr2 = o6Var2.a;
                    if (i11 < charSequenceArr2.length) {
                        charSequence4 = charSequenceArr2[i11];
                    }
                }
                if (charSequence3 == null || charSequence4 != null) {
                    return charSequence3 != null && charSequence3.equals(charSequence4);
                }
                return true;
            }
        }
        charSequence3 = null;
        o6 o6Var22 = (o6) charSequence2;
        if (i11 >= 0) {
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
            int i10 = 0;
            while (true) {
                m6[] m6VarArr = this.n;
                if (i10 >= m6VarArr.length) {
                    break;
                }
                m6 m6Var = m6VarArr[i10];
                p6 p6Var = m6Var.i;
                if (p6Var.getCallback() instanceof View) {
                    a6.release((View) p6Var.getCallback(), m6Var.a);
                }
                i10++;
            }
        }
        this.n = null;
    }

    public final float c() {
        return (this.h == null || this.n == null) ? this.d : AndroidUtilities.lerp(this.j, this.d, this.r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r2 != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float d(m6 m6Var, float f7) {
        float f10 = 0.0f;
        if (this.y <= 0.0f) {
            return this.r;
        }
        float max = Math.max(this.j, this.d);
        float textSize = this.a.getTextSize() * this.y;
        if (max <= 0.0f || textSize <= 0.0f) {
            return this.r;
        }
        boolean z10 = this.c && !this.K;
        float f11 = max - f7;
        int i10 = this.b;
        if ((i10 | (-4)) != -1) {
            if ((i10 | (-6)) != -1) {
                if ((i10 | (-2)) == -1) {
                    f10 = f11 / 2.0f;
                }
            }
            f10 = f11;
        }
        float f12 = m6Var.c;
        if (z10) {
            f10 = f11 - f10;
        }
        float cascade = AndroidUtilities.cascade(this.q, f12 + f10, max, textSize);
        TimeInterpolator timeInterpolator = this.x;
        return timeInterpolator == null ? cascade : timeInterpolator.getInterpolation(cascade);
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
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10 = this.O;
        Rect rect = this.C;
        if (z10) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.right -= this.N;
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        canvas.save();
        canvas.translate(rect.left, rect.top);
        int width = rect.width();
        int height = rect.height();
        float f13 = 0.0f;
        float f14 = 1.0f;
        if (this.h != null && this.n != null) {
            float f15 = this.r;
            if (f15 != 1.0f) {
                float lerp = AndroidUtilities.lerp(this.j, this.d, f15);
                float lerp2 = AndroidUtilities.lerp(this.k, this.e, this.r);
                float lerp3 = AndroidUtilities.lerp(this.l, this.f, this.r);
                if (this.T) {
                    canvas.translate(0.0f, (height - lerp2) / 2.0f);
                }
                int i10 = 0;
                while (true) {
                    m6[] m6VarArr = this.h;
                    int length = m6VarArr.length;
                    textPaint = this.a;
                    if (i10 >= length) {
                        break;
                    }
                    m6 m6Var = m6VarArr[i10];
                    int i11 = m6Var.d;
                    float f16 = m6Var.c;
                    float f17 = lerp3 - m6Var.g;
                    float f18 = f13;
                    if (!this.c || this.K) {
                        f11 = f14;
                    } else {
                        f11 = f14;
                        f16 = this.d - (f16 + m6Var.f);
                    }
                    float d = d(m6Var, this.d);
                    if (i11 >= 0) {
                        m6 m6Var2 = this.n[i11];
                        float f19 = m6Var2.c;
                        if (this.c && !this.K) {
                            f19 = this.j - (f19 + m6Var2.f);
                        }
                        f12 = AndroidUtilities.lerp(f19 - m6Var2.e, f16 - m6Var.e, this.r);
                    } else {
                        float f20 = f16 - m6Var.e;
                        f17 -= ((f11 - d) * (textPaint.getTextSize() * this.z)) * (this.s ? f11 : -1.0f);
                        f12 = f20;
                    }
                    canvas.save();
                    float f21 = i11 >= 0 ? lerp : this.d;
                    int i12 = this.b;
                    if ((i12 | (-4)) != -1) {
                        if ((i12 | (-6)) != -1) {
                            if ((i12 | (-2)) == -1) {
                                f12 = com.google.android.gms.internal.play_billing.k3.z(width, f21, 2.0f, f12);
                            } else if (this.c) {
                            }
                        }
                        f12 += width - f21;
                    }
                    canvas.translate(f12, f17);
                    if (i11 < 0) {
                        float f22 = this.A;
                        if (f22 > f18) {
                            float f23 = f11 - f22;
                            float f24 = f11;
                            float lerp4 = AndroidUtilities.lerp(f23, f24, d);
                            if (Math.abs(f24 - lerp4) < 0.001f) {
                                lerp4 = 1.0f;
                            }
                            canvas.scale(lerp4, lerp4, m6Var.f / 2.0f, m6Var.b.getHeight() / 2.0f);
                        }
                    }
                    if (i11 >= 0) {
                        d = 1.0f;
                    }
                    m6Var.a(canvas, d);
                    canvas.restore();
                    i10++;
                    f13 = f18;
                    f14 = 1.0f;
                }
                float f25 = f13;
                int i13 = 0;
                while (true) {
                    m6[] m6VarArr2 = this.n;
                    if (i13 >= m6VarArr2.length) {
                        break;
                    }
                    m6 m6Var3 = m6VarArr2[i13];
                    if (m6Var3.d < 0) {
                        float d10 = d(m6Var3, this.j);
                        float f26 = m6Var3.c;
                        float textSize = (textPaint.getTextSize() * this.z * d10 * (this.s ? 1.0f : -1.0f)) + (lerp3 - m6Var3.g);
                        canvas.save();
                        boolean z11 = this.c;
                        if (z11 && !this.K) {
                            f26 = this.j - (f26 + m6Var3.f);
                        }
                        float f27 = f26 - m6Var3.e;
                        int i14 = this.b;
                        if ((i14 | (-4)) != -1) {
                            if ((i14 | (-6)) == -1) {
                                f7 = width;
                                f10 = this.j;
                            } else if ((i14 | (-2)) == -1) {
                                f27 = com.google.android.gms.internal.play_billing.k3.z(width, this.j, 2.0f, f27);
                            } else if (z11 && !this.K) {
                                f7 = width;
                                f10 = this.j;
                            }
                            f27 += f7 - f10;
                        }
                        canvas.translate(f27, textSize);
                        float f28 = this.A;
                        if (f28 > f25) {
                            float lerp5 = AndroidUtilities.lerp(1.0f, 1.0f - f28, d10);
                            if (Math.abs(1.0f - lerp5) < 0.001f) {
                                lerp5 = 1.0f;
                            }
                            canvas.scale(lerp5, lerp5, m6Var3.f / 2.0f, m6Var3.b.getHeight() / 2.0f);
                        }
                        m6Var3.a(canvas, 1.0f - d10);
                        canvas.restore();
                    }
                    i13++;
                }
                canvas.restore();
                if (this.O) {
                    return;
                }
                float dp = AndroidUtilities.dp(16.0f);
                if (this.P == null) {
                    this.P = new LinearGradient(0.0f, 0.0f, dp, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.Q = new Matrix();
                    Paint paint = new Paint(1);
                    this.R = paint;
                    paint.setShader(this.P);
                    this.R.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                }
                this.Q.reset();
                this.Q.postTranslate((rect.right - this.N) - dp, 0.0f);
                this.P.setLocalMatrix(this.Q);
                float f29 = rect.right - this.N;
                canvas.drawRect(f29 - dp, rect.top, f29 + AndroidUtilities.dp(1.0f), rect.bottom, this.R);
                canvas.restore();
                return;
            }
        }
        if (this.T) {
            canvas.translate(0.0f, (height - this.e) / 2.0f);
        }
        if (this.h != null) {
            for (int i15 = 0; i15 < this.h.length; i15++) {
                canvas.save();
                m6 m6Var4 = this.h[i15];
                float f30 = m6Var4.c;
                boolean z12 = this.c;
                if (z12 && !this.K) {
                    f30 = this.d - (f30 + m6Var4.f);
                }
                float f31 = f30 - m6Var4.e;
                int i16 = this.b;
                if ((i16 | (-4)) != -1) {
                    if ((i16 | (-6)) == -1) {
                        f31 += width - this.d;
                    } else {
                        if ((i16 | (-2)) == -1) {
                            f31 = com.google.android.gms.internal.play_billing.k3.z(width, this.d, 2.0f, f31);
                        } else if (z12 && !this.K) {
                            f31 += width - this.d;
                        }
                        canvas.translate(f31, this.f - m6Var4.g);
                        m6Var4.a(canvas, 1.0f);
                        canvas.restore();
                    }
                }
                canvas.translate(f31, this.f - m6Var4.g);
                m6Var4.a(canvas, 1.0f);
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

    public final void f(m6 m6Var) {
        this.f = Math.max(this.f, m6Var.g);
        float max = Math.max(this.g, m6Var.h);
        this.g = max;
        this.e = this.f + max;
    }

    public final void g(m6 m6Var) {
        this.l = Math.max(this.l, m6Var.g);
        float max = Math.max(this.m, m6Var.h);
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
        float f7 = 0.0f;
        float f10 = (charSequence == null || charSequence.length() <= 0) ? 0.0f : 1.0f;
        CharSequence charSequence2 = this.i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f7 = 1.0f;
        }
        return AndroidUtilities.lerp(f10, f7, this.o != null ? this.r : 1.0f);
    }

    public final StaticLayout j(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.a, i10).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i10).setIncludePad(this.S).build();
    }

    public final void k(n6 n6Var, CharSequence charSequence, int i10, int i11) {
        if (!this.G || charSequence.length() <= 1) {
            n6Var.d(charSequence);
            return;
        }
        int i12 = 0;
        while (i12 < charSequence.length()) {
            int i13 = i12 + 1;
            n6Var.d(charSequence.subSequence(i12, i13));
            i12 = i13;
        }
    }

    public final void m(float f7, long j10, float f10, TimeInterpolator timeInterpolator) {
        this.z = f7;
        this.w = j10;
        this.y = f10;
        this.x = timeInterpolator;
    }

    public final void n(float f7, long j10, TimeInterpolator timeInterpolator) {
        m(f7, j10, 1.0f, timeInterpolator);
    }

    public final void o(float f7, float f10, float f11, float f12) {
        int i10 = (int) f7;
        int i11 = (int) f10;
        int i12 = (int) f11;
        int i13 = (int) f12;
        super.setBounds(i10, i11, i12, i13);
        this.C.set(i10, i11, i12, i13);
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

    public final void s(float f7, float f10, int i10) {
        this.U = true;
        this.V = f7;
        this.W = f10;
        this.X = i10;
        this.a.setShadowLayer(f7, 0.0f, f10, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.B = i10;
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
    
        r0.d(r12.subSequence(0, r13));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(CharSequence charSequence, boolean z10, boolean z11) {
        float f7;
        int i10;
        int i11;
        final int i12 = 0;
        boolean z12 = (this.i == null || charSequence == null) ? false : z10;
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        int i13 = this.M;
        if (i13 <= 0) {
            i13 = this.C.width();
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
                f7 = 0.0f;
            } else {
                if (this.n != null) {
                    int i15 = 0;
                    while (true) {
                        m6[] m6VarArr = this.n;
                        if (i15 >= m6VarArr.length) {
                            break;
                        }
                        m6 m6Var = m6VarArr[i15];
                        p6 p6Var = m6Var.i;
                        if (p6Var.getCallback() instanceof View) {
                            a6.release((View) p6Var.getCallback(), m6Var.a);
                        }
                        i15++;
                    }
                }
                this.n = null;
                this.h = new m6[]{new m6(this, j(i13, charSequence2), 0.0f, -1)};
                this.i = charSequence2;
                f7 = 0.0f;
                m6 m6Var2 = this.h[0];
                this.d = m6Var2.f;
                this.g = 0.0f;
                this.f = 0.0f;
                this.e = 0.0f;
                f(m6Var2);
                this.c = AndroidUtilities.isRTL(this.i);
            }
            b();
            this.o = null;
            this.j = f7;
            this.m = f7;
            this.l = f7;
            this.k = f7;
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
        this.c = AndroidUtilities.isRTL(this.i);
        org.telegram.ui.fa faVar = new org.telegram.ui.fa(this, i16, arrayList2, arrayList, 1);
        n6 n6Var = new n6(this) { // from class: org.telegram.ui.Components.k6
            public final /* synthetic */ p6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.n6
            public final void d(CharSequence charSequence3) {
                switch (i12) {
                    case 0:
                        p6 p6Var2 = this.b;
                        m6 m6Var3 = new m6(p6Var2, p6Var2.j(i16 - ((int) Math.ceil(p6Var2.d)), charSequence3), p6Var2.d, -1);
                        arrayList.add(m6Var3);
                        p6Var2.d += m6Var3.f;
                        p6Var2.f(m6Var3);
                        break;
                    default:
                        p6 p6Var3 = this.b;
                        m6 m6Var4 = new m6(p6Var3, p6Var3.j(i16 - ((int) Math.ceil(p6Var3.j)), charSequence3), p6Var3.j, -1);
                        arrayList.add(m6Var4);
                        p6Var3.j += m6Var4.f;
                        p6Var3.g(m6Var4);
                        break;
                }
            }
        };
        n6 n6Var2 = new n6(this) { // from class: org.telegram.ui.Components.k6
            public final /* synthetic */ p6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.n6
            public final void d(CharSequence charSequence3) {
                switch (i14) {
                    case 0:
                        p6 p6Var2 = this.b;
                        m6 m6Var3 = new m6(p6Var2, p6Var2.j(i16 - ((int) Math.ceil(p6Var2.d)), charSequence3), p6Var2.d, -1);
                        arrayList2.add(m6Var3);
                        p6Var2.d += m6Var3.f;
                        p6Var2.f(m6Var3);
                        break;
                    default:
                        p6 p6Var3 = this.b;
                        m6 m6Var4 = new m6(p6Var3, p6Var3.j(i16 - ((int) Math.ceil(p6Var3.j)), charSequence3), p6Var3.j, -1);
                        arrayList2.add(m6Var4);
                        p6Var3.j += m6Var4.f;
                        p6Var3.g(m6Var4);
                        break;
                }
            }
        };
        CharSequence o6Var = this.D ? new o6(this.o) : this.o;
        CharSequence o6Var2 = this.D ? new o6(this.i) : this.i;
        if (this.L) {
            k(n6Var2, o6Var, 0, o6Var.length());
            k(n6Var, o6Var2, 0, o6Var2.length());
        } else if (this.H) {
            int min = Math.min(o6Var2.length(), o6Var.length());
            int i17 = 0;
            while (i17 < min && l(i17, i17, o6Var2, o6Var)) {
                i17++;
            }
            int length = o6Var2.length();
            int length2 = o6Var.length();
            while (length > i17 && length2 > i17 && l(length - 1, length2 - 1, o6Var2, o6Var)) {
                length--;
                length2--;
            }
            if (length > i17) {
                k(n6Var, o6Var2.subSequence(i17, length), i17, length);
            }
            if (length2 > i17) {
                k(n6Var2, o6Var.subSequence(i17, length2), i17, length2);
            }
            if (length < o6Var2.length()) {
                CharSequence subSequence = o6Var2.subSequence(length, o6Var2.length());
                o6Var2.length();
                faVar.d(subSequence);
            }
        } else if (this.E) {
            int min2 = Math.min(o6Var2.length(), o6Var.length());
            if (this.F) {
                ArrayList arrayList3 = new ArrayList();
                int i18 = 0;
                int i19 = 1;
                for (int i20 = 0; i20 <= min2; i20++) {
                    int length3 = (o6Var2.length() - i20) - 1;
                    int length4 = (o6Var.length() - i20) - 1;
                    int i21 = (length3 < 0 || length4 < 0 || !l(length3, length4, o6Var2, o6Var)) ? 0 : 1;
                    if (i19 != i21 || i20 == min2) {
                        int i22 = i20 - i18;
                        if (i22 > 0) {
                            if (arrayList3.size() != 0) {
                                i19 = i14;
                            }
                            arrayList3.add(Integer.valueOf(i22));
                            i14 = i19;
                        }
                        i19 = i21;
                        i18 = i20;
                    }
                }
                int length5 = o6Var2.length() - min2;
                int length6 = o6Var.length() - min2;
                if (length5 > 0) {
                    k(n6Var, o6Var2.subSequence(0, length5), 0, length5);
                }
                if (length6 > 0) {
                    k(n6Var2, o6Var.subSequence(0, length6), 0, length6);
                }
                int size = arrayList3.size() - 1;
                while (size >= 0) {
                    int intValue = ((Integer) arrayList3.get(size)).intValue();
                    if ((size % 2 == 0 ? 1 : 0) == i14) {
                        i11 = i14;
                        if (o6Var2.length() > o6Var.length()) {
                            faVar.d(o6Var2.subSequence(length5, length5 + intValue));
                        } else {
                            faVar.d(o6Var.subSequence(length6, length6 + intValue));
                        }
                    } else {
                        i11 = i14;
                        int i23 = length5 + intValue;
                        k(n6Var, o6Var2.subSequence(length5, i23), length5, i23);
                        int i24 = length6 + intValue;
                        k(n6Var2, o6Var.subSequence(length6, i24), length6, i24);
                    }
                    length5 += intValue;
                    length6 += intValue;
                    size--;
                    i14 = i11;
                }
            } else {
                boolean z13 = true;
                int i25 = 0;
                int i26 = 0;
                while (i25 <= min2) {
                    boolean z14 = i25 < min2 && l(i25, i25, o6Var2, o6Var);
                    if (z13 != z14 || i25 == min2) {
                        if (i25 - i26 > 0) {
                            if (z13) {
                                k(faVar, o6Var2.subSequence(i26, i25), i26, i25);
                            } else {
                                k(n6Var, o6Var2.subSequence(i26, i25), i26, i25);
                                k(n6Var2, o6Var.subSequence(i26, i25), i26, i25);
                            }
                        }
                        i26 = i25;
                        z13 = z14;
                    }
                    i25++;
                }
                if (o6Var2.length() - min2 > 0) {
                    k(n6Var, o6Var2.subSequence(min2, o6Var2.length()), min2, o6Var2.length());
                }
                if (o6Var.length() - min2 > 0) {
                    k(n6Var2, o6Var.subSequence(min2, o6Var.length()), min2, o6Var.length());
                }
            }
        } else {
            int min3 = Math.min(o6Var2.length(), o6Var.length());
            boolean z15 = true;
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            while (i27 <= min3) {
                boolean z16 = i27 < min3 && l(i27, i28, o6Var2, o6Var);
                if (z15 != z16 || i27 == min3) {
                    if (i27 == min3) {
                        i27 = o6Var2.length();
                        i28 = o6Var.length();
                    }
                    i10 = min3;
                    int i31 = i27 - i29;
                    boolean z17 = z15;
                    int i32 = i28 - i30;
                    if (i31 > 0 || i32 > 0) {
                        if (i31 == i32 && z17) {
                            faVar.d(o6Var2.subSequence(i29, i27));
                        } else {
                            if (i31 > 0) {
                                k(n6Var, o6Var2.subSequence(i29, i27), i29, i27);
                            }
                            if (i32 > 0) {
                                k(n6Var2, o6Var.subSequence(i30, i28), i30, i28);
                            }
                        }
                    }
                    i29 = i27;
                    i30 = i28;
                    z15 = z16;
                } else {
                    i10 = min3;
                }
                if (z16) {
                    i28++;
                }
                i27++;
                min3 = i10;
            }
        }
        if (this.n != null) {
            int i33 = 0;
            while (true) {
                m6[] m6VarArr2 = this.n;
                if (i33 >= m6VarArr2.length) {
                    break;
                }
                m6 m6Var3 = m6VarArr2[i33];
                p6 p6Var2 = m6Var3.i;
                if (p6Var2.getCallback() instanceof View) {
                    a6.release((View) p6Var2.getCallback(), m6Var3.a);
                }
                i33++;
            }
        }
        this.n = null;
        m6[] m6VarArr3 = this.h;
        if (m6VarArr3 == null || m6VarArr3.length != arrayList.size()) {
            this.h = new m6[arrayList.size()];
        }
        arrayList.toArray(this.h);
        b();
        m6[] m6VarArr4 = this.n;
        if (m6VarArr4 == null || m6VarArr4.length != arrayList2.size()) {
            this.n = new m6[arrayList2.size()];
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
        Runnable runnable2 = this.b0;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.t.addUpdateListener(new l6(this, 0));
        this.t.addListener(new org.telegram.ui.nq(this, 3));
        this.t.setStartDelay(0L);
        this.t.setDuration(this.w);
        this.t.setInterpolator(c0);
        this.t.start();
    }

    public final void u(int i10) {
        this.a.setColor(i10);
        this.B = Color.alpha(i10);
    }

    public final void v(int i10, boolean z10) {
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        if (!z10) {
            u(i10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Y = ofFloat;
        ofFloat.addUpdateListener(new ei.u4(this, this.a.getColor(), i10, 2));
        this.Y.addListener(new gi.p2(this, i10, 4));
        this.Y.setDuration(240L);
        this.Y.setInterpolator(bs.h);
        this.Y.start();
    }

    public final void w(float f7) {
        TextPaint textPaint = this.a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f7);
        if (Math.abs(textSize - f7) > 0.5f) {
            int i10 = this.M;
            if (i10 <= 0) {
                i10 = this.C.width();
            }
            int i11 = 0;
            if (this.h != null) {
                this.d = 0.0f;
                this.g = 0.0f;
                this.f = 0.0f;
                this.e = 0.0f;
                int i12 = 0;
                while (true) {
                    m6[] m6VarArr = this.h;
                    if (i12 >= m6VarArr.length) {
                        break;
                    }
                    StaticLayout j10 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.j))), m6VarArr[i12].b.getText());
                    m6[] m6VarArr2 = this.h;
                    m6 m6Var = m6VarArr2[i12];
                    m6VarArr2[i12] = new m6(this, j10, m6Var.c, m6Var.d);
                    float f10 = this.d;
                    m6 m6Var2 = this.h[i12];
                    this.d = f10 + m6Var2.f;
                    f(m6Var2);
                    i12++;
                }
            }
            if (this.n != null) {
                this.j = 0.0f;
                this.m = 0.0f;
                this.l = 0.0f;
                this.k = 0.0f;
                while (true) {
                    m6[] m6VarArr3 = this.n;
                    if (i11 >= m6VarArr3.length) {
                        break;
                    }
                    StaticLayout j11 = j(i10 - ((int) Math.ceil(Math.min(this.d, this.j))), m6VarArr3[i11].b.getText());
                    m6[] m6VarArr4 = this.n;
                    m6 m6Var3 = m6VarArr4[i11];
                    m6VarArr4[i11] = new m6(this, j11, m6Var3.c, m6Var3.d);
                    float f11 = this.j;
                    m6 m6Var4 = this.n[i11];
                    this.j = f11 + m6Var4.f;
                    g(m6Var4);
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.a.setTypeface(typeface);
    }

    public p6(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.a = new TextPaint(1);
        this.b = 0;
        this.c = false;
        this.p = 0;
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = true;
        this.w = 320L;
        this.x = bs.h;
        this.y = -1.0f;
        this.z = 0.3f;
        this.A = 0.0f;
        this.B = 255;
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
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.C.set(i10, i11, i12, i13);
    }
}
