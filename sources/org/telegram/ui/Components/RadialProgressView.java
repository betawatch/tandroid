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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public class RadialProgressView extends View implements org.telegram.ui.ActionBar.a6 {
    public float D;
    public float E;
    public int F;
    public float G;
    public boolean H;
    public float I;
    public boolean J;
    public final org.telegram.ui.ActionBar.f6 K;
    public int L;
    public int M;
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
        long j3 = currentTimeMillis - this.a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.a = currentTimeMillis;
        b(j3);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(this.L));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j3) {
        this.b = (((360 * j3) / 2000.0f) + this.b) - (((int) (r1 / 360.0f)) * 360);
        boolean z9 = this.H;
        if (z9) {
            float f10 = this.I;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                this.I = f11;
                if (f11 > 1.0f) {
                    this.I = 1.0f;
                }
                if (this.J) {
                    float f12 = this.D;
                    float f13 = this.E;
                    float f14 = f12 - f13;
                    if (f14 > 0.0f) {
                        int i7 = (int) (this.F + j3);
                        this.F = i7;
                        float f15 = i7;
                        if (f15 >= 200.0f) {
                            this.E = f12;
                            this.G = f12;
                            this.F = 0;
                        } else {
                            this.G = (org.telegram.messenger.g0.F.getInterpolation(f15 / 200.0f) * f14) + f13;
                        }
                    }
                    this.c = Math.max(4.0f, this.G * 360.0f);
                } else {
                    float f16 = this.I;
                    DecelerateInterpolator decelerateInterpolator = this.s;
                    AccelerateInterpolator accelerateInterpolator = this.w;
                    if (f16 == 0.0f) {
                        float f17 = this.e + j3;
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
                            boolean z10 = this.d;
                            if (z10) {
                                this.b += 270.0f;
                                this.c = -266.0f;
                            }
                            this.d = !z10;
                            this.e = 0.0f;
                        }
                    } else if (this.d) {
                        float f18 = this.c;
                        float interpolation = (this.I * 360.0f) + (accelerateInterpolator.getInterpolation(this.e / 500.0f) * 266.0f) + 4.0f;
                        this.c = interpolation;
                        float f19 = f18 - interpolation;
                        if (f19 > 0.0f) {
                            this.b = f19 + this.b;
                        }
                    } else {
                        float f20 = this.c;
                        float interpolation2 = (4.0f - ((1.0f - decelerateInterpolator.getInterpolation(this.e / 500.0f)) * 270.0f)) - (this.I * 364.0f);
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
        if (!z9) {
            float f22 = this.I;
            if (f22 != 0.0f) {
                float f23 = f22 - 0.04f;
                this.I = f23;
                if (f23 < 0.0f) {
                    this.I = 0.0f;
                }
            }
        }
        if (this.J) {
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
        long j3 = currentTimeMillis - this.a;
        if (j3 > 17) {
            j3 = 17;
        }
        this.a = currentTimeMillis;
        b(j3);
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        if (this.h) {
            Drawable background = getBackground();
            int i7 = (int) (f10 * 255.0f);
            if (background != null) {
                background.setAlpha(i7);
            }
            this.x.setAlpha(i7);
        }
    }

    public void setNoProgress(boolean z9) {
        this.J = z9;
    }

    public void setProgress(float f10) {
        this.D = f10;
        if (this.G > f10) {
            this.G = f10;
        }
        this.E = this.G;
        this.F = 0;
    }

    public void setProgressColor(int i7) {
        this.r = i7;
        this.x.setColor(i7);
    }

    public void setProgressColorKey(int i7) {
        this.L = i7;
        setProgressColor(org.telegram.ui.ActionBar.k6.w0(i7, this.K));
        this.M = this.r;
    }

    public void setSize(int i7) {
        this.y = i7;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.x.setStrokeWidth(org.telegram.messenger.g0.L(f10));
    }

    public void setUseSelfAlpha(boolean z9) {
        this.h = z9;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        Paint paint = this.x;
        if (paint != null) {
            try {
                if (this.r != this.M) {
                    return;
                }
                int w02 = org.telegram.ui.ActionBar.k6.w0(this.L, this.K);
                this.M = w02;
                if (w02 != this.r) {
                    int alpha = paint.getAlpha();
                    setProgressColor(w02);
                    this.M = w02;
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

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f = new RectF();
        this.J = true;
        int i7 = org.telegram.ui.ActionBar.k6.h6;
        this.L = i7;
        this.K = f6Var;
        this.y = org.telegram.messenger.g0.L(40.0f);
        this.r = org.telegram.ui.ActionBar.k6.w0(i7, f6Var);
        this.s = new DecelerateInterpolator();
        this.w = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.x = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(this.r);
        this.M = this.r;
    }
}
