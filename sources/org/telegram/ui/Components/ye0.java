package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ye0 extends FrameLayout {
    public static final float N = AndroidUtilities.dp(20.0f);
    public static final float O = AndroidUtilities.dp(30.0f);
    public static final float P = AndroidUtilities.dp(30.0f);
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public Paint I;
    public Paint J;
    public boolean K;
    public xe0 L;
    public int M;
    public PointF a;
    public float b;
    public float c;
    public iv0 d;
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
        iv0 iv0Var = this.d;
        float f7 = iv0Var.a;
        float f10 = (this.e.x * f7) + ((width - f7) / 2.0f);
        int i10 = !this.K ? AndroidUtilities.statusBarHeight : 0;
        float height = getHeight();
        float f11 = iv0Var.b;
        float A = com.google.android.gms.internal.vision.e2.A(height, f11, 2.0f, i10);
        float f12 = iv0Var.a;
        return new PointF(f10, (this.e.y * f12) + org.telegram.messenger.w1.y(f12, f11, 2.0f, A));
    }

    private float getActualInnerRadius() {
        iv0 iv0Var = this.d;
        return Math.min(iv0Var.a, iv0Var.b) * this.f;
    }

    private float getActualOuterRadius() {
        iv0 iv0Var = this.d;
        return Math.min(iv0Var.a, iv0Var.b) * this.h;
    }

    public final void c(int i10, MotionEvent motionEvent) {
        boolean z10 = this.K;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f7 = x10 - actualCenterPoint.x;
        float f10 = y3 - actualCenterPoint.y;
        float sqrt = (float) Math.sqrt((f10 * f10) + (f7 * f7));
        iv0 iv0Var = this.d;
        float min = Math.min(iv0Var.a, iv0Var.b);
        float f11 = this.f * min;
        float f12 = this.h * min;
        float abs = (float) Math.abs((Math.sin(a(this.n) + 1.5707963267948966d) * f10) + (Math.cos(a(this.n) + 1.5707963267948966d) * f7));
        if (i10 == 1) {
            this.s = motionEvent.getX();
            this.v = motionEvent.getY();
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
                float f19 = y3 - this.v;
                float width = (getWidth() - iv0Var.a) / 2.0f;
                int i13 = !z10 ? AndroidUtilities.statusBarHeight : 0;
                float height = getHeight();
                float f20 = iv0Var.b;
                float A = com.google.android.gms.internal.vision.e2.A(height, f20, 2.0f, i13);
                PointF pointF = new PointF(Math.max(width, Math.min(iv0Var.a + width, this.a.x + f18)), Math.max(A, Math.min(f20 + A, this.a.y + f19)));
                float f21 = pointF.x - width;
                float f22 = iv0Var.a;
                this.e = new PointF(f21 / f22, (((f22 - iv0Var.b) / 2.0f) + (pointF.y - A)) / f22);
            } else if (c10 == 2) {
                this.f = Math.min(Math.max(0.1f, (this.c + (abs - this.b)) / min), this.h - 0.02f);
            } else if (c10 == 3) {
                this.h = Math.max(this.f + 0.02f, (this.c + (abs - this.b)) / min);
            } else if (c10 == 5) {
                float f23 = x10 - this.s;
                float f24 = y3 - this.v;
                boolean z12 = x10 > actualCenterPoint.x;
                boolean z13 = y3 > actualCenterPoint.y;
                boolean z14 = Math.abs(f24) > Math.abs(f23);
                this.n = (((((float) Math.sqrt((f24 * f24) + (f23 * f23))) * ((((z12 || z13 ? !z12 || z13 ? !(z12 && z13) ? !(!z14 ? f23 < 0.0f : f24 < 0.0f) : !(!z14 ? f23 < 0.0f : f24 > 0.0f) : !z14 ? f23 > 0.0f : f24 > 0.0f : !z14 ? f23 > 0.0f : f24 < 0.0f) ? 0 : 1) * 2) - 1)) / 3.1415927f) / 1.15f) + this.n;
                this.s = x10;
                this.v = y3;
            }
        } else if (i12 == 1) {
            int c11 = m1.j.c(this.M);
            if (c11 == 1) {
                float f25 = x10 - this.s;
                float f26 = y3 - this.v;
                float width2 = (getWidth() - iv0Var.a) / 2.0f;
                int i14 = !z10 ? AndroidUtilities.statusBarHeight : 0;
                float height2 = getHeight();
                float f27 = iv0Var.b;
                float A2 = com.google.android.gms.internal.vision.e2.A(height2, f27, 2.0f, i14);
                PointF pointF2 = new PointF(Math.max(width2, Math.min(iv0Var.a + width2, this.a.x + f25)), Math.max(A2, Math.min(f27 + A2, this.a.y + f26)));
                float f28 = pointF2.x - width2;
                float f29 = iv0Var.a;
                this.e = new PointF(f28 / f29, (((f29 - iv0Var.b) / 2.0f) + (pointF2.y - A2)) / f29);
            } else if (c11 == 2) {
                this.f = Math.min(Math.max(0.1f, (this.c + (sqrt - this.b)) / min), this.h - 0.02f);
            } else if (c11 == 3) {
                this.h = Math.max(this.f + 0.02f, (this.c + (sqrt - this.b)) / min);
            }
        }
        invalidate();
        xe0 xe0Var = this.L;
        if (xe0Var != null) {
            PointF pointF3 = this.e;
            float f30 = this.f;
            float f31 = this.h;
            float a2 = a(this.n) + 1.5707964f;
            jf0 jf0Var = ((bf0) xe0Var).a;
            jf0Var.a0 = f31;
            jf0Var.b0 = pointF3;
            jf0Var.c0 = f30;
            jf0Var.d0 = a2;
            vz vzVar = jf0Var.l0;
            if (vzVar != null) {
                vzVar.e(false, false, false);
            }
        }
    }

    public final void d(int i10, MotionEvent motionEvent) {
        if (i10 == 1) {
            this.w = b(motionEvent);
            this.x = 1.0f;
            this.M = 5;
        } else if (i10 != 2) {
            if (i10 == 3 || i10 == 4 || i10 == 5) {
                this.M = 1;
                return;
            }
            return;
        }
        float b10 = b(motionEvent);
        float e7 = a4.a.e(b10 - this.w, AndroidUtilities.density, 0.01f, this.x);
        this.x = e7;
        float max = Math.max(0.1f, this.f * e7);
        this.f = max;
        this.h = Math.max(max + 0.02f, this.h * this.x);
        this.x = 1.0f;
        this.w = b10;
        invalidate();
        xe0 xe0Var = this.L;
        if (xe0Var != null) {
            PointF pointF = this.e;
            float f7 = this.f;
            float f10 = this.h;
            float a2 = a(this.n) + 1.5707964f;
            jf0 jf0Var = ((bf0) xe0Var).a;
            jf0Var.a0 = f10;
            jf0Var.b0 = pointF;
            jf0Var.c0 = f7;
            jf0Var.d0 = a2;
            vz vzVar = jf0Var.l0;
            if (vzVar != null) {
                vzVar.e(false, false, false);
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
            float dp = AndroidUtilities.dp(6.0f);
            float dp2 = AndroidUtilities.dp(12.0f);
            float dp3 = AndroidUtilities.dp(1.5f);
            int i12 = 0;
            while (i12 < 30) {
                float f7 = dp2 + dp;
                float f10 = i12 * f7;
                float f11 = -actualInnerRadius;
                float f12 = f10 + dp2;
                float f13 = dp3 - actualInnerRadius;
                canvas2.drawRect(f10, f11, f12, f13, paint4);
                float f14 = ((-i12) * f7) - dp;
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
                    if (this.E) {
                        d(2, motionEvent);
                        return true;
                    }
                }
                return true;
            }
            if (this.y) {
                c(3, motionEvent);
                this.y = false;
            } else if (this.E) {
                this.M = 1;
                this.E = false;
            }
            this.F = true;
            this.G = true;
            return true;
        }
        if (motionEvent.getPointerCount() != 1) {
            if (this.y) {
                c(3, motionEvent);
                this.F = true;
                this.y = false;
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
        if (this.F && !this.y) {
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
            this.F = false;
            if (!this.y) {
                return r15;
            }
            c(r15, motionEvent);
            return r15;
        }
        return true;
    }

    public void setDelegate(xe0 xe0Var) {
        this.L = xe0Var;
    }

    public void setType(int i10) {
        this.H = i10;
        invalidate();
    }
}
