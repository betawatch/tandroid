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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class CheckBoxBase {
    public static Paint I;
    public static Paint J;
    public int A;
    public float B;
    public String C;
    public xo D;
    public org.telegram.ui.ActionBar.t4 E;
    public org.telegram.ui.ActionBar.g6 F;
    public org.telegram.messenger.k9 G;
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
    public int r = org.telegram.ui.ActionBar.l6.k7;

    public CheckBoxBase(int i7, View view, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10 = org.telegram.ui.ActionBar.l6.Zc;
        this.s = i10;
        this.t = i10;
        this.u = org.telegram.ui.ActionBar.l6.h5;
        this.v = 0.0f;
        this.w = 1.0f;
        this.z = true;
        this.G = new k2(16);
        this.H = 200L;
        this.F = g6Var;
        this.a = view;
        this.B = i7;
        if (I == null) {
            I = new Paint(1);
        }
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.9f));
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.2f));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0259 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z9;
        Rect rect;
        int i7;
        int i10;
        float f13;
        float f14;
        Canvas canvas2;
        int i11;
        int i12;
        int i13;
        Paint paint;
        int i14;
        float f15;
        int i15;
        float f16;
        int i16;
        int i17;
        boolean z10;
        int i18;
        float f17;
        float f18;
        int i19;
        int i20;
        int i21;
        int i22;
        RectF rectF;
        int i23;
        int i24;
        float L = org.telegram.messenger.g0.L(this.B / 2.0f);
        int i25 = this.A;
        if (i25 == 12 || i25 == 13) {
            L = org.telegram.messenger.g0.L(10.0f);
        } else if (i25 != 0 && i25 != 11) {
            f10 = L;
            f11 = L - org.telegram.messenger.g0.L(0.2f);
            float f19 = !this.n ? 1.0f : this.o;
            f12 = f19 < 0.5f ? 1.0f : f19 / 0.5f;
            Rect rect2 = this.b;
            int centerX = rect2.centerX();
            int centerY = rect2.centerY();
            z9 = !this.i && f12 > 0.0f && f19 >= 0.5f && !this.n && this.C == null;
            if (z9) {
                rect = rect2;
                i7 = centerX;
                i10 = centerY;
                f13 = 0.0f;
                f14 = f19;
                canvas2 = canvas;
            } else {
                float f20 = centerX;
                float f21 = centerY;
                f13 = 0.0f;
                rect = rect2;
                i7 = centerX;
                i10 = centerY;
                f14 = f19;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(f20 - f10, f21 - f10, f20 + f10, f21 + f10, org.telegram.messenger.qs.e4, 31);
            }
            i11 = this.s;
            Paint paint2 = this.f;
            if (i11 >= 0) {
                if (this.z) {
                    I.setColor(Color.argb((int) (this.m * 25.0f), 0, 0, 0));
                    if (this.A == 8) {
                        paint2.setColor(org.telegram.ui.ActionBar.l6.w0(this.t, this.F));
                    } else {
                        i12 = -1;
                        paint2.setColor(org.telegram.messenger.g0.S0(f14, this.m, -1, org.telegram.ui.ActionBar.l6.w0(this.r, this.F)));
                    }
                } else {
                    i12 = -1;
                    if (this.x != 0) {
                        paint2.setColor(0);
                    } else {
                        int i26 = this.t;
                        if (i26 < 0) {
                            i26 = this.r;
                        }
                        paint2.setColor(org.telegram.messenger.g0.S0(f14, this.m, 16777215, org.telegram.ui.ActionBar.l6.w0(i26, this.F)));
                    }
                }
                if (this.z || (i24 = this.A) < 0 || i24 == 12 || i24 == 13) {
                    i13 = i12;
                    paint = paint2;
                    i14 = i10;
                    f15 = 1.0f;
                    i15 = 7;
                    f16 = 1.5f;
                } else if (i24 == 8 || i24 == 10 || i24 == 14) {
                    i14 = i10;
                    f16 = 1.5f;
                    if (this.v > f13) {
                        float L2 = f10 - org.telegram.messenger.g0.L(1.5f);
                        float T1 = org.telegram.messenger.g0.T1(L2, this.v, this.w);
                        float f22 = i7;
                        float f23 = i14;
                        f15 = 1.0f;
                        i15 = 7;
                        i13 = -1;
                        canvas2.drawRoundRect(f22 - L2, f23 - L2, f22 + L2, f23 + L2, T1, T1, paint2);
                        paint = paint2;
                    } else {
                        paint = paint2;
                        f15 = 1.0f;
                        i15 = 7;
                        i13 = -1;
                        canvas2.drawCircle(i7, i14, f10 - org.telegram.messenger.g0.L(1.5f), paint);
                    }
                } else if (i24 == 6 || i24 == 7) {
                    i14 = i10;
                    f16 = 1.5f;
                    float f24 = i7;
                    float f25 = i14;
                    canvas2.drawCircle(f24, f25, f10 - org.telegram.messenger.g0.L(1.0f), I);
                    canvas2.drawCircle(f24, f25, f10 - org.telegram.messenger.g0.L(1.5f), paint2);
                    paint = paint2;
                    f15 = 1.0f;
                    i15 = 7;
                    i13 = -1;
                } else {
                    i14 = i10;
                    f16 = 1.5f;
                    canvas2.drawCircle(i7, i14, f10, I);
                    i13 = i12;
                    paint = paint2;
                    f15 = 1.0f;
                    i15 = 7;
                }
                I.setColor(org.telegram.ui.ActionBar.l6.w0(this.r, this.F));
                i16 = this.A;
                if (i16 != i13 || i16 == i15 || i16 == 8 || i16 == 9 || i16 == 10 || i16 == 14) {
                    i17 = 6;
                } else {
                    if (i16 != 12 && i16 != 13) {
                        if (i16 == 0 || i16 == 11) {
                            i17 = 6;
                            canvas2.drawCircle(i7, i14, f10, paint);
                        } else {
                            float f26 = i7;
                            float f27 = f26 - f11;
                            float f28 = i14;
                            float f29 = f28 - f11;
                            float f30 = f26 + f11;
                            float f31 = f28 + f11;
                            RectF rectF2 = this.c;
                            rectF2.set(f27, f29, f30, f31);
                            int i27 = this.A;
                            if (i27 == 6) {
                                i20 = (int) ((-360.0f) * f14);
                                i21 = 0;
                            } else if (i27 == 1) {
                                i20 = (int) ((-270.0f) * f14);
                                i21 = -90;
                            } else {
                                i20 = (int) (270.0f * f14);
                                if (org.telegram.messenger.id.a0) {
                                    i20 = -i20;
                                }
                                i21 = 90;
                            }
                            if (i27 == 6) {
                                int w02 = org.telegram.ui.ActionBar.l6.w0(this.u, this.F);
                                int alpha = Color.alpha(w02);
                                paint.setColor(w02);
                                paint.setAlpha((int) (alpha * f14));
                                int i28 = i20;
                                float f32 = i28;
                                i22 = i28;
                                rectF = rectF2;
                                i23 = i21;
                                i17 = 6;
                                canvas2.drawArc(rectF, i21, f32, false, paint);
                                int w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.X9, this.F);
                                int alpha2 = Color.alpha(w03);
                                paint.setColor(w03);
                                paint.setAlpha((int) (alpha2 * f14));
                            } else {
                                i17 = 6;
                                i22 = i20;
                                rectF = rectF2;
                                i23 = i21;
                            }
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, i23, i22, false, paint);
                        }
                        if (f12 > f13) {
                            float f33 = f14 < 0.5f ? 0.0f : (f14 - 0.5f) / 0.5f;
                            int i29 = this.A;
                            if (i29 == 9) {
                                I.setColor(org.telegram.ui.ActionBar.l6.w0(this.t, this.F));
                            } else if (i29 == 11 || i29 == i17 || i29 == 7 || i29 == 10 || ((!this.z && this.s >= 0) || i29 == 14)) {
                                I.setColor(org.telegram.ui.ActionBar.l6.w0(this.s, this.F));
                            } else {
                                int i30 = this.x;
                                if (i30 != 0) {
                                    I.setColor(i30);
                                } else {
                                    I.setColor(org.telegram.ui.ActionBar.l6.w0(this.k ? org.telegram.ui.ActionBar.l6.i7 : org.telegram.ui.ActionBar.l6.j7, this.F));
                                }
                            }
                            if (this.n) {
                                I.setColor(paint.getColor());
                            } else if (this.h < f15) {
                                I.setColor(i0.a.f(this.h, paint.getColor(), I.getColor()));
                            }
                            boolean z11 = this.y;
                            Paint paint3 = this.d;
                            if (z11 || (i19 = this.r) < 0) {
                                paint3.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.k7, this.F));
                            } else {
                                paint3.setColor(org.telegram.ui.ActionBar.l6.w0(i19, this.F));
                            }
                            if (this.h < f15 && org.telegram.ui.ActionBar.l6.I.q()) {
                                paint3.setColor(i0.a.f(this.h, I.getColor(), paint3.getColor()));
                            }
                            if (this.A != -1) {
                                float L3 = org.telegram.messenger.g0.L(this.B) / 2.0f;
                                int save = canvas2.save();
                                canvas2.translate(i7 - L3, i14 - L3);
                                boolean z12 = f12 < f15;
                                if (z12) {
                                    canvas2.saveLayerAlpha(0.0f, 0.0f, org.telegram.messenger.g0.L(this.B), org.telegram.messenger.g0.L(this.B), org.telegram.messenger.qs.e4, 31);
                                }
                                Paint paint4 = (Paint) this.G.j(null);
                                int i31 = this.A;
                                if (i31 == 12 || i31 == 13) {
                                    canvas2 = canvas;
                                    int alpha3 = paint4.getAlpha();
                                    paint4.setAlpha((int) (f12 * 255.0f));
                                    canvas2.drawCircle(L3, L3, f10 * f12, paint4);
                                    if (paint4 != I) {
                                        paint4.setAlpha(alpha3);
                                    }
                                } else if (this.v > 0.0f) {
                                    float L4 = f10 - org.telegram.messenger.g0.L(0.5f);
                                    float T12 = org.telegram.messenger.g0.T1(L4, this.v, this.w);
                                    float f34 = L3 - L4;
                                    float f35 = L3 + L4;
                                    canvas.drawRoundRect(f34, f34, f35, f35, T12, T12, paint4);
                                    float f36 = (f15 - f12) * L4;
                                    float T13 = org.telegram.messenger.g0.T1(f36, this.v, this.w);
                                    if (!z12 || f36 <= 0.0f) {
                                        canvas2 = canvas;
                                    } else {
                                        float f37 = L3 - f36;
                                        float f38 = L3 + f36;
                                        canvas2 = canvas;
                                        canvas2.drawRoundRect(f37, f37, f38, f38, T13, T13, org.telegram.ui.ActionBar.l6.Cm);
                                    }
                                } else {
                                    canvas2 = canvas;
                                    float L5 = f10 - org.telegram.messenger.g0.L(0.5f);
                                    canvas2.drawCircle(L3, L3, L5, paint4);
                                    float f39 = (f15 - f12) * L5;
                                    if (z12 && f39 > 0.0f) {
                                        canvas2.drawCircle(L3, L3, f39, org.telegram.ui.ActionBar.l6.Cm);
                                    }
                                }
                                canvas2.restoreToCount(save);
                            }
                            if (this.n) {
                                if (J == null) {
                                    Paint paint5 = new Paint(1);
                                    J = paint5;
                                    paint5.setStyle(Paint.Style.STROKE);
                                    J.setStrokeCap(Paint.Cap.ROUND);
                                    J.setStrokeJoin(Paint.Join.ROUND);
                                    J.setPathEffect(new DashPathEffect(new float[]{org.telegram.messenger.g0.L(0.66f), org.telegram.messenger.g0.L(4.0f)}, 0.0f));
                                }
                                J.setStrokeWidth(org.telegram.messenger.g0.L(1.66f));
                                J.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.M6, this.F));
                                canvas2.drawCircle(i7, i14, org.telegram.messenger.g0.L(9.0f), J);
                            } else if (f33 != 0.0f) {
                                if (this.C != null) {
                                    if (this.g == null) {
                                        i18 = 1;
                                        TextPaint textPaint = new TextPaint(1);
                                        this.g = textPaint;
                                        textPaint.setTypeface(org.telegram.messenger.g0.o());
                                    } else {
                                        i18 = 1;
                                    }
                                    int length = this.C.length();
                                    if (length == 0 || length == i18 || length == 2) {
                                        f17 = 14.0f;
                                        f18 = 18.0f;
                                    } else if (length != 3) {
                                        f17 = 8.0f;
                                        f18 = 15.75f;
                                    } else {
                                        f18 = 16.5f;
                                        f17 = 10.0f;
                                    }
                                    this.g.setTextSize(org.telegram.messenger.g0.L(f17));
                                    this.g.setColor(org.telegram.ui.ActionBar.l6.w0(this.r, this.F));
                                    canvas2.save();
                                    float f40 = i7;
                                    canvas2.scale(f33, f15, f40, i14);
                                    String str = this.C;
                                    canvas2.drawText(str, f40 - (this.g.measureText(str) / 2.0f), org.telegram.messenger.g0.L(f18), this.g);
                                    canvas2.restore();
                                } else {
                                    float f41 = f15;
                                    Path path = this.j;
                                    path.reset();
                                    int i32 = this.A;
                                    float f42 = i32 == -1 ? 1.4f : i32 == 5 ? 0.8f : f41;
                                    float L6 = org.telegram.messenger.g0.L(9.0f * f42) * f33;
                                    float L7 = org.telegram.messenger.g0.L(f42 * 4.0f) * f33;
                                    int L8 = i7 - org.telegram.messenger.g0.L(f16);
                                    int L9 = org.telegram.messenger.g0.L(4.0f) + i14;
                                    float sqrt = (float) Math.sqrt((L7 * L7) / 2.0f);
                                    float f43 = L8;
                                    float f44 = L9;
                                    path.moveTo(f43 - sqrt, f44 - sqrt);
                                    path.lineTo(f43, f44);
                                    float sqrt2 = (float) Math.sqrt((L6 * L6) / 2.0f);
                                    path.lineTo(f43 + sqrt2, f44 - sqrt2);
                                    if (z9 || this.e != f41) {
                                        canvas2.save();
                                        float f45 = this.e;
                                        canvas2.scale(f45, f45, i7, i14);
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    canvas2.drawPath(path, paint3);
                                    if (z10) {
                                        canvas2.restore();
                                    }
                                }
                            }
                        }
                        if (z9) {
                            return;
                        }
                        canvas2.restore();
                        return;
                    }
                    i17 = 6;
                    paint.setStyle(Paint.Style.FILL);
                    org.telegram.ui.ActionBar.t4 t4Var = this.E;
                    if (t4Var == null || !t4Var.l()) {
                        paint.setShader(null);
                    } else {
                        org.telegram.ui.ActionBar.t4 t4Var2 = this.E;
                        Shader shader = t4Var2.a;
                        Matrix matrix = t4Var2.k;
                        matrix.reset();
                        this.E.a();
                        matrix.postTranslate(f13, (-this.E.r) + rect.top);
                        shader.setLocalMatrix(matrix);
                        paint.setShader(shader);
                    }
                    canvas2.drawCircle(i7, i14, (f10 - org.telegram.messenger.g0.L(f15)) * this.m, paint);
                    paint.setStyle(Paint.Style.STROKE);
                }
                f13 = 0.0f;
                if (f12 > f13) {
                }
                if (z9) {
                }
            } else if (this.z) {
                int i33 = this.A;
                if (i33 == 12 || i33 == 13) {
                    I.setColor(org.telegram.ui.ActionBar.l6.w0(i11, this.F));
                    I.setAlpha((int) (this.m * 255.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.l6.w0(this.r, this.F));
                } else if (i33 == 6 || i33 == 7) {
                    I.setColor(org.telegram.ui.ActionBar.l6.w0(this.t, this.F));
                    paint2.setColor(org.telegram.ui.ActionBar.l6.w0(this.r, this.F));
                } else if (i33 == 10 || i33 == 14) {
                    paint2.setColor(org.telegram.ui.ActionBar.l6.w0(this.t, this.F));
                } else {
                    Paint paint6 = I;
                    int indexOfKey = org.telegram.ui.ActionBar.l6.im.indexOfKey(org.telegram.ui.ActionBar.l6.Zc);
                    paint6.setColor((16777215 & (indexOfKey >= 0 ? org.telegram.ui.ActionBar.l6.im.valueAt(indexOfKey) : org.telegram.ui.ActionBar.l6.X)) | 671088640);
                    paint2.setColor(org.telegram.ui.ActionBar.l6.w0(this.r, this.F));
                }
            } else {
                int i34 = this.t;
                if (i34 < 0) {
                    i34 = this.r;
                }
                paint2.setColor(org.telegram.messenger.g0.S0(f14, this.m, 16777215, org.telegram.ui.ActionBar.l6.w0(i34, this.F)));
            }
            i12 = -1;
            if (this.z) {
            }
            i13 = i12;
            paint = paint2;
            i14 = i10;
            f15 = 1.0f;
            i15 = 7;
            f16 = 1.5f;
            I.setColor(org.telegram.ui.ActionBar.l6.w0(this.r, this.F));
            i16 = this.A;
            if (i16 != i13) {
            }
            i17 = 6;
            f13 = 0.0f;
            if (f12 > f13) {
            }
            if (z9) {
            }
        }
        f10 = L;
        f11 = f10;
        if (!this.n) {
        }
        if (f19 < 0.5f) {
        }
        Rect rect22 = this.b;
        int centerX2 = rect22.centerX();
        int centerY2 = rect22.centerY();
        if (this.i) {
        }
        if (z9) {
        }
        i11 = this.s;
        Paint paint22 = this.f;
        if (i11 >= 0) {
        }
        i12 = -1;
        if (this.z) {
        }
        i13 = i12;
        paint = paint22;
        i14 = i10;
        f15 = 1.0f;
        i15 = 7;
        f16 = 1.5f;
        I.setColor(org.telegram.ui.ActionBar.l6.w0(this.r, this.F));
        i16 = this.A;
        if (i16 != i13) {
        }
        i17 = 6;
        f13 = 0.0f;
        if (f12 > f13) {
        }
        if (z9) {
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

    public final void c(float f10) {
        if (this.m == f10) {
            return;
        }
        this.m = f10;
        b();
    }

    public final void d(int i7) {
        if (this.A == i7) {
            return;
        }
        this.A = i7;
        Paint paint = this.f;
        if (i7 == 12 || i7 == 13) {
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        } else if (i7 == 4 || i7 == 5) {
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.9f));
            if (i7 == 5) {
                this.d.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
            }
        } else if (i7 == 3) {
            paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        } else if (i7 != 0) {
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.5f));
        }
        b();
    }

    public final void e(int i7, int i10, int i11, int i12) {
        int i13 = i11 + i7;
        int i14 = i12 + i10;
        Rect rect = this.b;
        if (rect.left == i7 && rect.top == i10 && rect.right == i13 && rect.bottom == i14) {
            return;
        }
        rect.left = i7;
        rect.top = i10;
        rect.right = i13;
        rect.bottom = i14;
        b();
    }

    public final void f(int i7, boolean z9, boolean z10) {
        if (i7 >= 0) {
            String str = "" + (i7 + 1);
            String str2 = this.C;
            if (str2 == null || !str2.equals(str)) {
                this.C = str;
                b();
            }
        }
        if (z9 == this.q) {
            return;
        }
        this.q = z9;
        if (!this.l || !z10) {
            ObjectAnimator objectAnimator = this.p;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.p = null;
            }
            setProgress(z9 ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z9 ? 1.0f : 0.0f);
        this.p = ofFloat;
        ofFloat.addListener(new z5(this, 19));
        this.p.setInterpolator(xq.g);
        this.p.setDuration(this.H);
        this.p.start();
    }

    public final void g(boolean z9, boolean z10) {
        f(-1, z9, z10);
    }

    public float getProgress() {
        return this.o;
    }

    public final void h(int i7, int i10, int i11) {
        if (this.s == i7 && this.t == i10 && this.r == i11) {
            return;
        }
        this.s = i7;
        this.t = i10;
        this.r = i11;
        b();
    }

    public final void i(float f10) {
        if (this.v == f10) {
            return;
        }
        this.v = f10;
        b();
    }

    public final void j(boolean z9) {
        if (this.i == z9) {
            return;
        }
        this.i = z9;
        this.d.setXfermode(z9 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        b();
    }

    public final void k(boolean z9) {
        if (this.z == z9) {
            return;
        }
        this.z = z9;
        b();
    }

    public final void l(float f10) {
        if (this.B == f10) {
            return;
        }
        this.B = f10;
        b();
    }

    public void setProgress(float f10) {
        if (this.o == f10) {
            return;
        }
        this.o = f10;
        b();
        xo xoVar = this.D;
        if (xoVar != null) {
            xoVar.a();
        }
    }
}
