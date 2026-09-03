package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class RadialProgressView extends View {
    public float B;
    public int C;
    public float D;
    public boolean E;
    public float F;
    public boolean G;
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
    public final AccelerateInterpolator v;
    public final Paint w;
    public int x;
    public float y;

    public RadialProgressView(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, float f10, float f11) {
        float f12 = this.x / 2.0f;
        RectF rectF = this.f;
        rectF.set(f10 - f12, f11 - f12, f10 + f12, f12 + f11);
        float f13 = this.b;
        float f14 = this.c;
        this.n = f14;
        canvas.drawArc(rectF, f13, f14, false, this.w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.a = currentTimeMillis;
        b(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j10) {
        this.b = (((360 * j10) / 2000.0f) + this.b) - (((int) (r1 / 360.0f)) * 360);
        boolean z4 = this.E;
        if (z4) {
            float f10 = this.F;
            if (f10 != 1.0f) {
                float f11 = f10 + 0.07272727f;
                this.F = f11;
                if (f11 > 1.0f) {
                    this.F = 1.0f;
                }
                if (this.G) {
                    float f12 = this.y;
                    float f13 = this.B;
                    float f14 = f12 - f13;
                    if (f14 > 0.0f) {
                        int i10 = (int) (this.C + j10);
                        this.C = i10;
                        float f15 = i10;
                        if (f15 >= 200.0f) {
                            this.B = f12;
                            this.D = f12;
                            this.C = 0;
                        } else {
                            this.D = (AndroidUtilities.decelerateInterpolator.getInterpolation(f15 / 200.0f) * f14) + f13;
                        }
                    }
                    this.c = Math.max(4.0f, this.D * 360.0f);
                } else {
                    float f16 = this.F;
                    DecelerateInterpolator decelerateInterpolator = this.s;
                    AccelerateInterpolator accelerateInterpolator = this.v;
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
                        float interpolation = (this.F * 360.0f) + (accelerateInterpolator.getInterpolation(this.e / 500.0f) * 266.0f) + 4.0f;
                        this.c = interpolation;
                        float f19 = f18 - interpolation;
                        if (f19 > 0.0f) {
                            this.b = f19 + this.b;
                        }
                    } else {
                        float f20 = this.c;
                        float interpolation2 = (4.0f - ((1.0f - decelerateInterpolator.getInterpolation(this.e / 500.0f)) * 270.0f)) - (this.F * 364.0f);
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
        if (!z4) {
            float f22 = this.F;
            if (f22 != 0.0f) {
                float f23 = f22 - 0.04f;
                this.F = f23;
                if (f23 < 0.0f) {
                    this.F = 0.0f;
                }
            }
        }
        if (this.G) {
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int measuredWidth = (getMeasuredWidth() - this.x) / 2;
        int measuredHeight = (getMeasuredHeight() - this.x) / 2;
        RectF rectF = this.f;
        rectF.set(measuredWidth, measuredHeight, measuredWidth + r2, measuredHeight + r2);
        float f10 = this.b;
        float f11 = this.c;
        this.n = f11;
        canvas.drawArc(rectF, f10, f11, false, this.w);
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
            int i10 = (int) (f10 * 255.0f);
            if (background != null) {
                background.setAlpha(i10);
            }
            this.w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z4) {
        this.G = z4;
    }

    public void setProgress(float f10) {
        this.y = f10;
        if (this.D > f10) {
            this.D = f10;
        }
        this.B = this.D;
        this.C = 0;
    }

    public void setProgressColor(int i10) {
        this.r = i10;
        this.w.setColor(i10);
    }

    public void setSize(int i10) {
        this.x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f10) {
        this.w.setStrokeWidth(AndroidUtilities.dp(f10));
    }

    public void setUseSelfAlpha(boolean z4) {
        this.h = z4;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f = new RectF();
        this.G = true;
        this.x = AndroidUtilities.dp(40.0f);
        this.r = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h6, g6Var);
        this.s = new DecelerateInterpolator();
        this.v = new AccelerateInterpolator();
        Paint paint = new Paint(1);
        this.w = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(this.r);
    }
}
