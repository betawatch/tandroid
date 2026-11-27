package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.HashSet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class RadialProgressView extends View implements snb {
    public float E;
    public float F;
    public int G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public final vnb L;
    public int M;
    public int N;
    public long a;
    public float b;
    public float c;
    public boolean d;
    public float e;
    public final RectF f;
    public boolean h;
    public float n;
    public int r;
    public final DecelerateInterpolator s;
    public final AccelerateInterpolator w;
    public final Paint x;
    public int y;

    public RadialProgressView(Context context, vnb vnbVar) {
        super(context);
        this.f = new RectF();
        this.K = true;
        int i = aob.h6;
        this.M = i;
        this.L = vnbVar;
        this.y = hl.L(40.0f);
        this.r = aob.v0(i, vnbVar);
        this.s = new DecelerateInterpolator();
        this.w = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.x = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(hl.L(3.0f));
        paint.setColor(this.r);
        this.N = this.r;
    }

    public final void a(Canvas canvas, float f, float f2) {
        float f3 = this.y / 2.0f;
        RectF rectF = this.f;
        rectF.set(f - f3, f2 - f3, f + f3, f3 + f2);
        float f4 = this.b;
        float f5 = this.c;
        this.n = f5;
        canvas.drawArc(rectF, f4, f5, false, this.x);
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.a;
        if (j > 17) {
            j = 17;
        }
        this.a = currentTimeMillis;
        b(j);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.M));
    }

    public final void b(long j) {
        this.b = (((360 * j) / 2000.0f) + this.b) - (((int) (r1 / 360.0f)) * 360);
        boolean z = this.I;
        float f = this.J;
        if (z) {
            if (f != 1.0f) {
                f += 0.07272727f;
                this.J = f;
                if (f > 1.0f) {
                    this.J = 1.0f;
                    f = 1.0f;
                }
            }
        } else if (f != 0.0f) {
            f -= 0.04f;
            this.J = f;
            if (f < 0.0f) {
                this.J = 0.0f;
                f = 0.0f;
            }
        }
        if (this.K) {
            DecelerateInterpolator decelerateInterpolator = this.s;
            AccelerateInterpolator accelerateInterpolator = this.w;
            if (f == 0.0f) {
                float f2 = this.e + j;
                this.e = f2;
                if (f2 >= 500.0f) {
                    this.e = 500.0f;
                    f2 = 500.0f;
                }
                float f3 = f2 / 500.0f;
                if (this.d) {
                    this.c = (accelerateInterpolator.getInterpolation(f3) * 266.0f) + 4.0f;
                } else {
                    this.c = 4.0f - ((1.0f - decelerateInterpolator.getInterpolation(f3)) * 270.0f);
                }
                if (this.e == 500.0f) {
                    boolean z2 = this.d;
                    if (z2) {
                        this.b += 270.0f;
                        this.c = -266.0f;
                    }
                    this.d = !z2;
                    this.e = 0.0f;
                }
            } else {
                boolean z3 = this.d;
                float f4 = this.c;
                float f5 = this.e / 500.0f;
                if (z3) {
                    float interpolation = (this.J * 360.0f) + (accelerateInterpolator.getInterpolation(f5) * 266.0f) + 4.0f;
                    this.c = interpolation;
                    float f6 = f4 - interpolation;
                    if (f6 > 0.0f) {
                        this.b = f6 + this.b;
                    }
                } else {
                    float interpolation2 = (4.0f - ((1.0f - decelerateInterpolator.getInterpolation(f5)) * 270.0f)) - (this.J * 364.0f);
                    this.c = interpolation2;
                    float f7 = f4 - interpolation2;
                    if (f7 > 0.0f) {
                        this.b = f7 + this.b;
                    }
                }
            }
        } else {
            float f8 = this.E;
            float f9 = this.F;
            float f10 = f8 - f9;
            if (f10 > 0.0f) {
                int i = (int) (this.G + j);
                this.G = i;
                float f11 = i;
                if (f11 >= 200.0f) {
                    this.F = f8;
                    this.H = f8;
                    this.G = 0;
                } else {
                    this.H = (hl.F.getInterpolation(f11 / 200.0f) * f10) + f9;
                }
            }
            this.c = Math.max(4.0f, this.H * 360.0f);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int measuredWidth = (getMeasuredWidth() - this.y) / 2;
        int measuredHeight = (getMeasuredHeight() - this.y) / 2;
        RectF rectF = this.f;
        rectF.set(measuredWidth, measuredHeight, measuredWidth + r2, measuredHeight + r2);
        float f = this.b;
        float f2 = this.c;
        this.n = f2;
        canvas.drawArc(rectF, f, f2, false, this.x);
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.a;
        if (j > 17) {
            j = 17;
        }
        this.a = currentTimeMillis;
        b(j);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        if (this.h) {
            Drawable background = getBackground();
            int i = (int) (f * 255.0f);
            if (background != null) {
                background.setAlpha(i);
            }
            this.x.setAlpha(i);
        }
    }

    public void setNoProgress(boolean z) {
        this.K = z;
    }

    public void setProgress(float f) {
        this.E = f;
        float f2 = this.H;
        if (f2 > f) {
            this.H = f;
        } else {
            f = f2;
        }
        this.F = f;
        this.G = 0;
    }

    public void setProgressColor(int i) {
        this.r = i;
        this.x.setColor(i);
    }

    public void setProgressColorKey(int i) {
        this.M = i;
        setProgressColor(aob.v0(i, this.L));
        this.N = this.r;
    }

    public void setSize(int i) {
        this.y = i;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.x.setStrokeWidth(hl.L(f));
    }

    public void setUseSelfAlpha(boolean z) {
        this.h = z;
    }

    @Override // snb
    public final void updateColors() {
        Paint paint = this.x;
        if (paint != null) {
            try {
                if (this.r == this.N) {
                    int v0 = aob.v0(this.M, this.L);
                    this.N = v0;
                    if (v0 != this.r) {
                        int alpha = paint.getAlpha();
                        setProgressColor(v0);
                        this.N = v0;
                        if (this.h) {
                            paint.setAlpha(alpha);
                        }
                        invalidate();
                    }
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    public RadialProgressView(Context context) {
        this(context, null);
    }
}
