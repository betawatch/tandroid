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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class w90 extends Drawable {
    public hv A;
    public org.telegram.ui.ActionBar.h5 B;
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

    public w90() {
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

    public final void a(boolean z4) {
        org.telegram.ui.ActionBar.h5 h5Var = this.B;
        if (h5Var == null || !h5Var.l() || this.E) {
            return;
        }
        Rect bounds = getBounds();
        org.telegram.ui.ActionBar.h5 h5Var2 = this.B;
        Shader shader = h5Var2.a;
        Matrix matrix = h5Var2.k;
        matrix.reset();
        this.B.a();
        if (z4) {
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

    public final void d(int i10, boolean z4) {
        int i11;
        int i12;
        if (this.p == i10 && (i12 = this.q) != i10) {
            this.p = i12;
            this.r = 1.0f;
        }
        if (z4) {
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

    /* JADX WARN: Code restructure failed: missing block: B:279:0x0820, code lost:
    
        if (r41.q == 1) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0822, code lost:
    
        r3 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0825, code lost:
    
        r3 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0829, code lost:
    
        if (r2 == 1) goto L354;
     */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0773  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0750  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0682  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x066d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x07f1 A[ADDED_TO_REGION] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        int save;
        int i10;
        float f10;
        float dp;
        int i11;
        Paint paint;
        int i12;
        RectF rectF;
        float dp2;
        float dp3;
        float f11;
        float f12;
        float f13;
        float f14;
        Canvas canvas2;
        RectF rectF2;
        int i13;
        int i14;
        boolean z4;
        int i15;
        int i16;
        float f15;
        float f16;
        int i17;
        Path[] pathArr;
        Path[] pathArr2;
        Drawable drawable;
        int i18;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        float f17;
        Rect rect;
        float f18;
        int i19;
        int i20;
        int i21;
        int i22;
        float f19;
        float f20;
        int i23;
        Paint paint2;
        float f21;
        int i24;
        float f22;
        float interpolation;
        int i25;
        float f23;
        float f24;
        int i26;
        float f25;
        int i27;
        int i28;
        float f26;
        int i29;
        Path path;
        int i30;
        float f27;
        float f28;
        float centerX;
        float centerY;
        float dp4;
        int min;
        float f29;
        float f30;
        float f31;
        float f32;
        float centerX2;
        int centerY2;
        int centerY3;
        float f33;
        RectF rectF3;
        int i31;
        int i32;
        RectF rectF4;
        int i33;
        int i34;
        int i35;
        Rect bounds = getBounds();
        org.telegram.ui.ActionBar.h5 h5Var = this.B;
        Paint paint3 = this.e;
        Paint paint4 = this.d;
        Paint paint5 = this.b;
        if (h5Var != null && h5Var.l() && !this.E) {
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
        int centerX3 = bounds.centerX();
        int centerY4 = bounds.centerY();
        int i36 = this.q;
        if (i36 == 4) {
            int i37 = this.p;
            if (i37 == 3 || i37 == 14) {
                i10 = 0;
            } else {
                save = canvas.save();
                float f34 = 1.0f - this.r;
                canvas.scale(f34, f34, centerX3, centerY4);
                i10 = save;
            }
        } else {
            if ((i36 == 6 || i36 == 10) && this.p == 4) {
                save = canvas.save();
                float f35 = this.r;
                canvas.scale(f35, f35, centerX3, centerY4);
                i10 = save;
            }
            i10 = 0;
        }
        AndroidUtilities.dp(3.0f);
        int i38 = this.p;
        RectF rectF5 = this.f;
        if (i38 == 2 || this.q == 2) {
            a(false);
            float f36 = centerY4;
            float dp5 = f36 - (AndroidUtilities.dp(9.0f) * this.h);
            float dp6 = (AndroidUtilities.dp(9.0f) * this.h) + f36;
            float dp7 = (AndroidUtilities.dp(12.0f) * this.h) + f36;
            int i39 = this.p;
            if ((i39 == 3 || i39 == 14) && this.q == 2) {
                paint5.setAlpha((int) (Math.min(1.0f, this.r / 0.5f) * 255.0f));
                f10 = this.r;
                dp = (AndroidUtilities.dp(12.0f) * this.h) + f36;
            } else {
                int i40 = this.q;
                if (i40 == 3 || i40 == 14 || i40 == 2) {
                    paint5.setAlpha(255);
                    f14 = this.r;
                } else {
                    paint5.setAlpha((int) ((1.0f - this.r) * Math.min(1.0f, this.s / 0.5f) * 255.0f));
                    f14 = this.s;
                }
                f10 = f14;
                dp = (AndroidUtilities.dp(1.0f) * this.h) + f36;
            }
            if (this.u) {
                int i41 = this.q;
                int i42 = 2;
                if (i41 != 2) {
                    if (f10 <= 0.5f) {
                        i42 = 2;
                    } else {
                        float dp8 = AndroidUtilities.dp(13.0f);
                        float f37 = this.h;
                        float dp9 = (dp8 * f37 * f37) + (this.j ? AndroidUtilities.dp(2.0f) : 0);
                        float f38 = f10 - 0.5f;
                        float f39 = f38 / 0.5f;
                        if (f38 > 0.2f) {
                            f13 = (f38 - 0.2f) / 0.3f;
                            f12 = 1.0f;
                        } else {
                            f12 = f38 / 0.2f;
                            f13 = 0.0f;
                        }
                        float f40 = centerX3;
                        float f41 = dp9 / 2.0f;
                        rectF5.set(f40 - dp9, dp7 - f41, f40, dp7 + f41);
                        float f42 = f13 * 100.0f;
                        i11 = i10;
                        paint = paint4;
                        float f43 = f13;
                        dp2 = f40;
                        i12 = centerY4;
                        canvas.drawArc(rectF5, f42, (104.0f * f39) - f42, false, paint5);
                        float w10 = e2.c.w(dp7, dp, f12, dp);
                        if (f43 > 0.0f) {
                            float f44 = this.q == 14 ? 0.0f : (-45.0f) * (1.0f - f43);
                            float dp10 = AndroidUtilities.dp(7.0f) * f43 * this.h;
                            int i43 = (int) (f43 * 255.0f);
                            int i44 = this.q;
                            if (i44 != 3 && i44 != 14 && i44 != 2) {
                                i43 = (int) (i43 * (1.0f - Math.min(1.0f, this.r / 0.5f)));
                            }
                            int i45 = i43;
                            if (f44 != 0.0f) {
                                canvas.save();
                                canvas.rotate(f44, dp2, f36);
                            }
                            if (i45 != 0) {
                                paint5.setAlpha(i45);
                                if (this.q == 14) {
                                    paint3.setAlpha(i45);
                                    rectF5.set(centerX3 - AndroidUtilities.dp(3.5f), i12 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + centerX3, AndroidUtilities.dp(3.5f) + i12);
                                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
                                    paint5.setAlpha((int) (i45 * 0.15f));
                                    int dp11 = AndroidUtilities.dp(this.j ? 2.0f : 4.0f);
                                    rectF5.set(bounds.left + dp11, bounds.top + dp11, bounds.right - dp11, bounds.bottom - dp11);
                                    canvas.drawArc(rectF5, 0.0f, 360.0f, false, paint5);
                                    paint5.setAlpha(i45);
                                } else {
                                    float f45 = dp2 - dp10;
                                    float f46 = f36 - dp10;
                                    float f47 = dp2 + dp10;
                                    float f48 = dp10 + f36;
                                    rectF = rectF5;
                                    canvas.drawLine(f45, f46, f47, f48, paint5);
                                    canvas.drawLine(f47, f46, f45, f48, paint5);
                                    if (f44 != 0.0f) {
                                        canvas.restore();
                                    }
                                }
                            }
                            rectF = rectF5;
                            if (f44 != 0.0f) {
                            }
                        } else {
                            rectF = rectF5;
                        }
                        dp5 = w10;
                        dp3 = dp2;
                        dp6 = dp7;
                    }
                }
                i11 = i10;
                paint = paint4;
                i12 = centerY4;
                rectF = rectF5;
                if (i41 == i42) {
                    f11 = 1.0f - f10;
                } else {
                    f11 = f10 / 0.5f;
                    f10 = 1.0f - f11;
                }
                float w11 = e2.c.w(dp, dp5, f11, dp5);
                float w12 = e2.c.w(dp7, dp6, f11, dp6);
                float f49 = centerX3;
                float dp12 = f49 - ((AndroidUtilities.dp(8.0f) * f10) * this.h);
                dp3 = f49 + (AndroidUtilities.dp(8.0f) * f10 * this.h);
                dp7 = w12 - ((AndroidUtilities.dp(8.0f) * f10) * this.h);
                dp5 = w11;
                dp2 = dp12;
                dp6 = w12;
            } else {
                i11 = i10;
                paint = paint4;
                i12 = centerY4;
                rectF = rectF5;
                float f50 = centerX3;
                dp2 = f50 - (AndroidUtilities.dp(8.0f) * this.h);
                dp3 = (AndroidUtilities.dp(8.0f) * this.h) + f50;
                dp7 = dp6 - (AndroidUtilities.dp(8.0f) * this.h);
            }
            float f51 = dp3;
            float f52 = dp5;
            if (f52 != dp6) {
                float f53 = centerX3;
                canvas.drawLine(f53, f52, f53, dp6, paint5);
            }
            float f54 = centerX3;
            if (dp2 != f54) {
                float f55 = dp7;
                canvas.drawLine(dp2, f55, f54, dp6, paint5);
                canvas.drawLine(f51, f55, f54, dp6, paint5);
            }
        } else {
            i11 = i10;
            paint = paint4;
            i12 = centerY4;
            rectF = rectF5;
        }
        int i46 = this.p;
        if (i46 == 3 || i46 == 14) {
            canvas2 = canvas;
            rectF2 = rectF;
            i13 = 1;
            i14 = 4;
            z4 = false;
        } else {
            i14 = 4;
            if (i46 == 4 && ((i35 = this.q) == 14 || i35 == 3)) {
                canvas2 = canvas;
                rectF2 = rectF;
                i13 = 1;
                z4 = false;
            } else {
                if (i46 == 10 || this.q == 10 || i46 == 13) {
                    int i47 = this.q;
                    int i48 = (i47 == 4 || i47 == 6) ? (int) ((1.0f - this.r) * 255.0f) : 255;
                    if (i48 != 0) {
                        a(false);
                        paint5.setAlpha((int) (i48 * this.o));
                        float max = Math.max(4.0f, this.x * 360.0f);
                        int dp13 = AndroidUtilities.dp(this.j ? 2.0f : 4.0f);
                        rectF.set(bounds.left + dp13, bounds.top + dp13, bounds.right - dp13, bounds.bottom - dp13);
                        canvas2 = canvas;
                        canvas2.drawArc(rectF, this.v, max, false, paint5);
                        i15 = i12;
                        i16 = this.p;
                        if (i16 != this.q) {
                            f15 = 1.0f;
                            f16 = 1.0f;
                        } else if (i16 == i14 || i16 == 3 || i16 == 14) {
                            float f56 = this.r;
                            f15 = f56;
                            f16 = 1.0f - f56;
                        } else {
                            float min2 = Math.min(1.0f, this.r / 0.5f);
                            f16 = Math.max(0.0f, 1.0f - (this.r / 0.5f));
                            f15 = min2;
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
                                    int dp14 = AndroidUtilities.dp(7.0f) + i15;
                                    int dp15 = centerX3 - AndroidUtilities.dp(3.0f);
                                    if (this.p != this.q) {
                                        canvas2.save();
                                        float f57 = this.r;
                                        canvas2.scale(f57, f57, centerX3, i15);
                                    }
                                    float f58 = dp15;
                                    float f59 = dp14;
                                    drawable3 = drawable;
                                    drawable4 = drawable2;
                                    canvas2.drawLine(dp15 - AndroidUtilities.dp(6.0f), dp14 - AndroidUtilities.dp(6.0f), f58, f59, paint5);
                                    canvas2 = canvas;
                                    canvas2.drawLine(f58, f59, AndroidUtilities.dp(12.0f) + dp15, dp14 - AndroidUtilities.dp(12.0f), paint5);
                                    if (this.p != this.q) {
                                        canvas2.restore();
                                    }
                                } else {
                                    drawable3 = drawable;
                                    drawable4 = drawable2;
                                }
                                if (this.p != 12 || this.q == 12) {
                                    a(false);
                                    int i49 = this.p;
                                    int i50 = this.q;
                                    float f60 = i49 == i50 ? 1.0f : i50 == 13 ? this.r : 1.0f - this.r;
                                    paint5.setAlpha(i49 == i50 ? 255 : (int) (f60 * 255.0f));
                                    AndroidUtilities.dp(7.0f);
                                    AndroidUtilities.dp(3.0f);
                                    if (this.p != this.q) {
                                        canvas2.save();
                                        canvas2.scale(f60, f60, centerX3, i15);
                                    }
                                    float dp16 = AndroidUtilities.dp(7.0f) * this.h;
                                    float f61 = centerX3;
                                    float f62 = f61 - dp16;
                                    float f63 = i15;
                                    float f64 = f63 - dp16;
                                    float f65 = f61 + dp16;
                                    float f66 = f63 + dp16;
                                    canvas2.drawLine(f62, f64, f65, f66, paint5);
                                    canvas2.drawLine(f65, f64, f62, f66, paint5);
                                    if (this.p != this.q) {
                                        canvas2.restore();
                                    }
                                }
                                if (this.p != 13 || this.q == 13) {
                                    a(false);
                                    int i51 = this.p;
                                    int i52 = this.q;
                                    float f67 = i51 == i52 ? 1.0f : i52 == 13 ? this.r : 1.0f - this.r;
                                    TextPaint textPaint = this.a;
                                    textPaint.setAlpha((int) (f67 * 255.0f));
                                    int dp17 = AndroidUtilities.dp(5.0f) + i15;
                                    f17 = 5.0f;
                                    int i53 = centerX3 - (this.n / 2);
                                    rect = bounds;
                                    f18 = f16;
                                    if (this.p != this.q) {
                                        canvas2.save();
                                        canvas2.scale(f67, f67, centerX3, i15);
                                    }
                                    i19 = (int) (this.x * 100.0f);
                                    if (this.m == null && i19 == this.l) {
                                        i20 = centerX3;
                                    } else {
                                        this.l = i19;
                                        this.m = String.format("%d%%", Integer.valueOf(i19));
                                        i20 = centerX3;
                                        this.n = (int) Math.ceil(textPaint.measureText(r2));
                                    }
                                    canvas2.drawText(this.m, i53, dp17, textPaint);
                                    if (this.p != this.q) {
                                        canvas2.restore();
                                    }
                                } else {
                                    rect = bounds;
                                    f18 = f16;
                                    i20 = centerX3;
                                    f17 = 5.0f;
                                }
                                i21 = this.p;
                                if (i21 != 0 || i21 == 1 || (i30 = this.q) == 0 || i30 == 1) {
                                    if ((i21 == 0 || this.q != 1) && !(i21 == 1 && this.q == 0)) {
                                        i22 = 1;
                                    } else if (this.u) {
                                        f20 = this.q == 0 ? 1.0f - this.r : this.r;
                                        i22 = 1;
                                        i23 = this.q;
                                        if ((i23 != 0 || i23 == i22) && (i21 == 0 || i21 == i22)) {
                                            paint2 = paint;
                                            paint2.setAlpha(255);
                                        } else if (i23 == 4) {
                                            paint2 = paint;
                                            paint2.setAlpha((int) ((1.0f - this.r) * 255.0f));
                                        } else {
                                            paint2 = paint;
                                            paint2.setAlpha(i21 == i23 ? 255 : (int) (this.r * 255.0f));
                                        }
                                        a(true);
                                        canvas2.save();
                                        canvas2.translate(e2.c.w(1.0f, f20, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                                        f21 = f20 * 500.0f;
                                        i24 = this.p;
                                        f22 = i24 != 1 ? 90.0f : 0.0f;
                                        if (i24 == 0 || this.q != 1) {
                                            interpolation = (i24 == 1 || this.q != 0) ? f22 : f21 < 100.0f ? pr.j.getInterpolation(f21 / 100.0f) * (-5.0f) : f21 < 484.0f ? (pr.j.getInterpolation((f21 - 100.0f) / 384.0f) * 95.0f) - 5.0f : 90.0f;
                                        } else {
                                            interpolation = f21 < 384.0f ? pr.j.getInterpolation(f21 / 384.0f) * 95.0f : f21 < 484.0f ? 95.0f - (pr.j.getInterpolation((f21 - 384.0f) / 100.0f) * f17) : 90.0f;
                                            f21 += 100.0f;
                                        }
                                        canvas2.rotate(interpolation);
                                        i25 = this.p;
                                        if ((i25 != 0 && i25 != 1) || i25 == 4) {
                                            canvas2.scale(f15, f15);
                                        }
                                        org.telegram.ui.ActionBar.k6.x3.b(canvas2, paint2, f21);
                                        canvas2.scale(1.0f, -1.0f);
                                        org.telegram.ui.ActionBar.k6.x3.b(canvas2, paint2, f21);
                                        canvas2.restore();
                                    } else {
                                        i22 = 1;
                                    }
                                    f20 = f19;
                                    i23 = this.q;
                                    if (i23 != 0) {
                                    }
                                    paint2 = paint;
                                    paint2.setAlpha(255);
                                    a(true);
                                    canvas2.save();
                                    canvas2.translate(e2.c.w(1.0f, f20, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                                    f21 = f20 * 500.0f;
                                    i24 = this.p;
                                    if (i24 != 1) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    if (i24 == 1) {
                                    }
                                    canvas2.rotate(interpolation);
                                    i25 = this.p;
                                    if (i25 != 0) {
                                        canvas2.scale(f15, f15);
                                        org.telegram.ui.ActionBar.k6.x3.b(canvas2, paint2, f21);
                                        canvas2.scale(1.0f, -1.0f);
                                        org.telegram.ui.ActionBar.k6.x3.b(canvas2, paint2, f21);
                                        canvas2.restore();
                                    }
                                    canvas2.scale(f15, f15);
                                    org.telegram.ui.ActionBar.k6.x3.b(canvas2, paint2, f21);
                                    canvas2.scale(1.0f, -1.0f);
                                    org.telegram.ui.ActionBar.k6.x3.b(canvas2, paint2, f21);
                                    canvas2.restore();
                                } else {
                                    paint2 = paint;
                                }
                                if (this.p == 6 || this.q == 6) {
                                    a(false);
                                    if (this.p != 6) {
                                        float f68 = this.r;
                                        if (f68 > 0.5f) {
                                            float f69 = (f68 - 0.5f) / 0.5f;
                                            f23 = 1.0f - Math.min(1.0f, f69 / 0.5f);
                                            f26 = f69 > 0.5f ? (f69 - 0.5f) / 0.5f : 0.0f;
                                        } else {
                                            f26 = 0.0f;
                                            f23 = 1.0f;
                                        }
                                        paint5.setAlpha(255);
                                        f24 = f26;
                                    } else {
                                        if (this.q != 6) {
                                            paint5.setAlpha((int) ((1.0f - this.r) * 255.0f));
                                        } else {
                                            paint5.setAlpha(255);
                                        }
                                        f23 = 0.0f;
                                        f24 = 1.0f;
                                    }
                                    int dp18 = AndroidUtilities.dp(7.0f) + i15;
                                    int dp19 = i20 - AndroidUtilities.dp(3.0f);
                                    if (f23 < 1.0f) {
                                        i26 = i20;
                                        i27 = dp18;
                                        f25 = f24;
                                        i28 = dp19;
                                        canvas.drawLine(dp19 - AndroidUtilities.dp(6.0f), dp18 - AndroidUtilities.dp(6.0f), dp19 - (AndroidUtilities.dp(6.0f) * f23), dp18 - (AndroidUtilities.dp(6.0f) * f23), paint5);
                                    } else {
                                        i26 = i20;
                                        f25 = f24;
                                        i27 = dp18;
                                        i28 = dp19;
                                    }
                                    if (f25 > 0.0f) {
                                        float f70 = i28;
                                        float f71 = i27;
                                        canvas2 = canvas;
                                        canvas2.drawLine(f70, f71, (AndroidUtilities.dp(12.0f) * f25) + f70, f71 - (AndroidUtilities.dp(12.0f) * f25), paint5);
                                    } else {
                                        canvas2 = canvas;
                                    }
                                } else {
                                    i26 = i20;
                                }
                                if (drawable3 != null && drawable3 != drawable4) {
                                    int intrinsicWidth = (int) (drawable3.getIntrinsicWidth() * f18);
                                    int intrinsicHeight = (int) (drawable3.getIntrinsicHeight() * f18);
                                    drawable3.setColorFilter(this.g);
                                    drawable3.setAlpha(this.p == this.q ? 255 : (int) ((1.0f - this.r) * 255.0f));
                                    int i54 = intrinsicWidth / 2;
                                    int i55 = intrinsicHeight / 2;
                                    drawable3.setBounds(i26 - i54, i15 - i55, i26 + i54, i55 + i15);
                                    drawable3.draw(canvas2);
                                }
                                if (drawable4 != null) {
                                    int intrinsicWidth2 = (int) (drawable4.getIntrinsicWidth() * f15);
                                    int intrinsicHeight2 = (int) (drawable4.getIntrinsicHeight() * f15);
                                    drawable4.setColorFilter(this.g);
                                    drawable4.setAlpha(this.p == this.q ? 255 : (int) (this.r * 255.0f));
                                    int i56 = intrinsicWidth2 / 2;
                                    int i57 = intrinsicHeight2 / 2;
                                    drawable4.setBounds(i26 - i56, i15 - i57, i26 + i56, i57 + i15);
                                    drawable4.draw(canvas2);
                                }
                                Paint paint6 = this.c;
                                if (pathArr4 == null || pathArr4 == pathArr3) {
                                    i29 = i26;
                                } else {
                                    int dp20 = AndroidUtilities.dp(24.0f);
                                    paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                                    paint2.setAlpha(this.p == this.q ? 255 : (int) ((1.0f - this.r) * 255.0f));
                                    a(true);
                                    canvas2.save();
                                    i29 = i26;
                                    canvas2.translate(i29, i15);
                                    float f72 = f18;
                                    canvas2.scale(f72, f72);
                                    float f73 = (-dp20) / 2;
                                    canvas2.translate(f73, f73);
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
                                    int dp21 = AndroidUtilities.dp(24.0f);
                                    int i58 = this.p == this.q ? 255 : (int) (this.r * 255.0f);
                                    paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                                    paint2.setAlpha(i58);
                                    a(true);
                                    canvas2.save();
                                    canvas2.translate(i29, i15);
                                    canvas2.scale(f15, f15);
                                    float f74 = (-dp21) / 2;
                                    canvas2.translate(f74, f74);
                                    Path path4 = pathArr3[0];
                                    if (path4 != null) {
                                        canvas2.drawPath(path4, paint2);
                                    }
                                    if (pathArr3.length >= 3 && (path = pathArr3[2]) != null) {
                                        canvas2.drawPath(path, paint5);
                                    }
                                    Path path5 = pathArr3[1];
                                    if (path5 != null) {
                                        if (i58 != 255) {
                                            int alpha = paint6.getAlpha();
                                            paint6.setAlpha((int) ((i58 / 255.0f) * alpha));
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
                                int i59 = this.p;
                                if (i59 == 3 || i59 == 14 || ((i59 == 4 && this.q == 14) || i59 == 10 || i59 == 13)) {
                                    float f75 = ((360 * j10) / 2500.0f) + this.v;
                                    this.v = f75;
                                    while (f75 > 360.0f) {
                                        f75 -= 360.0f;
                                    }
                                    this.v = f75;
                                    if (this.q != 2) {
                                        float f76 = this.w;
                                        float f77 = this.y;
                                        float f78 = f76 - f77;
                                        if (f78 > 0.0f) {
                                            float f79 = this.z + j10;
                                            this.z = f79;
                                            if (f79 >= 200.0f) {
                                                this.x = f76;
                                                this.y = f76;
                                                this.z = 0.0f;
                                            } else {
                                                this.x = (this.i.getInterpolation(f79 / 200.0f) * f78) + f77;
                                            }
                                        }
                                    }
                                    invalidateSelf();
                                }
                                if (this.u) {
                                    float f80 = this.r;
                                    if (f80 < 1.0f) {
                                        float f81 = (j10 / this.k) + f80;
                                        this.r = f81;
                                        if (f81 >= 1.0f) {
                                            this.p = this.q;
                                            this.r = 1.0f;
                                            this.u = false;
                                        }
                                        invalidateSelf();
                                    }
                                }
                                int i60 = i11;
                                if (i60 >= 1) {
                                    canvas2.restoreToCount(i60);
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
                        int dp142 = AndroidUtilities.dp(7.0f) + i15;
                        int dp152 = centerX3 - AndroidUtilities.dp(3.0f);
                        if (this.p != this.q) {
                        }
                        float f582 = dp152;
                        float f592 = dp142;
                        drawable3 = drawable;
                        drawable4 = drawable2;
                        canvas2.drawLine(dp152 - AndroidUtilities.dp(6.0f), dp142 - AndroidUtilities.dp(6.0f), f582, f592, paint5);
                        canvas2 = canvas;
                        canvas2.drawLine(f582, f592, AndroidUtilities.dp(12.0f) + dp152, dp142 - AndroidUtilities.dp(12.0f), paint5);
                        if (this.p != this.q) {
                        }
                        if (this.p != 12) {
                        }
                        a(false);
                        int i492 = this.p;
                        int i502 = this.q;
                        if (i492 == i502) {
                        }
                        paint5.setAlpha(i492 == i502 ? 255 : (int) (f60 * 255.0f));
                        AndroidUtilities.dp(7.0f);
                        AndroidUtilities.dp(3.0f);
                        if (this.p != this.q) {
                        }
                        float dp162 = AndroidUtilities.dp(7.0f) * this.h;
                        float f612 = centerX3;
                        float f622 = f612 - dp162;
                        float f632 = i15;
                        float f642 = f632 - dp162;
                        float f652 = f612 + dp162;
                        float f662 = f632 + dp162;
                        canvas2.drawLine(f622, f642, f652, f662, paint5);
                        canvas2.drawLine(f652, f642, f622, f662, paint5);
                        if (this.p != this.q) {
                        }
                        if (this.p != 13) {
                        }
                        a(false);
                        int i512 = this.p;
                        int i522 = this.q;
                        if (i512 == i522) {
                        }
                        TextPaint textPaint2 = this.a;
                        textPaint2.setAlpha((int) (f67 * 255.0f));
                        int dp172 = AndroidUtilities.dp(5.0f) + i15;
                        f17 = 5.0f;
                        int i532 = centerX3 - (this.n / 2);
                        rect = bounds;
                        f18 = f16;
                        if (this.p != this.q) {
                        }
                        i19 = (int) (this.x * 100.0f);
                        if (this.m == null) {
                        }
                        this.l = i19;
                        this.m = String.format("%d%%", Integer.valueOf(i19));
                        i20 = centerX3;
                        this.n = (int) Math.ceil(textPaint2.measureText(r2));
                        canvas2.drawText(this.m, i532, dp172, textPaint2);
                        if (this.p != this.q) {
                        }
                        i21 = this.p;
                        if (i21 != 0) {
                        }
                        if (i21 == 0) {
                        }
                        i22 = 1;
                    }
                }
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
                int dp1422 = AndroidUtilities.dp(7.0f) + i15;
                int dp1522 = centerX3 - AndroidUtilities.dp(3.0f);
                if (this.p != this.q) {
                }
                float f5822 = dp1522;
                float f5922 = dp1422;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas2.drawLine(dp1522 - AndroidUtilities.dp(6.0f), dp1422 - AndroidUtilities.dp(6.0f), f5822, f5922, paint5);
                canvas2 = canvas;
                canvas2.drawLine(f5822, f5922, AndroidUtilities.dp(12.0f) + dp1522, dp1422 - AndroidUtilities.dp(12.0f), paint5);
                if (this.p != this.q) {
                }
                if (this.p != 12) {
                }
                a(false);
                int i4922 = this.p;
                int i5022 = this.q;
                if (i4922 == i5022) {
                }
                paint5.setAlpha(i4922 == i5022 ? 255 : (int) (f60 * 255.0f));
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.p != this.q) {
                }
                float dp1622 = AndroidUtilities.dp(7.0f) * this.h;
                float f6122 = centerX3;
                float f6222 = f6122 - dp1622;
                float f6322 = i15;
                float f6422 = f6322 - dp1622;
                float f6522 = f6122 + dp1622;
                float f6622 = f6322 + dp1622;
                canvas2.drawLine(f6222, f6422, f6522, f6622, paint5);
                canvas2.drawLine(f6522, f6422, f6222, f6622, paint5);
                if (this.p != this.q) {
                }
                if (this.p != 13) {
                }
                a(false);
                int i5122 = this.p;
                int i5222 = this.q;
                if (i5122 == i5222) {
                }
                TextPaint textPaint22 = this.a;
                textPaint22.setAlpha((int) (f67 * 255.0f));
                int dp1722 = AndroidUtilities.dp(5.0f) + i15;
                f17 = 5.0f;
                int i5322 = centerX3 - (this.n / 2);
                rect = bounds;
                f18 = f16;
                if (this.p != this.q) {
                }
                i19 = (int) (this.x * 100.0f);
                if (this.m == null) {
                }
                this.l = i19;
                this.m = String.format("%d%%", Integer.valueOf(i19));
                i20 = centerX3;
                this.n = (int) Math.ceil(textPaint22.measureText(r2));
                canvas2.drawText(this.m, i5322, dp1722, textPaint22);
                if (this.p != this.q) {
                }
                i21 = this.p;
                if (i21 != 0) {
                }
                if (i21 == 0) {
                }
                i22 = 1;
            }
        }
        a(z4);
        int i61 = this.q;
        if (i61 == 2) {
            float f82 = this.r;
            if (f82 <= 0.5f) {
                float f83 = 1.0f - (f82 / 0.5f);
                i34 = (int) (f83 * 255.0f);
                dp4 = AndroidUtilities.dp(7.0f) * f83 * this.h;
            } else {
                dp4 = 0.0f;
                i34 = 0;
            }
            min = i34;
            centerX = 0.0f;
            f30 = 0.0f;
            f29 = 1.0f;
        } else {
            if (i61 == 15 || i61 == 0 || i61 == i13 || i61 == 5 || i61 == 8 || i61 == 9 || i61 == 7 || i61 == 6) {
                if (i61 == 6) {
                    f27 = 1.0f;
                    f28 = Math.min(1.0f, this.r / 0.5f);
                } else {
                    f27 = 1.0f;
                    f28 = this.r;
                }
                float f84 = f27 - f28;
                centerX = bounds.centerX();
                centerY = bounds.centerY();
                dp4 = AndroidUtilities.dp(7.0f) * f84 * this.h;
                min = (int) (Math.min(f27, f84 * 2.0f) * 255.0f);
                f29 = f84;
                f30 = 0.0f;
            } else if (i61 == i14) {
                float f85 = 1.0f - this.r;
                float dp22 = AndroidUtilities.dp(7.0f) * this.h;
                int i62 = (int) (f85 * 255.0f);
                if (this.p == 14) {
                    centerX = bounds.left;
                    centerY3 = bounds.top;
                } else {
                    centerX = bounds.centerX();
                    centerY3 = bounds.centerY();
                }
                centerY = centerY3;
                f33 = 1.0f;
                min = i62;
                f29 = f85;
                dp4 = dp22;
                f30 = 0.0f;
                if (f29 != f33) {
                    canvas2.save();
                    canvas2.scale(f29, f29, centerX, centerY);
                }
                if (f30 != 0.0f) {
                    canvas2.save();
                    i15 = i12;
                    canvas2.rotate(f30, centerX3, i15);
                } else {
                    i15 = i12;
                }
                if (min != 0) {
                    float f86 = min;
                    paint5.setAlpha((int) (this.o * f86));
                    if (this.p == 14 || this.q == 14) {
                        rectF3 = rectF2;
                        paint3.setAlpha((int) (f86 * this.o));
                        rectF3.set(centerX3 - AndroidUtilities.dp(3.5f), i15 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + centerX3, AndroidUtilities.dp(3.5f) + i15);
                        canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
                    } else {
                        float f87 = centerX3;
                        RectF rectF6 = rectF2;
                        float f88 = f87 - dp4;
                        float f89 = i15;
                        float f90 = f89 - dp4;
                        float f91 = f87 + dp4;
                        float f92 = f89 + dp4;
                        rectF3 = rectF6;
                        canvas2.drawLine(f88, f90, f91, f92, paint5);
                        canvas2.drawLine(f91, f90, f88, f92, paint5);
                    }
                } else {
                    rectF3 = rectF2;
                }
                if (f30 != 0.0f) {
                    canvas2.restore();
                }
                if (f29 != f33) {
                    canvas2.restore();
                }
                i31 = this.p;
                if ((i31 != 3 || i31 == 14 || (i31 == i14 && ((i33 = this.q) == 14 || i33 == 3))) && min != 0) {
                    float max2 = Math.max(4.0f, this.x * 360.0f);
                    int dp23 = AndroidUtilities.dp(this.j ? 2.0f : 4.0f);
                    rectF3.set(bounds.left + dp23, bounds.top + dp23, bounds.right - dp23, bounds.bottom - dp23);
                    i32 = this.p;
                    if (i32 != 14 || (i32 == i14 && this.q == 14)) {
                        paint5.setAlpha((int) (min * 0.15f * this.o));
                        rectF4 = rectF3;
                        canvas2.drawArc(rectF4, 0.0f, 360.0f, false, paint5);
                        paint5.setAlpha(min);
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
                    int dp14222 = AndroidUtilities.dp(7.0f) + i15;
                    int dp15222 = centerX3 - AndroidUtilities.dp(3.0f);
                    if (this.p != this.q) {
                    }
                    float f58222 = dp15222;
                    float f59222 = dp14222;
                    drawable3 = drawable;
                    drawable4 = drawable2;
                    canvas2.drawLine(dp15222 - AndroidUtilities.dp(6.0f), dp14222 - AndroidUtilities.dp(6.0f), f58222, f59222, paint5);
                    canvas2 = canvas;
                    canvas2.drawLine(f58222, f59222, AndroidUtilities.dp(12.0f) + dp15222, dp14222 - AndroidUtilities.dp(12.0f), paint5);
                    if (this.p != this.q) {
                    }
                    if (this.p != 12) {
                    }
                    a(false);
                    int i49222 = this.p;
                    int i50222 = this.q;
                    if (i49222 == i50222) {
                    }
                    paint5.setAlpha(i49222 == i50222 ? 255 : (int) (f60 * 255.0f));
                    AndroidUtilities.dp(7.0f);
                    AndroidUtilities.dp(3.0f);
                    if (this.p != this.q) {
                    }
                    float dp16222 = AndroidUtilities.dp(7.0f) * this.h;
                    float f61222 = centerX3;
                    float f62222 = f61222 - dp16222;
                    float f63222 = i15;
                    float f64222 = f63222 - dp16222;
                    float f65222 = f61222 + dp16222;
                    float f66222 = f63222 + dp16222;
                    canvas2.drawLine(f62222, f64222, f65222, f66222, paint5);
                    canvas2.drawLine(f65222, f64222, f62222, f66222, paint5);
                    if (this.p != this.q) {
                    }
                    if (this.p != 13) {
                    }
                    a(false);
                    int i51222 = this.p;
                    int i52222 = this.q;
                    if (i51222 == i52222) {
                    }
                    TextPaint textPaint222 = this.a;
                    textPaint222.setAlpha((int) (f67 * 255.0f));
                    int dp17222 = AndroidUtilities.dp(5.0f) + i15;
                    f17 = 5.0f;
                    int i53222 = centerX3 - (this.n / 2);
                    rect = bounds;
                    f18 = f16;
                    if (this.p != this.q) {
                    }
                    i19 = (int) (this.x * 100.0f);
                    if (this.m == null) {
                    }
                    this.l = i19;
                    this.m = String.format("%d%%", Integer.valueOf(i19));
                    i20 = centerX3;
                    this.n = (int) Math.ceil(textPaint222.measureText(r2));
                    canvas2.drawText(this.m, i53222, dp17222, textPaint222);
                    if (this.p != this.q) {
                    }
                    i21 = this.p;
                    if (i21 != 0) {
                    }
                    if (i21 == 0) {
                    }
                    i22 = 1;
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
                int dp142222 = AndroidUtilities.dp(7.0f) + i15;
                int dp152222 = centerX3 - AndroidUtilities.dp(3.0f);
                if (this.p != this.q) {
                }
                float f582222 = dp152222;
                float f592222 = dp142222;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas2.drawLine(dp152222 - AndroidUtilities.dp(6.0f), dp142222 - AndroidUtilities.dp(6.0f), f582222, f592222, paint5);
                canvas2 = canvas;
                canvas2.drawLine(f582222, f592222, AndroidUtilities.dp(12.0f) + dp152222, dp142222 - AndroidUtilities.dp(12.0f), paint5);
                if (this.p != this.q) {
                }
                if (this.p != 12) {
                }
                a(false);
                int i492222 = this.p;
                int i502222 = this.q;
                if (i492222 == i502222) {
                }
                paint5.setAlpha(i492222 == i502222 ? 255 : (int) (f60 * 255.0f));
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.p != this.q) {
                }
                float dp162222 = AndroidUtilities.dp(7.0f) * this.h;
                float f612222 = centerX3;
                float f622222 = f612222 - dp162222;
                float f632222 = i15;
                float f642222 = f632222 - dp162222;
                float f652222 = f612222 + dp162222;
                float f662222 = f632222 + dp162222;
                canvas2.drawLine(f622222, f642222, f652222, f662222, paint5);
                canvas2.drawLine(f652222, f642222, f622222, f662222, paint5);
                if (this.p != this.q) {
                }
                if (this.p != 13) {
                }
                a(false);
                int i512222 = this.p;
                int i522222 = this.q;
                if (i512222 == i522222) {
                }
                TextPaint textPaint2222 = this.a;
                textPaint2222.setAlpha((int) (f67 * 255.0f));
                int dp172222 = AndroidUtilities.dp(5.0f) + i15;
                f17 = 5.0f;
                int i532222 = centerX3 - (this.n / 2);
                rect = bounds;
                f18 = f16;
                if (this.p != this.q) {
                }
                i19 = (int) (this.x * 100.0f);
                if (this.m == null) {
                }
                this.l = i19;
                this.m = String.format("%d%%", Integer.valueOf(i19));
                i20 = centerX3;
                this.n = (int) Math.ceil(textPaint2222.measureText(r2));
                canvas2.drawText(this.m, i532222, dp172222, textPaint2222);
                if (this.p != this.q) {
                }
                i21 = this.p;
                if (i21 != 0) {
                }
                if (i21 == 0) {
                }
                i22 = 1;
            } else if (i61 == 14 || i61 == 3) {
                float f93 = this.r;
                float f94 = 1.0f - f93;
                if (this.p == i14) {
                    f32 = f93;
                    f31 = 0.0f;
                } else {
                    f31 = 45.0f * f94;
                    f32 = 1.0f;
                }
                float dp24 = AndroidUtilities.dp(7.0f) * this.h;
                int i63 = (int) (f93 * 255.0f);
                if (this.q == 14) {
                    centerX2 = bounds.left;
                    centerY2 = bounds.top;
                } else {
                    centerX2 = bounds.centerX();
                    centerY2 = bounds.centerY();
                }
                centerY = centerY2;
                float f95 = centerX2;
                min = i63;
                centerX = f95;
                float f96 = f32;
                f30 = f31;
                dp4 = dp24;
                f29 = f96;
            } else {
                dp4 = this.h * AndroidUtilities.dp(7.0f);
                centerX = 0.0f;
                f30 = 0.0f;
                f29 = 1.0f;
                min = 255;
            }
            f33 = 1.0f;
            if (f29 != f33) {
            }
            if (f30 != 0.0f) {
            }
            if (min != 0) {
            }
            if (f30 != 0.0f) {
            }
            if (f29 != f33) {
            }
            i31 = this.p;
            if (i31 != 3) {
            }
            float max22 = Math.max(4.0f, this.x * 360.0f);
            int dp232 = AndroidUtilities.dp(this.j ? 2.0f : 4.0f);
            rectF3.set(bounds.left + dp232, bounds.top + dp232, bounds.right - dp232, bounds.bottom - dp232);
            i32 = this.p;
            if (i32 != 14) {
            }
            paint5.setAlpha((int) (min * 0.15f * this.o));
            rectF4 = rectF3;
            canvas2.drawArc(rectF4, 0.0f, 360.0f, false, paint5);
            paint5.setAlpha(min);
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
            int dp1422222 = AndroidUtilities.dp(7.0f) + i15;
            int dp1522222 = centerX3 - AndroidUtilities.dp(3.0f);
            if (this.p != this.q) {
            }
            float f5822222 = dp1522222;
            float f5922222 = dp1422222;
            drawable3 = drawable;
            drawable4 = drawable2;
            canvas2.drawLine(dp1522222 - AndroidUtilities.dp(6.0f), dp1422222 - AndroidUtilities.dp(6.0f), f5822222, f5922222, paint5);
            canvas2 = canvas;
            canvas2.drawLine(f5822222, f5922222, AndroidUtilities.dp(12.0f) + dp1522222, dp1422222 - AndroidUtilities.dp(12.0f), paint5);
            if (this.p != this.q) {
            }
            if (this.p != 12) {
            }
            a(false);
            int i4922222 = this.p;
            int i5022222 = this.q;
            if (i4922222 == i5022222) {
            }
            paint5.setAlpha(i4922222 == i5022222 ? 255 : (int) (f60 * 255.0f));
            AndroidUtilities.dp(7.0f);
            AndroidUtilities.dp(3.0f);
            if (this.p != this.q) {
            }
            float dp1622222 = AndroidUtilities.dp(7.0f) * this.h;
            float f6122222 = centerX3;
            float f6222222 = f6122222 - dp1622222;
            float f6322222 = i15;
            float f6422222 = f6322222 - dp1622222;
            float f6522222 = f6122222 + dp1622222;
            float f6622222 = f6322222 + dp1622222;
            canvas2.drawLine(f6222222, f6422222, f6522222, f6622222, paint5);
            canvas2.drawLine(f6522222, f6422222, f6222222, f6622222, paint5);
            if (this.p != this.q) {
            }
            if (this.p != 13) {
            }
            a(false);
            int i5122222 = this.p;
            int i5222222 = this.q;
            if (i5122222 == i5222222) {
            }
            TextPaint textPaint22222 = this.a;
            textPaint22222.setAlpha((int) (f67 * 255.0f));
            int dp1722222 = AndroidUtilities.dp(5.0f) + i15;
            f17 = 5.0f;
            int i5322222 = centerX3 - (this.n / 2);
            rect = bounds;
            f18 = f16;
            if (this.p != this.q) {
            }
            i19 = (int) (this.x * 100.0f);
            if (this.m == null) {
            }
            this.l = i19;
            this.m = String.format("%d%%", Integer.valueOf(i19));
            i20 = centerX3;
            this.n = (int) Math.ceil(textPaint22222.measureText(r2));
            canvas2.drawText(this.m, i5322222, dp1722222, textPaint22222);
            if (this.p != this.q) {
            }
            i21 = this.p;
            if (i21 != 0) {
            }
            if (i21 == 0) {
            }
            i22 = 1;
        }
        centerY = 0.0f;
        f33 = 1.0f;
        if (f29 != f33) {
        }
        if (f30 != 0.0f) {
        }
        if (min != 0) {
        }
        if (f30 != 0.0f) {
        }
        if (f29 != f33) {
        }
        i31 = this.p;
        if (i31 != 3) {
        }
        float max222 = Math.max(4.0f, this.x * 360.0f);
        int dp2322 = AndroidUtilities.dp(this.j ? 2.0f : 4.0f);
        rectF3.set(bounds.left + dp2322, bounds.top + dp2322, bounds.right - dp2322, bounds.bottom - dp2322);
        i32 = this.p;
        if (i32 != 14) {
        }
        paint5.setAlpha((int) (min * 0.15f * this.o));
        rectF4 = rectF3;
        canvas2.drawArc(rectF4, 0.0f, 360.0f, false, paint5);
        paint5.setAlpha(min);
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
        int dp14222222 = AndroidUtilities.dp(7.0f) + i15;
        int dp15222222 = centerX3 - AndroidUtilities.dp(3.0f);
        if (this.p != this.q) {
        }
        float f58222222 = dp15222222;
        float f59222222 = dp14222222;
        drawable3 = drawable;
        drawable4 = drawable2;
        canvas2.drawLine(dp15222222 - AndroidUtilities.dp(6.0f), dp14222222 - AndroidUtilities.dp(6.0f), f58222222, f59222222, paint5);
        canvas2 = canvas;
        canvas2.drawLine(f58222222, f59222222, AndroidUtilities.dp(12.0f) + dp15222222, dp14222222 - AndroidUtilities.dp(12.0f), paint5);
        if (this.p != this.q) {
        }
        if (this.p != 12) {
        }
        a(false);
        int i49222222 = this.p;
        int i50222222 = this.q;
        if (i49222222 == i50222222) {
        }
        paint5.setAlpha(i49222222 == i50222222 ? 255 : (int) (f60 * 255.0f));
        AndroidUtilities.dp(7.0f);
        AndroidUtilities.dp(3.0f);
        if (this.p != this.q) {
        }
        float dp16222222 = AndroidUtilities.dp(7.0f) * this.h;
        float f61222222 = centerX3;
        float f62222222 = f61222222 - dp16222222;
        float f63222222 = i15;
        float f64222222 = f63222222 - dp16222222;
        float f65222222 = f61222222 + dp16222222;
        float f66222222 = f63222222 + dp16222222;
        canvas2.drawLine(f62222222, f64222222, f65222222, f66222222, paint5);
        canvas2.drawLine(f65222222, f64222222, f62222222, f66222222, paint5);
        if (this.p != this.q) {
        }
        if (this.p != 13) {
        }
        a(false);
        int i51222222 = this.p;
        int i52222222 = this.q;
        if (i51222222 == i52222222) {
        }
        TextPaint textPaint222222 = this.a;
        textPaint222222.setAlpha((int) (f67 * 255.0f));
        int dp17222222 = AndroidUtilities.dp(5.0f) + i15;
        f17 = 5.0f;
        int i53222222 = centerX3 - (this.n / 2);
        rect = bounds;
        f18 = f16;
        if (this.p != this.q) {
        }
        i19 = (int) (this.x * 100.0f);
        if (this.m == null) {
        }
        this.l = i19;
        this.m = String.format("%d%%", Integer.valueOf(i19));
        i20 = centerX3;
        this.n = (int) Math.ceil(textPaint222222.measureText(r2));
        canvas2.drawText(this.m, i53222222, dp17222222, textPaint222222);
        if (this.p != this.q) {
        }
        i21 = this.p;
        if (i21 != 0) {
        }
        if (i21 == 0) {
        }
        i22 = 1;
    }

    public final void e(float f10, boolean z4) {
        if (this.w == f10) {
            return;
        }
        if (z4) {
            if (this.x > f10) {
                this.x = f10;
            }
            this.y = this.x;
        } else {
            this.x = f10;
            this.y = f10;
        }
        this.w = f10;
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
        hv hvVar = this.A;
        if (hvVar != null) {
            ((View) hvVar.b).invalidate();
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
