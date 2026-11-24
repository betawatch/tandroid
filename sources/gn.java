// default package

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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class gn extends Drawable {
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
    public b1 J;
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
    public dn[] h;
    public CharSequence i;
    public float j;
    public float k;
    public float l;
    public float m;
    public dn[] n;
    public CharSequence o;
    public int p;
    public float q;
    public float r;
    public boolean s;
    public ValueAnimator t;
    public CharSequence u;
    public boolean v;
    public short w;
    public s33 x;
    public float y;
    public float z;

    public gn(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = new TextPaint(1);
        this.b = 0;
        this.c = false;
        this.p = 0;
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = true;
        this.w = (short) 320;
        this.x = s33.h;
        this.y = -1.0f;
        this.z = 0.3f;
        this.B = 0.0f;
        this.C = kk7.d4;
        this.D = new Rect();
        this.T = true;
        this.U = true;
        this.V = false;
        this.E = z;
        this.F = z2;
        this.G = z3;
        this.H = z4;
        this.I = z5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean l(int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        if (!(charSequence instanceof fn) || !(charSequence2 instanceof fn)) {
            return charSequence.charAt(i) == charSequence2.charAt(i2);
        }
        fn fnVar = (fn) charSequence;
        CharSequence charSequence4 = null;
        if (i >= 0) {
            CharSequence[] charSequenceArr = fnVar.a;
            if (i < charSequenceArr.length) {
                charSequence3 = charSequenceArr[i];
                fn fnVar2 = (fn) charSequence2;
                if (i2 >= 0) {
                    CharSequence[] charSequenceArr2 = fnVar2.a;
                    if (i2 < charSequenceArr2.length) {
                        charSequence4 = charSequenceArr2[i2];
                    }
                }
                return charSequence3 != null ? charSequence4 == null : charSequence3.equals(charSequence4);
            }
        }
        charSequence3 = null;
        fn fnVar22 = (fn) charSequence2;
        if (i2 >= 0) {
        }
        if (charSequence3 != null) {
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
            int i = 0;
            while (true) {
                dn[] dnVarArr = this.n;
                if (i >= dnVarArr.length) {
                    break;
                }
                dn dnVar = dnVarArr[i];
                gn gnVar = dnVar.i;
                if (gnVar.getCallback() instanceof View) {
                    gm.release((View) gnVar.getCallback(), dnVar.a);
                }
                i++;
            }
        }
        this.n = null;
    }

    public final float c() {
        return (this.h == null || this.n == null) ? this.d : gl.R1(this.j, this.d, this.r);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r2 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float d(dn dnVar, float f) {
        float f2 = 0.0f;
        if (this.y <= 0.0f) {
            return this.r;
        }
        float max = Math.max(this.j, this.d);
        float textSize = this.a.getTextSize() * this.y;
        if (max <= 0.0f || textSize <= 0.0f) {
            return this.r;
        }
        boolean z = this.c && !this.L;
        float f3 = max - f;
        int i = this.b;
        if ((i | (-4)) != -1) {
            if ((i | (-6)) != -1) {
                if ((i | (-2)) == -1) {
                    f2 = f3 / 2.0f;
                }
            }
            f2 = f3;
        }
        float f4 = dnVar.c;
        if (z) {
            f2 = f3 - f2;
        }
        float s = gl.s(this.q, f4 + f2, max, textSize);
        s33 s33Var = this.x;
        return s33Var == null ? s : s33Var.getInterpolation(s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0100, code lost:
    
        if (r22.L == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        TextPaint textPaint;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        boolean z = this.P;
        Rect rect = this.D;
        if (z) {
            RectF rectF = gl.P;
            rectF.set(rect);
            rectF.right -= this.O;
            canvas.saveLayerAlpha(rectF, kk7.d4, 31);
        }
        canvas.save();
        canvas.translate(rect.left, rect.top);
        int width = rect.width();
        int height = rect.height();
        float f9 = 0.0f;
        float f10 = 1.0f;
        if (this.h != null && this.n != null) {
            float f11 = this.r;
            if (f11 != 1.0f) {
                float R1 = gl.R1(this.j, this.d, f11);
                float R12 = gl.R1(this.k, this.e, this.r);
                float R13 = gl.R1(this.l, this.f, this.r);
                if (this.U) {
                    canvas.translate(0.0f, (height - R12) / 2.0f);
                }
                int i = 0;
                while (true) {
                    dn[] dnVarArr = this.h;
                    int length = dnVarArr.length;
                    textPaint = this.a;
                    if (i >= length) {
                        break;
                    }
                    dn dnVar = dnVarArr[i];
                    int i2 = dnVar.d;
                    float f12 = dnVar.c;
                    float f13 = R13 - dnVar.g;
                    float f14 = f9;
                    if (!this.c || this.L) {
                        f6 = f10;
                    } else {
                        f6 = f10;
                        f12 = this.d - (f12 + dnVar.f);
                    }
                    float d = d(dnVar, this.d);
                    if (i2 >= 0) {
                        dn dnVar2 = this.n[i2];
                        float f15 = dnVar2.c;
                        if (this.c && !this.L) {
                            f15 = this.j - (f15 + dnVar2.f);
                        }
                        f7 = gl.R1(f15 - dnVar2.e, f12 - dnVar.e, this.r);
                    } else {
                        float f16 = f12 - dnVar.e;
                        f13 -= ((f6 - d) * (textPaint.getTextSize() * this.z)) * (this.s ? f6 : -1.0f);
                        f7 = f16;
                    }
                    canvas.save();
                    float f17 = i2 >= 0 ? R1 : this.d;
                    int i3 = this.b;
                    if ((i3 | (-4)) != -1) {
                        if ((i3 | (-6)) != -1) {
                            if ((i3 | (-2)) == -1) {
                                f7 = oo1.z(width, f17, 2.0f, f7);
                            } else if (this.c) {
                            }
                        }
                        f7 += width - f17;
                    }
                    canvas.translate(f7, f13);
                    if (i2 < 0) {
                        float f18 = this.B;
                        if (f18 > f14) {
                            float f19 = f6 - f18;
                            float f20 = f6;
                            float R14 = gl.R1(f19, f20, d);
                            if (Math.abs(f20 - R14) < 0.001f) {
                                R14 = 1.0f;
                            }
                            f8 = 2.0f;
                            canvas.scale(R14, R14, dnVar.f / 2.0f, dnVar.b.getHeight() / 2.0f);
                            if (i2 < 0) {
                                d = 1.0f;
                            } else if (this.A) {
                                d = Math.max(f14, (d * f8) - 1.0f);
                            }
                            dnVar.a(canvas, d);
                            canvas.restore();
                            i++;
                            f9 = 0.0f;
                            f10 = 1.0f;
                        }
                    }
                    f8 = 2.0f;
                    if (i2 < 0) {
                    }
                    dnVar.a(canvas, d);
                    canvas.restore();
                    i++;
                    f9 = 0.0f;
                    f10 = 1.0f;
                }
                int i4 = 0;
                while (true) {
                    dn[] dnVarArr2 = this.n;
                    if (i4 >= dnVarArr2.length) {
                        break;
                    }
                    dn dnVar3 = dnVarArr2[i4];
                    if (dnVar3.d < 0) {
                        float d2 = d(dnVar3, this.j);
                        float f21 = dnVar3.c;
                        float textSize = (textPaint.getTextSize() * this.z * d2 * (this.s ? 1.0f : -1.0f)) + (R13 - dnVar3.g);
                        canvas.save();
                        boolean z2 = this.c;
                        if (z2 && !this.L) {
                            f21 = this.j - (f21 + dnVar3.f);
                        }
                        float f22 = f21 - dnVar3.e;
                        int i5 = this.b;
                        if ((i5 | (-4)) != -1) {
                            if ((i5 | (-6)) == -1) {
                                f4 = width;
                                f5 = this.j;
                            } else if ((i5 | (-2)) == -1) {
                                f22 = oo1.z(width, this.j, 2.0f, f22);
                            } else if (z2 && !this.L) {
                                f4 = width;
                                f5 = this.j;
                            }
                            f22 += f4 - f5;
                        }
                        canvas.translate(f22, textSize);
                        float f23 = this.B;
                        if (f23 > 0.0f) {
                            float R15 = gl.R1(1.0f, 1.0f - f23, d2);
                            if (Math.abs(1.0f - R15) < 0.001f) {
                                R15 = 1.0f;
                            }
                            f3 = 2.0f;
                            canvas.scale(R15, R15, dnVar3.f / 2.0f, dnVar3.b.getHeight() / 2.0f);
                        } else {
                            f3 = 2.0f;
                        }
                        dnVar3.a(canvas, this.A ? Math.max(0.0f, 1.0f - (d2 * f3)) : 1.0f - d2);
                        canvas.restore();
                    }
                    i4++;
                }
                canvas.restore();
                if (this.P) {
                    return;
                }
                float L = gl.L(16.0f);
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
                float f24 = rect.right - this.O;
                canvas.drawRect(f24 - L, rect.top, f24 + gl.L(1.0f), rect.bottom, this.S);
                canvas.restore();
                return;
            }
        }
        if (this.U) {
            canvas.translate(0.0f, (height - this.e) / 2.0f);
        }
        if (this.h != null) {
            for (int i6 = 0; i6 < this.h.length; i6++) {
                canvas.save();
                dn dnVar4 = this.h[i6];
                float f25 = dnVar4.c;
                boolean z3 = this.c;
                if (z3 && !this.L) {
                    f25 = this.d - (f25 + dnVar4.f);
                }
                float f26 = f25 - dnVar4.e;
                int i7 = this.b;
                if ((i7 | (-4)) != -1) {
                    if ((i7 | (-6)) == -1) {
                        f = width;
                        f2 = this.d;
                    } else if ((i7 | (-2)) == -1) {
                        f26 = oo1.z(width, this.d, 2.0f, f26);
                    } else if (z3 && !this.L) {
                        f = width;
                        f2 = this.d;
                    }
                    f26 += f - f2;
                }
                canvas.translate(f26, this.f - dnVar4.g);
                dnVar4.a(canvas, 1.0f);
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

    public final void f(dn dnVar) {
        this.f = Math.max(this.f, dnVar.g);
        float max = Math.max(this.g, dnVar.h);
        this.g = max;
        this.e = this.f + max;
    }

    public final void g(dn dnVar) {
        this.l = Math.max(this.l, dnVar.g);
        float max = Math.max(this.m, dnVar.h);
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
        float f = 0.0f;
        float f2 = (charSequence == null || charSequence.length() <= 0) ? 0.0f : 1.0f;
        CharSequence charSequence2 = this.i;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f = 1.0f;
        }
        return gl.R1(f2, f, this.o != null ? this.r : 1.0f);
    }

    public final StaticLayout j(int i, CharSequence charSequence) {
        if (i <= 0) {
            Point point = gl.q;
            i = Math.min(point.x, point.y);
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.a, i).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i).setIncludePad(this.T).build();
    }

    public final void k(en enVar, CharSequence charSequence, int i, int i2) {
        if (!this.H || charSequence.length() <= 1) {
            enVar.e(charSequence);
            return;
        }
        int i3 = 0;
        while (i3 < charSequence.length()) {
            int i4 = i3 + 1;
            enVar.e(charSequence.subSequence(i3, i4));
            i3 = i4;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public final void m(float f, long j, float f2, s33 s33Var) {
        this.z = f;
        this.w = (int) j;
        this.y = f2;
        this.x = s33Var;
    }

    public final void n(float f, long j, s33 s33Var) {
        m(f, j, 1.0f, s33Var);
    }

    public final void o(float f, float f2, float f3, float f4) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = (int) f3;
        int i4 = (int) f4;
        super.setBounds(i, i2, i3, i4);
        this.D.set(i, i2, i3, i4);
    }

    public final void p(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void q(boolean z) {
        this.P = z;
        invalidateSelf();
    }

    public final void r(boolean z, boolean z2) {
        this.E = z;
        this.F = true;
        this.G = z2;
        this.H = false;
        this.I = false;
    }

    public final void s(float f, float f2, int i) {
        this.V = true;
        this.W = f;
        this.X = f2;
        this.Y = i;
        this.a.setShadowLayer(f, 0.0f, f2, i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.C = i;
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

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ea, code lost:
    
        r0.e(r13.subSequence(0, r8));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(CharSequence charSequence, boolean z, boolean z2) {
        float f;
        int i;
        int i2;
        final byte b = 0;
        boolean z3 = (this.i == null || charSequence == null) ? false : z;
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        int i3 = this.N;
        if (i3 <= 0) {
            i3 = this.D.width();
        }
        final byte b2 = 1;
        if (!z3) {
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
                f = 0.0f;
            } else {
                if (this.n != null) {
                    int i4 = 0;
                    while (true) {
                        dn[] dnVarArr = this.n;
                        if (i4 >= dnVarArr.length) {
                            break;
                        }
                        dn dnVar = dnVarArr[i4];
                        gn gnVar = dnVar.i;
                        if (gnVar.getCallback() instanceof View) {
                            gm.release((View) gnVar.getCallback(), dnVar.a);
                        }
                        i4++;
                    }
                }
                this.n = null;
                this.h = new dn[]{new dn(this, j(i3, charSequence2), 0.0f, -1)};
                this.i = charSequence2;
                f = 0.0f;
                dn dnVar2 = this.h[0];
                this.d = dnVar2.f;
                this.g = 0.0f;
                this.f = 0.0f;
                this.e = 0.0f;
                f(dnVar2);
                this.c = gl.J1(this.i);
            }
            b();
            this.o = null;
            this.j = f;
            this.m = f;
            this.l = f;
            this.k = f;
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
            this.v = z2;
            return;
        }
        this.o = this.i;
        this.i = charSequence2;
        final ArrayList arrayList = new ArrayList();
        final int i5 = i3;
        final ArrayList arrayList2 = new ArrayList();
        this.d = 0.0f;
        this.j = 0.0f;
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = 0.0f;
        this.m = 0.0f;
        this.l = 0.0f;
        this.k = 0.0f;
        this.c = gl.J1(this.i);
        zm zmVar = new zm((Object) this, i5, (Object) arrayList2, (Object) arrayList, (byte) 0);
        en enVar = new en(this) { // from class: an
            public final /* synthetic */ gn b;

            {
                this.b = this;
            }

            @Override // en
            public final void e(CharSequence charSequence3) {
                byte b3 = b;
                ArrayList arrayList3 = arrayList;
                int i6 = i5;
                gn gnVar2 = this.b;
                switch (b3) {
                    case 0:
                        dn dnVar3 = new dn(gnVar2, gnVar2.j(i6 - ((int) Math.ceil(gnVar2.d)), charSequence3), gnVar2.d, -1);
                        arrayList3.add(dnVar3);
                        gnVar2.d += dnVar3.f;
                        gnVar2.f(dnVar3);
                        break;
                    default:
                        dn dnVar4 = new dn(gnVar2, gnVar2.j(i6 - ((int) Math.ceil(gnVar2.j)), charSequence3), gnVar2.j, -1);
                        arrayList3.add(dnVar4);
                        gnVar2.j += dnVar4.f;
                        gnVar2.g(dnVar4);
                        break;
                }
            }
        };
        en enVar2 = new en(this) { // from class: an
            public final /* synthetic */ gn b;

            {
                this.b = this;
            }

            @Override // en
            public final void e(CharSequence charSequence3) {
                byte b3 = b2;
                ArrayList arrayList3 = arrayList2;
                int i6 = i5;
                gn gnVar2 = this.b;
                switch (b3) {
                    case 0:
                        dn dnVar3 = new dn(gnVar2, gnVar2.j(i6 - ((int) Math.ceil(gnVar2.d)), charSequence3), gnVar2.d, -1);
                        arrayList3.add(dnVar3);
                        gnVar2.d += dnVar3.f;
                        gnVar2.f(dnVar3);
                        break;
                    default:
                        dn dnVar4 = new dn(gnVar2, gnVar2.j(i6 - ((int) Math.ceil(gnVar2.j)), charSequence3), gnVar2.j, -1);
                        arrayList3.add(dnVar4);
                        gnVar2.j += dnVar4.f;
                        gnVar2.g(dnVar4);
                        break;
                }
            }
        };
        boolean z4 = this.E;
        CharSequence charSequence3 = this.o;
        if (z4) {
            charSequence3 = new fn(charSequence3);
        }
        boolean z5 = this.E;
        CharSequence charSequence4 = this.i;
        if (z5) {
            charSequence4 = new fn(charSequence4);
        }
        if (this.M) {
            k(enVar2, charSequence3, 0, charSequence3.length());
            k(enVar, charSequence4, 0, charSequence4.length());
        } else if (this.I) {
            int min = Math.min(charSequence4.length(), charSequence3.length());
            int i6 = 0;
            while (i6 < min && l(i6, i6, charSequence4, charSequence3)) {
                i6++;
            }
            int length = charSequence4.length();
            int length2 = charSequence3.length();
            while (length > i6 && length2 > i6 && l(length - 1, length2 - 1, charSequence4, charSequence3)) {
                length--;
                length2--;
            }
            if (length > i6) {
                k(enVar, charSequence4.subSequence(i6, length), i6, length);
            }
            if (length2 > i6) {
                k(enVar2, charSequence3.subSequence(i6, length2), i6, length2);
            }
            if (length < charSequence4.length()) {
                CharSequence subSequence = charSequence4.subSequence(length, charSequence4.length());
                charSequence4.length();
                zmVar.e(subSequence);
            }
        } else if (this.F) {
            int min2 = Math.min(charSequence4.length(), charSequence3.length());
            if (this.G) {
                ArrayList arrayList3 = new ArrayList();
                int i7 = 0;
                byte b3 = 1;
                for (int i8 = 0; i8 <= min2; i8++) {
                    int length3 = (charSequence4.length() - i8) - 1;
                    int length4 = (charSequence3.length() - i8) - 1;
                    byte b4 = (length3 < 0 || length4 < 0 || !l(length3, length4, charSequence4, charSequence3)) ? (byte) 0 : (byte) 1;
                    if (b3 != b4 || i8 == min2) {
                        int i9 = i8 - i7;
                        if (i9 > 0) {
                            if (arrayList3.size() != 0) {
                                b3 = b2;
                            }
                            arrayList3.add(Integer.valueOf(i9));
                            b2 = b3;
                        }
                        b3 = b4;
                        i7 = i8;
                    }
                }
                int length5 = charSequence4.length() - min2;
                int length6 = charSequence3.length() - min2;
                if (length5 > 0) {
                    k(enVar, charSequence4.subSequence(0, length5), 0, length5);
                }
                if (length6 > 0) {
                    k(enVar2, charSequence3.subSequence(0, length6), 0, length6);
                }
                int size = arrayList3.size() - 1;
                while (size >= 0) {
                    int intValue = ((Integer) arrayList3.get(size)).intValue();
                    if ((size % 2 == 0 ? (byte) 1 : (byte) 0) == b2) {
                        i2 = size;
                        if (charSequence4.length() > charSequence3.length()) {
                            zmVar.e(charSequence4.subSequence(length5, length5 + intValue));
                        } else {
                            zmVar.e(charSequence3.subSequence(length6, length6 + intValue));
                        }
                    } else {
                        i2 = size;
                        int i10 = length5 + intValue;
                        k(enVar, charSequence4.subSequence(length5, i10), length5, i10);
                        int i11 = length6 + intValue;
                        k(enVar2, charSequence3.subSequence(length6, i11), length6, i11);
                    }
                    length5 += intValue;
                    length6 += intValue;
                    size = i2 - 1;
                }
            } else {
                boolean z6 = true;
                int i12 = 0;
                int i13 = 0;
                while (i12 <= min2) {
                    boolean z7 = i12 < min2 && l(i12, i12, charSequence4, charSequence3);
                    if (z6 != z7 || i12 == min2) {
                        if (i12 - i13 > 0) {
                            if (z6) {
                                k(zmVar, charSequence4.subSequence(i13, i12), i13, i12);
                            } else {
                                k(enVar, charSequence4.subSequence(i13, i12), i13, i12);
                                k(enVar2, charSequence3.subSequence(i13, i12), i13, i12);
                            }
                        }
                        i13 = i12;
                        z6 = z7;
                    }
                    i12++;
                }
                if (charSequence4.length() - min2 > 0) {
                    k(enVar, charSequence4.subSequence(min2, charSequence4.length()), min2, charSequence4.length());
                }
                if (charSequence3.length() - min2 > 0) {
                    k(enVar2, charSequence3.subSequence(min2, charSequence3.length()), min2, charSequence3.length());
                }
            }
        } else {
            int min3 = Math.min(charSequence4.length(), charSequence3.length());
            boolean z8 = true;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            while (i14 <= min3) {
                boolean z9 = i14 < min3 && l(i14, i15, charSequence4, charSequence3);
                if (z8 != z9 || i14 == min3) {
                    if (i14 == min3) {
                        i14 = charSequence4.length();
                        i15 = charSequence3.length();
                    }
                    i = min3;
                    int i18 = i14 - i16;
                    boolean z10 = z8;
                    int i19 = i15 - i17;
                    if (i18 > 0 || i19 > 0) {
                        if (i18 == i19 && z10) {
                            zmVar.e(charSequence4.subSequence(i16, i14));
                        } else {
                            if (i18 > 0) {
                                k(enVar, charSequence4.subSequence(i16, i14), i16, i14);
                            }
                            if (i19 > 0) {
                                k(enVar2, charSequence3.subSequence(i17, i15), i17, i15);
                            }
                        }
                    }
                    i16 = i14;
                    i17 = i15;
                    z8 = z9;
                } else {
                    i = min3;
                }
                if (z9) {
                    i15++;
                }
                i14++;
                min3 = i;
            }
        }
        if (this.n != null) {
            int i20 = 0;
            while (true) {
                dn[] dnVarArr2 = this.n;
                if (i20 >= dnVarArr2.length) {
                    break;
                }
                dn dnVar3 = dnVarArr2[i20];
                gn gnVar2 = dnVar3.i;
                if (gnVar2.getCallback() instanceof View) {
                    gm.release((View) gnVar2.getCallback(), dnVar3.a);
                }
                i20++;
            }
        }
        this.n = null;
        dn[] dnVarArr3 = this.h;
        if (dnVarArr3 == null || dnVarArr3.length != arrayList.size()) {
            this.h = new dn[arrayList.size()];
        }
        arrayList.toArray(this.h);
        b();
        dn[] dnVarArr4 = this.n;
        if (dnVarArr4 == null || dnVarArr4.length != arrayList2.size()) {
            this.n = new dn[arrayList2.size()];
        }
        arrayList2.toArray(this.n);
        ValueAnimator valueAnimator3 = this.t;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.s = z2;
        this.r = 0.0f;
        this.q = 0.0f;
        this.t = ValueAnimator.ofFloat(0.0f, 1.0f);
        Runnable runnable2 = this.c0;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.t.addUpdateListener(new f0(this, (byte) 5));
        this.t.addListener(new g0(this, (byte) 9));
        this.t.setStartDelay(0L);
        this.t.setDuration(this.w);
        this.t.setInterpolator(d0);
        this.t.start();
    }

    public final void u(int i) {
        this.a.setColor(i);
        this.C = Color.alpha(i);
    }

    public final void v(int i, boolean z) {
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Z = null;
        }
        if (!z) {
            u(i);
            return;
        }
        int color = this.a.getColor();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Z = ofFloat;
        byte b = 0;
        ofFloat.addUpdateListener(new bn(this, color, i, b));
        this.Z.addListener(new cn(this, i, b));
        this.Z.setDuration(240L);
        this.Z.setInterpolator(s33.h);
        this.Z.start();
    }

    public final void w(float f) {
        TextPaint textPaint = this.a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f);
        if (Math.abs(textSize - f) > 0.5f) {
            int i = this.N;
            if (i <= 0) {
                i = this.D.width();
            }
            int i2 = 0;
            if (this.h != null) {
                this.d = 0.0f;
                this.g = 0.0f;
                this.f = 0.0f;
                this.e = 0.0f;
                int i3 = 0;
                while (true) {
                    dn[] dnVarArr = this.h;
                    if (i3 >= dnVarArr.length) {
                        break;
                    }
                    StaticLayout j = j(i - ((int) Math.ceil(Math.min(this.d, this.j))), dnVarArr[i3].b.getText());
                    dn[] dnVarArr2 = this.h;
                    dn dnVar = dnVarArr2[i3];
                    dnVarArr2[i3] = new dn(this, j, dnVar.c, dnVar.d);
                    float f2 = this.d;
                    dn dnVar2 = this.h[i3];
                    this.d = f2 + dnVar2.f;
                    f(dnVar2);
                    i3++;
                }
            }
            if (this.n != null) {
                this.j = 0.0f;
                this.m = 0.0f;
                this.l = 0.0f;
                this.k = 0.0f;
                while (true) {
                    dn[] dnVarArr3 = this.n;
                    if (i2 >= dnVarArr3.length) {
                        break;
                    }
                    StaticLayout j2 = j(i - ((int) Math.ceil(Math.min(this.d, this.j))), dnVarArr3[i2].b.getText());
                    dn[] dnVarArr4 = this.n;
                    dn dnVar3 = dnVarArr4[i2];
                    dnVarArr4[i2] = new dn(this, j2, dnVar3.c, dnVar3.d);
                    float f3 = this.j;
                    dn dnVar4 = this.n[i2];
                    this.j = f3 + dnVar4.f;
                    g(dnVar4);
                    i2++;
                }
            }
            invalidateSelf();
        }
    }

    public final void x(Typeface typeface) {
        this.a.setTypeface(typeface);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.D.set(i, i2, i3, i4);
    }

    public gn(boolean z, boolean z2, boolean z3) {
        this(z, z2, z3, false, false);
    }
}
