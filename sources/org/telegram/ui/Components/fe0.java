package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fe0 extends FrameLayout {
    public static final float N = org.telegram.messenger.i0.L(20.0f);
    public static final float O = org.telegram.messenger.i0.L(30.0f);
    public static final float P = org.telegram.messenger.i0.L(30.0f);
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public Paint I;
    public Paint J;
    public boolean K;
    public ee0 L;
    public int M;
    public PointF a;
    public float b;
    public float c;
    public pu0 d;
    public PointF e;
    public float f;
    public float h;
    public float n;
    public RectF r;
    public float s;
    public float w;
    public float x;
    public float y;

    public static float a(float f7) {
        return (f7 * 3.1415927f) / 180.0f;
    }

    public static float b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return 0.0f;
        }
        float x10 = motionEvent.getX(0);
        float y3 = motionEvent.getY(0);
        float x11 = x10 - motionEvent.getX(1);
        float y10 = y3 - motionEvent.getY(1);
        return (float) Math.sqrt((y10 * y10) + (x11 * x11));
    }

    private PointF getActualCenterPoint() {
        float width = getWidth();
        pu0 pu0Var = this.d;
        float f7 = pu0Var.a;
        float f10 = (this.e.x * f7) + ((width - f7) / 2.0f);
        int i10 = !this.K ? org.telegram.messenger.i0.m : 0;
        float height = getHeight();
        float f11 = pu0Var.b;
        float B = c3.i0.B(height, f11, 2.0f, i10);
        float f12 = pu0Var.a;
        return new PointF(f10, (this.e.y * f12) + org.telegram.messenger.m5.y(f12, f11, 2.0f, B));
    }

    private float getActualInnerRadius() {
        pu0 pu0Var = this.d;
        return Math.min(pu0Var.a, pu0Var.b) * this.f;
    }

    private float getActualOuterRadius() {
        pu0 pu0Var = this.d;
        return Math.min(pu0Var.a, pu0Var.b) * this.h;
    }

    public final void c(int i10, MotionEvent motionEvent) {
        boolean z10 = this.K;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f7 = x10 - actualCenterPoint.x;
        float f10 = y3 - actualCenterPoint.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        pu0 pu0Var = this.d;
        float min = Math.min(pu0Var.a, pu0Var.b);
        float f11 = this.f * min;
        float f12 = this.h * min;
        float abs = (float) Math.abs((Math.sin(a(this.n) + 1.5707963267948966d) * f10) + (Math.cos(a(this.n) + 1.5707963267948966d) * f7));
        if (i10 == 1) {
            this.s = motionEvent.getX();
            this.w = motionEvent.getY();
            boolean z11 = Math.abs(f12 - f11) < N;
            float f13 = P;
            float f14 = z11 ? 0.0f : f13;
            float f15 = z11 ? 0.0f : f13;
            int i11 = this.H;
            float f16 = O;
            if (i11 != 0) {
                if (i11 == 1) {
                    if (sqrt < f16) {
                        this.M = 2;
                        this.a = actualCenterPoint;
                        return;
                    }
                    if (sqrt > f11 - f13 && sqrt < f14 + f11) {
                        this.M = 3;
                        this.b = sqrt;
                        this.c = f11;
                        return;
                    } else {
                        if (sqrt <= f12 - f15 || sqrt >= f13 + f12) {
                            return;
                        }
                        this.M = 4;
                        this.b = sqrt;
                        this.c = f12;
                        return;
                    }
                }
                return;
            }
            if (sqrt < f16) {
                this.M = 2;
                this.a = actualCenterPoint;
                return;
            }
            float f17 = f11 - f13;
            if (abs > f17 && abs < f14 + f11) {
                this.M = 3;
                this.b = abs;
                this.c = f11;
                return;
            } else if (abs > f12 - f15 && abs < f12 + f13) {
                this.M = 4;
                this.b = abs;
                this.c = f12;
                return;
            } else {
                if (abs <= f17 || abs >= f12 + f13) {
                    this.M = 6;
                    return;
                }
                return;
            }
        }
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                this.M = 1;
                return;
            }
            return;
        }
        int i12 = this.H;
        if (i12 == 0) {
            int c10 = m1.j.c(this.M);
            if (c10 == 1) {
                float f18 = x10 - this.s;
                float f19 = y3 - this.w;
                float width = (getWidth() - pu0Var.a) / 2.0f;
                int i13 = !z10 ? org.telegram.messenger.i0.m : 0;
                float height = getHeight();
                float f20 = pu0Var.b;
                float B = c3.i0.B(height, f20, 2.0f, i13);
                PointF pointF = new PointF(org.telegram.messenger.z20.z(this.a.x, f18, pu0Var.a + width, width), org.telegram.messenger.z20.z(this.a.y, f19, f20 + B, B));
                float f21 = pointF.x - width;
                float f22 = pu0Var.a;
                this.e = new PointF(f21 / f22, (((f22 - pu0Var.b) / 2.0f) + (pointF.y - B)) / f22);
            } else if (c10 == 2) {
                this.f = Math.min(Math.max(0.1f, (this.c + (abs - this.b)) / min), this.h - 0.02f);
            } else if (c10 == 3) {
                this.h = Math.max(this.f + 0.02f, (this.c + (abs - this.b)) / min);
            } else if (c10 == 5) {
                float f23 = x10 - this.s;
                float f24 = y3 - this.w;
                boolean z12 = x10 > actualCenterPoint.x;
                boolean z13 = y3 > actualCenterPoint.y;
                boolean z14 = Math.abs(f24) > Math.abs(f23);
                this.n = (((((float) Math.sqrt((f24 * f24) + (f23 * f23))) * ((((z12 || z13 ? !z12 || z13 ? !(z12 && z13) ? !(!z14 ? f23 < 0.0f : f24 < 0.0f) : !(!z14 ? f23 < 0.0f : f24 > 0.0f) : !z14 ? f23 > 0.0f : f24 > 0.0f : !z14 ? f23 > 0.0f : f24 < 0.0f) ? 0 : 1) * 2) - 1)) / 3.1415927f) / 1.15f) + this.n;
                this.s = x10;
                this.w = y3;
            }
        } else if (i12 == 1) {
            int c11 = m1.j.c(this.M);
            if (c11 == 1) {
                float f25 = x10 - this.s;
                float f26 = y3 - this.w;
                float width2 = (getWidth() - pu0Var.a) / 2.0f;
                int i14 = !z10 ? org.telegram.messenger.i0.m : 0;
                float height2 = getHeight();
                float f27 = pu0Var.b;
                float B2 = c3.i0.B(height2, f27, 2.0f, i14);
                PointF pointF2 = new PointF(org.telegram.messenger.z20.z(this.a.x, f25, pu0Var.a + width2, width2), org.telegram.messenger.z20.z(this.a.y, f26, f27 + B2, B2));
                float f28 = pointF2.x - width2;
                float f29 = pu0Var.a;
                this.e = new PointF(f28 / f29, (((f29 - pu0Var.b) / 2.0f) + (pointF2.y - B2)) / f29);
            } else if (c11 == 2) {
                this.f = Math.min(Math.max(0.1f, (this.c + (sqrt - this.b)) / min), this.h - 0.02f);
            } else if (c11 == 3) {
                this.h = Math.max(this.f + 0.02f, (this.c + (sqrt - this.b)) / min);
            }
        }
        invalidate();
        ee0 ee0Var = this.L;
        if (ee0Var != null) {
            PointF pointF3 = this.e;
            float f30 = this.f;
            float f31 = this.h;
            float a2 = a(this.n) + 1.5707964f;
            oe0 oe0Var = ((ie0) ee0Var).a;
            oe0Var.a0 = f31;
            oe0Var.b0 = pointF3;
            oe0Var.c0 = f30;
            oe0Var.d0 = a2;
            gz gzVar = oe0Var.l0;
            if (gzVar != null) {
                gzVar.c(false, false, false);
            }
        }
    }

    public final void d(int i10, MotionEvent motionEvent) {
        if (i10 == 1) {
            this.x = b(motionEvent);
            this.y = 1.0f;
            this.M = 5;
        } else if (i10 != 2) {
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                this.M = 1;
                return;
            }
            return;
        }
        float b10 = b(motionEvent);
        float c10 = a1.g.c(b10 - this.x, org.telegram.messenger.i0.p, 0.01f, this.y);
        this.y = c10;
        float max = Math.max(0.1f, this.f * c10);
        this.f = max;
        this.h = Math.max(max + 0.02f, this.h * this.y);
        this.y = 1.0f;
        this.x = b10;
        invalidate();
        ee0 ee0Var = this.L;
        if (ee0Var != null) {
            PointF pointF = this.e;
            float f7 = this.f;
            float f10 = this.h;
            float a2 = a(this.n) + 1.5707964f;
            oe0 oe0Var = ((ie0) ee0Var).a;
            oe0Var.a0 = f10;
            oe0Var.b0 = pointF;
            oe0Var.c0 = f7;
            oe0Var.d0 = a2;
            gz gzVar = oe0Var.l0;
            if (gzVar != null) {
                gzVar.c(false, false, false);
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
        int i10 = this.H;
        int i11 = 0;
        if (i10 == 0) {
            canvas2.rotate(this.n);
            float L = org.telegram.messenger.i0.L(6.0f);
            float L2 = org.telegram.messenger.i0.L(12.0f);
            float L3 = org.telegram.messenger.i0.L(1.5f);
            int i12 = 0;
            while (i12 < 30) {
                float f7 = L2 + L;
                float f10 = i12 * f7;
                float f11 = -actualInnerRadius;
                float f12 = f10 + L2;
                float f13 = L3 - actualInnerRadius;
                canvas2.drawRect(f10, f11, f12, f13, paint4);
                float f14 = ((-i12) * f7) - L;
                float f15 = f14 - L2;
                canvas.drawRect(f15, f11, f14, f13, paint4);
                float f16 = L3 + actualInnerRadius;
                float f17 = actualInnerRadius;
                canvas.drawRect(f10, f17, f12, f16, paint4);
                canvas.drawRect(f15, f17, f14, f16, paint4);
                i12++;
                actualInnerRadius = f17;
                canvas2 = canvas;
            }
            float L4 = org.telegram.messenger.i0.L(6.0f);
            while (i11 < 64) {
                float f18 = L4 + L;
                float f19 = i11 * f18;
                float f20 = -actualOuterRadius;
                float f21 = L4 + f19;
                float f22 = L3 - actualOuterRadius;
                canvas.drawRect(f19, f20, f21, f22, paint4);
                float f23 = ((-i11) * f18) - L;
                float f24 = f23 - L4;
                canvas.drawRect(f24, f20, f23, f22, paint4);
                float f25 = L3 + actualOuterRadius;
                float f26 = actualOuterRadius;
                canvas.drawRect(f19, f26, f21, f25, paint4);
                canvas.drawRect(f24, f26, f23, f25, paint4);
                i11++;
                actualOuterRadius = f26;
            }
            paint = paint4;
        } else {
            paint = paint4;
            if (i10 == 1) {
                float f27 = -actualInnerRadius;
                rectF.set(f27, f27, actualInnerRadius, actualInnerRadius);
                int i13 = 0;
                while (i13 < 22) {
                    Paint paint5 = paint3;
                    canvas.drawArc(rectF, i13 * 16.35f, 10.2f, false, paint5);
                    i13++;
                    paint3 = paint5;
                }
                Paint paint6 = paint3;
                float f28 = -actualOuterRadius;
                rectF.set(f28, f28, actualOuterRadius, actualOuterRadius);
                while (i11 < 64) {
                    canvas.drawArc(rectF, 5.62f * i11, 3.6f, false, paint6);
                    i11++;
                }
            }
        }
        canvas.drawCircle(0.0f, 0.0f, org.telegram.messenger.i0.L(8.0f), paint);
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
            float y3 = motionEvent.getY();
            PointF actualCenterPoint = getActualCenterPoint();
            PointF pointF = new PointF(x10 - actualCenterPoint.x, y3 - actualCenterPoint.y);
            float f7 = pointF.x;
            float f10 = pointF.y;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
            float actualInnerRadius = getActualInnerRadius();
            float actualOuterRadius = getActualOuterRadius();
            boolean z10 = Math.abs(actualOuterRadius - actualInnerRadius) < N;
            float f11 = P;
            float f12 = z10 ? 0.0f : f11;
            float f13 = z10 ? 0.0f : f11;
            int i10 = this.H;
            float f14 = O;
            if (i10 == 0) {
                float abs = (float) Math.abs((Math.sin(a(this.n) + 1.5707963267948966d) * pointF.y) + (Math.cos(a(this.n) + 1.5707963267948966d) * pointF.x));
                if (sqrt < f14) {
                    r15 = 1;
                    this.D = true;
                } else {
                    r15 = 1;
                    float f15 = actualInnerRadius - f11;
                    if (abs <= f15 || abs >= actualInnerRadius + f12) {
                        if (abs > actualOuterRadius - f13 && abs < actualOuterRadius + f11) {
                            this.D = true;
                        } else if (abs <= f15 || abs >= actualOuterRadius + f11) {
                            r15 = 1;
                            this.D = true;
                        }
                        r15 = 1;
                    } else {
                        this.D = true;
                    }
                }
            } else {
                boolean z11 = true;
                r15 = z11;
                if (i10 == 1) {
                    if (sqrt < f14) {
                        this.D = true;
                        r15 = z11;
                    } else if (sqrt <= actualInnerRadius - f11 || sqrt >= actualInnerRadius + f12) {
                        r15 = z11;
                        if (sqrt > actualOuterRadius - f13) {
                            r15 = z11;
                            if (sqrt < actualOuterRadius + f11) {
                                this.D = true;
                                r15 = z11;
                            }
                        }
                    } else {
                        this.D = true;
                        r15 = z11;
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

    public void setDelegate(ee0 ee0Var) {
        this.L = ee0Var;
    }

    public void setType(int i10) {
        this.H = i10;
        invalidate();
    }
}
