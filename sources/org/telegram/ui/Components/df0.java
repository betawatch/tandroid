package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class df0 extends FrameLayout {
    public static final float K = AndroidUtilities.dp(20.0f);
    public static final float L = AndroidUtilities.dp(30.0f);
    public static final float M = AndroidUtilities.dp(30.0f);
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public Paint F;
    public Paint G;
    public boolean H;
    public cf0 I;
    public int J;
    public PointF a;
    public float b;
    public float c;
    public jv0 d;
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
        jv0 jv0Var = this.d;
        float f10 = jv0Var.a;
        float f11 = (this.e.x * f10) + ((width - f10) / 2.0f);
        int i10 = !this.H ? AndroidUtilities.statusBarHeight : 0;
        float height = getHeight();
        float f12 = jv0Var.b;
        float x10 = e2.c.x(height, f12, 2.0f, i10);
        float f13 = jv0Var.a;
        return new PointF(f11, (this.e.y * f13) + org.telegram.messenger.y3.a(f13, f12, 2.0f, x10));
    }

    private float getActualInnerRadius() {
        jv0 jv0Var = this.d;
        return Math.min(jv0Var.a, jv0Var.b) * this.f;
    }

    private float getActualOuterRadius() {
        jv0 jv0Var = this.d;
        return Math.min(jv0Var.a, jv0Var.b) * this.h;
    }

    public final void c(int i10, MotionEvent motionEvent) {
        boolean z4 = this.H;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f10 = x10 - actualCenterPoint.x;
        float f11 = y10 - actualCenterPoint.y;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        jv0 jv0Var = this.d;
        float min = Math.min(jv0Var.a, jv0Var.b);
        float f12 = this.f * min;
        float f13 = this.h * min;
        float abs = (float) Math.abs((Math.sin(a(this.n) + 1.5707963267948966d) * f11) + (Math.cos(a(this.n) + 1.5707963267948966d) * f10));
        if (i10 == 1) {
            this.s = motionEvent.getX();
            this.v = motionEvent.getY();
            boolean z10 = Math.abs(f13 - f12) < K;
            float f14 = M;
            float f15 = z10 ? 0.0f : f14;
            float f16 = z10 ? 0.0f : f14;
            int i11 = this.E;
            float f17 = L;
            if (i11 != 0) {
                if (i11 == 1) {
                    if (sqrt < f17) {
                        this.J = 2;
                        this.a = actualCenterPoint;
                        return;
                    }
                    if (sqrt > f12 - f14 && sqrt < f15 + f12) {
                        this.J = 3;
                        this.b = sqrt;
                        this.c = f12;
                        return;
                    } else {
                        if (sqrt <= f13 - f16 || sqrt >= f14 + f13) {
                            return;
                        }
                        this.J = 4;
                        this.b = sqrt;
                        this.c = f13;
                        return;
                    }
                }
                return;
            }
            if (sqrt < f17) {
                this.J = 2;
                this.a = actualCenterPoint;
                return;
            }
            float f18 = f12 - f14;
            if (abs > f18 && abs < f15 + f12) {
                this.J = 3;
                this.b = abs;
                this.c = f12;
                return;
            } else if (abs > f13 - f16 && abs < f13 + f14) {
                this.J = 4;
                this.b = abs;
                this.c = f13;
                return;
            } else {
                if (abs <= f18 || abs >= f13 + f14) {
                    this.J = 6;
                    return;
                }
                return;
            }
        }
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                this.J = 1;
                return;
            }
            return;
        }
        int i12 = this.E;
        if (i12 == 0) {
            int c3 = m1.j.c(this.J);
            if (c3 == 1) {
                float f19 = x10 - this.s;
                float f20 = y10 - this.v;
                float width = (getWidth() - jv0Var.a) / 2.0f;
                int i13 = !z4 ? AndroidUtilities.statusBarHeight : 0;
                float height = getHeight();
                float f21 = jv0Var.b;
                float x11 = e2.c.x(height, f21, 2.0f, i13);
                PointF pointF = new PointF(Math.max(width, Math.min(jv0Var.a + width, this.a.x + f19)), Math.max(x11, Math.min(f21 + x11, this.a.y + f20)));
                float f22 = pointF.x - width;
                float f23 = jv0Var.a;
                this.e = new PointF(f22 / f23, (((f23 - jv0Var.b) / 2.0f) + (pointF.y - x11)) / f23);
            } else if (c3 == 2) {
                this.f = Math.min(Math.max(0.1f, (this.c + (abs - this.b)) / min), this.h - 0.02f);
            } else if (c3 == 3) {
                this.h = Math.max(this.f + 0.02f, (this.c + (abs - this.b)) / min);
            } else if (c3 == 5) {
                float f24 = x10 - this.s;
                float f25 = y10 - this.v;
                boolean z11 = x10 > actualCenterPoint.x;
                boolean z12 = y10 > actualCenterPoint.y;
                boolean z13 = Math.abs(f25) > Math.abs(f24);
                this.n = (((((float) Math.sqrt((f25 * f25) + (f24 * f24))) * ((((z11 || z12 ? !z11 || z12 ? !(z11 && z12) ? !(!z13 ? f24 < 0.0f : f25 < 0.0f) : !(!z13 ? f24 < 0.0f : f25 > 0.0f) : !z13 ? f24 > 0.0f : f25 > 0.0f : !z13 ? f24 > 0.0f : f25 < 0.0f) ? 0 : 1) * 2) - 1)) / 3.1415927f) / 1.15f) + this.n;
                this.s = x10;
                this.v = y10;
            }
        } else if (i12 == 1) {
            int c10 = m1.j.c(this.J);
            if (c10 == 1) {
                float f26 = x10 - this.s;
                float f27 = y10 - this.v;
                float width2 = (getWidth() - jv0Var.a) / 2.0f;
                int i14 = !z4 ? AndroidUtilities.statusBarHeight : 0;
                float height2 = getHeight();
                float f28 = jv0Var.b;
                float x12 = e2.c.x(height2, f28, 2.0f, i14);
                PointF pointF2 = new PointF(Math.max(width2, Math.min(jv0Var.a + width2, this.a.x + f26)), Math.max(x12, Math.min(f28 + x12, this.a.y + f27)));
                float f29 = pointF2.x - width2;
                float f30 = jv0Var.a;
                this.e = new PointF(f29 / f30, (((f30 - jv0Var.b) / 2.0f) + (pointF2.y - x12)) / f30);
            } else if (c10 == 2) {
                this.f = Math.min(Math.max(0.1f, (this.c + (sqrt - this.b)) / min), this.h - 0.02f);
            } else if (c10 == 3) {
                this.h = Math.max(this.f + 0.02f, (this.c + (sqrt - this.b)) / min);
            }
        }
        invalidate();
        cf0 cf0Var = this.I;
        if (cf0Var != null) {
            PointF pointF3 = this.e;
            float f31 = this.f;
            float f32 = this.h;
            float a2 = a(this.n) + 1.5707964f;
            of0 of0Var = ((gf0) cf0Var).a;
            of0Var.U = f32;
            of0Var.V = pointF3;
            of0Var.W = f31;
            of0Var.a0 = a2;
            vz vzVar = of0Var.i0;
            if (vzVar != null) {
                vzVar.e(false, false, false);
            }
        }
    }

    public final void d(int i10, MotionEvent motionEvent) {
        if (i10 == 1) {
            this.w = b(motionEvent);
            this.x = 1.0f;
            this.J = 5;
        } else if (i10 != 2) {
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                this.J = 1;
                return;
            }
            return;
        }
        float b10 = b(motionEvent);
        float c3 = vh.w2.c(b10 - this.w, AndroidUtilities.density, 0.01f, this.x);
        this.x = c3;
        float max = Math.max(0.1f, this.f * c3);
        this.f = max;
        this.h = Math.max(max + 0.02f, this.h * this.x);
        this.x = 1.0f;
        this.w = b10;
        invalidate();
        cf0 cf0Var = this.I;
        if (cf0Var != null) {
            PointF pointF = this.e;
            float f10 = this.f;
            float f11 = this.h;
            float a2 = a(this.n) + 1.5707964f;
            of0 of0Var = ((gf0) cf0Var).a;
            of0Var.U = f11;
            of0Var.V = pointF;
            of0Var.W = f10;
            of0Var.a0 = a2;
            vz vzVar = of0Var.i0;
            if (vzVar != null) {
                vzVar.e(false, false, false);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Paint paint2 = this.G;
        RectF rectF = this.r;
        Paint paint3 = paint2;
        Paint paint4 = this.F;
        super.onDraw(canvas);
        PointF actualCenterPoint = getActualCenterPoint();
        float actualInnerRadius = getActualInnerRadius();
        float actualOuterRadius = getActualOuterRadius();
        canvas2.translate(actualCenterPoint.x, actualCenterPoint.y);
        int i10 = this.E;
        int i11 = 0;
        if (i10 == 0) {
            canvas2.rotate(this.n);
            float dp = AndroidUtilities.dp(6.0f);
            float dp2 = AndroidUtilities.dp(12.0f);
            float dp3 = AndroidUtilities.dp(1.5f);
            int i12 = 0;
            while (i12 < 30) {
                float f10 = dp2 + dp;
                float f11 = i12 * f10;
                float f12 = -actualInnerRadius;
                float f13 = f11 + dp2;
                float f14 = dp3 - actualInnerRadius;
                canvas2.drawRect(f11, f12, f13, f14, paint4);
                float f15 = ((-i12) * f10) - dp;
                float f16 = f15 - dp2;
                canvas.drawRect(f16, f12, f15, f14, paint4);
                float f17 = dp3 + actualInnerRadius;
                float f18 = actualInnerRadius;
                canvas.drawRect(f11, f18, f13, f17, paint4);
                canvas.drawRect(f16, f18, f15, f17, paint4);
                i12++;
                actualInnerRadius = f18;
                canvas2 = canvas;
            }
            float dp4 = AndroidUtilities.dp(6.0f);
            while (i11 < 64) {
                float f19 = dp4 + dp;
                float f20 = i11 * f19;
                float f21 = -actualOuterRadius;
                float f22 = dp4 + f20;
                float f23 = dp3 - actualOuterRadius;
                canvas.drawRect(f20, f21, f22, f23, paint4);
                float f24 = ((-i11) * f19) - dp;
                float f25 = f24 - dp4;
                canvas.drawRect(f25, f21, f24, f23, paint4);
                float f26 = dp3 + actualOuterRadius;
                float f27 = actualOuterRadius;
                canvas.drawRect(f20, f27, f22, f26, paint4);
                canvas.drawRect(f25, f27, f24, f26, paint4);
                i11++;
                actualOuterRadius = f27;
            }
            paint = paint4;
        } else {
            paint = paint4;
            if (i10 == 1) {
                float f28 = -actualInnerRadius;
                rectF.set(f28, f28, actualInnerRadius, actualInnerRadius);
                int i13 = 0;
                while (i13 < 22) {
                    Paint paint5 = paint3;
                    canvas.drawArc(rectF, i13 * 16.35f, 10.2f, false, paint5);
                    i13++;
                    paint3 = paint5;
                }
                Paint paint6 = paint3;
                float f29 = -actualOuterRadius;
                rectF.set(f29, f29, actualOuterRadius, actualOuterRadius);
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
                    if (this.B) {
                        d(2, motionEvent);
                        return true;
                    }
                }
                return true;
            }
            if (this.y) {
                c(3, motionEvent);
                this.y = false;
            } else if (this.B) {
                this.J = 1;
                this.B = false;
            }
            this.C = true;
            this.D = true;
            return true;
        }
        if (motionEvent.getPointerCount() != 1) {
            if (this.y) {
                c(3, motionEvent);
                this.C = true;
                this.y = false;
            }
            if (motionEvent.getPointerCount() != 2) {
                this.J = 1;
                this.D = true;
                this.B = false;
                return true;
            }
            if (!this.D || this.B) {
                return true;
            }
            d(1, motionEvent);
            this.B = true;
            return true;
        }
        if (this.C && !this.y) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            PointF actualCenterPoint = getActualCenterPoint();
            PointF pointF = new PointF(x10 - actualCenterPoint.x, y10 - actualCenterPoint.y);
            float f10 = pointF.x;
            float f11 = pointF.y;
            float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
            float actualInnerRadius = getActualInnerRadius();
            float actualOuterRadius = getActualOuterRadius();
            boolean z4 = Math.abs(actualOuterRadius - actualInnerRadius) < K;
            float f12 = M;
            float f13 = z4 ? 0.0f : f12;
            float f14 = z4 ? 0.0f : f12;
            int i10 = this.E;
            float f15 = L;
            if (i10 == 0) {
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
                if (i10 == 1) {
                    if (sqrt < f15) {
                        this.y = true;
                    } else if (sqrt > actualInnerRadius - f12 && sqrt < actualInnerRadius + f13) {
                        this.y = true;
                    } else if (sqrt > actualOuterRadius - f14 && sqrt < actualOuterRadius + f12) {
                        this.y = true;
                    }
                }
            }
            this.C = false;
            if (!this.y) {
                return r15;
            }
            c(r15, motionEvent);
            return r15;
        }
        return true;
    }

    public void setDelegate(cf0 cf0Var) {
        this.I = cf0Var;
    }

    public void setType(int i10) {
        this.E = i10;
        invalidate();
    }
}
