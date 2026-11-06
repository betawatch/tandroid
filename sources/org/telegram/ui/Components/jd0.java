package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class jd0 extends FrameLayout {
    public static final float N = org.telegram.messenger.g0.L(20.0f);
    public static final float O = org.telegram.messenger.g0.L(30.0f);
    public static final float P = org.telegram.messenger.g0.L(30.0f);
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public Paint I;
    public Paint J;
    public boolean K;
    public id0 L;
    public int M;
    public PointF a;
    public float b;
    public float c;
    public mt0 d;
    public PointF e;
    public float f;
    public float h;
    public float n;
    public RectF r;
    public float s;
    public float w;
    public float x;
    public float y;

    public static float a(float f10) {
        return (f10 * 3.1415927f) / 180.0f;
    }

    public static float b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return 0.0f;
        }
        float x10 = motionEvent.getX(0);
        float y10 = motionEvent.getY(0);
        float x11 = x10 - motionEvent.getX(1);
        float y11 = y10 - motionEvent.getY(1);
        return (float) Math.sqrt((y11 * y11) + (x11 * x11));
    }

    private PointF getActualCenterPoint() {
        float width = getWidth();
        mt0 mt0Var = this.d;
        float f10 = mt0Var.a;
        float f11 = (this.e.x * f10) + ((width - f10) / 2.0f);
        int i7 = !this.K ? org.telegram.messenger.g0.m : 0;
        float height = getHeight();
        float f12 = mt0Var.b;
        float A = com.google.android.recaptcha.internal.a.A(height, f12, 2.0f, i7);
        float f13 = mt0Var.a;
        return new PointF(f11, (this.e.y * f13) + org.telegram.messenger.k5.y(f13, f12, 2.0f, A));
    }

    private float getActualInnerRadius() {
        mt0 mt0Var = this.d;
        return Math.min(mt0Var.a, mt0Var.b) * this.f;
    }

    private float getActualOuterRadius() {
        mt0 mt0Var = this.d;
        return Math.min(mt0Var.a, mt0Var.b) * this.h;
    }

    public final void c(int i7, MotionEvent motionEvent) {
        boolean z9 = this.K;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f10 = x10 - actualCenterPoint.x;
        float f11 = y10 - actualCenterPoint.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        mt0 mt0Var = this.d;
        float min = Math.min(mt0Var.a, mt0Var.b);
        float f12 = this.f * min;
        float f13 = this.h * min;
        float abs = (float) Math.abs((Math.sin(a(this.n) + 1.5707963267948966d) * f11) + (Math.cos(a(this.n) + 1.5707963267948966d) * f10));
        if (i7 == 1) {
            this.s = motionEvent.getX();
            this.w = motionEvent.getY();
            boolean z10 = Math.abs(f13 - f12) < N;
            float f14 = P;
            float f15 = z10 ? 0.0f : f14;
            float f16 = z10 ? 0.0f : f14;
            int i10 = this.H;
            float f17 = O;
            if (i10 != 0) {
                if (i10 == 1) {
                    if (sqrt < f17) {
                        this.M = 2;
                        this.a = actualCenterPoint;
                        return;
                    }
                    if (sqrt > f12 - f14 && sqrt < f15 + f12) {
                        this.M = 3;
                        this.b = sqrt;
                        this.c = f12;
                        return;
                    } else {
                        if (sqrt <= f13 - f16 || sqrt >= f14 + f13) {
                            return;
                        }
                        this.M = 4;
                        this.b = sqrt;
                        this.c = f13;
                        return;
                    }
                }
                return;
            }
            if (sqrt < f17) {
                this.M = 2;
                this.a = actualCenterPoint;
                return;
            }
            float f18 = f12 - f14;
            if (abs > f18 && abs < f15 + f12) {
                this.M = 3;
                this.b = abs;
                this.c = f12;
                return;
            } else if (abs > f13 - f16 && abs < f13 + f14) {
                this.M = 4;
                this.b = abs;
                this.c = f13;
                return;
            } else {
                if (abs <= f18 || abs >= f13 + f14) {
                    this.M = 6;
                    return;
                }
                return;
            }
        }
        if (i7 != 2) {
            if (i7 == 3 || i7 == 4 || i7 == 5) {
                this.M = 1;
                return;
            }
            return;
        }
        int i11 = this.H;
        if (i11 == 0) {
            int c10 = p1.g.c(this.M);
            if (c10 == 1) {
                float f19 = x10 - this.s;
                float f20 = y10 - this.w;
                float width = (getWidth() - mt0Var.a) / 2.0f;
                int i12 = !z9 ? org.telegram.messenger.g0.m : 0;
                float height = getHeight();
                float f21 = mt0Var.b;
                float A = com.google.android.recaptcha.internal.a.A(height, f21, 2.0f, i12);
                PointF pointF = new PointF(org.telegram.messenger.camera.q.z(this.a.x, f19, mt0Var.a + width, width), org.telegram.messenger.camera.q.z(this.a.y, f20, f21 + A, A));
                float f22 = pointF.x - width;
                float f23 = mt0Var.a;
                this.e = new PointF(f22 / f23, (((f23 - mt0Var.b) / 2.0f) + (pointF.y - A)) / f23);
            } else if (c10 == 2) {
                this.f = Math.min(Math.max(0.1f, (this.c + (abs - this.b)) / min), this.h - 0.02f);
            } else if (c10 == 3) {
                this.h = Math.max(this.f + 0.02f, (this.c + (abs - this.b)) / min);
            } else if (c10 == 5) {
                float f24 = x10 - this.s;
                float f25 = y10 - this.w;
                boolean z11 = x10 > actualCenterPoint.x;
                boolean z12 = y10 > actualCenterPoint.y;
                boolean z13 = Math.abs(f25) > Math.abs(f24);
                this.n = (((((float) Math.sqrt((f25 * f25) + (f24 * f24))) * ((((z11 || z12 ? !z11 || z12 ? !(z11 && z12) ? !(!z13 ? f24 < 0.0f : f25 < 0.0f) : !(!z13 ? f24 < 0.0f : f25 > 0.0f) : !z13 ? f24 > 0.0f : f25 > 0.0f : !z13 ? f24 > 0.0f : f25 < 0.0f) ? 0 : 1) * 2) - 1)) / 3.1415927f) / 1.15f) + this.n;
                this.s = x10;
                this.w = y10;
            }
        } else if (i11 == 1) {
            int c11 = p1.g.c(this.M);
            if (c11 == 1) {
                float f26 = x10 - this.s;
                float f27 = y10 - this.w;
                float width2 = (getWidth() - mt0Var.a) / 2.0f;
                int i13 = !z9 ? org.telegram.messenger.g0.m : 0;
                float height2 = getHeight();
                float f28 = mt0Var.b;
                float A2 = com.google.android.recaptcha.internal.a.A(height2, f28, 2.0f, i13);
                PointF pointF2 = new PointF(org.telegram.messenger.camera.q.z(this.a.x, f26, mt0Var.a + width2, width2), org.telegram.messenger.camera.q.z(this.a.y, f27, f28 + A2, A2));
                float f29 = pointF2.x - width2;
                float f30 = mt0Var.a;
                this.e = new PointF(f29 / f30, (((f30 - mt0Var.b) / 2.0f) + (pointF2.y - A2)) / f30);
            } else if (c11 == 2) {
                this.f = Math.min(Math.max(0.1f, (this.c + (sqrt - this.b)) / min), this.h - 0.02f);
            } else if (c11 == 3) {
                this.h = Math.max(this.f + 0.02f, (this.c + (sqrt - this.b)) / min);
            }
        }
        invalidate();
        id0 id0Var = this.L;
        if (id0Var != null) {
            PointF pointF3 = this.e;
            float f31 = this.f;
            float f32 = this.h;
            float a10 = a(this.n) + 1.5707964f;
            sd0 sd0Var = ((md0) id0Var).a;
            sd0Var.a0 = f32;
            sd0Var.b0 = pointF3;
            sd0Var.c0 = f31;
            sd0Var.d0 = a10;
            ry ryVar = sd0Var.l0;
            if (ryVar != null) {
                ryVar.c(false, false, false);
            }
        }
    }

    public final void d(int i7, MotionEvent motionEvent) {
        if (i7 == 1) {
            this.x = b(motionEvent);
            this.y = 1.0f;
            this.M = 5;
        } else if (i7 != 2) {
            if (i7 == 3 || i7 == 4 || i7 == 5) {
                this.M = 1;
                return;
            }
            return;
        }
        float b10 = b(motionEvent);
        float c10 = com.google.android.recaptcha.internal.a.c(b10 - this.x, org.telegram.messenger.g0.p, 0.01f, this.y);
        this.y = c10;
        float max = Math.max(0.1f, this.f * c10);
        this.f = max;
        this.h = Math.max(max + 0.02f, this.h * this.y);
        this.y = 1.0f;
        this.x = b10;
        invalidate();
        id0 id0Var = this.L;
        if (id0Var != null) {
            PointF pointF = this.e;
            float f10 = this.f;
            float f11 = this.h;
            float a10 = a(this.n) + 1.5707964f;
            sd0 sd0Var = ((md0) id0Var).a;
            sd0Var.a0 = f11;
            sd0Var.b0 = pointF;
            sd0Var.c0 = f10;
            sd0Var.d0 = a10;
            ry ryVar = sd0Var.l0;
            if (ryVar != null) {
                ryVar.c(false, false, false);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Paint paint2 = this.J;
        RectF rectF = this.r;
        Paint paint3 = paint2;
        Paint paint4 = this.I;
        super.onDraw(canvas);
        PointF actualCenterPoint = getActualCenterPoint();
        float actualInnerRadius = getActualInnerRadius();
        float actualOuterRadius = getActualOuterRadius();
        canvas2.translate(actualCenterPoint.x, actualCenterPoint.y);
        int i7 = this.H;
        int i10 = 0;
        if (i7 == 0) {
            canvas2.rotate(this.n);
            float L = org.telegram.messenger.g0.L(6.0f);
            float L2 = org.telegram.messenger.g0.L(12.0f);
            float L3 = org.telegram.messenger.g0.L(1.5f);
            int i11 = 0;
            while (i11 < 30) {
                float f10 = L2 + L;
                float f11 = i11 * f10;
                float f12 = -actualInnerRadius;
                float f13 = f11 + L2;
                float f14 = L3 - actualInnerRadius;
                canvas2.drawRect(f11, f12, f13, f14, paint4);
                float f15 = ((-i11) * f10) - L;
                float f16 = f15 - L2;
                canvas.drawRect(f16, f12, f15, f14, paint4);
                float f17 = L3 + actualInnerRadius;
                float f18 = actualInnerRadius;
                canvas.drawRect(f11, f18, f13, f17, paint4);
                canvas.drawRect(f16, f18, f15, f17, paint4);
                i11++;
                actualInnerRadius = f18;
                canvas2 = canvas;
            }
            float L4 = org.telegram.messenger.g0.L(6.0f);
            while (i10 < 64) {
                float f19 = L4 + L;
                float f20 = i10 * f19;
                float f21 = -actualOuterRadius;
                float f22 = L4 + f20;
                float f23 = L3 - actualOuterRadius;
                canvas.drawRect(f20, f21, f22, f23, paint4);
                float f24 = ((-i10) * f19) - L;
                float f25 = f24 - L4;
                canvas.drawRect(f25, f21, f24, f23, paint4);
                float f26 = L3 + actualOuterRadius;
                float f27 = actualOuterRadius;
                canvas.drawRect(f20, f27, f22, f26, paint4);
                canvas.drawRect(f25, f27, f24, f26, paint4);
                i10++;
                actualOuterRadius = f27;
            }
            paint = paint4;
        } else {
            paint = paint4;
            if (i7 == 1) {
                float f28 = -actualInnerRadius;
                rectF.set(f28, f28, actualInnerRadius, actualInnerRadius);
                int i12 = 0;
                while (i12 < 22) {
                    Paint paint5 = paint3;
                    canvas.drawArc(rectF, i12 * 16.35f, 10.2f, false, paint5);
                    i12++;
                    paint3 = paint5;
                }
                Paint paint6 = paint3;
                float f29 = -actualOuterRadius;
                rectF.set(f29, f29, actualOuterRadius, actualOuterRadius);
                while (i10 < 64) {
                    canvas.drawArc(rectF, 5.62f * i10, 3.6f, false, paint6);
                    i10++;
                }
            }
        }
        canvas.drawCircle(0.0f, 0.0f, org.telegram.messenger.g0.L(8.0f), paint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r2 != 6) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ?? r15;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                        }
                    }
                } else {
                    if (this.D) {
                        c(2, motionEvent);
                        return true;
                    }
                    if (this.E) {
                        d(2, motionEvent);
                        return true;
                    }
                }
                return true;
            }
            if (this.D) {
                c(3, motionEvent);
                this.D = false;
            } else if (this.E) {
                this.M = 1;
                this.E = false;
            }
            this.F = true;
            this.G = true;
            return true;
        }
        if (motionEvent.getPointerCount() != 1) {
            if (this.D) {
                c(3, motionEvent);
                this.F = true;
                this.D = false;
            }
            if (motionEvent.getPointerCount() != 2) {
                this.M = 1;
                this.G = true;
                this.E = false;
                return true;
            }
            if (!this.G || this.E) {
                return true;
            }
            d(1, motionEvent);
            this.E = true;
            return true;
        }
        if (this.F && !this.D) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            PointF actualCenterPoint = getActualCenterPoint();
            PointF pointF = new PointF(x10 - actualCenterPoint.x, y10 - actualCenterPoint.y);
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
            float actualInnerRadius = getActualInnerRadius();
            float actualOuterRadius = getActualOuterRadius();
            boolean z9 = Math.abs(actualOuterRadius - actualInnerRadius) < N;
            float f12 = P;
            float f13 = z9 ? 0.0f : f12;
            float f14 = z9 ? 0.0f : f12;
            int i7 = this.H;
            float f15 = O;
            if (i7 == 0) {
                float abs = (float) Math.abs((Math.sin(a(this.n) + 1.5707963267948966d) * pointF.y) + (Math.cos(a(this.n) + 1.5707963267948966d) * pointF.x));
                if (sqrt < f15) {
                    r15 = 1;
                    this.D = true;
                } else {
                    r15 = 1;
                    float f16 = actualInnerRadius - f12;
                    if (abs <= f16 || abs >= actualInnerRadius + f13) {
                        if (abs > actualOuterRadius - f14 && abs < actualOuterRadius + f12) {
                            this.D = true;
                        } else if (abs <= f16 || abs >= actualOuterRadius + f12) {
                            r15 = 1;
                            this.D = true;
                        }
                        r15 = 1;
                    } else {
                        this.D = true;
                    }
                }
            } else {
                boolean z10 = true;
                r15 = z10;
                if (i7 == 1) {
                    if (sqrt < f15) {
                        this.D = true;
                        r15 = z10;
                    } else if (sqrt <= actualInnerRadius - f12 || sqrt >= actualInnerRadius + f13) {
                        r15 = z10;
                        if (sqrt > actualOuterRadius - f14) {
                            r15 = z10;
                            if (sqrt < actualOuterRadius + f12) {
                                this.D = true;
                                r15 = z10;
                            }
                        }
                    } else {
                        this.D = true;
                        r15 = z10;
                    }
                }
            }
            this.F = false;
            if (!this.D) {
                return r15;
            }
            c(r15, motionEvent);
            return r15;
        }
        return true;
    }

    public void setDelegate(id0 id0Var) {
        this.L = id0Var;
    }

    public void setType(int i7) {
        this.H = i7;
        invalidate();
    }
}
