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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class RadialProgressView extends View implements org.telegram.ui.ActionBar.z5 {
    public float E;
    public float F;
    public int G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public final org.telegram.ui.ActionBar.e6 L;
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

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f10, float f11) {
        float f12 = this.y / 2.0f;
        RectF rectF = this.f;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f12 + f11);
        float f13 = this.b;
        float f14 = this.c;
        this.n = f14;
        canvas.drawArc(rectF, f13, f14, false, this.x);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.a = currentTimeMillis;
        b(j10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.M));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j10) {
        this.b = (((360 * j10) / 2000.0f) + this.b) - (((int) (r1 / 360.0f)) * 360);
        boolean z10 = this.I;
        if (z10) {
            float f10 = this.J;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                this.J = f11;
                if (f11 > 1.0f) {
                    this.J = 1.0f;
                }
                if (this.K) {
                    float f12 = this.E;
                    float f13 = this.F;
                    float f14 = f12 - f13;
                    if (f14 > 0.0f) {
                        int i3 = (int) (this.G + j10);
                        this.G = i3;
                        float f15 = i3;
                        if (f15 >= 200.0f) {
                            this.F = f12;
                            this.H = f12;
                            this.G = 0;
                        } else {
                            this.H = (org.telegram.messenger.g0.F.getInterpolation(f15 / 200.0f) * f14) + f13;
                        }
                    }
                    this.c = Math.max(4.0f, this.H * 360.0f);
                } else {
                    float f16 = this.J;
                    DecelerateInterpolator decelerateInterpolator = this.s;
                    AccelerateInterpolator accelerateInterpolator = this.w;
                    if (f16 == 0.0f) {
                        float f17 = this.e + j10;
                        this.e = f17;
                        if (f17 >= 500.0f) {
                            this.e = 500.0f;
                        }
                        if (this.d) {
                            this.c = (accelerateInterpolator.getInterpolation(this.e / 500.0f) * 266.0f) + 4.0f;
                        } else {
                            this.c = 4.0f - ((1.0f - decelerateInterpolator.getInterpolation(this.e / 500.0f)) * 270.0f);
                        }
                        if (this.e == 500.0f) {
                            boolean z11 = this.d;
                            if (z11) {
                                this.b += 270.0f;
                                this.c = -266.0f;
                            }
                            this.d = !z11;
                            this.e = 0.0f;
                        }
                    } else if (this.d) {
                        float f18 = this.c;
                        float interpolation = (this.J * 360.0f) + (accelerateInterpolator.getInterpolation(this.e / 500.0f) * 266.0f) + 4.0f;
                        this.c = interpolation;
                        float f19 = f18 - interpolation;
                        if (f19 > 0.0f) {
                            this.b = f19 + this.b;
                        }
                    } else {
                        float f20 = this.c;
                        float interpolation2 = (4.0f - ((1.0f - decelerateInterpolator.getInterpolation(this.e / 500.0f)) * 270.0f)) - (this.J * 364.0f);
                        this.c = interpolation2;
                        float f21 = f20 - interpolation2;
                        if (f21 > 0.0f) {
                            this.b = f21 + this.b;
                        }
                    }
                }
                invalidate();
            }
        }
        if (!z10) {
            float f22 = this.J;
            if (f22 != 0.0f) {
                float f23 = f22 - 0.04f;
                this.J = f23;
                if (f23 < 0.0f) {
                    this.J = 0.0f;
                }
            }
        }
        if (this.K) {
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int measuredWidth = (getMeasuredWidth() - this.y) / 2;
        int measuredHeight = (getMeasuredHeight() - this.y) / 2;
        RectF rectF = this.f;
        rectF.set(measuredWidth, measuredHeight, measuredWidth + r2, measuredHeight + r2);
        float f10 = this.b;
        float f11 = this.c;
        this.n = f11;
        canvas.drawArc(rectF, f10, f11, false, this.x);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.a = currentTimeMillis;
        b(j10);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (this.h) {
            Drawable background = getBackground();
            int i3 = (int) (f10 * 255.0f);
            if (background != null) {
                background.setAlpha(i3);
            }
            this.x.setAlpha(i3);
        }
    }

    public void setNoProgress(boolean z10) {
        this.K = z10;
    }

    public void setProgress(float f10) {
        this.E = f10;
        if (this.H > f10) {
            this.H = f10;
        }
        this.F = this.H;
        this.G = 0;
    }

    public void setProgressColor(int i3) {
        this.r = i3;
        this.x.setColor(i3);
    }

    public void setProgressColorKey(int i3) {
        this.M = i3;
        setProgressColor(org.telegram.ui.ActionBar.k6.w0(i3, this.L));
        this.N = this.r;
    }

    public void setSize(int i3) {
        this.y = i3;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.x.setStrokeWidth(org.telegram.messenger.g0.L(f10));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        Paint paint = this.x;
        if (paint != null) {
            try {
                if (this.r != this.N) {
                    return;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(this.M, this.L);
                this.N = w02;
                if (w02 != this.r) {
                    int alpha = paint.getAlpha();
                    setProgressColor(w02);
                    this.N = w02;
                    if (this.h) {
                        paint.setAlpha(alpha);
                    }
                    invalidate();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f = new RectF();
        this.K = true;
        int i3 = org.telegram.ui.ActionBar.k6.h6;
        this.M = i3;
        this.L = e6Var;
        this.y = org.telegram.messenger.g0.L(40.0f);
        this.r = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
        this.s = new DecelerateInterpolator();
        this.w = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.x = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(this.r);
        this.N = this.r;
    }
}
