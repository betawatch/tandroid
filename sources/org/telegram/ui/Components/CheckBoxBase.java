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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class CheckBoxBase {
    public static Paint I;
    public static Paint J;
    public int A;
    public float B;
    public String C;
    public mp D;
    public org.telegram.ui.ActionBar.g5 E;
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
        this.G = new k2(12);
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
        float f10;
        float f11;
        float f12;
        boolean z4;
        float f13;
        Rect rect;
        int i10;
        int i11;
        float f14;
        Canvas canvas2;
        int i12;
        Paint paint;
        int i13;
        int i14;
        int i15;
        float f15;
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
        float dp = AndroidUtilities.dp(this.B / 2.0f);
        int i25 = this.A;
        if (i25 == 12 || i25 == 13) {
            dp = AndroidUtilities.dp(10.0f);
        } else if (i25 != 0 && i25 != 11) {
            f10 = dp;
            f11 = dp - AndroidUtilities.dp(0.2f);
            float f19 = !this.n ? 1.0f : this.o;
            f12 = f19 < 0.5f ? 1.0f : f19 / 0.5f;
            Rect rect2 = this.b;
            int centerX = rect2.centerX();
            int centerY = rect2.centerY();
            z4 = !this.i && f12 > 0.0f && f19 >= 0.5f && !this.n && this.C == null;
            if (z4) {
                f13 = f19;
                rect = rect2;
                i10 = centerX;
                i11 = centerY;
                f14 = 0.0f;
                canvas2 = canvas;
            } else {
                float f20 = centerX;
                float f21 = centerY;
                f13 = f19;
                rect = rect2;
                i10 = centerX;
                i11 = centerY;
                f14 = 0.0f;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(f20 - f10, f21 - f10, f20 + f10, f21 + f10, 255, 31);
            }
            i12 = this.s;
            Paint paint2 = this.f;
            if (i12 >= 0) {
                if (this.z) {
                    I.setColor(Color.argb((int) (this.m * 25.0f), 0, 0, 0));
                    if (this.A == 8) {
                        paint2.setColor(org.telegram.ui.ActionBar.j6.v0(this.t, this.F));
                    } else {
                        paint2.setColor(AndroidUtilities.getOffsetColor(-1, org.telegram.ui.ActionBar.j6.v0(this.r, this.F), f13, this.m));
                    }
                } else if (this.x != 0) {
                    paint2.setColor(0);
                } else {
                    int i26 = this.t;
                    if (i26 < 0) {
                        i26 = this.r;
                    }
                    paint2.setColor(AndroidUtilities.getOffsetColor(16777215, org.telegram.ui.ActionBar.j6.v0(i26, this.F), f13, this.m));
                }
                if (this.z || (i24 = this.A) < 0 || i24 == 12 || i24 == 13) {
                    paint = paint2;
                    i13 = i11;
                    i14 = 7;
                    i15 = -1;
                    f15 = 1.5f;
                } else if (i24 == 8 || i24 == 10 || i24 == 14) {
                    i13 = i11;
                    f15 = 1.5f;
                    if (this.v > f14) {
                        float dp2 = f10 - AndroidUtilities.dp(1.5f);
                        float lerp = AndroidUtilities.lerp(dp2, this.v, this.w);
                        float f22 = i10;
                        float f23 = i13;
                        i14 = 7;
                        i15 = -1;
                        f16 = 1.0f;
                        canvas2.drawRoundRect(f22 - dp2, f23 - dp2, f22 + dp2, f23 + dp2, lerp, lerp, paint2);
                        paint = paint2;
                    } else {
                        paint = paint2;
                        i14 = 7;
                        i15 = -1;
                        f16 = 1.0f;
                        canvas2.drawCircle(i10, i13, f10 - AndroidUtilities.dp(1.5f), paint);
                    }
                    I.setColor(org.telegram.ui.ActionBar.j6.v0(this.r, this.F));
                    i16 = this.A;
                    if (i16 != i15 || i16 == i14 || i16 == 8 || i16 == 9 || i16 == 10 || i16 == 14) {
                        i17 = 6;
                    } else {
                        if (i16 != 12 && i16 != 13) {
                            if (i16 == 0 || i16 == 11) {
                                i17 = 6;
                                canvas2.drawCircle(i10, i13, f10, paint);
                            } else {
                                float f24 = i10;
                                float f25 = f24 - f11;
                                float f26 = i13;
                                float f27 = f26 - f11;
                                float f28 = f24 + f11;
                                float f29 = f26 + f11;
                                RectF rectF2 = this.c;
                                rectF2.set(f25, f27, f28, f29);
                                int i27 = this.A;
                                if (i27 == 6) {
                                    i20 = (int) ((-360.0f) * f13);
                                    i21 = 0;
                                } else if (i27 == 1) {
                                    i20 = (int) ((-270.0f) * f13);
                                    i21 = -90;
                                } else {
                                    i20 = (int) (270.0f * f13);
                                    if (LocaleController.isRTL) {
                                        i20 = -i20;
                                    }
                                    i21 = 90;
                                }
                                if (i27 == 6) {
                                    int v02 = org.telegram.ui.ActionBar.j6.v0(this.u, this.F);
                                    int alpha = Color.alpha(v02);
                                    paint.setColor(v02);
                                    paint.setAlpha((int) (alpha * f13));
                                    int i28 = i20;
                                    float f30 = i28;
                                    i22 = i28;
                                    rectF = rectF2;
                                    i23 = i21;
                                    i17 = 6;
                                    canvas2.drawArc(rectF, i21, f30, false, paint);
                                    int v03 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.X9, this.F);
                                    int alpha2 = Color.alpha(v03);
                                    paint.setColor(v03);
                                    paint.setAlpha((int) (alpha2 * f13));
                                } else {
                                    i22 = i20;
                                    rectF = rectF2;
                                    i17 = 6;
                                    i23 = i21;
                                }
                                canvas2 = canvas;
                                canvas2.drawArc(rectF, i23, i22, false, paint);
                            }
                            if (f12 > f14) {
                                float f31 = f13 < 0.5f ? 0.0f : (f13 - 0.5f) / 0.5f;
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
                                } else if (this.h < f16) {
                                    I.setColor(i0.a.d(this.h, paint.getColor(), I.getColor()));
                                }
                                boolean z11 = this.y;
                                Paint paint3 = this.d;
                                if (z11 || (i19 = this.r) < 0) {
                                    paint3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.k7, this.F));
                                } else {
                                    paint3.setColor(org.telegram.ui.ActionBar.j6.v0(i19, this.F));
                                }
                                if (this.h < f16 && org.telegram.ui.ActionBar.j6.I.q()) {
                                    paint3.setColor(i0.a.d(this.h, I.getColor(), paint3.getColor()));
                                }
                                if (this.A != -1) {
                                    float dp3 = AndroidUtilities.dp(this.B) / 2.0f;
                                    int save = canvas2.save();
                                    canvas2.translate(i10 - dp3, i13 - dp3);
                                    boolean z12 = f12 < f16;
                                    if (z12) {
                                        canvas2.saveLayerAlpha(0.0f, 0.0f, AndroidUtilities.dp(this.B), AndroidUtilities.dp(this.B), 255, 31);
                                    }
                                    Paint paint4 = (Paint) this.G.provide(null);
                                    int i31 = this.A;
                                    if (i31 == 12 || i31 == 13) {
                                        canvas2 = canvas;
                                        int alpha3 = paint4.getAlpha();
                                        paint4.setAlpha((int) (f12 * 255.0f));
                                        canvas2.drawCircle(dp3, dp3, f10 * f12, paint4);
                                        if (paint4 != I) {
                                            paint4.setAlpha(alpha3);
                                        }
                                    } else if (this.v > 0.0f) {
                                        float dp4 = f10 - AndroidUtilities.dp(0.5f);
                                        float lerp2 = AndroidUtilities.lerp(dp4, this.v, this.w);
                                        float f32 = dp3 - dp4;
                                        float f33 = dp3 + dp4;
                                        canvas.drawRoundRect(f32, f32, f33, f33, lerp2, lerp2, paint4);
                                        float f34 = (f16 - f12) * dp4;
                                        float lerp3 = AndroidUtilities.lerp(f34, this.v, this.w);
                                        if (!z12 || f34 <= 0.0f) {
                                            canvas2 = canvas;
                                        } else {
                                            float f35 = dp3 - f34;
                                            float f36 = dp3 + f34;
                                            canvas2 = canvas;
                                            canvas2.drawRoundRect(f35, f35, f36, f36, lerp3, lerp3, org.telegram.ui.ActionBar.j6.Il);
                                        }
                                    } else {
                                        canvas2 = canvas;
                                        float dp5 = f10 - AndroidUtilities.dp(0.5f);
                                        canvas2.drawCircle(dp3, dp3, dp5, paint4);
                                        float f37 = (f16 - f12) * dp5;
                                        if (z12 && f37 > 0.0f) {
                                            canvas2.drawCircle(dp3, dp3, f37, org.telegram.ui.ActionBar.j6.Il);
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
                                } else if (f31 != 0.0f) {
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
                                            f17 = 14.0f;
                                            f18 = 18.0f;
                                        } else if (length != 3) {
                                            f17 = 8.0f;
                                            f18 = 15.75f;
                                        } else {
                                            f18 = 16.5f;
                                            f17 = 10.0f;
                                        }
                                        this.g.setTextSize(AndroidUtilities.dp(f17));
                                        this.g.setColor(org.telegram.ui.ActionBar.j6.v0(this.r, this.F));
                                        canvas2.save();
                                        float f38 = i10;
                                        canvas2.scale(f31, 1.0f, f38, i13);
                                        String str = this.C;
                                        canvas2.drawText(str, f38 - (this.g.measureText(str) / 2.0f), AndroidUtilities.dp(f18), this.g);
                                        canvas2.restore();
                                    } else {
                                        Path path = this.j;
                                        path.reset();
                                        int i32 = this.A;
                                        float f39 = i32 == -1 ? 1.4f : i32 == 5 ? 0.8f : 1.0f;
                                        float dp6 = AndroidUtilities.dp(9.0f * f39) * f31;
                                        float dp7 = AndroidUtilities.dp(f39 * 4.0f) * f31;
                                        int dp8 = i10 - AndroidUtilities.dp(f15);
                                        int dp9 = AndroidUtilities.dp(4.0f) + i13;
                                        float sqrt = (float) Math.sqrt((dp7 * dp7) / 2.0f);
                                        float f40 = dp8;
                                        float f41 = dp9;
                                        path.moveTo(f40 - sqrt, f41 - sqrt);
                                        path.lineTo(f40, f41);
                                        float sqrt2 = (float) Math.sqrt((dp6 * dp6) / 2.0f);
                                        path.lineTo(f40 + sqrt2, f41 - sqrt2);
                                        if (z4 || this.e != 1.0f) {
                                            canvas2.save();
                                            float f42 = this.e;
                                            canvas2.scale(f42, f42, i10, i13);
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
                            if (z4) {
                                canvas2.restore();
                                return;
                            }
                            return;
                        }
                        i17 = 6;
                        paint.setStyle(Paint.Style.FILL);
                        org.telegram.ui.ActionBar.g5 g5Var = this.E;
                        if (g5Var == null || !g5Var.l()) {
                            paint.setShader(null);
                        } else {
                            org.telegram.ui.ActionBar.g5 g5Var2 = this.E;
                            Shader shader = g5Var2.a;
                            Matrix matrix = g5Var2.k;
                            matrix.reset();
                            this.E.a();
                            matrix.postTranslate(0.0f, (-this.E.r) + rect.top);
                            shader.setLocalMatrix(matrix);
                            paint.setShader(shader);
                        }
                        canvas2.drawCircle(i10, i13, (f10 - AndroidUtilities.dp(f16)) * this.m, paint);
                        paint.setStyle(Paint.Style.STROKE);
                    }
                    f14 = 0.0f;
                    if (f12 > f14) {
                    }
                    if (z4) {
                    }
                } else {
                    if (i24 == 6 || i24 == 7) {
                        i13 = i11;
                        f15 = 1.5f;
                        float f43 = i10;
                        float f44 = i13;
                        canvas2.drawCircle(f43, f44, f10 - AndroidUtilities.dp(1.0f), I);
                        canvas2.drawCircle(f43, f44, f10 - AndroidUtilities.dp(1.5f), paint2);
                    } else {
                        i13 = i11;
                        f15 = 1.5f;
                        canvas2.drawCircle(i10, i13, f10, I);
                    }
                    paint = paint2;
                    i14 = 7;
                    i15 = -1;
                }
                f16 = 1.0f;
                I.setColor(org.telegram.ui.ActionBar.j6.v0(this.r, this.F));
                i16 = this.A;
                if (i16 != i15) {
                }
                i17 = 6;
                f14 = 0.0f;
                if (f12 > f14) {
                }
                if (z4) {
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
                paint2.setColor(AndroidUtilities.getOffsetColor(16777215, org.telegram.ui.ActionBar.j6.v0(i34, this.F), f13, this.m));
            }
            if (this.z) {
            }
            paint = paint2;
            i13 = i11;
            i14 = 7;
            i15 = -1;
            f15 = 1.5f;
            f16 = 1.0f;
            I.setColor(org.telegram.ui.ActionBar.j6.v0(this.r, this.F));
            i16 = this.A;
            if (i16 != i15) {
            }
            i17 = 6;
            f14 = 0.0f;
            if (f12 > f14) {
            }
            if (z4) {
            }
        }
        f10 = dp;
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
        if (z4) {
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
        f15 = 1.5f;
        f16 = 1.0f;
        I.setColor(org.telegram.ui.ActionBar.j6.v0(this.r, this.F));
        i16 = this.A;
        if (i16 != i15) {
        }
        i17 = 6;
        f14 = 0.0f;
        if (f12 > f14) {
        }
        if (z4) {
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

    public final void f(int i10, boolean z4, boolean z10) {
        if (i10 >= 0) {
            String str = "" + (i10 + 1);
            String str2 = this.C;
            if (str2 == null || !str2.equals(str)) {
                this.C = str;
                b();
            }
        }
        if (z4 == this.q) {
            return;
        }
        this.q = z4;
        if (!this.l || !z10) {
            ObjectAnimator objectAnimator = this.p;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.p = null;
            }
            setProgress(z4 ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "progress", z4 ? 1.0f : 0.0f);
        this.p = ofFloat;
        ofFloat.addListener(new a9(this, 12));
        this.p.setInterpolator(nr.g);
        this.p.setDuration(this.H);
        this.p.start();
    }

    public final void g(boolean z4, boolean z10) {
        f(-1, z4, z10);
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

    public final void i(float f10) {
        if (this.v == f10) {
            return;
        }
        this.v = f10;
        b();
    }

    public final void j(boolean z4) {
        if (this.i == z4) {
            return;
        }
        this.i = z4;
        this.d.setXfermode(z4 ? new PorterDuffXfermode(PorterDuff.Mode.CLEAR) : null);
        b();
    }

    public final void k(boolean z4) {
        if (this.z == z4) {
            return;
        }
        this.z = z4;
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
        mp mpVar = this.D;
        if (mpVar != null) {
            mpVar.a();
        }
    }
}
