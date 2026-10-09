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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class CheckBoxBase {
    public static Paint I;
    public static Paint J;
    public int A;
    public float B;
    public String C;
    public eq D;
    public org.telegram.ui.ActionBar.f5 E;
    public org.telegram.ui.ActionBar.e6 F;
    public GenericProvider G;
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
    public int r = org.telegram.ui.ActionBar.i6.k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.e6 e6Var) {
        int i11 = org.telegram.ui.ActionBar.i6.lc;
        this.s = i11;
        this.t = i11;
        this.u = org.telegram.ui.ActionBar.i6.h5;
        this.v = 0.0f;
        this.w = 1.0f;
        this.z = true;
        this.G = new f2(19);
        this.H = 200L;
        this.F = e6Var;
        this.a = view;
        this.B = i10;
        if (I == null) {
            I = new Paint(1);
        }
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(1.9f));
        Paint paint2 = new Paint(1);
        this.f = paint2;
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.2f));
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
        float f7;
        float f10;
        float f11;
        boolean z10;
        Rect rect;
        int i10;
        int i11;
        float f12;
        float f13;
        Canvas canvas2;
        int i12;
        int i13;
        int i14;
        Paint paint;
        int i15;
        float f14;
        int i16;
        float f15;
        int i17;
        int i18;
        boolean z11;
        int i19;
        float f16;
        float f17;
        int i20;
        int i21;
        int i22;
        int i23;
        RectF rectF;
        int i24;
        int i25;
        float dp = AndroidUtilities.dp(this.B / 2.0f);
        int i26 = this.A;
        if (i26 == 12 || i26 == 13) {
            dp = AndroidUtilities.dp(10.0f);
        } else if (i26 != 0 && i26 != 11) {
            f7 = dp;
            f10 = dp - AndroidUtilities.dp(0.2f);
            float f18 = !this.n ? 1.0f : this.o;
            f11 = f18 < 0.5f ? 1.0f : f18 / 0.5f;
            Rect rect2 = this.b;
            int centerX = rect2.centerX();
            int centerY = rect2.centerY();
            z10 = !this.i && f11 > 0.0f && f18 >= 0.5f && !this.n && this.C == null;
            if (z10) {
                rect = rect2;
                i10 = centerX;
                i11 = centerY;
                f12 = 0.0f;
                f13 = f18;
                canvas2 = canvas;
            } else {
                float f19 = centerX;
                float f20 = centerY;
                f12 = 0.0f;
                rect = rect2;
                i10 = centerX;
                i11 = centerY;
                f13 = f18;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(f19 - f7, f20 - f7, f19 + f7, f20 + f7, 255, 31);
            }
            i12 = this.s;
            Paint paint2 = this.f;
            if (i12 >= 0) {
                if (this.z) {
                    I.setColor(Color.argb((int) (this.m * 25.0f), 0, 0, 0));
                    if (this.A == 8) {
                        paint2.setColor(org.telegram.ui.ActionBar.i6.w0(this.t, this.F));
                    } else {
                        i13 = -1;
                        paint2.setColor(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.i6.w0(this.r, this.F), f13, this.m));
                    }
                } else {
                    i13 = -1;
                    if (this.x != 0) {
                        paint2.setColor(0);
                    } else {
                        int i27 = this.t;
                        if (i27 < 0) {
                            i27 = this.r;
                        }
                        paint2.setColor(AndroidUtilities.getOffsetColor(16777215, org.telegram.ui.ActionBar.i6.w0(i27, this.F), f13, this.m));
                    }
                }
                if (this.z || (i25 = this.A) < 0 || i25 == 12 || i25 == 13) {
                    i14 = i13;
                    paint = paint2;
                    i15 = i11;
                    f14 = 1.0f;
                    i16 = 7;
                    f15 = 1.5f;
                } else if (i25 == 8 || i25 == 10 || i25 == 14) {
                    i15 = i11;
                    f15 = 1.5f;
                    if (this.v > f12) {
                        float dp2 = f7 - AndroidUtilities.dp(1.5f);
                        float lerp = AndroidUtilities.lerp(dp2, this.v, this.w);
                        float f21 = i10;
                        float f22 = i15;
                        f14 = 1.0f;
                        i16 = 7;
                        i14 = -1;
                        canvas2.drawRoundRect(f21 - dp2, f22 - dp2, f21 + dp2, f22 + dp2, lerp, lerp, paint2);
                        paint = paint2;
                    } else {
                        paint = paint2;
                        f14 = 1.0f;
                        i16 = 7;
                        i14 = -1;
                        canvas2.drawCircle(i10, i15, f7 - AndroidUtilities.dp(1.5f), paint);
                    }
                } else if (i25 == 6 || i25 == 7) {
                    i15 = i11;
                    f15 = 1.5f;
                    float f23 = i10;
                    float f24 = i15;
                    canvas2.drawCircle(f23, f24, f7 - AndroidUtilities.dp(1.0f), I);
                    canvas2.drawCircle(f23, f24, f7 - AndroidUtilities.dp(1.5f), paint2);
                    paint = paint2;
                    f14 = 1.0f;
                    i16 = 7;
                    i14 = -1;
                } else {
                    i15 = i11;
                    f15 = 1.5f;
                    canvas2.drawCircle(i10, i15, f7, I);
                    i14 = i13;
                    paint = paint2;
                    f14 = 1.0f;
                    i16 = 7;
                }
                I.setColor(org.telegram.ui.ActionBar.i6.w0(this.r, this.F));
                i17 = this.A;
                if (i17 != i14 || i17 == i16 || i17 == 8 || i17 == 9 || i17 == 10 || i17 == 14) {
                    i18 = 6;
                } else {
                    if (i17 != 12 && i17 != 13) {
                        if (i17 == 0 || i17 == 11) {
                            i18 = 6;
                            canvas2.drawCircle(i10, i15, f7, paint);
                        } else {
                            float f25 = i10;
                            float f26 = f25 - f10;
                            float f27 = i15;
                            float f28 = f27 - f10;
                            float f29 = f25 + f10;
                            float f30 = f27 + f10;
                            RectF rectF2 = this.c;
                            rectF2.set(f26, f28, f29, f30);
                            int i28 = this.A;
                            if (i28 == 6) {
                                i21 = (int) ((-360.0f) * f13);
                                i22 = 0;
                            } else if (i28 == 1) {
                                i21 = (int) ((-270.0f) * f13);
                                i22 = -90;
                            } else {
                                i21 = (int) (270.0f * f13);
                                if (LocaleController.isRTL) {
                                    i21 = -i21;
                                }
                                i22 = 90;
                            }
                            if (i28 == 6) {
                                int w02 = org.telegram.ui.ActionBar.i6.w0(this.u, this.F);
                                int alpha = Color.alpha(w02);
                                paint.setColor(w02);
                                paint.setAlpha((int) (alpha * f13));
                                int i29 = i21;
                                float f31 = i29;
                                i23 = i29;
                                rectF = rectF2;
                                i24 = i22;
                                i18 = 6;
                                canvas2.drawArc(rectF, i22, f31, false, paint);
                                int w03 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.X9, this.F);
                                int alpha2 = Color.alpha(w03);
                                paint.setColor(w03);
                                paint.setAlpha((int) (alpha2 * f13));
                            } else {
                                i18 = 6;
                                i23 = i21;
                                rectF = rectF2;
                                i24 = i22;
                            }
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, i24, i23, false, paint);
                        }
                        if (f11 > f12) {
                            float f32 = f13 < 0.5f ? 0.0f : (f13 - 0.5f) / 0.5f;
                            int i30 = this.A;
                            if (i30 == 9) {
                                I.setColor(org.telegram.ui.ActionBar.i6.w0(this.t, this.F));
                            } else if (i30 == 11 || i30 == i18 || i30 == 7 || i30 == 10 || ((!this.z && this.s >= 0) || i30 == 14)) {
                                I.setColor(org.telegram.ui.ActionBar.i6.w0(this.s, this.F));
                            } else {
                                int i31 = this.x;
                                if (i31 != 0) {
                                    I.setColor(i31);
                                } else {
                                    I.setColor(org.telegram.ui.ActionBar.i6.w0(this.k ? org.telegram.ui.ActionBar.i6.i7 : org.telegram.ui.ActionBar.i6.j7, this.F));
                                }
                            }
                            if (this.n) {
                                I.setColor(paint.getColor());
                            } else if (this.h < f14) {
                                I.setColor(i0.a.d(this.h, paint.getColor(), I.getColor()));
                            }
                            boolean z12 = this.y;
                            Paint paint3 = this.d;
                            if (z12 || (i20 = this.r) < 0) {
                                paint3.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.k7, this.F));
                            } else {
                                paint3.setColor(org.telegram.ui.ActionBar.i6.w0(i20, this.F));
                            }
                            if (this.h < f14 && org.telegram.ui.ActionBar.i6.I.q()) {
                                paint3.setColor(i0.a.d(this.h, I.getColor(), paint3.getColor()));
                            }
                            if (this.A != -1) {
                                float dp3 = AndroidUtilities.dp(this.B) / 2.0f;
                                int save = canvas2.save();
                                canvas2.translate(i10 - dp3, i15 - dp3);
                                boolean z13 = f11 < f14;
                                if (z13) {
                                    canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.B), AndroidUtilities.dp(this.B), 255, 31);
                                }
                                Paint paint4 = (Paint) this.G.provide(null);
                                int i32 = this.A;
                                if (i32 == 12 || i32 == 13) {
                                    canvas2 = canvas;
                                    int alpha3 = paint4.getAlpha();
                                    paint4.setAlpha((int) (f11 * 255.0f));
                                    canvas2.drawCircle(dp3, dp3, f7 * f11, paint4);
                                    if (paint4 != I) {
                                        paint4.setAlpha(alpha3);
                                    }
                                } else if (this.v > 0.0f) {
                                    float dp4 = f7 - AndroidUtilities.dp(0.5f);
                                    float lerp2 = AndroidUtilities.lerp(dp4, this.v, this.w);
                                    float f33 = dp3 - dp4;
                                    float f34 = dp3 + dp4;
                                    canvas.drawRoundRect(f33, f33, f34, f34, lerp2, lerp2, paint4);
                                    float f35 = (f14 - f11) * dp4;
                                    float lerp3 = AndroidUtilities.lerp(f35, this.v, this.w);
                                    if (!z13 || f35 <= 0.0f) {
                                        canvas2 = canvas;
                                    } else {
                                        float f36 = dp3 - f35;
                                        float f37 = dp3 + f35;
                                        canvas2 = canvas;
                                        canvas2.drawRoundRect(f36, f36, f37, f37, lerp3, lerp3, org.telegram.ui.ActionBar.i6.Ll);
                                    }
                                } else {
                                    canvas2 = canvas;
                                    float dp5 = f7 - AndroidUtilities.dp(0.5f);
                                    canvas2.drawCircle(dp3, dp3, dp5, paint4);
                                    float f38 = (f14 - f11) * dp5;
                                    if (z13 && f38 > 0.0f) {
                                        canvas2.drawCircle(dp3, dp3, f38, org.telegram.ui.ActionBar.i6.Ll);
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
                                    J.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(0.66f), AndroidUtilities.dp(4.0f)}, 0.0f));
                                }
                                J.setStrokeWidth(AndroidUtilities.dp(1.66f));
                                J.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.M6, this.F));
                                canvas2.drawCircle(i10, i15, AndroidUtilities.dp(9.0f), J);
                            } else if (f32 != 0.0f) {
                                if (this.C != null) {
                                    if (this.g == null) {
                                        i19 = 1;
                                        TextPaint textPaint = new TextPaint(1);
                                        this.g = textPaint;
                                        textPaint.setTypeface(AndroidUtilities.bold());
                                    } else {
                                        i19 = 1;
                                    }
                                    int length = this.C.length();
                                    if (length == 0 || length == i19 || length == 2) {
                                        f16 = 14.0f;
                                        f17 = 18.0f;
                                    } else if (length != 3) {
                                        f16 = 8.0f;
                                        f17 = 15.75f;
                                    } else {
                                        f17 = 16.5f;
                                        f16 = 10.0f;
                                    }
                                    this.g.setTextSize(AndroidUtilities.dp(f16));
                                    this.g.setColor(org.telegram.ui.ActionBar.i6.w0(this.r, this.F));
                                    canvas2.save();
                                    float f39 = i10;
                                    canvas2.scale(f32, f14, f39, i15);
                                    String str = this.C;
                                    canvas2.drawText(str, f39 - (this.g.measureText(str) / 2.0f), AndroidUtilities.dp(f17), this.g);
                                    canvas2.restore();
                                } else {
                                    float f40 = f14;
                                    Path path = this.j;
                                    path.reset();
                                    int i33 = this.A;
                                    float f41 = i33 == -1 ? 1.4f : i33 == 5 ? 0.8f : f40;
                                    float dp6 = AndroidUtilities.dp(9.0f * f41) * f32;
                                    float dp7 = AndroidUtilities.dp(f41 * 4.0f) * f32;
                                    int dp8 = i10 - AndroidUtilities.dp(f15);
                                    int dp9 = AndroidUtilities.dp(4.0f) + i15;
                                    float sqrt = (float) Math.sqrt((dp7 * dp7) / 2.0f);
                                    float f42 = dp8;
                                    float f43 = dp9;
                                    path.moveTo(f42 - sqrt, f43 - sqrt);
                                    path.lineTo(f42, f43);
                                    float sqrt2 = (float) Math.sqrt((dp6 * dp6) / 2.0f);
                                    path.lineTo(f42 + sqrt2, f43 - sqrt2);
                                    if (z10 || this.e != f40) {
                                        canvas2.save();
                                        float f44 = this.e;
                                        canvas2.scale(f44, f44, i10, i15);
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    canvas2.drawPath(path, paint3);
                                    if (z11) {
                                        canvas2.restore();
                                    }
                                }
                            }
                        }
                        if (z10) {
                            return;
                        }
                        canvas2.restore();
                        return;
                    }
                    i18 = 6;
                    paint.setStyle(Paint.Style.FILL);
                    org.telegram.ui.ActionBar.f5 f5Var = this.E;
                    if (f5Var == null || !f5Var.l()) {
                        paint.setShader(null);
                    } else {
                        org.telegram.ui.ActionBar.f5 f5Var2 = this.E;
                        Shader shader = f5Var2.a;
                        Matrix matrix = f5Var2.k;
                        matrix.reset();
                        this.E.a();
                        matrix.postTranslate(f12, (-this.E.r) + rect.top);
                        shader.setLocalMatrix(matrix);
                        paint.setShader(shader);
                    }
                    canvas2.drawCircle(i10, i15, (f7 - AndroidUtilities.dp(f14)) * this.m, paint);
                    paint.setStyle(Paint.Style.STROKE);
                }
                f12 = 0.0f;
                if (f11 > f12) {
                }
                if (z10) {
                }
            } else if (this.z) {
                int i34 = this.A;
                if (i34 == 12 || i34 == 13) {
                    I.setColor(org.telegram.ui.ActionBar.i6.w0(i12, this.F));
                    I.setAlpha((int) (this.m * 255.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.i6.w0(this.r, this.F));
                } else if (i34 == 6 || i34 == 7) {
                    I.setColor(org.telegram.ui.ActionBar.i6.w0(this.t, this.F));
                    paint2.setColor(org.telegram.ui.ActionBar.i6.w0(this.r, this.F));
                } else if (i34 == 10 || i34 == 14) {
                    paint2.setColor(org.telegram.ui.ActionBar.i6.w0(this.t, this.F));
                } else {
                    Paint paint6 = I;
                    int indexOfKey = org.telegram.ui.ActionBar.i6.ul.indexOfKey(org.telegram.ui.ActionBar.i6.lc);
                    paint6.setColor((16777215 & (indexOfKey >= 0 ? org.telegram.ui.ActionBar.i6.ul.valueAt(indexOfKey) : org.telegram.ui.ActionBar.i6.X)) | 671088640);
                    paint2.setColor(org.telegram.ui.ActionBar.i6.w0(this.r, this.F));
                }
            } else {
                int i35 = this.t;
                if (i35 < 0) {
                    i35 = this.r;
                }
                paint2.setColor(AndroidUtilities.getOffsetColor(16777215, org.telegram.ui.ActionBar.i6.w0(i35, this.F), f13, this.m));
            }
            i13 = -1;
            if (this.z) {
            }
            i14 = i13;
            paint = paint2;
            i15 = i11;
            f14 = 1.0f;
            i16 = 7;
            f15 = 1.5f;
            I.setColor(org.telegram.ui.ActionBar.i6.w0(this.r, this.F));
            i17 = this.A;
            if (i17 != i14) {
            }
            i18 = 6;
            f12 = 0.0f;
            if (f11 > f12) {
            }
            if (z10) {
            }
        }
        f7 = dp;
        f10 = f7;
        if (!this.n) {
        }
        if (f18 < 0.5f) {
        }
        Rect rect22 = this.b;
        int centerX2 = rect22.centerX();
        int centerY2 = rect22.centerY();
        if (this.i) {
        }
        if (z10) {
        }
        i12 = this.s;
        Paint paint22 = this.f;
        if (i12 >= 0) {
        }
        i13 = -1;
        if (this.z) {
        }
        i14 = i13;
        paint = paint22;
        i15 = i11;
        f14 = 1.0f;
        i16 = 7;
        f15 = 1.5f;
        I.setColor(org.telegram.ui.ActionBar.i6.w0(this.r, this.F));
        i17 = this.A;
        if (i17 != i14) {
        }
        i18 = 6;
        f12 = 0.0f;
        if (f11 > f12) {
        }
        if (z10) {
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

    public final void c(float f7) {
        if (this.m == f7) {
            return;
        }
        this.m = f7;
        b();
    }

    public final void d(int i10) {
        if (this.A == i10) {
            return;
        }
        this.A = i10;
        Paint paint = this.f;
        if (i10 == 12 || i10 == 13) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        } else if (i10 == 4 || i10 == 5) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.9f));
            if (i10 == 5) {
                this.d.setStrokeWidth(AndroidUtilities.dp(1.5f));
            }
        } else if (i10 == 3) {
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        } else if (i10 != 0) {
            paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
        }
        b();
    }

    public final void e(int i10, int i11, int i12, int i13) {
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        Rect rect = this.b;
        if (rect.left == i10 && rect.top == i11 && rect.right == i14 && rect.bottom == i15) {
            return;
        }
        rect.left = i10;
        rect.top = i11;
        rect.right = i14;
        rect.bottom = i15;
        b();
    }

    public final void f(int i10, boolean z10, boolean z11) {
        if (i10 >= 0) {
            String str = "" + (i10 + 1);
            String str2 = this.C;
            if (str2 == null || !str2.equals(str)) {
                this.C = str;
                b();
            }
        }
        if (z10 == this.q) {
            return;
        }
        this.q = z10;
        if (!this.l || !z11) {
            ObjectAnimator objectAnimator = this.p;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.p = null;
            }
            setProgress(z10 ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z10 ? 1.0f : 0.0f);
        this.p = ofFloat;
        ofFloat.addListener(new t8(this, 13));
        this.p.setInterpolator(hs.g);
        this.p.setDuration(this.H);
        this.p.start();
    }

    public final void g(boolean z10, boolean z11) {
        f(-1, z10, z11);
    }

    public float getProgress() {
        return this.o;
    }

    public final void h(int i10, int i11, int i12) {
        if (this.s == i10 && this.t == i11 && this.r == i12) {
            return;
        }
        this.s = i10;
        this.t = i11;
        this.r = i12;
        b();
    }

    public final void i(float f7) {
        if (this.v == f7) {
            return;
        }
        this.v = f7;
        b();
    }

    public final void j(boolean z10) {
        if (this.i == z10) {
            return;
        }
        this.i = z10;
        this.d.setXfermode(z10 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        b();
    }

    public final void k(boolean z10) {
        if (this.z == z10) {
            return;
        }
        this.z = z10;
        b();
    }

    public final void l(float f7) {
        if (this.B == f7) {
            return;
        }
        this.B = f7;
        b();
    }

    public void setProgress(float f7) {
        if (this.o == f7) {
            return;
        }
        this.o = f7;
        b();
        eq eqVar = this.D;
        if (eqVar != null) {
            eqVar.a();
        }
    }
}
