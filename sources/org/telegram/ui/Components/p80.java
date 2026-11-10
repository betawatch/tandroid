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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p80 extends Drawable {
    public ax A;
    public org.telegram.ui.ActionBar.u4 B;
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

    public p80() {
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
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        paint2.setColor(-1);
    }

    public final void a(boolean z9) {
        org.telegram.ui.ActionBar.u4 u4Var = this.B;
        if (u4Var == null || !u4Var.l() || this.E) {
            return;
        }
        Rect bounds = getBounds();
        org.telegram.ui.ActionBar.u4 u4Var2 = this.B;
        Shader shader = u4Var2.a;
        Matrix matrix = u4Var2.k;
        matrix.reset();
        this.B.a();
        if (z9) {
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

    public final void c(int i7) {
        int i10 = (-16777216) | i7;
        this.b.setColor(i10);
        this.d.setColor(i10);
        this.e.setColor(i10);
        this.a.setColor(i10);
        this.g = new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY);
    }

    public final void d(int i7, boolean z9) {
        int i10;
        int i11;
        if (this.p == i7 && (i11 = this.q) != i7) {
            this.p = i11;
            this.r = 1.0f;
        }
        if (z9) {
            int i12 = this.p;
            if (i12 == i7 || (i10 = this.q) == i7) {
                return;
            }
            if ((i12 == 0 && i7 == 1) || (i12 == 1 && i7 == 0)) {
                this.k = 300.0f;
            } else if (i12 == 2 && (i7 == 3 || i7 == 14)) {
                this.k = 400.0f;
            } else if (i12 != 4 && i7 == 6) {
                this.k = 360.0f;
            } else if ((i12 == 4 && i7 == 14) || (i12 == 14 && i7 == 4)) {
                this.k = 160.0f;
            } else {
                this.k = 220.0f;
            }
            if (this.u) {
                this.p = i10;
            }
            this.u = true;
            this.q = i7;
            this.s = this.r;
            this.r = 0.0f;
        } else {
            if (this.p == i7) {
                return;
            }
            this.u = false;
            this.q = i7;
            this.p = i7;
            this.s = this.r;
            this.r = 1.0f;
        }
        if (i7 == 3 || i7 == 14) {
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
        float f10;
        int save;
        int i7;
        float f11;
        float f12;
        float L;
        int i10;
        Paint paint;
        int i11;
        RectF rectF;
        float L2;
        float L3;
        float f13;
        float f14;
        float f15;
        float f16;
        RectF rectF2;
        Canvas canvas2;
        int i12;
        int i13;
        int i14;
        int i15;
        float f17;
        float f18;
        int i16;
        Path[] pathArr;
        Path[] pathArr2;
        Drawable drawable;
        int i17;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        float f19;
        Rect rect;
        float f20;
        int i18;
        int i19;
        int i20;
        int i21;
        Paint paint2;
        float interpolation;
        float f21;
        float f22;
        int i22;
        float f23;
        int i23;
        int i24;
        float f24;
        int i25;
        Path path;
        int i26;
        boolean z9;
        int i27;
        float f25;
        float f26;
        int i28;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        float f32;
        float f33;
        float f34;
        float f35;
        float centerX;
        int centerY;
        int centerY2;
        RectF rectF3;
        int i29;
        int i30;
        RectF rectF4;
        int i31;
        int i32;
        int i33;
        Rect bounds = getBounds();
        org.telegram.ui.ActionBar.u4 u4Var = this.B;
        Paint paint3 = this.e;
        Paint paint4 = this.d;
        Paint paint5 = this.b;
        if (u4Var != null && u4Var.l() && !this.E) {
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
        int i34 = this.q;
        if (i34 == 4) {
            int i35 = this.p;
            if (i35 == 3 || i35 == 14) {
                f10 = 1.0f;
                i7 = 0;
            } else {
                save = canvas.save();
                f10 = 1.0f;
                float f36 = 1.0f - this.r;
                canvas.scale(f36, f36, centerX2, centerY3);
                i7 = save;
            }
        } else {
            f10 = 1.0f;
            if ((i34 == 6 || i34 == 10) && this.p == 4) {
                save = canvas.save();
                float f37 = this.r;
                canvas.scale(f37, f37, centerX2, centerY3);
                i7 = save;
            }
            i7 = 0;
        }
        org.telegram.messenger.g0.L(3.0f);
        int i36 = this.p;
        RectF rectF5 = this.f;
        if (i36 == 2 || this.q == 2) {
            a(false);
            float f38 = centerY3;
            float L4 = f38 - (org.telegram.messenger.g0.L(9.0f) * this.h);
            f11 = 0.5f;
            float L5 = (org.telegram.messenger.g0.L(9.0f) * this.h) + f38;
            float L6 = (org.telegram.messenger.g0.L(12.0f) * this.h) + f38;
            int i37 = this.p;
            if ((i37 == 3 || i37 == 14) && this.q == 2) {
                paint5.setAlpha((int) (Math.min(f10, this.r / 0.5f) * 255.0f));
                f12 = this.r;
                L = (org.telegram.messenger.g0.L(12.0f) * this.h) + f38;
            } else {
                int i38 = this.q;
                if (i38 == 3 || i38 == 14 || i38 == 2) {
                    paint5.setAlpha(org.telegram.messenger.qs.e4);
                    f16 = this.r;
                } else {
                    paint5.setAlpha((int) ((1.0f - this.r) * Math.min(1.0f, this.s / 0.5f) * 255.0f));
                    f16 = this.s;
                }
                f12 = f16;
                L = (org.telegram.messenger.g0.L(1.0f) * this.h) + f38;
            }
            if (this.u) {
                int i39 = this.q;
                int i40 = 2;
                if (i39 != 2) {
                    if (f12 <= 0.5f) {
                        i40 = 2;
                    } else {
                        float L7 = org.telegram.messenger.g0.L(13.0f);
                        float f39 = this.h;
                        float L8 = (L7 * f39 * f39) + (this.j ? org.telegram.messenger.g0.L(2.0f) : 0);
                        float f40 = f12 - 0.5f;
                        float f41 = f40 / 0.5f;
                        if (f40 > 0.2f) {
                            f15 = (f40 - 0.2f) / 0.3f;
                            f14 = 1.0f;
                        } else {
                            f14 = f40 / 0.2f;
                            f15 = 0.0f;
                        }
                        float f42 = centerX2;
                        float f43 = L8 / 2.0f;
                        rectF5.set(f42 - L8, L6 - f43, f42, L6 + f43);
                        float f44 = f15 * 100.0f;
                        i10 = i7;
                        paint = paint4;
                        float f45 = f15;
                        L2 = f42;
                        i11 = centerY3;
                        canvas.drawArc(rectF5, f44, (104.0f * f41) - f44, false, paint5);
                        float z10 = com.google.android.recaptcha.internal.a.z(L6, L, f14, L);
                        if (f45 > 0.0f) {
                            float f46 = this.q == 14 ? 0.0f : (-45.0f) * (1.0f - f45);
                            float L9 = org.telegram.messenger.g0.L(7.0f) * f45 * this.h;
                            int i41 = (int) (f45 * 255.0f);
                            int i42 = this.q;
                            if (i42 != 3 && i42 != 14 && i42 != 2) {
                                i41 = (int) (i41 * (1.0f - Math.min(1.0f, this.r / 0.5f)));
                            }
                            int i43 = i41;
                            if (f46 != 0.0f) {
                                canvas.save();
                                canvas.rotate(f46, L2, f38);
                            }
                            if (i43 != 0) {
                                paint5.setAlpha(i43);
                                if (this.q == 14) {
                                    paint3.setAlpha(i43);
                                    rectF5.set(centerX2 - org.telegram.messenger.g0.L(3.5f), i11 - org.telegram.messenger.g0.L(3.5f), org.telegram.messenger.g0.L(3.5f) + centerX2, org.telegram.messenger.g0.L(3.5f) + i11);
                                    canvas.drawRoundRect(rectF5, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paint3);
                                    paint5.setAlpha((int) (i43 * 0.15f));
                                    int L10 = org.telegram.messenger.g0.L(this.j ? 2.0f : 4.0f);
                                    rectF5.set(bounds.left + L10, bounds.top + L10, bounds.right - L10, bounds.bottom - L10);
                                    canvas.drawArc(rectF5, 0.0f, 360.0f, false, paint5);
                                    paint5.setAlpha(i43);
                                } else {
                                    float f47 = L2 - L9;
                                    float f48 = f38 - L9;
                                    float f49 = L2 + L9;
                                    float f50 = L9 + f38;
                                    rectF = rectF5;
                                    canvas.drawLine(f47, f48, f49, f50, paint5);
                                    canvas.drawLine(f49, f48, f47, f50, paint5);
                                    if (f46 != 0.0f) {
                                        canvas.restore();
                                    }
                                }
                            }
                            rectF = rectF5;
                            if (f46 != 0.0f) {
                            }
                        } else {
                            rectF = rectF5;
                        }
                        L4 = z10;
                        L3 = L2;
                        L5 = L6;
                    }
                }
                i10 = i7;
                paint = paint4;
                i11 = centerY3;
                rectF = rectF5;
                if (i39 == i40) {
                    f13 = 1.0f - f12;
                } else {
                    f13 = f12 / 0.5f;
                    f12 = 1.0f - f13;
                }
                float z11 = com.google.android.recaptcha.internal.a.z(L, L4, f13, L4);
                float z12 = com.google.android.recaptcha.internal.a.z(L6, L5, f13, L5);
                float f51 = centerX2;
                float L11 = f51 - ((org.telegram.messenger.g0.L(8.0f) * f12) * this.h);
                L3 = f51 + (org.telegram.messenger.g0.L(8.0f) * f12 * this.h);
                L6 = z12 - ((org.telegram.messenger.g0.L(8.0f) * f12) * this.h);
                L4 = z11;
                L2 = L11;
                L5 = z12;
            } else {
                i10 = i7;
                paint = paint4;
                i11 = centerY3;
                rectF = rectF5;
                float f52 = centerX2;
                L2 = f52 - (org.telegram.messenger.g0.L(8.0f) * this.h);
                L3 = (org.telegram.messenger.g0.L(8.0f) * this.h) + f52;
                L6 = L5 - (org.telegram.messenger.g0.L(8.0f) * this.h);
            }
            float f53 = L3;
            float f54 = L4;
            if (f54 != L5) {
                float f55 = centerX2;
                canvas.drawLine(f55, f54, f55, L5, paint5);
            }
            float f56 = centerX2;
            if (L2 != f56) {
                float f57 = L6;
                canvas.drawLine(L2, f57, f56, L5, paint5);
                canvas.drawLine(f53, f57, f56, L5, paint5);
            }
        } else {
            i10 = i7;
            paint = paint4;
            i11 = centerY3;
            f11 = 0.5f;
            rectF = rectF5;
        }
        int i44 = this.p;
        if (i44 == 3 || i44 == 14) {
            rectF2 = rectF;
            canvas2 = canvas;
            i12 = 1;
            i13 = 4;
        } else {
            i13 = 4;
            if (i44 == 4 && ((i33 = this.q) == 14 || i33 == 3)) {
                rectF2 = rectF;
                canvas2 = canvas;
                i12 = 1;
            } else if (i44 == 10 || this.q == 10 || i44 == 13) {
                int i45 = this.q;
                int i46 = (i45 == 4 || i45 == 6) ? (int) ((1.0f - this.r) * 255.0f) : org.telegram.messenger.qs.e4;
                if (i46 != 0) {
                    a(false);
                    paint5.setAlpha((int) (i46 * this.o));
                    float max = Math.max(4.0f, this.x * 360.0f);
                    int L12 = org.telegram.messenger.g0.L(this.j ? 2.0f : 4.0f);
                    rectF.set(bounds.left + L12, bounds.top + L12, bounds.right - L12, bounds.bottom - L12);
                    canvas2 = canvas;
                    z9 = true;
                    canvas2.drawArc(rectF, this.v, max, false, paint5);
                } else {
                    z9 = true;
                    canvas2 = canvas;
                }
                i14 = i11;
                i15 = this.p;
                if (i15 != this.q) {
                    f17 = 1.0f;
                    f18 = 1.0f;
                } else if (i15 == i13 || i15 == 3 || i15 == 14) {
                    float f58 = this.r;
                    f17 = f58;
                    f18 = 1.0f - f58;
                } else {
                    float min = Math.min(1.0f, this.r / f11);
                    f18 = org.telegram.ui.Cells.f1.v(this.r, f11, 1.0f, 0.0f);
                    f17 = min;
                }
                i16 = this.q;
                if (i16 != 15) {
                    pathArr = org.telegram.ui.ActionBar.m6.a5;
                } else {
                    if (this.p == 15) {
                        pathArr2 = org.telegram.ui.ActionBar.m6.a5;
                        pathArr = null;
                        if (i16 == 5) {
                            pathArr = org.telegram.ui.ActionBar.m6.Z4;
                        } else if (this.p == 5) {
                            pathArr2 = org.telegram.ui.ActionBar.m6.Z4;
                        }
                        Path[] pathArr3 = pathArr;
                        Path[] pathArr4 = pathArr2;
                        if (i16 == 7) {
                            drawable2 = org.telegram.ui.ActionBar.m6.b5;
                            drawable = null;
                            i17 = 8;
                        } else {
                            drawable = this.p == 7 ? org.telegram.ui.ActionBar.m6.b5 : null;
                            i17 = 8;
                            drawable2 = null;
                        }
                        if (i16 == i17) {
                            drawable2 = org.telegram.ui.ActionBar.m6.c5;
                        } else if (this.p == i17) {
                            drawable = org.telegram.ui.ActionBar.m6.c5;
                        }
                        if (this.p != 9 || i16 == 9) {
                            a(false);
                            paint5.setAlpha(this.p == this.q ? org.telegram.messenger.qs.e4 : (int) (this.r * 255.0f));
                            int L13 = org.telegram.messenger.g0.L(7.0f) + i14;
                            int L14 = centerX2 - org.telegram.messenger.g0.L(3.0f);
                            if (this.p != this.q) {
                                canvas2.save();
                                float f59 = this.r;
                                canvas2.scale(f59, f59, centerX2, i14);
                            }
                            float f60 = L14;
                            float f61 = L13;
                            drawable3 = drawable;
                            drawable4 = drawable2;
                            canvas2.drawLine(L14 - org.telegram.messenger.g0.L(6.0f), L13 - org.telegram.messenger.g0.L(6.0f), f60, f61, paint5);
                            canvas2 = canvas;
                            canvas2.drawLine(f60, f61, org.telegram.messenger.g0.L(12.0f) + L14, L13 - org.telegram.messenger.g0.L(12.0f), paint5);
                            if (this.p != this.q) {
                                canvas2.restore();
                            }
                        } else {
                            drawable3 = drawable;
                            drawable4 = drawable2;
                        }
                        if (this.p != 12 || this.q == 12) {
                            a(false);
                            int i47 = this.p;
                            int i48 = this.q;
                            float f62 = i47 == i48 ? 1.0f : i48 == 13 ? this.r : 1.0f - this.r;
                            paint5.setAlpha(i47 == i48 ? org.telegram.messenger.qs.e4 : (int) (f62 * 255.0f));
                            org.telegram.messenger.g0.L(7.0f);
                            org.telegram.messenger.g0.L(3.0f);
                            if (this.p != this.q) {
                                canvas2.save();
                                canvas2.scale(f62, f62, centerX2, i14);
                            }
                            float L15 = org.telegram.messenger.g0.L(7.0f) * this.h;
                            float f63 = centerX2;
                            float f64 = f63 - L15;
                            float f65 = i14;
                            float f66 = f65 - L15;
                            float f67 = f63 + L15;
                            float f68 = f65 + L15;
                            canvas2.drawLine(f64, f66, f67, f68, paint5);
                            canvas2.drawLine(f67, f66, f64, f68, paint5);
                            if (this.p != this.q) {
                                canvas2.restore();
                            }
                        }
                        if (this.p != 13 || this.q == 13) {
                            a(false);
                            int i49 = this.p;
                            int i50 = this.q;
                            float f69 = i49 == i50 ? 1.0f : i50 == 13 ? this.r : 1.0f - this.r;
                            TextPaint textPaint = this.a;
                            textPaint.setAlpha((int) (f69 * 255.0f));
                            int L16 = org.telegram.messenger.g0.L(5.0f) + i14;
                            f19 = 5.0f;
                            int i51 = centerX2 - (this.n / 2);
                            rect = bounds;
                            f20 = f18;
                            if (this.p != this.q) {
                                canvas2.save();
                                canvas2.scale(f69, f69, centerX2, i14);
                            }
                            i18 = (int) (this.x * 100.0f);
                            if (this.m == null && i18 == this.l) {
                                i19 = centerX2;
                            } else {
                                this.l = i18;
                                this.m = String.format("%d%%", Integer.valueOf(i18));
                                i19 = centerX2;
                                this.n = (int) Math.ceil(textPaint.measureText(r2));
                            }
                            canvas2.drawText(this.m, i51, L16, textPaint);
                            if (this.p != this.q) {
                                canvas2.restore();
                            }
                        } else {
                            f19 = 5.0f;
                            rect = bounds;
                            f20 = f18;
                            i19 = centerX2;
                        }
                        i20 = this.p;
                        if (i20 != 0 || i20 == 1 || (i26 = this.q) == 0 || i26 == 1) {
                            if (i20 == 0 || this.q != 1) {
                                if (i20 != 1) {
                                    i21 = 1;
                                } else if (this.q != 0) {
                                    i21 = 1;
                                }
                            }
                            if (this.u) {
                                float f70 = this.q == 0 ? 1.0f - this.r : this.r;
                                i21 = 1;
                                int i52 = this.q;
                                if ((i52 == 0 || i52 == i21) && (i20 == 0 || i20 == i21)) {
                                    paint2 = paint;
                                    paint2.setAlpha(org.telegram.messenger.qs.e4);
                                } else if (i52 == 4) {
                                    paint2 = paint;
                                    paint2.setAlpha((int) ((1.0f - this.r) * 255.0f));
                                } else {
                                    paint2 = paint;
                                    paint2.setAlpha(i20 == i52 ? org.telegram.messenger.qs.e4 : (int) (this.r * 255.0f));
                                }
                                a(true);
                                canvas2.save();
                                canvas2.translate(com.google.android.recaptcha.internal.a.z(1.0f, f70, org.telegram.messenger.g0.L(1.0f), rect.centerX()), rect.centerY());
                                float f71 = f70 * 500.0f;
                                int i53 = this.p;
                                float f72 = i53 == 1 ? 90.0f : 0.0f;
                                if (i53 == 0 && this.q == 1) {
                                    interpolation = f71 < 384.0f ? wq.j.getInterpolation(f71 / 384.0f) * 95.0f : f71 < 484.0f ? 95.0f - (wq.j.getInterpolation((f71 - 384.0f) / 100.0f) * f19) : 90.0f;
                                    f71 += 100.0f;
                                } else {
                                    interpolation = (i53 == 1 && this.q == 0) ? f71 < 100.0f ? (-5.0f) * wq.j.getInterpolation(f71 / 100.0f) : f71 < 484.0f ? (-5.0f) + (wq.j.getInterpolation((f71 - 100.0f) / 384.0f) * 95.0f) : 90.0f : f72;
                                }
                                canvas2.rotate(interpolation);
                                int i54 = this.p;
                                if ((i54 != 0 && i54 != 1) || i54 == 4) {
                                    canvas2.scale(f17, f17);
                                }
                                org.telegram.ui.ActionBar.m6.x3.b(canvas2, paint2, f71);
                                canvas2.scale(1.0f, -1.0f);
                                org.telegram.ui.ActionBar.m6.x3.b(canvas2, paint2, f71);
                                canvas2.restore();
                            } else {
                                i21 = 1;
                            }
                        } else {
                            paint2 = paint;
                        }
                        if (this.p == 6 || this.q == 6) {
                            a(false);
                            if (this.p != 6) {
                                float f73 = this.r;
                                if (f73 > 0.5f) {
                                    float f74 = (f73 - 0.5f) / 0.5f;
                                    f21 = 1.0f - Math.min(1.0f, f74 / 0.5f);
                                    f24 = f74 > 0.5f ? (f74 - 0.5f) / 0.5f : 0.0f;
                                } else {
                                    f24 = 0.0f;
                                    f21 = 1.0f;
                                }
                                paint5.setAlpha(org.telegram.messenger.qs.e4);
                                f22 = f24;
                            } else {
                                if (this.q != 6) {
                                    paint5.setAlpha((int) ((1.0f - this.r) * 255.0f));
                                } else {
                                    paint5.setAlpha(org.telegram.messenger.qs.e4);
                                }
                                f21 = 0.0f;
                                f22 = 1.0f;
                            }
                            int L17 = org.telegram.messenger.g0.L(7.0f) + i14;
                            int L18 = i19 - org.telegram.messenger.g0.L(3.0f);
                            if (f21 < 1.0f) {
                                i22 = i19;
                                i23 = L17;
                                f23 = f22;
                                i24 = L18;
                                canvas.drawLine(L18 - org.telegram.messenger.g0.L(6.0f), L17 - org.telegram.messenger.g0.L(6.0f), L18 - (org.telegram.messenger.g0.L(6.0f) * f21), L17 - (org.telegram.messenger.g0.L(6.0f) * f21), paint5);
                            } else {
                                i22 = i19;
                                f23 = f22;
                                i23 = L17;
                                i24 = L18;
                            }
                            if (f23 > 0.0f) {
                                float f75 = i24;
                                float f76 = i23;
                                canvas2 = canvas;
                                canvas2.drawLine(f75, f76, (org.telegram.messenger.g0.L(12.0f) * f23) + f75, f76 - (org.telegram.messenger.g0.L(12.0f) * f23), paint5);
                            } else {
                                canvas2 = canvas;
                            }
                        } else {
                            i22 = i19;
                        }
                        if (drawable3 != null && drawable3 != drawable4) {
                            int intrinsicWidth = (int) (drawable3.getIntrinsicWidth() * f20);
                            int intrinsicHeight = (int) (drawable3.getIntrinsicHeight() * f20);
                            drawable3.setColorFilter(this.g);
                            drawable3.setAlpha(this.p == this.q ? org.telegram.messenger.qs.e4 : (int) ((1.0f - this.r) * 255.0f));
                            int i55 = intrinsicWidth / 2;
                            int i56 = intrinsicHeight / 2;
                            drawable3.setBounds(i22 - i55, i14 - i56, i22 + i55, i56 + i14);
                            drawable3.draw(canvas2);
                        }
                        if (drawable4 != null) {
                            int intrinsicWidth2 = (int) (drawable4.getIntrinsicWidth() * f17);
                            int intrinsicHeight2 = (int) (drawable4.getIntrinsicHeight() * f17);
                            drawable4.setColorFilter(this.g);
                            drawable4.setAlpha(this.p == this.q ? org.telegram.messenger.qs.e4 : (int) (this.r * 255.0f));
                            int i57 = intrinsicWidth2 / 2;
                            int i58 = intrinsicHeight2 / 2;
                            drawable4.setBounds(i22 - i57, i14 - i58, i22 + i57, i58 + i14);
                            drawable4.draw(canvas2);
                        }
                        Paint paint6 = this.c;
                        if (pathArr4 == null || pathArr4 == pathArr3) {
                            i25 = i22;
                        } else {
                            int L19 = org.telegram.messenger.g0.L(24.0f);
                            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                            paint2.setAlpha(this.p == this.q ? org.telegram.messenger.qs.e4 : (int) ((1.0f - this.r) * 255.0f));
                            a(true);
                            canvas2.save();
                            i25 = i22;
                            canvas2.translate(i25, i14);
                            float f77 = f20;
                            canvas2.scale(f77, f77);
                            float f78 = (-L19) / 2;
                            canvas2.translate(f78, f78);
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
                            int L20 = org.telegram.messenger.g0.L(24.0f);
                            int i59 = this.p == this.q ? org.telegram.messenger.qs.e4 : (int) (this.r * 255.0f);
                            paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                            paint2.setAlpha(i59);
                            a(true);
                            canvas2.save();
                            canvas2.translate(i25, i14);
                            canvas2.scale(f17, f17);
                            float f79 = (-L20) / 2;
                            canvas2.translate(f79, f79);
                            Path path4 = pathArr3[0];
                            if (path4 != null) {
                                canvas2.drawPath(path4, paint2);
                            }
                            if (pathArr3.length >= 3 && (path = pathArr3[2]) != null) {
                                canvas2.drawPath(path, paint5);
                            }
                            Path path5 = pathArr3[1];
                            if (path5 != null) {
                                if (i59 != 255) {
                                    int alpha = paint6.getAlpha();
                                    paint6.setAlpha((int) ((i59 / 255.0f) * alpha));
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
                        int i60 = this.p;
                        if (i60 == 3 || i60 == 14 || ((i60 == 4 && this.q == 14) || i60 == 10 || i60 == 13)) {
                            float f80 = ((360 * j3) / 2500.0f) + this.v;
                            this.v = f80;
                            while (f80 > 360.0f) {
                                f80 -= 360.0f;
                            }
                            this.v = f80;
                            if (this.q != 2) {
                                float f81 = this.w;
                                float f82 = this.y;
                                float f83 = f81 - f82;
                                if (f83 > 0.0f) {
                                    float f84 = this.z + j3;
                                    this.z = f84;
                                    if (f84 >= 200.0f) {
                                        this.x = f81;
                                        this.y = f81;
                                        this.z = 0.0f;
                                    } else {
                                        this.x = (this.i.getInterpolation(f84 / 200.0f) * f83) + f82;
                                    }
                                }
                            }
                            invalidateSelf();
                        }
                        if (this.u) {
                            float f85 = this.r;
                            if (f85 < 1.0f) {
                                float f86 = (j3 / this.k) + f85;
                                this.r = f86;
                                if (f86 >= 1.0f) {
                                    this.p = this.q;
                                    this.r = 1.0f;
                                    this.u = false;
                                }
                                invalidateSelf();
                            }
                        }
                        int i61 = i10;
                        if (i61 >= 1) {
                            canvas2.restoreToCount(i61);
                            return;
                        }
                        return;
                    }
                    pathArr = null;
                }
                pathArr2 = null;
                if (i16 == 5) {
                }
                Path[] pathArr32 = pathArr;
                Path[] pathArr42 = pathArr2;
                if (i16 == 7) {
                }
                if (i16 == i17) {
                }
                if (this.p != 9) {
                }
                a(false);
                paint5.setAlpha(this.p == this.q ? org.telegram.messenger.qs.e4 : (int) (this.r * 255.0f));
                int L132 = org.telegram.messenger.g0.L(7.0f) + i14;
                int L142 = centerX2 - org.telegram.messenger.g0.L(3.0f);
                if (this.p != this.q) {
                }
                float f602 = L142;
                float f612 = L132;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas2.drawLine(L142 - org.telegram.messenger.g0.L(6.0f), L132 - org.telegram.messenger.g0.L(6.0f), f602, f612, paint5);
                canvas2 = canvas;
                canvas2.drawLine(f602, f612, org.telegram.messenger.g0.L(12.0f) + L142, L132 - org.telegram.messenger.g0.L(12.0f), paint5);
                if (this.p != this.q) {
                }
                if (this.p != 12) {
                }
                a(false);
                int i472 = this.p;
                int i482 = this.q;
                if (i472 == i482) {
                }
                paint5.setAlpha(i472 == i482 ? org.telegram.messenger.qs.e4 : (int) (f62 * 255.0f));
                org.telegram.messenger.g0.L(7.0f);
                org.telegram.messenger.g0.L(3.0f);
                if (this.p != this.q) {
                }
                float L152 = org.telegram.messenger.g0.L(7.0f) * this.h;
                float f632 = centerX2;
                float f642 = f632 - L152;
                float f652 = i14;
                float f662 = f652 - L152;
                float f672 = f632 + L152;
                float f682 = f652 + L152;
                canvas2.drawLine(f642, f662, f672, f682, paint5);
                canvas2.drawLine(f672, f662, f642, f682, paint5);
                if (this.p != this.q) {
                }
                if (this.p != 13) {
                }
                a(false);
                int i492 = this.p;
                int i502 = this.q;
                if (i492 == i502) {
                }
                TextPaint textPaint2 = this.a;
                textPaint2.setAlpha((int) (f69 * 255.0f));
                int L162 = org.telegram.messenger.g0.L(5.0f) + i14;
                f19 = 5.0f;
                int i512 = centerX2 - (this.n / 2);
                rect = bounds;
                f20 = f18;
                if (this.p != this.q) {
                }
                i18 = (int) (this.x * 100.0f);
                if (this.m == null) {
                }
                this.l = i18;
                this.m = String.format("%d%%", Integer.valueOf(i18));
                i19 = centerX2;
                this.n = (int) Math.ceil(textPaint2.measureText(r2));
                canvas2.drawText(this.m, i512, L162, textPaint2);
                if (this.p != this.q) {
                }
                i20 = this.p;
                if (i20 != 0) {
                }
                if (i20 == 0) {
                }
                if (i20 != 1) {
                }
            } else {
                canvas2 = canvas;
                i14 = i11;
                i15 = this.p;
                if (i15 != this.q) {
                }
                i16 = this.q;
                if (i16 != 15) {
                }
                pathArr2 = null;
                if (i16 == 5) {
                }
                Path[] pathArr322 = pathArr;
                Path[] pathArr422 = pathArr2;
                if (i16 == 7) {
                }
                if (i16 == i17) {
                }
                if (this.p != 9) {
                }
                a(false);
                paint5.setAlpha(this.p == this.q ? org.telegram.messenger.qs.e4 : (int) (this.r * 255.0f));
                int L1322 = org.telegram.messenger.g0.L(7.0f) + i14;
                int L1422 = centerX2 - org.telegram.messenger.g0.L(3.0f);
                if (this.p != this.q) {
                }
                float f6022 = L1422;
                float f6122 = L1322;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas2.drawLine(L1422 - org.telegram.messenger.g0.L(6.0f), L1322 - org.telegram.messenger.g0.L(6.0f), f6022, f6122, paint5);
                canvas2 = canvas;
                canvas2.drawLine(f6022, f6122, org.telegram.messenger.g0.L(12.0f) + L1422, L1322 - org.telegram.messenger.g0.L(12.0f), paint5);
                if (this.p != this.q) {
                }
                if (this.p != 12) {
                }
                a(false);
                int i4722 = this.p;
                int i4822 = this.q;
                if (i4722 == i4822) {
                }
                paint5.setAlpha(i4722 == i4822 ? org.telegram.messenger.qs.e4 : (int) (f62 * 255.0f));
                org.telegram.messenger.g0.L(7.0f);
                org.telegram.messenger.g0.L(3.0f);
                if (this.p != this.q) {
                }
                float L1522 = org.telegram.messenger.g0.L(7.0f) * this.h;
                float f6322 = centerX2;
                float f6422 = f6322 - L1522;
                float f6522 = i14;
                float f6622 = f6522 - L1522;
                float f6722 = f6322 + L1522;
                float f6822 = f6522 + L1522;
                canvas2.drawLine(f6422, f6622, f6722, f6822, paint5);
                canvas2.drawLine(f6722, f6622, f6422, f6822, paint5);
                if (this.p != this.q) {
                }
                if (this.p != 13) {
                }
                a(false);
                int i4922 = this.p;
                int i5022 = this.q;
                if (i4922 == i5022) {
                }
                TextPaint textPaint22 = this.a;
                textPaint22.setAlpha((int) (f69 * 255.0f));
                int L1622 = org.telegram.messenger.g0.L(5.0f) + i14;
                f19 = 5.0f;
                int i5122 = centerX2 - (this.n / 2);
                rect = bounds;
                f20 = f18;
                if (this.p != this.q) {
                }
                i18 = (int) (this.x * 100.0f);
                if (this.m == null) {
                }
                this.l = i18;
                this.m = String.format("%d%%", Integer.valueOf(i18));
                i19 = centerX2;
                this.n = (int) Math.ceil(textPaint22.measureText(r2));
                canvas2.drawText(this.m, i5122, L1622, textPaint22);
                if (this.p != this.q) {
                }
                i20 = this.p;
                if (i20 != 0) {
                }
                if (i20 == 0) {
                }
                if (i20 != 1) {
                }
            }
        }
        a(false);
        int i62 = this.q;
        if (i62 == 2) {
            float f87 = this.r;
            if (f87 <= f11) {
                float f88 = 1.0f - (f87 / f11);
                i32 = (int) (f88 * 255.0f);
                f30 = org.telegram.messenger.g0.L(7.0f) * f88 * this.h;
            } else {
                f30 = 0.0f;
                i32 = 0;
            }
            i28 = i32;
            f29 = 0.0f;
            f31 = 0.0f;
            f26 = 0.0f;
            f27 = 1.0f;
        } else {
            if (i62 == 15 || i62 == 0 || i62 == i12 || i62 == 5 || i62 == 8 || i62 == 9 || i62 == 7) {
                i27 = 6;
            } else if (i62 == 6) {
                i27 = 6;
            } else if (i62 == i13) {
                float f89 = 1.0f - this.r;
                f28 = org.telegram.messenger.g0.L(7.0f) * this.h;
                int i63 = (int) (f89 * 255.0f);
                if (this.p == 14) {
                    f29 = bounds.left;
                    centerY2 = bounds.top;
                } else {
                    f29 = bounds.centerX();
                    centerY2 = bounds.centerY();
                }
                f26 = centerY2;
                f25 = 1.0f;
                i28 = i63;
                f27 = f89;
                f30 = f28;
                f31 = 0.0f;
                if (f27 != f25) {
                    canvas2.save();
                    canvas2.scale(f27, f27, f29, f26);
                }
                if (f31 != 0.0f) {
                    canvas2.save();
                    i14 = i11;
                    canvas2.rotate(f31, centerX2, i14);
                } else {
                    i14 = i11;
                }
                if (i28 != 0) {
                    float f90 = i28;
                    paint5.setAlpha((int) (this.o * f90));
                    if (this.p == 14 || this.q == 14) {
                        rectF3 = rectF2;
                        z9 = true;
                        paint3.setAlpha((int) (f90 * this.o));
                        rectF3.set(centerX2 - org.telegram.messenger.g0.L(3.5f), i14 - org.telegram.messenger.g0.L(3.5f), org.telegram.messenger.g0.L(3.5f) + centerX2, org.telegram.messenger.g0.L(3.5f) + i14);
                        canvas2.drawRoundRect(rectF3, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), paint3);
                    } else {
                        float f91 = centerX2;
                        RectF rectF6 = rectF2;
                        float f92 = f91 - f30;
                        float f93 = i14;
                        float f94 = f93 - f30;
                        float f95 = f91 + f30;
                        float f96 = f93 + f30;
                        z9 = true;
                        rectF3 = rectF6;
                        canvas2.drawLine(f92, f94, f95, f96, paint5);
                        canvas2.drawLine(f95, f94, f92, f96, paint5);
                    }
                } else {
                    rectF3 = rectF2;
                    z9 = true;
                }
                if (f31 != 0.0f) {
                    canvas2.restore();
                }
                if (f27 != f25) {
                    canvas2.restore();
                }
                i29 = this.p;
                if ((i29 != 3 || i29 == 14 || (i29 == i13 && ((i31 = this.q) == 14 || i31 == 3))) && i28 != 0) {
                    float max2 = Math.max(4.0f, this.x * 360.0f);
                    int L21 = org.telegram.messenger.g0.L(this.j ? 2.0f : 4.0f);
                    rectF3.set(bounds.left + L21, bounds.top + L21, bounds.right - L21, bounds.bottom - L21);
                    i30 = this.p;
                    if (i30 != 14 || (i30 == i13 && this.q == 14)) {
                        paint5.setAlpha((int) (i28 * 0.15f * this.o));
                        rectF4 = rectF3;
                        canvas2.drawArc(rectF4, 0.0f, 360.0f, false, paint5);
                        paint5.setAlpha(i28);
                    } else {
                        rectF4 = rectF3;
                    }
                    canvas2 = canvas;
                    canvas2.drawArc(rectF4, this.v, max2, false, paint5);
                    i15 = this.p;
                    if (i15 != this.q) {
                    }
                    i16 = this.q;
                    if (i16 != 15) {
                    }
                    pathArr2 = null;
                    if (i16 == 5) {
                    }
                    Path[] pathArr3222 = pathArr;
                    Path[] pathArr4222 = pathArr2;
                    if (i16 == 7) {
                    }
                    if (i16 == i17) {
                    }
                    if (this.p != 9) {
                    }
                    a(false);
                    paint5.setAlpha(this.p == this.q ? org.telegram.messenger.qs.e4 : (int) (this.r * 255.0f));
                    int L13222 = org.telegram.messenger.g0.L(7.0f) + i14;
                    int L14222 = centerX2 - org.telegram.messenger.g0.L(3.0f);
                    if (this.p != this.q) {
                    }
                    float f60222 = L14222;
                    float f61222 = L13222;
                    drawable3 = drawable;
                    drawable4 = drawable2;
                    canvas2.drawLine(L14222 - org.telegram.messenger.g0.L(6.0f), L13222 - org.telegram.messenger.g0.L(6.0f), f60222, f61222, paint5);
                    canvas2 = canvas;
                    canvas2.drawLine(f60222, f61222, org.telegram.messenger.g0.L(12.0f) + L14222, L13222 - org.telegram.messenger.g0.L(12.0f), paint5);
                    if (this.p != this.q) {
                    }
                    if (this.p != 12) {
                    }
                    a(false);
                    int i47222 = this.p;
                    int i48222 = this.q;
                    if (i47222 == i48222) {
                    }
                    paint5.setAlpha(i47222 == i48222 ? org.telegram.messenger.qs.e4 : (int) (f62 * 255.0f));
                    org.telegram.messenger.g0.L(7.0f);
                    org.telegram.messenger.g0.L(3.0f);
                    if (this.p != this.q) {
                    }
                    float L15222 = org.telegram.messenger.g0.L(7.0f) * this.h;
                    float f63222 = centerX2;
                    float f64222 = f63222 - L15222;
                    float f65222 = i14;
                    float f66222 = f65222 - L15222;
                    float f67222 = f63222 + L15222;
                    float f68222 = f65222 + L15222;
                    canvas2.drawLine(f64222, f66222, f67222, f68222, paint5);
                    canvas2.drawLine(f67222, f66222, f64222, f68222, paint5);
                    if (this.p != this.q) {
                    }
                    if (this.p != 13) {
                    }
                    a(false);
                    int i49222 = this.p;
                    int i50222 = this.q;
                    if (i49222 == i50222) {
                    }
                    TextPaint textPaint222 = this.a;
                    textPaint222.setAlpha((int) (f69 * 255.0f));
                    int L16222 = org.telegram.messenger.g0.L(5.0f) + i14;
                    f19 = 5.0f;
                    int i51222 = centerX2 - (this.n / 2);
                    rect = bounds;
                    f20 = f18;
                    if (this.p != this.q) {
                    }
                    i18 = (int) (this.x * 100.0f);
                    if (this.m == null) {
                    }
                    this.l = i18;
                    this.m = String.format("%d%%", Integer.valueOf(i18));
                    i19 = centerX2;
                    this.n = (int) Math.ceil(textPaint222.measureText(r2));
                    canvas2.drawText(this.m, i51222, L16222, textPaint222);
                    if (this.p != this.q) {
                    }
                    i20 = this.p;
                    if (i20 != 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i20 != 1) {
                    }
                }
                i15 = this.p;
                if (i15 != this.q) {
                }
                i16 = this.q;
                if (i16 != 15) {
                }
                pathArr2 = null;
                if (i16 == 5) {
                }
                Path[] pathArr32222 = pathArr;
                Path[] pathArr42222 = pathArr2;
                if (i16 == 7) {
                }
                if (i16 == i17) {
                }
                if (this.p != 9) {
                }
                a(false);
                paint5.setAlpha(this.p == this.q ? org.telegram.messenger.qs.e4 : (int) (this.r * 255.0f));
                int L132222 = org.telegram.messenger.g0.L(7.0f) + i14;
                int L142222 = centerX2 - org.telegram.messenger.g0.L(3.0f);
                if (this.p != this.q) {
                }
                float f602222 = L142222;
                float f612222 = L132222;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas2.drawLine(L142222 - org.telegram.messenger.g0.L(6.0f), L132222 - org.telegram.messenger.g0.L(6.0f), f602222, f612222, paint5);
                canvas2 = canvas;
                canvas2.drawLine(f602222, f612222, org.telegram.messenger.g0.L(12.0f) + L142222, L132222 - org.telegram.messenger.g0.L(12.0f), paint5);
                if (this.p != this.q) {
                }
                if (this.p != 12) {
                }
                a(false);
                int i472222 = this.p;
                int i482222 = this.q;
                if (i472222 == i482222) {
                }
                paint5.setAlpha(i472222 == i482222 ? org.telegram.messenger.qs.e4 : (int) (f62 * 255.0f));
                org.telegram.messenger.g0.L(7.0f);
                org.telegram.messenger.g0.L(3.0f);
                if (this.p != this.q) {
                }
                float L152222 = org.telegram.messenger.g0.L(7.0f) * this.h;
                float f632222 = centerX2;
                float f642222 = f632222 - L152222;
                float f652222 = i14;
                float f662222 = f652222 - L152222;
                float f672222 = f632222 + L152222;
                float f682222 = f652222 + L152222;
                canvas2.drawLine(f642222, f662222, f672222, f682222, paint5);
                canvas2.drawLine(f672222, f662222, f642222, f682222, paint5);
                if (this.p != this.q) {
                }
                if (this.p != 13) {
                }
                a(false);
                int i492222 = this.p;
                int i502222 = this.q;
                if (i492222 == i502222) {
                }
                TextPaint textPaint2222 = this.a;
                textPaint2222.setAlpha((int) (f69 * 255.0f));
                int L162222 = org.telegram.messenger.g0.L(5.0f) + i14;
                f19 = 5.0f;
                int i512222 = centerX2 - (this.n / 2);
                rect = bounds;
                f20 = f18;
                if (this.p != this.q) {
                }
                i18 = (int) (this.x * 100.0f);
                if (this.m == null) {
                }
                this.l = i18;
                this.m = String.format("%d%%", Integer.valueOf(i18));
                i19 = centerX2;
                this.n = (int) Math.ceil(textPaint2222.measureText(r2));
                canvas2.drawText(this.m, i512222, L162222, textPaint2222);
                if (this.p != this.q) {
                }
                i20 = this.p;
                if (i20 != 0) {
                }
                if (i20 == 0) {
                }
                if (i20 != 1) {
                }
            } else if (i62 == 14 || i62 == 3) {
                float f97 = this.r;
                float f98 = 1.0f - f97;
                if (this.p == i13) {
                    f35 = f97;
                    f34 = 0.0f;
                } else {
                    f34 = 45.0f * f98;
                    f35 = 1.0f;
                }
                float L22 = org.telegram.messenger.g0.L(7.0f) * this.h;
                int i64 = (int) (f97 * 255.0f);
                if (this.q == 14) {
                    centerX = bounds.left;
                    centerY = bounds.top;
                } else {
                    centerX = bounds.centerX();
                    centerY = bounds.centerY();
                }
                f26 = centerY;
                float f99 = centerX;
                i28 = i64;
                f29 = f99;
                float f100 = f35;
                f31 = f34;
                f30 = L22;
                f27 = f100;
            } else {
                f30 = this.h * org.telegram.messenger.g0.L(7.0f);
                f29 = 0.0f;
                f31 = 0.0f;
                f26 = 0.0f;
                f27 = 1.0f;
                i28 = org.telegram.messenger.qs.e4;
            }
            if (i62 == i27) {
                f32 = 1.0f;
                f33 = Math.min(1.0f, this.r / f11);
            } else {
                f32 = 1.0f;
                f33 = this.r;
            }
            float f101 = f32 - f33;
            f29 = bounds.centerX();
            float centerY4 = bounds.centerY();
            f28 = org.telegram.messenger.g0.L(7.0f) * f101 * this.h;
            float f102 = f32;
            i28 = (int) (Math.min(f32, f101 * 2.0f) * 255.0f);
            f27 = f101;
            f25 = f102;
            f26 = centerY4;
            f30 = f28;
            f31 = 0.0f;
            if (f27 != f25) {
            }
            if (f31 != 0.0f) {
            }
            if (i28 != 0) {
            }
            if (f31 != 0.0f) {
            }
            if (f27 != f25) {
            }
            i29 = this.p;
            if (i29 != 3) {
            }
            float max22 = Math.max(4.0f, this.x * 360.0f);
            int L212 = org.telegram.messenger.g0.L(this.j ? 2.0f : 4.0f);
            rectF3.set(bounds.left + L212, bounds.top + L212, bounds.right - L212, bounds.bottom - L212);
            i30 = this.p;
            if (i30 != 14) {
            }
            paint5.setAlpha((int) (i28 * 0.15f * this.o));
            rectF4 = rectF3;
            canvas2.drawArc(rectF4, 0.0f, 360.0f, false, paint5);
            paint5.setAlpha(i28);
            canvas2 = canvas;
            canvas2.drawArc(rectF4, this.v, max22, false, paint5);
            i15 = this.p;
            if (i15 != this.q) {
            }
            i16 = this.q;
            if (i16 != 15) {
            }
            pathArr2 = null;
            if (i16 == 5) {
            }
            Path[] pathArr322222 = pathArr;
            Path[] pathArr422222 = pathArr2;
            if (i16 == 7) {
            }
            if (i16 == i17) {
            }
            if (this.p != 9) {
            }
            a(false);
            paint5.setAlpha(this.p == this.q ? org.telegram.messenger.qs.e4 : (int) (this.r * 255.0f));
            int L1322222 = org.telegram.messenger.g0.L(7.0f) + i14;
            int L1422222 = centerX2 - org.telegram.messenger.g0.L(3.0f);
            if (this.p != this.q) {
            }
            float f6022222 = L1422222;
            float f6122222 = L1322222;
            drawable3 = drawable;
            drawable4 = drawable2;
            canvas2.drawLine(L1422222 - org.telegram.messenger.g0.L(6.0f), L1322222 - org.telegram.messenger.g0.L(6.0f), f6022222, f6122222, paint5);
            canvas2 = canvas;
            canvas2.drawLine(f6022222, f6122222, org.telegram.messenger.g0.L(12.0f) + L1422222, L1322222 - org.telegram.messenger.g0.L(12.0f), paint5);
            if (this.p != this.q) {
            }
            if (this.p != 12) {
            }
            a(false);
            int i4722222 = this.p;
            int i4822222 = this.q;
            if (i4722222 == i4822222) {
            }
            paint5.setAlpha(i4722222 == i4822222 ? org.telegram.messenger.qs.e4 : (int) (f62 * 255.0f));
            org.telegram.messenger.g0.L(7.0f);
            org.telegram.messenger.g0.L(3.0f);
            if (this.p != this.q) {
            }
            float L1522222 = org.telegram.messenger.g0.L(7.0f) * this.h;
            float f6322222 = centerX2;
            float f6422222 = f6322222 - L1522222;
            float f6522222 = i14;
            float f6622222 = f6522222 - L1522222;
            float f6722222 = f6322222 + L1522222;
            float f6822222 = f6522222 + L1522222;
            canvas2.drawLine(f6422222, f6622222, f6722222, f6822222, paint5);
            canvas2.drawLine(f6722222, f6622222, f6422222, f6822222, paint5);
            if (this.p != this.q) {
            }
            if (this.p != 13) {
            }
            a(false);
            int i4922222 = this.p;
            int i5022222 = this.q;
            if (i4922222 == i5022222) {
            }
            TextPaint textPaint22222 = this.a;
            textPaint22222.setAlpha((int) (f69 * 255.0f));
            int L1622222 = org.telegram.messenger.g0.L(5.0f) + i14;
            f19 = 5.0f;
            int i5122222 = centerX2 - (this.n / 2);
            rect = bounds;
            f20 = f18;
            if (this.p != this.q) {
            }
            i18 = (int) (this.x * 100.0f);
            if (this.m == null) {
            }
            this.l = i18;
            this.m = String.format("%d%%", Integer.valueOf(i18));
            i19 = centerX2;
            this.n = (int) Math.ceil(textPaint22222.measureText(r2));
            canvas2.drawText(this.m, i5122222, L1622222, textPaint22222);
            if (this.p != this.q) {
            }
            i20 = this.p;
            if (i20 != 0) {
            }
            if (i20 == 0) {
            }
            if (i20 != 1) {
            }
        }
        f25 = 1.0f;
        if (f27 != f25) {
        }
        if (f31 != 0.0f) {
        }
        if (i28 != 0) {
        }
        if (f31 != 0.0f) {
        }
        if (f27 != f25) {
        }
        i29 = this.p;
        if (i29 != 3) {
        }
        float max222 = Math.max(4.0f, this.x * 360.0f);
        int L2122 = org.telegram.messenger.g0.L(this.j ? 2.0f : 4.0f);
        rectF3.set(bounds.left + L2122, bounds.top + L2122, bounds.right - L2122, bounds.bottom - L2122);
        i30 = this.p;
        if (i30 != 14) {
        }
        paint5.setAlpha((int) (i28 * 0.15f * this.o));
        rectF4 = rectF3;
        canvas2.drawArc(rectF4, 0.0f, 360.0f, false, paint5);
        paint5.setAlpha(i28);
        canvas2 = canvas;
        canvas2.drawArc(rectF4, this.v, max222, false, paint5);
        i15 = this.p;
        if (i15 != this.q) {
        }
        i16 = this.q;
        if (i16 != 15) {
        }
        pathArr2 = null;
        if (i16 == 5) {
        }
        Path[] pathArr3222222 = pathArr;
        Path[] pathArr4222222 = pathArr2;
        if (i16 == 7) {
        }
        if (i16 == i17) {
        }
        if (this.p != 9) {
        }
        a(false);
        paint5.setAlpha(this.p == this.q ? org.telegram.messenger.qs.e4 : (int) (this.r * 255.0f));
        int L13222222 = org.telegram.messenger.g0.L(7.0f) + i14;
        int L14222222 = centerX2 - org.telegram.messenger.g0.L(3.0f);
        if (this.p != this.q) {
        }
        float f60222222 = L14222222;
        float f61222222 = L13222222;
        drawable3 = drawable;
        drawable4 = drawable2;
        canvas2.drawLine(L14222222 - org.telegram.messenger.g0.L(6.0f), L13222222 - org.telegram.messenger.g0.L(6.0f), f60222222, f61222222, paint5);
        canvas2 = canvas;
        canvas2.drawLine(f60222222, f61222222, org.telegram.messenger.g0.L(12.0f) + L14222222, L13222222 - org.telegram.messenger.g0.L(12.0f), paint5);
        if (this.p != this.q) {
        }
        if (this.p != 12) {
        }
        a(false);
        int i47222222 = this.p;
        int i48222222 = this.q;
        if (i47222222 == i48222222) {
        }
        paint5.setAlpha(i47222222 == i48222222 ? org.telegram.messenger.qs.e4 : (int) (f62 * 255.0f));
        org.telegram.messenger.g0.L(7.0f);
        org.telegram.messenger.g0.L(3.0f);
        if (this.p != this.q) {
        }
        float L15222222 = org.telegram.messenger.g0.L(7.0f) * this.h;
        float f63222222 = centerX2;
        float f64222222 = f63222222 - L15222222;
        float f65222222 = i14;
        float f66222222 = f65222222 - L15222222;
        float f67222222 = f63222222 + L15222222;
        float f68222222 = f65222222 + L15222222;
        canvas2.drawLine(f64222222, f66222222, f67222222, f68222222, paint5);
        canvas2.drawLine(f67222222, f66222222, f64222222, f68222222, paint5);
        if (this.p != this.q) {
        }
        if (this.p != 13) {
        }
        a(false);
        int i49222222 = this.p;
        int i50222222 = this.q;
        if (i49222222 == i50222222) {
        }
        TextPaint textPaint222222 = this.a;
        textPaint222222.setAlpha((int) (f69 * 255.0f));
        int L16222222 = org.telegram.messenger.g0.L(5.0f) + i14;
        f19 = 5.0f;
        int i51222222 = centerX2 - (this.n / 2);
        rect = bounds;
        f20 = f18;
        if (this.p != this.q) {
        }
        i18 = (int) (this.x * 100.0f);
        if (this.m == null) {
        }
        this.l = i18;
        this.m = String.format("%d%%", Integer.valueOf(i18));
        i19 = centerX2;
        this.n = (int) Math.ceil(textPaint222222.measureText(r2));
        canvas2.drawText(this.m, i51222222, L16222222, textPaint222222);
        if (this.p != this.q) {
        }
        i20 = this.p;
        if (i20 != 0) {
        }
        if (i20 == 0) {
        }
        if (i20 != 1) {
        }
    }

    public final void e(boolean z9, float f10) {
        if (this.w == f10) {
            return;
        }
        if (z9) {
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
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return org.telegram.messenger.g0.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        ax axVar = this.A;
        if (axVar != null) {
            ((View) axVar.b).invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i7, int i10, int i11, int i12) {
        super.setBounds(i7, i10, i11, i12);
        float L = (i11 - i7) / org.telegram.messenger.g0.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.b.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
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
    public final void setAlpha(int i7) {
    }
}
