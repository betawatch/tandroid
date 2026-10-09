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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ua0 extends Drawable {
    public bw A;
    public org.telegram.ui.ActionBar.f5 B;
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

    public ua0() {
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
        org.telegram.ui.ActionBar.f5 f5Var = this.B;
        if (f5Var == null || !f5Var.l() || this.E) {
            return;
        }
        Rect bounds = getBounds();
        org.telegram.ui.ActionBar.f5 f5Var2 = this.B;
        Shader shader = f5Var2.a;
        Matrix matrix = f5Var2.k;
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
    
        if (r41.q == 1) goto L356;
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
    /* JADX WARN: Removed duplicated region for block: B:350:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x05b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05e5  */
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
        RectF rectF2;
        Canvas canvas2;
        int i13;
        int i14;
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
        Paint paint2;
        float interpolation;
        float f19;
        float f20;
        int i23;
        float f21;
        int i24;
        int i25;
        float f22;
        int i26;
        Path path;
        int i27;
        boolean z10;
        int i28;
        float f23;
        float f24;
        int i29;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        float f33;
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
        org.telegram.ui.ActionBar.f5 f5Var = this.B;
        Paint paint3 = this.e;
        Paint paint4 = this.d;
        Paint paint5 = this.b;
        if (f5Var != null && f5Var.l() && !this.E) {
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
                float f34 = 1.0f - this.r;
                canvas.scale(f34, f34, centerX2, centerY3);
                i10 = save;
            }
        } else {
            f7 = 1.0f;
            if ((i35 == 6 || i35 == 10) && this.p == 4) {
                save = canvas.save();
                float f35 = this.r;
                canvas.scale(f35, f35, centerX2, centerY3);
                i10 = save;
            }
            i10 = 0;
        }
        AndroidUtilities.dp(3.0f);
        int i37 = this.p;
        RectF rectF5 = this.f;
        if (i37 == 2 || this.q == 2) {
            a(false);
            float f36 = centerY3;
            float dp4 = f36 - (AndroidUtilities.dp(9.0f) * this.h);
            float dp5 = (AndroidUtilities.dp(9.0f) * this.h) + f36;
            float dp6 = (AndroidUtilities.dp(12.0f) * this.h) + f36;
            int i38 = this.p;
            if ((i38 == 3 || i38 == 14) && this.q == 2) {
                paint5.setAlpha((int) (Math.min(f7, this.r / 0.5f) * 255.0f));
                f10 = this.r;
                dp = (AndroidUtilities.dp(12.0f) * this.h) + f36;
            } else {
                int i39 = this.q;
                if (i39 == 3 || i39 == 14 || i39 == 2) {
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
                int i40 = this.q;
                int i41 = 2;
                if (i40 != 2) {
                    if (f10 <= 0.5f) {
                        i41 = 2;
                    } else {
                        float dp7 = AndroidUtilities.dp(13.0f);
                        float f37 = this.h;
                        float dp8 = (dp7 * f37 * f37) + (this.j ? AndroidUtilities.dp(2.0f) : 0);
                        float f38 = f10 - 0.5f;
                        float f39 = f38 / 0.5f;
                        if (f38 > 0.2f) {
                            f13 = (f38 - 0.2f) / 0.3f;
                            f12 = 1.0f;
                        } else {
                            f12 = f38 / 0.2f;
                            f13 = 0.0f;
                        }
                        float f40 = centerX2;
                        float f41 = dp8 / 2.0f;
                        rectF5.set(f40 - dp8, dp6 - f41, f40, dp6 + f41);
                        float f42 = f13 * 100.0f;
                        i11 = i10;
                        paint = paint4;
                        float f43 = f13;
                        dp2 = f40;
                        i12 = centerY3;
                        canvas.drawArc(rectF5, f42, (104.0f * f39) - f42, false, paint5);
                        float y3 = com.google.android.gms.internal.vision.e2.y(dp6, dp, f12, dp);
                        if (f43 > 0.0f) {
                            float f44 = this.q == 14 ? 0.0f : (-45.0f) * (1.0f - f43);
                            float dp9 = AndroidUtilities.dp(7.0f) * f43 * this.h;
                            int i42 = (int) (f43 * 255.0f);
                            int i43 = this.q;
                            if (i43 != 3 && i43 != 14 && i43 != 2) {
                                i42 = (int) (i42 * (1.0f - Math.min(1.0f, this.r / 0.5f)));
                            }
                            int i44 = i42;
                            if (f44 != 0.0f) {
                                canvas.save();
                                canvas.rotate(f44, dp2, f36);
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
                                    float f45 = dp2 - dp9;
                                    float f46 = f36 - dp9;
                                    float f47 = dp2 + dp9;
                                    float f48 = dp9 + f36;
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
                    f11 = 1.0f - f10;
                } else {
                    f11 = f10 / 0.5f;
                    f10 = 1.0f - f11;
                }
                float y10 = com.google.android.gms.internal.vision.e2.y(dp, dp4, f11, dp4);
                float y11 = com.google.android.gms.internal.vision.e2.y(dp6, dp5, f11, dp5);
                float f49 = centerX2;
                float dp11 = f49 - ((AndroidUtilities.dp(8.0f) * f10) * this.h);
                dp3 = f49 + (AndroidUtilities.dp(8.0f) * f10 * this.h);
                dp6 = y11 - ((AndroidUtilities.dp(8.0f) * f10) * this.h);
                dp4 = y10;
                dp2 = dp11;
                dp5 = y11;
            } else {
                i11 = i10;
                paint = paint4;
                i12 = centerY3;
                rectF = rectF5;
                float f50 = centerX2;
                dp2 = f50 - (AndroidUtilities.dp(8.0f) * this.h);
                dp3 = (AndroidUtilities.dp(8.0f) * this.h) + f50;
                dp6 = dp5 - (AndroidUtilities.dp(8.0f) * this.h);
            }
            float f51 = dp3;
            float f52 = dp4;
            if (f52 != dp5) {
                float f53 = centerX2;
                canvas.drawLine(f53, f52, f53, dp5, paint5);
            }
            float f54 = centerX2;
            if (dp2 != f54) {
                float f55 = dp6;
                canvas.drawLine(dp2, f55, f54, dp5, paint5);
                canvas.drawLine(f51, f55, f54, dp5, paint5);
            }
        } else {
            i11 = i10;
            paint = paint4;
            i12 = centerY3;
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
                    f15 = 1.0f;
                    f16 = 1.0f;
                } else if (i16 == i14 || i16 == 3 || i16 == 14) {
                    float f56 = this.r;
                    f15 = f56;
                    f16 = 1.0f - f56;
                } else {
                    float min = Math.min(1.0f, this.r / 0.5f);
                    f16 = Math.max(0.0f, 1.0f - (this.r / 0.5f));
                    f15 = min;
                }
                i17 = this.q;
                if (i17 != 15) {
                    pathArr = org.telegram.ui.ActionBar.i6.a5;
                } else {
                    if (this.p == 15) {
                        pathArr2 = org.telegram.ui.ActionBar.i6.a5;
                        pathArr = null;
                        if (i17 == 5) {
                            pathArr = org.telegram.ui.ActionBar.i6.Z4;
                        } else if (this.p == 5) {
                            pathArr2 = org.telegram.ui.ActionBar.i6.Z4;
                        }
                        Path[] pathArr3 = pathArr;
                        Path[] pathArr4 = pathArr2;
                        if (i17 == 7) {
                            drawable2 = org.telegram.ui.ActionBar.i6.b5;
                            drawable = null;
                            i18 = 8;
                        } else {
                            drawable = this.p == 7 ? org.telegram.ui.ActionBar.i6.b5 : null;
                            i18 = 8;
                            drawable2 = null;
                        }
                        if (i17 == i18) {
                            drawable2 = org.telegram.ui.ActionBar.i6.c5;
                        } else if (this.p == i18) {
                            drawable = org.telegram.ui.ActionBar.i6.c5;
                        }
                        if (this.p != 9 || i17 == 9) {
                            a(false);
                            paint5.setAlpha(this.p == this.q ? 255 : (int) (this.r * 255.0f));
                            int dp13 = AndroidUtilities.dp(7.0f) + i15;
                            int dp14 = centerX2 - AndroidUtilities.dp(3.0f);
                            if (this.p != this.q) {
                                canvas2.save();
                                float f57 = this.r;
                                canvas2.scale(f57, f57, centerX2, i15);
                            }
                            float f58 = dp14;
                            float f59 = dp13;
                            drawable3 = drawable;
                            drawable4 = drawable2;
                            canvas2.drawLine(dp14 - AndroidUtilities.dp(6.0f), dp13 - AndroidUtilities.dp(6.0f), f58, f59, paint5);
                            canvas2 = canvas;
                            canvas2.drawLine(f58, f59, AndroidUtilities.dp(12.0f) + dp14, dp13 - AndroidUtilities.dp(12.0f), paint5);
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
                            float f60 = i48 == i49 ? 1.0f : i49 == 13 ? this.r : 1.0f - this.r;
                            paint5.setAlpha(i48 == i49 ? 255 : (int) (f60 * 255.0f));
                            AndroidUtilities.dp(7.0f);
                            AndroidUtilities.dp(3.0f);
                            if (this.p != this.q) {
                                canvas2.save();
                                canvas2.scale(f60, f60, centerX2, i15);
                            }
                            float dp15 = AndroidUtilities.dp(7.0f) * this.h;
                            float f61 = centerX2;
                            float f62 = f61 - dp15;
                            float f63 = i15;
                            float f64 = f63 - dp15;
                            float f65 = f61 + dp15;
                            float f66 = f63 + dp15;
                            canvas2.drawLine(f62, f64, f65, f66, paint5);
                            canvas2.drawLine(f65, f64, f62, f66, paint5);
                            if (this.p != this.q) {
                                canvas2.restore();
                            }
                        }
                        if (this.p != 13 || this.q == 13) {
                            a(false);
                            int i50 = this.p;
                            int i51 = this.q;
                            float f67 = i50 == i51 ? 1.0f : i51 == 13 ? this.r : 1.0f - this.r;
                            TextPaint textPaint = this.a;
                            textPaint.setAlpha((int) (f67 * 255.0f));
                            int dp16 = AndroidUtilities.dp(5.0f) + i15;
                            f17 = 5.0f;
                            int i52 = centerX2 - (this.n / 2);
                            rect = bounds;
                            f18 = f16;
                            if (this.p != this.q) {
                                canvas2.save();
                                canvas2.scale(f67, f67, centerX2, i15);
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
                            f17 = 5.0f;
                            rect = bounds;
                            f18 = f16;
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
                                float f68 = this.q == 0 ? 1.0f - this.r : this.r;
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
                                canvas2.translate(com.google.android.gms.internal.vision.e2.y(1.0f, f68, AndroidUtilities.dp(1.0f), rect.centerX()), rect.centerY());
                                float f69 = f68 * 500.0f;
                                int i54 = this.p;
                                float f70 = i54 == 1 ? 90.0f : 0.0f;
                                if (i54 == 0 && this.q == 1) {
                                    interpolation = f69 < 384.0f ? hs.j.getInterpolation(f69 / 384.0f) * 95.0f : f69 < 484.0f ? 95.0f - (hs.j.getInterpolation((f69 - 384.0f) / 100.0f) * f17) : 90.0f;
                                    f69 += 100.0f;
                                } else {
                                    interpolation = (i54 == 1 && this.q == 0) ? f69 < 100.0f ? (-5.0f) * hs.j.getInterpolation(f69 / 100.0f) : f69 < 484.0f ? (-5.0f) + (hs.j.getInterpolation((f69 - 100.0f) / 384.0f) * 95.0f) : 90.0f : f70;
                                }
                                canvas2.rotate(interpolation);
                                int i55 = this.p;
                                if ((i55 != 0 && i55 != 1) || i55 == 4) {
                                    canvas2.scale(f15, f15);
                                }
                                org.telegram.ui.ActionBar.i6.x3.b(canvas2, paint2, f69);
                                canvas2.scale(1.0f, -1.0f);
                                org.telegram.ui.ActionBar.i6.x3.b(canvas2, paint2, f69);
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
                                float f71 = this.r;
                                if (f71 > 0.5f) {
                                    float f72 = (f71 - 0.5f) / 0.5f;
                                    f19 = 1.0f - Math.min(1.0f, f72 / 0.5f);
                                    f22 = f72 > 0.5f ? (f72 - 0.5f) / 0.5f : 0.0f;
                                } else {
                                    f22 = 0.0f;
                                    f19 = 1.0f;
                                }
                                paint5.setAlpha(255);
                                f20 = f22;
                            } else {
                                if (this.q != 6) {
                                    paint5.setAlpha((int) ((1.0f - this.r) * 255.0f));
                                } else {
                                    paint5.setAlpha(255);
                                }
                                f19 = 0.0f;
                                f20 = 1.0f;
                            }
                            int dp17 = AndroidUtilities.dp(7.0f) + i15;
                            int dp18 = i20 - AndroidUtilities.dp(3.0f);
                            if (f19 < 1.0f) {
                                i23 = i20;
                                i24 = dp17;
                                f21 = f20;
                                i25 = dp18;
                                canvas.drawLine(dp18 - AndroidUtilities.dp(6.0f), dp17 - AndroidUtilities.dp(6.0f), dp18 - (AndroidUtilities.dp(6.0f) * f19), dp17 - (AndroidUtilities.dp(6.0f) * f19), paint5);
                            } else {
                                i23 = i20;
                                f21 = f20;
                                i24 = dp17;
                                i25 = dp18;
                            }
                            if (f21 > 0.0f) {
                                float f73 = i25;
                                float f74 = i24;
                                canvas2 = canvas;
                                canvas2.drawLine(f73, f74, (AndroidUtilities.dp(12.0f) * f21) + f73, f74 - (AndroidUtilities.dp(12.0f) * f21), paint5);
                            } else {
                                canvas2 = canvas;
                            }
                        } else {
                            i23 = i20;
                        }
                        if (drawable3 != null && drawable3 != drawable4) {
                            int intrinsicWidth = (int) (drawable3.getIntrinsicWidth() * f18);
                            int intrinsicHeight = (int) (drawable3.getIntrinsicHeight() * f18);
                            drawable3.setColorFilter(this.g);
                            drawable3.setAlpha(this.p == this.q ? 255 : (int) ((1.0f - this.r) * 255.0f));
                            int i56 = intrinsicWidth / 2;
                            int i57 = intrinsicHeight / 2;
                            drawable3.setBounds(i23 - i56, i15 - i57, i23 + i56, i57 + i15);
                            drawable3.draw(canvas2);
                        }
                        if (drawable4 != null) {
                            int intrinsicWidth2 = (int) (drawable4.getIntrinsicWidth() * f15);
                            int intrinsicHeight2 = (int) (drawable4.getIntrinsicHeight() * f15);
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
                            float f75 = f18;
                            canvas2.scale(f75, f75);
                            float f76 = (-dp19) / 2;
                            canvas2.translate(f76, f76);
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
                            canvas2.scale(f15, f15);
                            float f77 = (-dp20) / 2;
                            canvas2.translate(f77, f77);
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
                        long j3 = currentTimeMillis - this.t;
                        if (j3 > 17) {
                            j3 = 17;
                        }
                        this.t = currentTimeMillis;
                        int i61 = this.p;
                        if (i61 == 3 || i61 == 14 || ((i61 == 4 && this.q == 14) || i61 == 10 || i61 == 13)) {
                            float f78 = ((360 * j3) / 2500.0f) + this.v;
                            this.v = f78;
                            while (f78 > 360.0f) {
                                f78 -= 360.0f;
                            }
                            this.v = f78;
                            if (this.q != 2) {
                                float f79 = this.w;
                                float f80 = this.y;
                                float f81 = f79 - f80;
                                if (f81 > 0.0f) {
                                    float f82 = this.z + j3;
                                    this.z = f82;
                                    if (f82 >= 200.0f) {
                                        this.x = f79;
                                        this.y = f79;
                                        this.z = 0.0f;
                                    } else {
                                        this.x = (this.i.getInterpolation(f82 / 200.0f) * f81) + f80;
                                    }
                                }
                            }
                            invalidateSelf();
                        }
                        if (this.u) {
                            float f83 = this.r;
                            if (f83 < 1.0f) {
                                float f84 = (j3 / this.k) + f83;
                                this.r = f84;
                                if (f84 >= 1.0f) {
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
                float f582 = dp142;
                float f592 = dp132;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas2.drawLine(dp142 - AndroidUtilities.dp(6.0f), dp132 - AndroidUtilities.dp(6.0f), f582, f592, paint5);
                canvas2 = canvas;
                canvas2.drawLine(f582, f592, AndroidUtilities.dp(12.0f) + dp142, dp132 - AndroidUtilities.dp(12.0f), paint5);
                if (this.p != this.q) {
                }
                if (this.p != 12) {
                }
                a(false);
                int i482 = this.p;
                int i492 = this.q;
                if (i482 == i492) {
                }
                paint5.setAlpha(i482 == i492 ? 255 : (int) (f60 * 255.0f));
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.p != this.q) {
                }
                float dp152 = AndroidUtilities.dp(7.0f) * this.h;
                float f612 = centerX2;
                float f622 = f612 - dp152;
                float f632 = i15;
                float f642 = f632 - dp152;
                float f652 = f612 + dp152;
                float f662 = f632 + dp152;
                canvas2.drawLine(f622, f642, f652, f662, paint5);
                canvas2.drawLine(f652, f642, f622, f662, paint5);
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
                textPaint2.setAlpha((int) (f67 * 255.0f));
                int dp162 = AndroidUtilities.dp(5.0f) + i15;
                f17 = 5.0f;
                int i522 = centerX2 - (this.n / 2);
                rect = bounds;
                f18 = f16;
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
                float f5822 = dp1422;
                float f5922 = dp1322;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas2.drawLine(dp1422 - AndroidUtilities.dp(6.0f), dp1322 - AndroidUtilities.dp(6.0f), f5822, f5922, paint5);
                canvas2 = canvas;
                canvas2.drawLine(f5822, f5922, AndroidUtilities.dp(12.0f) + dp1422, dp1322 - AndroidUtilities.dp(12.0f), paint5);
                if (this.p != this.q) {
                }
                if (this.p != 12) {
                }
                a(false);
                int i4822 = this.p;
                int i4922 = this.q;
                if (i4822 == i4922) {
                }
                paint5.setAlpha(i4822 == i4922 ? 255 : (int) (f60 * 255.0f));
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.p != this.q) {
                }
                float dp1522 = AndroidUtilities.dp(7.0f) * this.h;
                float f6122 = centerX2;
                float f6222 = f6122 - dp1522;
                float f6322 = i15;
                float f6422 = f6322 - dp1522;
                float f6522 = f6122 + dp1522;
                float f6622 = f6322 + dp1522;
                canvas2.drawLine(f6222, f6422, f6522, f6622, paint5);
                canvas2.drawLine(f6522, f6422, f6222, f6622, paint5);
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
                textPaint22.setAlpha((int) (f67 * 255.0f));
                int dp1622 = AndroidUtilities.dp(5.0f) + i15;
                f17 = 5.0f;
                int i5222 = centerX2 - (this.n / 2);
                rect = bounds;
                f18 = f16;
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
            float f85 = this.r;
            if (f85 <= 0.5f) {
                float f86 = 1.0f - (f85 / 0.5f);
                i33 = (int) (f86 * 255.0f);
                f28 = AndroidUtilities.dp(7.0f) * f86 * this.h;
            } else {
                f28 = 0.0f;
                i33 = 0;
            }
            i29 = i33;
            f27 = 0.0f;
            f29 = 0.0f;
            f24 = 0.0f;
            f25 = 1.0f;
        } else {
            if (i63 == 15 || i63 == 0 || i63 == i13 || i63 == 5 || i63 == 8 || i63 == 9 || i63 == 7) {
                i28 = 6;
            } else if (i63 == 6) {
                i28 = 6;
            } else if (i63 == i14) {
                float f87 = 1.0f - this.r;
                f26 = AndroidUtilities.dp(7.0f) * this.h;
                int i64 = (int) (f87 * 255.0f);
                if (this.p == 14) {
                    f27 = bounds.left;
                    centerY2 = bounds.top;
                } else {
                    f27 = bounds.centerX();
                    centerY2 = bounds.centerY();
                }
                f24 = centerY2;
                f23 = 1.0f;
                i29 = i64;
                f25 = f87;
                f28 = f26;
                f29 = 0.0f;
                if (f25 != f23) {
                    canvas2.save();
                    canvas2.scale(f25, f25, f27, f24);
                }
                if (f29 != 0.0f) {
                    canvas2.save();
                    i15 = i12;
                    canvas2.rotate(f29, centerX2, i15);
                } else {
                    i15 = i12;
                }
                if (i29 != 0) {
                    float f88 = i29;
                    paint5.setAlpha((int) (this.o * f88));
                    if (this.p == 14 || this.q == 14) {
                        rectF3 = rectF2;
                        z10 = true;
                        paint3.setAlpha((int) (f88 * this.o));
                        rectF3.set(centerX2 - AndroidUtilities.dp(3.5f), i15 - AndroidUtilities.dp(3.5f), AndroidUtilities.dp(3.5f) + centerX2, AndroidUtilities.dp(3.5f) + i15);
                        canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint3);
                    } else {
                        float f89 = centerX2;
                        RectF rectF6 = rectF2;
                        float f90 = f89 - f28;
                        float f91 = i15;
                        float f92 = f91 - f28;
                        float f93 = f89 + f28;
                        float f94 = f91 + f28;
                        z10 = true;
                        rectF3 = rectF6;
                        canvas2.drawLine(f90, f92, f93, f94, paint5);
                        canvas2.drawLine(f93, f92, f90, f94, paint5);
                    }
                } else {
                    rectF3 = rectF2;
                    z10 = true;
                }
                if (f29 != 0.0f) {
                    canvas2.restore();
                }
                if (f25 != f23) {
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
                    float f58222 = dp14222;
                    float f59222 = dp13222;
                    drawable3 = drawable;
                    drawable4 = drawable2;
                    canvas2.drawLine(dp14222 - AndroidUtilities.dp(6.0f), dp13222 - AndroidUtilities.dp(6.0f), f58222, f59222, paint5);
                    canvas2 = canvas;
                    canvas2.drawLine(f58222, f59222, AndroidUtilities.dp(12.0f) + dp14222, dp13222 - AndroidUtilities.dp(12.0f), paint5);
                    if (this.p != this.q) {
                    }
                    if (this.p != 12) {
                    }
                    a(false);
                    int i48222 = this.p;
                    int i49222 = this.q;
                    if (i48222 == i49222) {
                    }
                    paint5.setAlpha(i48222 == i49222 ? 255 : (int) (f60 * 255.0f));
                    AndroidUtilities.dp(7.0f);
                    AndroidUtilities.dp(3.0f);
                    if (this.p != this.q) {
                    }
                    float dp15222 = AndroidUtilities.dp(7.0f) * this.h;
                    float f61222 = centerX2;
                    float f62222 = f61222 - dp15222;
                    float f63222 = i15;
                    float f64222 = f63222 - dp15222;
                    float f65222 = f61222 + dp15222;
                    float f66222 = f63222 + dp15222;
                    canvas2.drawLine(f62222, f64222, f65222, f66222, paint5);
                    canvas2.drawLine(f65222, f64222, f62222, f66222, paint5);
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
                    textPaint222.setAlpha((int) (f67 * 255.0f));
                    int dp16222 = AndroidUtilities.dp(5.0f) + i15;
                    f17 = 5.0f;
                    int i52222 = centerX2 - (this.n / 2);
                    rect = bounds;
                    f18 = f16;
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
                float f582222 = dp142222;
                float f592222 = dp132222;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas2.drawLine(dp142222 - AndroidUtilities.dp(6.0f), dp132222 - AndroidUtilities.dp(6.0f), f582222, f592222, paint5);
                canvas2 = canvas;
                canvas2.drawLine(f582222, f592222, AndroidUtilities.dp(12.0f) + dp142222, dp132222 - AndroidUtilities.dp(12.0f), paint5);
                if (this.p != this.q) {
                }
                if (this.p != 12) {
                }
                a(false);
                int i482222 = this.p;
                int i492222 = this.q;
                if (i482222 == i492222) {
                }
                paint5.setAlpha(i482222 == i492222 ? 255 : (int) (f60 * 255.0f));
                AndroidUtilities.dp(7.0f);
                AndroidUtilities.dp(3.0f);
                if (this.p != this.q) {
                }
                float dp152222 = AndroidUtilities.dp(7.0f) * this.h;
                float f612222 = centerX2;
                float f622222 = f612222 - dp152222;
                float f632222 = i15;
                float f642222 = f632222 - dp152222;
                float f652222 = f612222 + dp152222;
                float f662222 = f632222 + dp152222;
                canvas2.drawLine(f622222, f642222, f652222, f662222, paint5);
                canvas2.drawLine(f652222, f642222, f622222, f662222, paint5);
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
                textPaint2222.setAlpha((int) (f67 * 255.0f));
                int dp162222 = AndroidUtilities.dp(5.0f) + i15;
                f17 = 5.0f;
                int i522222 = centerX2 - (this.n / 2);
                rect = bounds;
                f18 = f16;
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
                float f95 = this.r;
                float f96 = 1.0f - f95;
                if (this.p == i14) {
                    f33 = f95;
                    f32 = 0.0f;
                } else {
                    f32 = 45.0f * f96;
                    f33 = 1.0f;
                }
                float dp22 = AndroidUtilities.dp(7.0f) * this.h;
                int i65 = (int) (f95 * 255.0f);
                if (this.q == 14) {
                    centerX = bounds.left;
                    centerY = bounds.top;
                } else {
                    centerX = bounds.centerX();
                    centerY = bounds.centerY();
                }
                f24 = centerY;
                float f97 = centerX;
                i29 = i65;
                f27 = f97;
                float f98 = f33;
                f29 = f32;
                f28 = dp22;
                f25 = f98;
            } else {
                f28 = this.h * AndroidUtilities.dp(7.0f);
                f27 = 0.0f;
                f29 = 0.0f;
                f24 = 0.0f;
                f25 = 1.0f;
                i29 = 255;
            }
            if (i63 == i28) {
                f30 = 1.0f;
                f31 = Math.min(1.0f, this.r / 0.5f);
            } else {
                f30 = 1.0f;
                f31 = this.r;
            }
            float f99 = f30 - f31;
            f27 = bounds.centerX();
            float centerY4 = bounds.centerY();
            f26 = AndroidUtilities.dp(7.0f) * f99 * this.h;
            float f100 = f30;
            i29 = (int) (Math.min(f30, f99 * 2.0f) * 255.0f);
            f25 = f99;
            f23 = f100;
            f24 = centerY4;
            f28 = f26;
            f29 = 0.0f;
            if (f25 != f23) {
            }
            if (f29 != 0.0f) {
            }
            if (i29 != 0) {
            }
            if (f29 != 0.0f) {
            }
            if (f25 != f23) {
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
            float f5822222 = dp1422222;
            float f5922222 = dp1322222;
            drawable3 = drawable;
            drawable4 = drawable2;
            canvas2.drawLine(dp1422222 - AndroidUtilities.dp(6.0f), dp1322222 - AndroidUtilities.dp(6.0f), f5822222, f5922222, paint5);
            canvas2 = canvas;
            canvas2.drawLine(f5822222, f5922222, AndroidUtilities.dp(12.0f) + dp1422222, dp1322222 - AndroidUtilities.dp(12.0f), paint5);
            if (this.p != this.q) {
            }
            if (this.p != 12) {
            }
            a(false);
            int i4822222 = this.p;
            int i4922222 = this.q;
            if (i4822222 == i4922222) {
            }
            paint5.setAlpha(i4822222 == i4922222 ? 255 : (int) (f60 * 255.0f));
            AndroidUtilities.dp(7.0f);
            AndroidUtilities.dp(3.0f);
            if (this.p != this.q) {
            }
            float dp1522222 = AndroidUtilities.dp(7.0f) * this.h;
            float f6122222 = centerX2;
            float f6222222 = f6122222 - dp1522222;
            float f6322222 = i15;
            float f6422222 = f6322222 - dp1522222;
            float f6522222 = f6122222 + dp1522222;
            float f6622222 = f6322222 + dp1522222;
            canvas2.drawLine(f6222222, f6422222, f6522222, f6622222, paint5);
            canvas2.drawLine(f6522222, f6422222, f6222222, f6622222, paint5);
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
            textPaint22222.setAlpha((int) (f67 * 255.0f));
            int dp1622222 = AndroidUtilities.dp(5.0f) + i15;
            f17 = 5.0f;
            int i5222222 = centerX2 - (this.n / 2);
            rect = bounds;
            f18 = f16;
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
        f23 = 1.0f;
        if (f25 != f23) {
        }
        if (f29 != 0.0f) {
        }
        if (i29 != 0) {
        }
        if (f29 != 0.0f) {
        }
        if (f25 != f23) {
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
        float f58222222 = dp14222222;
        float f59222222 = dp13222222;
        drawable3 = drawable;
        drawable4 = drawable2;
        canvas2.drawLine(dp14222222 - AndroidUtilities.dp(6.0f), dp13222222 - AndroidUtilities.dp(6.0f), f58222222, f59222222, paint5);
        canvas2 = canvas;
        canvas2.drawLine(f58222222, f59222222, AndroidUtilities.dp(12.0f) + dp14222222, dp13222222 - AndroidUtilities.dp(12.0f), paint5);
        if (this.p != this.q) {
        }
        if (this.p != 12) {
        }
        a(false);
        int i48222222 = this.p;
        int i49222222 = this.q;
        if (i48222222 == i49222222) {
        }
        paint5.setAlpha(i48222222 == i49222222 ? 255 : (int) (f60 * 255.0f));
        AndroidUtilities.dp(7.0f);
        AndroidUtilities.dp(3.0f);
        if (this.p != this.q) {
        }
        float dp15222222 = AndroidUtilities.dp(7.0f) * this.h;
        float f61222222 = centerX2;
        float f62222222 = f61222222 - dp15222222;
        float f63222222 = i15;
        float f64222222 = f63222222 - dp15222222;
        float f65222222 = f61222222 + dp15222222;
        float f66222222 = f63222222 + dp15222222;
        canvas2.drawLine(f62222222, f64222222, f65222222, f66222222, paint5);
        canvas2.drawLine(f65222222, f64222222, f62222222, f66222222, paint5);
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
        textPaint222222.setAlpha((int) (f67 * 255.0f));
        int dp16222222 = AndroidUtilities.dp(5.0f) + i15;
        f17 = 5.0f;
        int i52222222 = centerX2 - (this.n / 2);
        rect = bounds;
        f18 = f16;
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
        bw bwVar = this.A;
        if (bwVar != null) {
            ((View) bwVar.b).invalidate();
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
