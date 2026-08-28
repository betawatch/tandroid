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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class i6 extends Drawable {
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
    public f6[] f;
    public CharSequence g;
    public float h;
    public float i;
    public f6[] j;
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

    public i6(int i9) {
        this(false, true, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(int i9, int i10, CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        if (!(charSequence instanceof h6) || !(charSequence2 instanceof h6)) {
            return charSequence.charAt(i9) == charSequence2.charAt(i10);
        }
        h6 h6Var = (h6) charSequence;
        CharSequence charSequence4 = null;
        if (i9 >= 0) {
            CharSequence[] charSequenceArr = h6Var.a;
            if (i9 < charSequenceArr.length) {
                charSequence3 = charSequenceArr[i9];
                h6 h6Var2 = (h6) charSequence2;
                if (i10 >= 0) {
                    CharSequence[] charSequenceArr2 = h6Var2.a;
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
        h6 h6Var22 = (h6) charSequence2;
        if (i10 >= 0) {
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
            textPaint.setShadowLayer(this.P, 0.0f, this.Q, org.telegram.ui.ActionBar.f6.l1(f10, this.R));
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
            int i9 = 0;
            while (true) {
                f6[] f6VarArr = this.j;
                if (i9 >= f6VarArr.length) {
                    break;
                }
                f6 f6Var = f6VarArr[i9];
                i6 i6Var = f6Var.g;
                if (i6Var.getCallback() instanceof View) {
                    t5.release((View) i6Var.getCallback(), f6Var.a);
                }
                i9++;
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
        boolean z10 = this.I;
        Rect rect = this.x;
        if (z10) {
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
                int i9 = 0;
                while (true) {
                    f6[] f6VarArr = this.f;
                    int length = f6VarArr.length;
                    textPaint = this.a;
                    if (i9 >= length) {
                        break;
                    }
                    f6 f6Var = f6VarArr[i9];
                    int i10 = f6Var.d;
                    float f18 = f6Var.c;
                    if (!this.c || this.E) {
                        f14 = 0.0f;
                    } else {
                        f14 = 0.0f;
                        f18 = this.d - (f18 + f6Var.f);
                    }
                    float f19 = this.m;
                    float f20 = this.t;
                    if (f20 > f14) {
                        f19 = AndroidUtilities.cascade(f19, i9, f6VarArr.length, f20);
                    }
                    if (i10 >= 0) {
                        f6 f6Var2 = this.j[i10];
                        float f21 = f6Var2.c;
                        if (this.c && !this.E) {
                            f21 = this.h - (f21 + f6Var2.f);
                        }
                        f15 = AndroidUtilities.lerp(f21 - f6Var2.e, f18 - f6Var.e, this.m);
                        a(1.0f);
                        f16 = 0.0f;
                    } else {
                        f15 = f18 - f6Var.e;
                        f16 = (1.0f - f19) * (-textPaint.getTextSize()) * this.u * (this.n ? 1.0f : -1.0f);
                        a(f19);
                    }
                    canvas.save();
                    float f22 = i10 >= 0 ? lerp : this.d;
                    int i11 = this.b;
                    if ((i11 | (-4)) != -1) {
                        if ((i11 | (-6)) != -1) {
                            if ((i11 | (-2)) == -1) {
                                f15 = e2.c.A(width, f22, 2.0f, f15);
                            } else if (this.c) {
                            }
                        }
                        f15 += width - f22;
                    }
                    canvas.translate(f15, f16);
                    if (i10 < 0) {
                        float f23 = this.v;
                        if (f23 > f14) {
                            float lerp3 = AndroidUtilities.lerp(1.0f - f23, 1.0f, this.m);
                            canvas.scale(lerp3, lerp3, f6Var.f / 2.0f, f6Var.b.getHeight() / 2.0f);
                        }
                    }
                    f6Var.a(canvas, i10 >= 0 ? 1.0f : this.m);
                    canvas.restore();
                    i9++;
                }
                int i12 = 0;
                while (true) {
                    f6[] f6VarArr2 = this.j;
                    if (i12 >= f6VarArr2.length) {
                        break;
                    }
                    f6 f6Var3 = f6VarArr2[i12];
                    if (f6Var3.d < 0) {
                        float f24 = this.m;
                        float f25 = this.t;
                        if (f25 > 0.0f) {
                            f24 = AndroidUtilities.cascade(f24, i12, f6VarArr2.length, f25);
                        }
                        float f26 = f6Var3.c;
                        float textSize = textPaint.getTextSize() * this.u * f24 * (this.n ? 1.0f : -1.0f);
                        float f27 = 1.0f - f24;
                        a(f27);
                        canvas.save();
                        boolean z11 = this.c;
                        if (z11 && !this.E) {
                            f26 = this.h - (f26 + f6Var3.f);
                        }
                        float f28 = f26 - f6Var3.e;
                        int i13 = this.b;
                        if ((i13 | (-4)) != -1) {
                            if ((i13 | (-6)) == -1) {
                                f12 = width;
                                f13 = this.h;
                            } else if ((i13 | (-2)) == -1) {
                                f28 = e2.c.A(width, this.h, 2.0f, f28);
                            } else if (z11 && !this.E) {
                                f12 = width;
                                f13 = this.h;
                            }
                            f28 += f12 - f13;
                        }
                        canvas.translate(f28, textSize);
                        float f29 = this.v;
                        if (f29 > 0.0f) {
                            float lerp4 = AndroidUtilities.lerp(1.0f, 1.0f - f29, this.m);
                            canvas.scale(lerp4, lerp4, f6Var3.f / 2.0f, f6Var3.b.getHeight() / 2.0f);
                        }
                        f6Var3.a(canvas, f27);
                        canvas.restore();
                    }
                    i12++;
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
            for (int i14 = 0; i14 < this.f.length; i14++) {
                canvas.save();
                f6 f6Var4 = this.f[i14];
                float f31 = f6Var4.c;
                boolean z12 = this.c;
                if (z12 && !this.E) {
                    f31 = this.d - (f31 + f6Var4.f);
                }
                float f32 = f31 - f6Var4.e;
                int i15 = this.b;
                if ((i15 | (-4)) != -1) {
                    if ((i15 | (-6)) == -1) {
                        f32 += width - this.d;
                        f10 = 0.0f;
                        canvas.translate(f32, f10);
                        f6Var4.a(canvas, 1.0f);
                        canvas.restore();
                    } else if ((i15 | (-2)) == -1) {
                        f32 = e2.c.A(width, this.d, 2.0f, f32);
                    } else if (z12 && !this.E) {
                        f32 += width - this.d;
                    }
                }
                f10 = 0.0f;
                canvas.translate(f32, f10);
                f6Var4.a(canvas, 1.0f);
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

    public final StaticLayout h(int i9, CharSequence charSequence) {
        if (i9 <= 0) {
            Point point = AndroidUtilities.displaySize;
            i9 = Math.min(point.x, point.y);
        }
        int i10 = i9;
        int i11 = Build.VERSION.SDK_INT;
        TextPaint textPaint = this.a;
        return i11 >= 23 ? StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i10).setIncludePad(this.M).build() : new StaticLayout(charSequence, 0, charSequence.length(), textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, this.M, TextUtils.TruncateAt.END, i10);
    }

    public final void i(g6 g6Var, CharSequence charSequence, int i9, int i10) {
        if (!this.B || charSequence.length() <= 1) {
            g6Var.b(charSequence);
            return;
        }
        int i11 = 0;
        while (i11 < charSequence.length()) {
            int i12 = i11 + 1;
            g6Var.b(charSequence.subSequence(i11, i12));
            i11 = i12;
        }
    }

    public final void k(float f10, long j10, TimeInterpolator timeInterpolator) {
        this.u = f10;
        this.r = j10;
        this.t = 1.0f;
        this.s = timeInterpolator;
    }

    public final void l(float f10, float f11, float f12, float f13) {
        int i9 = (int) f10;
        int i10 = (int) f11;
        int i11 = (int) f12;
        int i12 = (int) f13;
        super.setBounds(i9, i10, i11, i12);
        this.x.set(i9, i10, i11, i12);
    }

    public final void m(RectF rectF) {
        setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void n(boolean z10) {
        this.I = z10;
        invalidateSelf();
    }

    public final void o(boolean z10, boolean z11, boolean z12) {
        this.y = z10;
        this.z = true;
        this.A = z11;
        this.B = z12;
    }

    public final void p(float f10, float f11, int i9) {
        this.O = true;
        this.P = f10;
        this.Q = f11;
        this.R = i9;
        this.a.setShadowLayer(f10, 0.0f, f11, i9);
    }

    public final void q(CharSequence charSequence, boolean z10, boolean z11) {
        int i9;
        int i10;
        final int i11 = 0;
        boolean z12 = (this.g == null || charSequence == null) ? false : z10;
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        final int i12 = this.G;
        if (i12 <= 0) {
            i12 = this.x.width();
        }
        final int i13 = 1;
        if (!z12) {
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
                    int i14 = 0;
                    while (true) {
                        f6[] f6VarArr = this.j;
                        if (i14 >= f6VarArr.length) {
                            break;
                        }
                        f6 f6Var = f6VarArr[i14];
                        i6 i6Var = f6Var.g;
                        if (i6Var.getCallback() instanceof View) {
                            t5.release((View) i6Var.getCallback(), f6Var.a);
                        }
                        i14++;
                    }
                }
                this.j = null;
                this.f = new f6[]{new f6(this, h(i12, charSequence2), 0.0f, -1)};
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
            this.q = z11;
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
        bg.d0 d0Var = new bg.d0(this, i12, arrayList2, arrayList);
        g6 g6Var = new g6(this) { // from class: org.telegram.ui.Components.d6
            public final /* synthetic */ i6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.g6
            public final void b(CharSequence charSequence3) {
                switch (i11) {
                    case 0:
                        i6 i6Var2 = this.b;
                        f6 f6Var2 = new f6(i6Var2, i6Var2.h(i12 - ((int) Math.ceil(i6Var2.d)), charSequence3), i6Var2.d, -1);
                        arrayList.add(f6Var2);
                        i6Var2.d += f6Var2.f;
                        i6Var2.e = Math.max(i6Var2.e, r5.getHeight());
                        break;
                    default:
                        i6 i6Var3 = this.b;
                        f6 f6Var3 = new f6(i6Var3, i6Var3.h(i12 - ((int) Math.ceil(i6Var3.h)), charSequence3), i6Var3.h, -1);
                        arrayList.add(f6Var3);
                        i6Var3.h += f6Var3.f;
                        i6Var3.i = Math.max(i6Var3.i, r5.getHeight());
                        break;
                }
            }
        };
        g6 g6Var2 = new g6(this) { // from class: org.telegram.ui.Components.d6
            public final /* synthetic */ i6 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.g6
            public final void b(CharSequence charSequence3) {
                switch (i13) {
                    case 0:
                        i6 i6Var2 = this.b;
                        f6 f6Var2 = new f6(i6Var2, i6Var2.h(i12 - ((int) Math.ceil(i6Var2.d)), charSequence3), i6Var2.d, -1);
                        arrayList2.add(f6Var2);
                        i6Var2.d += f6Var2.f;
                        i6Var2.e = Math.max(i6Var2.e, r5.getHeight());
                        break;
                    default:
                        i6 i6Var3 = this.b;
                        f6 f6Var3 = new f6(i6Var3, i6Var3.h(i12 - ((int) Math.ceil(i6Var3.h)), charSequence3), i6Var3.h, -1);
                        arrayList2.add(f6Var3);
                        i6Var3.h += f6Var3.f;
                        i6Var3.i = Math.max(i6Var3.i, r5.getHeight());
                        break;
                }
            }
        };
        CharSequence h6Var = this.y ? new h6(this.k) : this.k;
        CharSequence h6Var2 = this.y ? new h6(this.g) : this.g;
        if (this.F) {
            i(g6Var2, h6Var, 0, h6Var.length());
            i(g6Var, h6Var2, 0, h6Var2.length());
        } else if (this.z) {
            int min = Math.min(h6Var2.length(), h6Var.length());
            if (this.A) {
                ArrayList arrayList3 = new ArrayList();
                int i15 = 1;
                int i16 = 0;
                for (int i17 = 0; i17 <= min; i17++) {
                    int length = (h6Var2.length() - i17) - 1;
                    int length2 = (h6Var.length() - i17) - 1;
                    int i18 = (length < 0 || length2 < 0 || !j(length, length2, h6Var2, h6Var)) ? 0 : 1;
                    if (i13 != i18 || i17 == min) {
                        int i19 = i17 - i16;
                        if (i19 > 0) {
                            if (arrayList3.size() != 0) {
                                i13 = i15;
                            }
                            arrayList3.add(Integer.valueOf(i19));
                            i15 = i13;
                        }
                        i13 = i18;
                        i16 = i17;
                    }
                }
                int length3 = h6Var2.length() - min;
                int length4 = h6Var.length() - min;
                if (length3 > 0) {
                    i(g6Var, h6Var2.subSequence(0, length3), 0, length3);
                }
                if (length4 > 0) {
                    i(g6Var2, h6Var.subSequence(0, length4), 0, length4);
                }
                int size = arrayList3.size() - 1;
                while (size >= 0) {
                    int intValue = ((Integer) arrayList3.get(size)).intValue();
                    if ((size % 2 == 0 ? 1 : 0) == i15) {
                        i10 = size;
                        if (h6Var2.length() > h6Var.length()) {
                            d0Var.b(h6Var2.subSequence(length3, length3 + intValue));
                        } else {
                            d0Var.b(h6Var.subSequence(length4, length4 + intValue));
                        }
                    } else {
                        i10 = size;
                        int i20 = length3 + intValue;
                        i(g6Var, h6Var2.subSequence(length3, i20), length3, i20);
                        int i21 = length4 + intValue;
                        i(g6Var2, h6Var.subSequence(length4, i21), length4, i21);
                    }
                    length3 += intValue;
                    length4 += intValue;
                    size = i10 - 1;
                }
            } else {
                int i22 = 0;
                int i23 = 0;
                boolean z13 = true;
                while (i22 <= min) {
                    boolean z14 = i22 < min && j(i22, i22, h6Var2, h6Var);
                    if (z13 != z14 || i22 == min) {
                        if (i22 - i23 > 0) {
                            if (z13) {
                                i(d0Var, h6Var2.subSequence(i23, i22), i23, i22);
                            } else {
                                i(g6Var, h6Var2.subSequence(i23, i22), i23, i22);
                                i(g6Var2, h6Var.subSequence(i23, i22), i23, i22);
                            }
                        }
                        i23 = i22;
                        z13 = z14;
                    }
                    i22++;
                }
                if (h6Var2.length() - min > 0) {
                    i(g6Var, h6Var2.subSequence(min, h6Var2.length()), min, h6Var2.length());
                }
                if (h6Var.length() - min > 0) {
                    i(g6Var2, h6Var.subSequence(min, h6Var.length()), min, h6Var.length());
                }
            }
        } else {
            int min2 = Math.min(h6Var2.length(), h6Var.length());
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            boolean z15 = true;
            while (i24 <= min2) {
                boolean z16 = i24 < min2 && j(i24, i25, h6Var2, h6Var);
                if (z15 != z16 || i24 == min2) {
                    if (i24 == min2) {
                        i24 = h6Var2.length();
                        i25 = h6Var.length();
                    }
                    i9 = min2;
                    int i28 = i24 - i26;
                    boolean z17 = z15;
                    int i29 = i25 - i27;
                    if (i28 > 0 || i29 > 0) {
                        if (i28 == i29 && z17) {
                            d0Var.b(h6Var2.subSequence(i26, i24));
                        } else {
                            if (i28 > 0) {
                                i(g6Var, h6Var2.subSequence(i26, i24), i26, i24);
                            }
                            if (i29 > 0) {
                                i(g6Var2, h6Var.subSequence(i27, i25), i27, i25);
                            }
                        }
                    }
                    i26 = i24;
                    i27 = i25;
                    z15 = z16;
                } else {
                    i9 = min2;
                }
                if (z16) {
                    i25++;
                }
                i24++;
                min2 = i9;
            }
        }
        if (this.j != null) {
            int i30 = 0;
            while (true) {
                f6[] f6VarArr2 = this.j;
                if (i30 >= f6VarArr2.length) {
                    break;
                }
                f6 f6Var2 = f6VarArr2[i30];
                i6 i6Var2 = f6Var2.g;
                if (i6Var2.getCallback() instanceof View) {
                    t5.release((View) i6Var2.getCallback(), f6Var2.a);
                }
                i30++;
            }
        }
        this.j = null;
        f6[] f6VarArr3 = this.f;
        if (f6VarArr3 == null || f6VarArr3.length != arrayList.size()) {
            this.f = new f6[arrayList.size()];
        }
        arrayList.toArray(this.f);
        c();
        f6[] f6VarArr4 = this.j;
        if (f6VarArr4 == null || f6VarArr4.length != arrayList2.size()) {
            this.j = new f6[arrayList2.size()];
        }
        arrayList2.toArray(this.j);
        ValueAnimator valueAnimator3 = this.o;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.n = z11;
        this.m = 0.0f;
        this.o = ValueAnimator.ofFloat(0.0f, 1.0f);
        Runnable runnable2 = this.V;
        if (runnable2 != null) {
            runnable2.run();
        }
        this.o.addUpdateListener(new e6(this, 0));
        this.o.addListener(new org.telegram.ui.xp(this, 4));
        this.o.setStartDelay(0L);
        this.o.setDuration(this.r);
        this.o.setInterpolator(this.s);
        this.o.start();
    }

    public final void r(int i9) {
        this.a.setColor(i9);
        this.w = Color.alpha(i9);
    }

    public final void s(int i9, boolean z10) {
        ValueAnimator valueAnimator = this.S;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.S = null;
        }
        if (!z10) {
            r(i9);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.S = ofFloat;
        ofFloat.addUpdateListener(new kh.v4(this, this.a.getColor(), i9, 2));
        this.S.addListener(new mh.o2(this, i9, 3));
        this.S.setDuration(240L);
        this.S.setInterpolator(gr.h);
        this.S.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        this.w = i9;
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
            int i9 = this.G;
            if (i9 <= 0) {
                i9 = this.x.width();
            }
            int i10 = 0;
            if (this.f != null) {
                this.d = 0.0f;
                this.e = 0.0f;
                int i11 = 0;
                while (true) {
                    f6[] f6VarArr = this.f;
                    if (i11 >= f6VarArr.length) {
                        break;
                    }
                    StaticLayout h = h(i9 - ((int) Math.ceil(Math.min(this.d, this.h))), f6VarArr[i11].b.getText());
                    f6[] f6VarArr2 = this.f;
                    f6 f6Var = f6VarArr2[i11];
                    f6VarArr2[i11] = new f6(this, h, f6Var.c, f6Var.d);
                    this.d = this.d + this.f[i11].f;
                    this.e = Math.max(this.e, r4.b.getHeight());
                    i11++;
                }
            }
            if (this.j != null) {
                this.h = 0.0f;
                this.i = 0.0f;
                while (true) {
                    f6[] f6VarArr3 = this.j;
                    if (i10 >= f6VarArr3.length) {
                        break;
                    }
                    StaticLayout h10 = h(i9 - ((int) Math.ceil(Math.min(this.d, this.h))), f6VarArr3[i10].b.getText());
                    f6[] f6VarArr4 = this.j;
                    f6 f6Var2 = f6VarArr4[i10];
                    f6VarArr4[i10] = new f6(this, h10, f6Var2.c, f6Var2.d);
                    this.h = this.h + this.j[i10].f;
                    this.i = Math.max(this.i, r2.b.getHeight());
                    i10++;
                }
            }
            invalidateSelf();
        }
    }

    public final void u(Typeface typeface) {
        this.a.setTypeface(typeface);
    }

    public i6(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = new TextPaint(1);
        this.b = 0;
        this.c = false;
        this.l = 0;
        this.m = 0.0f;
        this.n = true;
        this.r = 320L;
        this.s = gr.h;
        this.t = -1.0f;
        this.u = 0.3f;
        this.v = 0.0f;
        this.w = 255;
        this.x = new Rect();
        this.M = true;
        this.N = true;
        this.O = false;
        this.y = z10;
        this.z = z11;
        this.A = z12;
        this.B = z13;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i9, int i10, int i11, int i12) {
        super.setBounds(i9, i10, i11, i12);
        this.x.set(i9, i10, i11, i12);
    }
}
