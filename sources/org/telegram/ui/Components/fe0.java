package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class fe0 extends FrameLayout {
    public static final float J = AndroidUtilities.dp(20.0f);
    public static final float K = AndroidUtilities.dp(30.0f);
    public static final float L = AndroidUtilities.dp(30.0f);
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public Paint E;
    public Paint F;
    public boolean G;
    public ee0 H;
    public int I;
    public PointF a;
    public float b;
    public float c;
    public qu0 d;
    public PointF e;
    public float f;
    public float h;
    public float n;
    public RectF r;
    public float s;
    public float v;
    public float w;
    public float x;
    public boolean y;

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
        qu0 qu0Var = this.d;
        float f10 = qu0Var.a;
        float f11 = (this.e.x * f10) + ((width - f10) / 2.0f);
        int i9 = !this.G ? AndroidUtilities.statusBarHeight : 0;
        float height = getHeight();
        float f12 = qu0Var.b;
        float A = e2.c.A(height, f12, 2.0f, i9);
        float f13 = qu0Var.a;
        return new PointF(f11, (this.e.y * f13) + org.telegram.messenger.l0.a(f13, f12, 2.0f, A));
    }

    private float getActualInnerRadius() {
        qu0 qu0Var = this.d;
        return Math.min(qu0Var.a, qu0Var.b) * this.f;
    }

    private float getActualOuterRadius() {
        qu0 qu0Var = this.d;
        return Math.min(qu0Var.a, qu0Var.b) * this.h;
    }

    public final void c(int i9, MotionEvent motionEvent) {
        boolean z10 = this.G;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f10 = x10 - actualCenterPoint.x;
        float f11 = y10 - actualCenterPoint.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        qu0 qu0Var = this.d;
        float min = Math.min(qu0Var.a, qu0Var.b);
        float f12 = this.f * min;
        float f13 = this.h * min;
        float abs = (float) Math.abs((Math.sin(a(this.n) + 1.5707963267948966d) * f11) + (Math.cos(a(this.n) + 1.5707963267948966d) * f10));
        if (i9 == 1) {
            this.s = motionEvent.getX();
            this.v = motionEvent.getY();
            boolean z11 = Math.abs(f13 - f12) < J;
            float f14 = L;
            float f15 = z11 ? 0.0f : f14;
            float f16 = z11 ? 0.0f : f14;
            int i10 = this.D;
            float f17 = K;
            if (i10 != 0) {
                if (i10 == 1) {
                    if (sqrt < f17) {
                        this.I = 2;
                        this.a = actualCenterPoint;
                        return;
                    }
                    if (sqrt > f12 - f14 && sqrt < f15 + f12) {
                        this.I = 3;
                        this.b = sqrt;
                        this.c = f12;
                        return;
                    } else {
                        if (sqrt <= f13 - f16 || sqrt >= f14 + f13) {
                            return;
                        }
                        this.I = 4;
                        this.b = sqrt;
                        this.c = f13;
                        return;
                    }
                }
                return;
            }
            if (sqrt < f17) {
                this.I = 2;
                this.a = actualCenterPoint;
                return;
            }
            float f18 = f12 - f14;
            if (abs > f18 && abs < f15 + f12) {
                this.I = 3;
                this.b = abs;
                this.c = f12;
                return;
            } else if (abs > f13 - f16 && abs < f13 + f14) {
                this.I = 4;
                this.b = abs;
                this.c = f13;
                return;
            } else {
                if (abs <= f18 || abs >= f13 + f14) {
                    this.I = 6;
                    return;
                }
                return;
            }
        }
        if (i9 != 2) {
            if (i9 == 3 || i9 == 4 || i9 == 5) {
                this.I = 1;
                return;
            }
            return;
        }
        int i11 = this.D;
        if (i11 == 0) {
            int b10 = m1.j.b(this.I);
            if (b10 == 1) {
                float f19 = x10 - this.s;
                float f20 = y10 - this.v;
                float width = (getWidth() - qu0Var.a) / 2.0f;
                int i12 = !z10 ? AndroidUtilities.statusBarHeight : 0;
                float height = getHeight();
                float f21 = qu0Var.b;
                float A = e2.c.A(height, f21, 2.0f, i12);
                PointF pointF = new PointF(Math.max(width, Math.min(qu0Var.a + width, this.a.x + f19)), Math.max(A, Math.min(f21 + A, this.a.y + f20)));
                float f22 = pointF.x - width;
                float f23 = qu0Var.a;
                this.e = new PointF(f22 / f23, (((f23 - qu0Var.b) / 2.0f) + (pointF.y - A)) / f23);
            } else if (b10 == 2) {
                this.f = Math.min(Math.max(0.1f, (this.c + (abs - this.b)) / min), this.h - 0.02f);
            } else if (b10 == 3) {
                this.h = Math.max(this.f + 0.02f, (this.c + (abs - this.b)) / min);
            } else if (b10 == 5) {
                float f24 = x10 - this.s;
                float f25 = y10 - this.v;
                boolean z12 = x10 > actualCenterPoint.x;
                boolean z13 = y10 > actualCenterPoint.y;
                boolean z14 = Math.abs(f25) > Math.abs(f24);
                this.n = (((((float) Math.sqrt((f25 * f25) + (f24 * f24))) * ((((z12 || z13 ? !z12 || z13 ? !(z12 && z13) ? !(!z14 ? f24 < 0.0f : f25 < 0.0f) : !(!z14 ? f24 < 0.0f : f25 > 0.0f) : !z14 ? f24 > 0.0f : f25 > 0.0f : !z14 ? f24 > 0.0f : f25 < 0.0f) ? 0 : 1) * 2) - 1)) / 3.1415927f) / 1.15f) + this.n;
                this.s = x10;
                this.v = y10;
            }
        } else if (i11 == 1) {
            int b11 = m1.j.b(this.I);
            if (b11 == 1) {
                float f26 = x10 - this.s;
                float f27 = y10 - this.v;
                float width2 = (getWidth() - qu0Var.a) / 2.0f;
                int i13 = !z10 ? AndroidUtilities.statusBarHeight : 0;
                float height2 = getHeight();
                float f28 = qu0Var.b;
                float A2 = e2.c.A(height2, f28, 2.0f, i13);
                PointF pointF2 = new PointF(Math.max(width2, Math.min(qu0Var.a + width2, this.a.x + f26)), Math.max(A2, Math.min(f28 + A2, this.a.y + f27)));
                float f29 = pointF2.x - width2;
                float f30 = qu0Var.a;
                this.e = new PointF(f29 / f30, (((f30 - qu0Var.b) / 2.0f) + (pointF2.y - A2)) / f30);
            } else if (b11 == 2) {
                this.f = Math.min(Math.max(0.1f, (this.c + (sqrt - this.b)) / min), this.h - 0.02f);
            } else if (b11 == 3) {
                this.h = Math.max(this.f + 0.02f, (this.c + (sqrt - this.b)) / min);
            }
        }
        invalidate();
        ee0 ee0Var = this.H;
        if (ee0Var != null) {
            PointF pointF3 = this.e;
            float f31 = this.f;
            float f32 = this.h;
            float a2 = a(this.n) + 1.5707964f;
            qe0 qe0Var = ((ie0) ee0Var).a;
            qe0Var.T = f32;
            qe0Var.U = pointF3;
            qe0Var.V = f31;
            qe0Var.W = a2;
            hz hzVar = qe0Var.h0;
            if (hzVar != null) {
                hzVar.e(false, false, false);
            }
        }
    }

    public final void d(int i9, MotionEvent motionEvent) {
        if (i9 == 1) {
            this.w = b(motionEvent);
            this.x = 1.0f;
            this.I = 5;
        } else if (i9 != 2) {
            if (i9 == 3 || i9 == 4 || i9 == 5) {
                this.I = 1;
                return;
            }
            return;
        }
        float b10 = b(motionEvent);
        float b11 = org.telegram.ui.Cells.j2.b(b10 - this.w, AndroidUtilities.density, 0.01f, this.x);
        this.x = b11;
        float max = Math.max(0.1f, this.f * b11);
        this.f = max;
        this.h = Math.max(max + 0.02f, this.h * this.x);
        this.x = 1.0f;
        this.w = b10;
        invalidate();
        ee0 ee0Var = this.H;
        if (ee0Var != null) {
            PointF pointF = this.e;
            float f10 = this.f;
            float f11 = this.h;
            float a2 = a(this.n) + 1.5707964f;
            qe0 qe0Var = ((ie0) ee0Var).a;
            qe0Var.T = f11;
            qe0Var.U = pointF;
            qe0Var.V = f10;
            qe0Var.W = a2;
            hz hzVar = qe0Var.h0;
            if (hzVar != null) {
                hzVar.e(false, false, false);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Paint paint2 = this.F;
        RectF rectF = this.r;
        Paint paint3 = paint2;
        Paint paint4 = this.E;
        super.onDraw(canvas);
        PointF actualCenterPoint = getActualCenterPoint();
        float actualInnerRadius = getActualInnerRadius();
        float actualOuterRadius = getActualOuterRadius();
        canvas2.translate(actualCenterPoint.x, actualCenterPoint.y);
        int i9 = this.D;
        int i10 = 0;
        if (i9 == 0) {
            canvas2.rotate(this.n);
            float dp = AndroidUtilities.dp(6.0f);
            float dp2 = AndroidUtilities.dp(12.0f);
            float dp3 = AndroidUtilities.dp(1.5f);
            int i11 = 0;
            while (i11 < 30) {
                float f10 = dp2 + dp;
                float f11 = i11 * f10;
                float f12 = -actualInnerRadius;
                float f13 = f11 + dp2;
                float f14 = dp3 - actualInnerRadius;
                canvas2.drawRect(f11, f12, f13, f14, paint4);
                float f15 = ((-i11) * f10) - dp;
                float f16 = f15 - dp2;
                canvas.drawRect(f16, f12, f15, f14, paint4);
                float f17 = dp3 + actualInnerRadius;
                float f18 = actualInnerRadius;
                canvas.drawRect(f11, f18, f13, f17, paint4);
                canvas.drawRect(f16, f18, f15, f17, paint4);
                i11++;
                actualInnerRadius = f18;
                canvas2 = canvas;
            }
            float dp4 = AndroidUtilities.dp(6.0f);
            while (i10 < 64) {
                float f19 = dp4 + dp;
                float f20 = i10 * f19;
                float f21 = -actualOuterRadius;
                float f22 = dp4 + f20;
                float f23 = dp3 - actualOuterRadius;
                canvas.drawRect(f20, f21, f22, f23, paint4);
                float f24 = ((-i10) * f19) - dp;
                float f25 = f24 - dp4;
                canvas.drawRect(f25, f21, f24, f23, paint4);
                float f26 = dp3 + actualOuterRadius;
                float f27 = actualOuterRadius;
                canvas.drawRect(f20, f27, f22, f26, paint4);
                canvas.drawRect(f25, f27, f24, f26, paint4);
                i10++;
                actualOuterRadius = f27;
            }
            paint = paint4;
        } else {
            paint = paint4;
            if (i9 == 1) {
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
        canvas.drawCircle(0.0f, 0.0f, AndroidUtilities.dp(8.0f), paint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r2 != 6) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
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
                    if (this.y) {
                        c(2, motionEvent);
                        return true;
                    }
                    if (this.A) {
                        d(2, motionEvent);
                        return true;
                    }
                }
                return true;
            }
            if (this.y) {
                c(3, motionEvent);
                this.y = false;
            } else if (this.A) {
                this.I = 1;
                this.A = false;
            }
            this.B = true;
            this.C = true;
            return true;
        }
        if (motionEvent.getPointerCount() != 1) {
            if (this.y) {
                c(3, motionEvent);
                this.B = true;
                this.y = false;
            }
            if (motionEvent.getPointerCount() != 2) {
                this.I = 1;
                this.C = true;
                this.A = false;
                return true;
            }
            if (!this.C || this.A) {
                return true;
            }
            d(1, motionEvent);
            this.A = true;
            return true;
        }
        if (this.B && !this.y) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            PointF actualCenterPoint = getActualCenterPoint();
            PointF pointF = new PointF(x10 - actualCenterPoint.x, y10 - actualCenterPoint.y);
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
            float actualInnerRadius = getActualInnerRadius();
            float actualOuterRadius = getActualOuterRadius();
            boolean z10 = Math.abs(actualOuterRadius - actualInnerRadius) < J;
            float f12 = L;
            float f13 = z10 ? 0.0f : f12;
            float f14 = z10 ? 0.0f : f12;
            int i9 = this.D;
            float f15 = K;
            if (i9 == 0) {
                float abs = (float) Math.abs((Math.sin(a(this.n) + 1.5707963267948966d) * pointF.y) + (Math.cos(a(this.n) + 1.5707963267948966d) * pointF.x));
                if (sqrt < f15) {
                    r15 = 1;
                    this.y = true;
                } else {
                    r15 = 1;
                    float f16 = actualInnerRadius - f12;
                    if (abs <= f16 || abs >= actualInnerRadius + f13) {
                        if (abs > actualOuterRadius - f14 && abs < actualOuterRadius + f12) {
                            this.y = true;
                        } else if (abs <= f16 || abs >= actualOuterRadius + f12) {
                            r15 = 1;
                            this.y = true;
                        }
                        r15 = 1;
                    } else {
                        this.y = true;
                    }
                }
            } else {
                r15 = 1;
                r15 = 1;
                r15 = 1;
                r15 = 1;
                r15 = 1;
                r15 = 1;
                if (i9 == 1) {
                    if (sqrt < f15) {
                        this.y = true;
                    } else if (sqrt > actualInnerRadius - f12 && sqrt < actualInnerRadius + f13) {
                        this.y = true;
                    } else if (sqrt > actualOuterRadius - f14 && sqrt < actualOuterRadius + f12) {
                        this.y = true;
                    }
                }
            }
            this.B = false;
            if (!this.y) {
                return r15;
            }
            c(r15, motionEvent);
            return r15;
        }
        return true;
    }

    public void setDelegate(ee0 ee0Var) {
        this.H = ee0Var;
    }

    public void setType(int i9) {
        this.D = i9;
        invalidate();
    }
}
