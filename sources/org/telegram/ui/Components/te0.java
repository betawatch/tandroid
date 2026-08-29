package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class te0 extends FrameLayout {
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
    public se0 H;
    public int I;
    public PointF a;
    public float b;
    public float c;
    public bv0 d;
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

    public static float a(float f9) {
        return (f9 * 3.1415927f) / 180.0f;
    }

    public static float b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return 0.0f;
        }
        float x4 = motionEvent.getX(0);
        float y8 = motionEvent.getY(0);
        float x10 = x4 - motionEvent.getX(1);
        float y10 = y8 - motionEvent.getY(1);
        return (float) Math.sqrt((y10 * y10) + (x10 * x10));
    }

    private PointF getActualCenterPoint() {
        float width = getWidth();
        bv0 bv0Var = this.d;
        float f9 = bv0Var.a;
        float f10 = (this.e.x * f9) + ((width - f9) / 2.0f);
        int i10 = !this.G ? AndroidUtilities.statusBarHeight : 0;
        float height = getHeight();
        float f11 = bv0Var.b;
        float A = com.google.android.recaptcha.internal.a.A(height, f11, 2.0f, i10);
        float f12 = bv0Var.a;
        return new PointF(f10, (this.e.y * f12) + org.telegram.messenger.x3.a(f12, f11, 2.0f, A));
    }

    private float getActualInnerRadius() {
        bv0 bv0Var = this.d;
        return Math.min(bv0Var.a, bv0Var.b) * this.f;
    }

    private float getActualOuterRadius() {
        bv0 bv0Var = this.d;
        return Math.min(bv0Var.a, bv0Var.b) * this.h;
    }

    public final void c(int i10, MotionEvent motionEvent) {
        boolean z10 = this.G;
        float x4 = motionEvent.getX();
        float y8 = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f9 = x4 - actualCenterPoint.x;
        float f10 = y8 - actualCenterPoint.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
        bv0 bv0Var = this.d;
        float min = Math.min(bv0Var.a, bv0Var.b);
        float f11 = this.f * min;
        float f12 = this.h * min;
        float abs = (float) Math.abs((Math.sin(a(this.n) + 1.5707963267948966d) * f10) + (Math.cos(a(this.n) + 1.5707963267948966d) * f9));
        if (i10 == 1) {
            this.s = motionEvent.getX();
            this.v = motionEvent.getY();
            boolean z11 = Math.abs(f12 - f11) < J;
            float f13 = L;
            float f14 = z11 ? 0.0f : f13;
            float f15 = z11 ? 0.0f : f13;
            int i11 = this.D;
            float f16 = K;
            if (i11 != 0) {
                if (i11 == 1) {
                    if (sqrt < f16) {
                        this.I = 2;
                        this.a = actualCenterPoint;
                        return;
                    }
                    if (sqrt > f11 - f13 && sqrt < f14 + f11) {
                        this.I = 3;
                        this.b = sqrt;
                        this.c = f11;
                        return;
                    } else {
                        if (sqrt <= f12 - f15 || sqrt >= f13 + f12) {
                            return;
                        }
                        this.I = 4;
                        this.b = sqrt;
                        this.c = f12;
                        return;
                    }
                }
                return;
            }
            if (sqrt < f16) {
                this.I = 2;
                this.a = actualCenterPoint;
                return;
            }
            float f17 = f11 - f13;
            if (abs > f17 && abs < f14 + f11) {
                this.I = 3;
                this.b = abs;
                this.c = f11;
                return;
            } else if (abs > f12 - f15 && abs < f12 + f13) {
                this.I = 4;
                this.b = abs;
                this.c = f12;
                return;
            } else {
                if (abs <= f17 || abs >= f12 + f13) {
                    this.I = 6;
                    return;
                }
                return;
            }
        }
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                this.I = 1;
                return;
            }
            return;
        }
        int i12 = this.D;
        if (i12 == 0) {
            int b10 = m1.j.b(this.I);
            if (b10 == 1) {
                float f18 = x4 - this.s;
                float f19 = y8 - this.v;
                float width = (getWidth() - bv0Var.a) / 2.0f;
                int i13 = !z10 ? AndroidUtilities.statusBarHeight : 0;
                float height = getHeight();
                float f20 = bv0Var.b;
                float A = com.google.android.recaptcha.internal.a.A(height, f20, 2.0f, i13);
                PointF pointF = new PointF(Math.max(width, Math.min(bv0Var.a + width, this.a.x + f18)), Math.max(A, Math.min(f20 + A, this.a.y + f19)));
                float f21 = pointF.x - width;
                float f22 = bv0Var.a;
                this.e = new PointF(f21 / f22, (((f22 - bv0Var.b) / 2.0f) + (pointF.y - A)) / f22);
            } else if (b10 == 2) {
                this.f = Math.min(Math.max(0.1f, (this.c + (abs - this.b)) / min), this.h - 0.02f);
            } else if (b10 == 3) {
                this.h = Math.max(this.f + 0.02f, (this.c + (abs - this.b)) / min);
            } else if (b10 == 5) {
                float f23 = x4 - this.s;
                float f24 = y8 - this.v;
                boolean z12 = x4 > actualCenterPoint.x;
                boolean z13 = y8 > actualCenterPoint.y;
                boolean z14 = Math.abs(f24) > Math.abs(f23);
                this.n = (((((float) Math.sqrt((f24 * f24) + (f23 * f23))) * ((((z12 || z13 ? !z12 || z13 ? !(z12 && z13) ? !(!z14 ? f23 < 0.0f : f24 < 0.0f) : !(!z14 ? f23 < 0.0f : f24 > 0.0f) : !z14 ? f23 > 0.0f : f24 > 0.0f : !z14 ? f23 > 0.0f : f24 < 0.0f) ? 0 : 1) * 2) - 1)) / 3.1415927f) / 1.15f) + this.n;
                this.s = x4;
                this.v = y8;
            }
        } else if (i12 == 1) {
            int b11 = m1.j.b(this.I);
            if (b11 == 1) {
                float f25 = x4 - this.s;
                float f26 = y8 - this.v;
                float width2 = (getWidth() - bv0Var.a) / 2.0f;
                int i14 = !z10 ? AndroidUtilities.statusBarHeight : 0;
                float height2 = getHeight();
                float f27 = bv0Var.b;
                float A2 = com.google.android.recaptcha.internal.a.A(height2, f27, 2.0f, i14);
                PointF pointF2 = new PointF(Math.max(width2, Math.min(bv0Var.a + width2, this.a.x + f25)), Math.max(A2, Math.min(f27 + A2, this.a.y + f26)));
                float f28 = pointF2.x - width2;
                float f29 = bv0Var.a;
                this.e = new PointF(f28 / f29, (((f29 - bv0Var.b) / 2.0f) + (pointF2.y - A2)) / f29);
            } else if (b11 == 2) {
                this.f = Math.min(Math.max(0.1f, (this.c + (sqrt - this.b)) / min), this.h - 0.02f);
            } else if (b11 == 3) {
                this.h = Math.max(this.f + 0.02f, (this.c + (sqrt - this.b)) / min);
            }
        }
        invalidate();
        se0 se0Var = this.H;
        if (se0Var != null) {
            PointF pointF3 = this.e;
            float f30 = this.f;
            float f31 = this.h;
            float a2 = a(this.n) + 1.5707964f;
            ef0 ef0Var = ((we0) se0Var).a;
            ef0Var.T = f31;
            ef0Var.U = pointF3;
            ef0Var.V = f30;
            ef0Var.W = a2;
            qz qzVar = ef0Var.h0;
            if (qzVar != null) {
                qzVar.e(false, false, false);
            }
        }
    }

    public final void d(int i10, MotionEvent motionEvent) {
        if (i10 == 1) {
            this.w = b(motionEvent);
            this.x = 1.0f;
            this.I = 5;
        } else if (i10 != 2) {
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                this.I = 1;
                return;
            }
            return;
        }
        float b10 = b(motionEvent);
        float c3 = u3.c.c(b10 - this.w, AndroidUtilities.density, 0.01f, this.x);
        this.x = c3;
        float max = Math.max(0.1f, this.f * c3);
        this.f = max;
        this.h = Math.max(max + 0.02f, this.h * this.x);
        this.x = 1.0f;
        this.w = b10;
        invalidate();
        se0 se0Var = this.H;
        if (se0Var != null) {
            PointF pointF = this.e;
            float f9 = this.f;
            float f10 = this.h;
            float a2 = a(this.n) + 1.5707964f;
            ef0 ef0Var = ((we0) se0Var).a;
            ef0Var.T = f10;
            ef0Var.U = pointF;
            ef0Var.V = f9;
            ef0Var.W = a2;
            qz qzVar = ef0Var.h0;
            if (qzVar != null) {
                qzVar.e(false, false, false);
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
        int i10 = this.D;
        int i11 = 0;
        if (i10 == 0) {
            canvas2.rotate(this.n);
            float dp = AndroidUtilities.dp(6.0f);
            float dp2 = AndroidUtilities.dp(12.0f);
            float dp3 = AndroidUtilities.dp(1.5f);
            int i12 = 0;
            while (i12 < 30) {
                float f9 = dp2 + dp;
                float f10 = i12 * f9;
                float f11 = -actualInnerRadius;
                float f12 = f10 + dp2;
                float f13 = dp3 - actualInnerRadius;
                canvas2.drawRect(f10, f11, f12, f13, paint4);
                float f14 = ((-i12) * f9) - dp;
                float f15 = f14 - dp2;
                canvas.drawRect(f15, f11, f14, f13, paint4);
                float f16 = dp3 + actualInnerRadius;
                float f17 = actualInnerRadius;
                canvas.drawRect(f10, f17, f12, f16, paint4);
                canvas.drawRect(f15, f17, f14, f16, paint4);
                i12++;
                actualInnerRadius = f17;
                canvas2 = canvas;
            }
            float dp4 = AndroidUtilities.dp(6.0f);
            while (i11 < 64) {
                float f18 = dp4 + dp;
                float f19 = i11 * f18;
                float f20 = -actualOuterRadius;
                float f21 = dp4 + f19;
                float f22 = dp3 - actualOuterRadius;
                canvas.drawRect(f19, f20, f21, f22, paint4);
                float f23 = ((-i11) * f18) - dp;
                float f24 = f23 - dp4;
                canvas.drawRect(f24, f20, f23, f22, paint4);
                float f25 = dp3 + actualOuterRadius;
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
            float x4 = motionEvent.getX();
            float y8 = motionEvent.getY();
            PointF actualCenterPoint = getActualCenterPoint();
            PointF pointF = new PointF(x4 - actualCenterPoint.x, y8 - actualCenterPoint.y);
            float f9 = pointF.x;
            float f10 = pointF.y;
            float sqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
            float actualInnerRadius = getActualInnerRadius();
            float actualOuterRadius = getActualOuterRadius();
            boolean z10 = Math.abs(actualOuterRadius - actualInnerRadius) < J;
            float f11 = L;
            float f12 = z10 ? 0.0f : f11;
            float f13 = z10 ? 0.0f : f11;
            int i10 = this.D;
            float f14 = K;
            if (i10 == 0) {
                float abs = (float) Math.abs((Math.sin(a(this.n) + 1.5707963267948966d) * pointF.y) + (Math.cos(a(this.n) + 1.5707963267948966d) * pointF.x));
                if (sqrt < f14) {
                    r15 = 1;
                    this.y = true;
                } else {
                    r15 = 1;
                    float f15 = actualInnerRadius - f11;
                    if (abs <= f15 || abs >= actualInnerRadius + f12) {
                        if (abs > actualOuterRadius - f13 && abs < actualOuterRadius + f11) {
                            this.y = true;
                        } else if (abs <= f15 || abs >= actualOuterRadius + f11) {
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
                if (i10 == 1) {
                    if (sqrt < f14) {
                        this.y = true;
                    } else if (sqrt > actualInnerRadius - f11 && sqrt < actualInnerRadius + f12) {
                        this.y = true;
                    } else if (sqrt > actualOuterRadius - f13 && sqrt < actualOuterRadius + f11) {
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

    public void setDelegate(se0 se0Var) {
        this.H = se0Var;
    }

    public void setType(int i10) {
        this.D = i10;
        invalidate();
    }
}
