package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class CheckBoxBase {
    public static Paint I;
    public static Paint J;
    public int A;
    public float B;
    public String C;
    public xf2 D;
    public m17 E;
    public wjb F;
    public js4 G;
    public long H;
    public View a;
    public final Paint d;
    public final Paint f;
    public TextPaint g;
    public boolean i;
    public boolean l;
    public boolean n;
    public float o;
    public ObjectAnimator p;
    public boolean q;
    public int s;
    public int t;
    public int u;
    public float v;
    public float w;
    public int x;
    public boolean y;
    public boolean z;
    public final Rect b = new Rect();
    public final RectF c = new RectF();
    public float e = 1.0f;
    public float h = 1.0f;
    public final Path j = new Path();
    public boolean k = true;
    public float m = 1.0f;
    public int r = bkb.j7;

    public CheckBoxBase(int i, wjb wjbVar, View view) {
        int i2 = bkb.bd;
        this.s = i2;
        this.t = i2;
        this.u = bkb.g5;
        this.v = 0.0f;
        this.w = 1.0f;
        this.z = true;
        this.G = new k32((byte) 4);
        this.H = 200L;
        this.F = wjbVar;
        this.a = view;
        this.B = i;
        if (I == null) {
            I = new Paint(1);
        }
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(gl.L(1.9f));
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(gl.L(1.2f));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0246 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        float f;
        float f2;
        float f3;
        boolean z;
        Rect rect;
        int i;
        int i2;
        float f4;
        float f5;
        Canvas canvas2;
        int i3;
        int i4;
        int i5;
        Paint paint;
        int i6;
        float f6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        float f7;
        float f8;
        int i10;
        m17 m17Var;
        int i11;
        int i12;
        int i13;
        RectF rectF;
        int i14;
        int i15;
        float L = gl.L(this.B / 2.0f);
        int i16 = this.A;
        if (i16 == 12 || i16 == 13) {
            L = gl.L(10.0f);
        } else if (i16 != 0 && i16 != 11) {
            f = L;
            f2 = L - gl.L(0.2f);
            float f9 = !this.n ? 1.0f : this.o;
            f3 = f9 < 0.5f ? 1.0f : f9 / 0.5f;
            Rect rect2 = this.b;
            int centerX = rect2.centerX();
            int centerY = rect2.centerY();
            z = !this.i && f3 > 0.0f && f9 >= 0.5f && !this.n && this.C == null;
            if (z) {
                rect = rect2;
                i = centerX;
                i2 = centerY;
                f4 = 0.0f;
                f5 = f9;
                canvas2 = canvas;
            } else {
                float f10 = centerX;
                float f11 = centerY;
                f4 = 0.0f;
                rect = rect2;
                i = centerX;
                i2 = centerY;
                f5 = f9;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(f10 - f, f11 - f, f10 + f, f11 + f, kk7.d4, 31);
            }
            i3 = this.s;
            boolean z3 = this.z;
            Paint paint2 = this.f;
            if (i3 >= 0) {
                if (z3) {
                    I.setColor(Color.argb((int) (this.m * 25.0f), 0, 0, 0));
                    if (this.A == 8) {
                        paint2.setColor(bkb.v0(this.t, this.F));
                    } else {
                        i4 = -1;
                        paint2.setColor(gl.R0(f5, this.m, -1, bkb.v0(this.r, this.F)));
                    }
                } else {
                    i4 = -1;
                    if (this.x != 0) {
                        paint2.setColor(0);
                    } else {
                        int i17 = this.t;
                        if (i17 < 0) {
                            i17 = this.r;
                        }
                        paint2.setColor(gl.R0(f5, this.m, 16777215, bkb.v0(i17, this.F)));
                    }
                }
                if (this.z || (i15 = this.A) < 0 || i15 == 12 || i15 == 13) {
                    i5 = i4;
                    paint = paint2;
                    i6 = i2;
                    f6 = 1.0f;
                    i7 = 7;
                } else if (i15 == 8 || i15 == 10 || i15 == 14) {
                    i6 = i2;
                    if (this.v > f4) {
                        float L2 = f - gl.L(1.5f);
                        float R1 = gl.R1(L2, this.v, this.w);
                        float f12 = i;
                        float f13 = i6;
                        f6 = 1.0f;
                        i7 = 7;
                        i5 = -1;
                        canvas2.drawRoundRect(f12 - L2, f13 - L2, f12 + L2, f13 + L2, R1, R1, paint2);
                        paint = paint2;
                    } else {
                        paint = paint2;
                        f6 = 1.0f;
                        i7 = 7;
                        i5 = -1;
                        canvas2.drawCircle(i, i6, f - gl.L(1.5f), paint);
                    }
                } else {
                    if (i15 == 6 || i15 == 7) {
                        i6 = i2;
                        float f14 = i;
                        float f15 = i6;
                        canvas2.drawCircle(f14, f15, f - gl.L(1.0f), I);
                        canvas2.drawCircle(f14, f15, f - gl.L(1.5f), paint2);
                        paint = paint2;
                        f6 = 1.0f;
                        i7 = 7;
                    } else {
                        i6 = i2;
                        canvas2.drawCircle(i, i6, f, I);
                        i7 = 7;
                        paint = paint2;
                        f6 = 1.0f;
                    }
                    i5 = -1;
                }
                I.setColor(bkb.v0(this.r, this.F));
                i8 = this.A;
                if (i8 != i5 && i8 != i7 && i8 != 8 && i8 != 9 && i8 != 10 && i8 != 14) {
                    if (i8 == 12 && i8 != 13) {
                        if (i8 == 0 || i8 == 11) {
                            canvas2.drawCircle(i, i6, f, paint);
                        } else {
                            float f16 = i;
                            float f17 = f16 - f2;
                            float f18 = i6;
                            float f19 = f18 - f2;
                            float f20 = f16 + f2;
                            float f21 = f18 + f2;
                            RectF rectF2 = this.c;
                            rectF2.set(f17, f19, f20, f21);
                            int i18 = this.A;
                            if (i18 == 6) {
                                i11 = (int) ((-360.0f) * f5);
                                i12 = 0;
                            } else if (i18 == 1) {
                                i11 = (int) ((-270.0f) * f5);
                                i12 = -90;
                            } else {
                                i11 = (int) (270.0f * f5);
                                if (k96.a0) {
                                    i11 = -i11;
                                }
                                i12 = 90;
                            }
                            if (i18 == 6) {
                                int v0 = bkb.v0(this.u, this.F);
                                int alpha = Color.alpha(v0);
                                paint.setColor(v0);
                                paint.setAlpha((int) (alpha * f5));
                                i13 = i11;
                                rectF = rectF2;
                                i14 = i12;
                                canvas2.drawArc(rectF, i12, i11, false, paint);
                                int v02 = bkb.v0(bkb.W9, this.F);
                                int alpha2 = Color.alpha(v02);
                                paint.setColor(v02);
                                paint.setAlpha((int) (alpha2 * f5));
                            } else {
                                i13 = i11;
                                rectF = rectF2;
                                i14 = i12;
                            }
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, i14, i13, false, paint);
                        }
                        if (f3 > f4) {
                            float f22 = f5 < 0.5f ? 0.0f : (f5 - 0.5f) / 0.5f;
                            int i19 = this.A;
                            if (i19 == 9) {
                                I.setColor(bkb.v0(this.t, this.F));
                            } else if (i19 == 11 || i19 == 6 || i19 == i7 || i19 == 10 || ((!this.z && this.s >= 0) || i19 == 14)) {
                                I.setColor(bkb.v0(this.s, this.F));
                            } else {
                                int i20 = this.x;
                                Paint paint3 = I;
                                if (i20 != 0) {
                                    paint3.setColor(i20);
                                } else {
                                    paint3.setColor(bkb.v0(this.k ? bkb.h7 : bkb.i7, this.F));
                                }
                            }
                            if (this.n) {
                                I.setColor(paint.getColor());
                            } else if (this.h < f6) {
                                I.setColor(bm2.f(this.h, paint.getColor(), I.getColor()));
                            }
                            boolean z4 = this.y;
                            Paint paint4 = this.d;
                            if (z4 || (i10 = this.r) < 0) {
                                paint4.setColor(bkb.v0(bkb.j7, this.F));
                            } else {
                                paint4.setColor(bkb.v0(i10, this.F));
                            }
                            if (this.h < f6 && bkb.I.o()) {
                                paint4.setColor(bm2.f(this.h, I.getColor(), paint4.getColor()));
                            }
                            if (this.A != -1) {
                                float L3 = gl.L(this.B) / 2.0f;
                                int save = canvas2.save();
                                canvas2.translate(i - L3, i6 - L3);
                                boolean z5 = f3 < f6;
                                if (z5) {
                                    canvas2.saveLayerAlpha(0.0f, 0.0f, gl.L(this.B), gl.L(this.B), kk7.d4, 31);
                                }
                                Paint paint5 = (Paint) this.G.m(null);
                                int i21 = this.A;
                                if (i21 == 12 || i21 == 13) {
                                    canvas2 = canvas;
                                    int alpha3 = paint5.getAlpha();
                                    paint5.setAlpha((int) (f3 * 255.0f));
                                    canvas2.drawCircle(L3, L3, f * f3, paint5);
                                    if (paint5 != I) {
                                        paint5.setAlpha(alpha3);
                                    }
                                } else if (this.v > 0.0f) {
                                    float L4 = f - gl.L(0.5f);
                                    float R12 = gl.R1(L4, this.v, this.w);
                                    float f23 = L3 - L4;
                                    float f24 = L3 + L4;
                                    canvas.drawRoundRect(f23, f23, f24, f24, R12, R12, paint5);
                                    float f25 = (f6 - f3) * L4;
                                    float R13 = gl.R1(f25, this.v, this.w);
                                    if (!z5 || f25 <= 0.0f) {
                                        canvas2 = canvas;
                                    } else {
                                        float f26 = L3 - f25;
                                        float f27 = L3 + f25;
                                        canvas2 = canvas;
                                        canvas2.drawRoundRect(f26, f26, f27, f27, R13, R13, bkb.Fm);
                                    }
                                } else {
                                    canvas2 = canvas;
                                    float L5 = f - gl.L(0.5f);
                                    canvas2.drawCircle(L3, L3, L5, paint5);
                                    float f28 = (f6 - f3) * L5;
                                    if (z5 && f28 > 0.0f) {
                                        canvas2.drawCircle(L3, L3, f28, bkb.Fm);
                                    }
                                }
                                canvas2.restoreToCount(save);
                            }
                            if (this.n) {
                                if (J == null) {
                                    Paint paint6 = new Paint(1);
                                    J = paint6;
                                    paint6.setStyle(Paint.Style.STROKE);
                                    J.setStrokeCap(Paint.Cap.ROUND);
                                    J.setStrokeJoin(Paint.Join.ROUND);
                                    J.setPathEffect(new DashPathEffect(new float[]{gl.L(0.66f), gl.L(4.0f)}, 0.0f));
                                }
                                J.setStrokeWidth(gl.L(1.66f));
                                J.setColor(bkb.v0(bkb.L6, this.F));
                                canvas2.drawCircle(i, i6, gl.L(9.0f), J);
                            } else if (f22 != 0.0f) {
                                if (this.C != null) {
                                    if (this.g == null) {
                                        i9 = 1;
                                        TextPaint textPaint = new TextPaint(1);
                                        this.g = textPaint;
                                        textPaint.setTypeface(gl.o());
                                    } else {
                                        i9 = 1;
                                    }
                                    int length = this.C.length();
                                    if (length == 0 || length == i9 || length == 2) {
                                        f7 = 14.0f;
                                        f8 = 18.0f;
                                    } else if (length != 3) {
                                        f7 = 8.0f;
                                        f8 = 15.75f;
                                    } else {
                                        f8 = 16.5f;
                                        f7 = 10.0f;
                                    }
                                    this.g.setTextSize(gl.L(f7));
                                    this.g.setColor(bkb.v0(this.r, this.F));
                                    canvas2.save();
                                    float f29 = i;
                                    canvas2.scale(f22, f6, f29, i6);
                                    String str = this.C;
                                    canvas2.drawText(str, f29 - (this.g.measureText(str) / 2.0f), gl.L(f8), this.g);
                                    canvas2.restore();
                                } else {
                                    float f30 = f6;
                                    Path path = this.j;
                                    path.reset();
                                    int i22 = this.A;
                                    float f31 = i22 == -1 ? 1.4f : i22 == 5 ? 0.8f : f30;
                                    float L6 = gl.L(9.0f * f31) * f22;
                                    float L7 = gl.L(f31 * 4.0f) * f22;
                                    int L8 = i - gl.L(1.5f);
                                    int L9 = gl.L(4.0f) + i6;
                                    float sqrt = (float) Math.sqrt((L7 * L7) / 2.0f);
                                    float f32 = L8;
                                    float f33 = L9;
                                    path.moveTo(f32 - sqrt, f33 - sqrt);
                                    path.lineTo(f32, f33);
                                    float sqrt2 = (float) Math.sqrt((L6 * L6) / 2.0f);
                                    path.lineTo(f32 + sqrt2, f33 - sqrt2);
                                    if (z || this.e != f30) {
                                        canvas2.save();
                                        float f34 = this.e;
                                        canvas2.scale(f34, f34, i, i6);
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    canvas2.drawPath(path, paint4);
                                    if (z2) {
                                        canvas2.restore();
                                    }
                                }
                            }
                        }
                        if (z) {
                            return;
                        }
                        canvas2.restore();
                        return;
                    }
                    paint.setStyle(Paint.Style.FILL);
                    m17Var = this.E;
                    if (m17Var == null && m17Var.l()) {
                        m17 m17Var2 = this.E;
                        Shader shader = m17Var2.a;
                        Matrix matrix = m17Var2.k;
                        matrix.reset();
                        this.E.a();
                        matrix.postTranslate(f4, (-this.E.r) + rect.top);
                        shader.setLocalMatrix(matrix);
                        paint.setShader(shader);
                    } else {
                        paint.setShader(null);
                    }
                    canvas2.drawCircle(i, i6, (f - gl.L(f6)) * this.m, paint);
                    paint.setStyle(Paint.Style.STROKE);
                }
                f4 = 0.0f;
                if (f3 > f4) {
                }
                if (z) {
                }
            } else if (z3) {
                int i23 = this.A;
                if (i23 == 12 || i23 == 13) {
                    I.setColor(bkb.v0(i3, this.F));
                    I.setAlpha((int) (this.m * 255.0f));
                    paint2.setColor(bkb.v0(this.r, this.F));
                } else if (i23 == 6 || i23 == 7) {
                    I.setColor(bkb.v0(this.t, this.F));
                    paint2.setColor(bkb.v0(this.r, this.F));
                } else if (i23 == 10 || i23 == 14) {
                    paint2.setColor(bkb.v0(this.t, this.F));
                } else {
                    Paint paint7 = I;
                    int indexOfKey = bkb.km.indexOfKey(bkb.bd);
                    paint7.setColor(((indexOfKey >= 0 ? bkb.km.valueAt(indexOfKey) : bkb.W) & 16777215) | 671088640);
                    paint2.setColor(bkb.v0(this.r, this.F));
                }
            } else {
                int i24 = this.t;
                if (i24 < 0) {
                    i24 = this.r;
                }
                paint2.setColor(gl.R0(f5, this.m, 16777215, bkb.v0(i24, this.F)));
            }
            i4 = -1;
            if (this.z) {
            }
            i5 = i4;
            paint = paint2;
            i6 = i2;
            f6 = 1.0f;
            i7 = 7;
            I.setColor(bkb.v0(this.r, this.F));
            i8 = this.A;
            if (i8 != i5) {
                if (i8 == 12) {
                }
                paint.setStyle(Paint.Style.FILL);
                m17Var = this.E;
                if (m17Var == null) {
                }
                paint.setShader(null);
                canvas2.drawCircle(i, i6, (f - gl.L(f6)) * this.m, paint);
                paint.setStyle(Paint.Style.STROKE);
            }
            f4 = 0.0f;
            if (f3 > f4) {
            }
            if (z) {
            }
        }
        f = L;
        f2 = f;
        if (!this.n) {
        }
        if (f9 < 0.5f) {
        }
        Rect rect22 = this.b;
        int centerX2 = rect22.centerX();
        int centerY2 = rect22.centerY();
        if (this.i) {
        }
        if (z) {
        }
        i3 = this.s;
        boolean z32 = this.z;
        Paint paint22 = this.f;
        if (i3 >= 0) {
        }
        i4 = -1;
        if (this.z) {
        }
        i5 = i4;
        paint = paint22;
        i6 = i2;
        f6 = 1.0f;
        i7 = 7;
        I.setColor(bkb.v0(this.r, this.F));
        i8 = this.A;
        if (i8 != i5) {
        }
        f4 = 0.0f;
        if (f3 > f4) {
        }
        if (z) {
        }
    }

    public final void b() {
        View view = this.a;
        if (view == null) {
            return;
        }
        if (view.getParent() != null) {
            ((View) this.a.getParent()).invalidate();
        }
        this.a.invalidate();
    }

    public final void c(float f) {
        if (this.m == f) {
            return;
        }
        this.m = f;
        b();
    }

    public final void d(int i) {
        if (this.A == i) {
            return;
        }
        this.A = i;
        Paint paint = this.f;
        if (i == 12 || i == 13) {
            paint.setStrokeWidth(gl.L(1.0f));
        } else if (i == 4 || i == 5) {
            paint.setStrokeWidth(gl.L(1.9f));
            if (i == 5) {
                this.d.setStrokeWidth(gl.L(1.5f));
            }
        } else if (i == 3) {
            paint.setStrokeWidth(gl.L(3.0f));
        } else if (i != 0) {
            paint.setStrokeWidth(gl.L(1.5f));
        }
        b();
    }

    public final void e(int i, int i2, int i3, int i4) {
        int i5 = i3 + i;
        int i6 = i4 + i2;
        Rect rect = this.b;
        if (rect.left == i && rect.top == i2 && rect.right == i5 && rect.bottom == i6) {
            return;
        }
        rect.left = i;
        rect.top = i2;
        rect.right = i5;
        rect.bottom = i6;
        b();
    }

    public final void f(int i, boolean z, boolean z2) {
        if (i >= 0) {
            String valueOf = String.valueOf(i + 1);
            String str = this.C;
            if (str == null || !str.equals(valueOf)) {
                this.C = valueOf;
                b();
            }
        }
        if (z == this.q) {
            return;
        }
        this.q = z;
        if (!this.l || !z2) {
            ObjectAnimator objectAnimator = this.p;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.p = null;
            }
            setProgress(z ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z ? 1.0f : 0.0f);
        this.p = ofFloat;
        ofFloat.addListener(new bb1((Object) this, (byte) 28));
        this.p.setInterpolator(s33.g);
        this.p.setDuration(this.H);
        this.p.start();
    }

    public final void g(boolean z, boolean z2) {
        f(-1, z, z2);
    }

    public float getProgress() {
        return this.o;
    }

    public final void h(int i, int i2, int i3) {
        if (this.s == i && this.t == i2 && this.r == i3) {
            return;
        }
        this.s = i;
        this.t = i2;
        this.r = i3;
        b();
    }

    public final void i(float f) {
        if (this.v == f) {
            return;
        }
        this.v = f;
        b();
    }

    public final void j(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        this.d.setXfermode(z ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        b();
    }

    public final void k(boolean z) {
        if (this.z == z) {
            return;
        }
        this.z = z;
        b();
    }

    public final void l(float f) {
        if (this.B == f) {
            return;
        }
        this.B = f;
        b();
    }

    public void setProgress(float f) {
        if (this.o != f) {
            this.o = f;
            b();
            xf2 xf2Var = this.D;
            if (xf2Var != null) {
                xf2Var.f();
            }
        }
    }
}
