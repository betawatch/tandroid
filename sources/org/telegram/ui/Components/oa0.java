package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class oa0 extends Drawable {
    public tv A;
    public org.telegram.ui.ActionBar.j5 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public PorterDuffColorFilter g;
    public float h;
    public final DecelerateInterpolator i;
    public boolean j;
    public float k;
    public int l;
    public String m;
    public int n;
    public float o;
    public int p;
    public int q;
    public float r;
    public float s;
    public long t;
    public boolean u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public oa0() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f = new RectF();
        this.h = 1.0f;
        this.i = new DecelerateInterpolator();
        this.k = 400.0f;
        this.l = -1;
        this.o = 1.0f;
        this.r = 1.0f;
        paint.setColor(-1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        paint2.setColor(-1);
    }

    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var = this.B;
        if (j5Var == null || !j5Var.k() || this.E) {
            return;
        }
        Rect bounds = getBounds();
        org.telegram.ui.ActionBar.j5 j5Var2 = this.B;
        Shader shader = j5Var2.a;
        Matrix matrix = j5Var2.k;
        matrix.reset();
        this.B.a();
        if (z10) {
            matrix.postTranslate(-bounds.centerX(), (-this.B.r) + bounds.top);
        } else {
            matrix.postTranslate(0.0f, -this.B.r);
        }
        shader.setLocalMatrix(matrix);
    }

    public final float b() {
        if (this.u) {
            return this.r;
        }
        return 1.0f;
    }

    public final void c(int i10) {
        int i11 = (-16777216) | i10;
        this.b.setColor(i11);
        this.d.setColor(i11);
        this.e.setColor(i11);
        this.a.setColor(i11);
        this.g = new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i10, boolean z10) {
        int i11;
        int i12;
        if (this.p == i10 && (i12 = this.q) != i10) {
            this.p = i12;
            this.r = 1.0f;
        }
        if (z10) {
            int i13 = this.p;
            if (i13 == i10 || (i11 = this.q) == i10) {
                return;
            }
            if ((i13 == 0 && i10 == 1) || (i13 == 1 && i10 == 0)) {
                this.k = 300.0f;
            } else if (i13 == 2 && (i10 == 3 || i10 == 14)) {
                this.k = 400.0f;
            } else if (i13 != 4 && i10 == 6) {
                this.k = 360.0f;
            } else if ((i13 == 4 && i10 == 14) || (i13 == 14 && i10 == 4)) {
                this.k = 160.0f;
            } else {
                this.k = 220.0f;
            }
            if (this.u) {
                this.p = i11;
            }
            this.u = true;
            this.q = i10;
            this.s = this.r;
            this.r = 0.0f;
        } else {
            if (this.p == i10) {
                return;
            }
            this.u = false;
            this.q = i10;
            this.p = i10;
            this.s = this.r;
            this.r = 1.0f;
        }
        if (i10 == 3 || i10 == 14) {
            this.v = 112.0f;
            this.x = 0.0f;
            this.y = 0.0f;
            this.z = 0.0f;
        }
        invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:279:0x0815, code lost:
    
        if (r40.q == 1) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0817, code lost:
    
        r3 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x081b, code lost:
    
        r11 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x081a, code lost:
    
        r3 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0820, code lost:
    
        if (r2 == r4) goto L356;
     */
    /* JADX WARN: Removed duplicated region for block: B:218:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x07a8  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x05b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0663 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x07e6 A[ADDED_TO_REGION] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f7;
        int save;
        int i10;
        float f10;
        float f11;
        float dp;
        int i11;
        Paint paint;
        int i12;
        RectF rectF;
        float dp2;
        float dp3;
        float f12;
        float f13;
        float f14;
        float f15;
        RectF rectF2;
        Canvas canvas2;
        int i13;
        int i14;
        int i15;
        int i16;
        float f16;
        float f17;
        int i17;
        Path[] pathArr;
        Path[] pathArr2;
        Drawable drawable;
        int i18;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        float f18;
        Rect rect;
        float f19;
        int i19;
        int i20;
        int i21;
        int i22;
        Paint paint2;
        float interpolation;
        float f20;
        float f21;
        int i23;
        float f22;
        int i24;
        int i25;
        float f23;
        int i26;
        Path path;
        int i27;
        boolean z10;
        int i28;
        float f24;
        float f25;
        int i29;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        float f33;
        float f34;
        float centerX;
        int centerY;
        int centerY2;
        RectF rectF3;
        int i30;
        int i31;
        RectF rectF4;
        int i32;
        int i33;
        int i34;
        Rect bounds = getBounds();
        org.telegram.ui.ActionBar.j5 j5Var = this.B;
        Paint paint3 = this.e;
        Paint paint4 = this.d;
        Paint paint5 = this.b;
        if (j5Var != null && j5Var.k() && !this.E) {
            Shader shader = this.B.a;
            paint5.setShader(shader);
            paint4.setShader(shader);
            paint3.setShader(shader);
        } else if (this.C == null || this.E) {
            paint5.setShader(null);
            paint4.setShader(null);
            paint3.setShader(null);
        } else {
            this.D.reset();
            this.D.setTranslate(0.0f, bounds.top);
            this.C.setLocalMatrix(this.D);
            paint5.setShader(this.C);
            paint4.setShader(this.C);
            paint3.setShader(this.C);
        }
        int centerX2 = bounds.centerX();
        int centerY3 = bounds.centerY();
        int i35 = this.q;
        if (i35 == 4) {
            int i36 = this.p;
            if (i36 == 3 || i36 == 14) {
                f7 = 1.0f;
                i10 = 0;
            } else {
                save = canvas.save();
                f7 = 1.0f;
                float f35 = 1.0f - this.r;
                canvas.scale(f35, f35, centerX2, centerY3);
                i10 = save;
            }
        } else {
            f7 = 1.0f;
            if ((i35 == 6 || i35 == 10) && this.p == 4) {
                save = canvas.save();
                float f36 = this.r;
                canvas.scale(f36, f36, centerX2, centerY3);
                i10 = save;
            }
            i10 = 0;
        }
        AndroidUtilities.dp(3.0f);
        int i37 = this.p;
        RectF rectF5 = this.f;
        if (i37 == 2 || this.q == 2) {
            a(false);
            float f37 = centerY3;
            float dp4 = f37 - (AndroidUtilities.dp(9.0f) * this.h);
            f10 = 0.5f;
            float dp5 = (AndroidUtilities.dp(9.0f) * this.h) + f37;
            float dp6 = (AndroidUtilities.dp(12.0f) * this.h) + f37;
            int i38 = this.p;
            if ((i38 == 3 || i38 == 14) && this.q == 2) {
                paint5.setAlpha((int) (Math.min(f7, this.r / 0.5f) * 255.0f));
                f11 = this.r;
                dp = (AndroidUtilities.dp(12.0f) * this.h) + f37;
            } else {
                int i39 = this.q;
                if (i39 == 3 || i39 == 14 || i39 == 2) {
                    paint5.setAlpha(255);
                    f15 = this.r;
                } else {
                    paint5.setAlpha((int) ((1.0f - this.r) * Math.min(1.0f, this.s / 0.5f) * 255.0f));
                    f15 = this.s;
                }
                f11 = f15;
                dp = (AndroidUtilities.dp(1.0f) * this.h) + f37;
            }
            if (this.u) {
                int i40 = this.q;
                int i41 = 2;
                if (i40 != 2) {
                    if (f11 <= 0.5f) {
                        i41 = 2;
                    } else {
                        float dp7 = AndroidUtilities.dp(13.0f);
                        float f38 = this.h;
                        float dp8 = (dp7 * f38 * f38) + (this.j ? AndroidUtilities.dp(2.0f) : 0);
                        float f39 = f11 - 0.5f;
                        float f40 = f39 / 0.5f;
                        if (f39 > 0.2f) {
                            f14 = (f39 - 0.2f) / 0.3f;
                            f13 = 1.0f;
                        } else {
                            f13 = f39 / 0.2f;
                            f14 = 0.0f;
                        }
                        float f41 = centerX2;
                        float f42 = dp8 / 2.0f;
                        rectF5.set(f41 - dp8, dp6 - f42, f41, dp6 + f42);
                        float f43 = f14 * 100.0f;
                        i11 = i10;
                        paint = paint4;
                        float f44 = f14;
                        dp2 = f41;
                        i12 = centerY3;
                        canvas.drawArc(rectF5, f43, (104.0f * f40) - f43, false, paint5);
                        float y3 = com.google.android.gms.internal.play_billing.k3.y(dp6, dp, f13, dp);
                        if (f44 > 0.0f) {
                            float f45 = this.q == 14 ? 0.0f : (-45.0f) * (1.0f - f44);
                            float dp9 = AndroidUtilities.dp(7.0f) * f44 * this.h;
                            int i42 = (int) (f44 * 255.0f);
                            int i43 = this.q;
                            if (i43 != 3 && i43 != 14 && i43 != 2) {
                                i42 = (int) (i42 * (1.0f - Math.min(1.0f, this.r / 0.5f)));
                            }
                            int i44 = i42;
                            if (f45 != 0.0f) {
                                canvas.save();
                                canvas.rotate(f45, dp2, f37);
                            }
                            if (i44 != 0) {
                                paint5.setAlpha(i44);
                                if (this.q == 14) {
                                    paint3.setAlpha(i44);
                                    rectF5.set(centerX2 - AndroidUtilities.dp(3.5f), i12 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + centerX2, AndroidUtilities.dp(3.5f) + i12);
                                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
                                    paint5.setAlpha((int) (i44 * 0.15f));
                                    int dp10 = AndroidUtilities.dp(this.j ? 2.0f : 4.0f);
                                    rectF5.set(bounds.left + dp10, bounds.top + dp10, bounds.right - dp10, bounds.bottom - dp10);
                                    canvas.drawArc(rectF5, 0.0f, 360.0f, false, paint5);
                                    paint5.setAlpha(i44);
                                } else {
                                    float f46 = dp2 - dp9;
                                    float f47 = f37 - dp9;
                                    float f48 = dp2 + dp9;
                                    float f49 = dp9 + f37;
                                    rectF = rectF5;
                                    canvas.drawLine(f46, f47, f48, f49, paint5);
                                    canvas.drawLine(f48, f47, f46, f49, paint5);
                                    if (f45 != 0.0f) {
                                        canvas.restore();
                                    }
                                }
                            }
                            rectF = rectF5;
                            if (f45 != 0.0f) {
                            }
                        } else {
                            rectF = rectF5;
                        }
                        dp4 = y3;
                        dp3 = dp2;
                        dp5 = dp6;
                    }
                }
                i11 = i10;
                paint = paint4;
                i12 = centerY3;
                rectF = rectF5;
                if (i40 == i41) {
                    f12 = 1.0f - f11;
                } else {
                    f12 = f11 / 0.5f;
                    f11 = 1.0f - f12;
                }
                float y10 = com.google.android.gms.internal.play_billing.k3.y(dp, dp4, f12, dp4);
                float y11 = com.google.android.gms.internal.play_billing.k3.y(dp6, dp5, f12, dp5);
                float f50 = centerX2;
                float dp11 = f50 - ((AndroidUtilities.dp(8.0f) * f11) * this.h);
                dp3 = f50 + (AndroidUtilities.dp(8.0f) * f11 * this.h);
                dp6 = y11 - ((AndroidUtilities.dp(8.0f) * f11) * this.h);
                dp4 = y10;
                dp2 = dp11;
                dp5 = y11;
            } else {
                i11 = i10;
                paint = paint4;
                i12 = centerY3;
                rectF = rectF5;
                float f51 = centerX2;
                dp2 = f51 - (AndroidUtilities.dp(8.0f) * this.h);
                dp3 = (AndroidUtilities.dp(8.0f) * this.h) + f51;
                dp6 = dp5 - (AndroidUtilities.dp(8.0f) * this.h);
            }
            float f52 = dp3;
            float f53 = dp4;
            if (f53 != dp5) {
                float f54 = centerX2;
                canvas.drawLine(f54, f53, f54, dp5, paint5);
            }
            float f55 = centerX2;
            if (dp2 != f55) {
                float f56 = dp6;
                canvas.drawLine(dp2, f56, f55, dp5, paint5);
                canvas.drawLine(f52, f56, f55, dp5, paint5);
            }
        } else {
            i11 = i10;
            paint = paint4;
            i12 = centerY3;
            f10 = 0.5f;
            rectF = rectF5;
        }
        int i45 = this.p;
        if (i45 == 3 || i45 == 14) {
            rectF2 = rectF;
            canvas2 = canvas;
            i13 = 1;
            i14 = 4;
        } else {
            i14 = 4;
            if (i45 == 4 && ((i34 = this.q) == 14 || i34 == 3)) {
                rectF2 = rectF;
                canvas2 = canvas;
                i13 = 1;
            } else if (i45 == 10 || this.q == 10 || i45 == 13) {
                int i46 = this.q;
                int i47 = (i46 == 4 || i46 == 6) ? (int) ((1.0f - this.r) * 255.0f) : 255;
                if (i47 != 0) {
                    a(false);
                    paint5.setAlpha((int) (i47 * this.o));
                    float max = Math.max(4.0f, this.x * 360.0f);
                    int dp12 = AndroidUtilities.dp(this.j ? 2.0f : 4.0f);
                    rectF.set(bounds.left + dp12, bounds.top + dp12, bounds.right - dp12, bounds.bottom - dp12);
                    canvas2 = canvas;
                    z10 = true;
                    canvas2.drawArc(rectF, this.v, max, false, paint5);
                } else {
                    z10 = true;
                    canvas2 = canvas;
                }
                i15 = i12;
                i16 = this.p;
                if (i16 != this.q) {
                    f16 = 1.0f;
                    f17 = 1.0f;
                } else if (i16 == i14 || i16 == 3 || i16 == 14) {
                    float f57 = this.r;
                    f16 = f57;
                    f17 = 1.0f - f57;
                } else {
                    float min = Math.min(1.0f, this.r / f10);
                    f17 = org.telegram.ui.Cells.b1.t(this.r, f10, 1.0f, 0.0f);
                    f16 = min;
                }
                i17 = this.q;
                if (i17 != 15) {
                    pathArr = org.telegram.ui.ActionBar.k6.a5;
                } else {
                    if (this.p == 15) {
                        pathArr2 = org.telegram.ui.ActionBar.k6.a5;
                        pathArr = null;
                        if (i17 == 5) {
                            pathArr = org.telegram.ui.ActionBar.k6.Z4;
                        } else if (this.p == 5) {
                            pathArr2 = org.telegram.ui.ActionBar.k6.Z4;
                        }
                        Path[] pathArr3 = pathArr;
                        Path[] pathArr4 = pathArr2;
                        if (i17 == 7) {
                            drawable2 = org.telegram.ui.ActionBar.k6.b5;
                            drawable = null;
                            i18 = 8;
                        } else {
                            drawable = this.p == 7 ? org.telegram.ui.ActionBar.k6.b5 : null;
                            i18 = 8;
                            drawable2 = null;
                        }
                        if (i17 == i18) {
                            drawable2 = org.telegram.ui.ActionBar.k6.c5;
                        } else if (this.p == i18) {
                            drawable = org.telegram.ui.ActionBar.k6.c5;
                        }
                        if (this.p != 9 || i17 == 9) {
                            a(false);
                            paint5.setAlpha(this.p == this.q ? 255 : (int) (this.r * 255.0f));
                            int dp13 = AndroidUtilities.dp(7.0f) + i15;
                            int dp14 = centerX2 - AndroidUtilities.dp(3.0f);
                            if (this.p != this.q) {
                                canvas2.save();
                                float f58 = this.r;
                                canvas2.scale(f58, f58, centerX2, i15);
                            }
                            float f59 = dp14;
                            float f60 = dp13;
                            drawable3 = drawable;
                            drawable4 = drawable2;
                            canvas2.drawLine(dp14 - AndroidUtilities.dp(6.0f), dp13 - AndroidUtilities.dp(6.0f), f59, f60, paint5);
                            canvas2 = canvas;
                            canvas2.drawLine(f59, f60, AndroidUtilities.dp(12.0f) + dp14, dp13 - AndroidUtilities.dp(12.0f), paint5);
                            if (this.p != this.q) {
                                canvas2.restore();
                            }
                        } else {
                            drawable3 = drawable;
                            drawable4 = drawable2;
                        }
                        if (this.p != 12 || this.q == 12) {
                            a(false);
                            int i48 = this.p;
                            int i49 = this.q;
                            float f61 = i48 == i49 ? 1.0f : i49 == 13 ? this.r : 1.0f - this.r;
                            paint5.setAlpha(i48 == i49 ? 255 : (int) (f61 * 255.0f));
                            AndroidUtilities.dp(7.0f);
                            AndroidUtilities.dp(3.0f);
                            if (this.p != this.q) {
                                canvas2.save();
                                canvas2.scale(f61, f61, centerX2, i15);
                            }
                            float dp15 = AndroidUtilities.dp(7.0f) * this.h;
                            float f62 = centerX2;
                            float f63 = f62 - dp15;
                            float f64 = i15;
                            float f65 = f64 - dp15;
                            float f66 = f62 + dp15;
                            float f67 = f64 + dp15;
                            canvas2.drawLine(f63, f65, f66, f67, paint5);
                            canvas2.drawLine(f66, f65, f63, f67, paint5);
                            if (this.p != this.q) {
                                canvas2.restore();
                            }
                        }
                        if (this.p != 13 || this.q == 13) {
                            a(false);
                            int i50 = this.p;
                            int i51 = this.q;
                            float f68 = i50 == i51 ? 1.0f : i51 == 13 ? this.r : 1.0f - this.r;
                            TextPaint textPaint = this.a;
                            textPaint.setAlpha((int) (f68 * 255.0f));
                            int dp16 = AndroidUtilities.dp(5.0f) + i15;
                            f18 = 5.0f;
                            int i52 = centerX2 - (this.n / 2);
                            rect = bounds;
                            f19 = f17;
                            if (this.p != this.q) {
                                canvas2.save();
                                canvas2.scale(f68, f68, centerX2, i15);
                            }
                            i19 = (int) (this.x * 100.0f);
                            if (this.m == null && i19 == this.l) {
                                i20 = centerX2;
                            } else {
                                this.l = i19;
                                this.m = String.format("%d%%", Integer.valueOf(i19));
                                i20 = centerX2;
                                this.n = (int) Math.ceil(textPaint.measureText(r2));
                            }
                            canvas2.drawText(this.m, i52, dp16, textPaint);
                            if (this.p != this.q) {
                                canvas2.restore();
                            }
                        } else {
                            f18 = 5.0f;
                            rect = bounds;
                            f19 = f17;
                            i20 = centerX2;
                        }
                        i21 = this.p;
                        if (i21 != 0 || i21 == 1 || (i27 = this.q) == 0 || i27 == 1) {
                            if (i21 == 0 || this.q != 1) {
                                if (i21 != 1) {
                                    i22 = 1;
                                } else if (this.q != 0) {
                                    i22 = 1;
                                }
                            }
                            if (this.u) {
                                float f69 = this.q == 0 ? 1.0f - this.r : this.r;
                                i22 = 1;
                                int i53 = this.q;
                                if ((i53 == 0 || i53 == i22) && (i21 == 0 || i21 == i22)) {
                                    paint2 = paint;
                                    paint2.setAlpha(255);
                                } else if (i53 == 4) {
                                    paint2 = paint;
                                    paint2.setAlpha((int) ((1.0f - this.r) * 255.0f));
                                } else {
                                    paint2 = paint;
                                    paint2.setAlpha(i21 == i53 ? 255 : (int) (this.r * 255.0f));
                                }
                                a(true);
                                canvas2.save();
                                canvas2.translate(com.google.android.gms.internal.play_billing.k3.y(1.0f, f69, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                                float f70 = f69 * 500.0f;
                                int i54 = this.p;
                                float f71 = i54 == 1 ? 90.0f : 0.0f;
                                if (i54 == 0 && this.q == 1) {
                                    interpolation = f70 < 384.0f ? bs.j.getInterpolation(f70 / 384.0f) * 95.0f : f70 < 484.0f ? 95.0f - (bs.j.getInterpolation((f70 - 384.0f) / 100.0f) * f18) : 90.0f;
                                    f70 += 100.0f;
                                } else {
                                    interpolation = (i54 == 1 && this.q == 0) ? f70 < 100.0f ? (-5.0f) * bs.j.getInterpolation(f70 / 100.0f) : f70 < 484.0f ? (-5.0f) + (bs.j.getInterpolation((f70 - 100.0f) / 384.0f) * 95.0f) : 90.0f : f71;
                                }
                                canvas2.rotate(interpolation);
                                int i55 = this.p;
                                if ((i55 != 0 && i55 != 1) || i55 == 4) {
                                    canvas2.scale(f16, f16);
                                }
                                org.telegram.ui.ActionBar.k6.x3.b(canvas2, paint2, f70);
                                canvas2.scale(1.0f, -1.0f);
                                org.telegram.ui.ActionBar.k6.x3.b(canvas2, paint2, f70);
                                canvas2.restore();
                            } else {
                                i22 = 1;
                            }
                        } else {
                            paint2 = paint;
                        }
                        if (this.p == 6 || this.q == 6) {
                            a(false);
                            if (this.p != 6) {
                                float f72 = this.r;
                                if (f72 > 0.5f) {
                                    float f73 = (f72 - 0.5f) / 0.5f;
                                    f20 = 1.0f - Math.min(1.0f, f73 / 0.5f);
                                    f23 = f73 > 0.5f ? (f73 - 0.5f) / 0.5f : 0.0f;
                                } else {
                                    f23 = 0.0f;
                                    f20 = 1.0f;
                                }
                                paint5.setAlpha(255);
                                f21 = f23;
                            } else {
                                if (this.q != 6) {
                                    paint5.setAlpha((int) ((1.0f - this.r) * 255.0f));
                                } else {
                                    paint5.setAlpha(255);
                                }
                                f20 = 0.0f;
                                f21 = 1.0f;
                            }
                            int dp17 = AndroidUtilities.dp(7.0f) + i15;
                            int dp18 = i20 - AndroidUtilities.dp(3.0f);
                            if (f20 < 1.0f) {
                                i23 = i20;
                                i24 = dp17;
                                f22 = f21;
                                i25 = dp18;
                                canvas.drawLine(dp18 - AndroidUtilities.dp(6.0f), dp17 - AndroidUtilities.dp(6.0f), dp18 - (AndroidUtilities.dp(6.0f) * f20), dp17 - (AndroidUtilities.dp(6.0f) * f20), paint5);
                            } else {
                                i23 = i20;
                                f22 = f21;
                                i24 = dp17;
                                i25 = dp18;
                            }
                            if (f22 > 0.0f) {
                                float f74 = i25;
                                float f75 = i24;
                                canvas2 = canvas;
                                canvas2.drawLine(f74, f75, (AndroidUtilities.dp(12.0f) * f22) + f74, f75 - (AndroidUtilities.dp(12.0f) * f22), paint5);
                            } else {
                                canvas2 = canvas;
                            }
                        } else {
                            i23 = i20;
                        }
                        if (drawable3 != null && drawable3 != drawable4) {
                            int intrinsicWidth = (int) (drawable3.getIntrinsicWidth() * f19);
                            int intrinsicHeight = (int) (drawable3.getIntrinsicHeight() * f19);
                            drawable3.setColorFilter(this.g);
                            drawable3.setAlpha(this.p == this.q ? 255 : (int) ((1.0f - this.r) * 255.0f));
                            int i56 = intrinsicWidth / 2;
                            int i57 = intrinsicHeight / 2;
                            drawable3.setBounds(i23 - i56, i15 - i57, i23 + i56, i57 + i15);
                            drawable3.draw(canvas2);
                        }
                        if (drawable4 != null) {
                            int intrinsicWidth2 = (int) (drawable4.getIntrinsicWidth() * f16);
                            int intrinsicHeight2 = (int) (drawable4.getIntrinsicHeight() * f16);
                            drawable4.setColorFilter(this.g);
                            drawable4.setAlpha(this.p == this.q ? 255 : (int) (this.r * 255.0f));
                            int i58 = intrinsicWidth2 / 2;
                            int i59 = intrinsicHeight2 / 2;
                            drawable4.setBounds(i23 - i58, i15 - i59, i23 + i58, i59 + i15);
                            drawable4.draw(canvas2);
                        }
                        Paint paint6 = this.c;
                        if (pathArr4 == null || pathArr4 == pathArr3) {
                            i26 = i23;
                        } else {
                            int dp19 = AndroidUtilities.dp(24.0f);
                            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                            paint2.setAlpha(this.p == this.q ? 255 : (int) ((1.0f - this.r) * 255.0f));
                            a(true);
                            canvas2.save();
                            i26 = i23;
                            canvas2.translate(i26, i15);
                            float f76 = f19;
                            canvas2.scale(f76, f76);
                            float f77 = (-dp19) / 2;
                            canvas2.translate(f77, f77);
                            Path path2 = pathArr4[0];
                            if (path2 != null) {
                                canvas2.drawPath(path2, paint2);
                            }
                            Path path3 = pathArr4[1];
                            if (path3 != null) {
                                canvas2.drawPath(path3, paint6);
                            }
                            canvas2.restore();
                        }
                        if (pathArr3 != null) {
                            int dp20 = AndroidUtilities.dp(24.0f);
                            int i60 = this.p == this.q ? 255 : (int) (this.r * 255.0f);
                            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                            paint2.setAlpha(i60);
                            a(true);
                            canvas2.save();
                            canvas2.translate(i26, i15);
                            canvas2.scale(f16, f16);
                            float f78 = (-dp20) / 2;
                            canvas2.translate(f78, f78);
                            Path path4 = pathArr3[0];
                            if (path4 != null) {
                                canvas2.drawPath(path4, paint2);
                            }
                            if (pathArr3.length >= 3 && (path = pathArr3[2]) != null) {
                                canvas2.drawPath(path, paint5);
                            }
                            Path path5 = pathArr3[1];
                            if (path5 != null) {
                                if (i60 != 255) {
                                    int alpha = paint6.getAlpha();
                                    paint6.setAlpha((int) ((i60 / 255.0f) * alpha));
                                    canvas2.drawPath(pathArr3[1], paint6);
                                    paint6.setAlpha(alpha);
                                } else {
                                    canvas2.drawPath(path5, paint6);
                                }
                            }
                            canvas2.restore();
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        long j10 = currentTimeMillis - this.t;
                        if (j10 > 17) {
                            j10 = 17;
                        }
                        this.t = currentTimeMillis;
                        int i61 = this.p;
                        if (i61 == 3 || i61 == 14 || ((i61 == 4 && this.q == 14) || i61 == 10 || i61 == 13)) {
                            float f79 = ((360 * j10) / 2500.0f) + this.v;
                            this.v = f79;
                            while (f79 > 360.0f) {
                                f79 -= 360.0f;
                            }
                            this.v = f79;
                            if (this.q != 2) {
                                float f80 = this.w;
                                float f81 = this.y;
                                float f82 = f80 - f81;
                                if (f82 > 0.0f) {
                                    float f83 = this.z + j10;
                                    this.z = f83;
                                    if (f83 >= 200.0f) {
                                        this.x = f80;
                                        this.y = f80;
                                        this.z = 0.0f;
                                    } else {
                                        this.x = (this.i.getInterpolation(f83 / 200.0f) * f82) + f81;
                                    }
                                }
                            }
                            invalidateSelf();
                        }
                        if (this.u) {
                            float f84 = this.r;
                            if (f84 < 1.0f) {
                                float f85 = (j10 / this.k) + f84;
                                this.r = f85;
                                if (f85 >= 1.0f) {
                                    this.p = this.q;
                                    this.r = 1.0f;
                                    this.u = false;
                                }
                                invalidateSelf();
                            }
                        }
                        int i62 = i11;
                        if (i62 >= 1) {
                            canvas2.restoreToCount(i62);
                            return;
                        }
                        return;
                    }
                    pathArr = null;
                }
                pathArr2 = null;
                if (i17 == 5) {
                }
                Path[] pathArr32 = pathArr;
                Path[] pathArr42 = pathArr2;
                if (i17 == 7) {
                }
                if (i17 == i18) {
                }
                if (this.p != 9) {
                }
                a(false);
                paint5.setAlpha(this.p == this.q ? 255 : (int) (this.r * 255.0f));
                int dp132 = AndroidUtilities.dp(7.0f) + i15;
                int dp142 = centerX2 - AndroidUtilities.dp(3.0f);
                if (this.p != this.q) {
                }
                float f592 = dp142;
                float f602 = dp132;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas2.drawLine(dp142 - AndroidUtilities.dp(6.0f), dp132 - AndroidUtilities.dp(6.0f), f592, f602, paint5);
                canvas2 = canvas;
                canvas2.drawLine(f592, f602, AndroidUtilities.dp(12.0f) + dp142, dp132 - AndroidUtilities.dp(12.0f), paint5);
                if (this.p != this.q) {
                }
                if (this.p != 12) {
                }
                a(false);
                int i482 = this.p;
                int i492 = this.q;
                if (i482 == i492) {
                }
                paint5.setAlpha(i482 == i492 ? 255 : (int) (f61 * 255.0f));
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.p != this.q) {
                }
                float dp152 = AndroidUtilities.dp(7.0f) * this.h;
                float f622 = centerX2;
                float f632 = f622 - dp152;
                float f642 = i15;
                float f652 = f642 - dp152;
                float f662 = f622 + dp152;
                float f672 = f642 + dp152;
                canvas2.drawLine(f632, f652, f662, f672, paint5);
                canvas2.drawLine(f662, f652, f632, f672, paint5);
                if (this.p != this.q) {
                }
                if (this.p != 13) {
                }
                a(false);
                int i502 = this.p;
                int i512 = this.q;
                if (i502 == i512) {
                }
                TextPaint textPaint2 = this.a;
                textPaint2.setAlpha((int) (f68 * 255.0f));
                int dp162 = AndroidUtilities.dp(5.0f) + i15;
                f18 = 5.0f;
                int i522 = centerX2 - (this.n / 2);
                rect = bounds;
                f19 = f17;
                if (this.p != this.q) {
                }
                i19 = (int) (this.x * 100.0f);
                if (this.m == null) {
                }
                this.l = i19;
                this.m = String.format("%d%%", Integer.valueOf(i19));
                i20 = centerX2;
                this.n = (int) Math.ceil(textPaint2.measureText(r2));
                canvas2.drawText(this.m, i522, dp162, textPaint2);
                if (this.p != this.q) {
                }
                i21 = this.p;
                if (i21 != 0) {
                }
                if (i21 == 0) {
                }
                if (i21 != 1) {
                }
            } else {
                canvas2 = canvas;
                i15 = i12;
                i16 = this.p;
                if (i16 != this.q) {
                }
                i17 = this.q;
                if (i17 != 15) {
                }
                pathArr2 = null;
                if (i17 == 5) {
                }
                Path[] pathArr322 = pathArr;
                Path[] pathArr422 = pathArr2;
                if (i17 == 7) {
                }
                if (i17 == i18) {
                }
                if (this.p != 9) {
                }
                a(false);
                paint5.setAlpha(this.p == this.q ? 255 : (int) (this.r * 255.0f));
                int dp1322 = AndroidUtilities.dp(7.0f) + i15;
                int dp1422 = centerX2 - AndroidUtilities.dp(3.0f);
                if (this.p != this.q) {
                }
                float f5922 = dp1422;
                float f6022 = dp1322;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas2.drawLine(dp1422 - AndroidUtilities.dp(6.0f), dp1322 - AndroidUtilities.dp(6.0f), f5922, f6022, paint5);
                canvas2 = canvas;
                canvas2.drawLine(f5922, f6022, AndroidUtilities.dp(12.0f) + dp1422, dp1322 - AndroidUtilities.dp(12.0f), paint5);
                if (this.p != this.q) {
                }
                if (this.p != 12) {
                }
                a(false);
                int i4822 = this.p;
                int i4922 = this.q;
                if (i4822 == i4922) {
                }
                paint5.setAlpha(i4822 == i4922 ? 255 : (int) (f61 * 255.0f));
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.p != this.q) {
                }
                float dp1522 = AndroidUtilities.dp(7.0f) * this.h;
                float f6222 = centerX2;
                float f6322 = f6222 - dp1522;
                float f6422 = i15;
                float f6522 = f6422 - dp1522;
                float f6622 = f6222 + dp1522;
                float f6722 = f6422 + dp1522;
                canvas2.drawLine(f6322, f6522, f6622, f6722, paint5);
                canvas2.drawLine(f6622, f6522, f6322, f6722, paint5);
                if (this.p != this.q) {
                }
                if (this.p != 13) {
                }
                a(false);
                int i5022 = this.p;
                int i5122 = this.q;
                if (i5022 == i5122) {
                }
                TextPaint textPaint22 = this.a;
                textPaint22.setAlpha((int) (f68 * 255.0f));
                int dp1622 = AndroidUtilities.dp(5.0f) + i15;
                f18 = 5.0f;
                int i5222 = centerX2 - (this.n / 2);
                rect = bounds;
                f19 = f17;
                if (this.p != this.q) {
                }
                i19 = (int) (this.x * 100.0f);
                if (this.m == null) {
                }
                this.l = i19;
                this.m = String.format("%d%%", Integer.valueOf(i19));
                i20 = centerX2;
                this.n = (int) Math.ceil(textPaint22.measureText(r2));
                canvas2.drawText(this.m, i5222, dp1622, textPaint22);
                if (this.p != this.q) {
                }
                i21 = this.p;
                if (i21 != 0) {
                }
                if (i21 == 0) {
                }
                if (i21 != 1) {
                }
            }
        }
        a(false);
        int i63 = this.q;
        if (i63 == 2) {
            float f86 = this.r;
            if (f86 <= f10) {
                float f87 = 1.0f - (f86 / f10);
                i33 = (int) (f87 * 255.0f);
                f29 = AndroidUtilities.dp(7.0f) * f87 * this.h;
            } else {
                f29 = 0.0f;
                i33 = 0;
            }
            i29 = i33;
            f28 = 0.0f;
            f30 = 0.0f;
            f25 = 0.0f;
            f26 = 1.0f;
        } else {
            if (i63 == 15 || i63 == 0 || i63 == i13 || i63 == 5 || i63 == 8 || i63 == 9 || i63 == 7) {
                i28 = 6;
            } else if (i63 == 6) {
                i28 = 6;
            } else if (i63 == i14) {
                float f88 = 1.0f - this.r;
                f27 = AndroidUtilities.dp(7.0f) * this.h;
                int i64 = (int) (f88 * 255.0f);
                if (this.p == 14) {
                    f28 = bounds.left;
                    centerY2 = bounds.top;
                } else {
                    f28 = bounds.centerX();
                    centerY2 = bounds.centerY();
                }
                f25 = centerY2;
                f24 = 1.0f;
                i29 = i64;
                f26 = f88;
                f29 = f27;
                f30 = 0.0f;
                if (f26 != f24) {
                    canvas2.save();
                    canvas2.scale(f26, f26, f28, f25);
                }
                if (f30 != 0.0f) {
                    canvas2.save();
                    i15 = i12;
                    canvas2.rotate(f30, centerX2, i15);
                } else {
                    i15 = i12;
                }
                if (i29 != 0) {
                    float f89 = i29;
                    paint5.setAlpha((int) (this.o * f89));
                    if (this.p == 14 || this.q == 14) {
                        rectF3 = rectF2;
                        z10 = true;
                        paint3.setAlpha((int) (f89 * this.o));
                        rectF3.set(centerX2 - AndroidUtilities.dp(3.5f), i15 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + centerX2, AndroidUtilities.dp(3.5f) + i15);
                        canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
                    } else {
                        float f90 = centerX2;
                        RectF rectF6 = rectF2;
                        float f91 = f90 - f29;
                        float f92 = i15;
                        float f93 = f92 - f29;
                        float f94 = f90 + f29;
                        float f95 = f92 + f29;
                        z10 = true;
                        rectF3 = rectF6;
                        canvas2.drawLine(f91, f93, f94, f95, paint5);
                        canvas2.drawLine(f94, f93, f91, f95, paint5);
                    }
                } else {
                    rectF3 = rectF2;
                    z10 = true;
                }
                if (f30 != 0.0f) {
                    canvas2.restore();
                }
                if (f26 != f24) {
                    canvas2.restore();
                }
                i30 = this.p;
                if ((i30 != 3 || i30 == 14 || (i30 == i14 && ((i32 = this.q) == 14 || i32 == 3))) && i29 != 0) {
                    float max2 = Math.max(4.0f, this.x * 360.0f);
                    int dp21 = AndroidUtilities.dp(this.j ? 2.0f : 4.0f);
                    rectF3.set(bounds.left + dp21, bounds.top + dp21, bounds.right - dp21, bounds.bottom - dp21);
                    i31 = this.p;
                    if (i31 != 14 || (i31 == i14 && this.q == 14)) {
                        paint5.setAlpha((int) (i29 * 0.15f * this.o));
                        rectF4 = rectF3;
                        canvas2.drawArc(rectF4, 0.0f, 360.0f, false, paint5);
                        paint5.setAlpha(i29);
                    } else {
                        rectF4 = rectF3;
                    }
                    canvas2 = canvas;
                    canvas2.drawArc(rectF4, this.v, max2, false, paint5);
                    i16 = this.p;
                    if (i16 != this.q) {
                    }
                    i17 = this.q;
                    if (i17 != 15) {
                    }
                    pathArr2 = null;
                    if (i17 == 5) {
                    }
                    Path[] pathArr3222 = pathArr;
                    Path[] pathArr4222 = pathArr2;
                    if (i17 == 7) {
                    }
                    if (i17 == i18) {
                    }
                    if (this.p != 9) {
                    }
                    a(false);
                    paint5.setAlpha(this.p == this.q ? 255 : (int) (this.r * 255.0f));
                    int dp13222 = AndroidUtilities.dp(7.0f) + i15;
                    int dp14222 = centerX2 - AndroidUtilities.dp(3.0f);
                    if (this.p != this.q) {
                    }
                    float f59222 = dp14222;
                    float f60222 = dp13222;
                    drawable3 = drawable;
                    drawable4 = drawable2;
                    canvas2.drawLine(dp14222 - AndroidUtilities.dp(6.0f), dp13222 - AndroidUtilities.dp(6.0f), f59222, f60222, paint5);
                    canvas2 = canvas;
                    canvas2.drawLine(f59222, f60222, AndroidUtilities.dp(12.0f) + dp14222, dp13222 - AndroidUtilities.dp(12.0f), paint5);
                    if (this.p != this.q) {
                    }
                    if (this.p != 12) {
                    }
                    a(false);
                    int i48222 = this.p;
                    int i49222 = this.q;
                    if (i48222 == i49222) {
                    }
                    paint5.setAlpha(i48222 == i49222 ? 255 : (int) (f61 * 255.0f));
                    AndroidUtilities.dp(7.0f);
                    AndroidUtilities.dp(3.0f);
                    if (this.p != this.q) {
                    }
                    float dp15222 = AndroidUtilities.dp(7.0f) * this.h;
                    float f62222 = centerX2;
                    float f63222 = f62222 - dp15222;
                    float f64222 = i15;
                    float f65222 = f64222 - dp15222;
                    float f66222 = f62222 + dp15222;
                    float f67222 = f64222 + dp15222;
                    canvas2.drawLine(f63222, f65222, f66222, f67222, paint5);
                    canvas2.drawLine(f66222, f65222, f63222, f67222, paint5);
                    if (this.p != this.q) {
                    }
                    if (this.p != 13) {
                    }
                    a(false);
                    int i50222 = this.p;
                    int i51222 = this.q;
                    if (i50222 == i51222) {
                    }
                    TextPaint textPaint222 = this.a;
                    textPaint222.setAlpha((int) (f68 * 255.0f));
                    int dp16222 = AndroidUtilities.dp(5.0f) + i15;
                    f18 = 5.0f;
                    int i52222 = centerX2 - (this.n / 2);
                    rect = bounds;
                    f19 = f17;
                    if (this.p != this.q) {
                    }
                    i19 = (int) (this.x * 100.0f);
                    if (this.m == null) {
                    }
                    this.l = i19;
                    this.m = String.format("%d%%", Integer.valueOf(i19));
                    i20 = centerX2;
                    this.n = (int) Math.ceil(textPaint222.measureText(r2));
                    canvas2.drawText(this.m, i52222, dp16222, textPaint222);
                    if (this.p != this.q) {
                    }
                    i21 = this.p;
                    if (i21 != 0) {
                    }
                    if (i21 == 0) {
                    }
                    if (i21 != 1) {
                    }
                }
                i16 = this.p;
                if (i16 != this.q) {
                }
                i17 = this.q;
                if (i17 != 15) {
                }
                pathArr2 = null;
                if (i17 == 5) {
                }
                Path[] pathArr32222 = pathArr;
                Path[] pathArr42222 = pathArr2;
                if (i17 == 7) {
                }
                if (i17 == i18) {
                }
                if (this.p != 9) {
                }
                a(false);
                paint5.setAlpha(this.p == this.q ? 255 : (int) (this.r * 255.0f));
                int dp132222 = AndroidUtilities.dp(7.0f) + i15;
                int dp142222 = centerX2 - AndroidUtilities.dp(3.0f);
                if (this.p != this.q) {
                }
                float f592222 = dp142222;
                float f602222 = dp132222;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas2.drawLine(dp142222 - AndroidUtilities.dp(6.0f), dp132222 - AndroidUtilities.dp(6.0f), f592222, f602222, paint5);
                canvas2 = canvas;
                canvas2.drawLine(f592222, f602222, AndroidUtilities.dp(12.0f) + dp142222, dp132222 - AndroidUtilities.dp(12.0f), paint5);
                if (this.p != this.q) {
                }
                if (this.p != 12) {
                }
                a(false);
                int i482222 = this.p;
                int i492222 = this.q;
                if (i482222 == i492222) {
                }
                paint5.setAlpha(i482222 == i492222 ? 255 : (int) (f61 * 255.0f));
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.p != this.q) {
                }
                float dp152222 = AndroidUtilities.dp(7.0f) * this.h;
                float f622222 = centerX2;
                float f632222 = f622222 - dp152222;
                float f642222 = i15;
                float f652222 = f642222 - dp152222;
                float f662222 = f622222 + dp152222;
                float f672222 = f642222 + dp152222;
                canvas2.drawLine(f632222, f652222, f662222, f672222, paint5);
                canvas2.drawLine(f662222, f652222, f632222, f672222, paint5);
                if (this.p != this.q) {
                }
                if (this.p != 13) {
                }
                a(false);
                int i502222 = this.p;
                int i512222 = this.q;
                if (i502222 == i512222) {
                }
                TextPaint textPaint2222 = this.a;
                textPaint2222.setAlpha((int) (f68 * 255.0f));
                int dp162222 = AndroidUtilities.dp(5.0f) + i15;
                f18 = 5.0f;
                int i522222 = centerX2 - (this.n / 2);
                rect = bounds;
                f19 = f17;
                if (this.p != this.q) {
                }
                i19 = (int) (this.x * 100.0f);
                if (this.m == null) {
                }
                this.l = i19;
                this.m = String.format("%d%%", Integer.valueOf(i19));
                i20 = centerX2;
                this.n = (int) Math.ceil(textPaint2222.measureText(r2));
                canvas2.drawText(this.m, i522222, dp162222, textPaint2222);
                if (this.p != this.q) {
                }
                i21 = this.p;
                if (i21 != 0) {
                }
                if (i21 == 0) {
                }
                if (i21 != 1) {
                }
            } else if (i63 == 14 || i63 == 3) {
                float f96 = this.r;
                float f97 = 1.0f - f96;
                if (this.p == i14) {
                    f34 = f96;
                    f33 = 0.0f;
                } else {
                    f33 = 45.0f * f97;
                    f34 = 1.0f;
                }
                float dp22 = AndroidUtilities.dp(7.0f) * this.h;
                int i65 = (int) (f96 * 255.0f);
                if (this.q == 14) {
                    centerX = bounds.left;
                    centerY = bounds.top;
                } else {
                    centerX = bounds.centerX();
                    centerY = bounds.centerY();
                }
                f25 = centerY;
                float f98 = centerX;
                i29 = i65;
                f28 = f98;
                float f99 = f34;
                f30 = f33;
                f29 = dp22;
                f26 = f99;
            } else {
                f29 = this.h * AndroidUtilities.dp(7.0f);
                f28 = 0.0f;
                f30 = 0.0f;
                f25 = 0.0f;
                f26 = 1.0f;
                i29 = 255;
            }
            if (i63 == i28) {
                f31 = 1.0f;
                f32 = Math.min(1.0f, this.r / f10);
            } else {
                f31 = 1.0f;
                f32 = this.r;
            }
            float f100 = f31 - f32;
            f28 = bounds.centerX();
            float centerY4 = bounds.centerY();
            f27 = AndroidUtilities.dp(7.0f) * f100 * this.h;
            float f101 = f31;
            i29 = (int) (Math.min(f31, f100 * 2.0f) * 255.0f);
            f26 = f100;
            f24 = f101;
            f25 = centerY4;
            f29 = f27;
            f30 = 0.0f;
            if (f26 != f24) {
            }
            if (f30 != 0.0f) {
            }
            if (i29 != 0) {
            }
            if (f30 != 0.0f) {
            }
            if (f26 != f24) {
            }
            i30 = this.p;
            if (i30 != 3) {
            }
            float max22 = Math.max(4.0f, this.x * 360.0f);
            int dp212 = AndroidUtilities.dp(this.j ? 2.0f : 4.0f);
            rectF3.set(bounds.left + dp212, bounds.top + dp212, bounds.right - dp212, bounds.bottom - dp212);
            i31 = this.p;
            if (i31 != 14) {
            }
            paint5.setAlpha((int) (i29 * 0.15f * this.o));
            rectF4 = rectF3;
            canvas2.drawArc(rectF4, 0.0f, 360.0f, false, paint5);
            paint5.setAlpha(i29);
            canvas2 = canvas;
            canvas2.drawArc(rectF4, this.v, max22, false, paint5);
            i16 = this.p;
            if (i16 != this.q) {
            }
            i17 = this.q;
            if (i17 != 15) {
            }
            pathArr2 = null;
            if (i17 == 5) {
            }
            Path[] pathArr322222 = pathArr;
            Path[] pathArr422222 = pathArr2;
            if (i17 == 7) {
            }
            if (i17 == i18) {
            }
            if (this.p != 9) {
            }
            a(false);
            paint5.setAlpha(this.p == this.q ? 255 : (int) (this.r * 255.0f));
            int dp1322222 = AndroidUtilities.dp(7.0f) + i15;
            int dp1422222 = centerX2 - AndroidUtilities.dp(3.0f);
            if (this.p != this.q) {
            }
            float f5922222 = dp1422222;
            float f6022222 = dp1322222;
            drawable3 = drawable;
            drawable4 = drawable2;
            canvas2.drawLine(dp1422222 - AndroidUtilities.dp(6.0f), dp1322222 - AndroidUtilities.dp(6.0f), f5922222, f6022222, paint5);
            canvas2 = canvas;
            canvas2.drawLine(f5922222, f6022222, AndroidUtilities.dp(12.0f) + dp1422222, dp1322222 - AndroidUtilities.dp(12.0f), paint5);
            if (this.p != this.q) {
            }
            if (this.p != 12) {
            }
            a(false);
            int i4822222 = this.p;
            int i4922222 = this.q;
            if (i4822222 == i4922222) {
            }
            paint5.setAlpha(i4822222 == i4922222 ? 255 : (int) (f61 * 255.0f));
            AndroidUtilities.dp(7.0f);
            AndroidUtilities.dp(3.0f);
            if (this.p != this.q) {
            }
            float dp1522222 = AndroidUtilities.dp(7.0f) * this.h;
            float f6222222 = centerX2;
            float f6322222 = f6222222 - dp1522222;
            float f6422222 = i15;
            float f6522222 = f6422222 - dp1522222;
            float f6622222 = f6222222 + dp1522222;
            float f6722222 = f6422222 + dp1522222;
            canvas2.drawLine(f6322222, f6522222, f6622222, f6722222, paint5);
            canvas2.drawLine(f6622222, f6522222, f6322222, f6722222, paint5);
            if (this.p != this.q) {
            }
            if (this.p != 13) {
            }
            a(false);
            int i5022222 = this.p;
            int i5122222 = this.q;
            if (i5022222 == i5122222) {
            }
            TextPaint textPaint22222 = this.a;
            textPaint22222.setAlpha((int) (f68 * 255.0f));
            int dp1622222 = AndroidUtilities.dp(5.0f) + i15;
            f18 = 5.0f;
            int i5222222 = centerX2 - (this.n / 2);
            rect = bounds;
            f19 = f17;
            if (this.p != this.q) {
            }
            i19 = (int) (this.x * 100.0f);
            if (this.m == null) {
            }
            this.l = i19;
            this.m = String.format("%d%%", Integer.valueOf(i19));
            i20 = centerX2;
            this.n = (int) Math.ceil(textPaint22222.measureText(r2));
            canvas2.drawText(this.m, i5222222, dp1622222, textPaint22222);
            if (this.p != this.q) {
            }
            i21 = this.p;
            if (i21 != 0) {
            }
            if (i21 == 0) {
            }
            if (i21 != 1) {
            }
        }
        f24 = 1.0f;
        if (f26 != f24) {
        }
        if (f30 != 0.0f) {
        }
        if (i29 != 0) {
        }
        if (f30 != 0.0f) {
        }
        if (f26 != f24) {
        }
        i30 = this.p;
        if (i30 != 3) {
        }
        float max222 = Math.max(4.0f, this.x * 360.0f);
        int dp2122 = AndroidUtilities.dp(this.j ? 2.0f : 4.0f);
        rectF3.set(bounds.left + dp2122, bounds.top + dp2122, bounds.right - dp2122, bounds.bottom - dp2122);
        i31 = this.p;
        if (i31 != 14) {
        }
        paint5.setAlpha((int) (i29 * 0.15f * this.o));
        rectF4 = rectF3;
        canvas2.drawArc(rectF4, 0.0f, 360.0f, false, paint5);
        paint5.setAlpha(i29);
        canvas2 = canvas;
        canvas2.drawArc(rectF4, this.v, max222, false, paint5);
        i16 = this.p;
        if (i16 != this.q) {
        }
        i17 = this.q;
        if (i17 != 15) {
        }
        pathArr2 = null;
        if (i17 == 5) {
        }
        Path[] pathArr3222222 = pathArr;
        Path[] pathArr4222222 = pathArr2;
        if (i17 == 7) {
        }
        if (i17 == i18) {
        }
        if (this.p != 9) {
        }
        a(false);
        paint5.setAlpha(this.p == this.q ? 255 : (int) (this.r * 255.0f));
        int dp13222222 = AndroidUtilities.dp(7.0f) + i15;
        int dp14222222 = centerX2 - AndroidUtilities.dp(3.0f);
        if (this.p != this.q) {
        }
        float f59222222 = dp14222222;
        float f60222222 = dp13222222;
        drawable3 = drawable;
        drawable4 = drawable2;
        canvas2.drawLine(dp14222222 - AndroidUtilities.dp(6.0f), dp13222222 - AndroidUtilities.dp(6.0f), f59222222, f60222222, paint5);
        canvas2 = canvas;
        canvas2.drawLine(f59222222, f60222222, AndroidUtilities.dp(12.0f) + dp14222222, dp13222222 - AndroidUtilities.dp(12.0f), paint5);
        if (this.p != this.q) {
        }
        if (this.p != 12) {
        }
        a(false);
        int i48222222 = this.p;
        int i49222222 = this.q;
        if (i48222222 == i49222222) {
        }
        paint5.setAlpha(i48222222 == i49222222 ? 255 : (int) (f61 * 255.0f));
        AndroidUtilities.dp(7.0f);
        AndroidUtilities.dp(3.0f);
        if (this.p != this.q) {
        }
        float dp15222222 = AndroidUtilities.dp(7.0f) * this.h;
        float f62222222 = centerX2;
        float f63222222 = f62222222 - dp15222222;
        float f64222222 = i15;
        float f65222222 = f64222222 - dp15222222;
        float f66222222 = f62222222 + dp15222222;
        float f67222222 = f64222222 + dp15222222;
        canvas2.drawLine(f63222222, f65222222, f66222222, f67222222, paint5);
        canvas2.drawLine(f66222222, f65222222, f63222222, f67222222, paint5);
        if (this.p != this.q) {
        }
        if (this.p != 13) {
        }
        a(false);
        int i50222222 = this.p;
        int i51222222 = this.q;
        if (i50222222 == i51222222) {
        }
        TextPaint textPaint222222 = this.a;
        textPaint222222.setAlpha((int) (f68 * 255.0f));
        int dp16222222 = AndroidUtilities.dp(5.0f) + i15;
        f18 = 5.0f;
        int i52222222 = centerX2 - (this.n / 2);
        rect = bounds;
        f19 = f17;
        if (this.p != this.q) {
        }
        i19 = (int) (this.x * 100.0f);
        if (this.m == null) {
        }
        this.l = i19;
        this.m = String.format("%d%%", Integer.valueOf(i19));
        i20 = centerX2;
        this.n = (int) Math.ceil(textPaint222222.measureText(r2));
        canvas2.drawText(this.m, i52222222, dp16222222, textPaint222222);
        if (this.p != this.q) {
        }
        i21 = this.p;
        if (i21 != 0) {
        }
        if (i21 == 0) {
        }
        if (i21 != 1) {
        }
    }

    public final void e(float f7, boolean z10) {
        if (this.w == f7) {
            return;
        }
        if (z10) {
            if (this.x > f7) {
                this.x = f7;
            }
            this.y = this.x;
        } else {
            this.x = f7;
            this.y = f7;
        }
        this.w = f7;
        this.z = 0.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return AndroidUtilities.dp(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        tv tvVar = this.A;
        if (tvVar != null) {
            ((View) tvVar.b).invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        super.setBounds(i10, i11, i12, i13);
        float dp = (i12 - i10) / AndroidUtilities.dp(48.0f);
        this.h = dp;
        if (dp < 0.7f) {
            this.b.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }
}
