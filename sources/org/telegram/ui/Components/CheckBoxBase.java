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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public class CheckBoxBase {
    public static Paint I;
    public static Paint J;
    public int A;
    public float B;
    public String C;
    public np D;
    public org.telegram.ui.ActionBar.f5 E;
    public org.telegram.ui.ActionBar.f6 F;
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
    public int r = org.telegram.ui.ActionBar.j6.k7;

    public CheckBoxBase(int i10, View view, org.telegram.ui.ActionBar.f6 f6Var) {
        int i11 = org.telegram.ui.ActionBar.j6.lc;
        this.s = i11;
        this.t = i11;
        this.u = org.telegram.ui.ActionBar.j6.h5;
        this.v = 0.0f;
        this.w = 1.0f;
        this.z = true;
        this.G = new p2(8);
        this.H = 200L;
        this.F = f6Var;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0254 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10;
        float f12;
        Rect rect;
        int i10;
        int i11;
        float f13;
        Canvas canvas2;
        int i12;
        Paint paint;
        int i13;
        int i14;
        int i15;
        float f14;
        float f15;
        int i16;
        int i17;
        boolean z11;
        int i18;
        float f16;
        float f17;
        int i19;
        int i20;
        int i21;
        int i22;
        RectF rectF;
        int i23;
        int i24;
        float dp = AndroidUtilities.dp(this.B / 2.0f);
        int i25 = this.A;
        if (i25 == 12 || i25 == 13) {
            dp = AndroidUtilities.dp(10.0f);
        } else if (i25 != 0 && i25 != 11) {
            f7 = dp;
            f10 = dp - AndroidUtilities.dp(0.2f);
            float f18 = !this.n ? 1.0f : this.o;
            f11 = f18 < 0.5f ? 1.0f : f18 / 0.5f;
            Rect rect2 = this.b;
            int centerX = rect2.centerX();
            int centerY = rect2.centerY();
            z10 = !this.i && f11 > 0.0f && f18 >= 0.5f && !this.n && this.C == null;
            if (z10) {
                f12 = f18;
                rect = rect2;
                i10 = centerX;
                i11 = centerY;
                f13 = 0.0f;
                canvas2 = canvas;
            } else {
                float f19 = centerX;
                float f20 = centerY;
                f12 = f18;
                rect = rect2;
                i10 = centerX;
                i11 = centerY;
                f13 = 0.0f;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(f19 - f7, f20 - f7, f19 + f7, f20 + f7, 255, 31);
            }
            i12 = this.s;
            Paint paint2 = this.f;
            if (i12 >= 0) {
                if (this.z) {
                    I.setColor(Color.argb((int) (this.m * 25.0f), 0, 0, 0));
                    if (this.A == 8) {
                        paint2.setColor(org.telegram.ui.ActionBar.j6.v0(this.t, this.F));
                    } else {
                        paint2.setColor(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.j6.v0(this.r, this.F), f12, this.m));
                    }
                } else if (this.x != 0) {
                    paint2.setColor(0);
                } else {
                    int i26 = this.t;
                    if (i26 < 0) {
                        i26 = this.r;
                    }
                    paint2.setColor(AndroidUtilities.getOffsetColor(16777215, org.telegram.ui.ActionBar.j6.v0(i26, this.F), f12, this.m));
                }
                if (this.z || (i24 = this.A) < 0 || i24 == 12 || i24 == 13) {
                    paint = paint2;
                    i13 = i11;
                    i14 = 7;
                    i15 = -1;
                    f14 = 1.5f;
                } else if (i24 == 8 || i24 == 10 || i24 == 14) {
                    i13 = i11;
                    f14 = 1.5f;
                    if (this.v > f13) {
                        float dp2 = f7 - AndroidUtilities.dp(1.5f);
                        float lerp = AndroidUtilities.lerp(dp2, this.v, this.w);
                        float f21 = i10;
                        float f22 = i13;
                        i14 = 7;
                        i15 = -1;
                        f15 = 1.0f;
                        canvas2.drawRoundRect(f21 - dp2, f22 - dp2, f21 + dp2, f22 + dp2, lerp, lerp, paint2);
                        paint = paint2;
                    } else {
                        paint = paint2;
                        i14 = 7;
                        i15 = -1;
                        f15 = 1.0f;
                        canvas2.drawCircle(i10, i13, f7 - AndroidUtilities.dp(1.5f), paint);
                    }
                    I.setColor(org.telegram.ui.ActionBar.j6.v0(this.r, this.F));
                    i16 = this.A;
                    if (i16 != i15 || i16 == i14 || i16 == 8 || i16 == 9 || i16 == 10 || i16 == 14) {
                        i17 = 6;
                    } else {
                        if (i16 != 12 && i16 != 13) {
                            if (i16 == 0 || i16 == 11) {
                                i17 = 6;
                                canvas2.drawCircle(i10, i13, f7, paint);
                            } else {
                                float f23 = i10;
                                float f24 = f23 - f10;
                                float f25 = i13;
                                float f26 = f25 - f10;
                                float f27 = f23 + f10;
                                float f28 = f25 + f10;
                                RectF rectF2 = this.c;
                                rectF2.set(f24, f26, f27, f28);
                                int i27 = this.A;
                                if (i27 == 6) {
                                    i20 = (int) ((-360.0f) * f12);
                                    i21 = 0;
                                } else if (i27 == 1) {
                                    i20 = (int) ((-270.0f) * f12);
                                    i21 = -90;
                                } else {
                                    i20 = (int) (270.0f * f12);
                                    if (LocaleController.isRTL) {
                                        i20 = -i20;
                                    }
                                    i21 = 90;
                                }
                                if (i27 == 6) {
                                    int v02 = org.telegram.ui.ActionBar.j6.v0(this.u, this.F);
                                    int alpha = Color.alpha(v02);
                                    paint.setColor(v02);
                                    paint.setAlpha((int) (alpha * f12));
                                    int i28 = i20;
                                    float f29 = i28;
                                    i22 = i28;
                                    rectF = rectF2;
                                    i23 = i21;
                                    i17 = 6;
                                    canvas2.drawArc(rectF, i21, f29, false, paint);
                                    int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.X9, this.F);
                                    int alpha2 = Color.alpha(v03);
                                    paint.setColor(v03);
                                    paint.setAlpha((int) (alpha2 * f12));
                                } else {
                                    i22 = i20;
                                    rectF = rectF2;
                                    i17 = 6;
                                    i23 = i21;
                                }
                                canvas2 = canvas;
                                canvas2.drawArc(rectF, i23, i22, false, paint);
                            }
                            if (f11 > f13) {
                                float f30 = f12 < 0.5f ? 0.0f : (f12 - 0.5f) / 0.5f;
                                int i29 = this.A;
                                if (i29 == 9) {
                                    I.setColor(org.telegram.ui.ActionBar.j6.v0(this.t, this.F));
                                } else if (i29 == 11 || i29 == i17 || i29 == 7 || i29 == 10 || ((!this.z && this.s >= 0) || i29 == 14)) {
                                    I.setColor(org.telegram.ui.ActionBar.j6.v0(this.s, this.F));
                                } else {
                                    int i30 = this.x;
                                    if (i30 != 0) {
                                        I.setColor(i30);
                                    } else {
                                        I.setColor(org.telegram.ui.ActionBar.j6.v0(this.k ? org.telegram.ui.ActionBar.j6.i7 : org.telegram.ui.ActionBar.j6.j7, this.F));
                                    }
                                }
                                if (this.n) {
                                    I.setColor(paint.getColor());
                                } else if (this.h < f15) {
                                    I.setColor(i0.a.d(this.h, paint.getColor(), I.getColor()));
                                }
                                boolean z12 = this.y;
                                Paint paint3 = this.d;
                                if (z12 || (i19 = this.r) < 0) {
                                    paint3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k7, this.F));
                                } else {
                                    paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i19, this.F));
                                }
                                if (this.h < f15 && org.telegram.ui.ActionBar.j6.I.q()) {
                                    paint3.setColor(i0.a.d(this.h, I.getColor(), paint3.getColor()));
                                }
                                if (this.A != -1) {
                                    float dp3 = AndroidUtilities.dp(this.B) / 2.0f;
                                    int save = canvas2.save();
                                    canvas2.translate(i10 - dp3, i13 - dp3);
                                    boolean z13 = f11 < f15;
                                    if (z13) {
                                        canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.B), AndroidUtilities.dp(this.B), 255, 31);
                                    }
                                    Paint paint4 = (Paint) this.G.provide(null);
                                    int i31 = this.A;
                                    if (i31 == 12 || i31 == 13) {
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
                                        float f31 = dp3 - dp4;
                                        float f32 = dp3 + dp4;
                                        canvas.drawRoundRect(f31, f31, f32, f32, lerp2, lerp2, paint4);
                                        float f33 = (f15 - f11) * dp4;
                                        float lerp3 = AndroidUtilities.lerp(f33, this.v, this.w);
                                        if (!z13 || f33 <= 0.0f) {
                                            canvas2 = canvas;
                                        } else {
                                            float f34 = dp3 - f33;
                                            float f35 = dp3 + f33;
                                            canvas2 = canvas;
                                            canvas2.drawRoundRect(f34, f34, f35, f35, lerp3, lerp3, org.telegram.ui.ActionBar.j6.Il);
                                        }
                                    } else {
                                        canvas2 = canvas;
                                        float dp5 = f7 - AndroidUtilities.dp(0.5f);
                                        canvas2.drawCircle(dp3, dp3, dp5, paint4);
                                        float f36 = (f15 - f11) * dp5;
                                        if (z13 && f36 > 0.0f) {
                                            canvas2.drawCircle(dp3, dp3, f36, org.telegram.ui.ActionBar.j6.Il);
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
                                    J.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.M6, this.F));
                                    canvas2.drawCircle(i10, i13, AndroidUtilities.dp(9.0f), J);
                                } else if (f30 != 0.0f) {
                                    if (this.C != null) {
                                        if (this.g == null) {
                                            i18 = 1;
                                            TextPaint textPaint = new TextPaint(1);
                                            this.g = textPaint;
                                            textPaint.setTypeface(AndroidUtilities.bold());
                                        } else {
                                            i18 = 1;
                                        }
                                        int length = this.C.length();
                                        if (length == 0 || length == i18 || length == 2) {
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
                                        this.g.setColor(org.telegram.ui.ActionBar.j6.v0(this.r, this.F));
                                        canvas2.save();
                                        float f37 = i10;
                                        canvas2.scale(f30, 1.0f, f37, i13);
                                        String str = this.C;
                                        canvas2.drawText(str, f37 - (this.g.measureText(str) / 2.0f), AndroidUtilities.dp(f17), this.g);
                                        canvas2.restore();
                                    } else {
                                        Path path = this.j;
                                        path.reset();
                                        int i32 = this.A;
                                        float f38 = i32 == -1 ? 1.4f : i32 == 5 ? 0.8f : 1.0f;
                                        float dp6 = AndroidUtilities.dp(9.0f * f38) * f30;
                                        float dp7 = AndroidUtilities.dp(f38 * 4.0f) * f30;
                                        int dp8 = i10 - AndroidUtilities.dp(f14);
                                        int dp9 = AndroidUtilities.dp(4.0f) + i13;
                                        float sqrt = (float) Math.sqrt((dp7 * dp7) / 2.0f);
                                        float f39 = dp8;
                                        float f40 = dp9;
                                        path.moveTo(f39 - sqrt, f40 - sqrt);
                                        path.lineTo(f39, f40);
                                        float sqrt2 = (float) Math.sqrt((dp6 * dp6) / 2.0f);
                                        path.lineTo(f39 + sqrt2, f40 - sqrt2);
                                        if (z10 || this.e != 1.0f) {
                                            canvas2.save();
                                            float f41 = this.e;
                                            canvas2.scale(f41, f41, i10, i13);
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
                                canvas2.restore();
                                return;
                            }
                            return;
                        }
                        i17 = 6;
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
                            matrix.postTranslate(0.0f, (-this.E.r) + rect.top);
                            shader.setLocalMatrix(matrix);
                            paint.setShader(shader);
                        }
                        canvas2.drawCircle(i10, i13, (f7 - AndroidUtilities.dp(f15)) * this.m, paint);
                        paint.setStyle(Paint.Style.STROKE);
                    }
                    f13 = 0.0f;
                    if (f11 > f13) {
                    }
                    if (z10) {
                    }
                } else {
                    if (i24 == 6 || i24 == 7) {
                        i13 = i11;
                        f14 = 1.5f;
                        float f42 = i10;
                        float f43 = i13;
                        canvas2.drawCircle(f42, f43, f7 - AndroidUtilities.dp(1.0f), I);
                        canvas2.drawCircle(f42, f43, f7 - AndroidUtilities.dp(1.5f), paint2);
                    } else {
                        i13 = i11;
                        f14 = 1.5f;
                        canvas2.drawCircle(i10, i13, f7, I);
                    }
                    paint = paint2;
                    i14 = 7;
                    i15 = -1;
                }
                f15 = 1.0f;
                I.setColor(org.telegram.ui.ActionBar.j6.v0(this.r, this.F));
                i16 = this.A;
                if (i16 != i15) {
                }
                i17 = 6;
                f13 = 0.0f;
                if (f11 > f13) {
                }
                if (z10) {
                }
            } else if (this.z) {
                int i33 = this.A;
                if (i33 == 12 || i33 == 13) {
                    I.setColor(org.telegram.ui.ActionBar.j6.v0(i12, this.F));
                    I.setAlpha((int) (this.m * 255.0f));
                    paint2.setColor(org.telegram.ui.ActionBar.j6.v0(this.r, this.F));
                } else if (i33 == 6 || i33 == 7) {
                    I.setColor(org.telegram.ui.ActionBar.j6.v0(this.t, this.F));
                    paint2.setColor(org.telegram.ui.ActionBar.j6.v0(this.r, this.F));
                } else if (i33 == 10 || i33 == 14) {
                    paint2.setColor(org.telegram.ui.ActionBar.j6.v0(this.t, this.F));
                } else {
                    Paint paint6 = I;
                    int indexOfKey = org.telegram.ui.ActionBar.j6.rl.indexOfKey(org.telegram.ui.ActionBar.j6.lc);
                    paint6.setColor((16777215 & (indexOfKey >= 0 ? org.telegram.ui.ActionBar.j6.rl.valueAt(indexOfKey) : org.telegram.ui.ActionBar.j6.X)) | 671088640);
                    paint2.setColor(org.telegram.ui.ActionBar.j6.v0(this.r, this.F));
                }
            } else {
                int i34 = this.t;
                if (i34 < 0) {
                    i34 = this.r;
                }
                paint2.setColor(AndroidUtilities.getOffsetColor(16777215, org.telegram.ui.ActionBar.j6.v0(i34, this.F), f12, this.m));
            }
            if (this.z) {
            }
            paint = paint2;
            i13 = i11;
            i14 = 7;
            i15 = -1;
            f14 = 1.5f;
            f15 = 1.0f;
            I.setColor(org.telegram.ui.ActionBar.j6.v0(this.r, this.F));
            i16 = this.A;
            if (i16 != i15) {
            }
            i17 = 6;
            f13 = 0.0f;
            if (f11 > f13) {
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
        if (this.z) {
        }
        paint = paint22;
        i13 = i11;
        i14 = 7;
        i15 = -1;
        f14 = 1.5f;
        f15 = 1.0f;
        I.setColor(org.telegram.ui.ActionBar.j6.v0(this.r, this.F));
        i16 = this.A;
        if (i16 != i15) {
        }
        i17 = 6;
        f13 = 0.0f;
        if (f11 > f13) {
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
        ofFloat.addListener(new j6(this, 16));
        this.p.setInterpolator(pr.g);
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
        np npVar = this.D;
        if (npVar != null) {
            npVar.b();
        }
    }
}
