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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class RadialProgressView extends View {
    public float A;
    public int B;
    public float C;
    public boolean D;
    public float E;
    public boolean F;
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

    public final void a(Canvas canvas, float f9, float f10) {
        float f11 = this.x / 2.0f;
        RectF rectF = this.f;
        rectF.set(f9 - f11, f10 - f11, f9 + f11, f11 + f10);
        float f12 = this.b;
        float f13 = this.c;
        this.n = f13;
        canvas.drawArc(rectF, f12, f13, false, this.w);
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
        boolean z10 = this.D;
        if (z10) {
            float f9 = this.E;
            if (f9 != 1.0f) {
                float f10 = f9 + 0.07272727f;
                this.E = f10;
                if (f10 > 1.0f) {
                    this.E = 1.0f;
                }
                if (this.F) {
                    float f11 = this.y;
                    float f12 = this.A;
                    float f13 = f11 - f12;
                    if (f13 > 0.0f) {
                        int i10 = (int) (this.B + j10);
                        this.B = i10;
                        float f14 = i10;
                        if (f14 >= 200.0f) {
                            this.A = f11;
                            this.C = f11;
                            this.B = 0;
                        } else {
                            this.C = (AndroidUtilities.decelerateInterpolator.getInterpolation(f14 / 200.0f) * f13) + f12;
                        }
                    }
                    this.c = Math.max(4.0f, this.C * 360.0f);
                } else {
                    float f15 = this.E;
                    DecelerateInterpolator decelerateInterpolator = this.s;
                    AccelerateInterpolator accelerateInterpolator = this.v;
                    if (f15 == 0.0f) {
                        float f16 = this.e + j10;
                        this.e = f16;
                        if (f16 >= 500.0f) {
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
                        float f17 = this.c;
                        float interpolation = (this.E * 360.0f) + (accelerateInterpolator.getInterpolation(this.e / 500.0f) * 266.0f) + 4.0f;
                        this.c = interpolation;
                        float f18 = f17 - interpolation;
                        if (f18 > 0.0f) {
                            this.b = f18 + this.b;
                        }
                    } else {
                        float f19 = this.c;
                        float interpolation2 = (4.0f - ((1.0f - decelerateInterpolator.getInterpolation(this.e / 500.0f)) * 270.0f)) - (this.E * 364.0f);
                        this.c = interpolation2;
                        float f20 = f19 - interpolation2;
                        if (f20 > 0.0f) {
                            this.b = f20 + this.b;
                        }
                    }
                }
                invalidate();
            }
        }
        if (!z10) {
            float f21 = this.E;
            if (f21 != 0.0f) {
                float f22 = f21 - 0.04f;
                this.E = f22;
                if (f22 < 0.0f) {
                    this.E = 0.0f;
                }
            }
        }
        if (this.F) {
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int measuredWidth = (getMeasuredWidth() - this.x) / 2;
        int measuredHeight = (getMeasuredHeight() - this.x) / 2;
        RectF rectF = this.f;
        rectF.set(measuredWidth, measuredHeight, measuredWidth + r2, measuredHeight + r2);
        float f9 = this.b;
        float f10 = this.c;
        this.n = f10;
        canvas.drawArc(rectF, f9, f10, false, this.w);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.a;
        if (j10 > 17) {
            j10 = 17;
        }
        this.a = currentTimeMillis;
        b(j10);
    }

    @Override // android.view.View
    public void setAlpha(float f9) {
        super.setAlpha(f9);
        if (this.h) {
            Drawable background = getBackground();
            int i10 = (int) (f9 * 255.0f);
            if (background != null) {
                background.setAlpha(i10);
            }
            this.w.setAlpha(i10);
        }
    }

    public void setNoProgress(boolean z10) {
        this.F = z10;
    }

    public void setProgress(float f9) {
        this.y = f9;
        if (this.C > f9) {
            this.C = f9;
        }
        this.A = this.C;
        this.B = 0;
    }

    public void setProgressColor(int i10) {
        this.r = i10;
        this.w.setColor(i10);
    }

    public void setSize(int i10) {
        this.x = i10;
        invalidate();
    }

    public void setStrokeWidth(float f9) {
        this.w.setStrokeWidth(AndroidUtilities.dp(f9));
    }

    public void setUseSelfAlpha(boolean z10) {
        this.h = z10;
    }

    public RadialProgressView(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f = new RectF();
        this.F = true;
        this.x = AndroidUtilities.dp(40.0f);
        this.r = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h6, c6Var);
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
