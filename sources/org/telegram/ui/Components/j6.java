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
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class j6 extends Drawable {
    public boolean A;
    public boolean B;
    public fg C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public float H;
    public boolean I;
    public LinearGradient J;
    public Matrix K;
    public Paint L;
    public boolean M;
    public boolean N;
    public boolean O;
    public float P;
    public float Q;
    public int R;
    public ValueAnimator S;
    public int T;
    public ColorFilter U;
    public Runnable V;
    public final TextPaint a;
    public int b;
    public boolean c;
    public float d;
    public float e;
    public g6[] f;
    public CharSequence g;
    public float h;
    public float i;
    public g6[] j;
    public CharSequence k;
    public int l;
    public float m;
    public boolean n;
    public ValueAnimator o;
    public CharSequence p;
    public boolean q;
    public long r;
    public TimeInterpolator s;
    public float t;
    public float u;
    public float v;
    public int w;
    public final Rect x;
    public boolean y;
    public boolean z;

    public j6(int i10) {
        this(false, true, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(int i10, int i11, CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        if (!(charSequence instanceof i6) || !(charSequence2 instanceof i6)) {
            return charSequence.charAt(i10) == charSequence2.charAt(i11);
        }
        i6 i6Var = (i6) charSequence;
        CharSequence charSequence4 = null;
        if (i10 >= 0) {
            CharSequence[] charSequenceArr = i6Var.a;
            if (i10 < charSequenceArr.length) {
                charSequence3 = charSequenceArr[i10];
                i6 i6Var2 = (i6) charSequence2;
                if (i11 >= 0) {
                    CharSequence[] charSequenceArr2 = i6Var2.a;
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
        i6 i6Var22 = (i6) charSequence2;
        if (i11 >= 0) {
        }
        if (charSequence3 == null) {
        }
        if (charSequence3 != null) {
            return false;
        }
    }

    public final void a(float f10) {
        TextPaint textPaint = this.a;
        textPaint.setAlpha((int) (this.w * f10));
        if (this.O) {
            textPaint.setShadowLayer(this.P, 0.0f, this.Q, org.telegram.ui.ActionBar.k6.l1(f10, this.R));
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void c() {
        if (this.j != null) {
            int i10 = 0;
            while (true) {
                g6[] g6VarArr = this.j;
                if (i10 >= g6VarArr.length) {
                    break;
                }
                g6 g6Var = g6VarArr[i10];
                j6 j6Var = g6Var.g;
                if (j6Var.getCallback() instanceof View) {
                    u5.release((View) j6Var.getCallback(), g6Var.a);
                }
                i10++;
            }
        }
        this.j = null;
    }

    public final float d() {
        return (this.f == null || this.j == null) ? this.d : AndroidUtilities.lerp(this.h, this.d, this.m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0101, code lost:
    
        if (r26.E == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f10;
        float f11;
        TextPaint textPaint;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        boolean z4 = this.I;
        Rect rect = this.x;
        if (z4) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.right -= this.H;
            canvas.saveLayerAlpha(rectF, 255, 31);
        }
        canvas.save();
        canvas.translate(rect.left, rect.top);
        int width = rect.width();
        int height = rect.height();
        if (this.f != null && this.j != null) {
            float f17 = this.m;
            if (f17 != 1.0f) {
                float lerp = AndroidUtilities.lerp(this.h, this.d, f17);
                float lerp2 = AndroidUtilities.lerp(this.i, this.e, this.m);
                if (this.N) {
                    canvas.translate(0.0f, (height - lerp2) / 2.0f);
                }
                int i10 = 0;
                while (true) {
                    g6[] g6VarArr = this.f;
                    int length = g6VarArr.length;
                    textPaint = this.a;
                    if (i10 >= length) {
                        break;
                    }
                    g6 g6Var = g6VarArr[i10];
                    int i11 = g6Var.d;
                    float f18 = g6Var.c;
                    if (!this.c || this.E) {
                        f14 = 0.0f;
                    } else {
                        f14 = 0.0f;
                        f18 = this.d - (f18 + g6Var.f);
                    }
                    float f19 = this.m;
                    float f20 = this.t;
                    if (f20 > f14) {
                        f19 = AndroidUtilities.cascade(f19, i10, g6VarArr.length, f20);
                    }
                    if (i11 >= 0) {
                        g6 g6Var2 = this.j[i11];
                        float f21 = g6Var2.c;
                        if (this.c && !this.E) {
                            f21 = this.h - (f21 + g6Var2.f);
                        }
                        f15 = AndroidUtilities.lerp(f21 - g6Var2.e, f18 - g6Var.e, this.m);
                        a(1.0f);
                        f16 = 0.0f;
                    } else {
                        f15 = f18 - g6Var.e;
                        f16 = (1.0f - f19) * (-textPaint.getTextSize()) * this.u * (this.n ? 1.0f : -1.0f);
                        a(f19);
                    }
                    canvas.save();
                    float f22 = i11 >= 0 ? lerp : this.d;
                    int i12 = this.b;
                    if ((i12 | (-4)) != -1) {
                        if ((i12 | (-6)) != -1) {
                            if ((i12 | (-2)) == -1) {
                                f15 = e2.c.x(width, f22, 2.0f, f15);
                            } else if (this.c) {
                            }
                        }
                        f15 += width - f22;
                    }
                    canvas.translate(f15, f16);
                    if (i11 < 0) {
                        float f23 = this.v;
                        if (f23 > f14) {
                            float lerp3 = AndroidUtilities.lerp(1.0f - f23, 1.0f, this.m);
                            canvas.scale(lerp3, lerp3, g6Var.f / 2.0f, g6Var.b.getHeight() / 2.0f);
                        }
                    }
                    g6Var.a(canvas, i11 >= 0 ? 1.0f : this.m);
                    canvas.restore();
                    i10++;
                }
                int i13 = 0;
                while (true) {
                    g6[] g6VarArr2 = this.j;
                    if (i13 >= g6VarArr2.length) {
                        break;
                    }
                    g6 g6Var3 = g6VarArr2[i13];
                    if (g6Var3.d < 0) {
                        float f24 = this.m;
                        float f25 = this.t;
                        if (f25 > 0.0f) {
                            f24 = AndroidUtilities.cascade(f24, i13, g6VarArr2.length, f25);
                        }
                        float f26 = g6Var3.c;
                        float textSize = textPaint.getTextSize() * this.u * f24 * (this.n ? 1.0f : -1.0f);
                        float f27 = 1.0f - f24;
                        a(f27);
                        canvas.save();
                        boolean z10 = this.c;
                        if (z10 && !this.E) {
                            f26 = this.h - (f26 + g6Var3.f);
                        }
                        float f28 = f26 - g6Var3.e;
                        int i14 = this.b;
                        if ((i14 | (-4)) != -1) {
                            if ((i14 | (-6)) == -1) {
                                f12 = width;
                                f13 = this.h;
                            } else if ((i14 | (-2)) == -1) {
                                f28 = e2.c.x(width, this.h, 2.0f, f28);
                            } else if (z10 && !this.E) {
                                f12 = width;
                                f13 = this.h;
                            }
                            f28 += f12 - f13;
                        }
                        canvas.translate(f28, textSize);
                        float f29 = this.v;
                        if (f29 > 0.0f) {
                            float lerp4 = AndroidUtilities.lerp(1.0f, 1.0f - f29, this.m);
                            canvas.scale(lerp4, lerp4, g6Var3.f / 2.0f, g6Var3.b.getHeight() / 2.0f);
                        }
                        g6Var3.a(canvas, f27);
                        canvas.restore();
                    }
                    i13++;
                }
                canvas.restore();
                if (this.I) {
                    return;
                }
                float dp = AndroidUtilities.dp(16.0f);
                if (this.J == null) {
                    f11 = dp;
                    this.J = new LinearGradient(0.0f, 0.0f, f11, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.K = new Matrix();
                    Paint paint = new Paint(1);
                    this.L = paint;
                    paint.setShader(this.J);
                    this.L.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                } else {
                    f11 = dp;
                }
                this.K.reset();
                this.K.postTranslate((rect.right - this.H) - f11, 0.0f);
                this.J.setLocalMatrix(this.K);
                float f30 = rect.right - this.H;
                canvas.drawRect(f30 - f11, rect.top, f30 + AndroidUtilities.dp(1.0f), rect.bottom, this.L);
                canvas.restore();
                return;
            }
        }
        if (this.N) {
            canvas.translate(0.0f, (height - this.e) / 2.0f);
        }
        if (this.f != null) {
            a(1.0f);
            for (int i15 = 0; i15 < this.f.length; i15++) {
                canvas.save();
                g6 g6Var4 = this.f[i15];
                float f31 = g6Var4.c;
                boolean z11 = this.c;
                if (z11 && !this.E) {
                    f31 = this.d - (f31 + g6Var4.f);
                }
                float f32 = f31 - g6Var4.e;
                int i16 = this.b;
                if ((i16 | (-4)) != -1) {
                    if ((i16 | (-6)) == -1) {
                        f32 += width - this.d;
                        f10 = 0.0f;
                        canvas.translate(f32, f10);
                        g6Var4.a(canvas, 1.0f);
                        canvas.restore();
                    } else if ((i16 | (-2)) == -1) {
                        f32 = e2.c.x(width, this.d, 2.0f, f32);
                    } else if (z11 && !this.E) {
                        f32 += width - this.d;
                    }
                }
                f10 = 0.0f;
                canvas.translate(f32, f10);
                g6Var4.a(canvas, 1.0f);
                canvas.restore();
            }
        }
        canvas.restore();
        if (this.I) {
        }
    }

    public final float e() {
        return Math.max(this.d, this.h);
    }

    public final boolean f() {
        ValueAnimator valueAnimator = this.o;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final float g() {
        CharSequence charSequence = this.k;
        float f10 = 0.0f;
        float f11 = (charSequence == null || charSequence.length() <= 0) ? 0.0f : 1.0f;
        CharSequence charSequence2 = this.g;
        if (charSequence2 != null && charSequence2.length() > 0) {
            f10 = 1.0f;
        }
        return AndroidUtilities.lerp(f11, f10, this.k != null ? this.m : 1.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.x;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final StaticLayout h(int i10, CharSequence charSequence) {
        if (i10 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i10 = Math.min(point.x, point.y);
        }
        int i11 = i10;
        int i12 = Build.VERSION.SDK_INT;
        TextPaint textPaint = this.a;
        return i12 >= 23 ? StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i11).setIncludePad(this.M).build() : new StaticLayout(charSequence, 0, charSequence.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, this.M, TextUtils.TruncateAt.END, i11);
    }

    public final void i(h6 h6Var, CharSequence charSequence, int i10, int i11) {
        if (!this.B || charSequence.length() <= 1) {
            h6Var.a(charSequence);
            return;
        }
        int i12 = 0;
        while (i12 < charSequence.length()) {
            int i13 = i12 + 1;
            h6Var.a(charSequence.subSequence(i12, i13));
            i12 = i13;
        }
    }

    public final void k(float f10, long j10, TimeInterpolator timeInterpolator) {
        this.u = f10;
        this.r = j10;
        this.t = 1.0f;
        this.s = timeInterpolator;
    }

    public final void l(float f10, float f11, float f12, float f13) {
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = (int) f12;
        int i13 = (int) f13;
        super.setBounds(i10, i11, i12, i13);
        this.x.set(i10, i11, i12, i13);
    }

    public final void m(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void n(boolean z4) {
        this.I = z4;
        invalidateSelf();
    }

    public final void o(boolean z4, boolean z10, boolean z11) {
        this.y = z4;
        this.z = true;
        this.A = z10;
        this.B = z11;
    }

    public final void p(float f10, float f11, int i10) {
        this.O = true;
        this.P = f10;
        this.Q = f11;
        this.R = i10;
        this.a.setShadowLayer(f10, 0.0f, f11, i10);
    }

    public final void q(CharSequence charSequence, boolean z4, boolean z10) {
        int i10;
        int i11;
        final int i12 = 0;
        boolean z11 = (this.g == null || charSequence == null) ? false : z4;
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        final int i13 = this.G;
        if (i13 <= 0) {
            i13 = this.x.width();
        }
        final int i14 = 1;
        if (!z11) {
            ValueAnimator valueAnimator = this.o;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.o = null;
            this.p = null;
            this.q = false;
            this.m = 0.0f;
            if (!charSequence2.equals(this.g)) {
                if (this.j != null) {
                    int i15 = 0;
                    while (true) {
                        g6[] g6VarArr = this.j;
                        if (i15 >= g6VarArr.length) {
                            break;
                        }
                        g6 g6Var = g6VarArr[i15];
                        j6 j6Var = g6Var.g;
                        if (j6Var.getCallback() instanceof View) {
                            u5.release((View) j6Var.getCallback(), g6Var.a);
                        }
                        i15++;
                    }
                }
                this.j = null;
                this.f = new g6[]{new g6(this, h(i13, charSequence2), 0.0f, -1)};
                this.g = charSequence2;
                this.d = this.f[0].f;
                this.e = r1.b.getHeight();
                this.c = AndroidUtilities.isRTL(this.g);
            }
            c();
            this.k = null;
            this.h = 0.0f;
            this.i = 0.0f;
            invalidateSelf();
            Runnable runnable = this.V;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (TextUtils.equals(charSequence2, this.g)) {
            return;
        }
        if (this.D) {
            ValueAnimator valueAnimator2 = this.o;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.o = null;
            }
        } else if (f()) {
            this.p = charSequence2;
            this.q = z10;
            return;
        }
        this.k = this.g;
        this.g = charSequence2;
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        this.e = 0.0f;
        this.d = 0.0f;
        this.i = 0.0f;
        this.h = 0.0f;
        this.c = AndroidUtilities.isRTL(this.g);
        hg.a0 a0Var = new hg.a0(this, i13, arrayList2, arrayList);
        h6 h6Var = new h6(this) { // from class: org.telegram.ui.Components.e6
            public final /* synthetic */ j6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.h6
            public final void a(CharSequence charSequence3) {
                switch (i12) {
                    case 0:
                        j6 j6Var2 = this.b;
                        g6 g6Var2 = new g6(j6Var2, j6Var2.h(i13 - ((int) Math.ceil(j6Var2.d)), charSequence3), j6Var2.d, -1);
                        arrayList.add(g6Var2);
                        j6Var2.d += g6Var2.f;
                        j6Var2.e = Math.max(j6Var2.e, r5.getHeight());
                        break;
                    default:
                        j6 j6Var3 = this.b;
                        g6 g6Var3 = new g6(j6Var3, j6Var3.h(i13 - ((int) Math.ceil(j6Var3.h)), charSequence3), j6Var3.h, -1);
                        arrayList.add(g6Var3);
                        j6Var3.h += g6Var3.f;
                        j6Var3.i = Math.max(j6Var3.i, r5.getHeight());
                        break;
                }
            }
        };
        h6 h6Var2 = new h6(this) { // from class: org.telegram.ui.Components.e6
            public final /* synthetic */ j6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.h6
            public final void a(CharSequence charSequence3) {
                switch (i14) {
                    case 0:
                        j6 j6Var2 = this.b;
                        g6 g6Var2 = new g6(j6Var2, j6Var2.h(i13 - ((int) Math.ceil(j6Var2.d)), charSequence3), j6Var2.d, -1);
                        arrayList2.add(g6Var2);
                        j6Var2.d += g6Var2.f;
                        j6Var2.e = Math.max(j6Var2.e, r5.getHeight());
                        break;
                    default:
                        j6 j6Var3 = this.b;
                        g6 g6Var3 = new g6(j6Var3, j6Var3.h(i13 - ((int) Math.ceil(j6Var3.h)), charSequence3), j6Var3.h, -1);
                        arrayList2.add(g6Var3);
                        j6Var3.h += g6Var3.f;
                        j6Var3.i = Math.max(j6Var3.i, r5.getHeight());
                        break;
                }
            }
        };
        CharSequence i6Var = this.y ? new i6(this.k) : this.k;
        CharSequence i6Var2 = this.y ? new i6(this.g) : this.g;
        if (this.F) {
            i(h6Var2, i6Var, 0, i6Var.length());
            i(h6Var, i6Var2, 0, i6Var2.length());
        } else if (this.z) {
            int min = Math.min(i6Var2.length(), i6Var.length());
            if (this.A) {
                ArrayList arrayList3 = new ArrayList();
                int i16 = 1;
                int i17 = 0;
                for (int i18 = 0; i18 <= min; i18++) {
                    int length = (i6Var2.length() - i18) - 1;
                    int length2 = (i6Var.length() - i18) - 1;
                    int i19 = (length < 0 || length2 < 0 || !j(length, length2, i6Var2, i6Var)) ? 0 : 1;
                    if (i14 != i19 || i18 == min) {
                        int i20 = i18 - i17;
                        if (i20 > 0) {
                            if (arrayList3.size() != 0) {
                                i14 = i16;
                            }
                            arrayList3.add(Integer.valueOf(i20));
                            i16 = i14;
                        }
                        i14 = i19;
                        i17 = i18;
                    }
                }
                int length3 = i6Var2.length() - min;
                int length4 = i6Var.length() - min;
                if (length3 > 0) {
                    i(h6Var, i6Var2.subSequence(0, length3), 0, length3);
                }
                if (length4 > 0) {
                    i(h6Var2, i6Var.subSequence(0, length4), 0, length4);
                }
                int size = arrayList3.size() - 1;
                while (size >= 0) {
                    int intValue = ((Integer) arrayList3.get(size)).intValue();
                    if ((size % 2 == 0 ? 1 : 0) == i16) {
                        i11 = size;
                        if (i6Var2.length() > i6Var.length()) {
                            a0Var.a(i6Var2.subSequence(length3, length3 + intValue));
                        } else {
                            a0Var.a(i6Var.subSequence(length4, length4 + intValue));
                        }
                    } else {
                        i11 = size;
                        int i21 = length3 + intValue;
                        i(h6Var, i6Var2.subSequence(length3, i21), length3, i21);
                        int i22 = length4 + intValue;
                        i(h6Var2, i6Var.subSequence(length4, i22), length4, i22);
                    }
                    length3 += intValue;
                    length4 += intValue;
                    size = i11 - 1;
                }
            } else {
                int i23 = 0;
                int i24 = 0;
                boolean z12 = true;
                while (i23 <= min) {
                    boolean z13 = i23 < min && j(i23, i23, i6Var2, i6Var);
                    if (z12 != z13 || i23 == min) {
                        if (i23 - i24 > 0) {
                            if (z12) {
                                i(a0Var, i6Var2.subSequence(i24, i23), i24, i23);
                            } else {
                                i(h6Var, i6Var2.subSequence(i24, i23), i24, i23);
                                i(h6Var2, i6Var.subSequence(i24, i23), i24, i23);
                            }
                        }
                        i24 = i23;
                        z12 = z13;
                    }
                    i23++;
                }
                if (i6Var2.length() - min > 0) {
                    i(h6Var, i6Var2.subSequence(min, i6Var2.length()), min, i6Var2.length());
                }
                if (i6Var.length() - min > 0) {
                    i(h6Var2, i6Var.subSequence(min, i6Var.length()), min, i6Var.length());
                }
            }
        } else {
            int min2 = Math.min(i6Var2.length(), i6Var.length());
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            int i28 = 0;
            boolean z14 = true;
            while (i25 <= min2) {
                boolean z15 = i25 < min2 && j(i25, i26, i6Var2, i6Var);
                if (z14 != z15 || i25 == min2) {
                    if (i25 == min2) {
                        i25 = i6Var2.length();
                        i26 = i6Var.length();
                    }
                    i10 = min2;
                    int i29 = i25 - i27;
                    boolean z16 = z14;
                    int i30 = i26 - i28;
                    if (i29 > 0 || i30 > 0) {
                        if (i29 == i30 && z16) {
                            a0Var.a(i6Var2.subSequence(i27, i25));
                        } else {
                            if (i29 > 0) {
                                i(h6Var, i6Var2.subSequence(i27, i25), i27, i25);
                            }
                            if (i30 > 0) {
                                i(h6Var2, i6Var.subSequence(i28, i26), i28, i26);
                            }
                        }
                    }
                    i27 = i25;
                    i28 = i26;
                    z14 = z15;
                } else {
                    i10 = min2;
                }
                if (z15) {
                    i26++;
                }
                i25++;
                min2 = i10;
            }
        }
        if (this.j != null) {
            int i31 = 0;
            while (true) {
                g6[] g6VarArr2 = this.j;
                if (i31 >= g6VarArr2.length) {
                    break;
                }
                g6 g6Var2 = g6VarArr2[i31];
                j6 j6Var2 = g6Var2.g;
                if (j6Var2.getCallback() instanceof View) {
                    u5.release((View) j6Var2.getCallback(), g6Var2.a);
                }
                i31++;
            }
        }
        this.j = null;
        g6[] g6VarArr3 = this.f;
        if (g6VarArr3 == null || g6VarArr3.length != arrayList.size()) {
            this.f = new g6[arrayList.size()];
        }
        arrayList.toArray(this.f);
        c();
        g6[] g6VarArr4 = this.j;
        if (g6VarArr4 == null || g6VarArr4.length != arrayList2.size()) {
            this.j = new g6[arrayList2.size()];
        }
        arrayList2.toArray(this.j);
        ValueAnimator valueAnimator3 = this.o;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.n = z10;
        this.m = 0.0f;
        this.o = ValueAnimator.ofFloat(0.0f, 1.0f);
        Runnable runnable2 = this.V;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.o.addUpdateListener(new f6(this, 0));
        this.o.addListener(new org.telegram.ui.s5(this, 27));
        this.o.setStartDelay(0L);
        this.o.setDuration(this.r);
        this.o.setInterpolator(this.s);
        this.o.start();
    }

    public final void r(int i10) {
        this.a.setColor(i10);
        this.w = Color.alpha(i10);
    }

    public final void s(int i10, boolean z4) {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.S = null;
        }
        if (!z4) {
            r(i10);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new eg.e0(this, this.a.getColor(), i10, 2));
        this.S.addListener(new org.telegram.ui.Cells.b4(this, i10, 1));
        this.S.setDuration(240L);
        this.S.setInterpolator(pr.h);
        this.S.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.w = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.x.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public final void t(float f10) {
        TextPaint textPaint = this.a;
        float textSize = textPaint.getTextSize();
        textPaint.setTextSize(f10);
        if (Math.abs(textSize - f10) > 0.5f) {
            int i10 = this.G;
            if (i10 <= 0) {
                i10 = this.x.width();
            }
            int i11 = 0;
            if (this.f != null) {
                this.d = 0.0f;
                this.e = 0.0f;
                int i12 = 0;
                while (true) {
                    g6[] g6VarArr = this.f;
                    if (i12 >= g6VarArr.length) {
                        break;
                    }
                    StaticLayout h = h(i10 - ((int) Math.ceil(Math.min(this.d, this.h))), g6VarArr[i12].b.getText());
                    g6[] g6VarArr2 = this.f;
                    g6 g6Var = g6VarArr2[i12];
                    g6VarArr2[i12] = new g6(this, h, g6Var.c, g6Var.d);
                    this.d = this.d + this.f[i12].f;
                    this.e = Math.max(this.e, r4.b.getHeight());
                    i12++;
                }
            }
            if (this.j != null) {
                this.h = 0.0f;
                this.i = 0.0f;
                while (true) {
                    g6[] g6VarArr3 = this.j;
                    if (i11 >= g6VarArr3.length) {
                        break;
                    }
                    StaticLayout h9 = h(i10 - ((int) Math.ceil(Math.min(this.d, this.h))), g6VarArr3[i11].b.getText());
                    g6[] g6VarArr4 = this.j;
                    g6 g6Var2 = g6VarArr4[i11];
                    g6VarArr4[i11] = new g6(this, h9, g6Var2.c, g6Var2.d);
                    this.h = this.h + this.j[i11].f;
                    this.i = Math.max(this.i, r2.b.getHeight());
                    i11++;
                }
            }
            invalidateSelf();
        }
    }

    public final void u(Typeface typeface) {
        this.a.setTypeface(typeface);
    }

    public j6(boolean z4, boolean z10, boolean z11, boolean z12) {
        this.a = new TextPaint(1);
        this.b = 0;
        this.c = false;
        this.l = 0;
        this.m = 0.0f;
        this.n = true;
        this.r = 320L;
        this.s = pr.h;
        this.t = -1.0f;
        this.u = 0.3f;
        this.v = 0.0f;
        this.w = 255;
        this.x = new Rect();
        this.M = true;
        this.N = true;
        this.O = false;
        this.y = z4;
        this.z = z10;
        this.A = z11;
        this.B = z12;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        this.x.set(i10, i11, i12, i13);
    }
}
