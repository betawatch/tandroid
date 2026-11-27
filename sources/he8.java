// default package

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class he8 extends View {
    public float E;
    public ValueAnimator F;
    public final Paint G;
    public final Paint H;
    public final Paint I;
    public final Paint J;
    public int K;
    public int L;
    public final vnb M;
    public boolean N;
    public int a;
    public int b;
    public int c;
    public float d;
    public int e;
    public int f;
    public boolean h;
    public boolean n;
    public float r;
    public float s;
    public int w;
    public int x;
    public final RectF y;

    public he8(Activity activity, vnb vnbVar) {
        super(activity);
        this.a = -1;
        this.b = 0;
        this.y = new RectF();
        Paint paint = new Paint(1);
        this.I = paint;
        Paint paint2 = new Paint(1);
        this.J = paint2;
        this.K = -1;
        this.M = vnbVar;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint();
        this.G = paint3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(6.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        this.H = paint4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, hl.L(6.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
        paint4.setXfermode(new PorterDuffXfermode(mode));
        d();
    }

    public final void a() {
        boolean z = (this.n ? Math.max(this.e, this.f) : this.b) > 3;
        int i = z ? 2 : 0;
        if (getLayerType() != i) {
            setLayerType(i, null);
            invalidate();
        }
        this.N = z;
    }

    public final void b(int i) {
        if (this.n) {
            this.K = i;
            return;
        }
        if (!this.h) {
            this.d = this.a;
        } else {
            if (this.c == i) {
                return;
            }
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float f = this.d;
            float f2 = this.E;
            this.d = (this.c * f2) + ((1.0f - f2) * f);
        }
        if (i != this.a) {
            this.c = i;
            this.h = true;
            this.E = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new fe8(this, (byte) 1));
            this.F.addListener(new ge8(this, (byte) 0));
            this.F.setInterpolator(k43.f);
            this.F.setDuration(220L);
            this.F.start();
        }
    }

    public final void c(int i, int i2, boolean z) {
        int i3 = this.a;
        if (i3 < 0 || i2 == 0 || this.b == 0) {
            z = false;
        }
        if (!z) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.a = i;
            this.b = i2;
            invalidate();
        } else if (this.b == i2 && (Math.abs(i3 - i) <= 2 || this.h || this.n)) {
            b(i);
        } else {
            ValueAnimator valueAnimator2 = this.F;
            if (valueAnimator2 != null) {
                this.K = 0;
                valueAnimator2.cancel();
            }
            int L = hl.L(8.0f);
            int i4 = L << 1;
            this.w = (getMeasuredHeight() - i4) / Math.min(this.b, 3);
            this.x = (getMeasuredHeight() - i4) / Math.min(i2, 3);
            float f = (this.a - 1) * this.w;
            this.r = f;
            if (f < 0.0f) {
                this.r = 0.0f;
            } else {
                float h = bp1.h(this.b, 1, r4, L) - f;
                int measuredHeight = getMeasuredHeight() - L;
                int i5 = this.w;
                if (h < measuredHeight - i5) {
                    this.r = bp1.h(this.b, 1, i5, L) - ((getMeasuredHeight() - L) - this.w);
                }
            }
            float f2 = (i - 1) * this.x;
            this.s = f2;
            if (f2 < 0.0f) {
                this.s = 0.0f;
            } else {
                int i6 = i2 - 1;
                float f3 = ((r4 * i6) + L) - f2;
                int measuredHeight2 = getMeasuredHeight() - L;
                int i7 = this.x;
                if (f3 < measuredHeight2 - i7) {
                    this.s = ((i6 * i7) + L) - ((getMeasuredHeight() - L) - this.x);
                }
            }
            this.d = this.a;
            this.c = i;
            this.a = i;
            this.e = this.b;
            this.f = i2;
            this.b = i2;
            this.n = true;
            this.h = true;
            this.E = 0.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new fe8(this, (byte) 0));
            this.F.addListener(new ge8(this, (byte) 1));
            this.F.setInterpolator(k43.f);
            this.F.setDuration(220L);
            this.F.start();
        }
        a();
    }

    public final void d() {
        int v0 = aob.v0(aob.Ve, this.M);
        this.L = v0;
        this.I.setColor(vm2.o(v0, (int) ((Color.alpha(v0) / 255.0f) * 112.0f)));
        this.J.setColor(this.L);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float measuredHeight;
        float f;
        RectF rectF;
        float f2;
        super.onDraw(canvas);
        if (this.a < 0 || this.b == 0) {
            return;
        }
        int L = hl.L(8.0f);
        float f3 = 1.0f;
        if (this.n) {
            float f4 = this.w;
            float f5 = this.E;
            measuredHeight = (this.x * f5) + ((1.0f - f5) * f4);
        } else if (this.b == 0) {
            return;
        } else {
            measuredHeight = (getMeasuredHeight() - (L << 1)) / Math.min(this.b, 3);
        }
        if (measuredHeight != 0.0f) {
            float N = hl.N(0.7f);
            if (this.n) {
                float f6 = this.r;
                float f7 = this.E;
                f = (this.s * f7) + ((1.0f - f7) * f6);
            } else {
                if (this.h) {
                    float f8 = (this.d - 1.0f) * measuredHeight;
                    float f9 = this.E;
                    f = ((this.c - 1) * measuredHeight * f9) + ((1.0f - f9) * f8);
                } else {
                    f = (this.a - 1) * measuredHeight;
                }
                if (f < 0.0f) {
                    f = 0.0f;
                } else {
                    float f10 = L;
                    if ((((this.b - 1) * measuredHeight) + f10) - f < (getMeasuredHeight() - L) - measuredHeight) {
                        f = (((this.b - 1) * measuredHeight) + f10) - ((getMeasuredHeight() - L) - measuredHeight);
                    }
                }
            }
            float measuredWidth = getMeasuredWidth() / 2.0f;
            float f11 = L;
            int max = Math.max(0, (int) (((f11 + f) / measuredHeight) - 1.0f));
            int min = Math.min(max + 6, this.n ? Math.max(this.e, this.f) : this.b);
            while (true) {
                rectF = this.y;
                if (max >= min) {
                    break;
                }
                float f12 = ((max * measuredHeight) + f11) - f;
                float f13 = f12 + measuredHeight;
                if (f13 < 0.0f || f12 > getMeasuredHeight()) {
                    f2 = f3;
                } else {
                    rectF.set(0.0f, f12 + N, getMeasuredWidth(), f13 - N);
                    boolean z = this.n;
                    Paint paint = this.I;
                    if (!z) {
                        f2 = f3;
                    } else if (max >= this.f) {
                        f2 = f3;
                        paint.setColor(vm2.o(this.L, (int) ((f2 - this.E) * (Color.alpha(r12) / 255.0f) * 76.0f)));
                        canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                        paint.setColor(vm2.o(this.L, (int) ((Color.alpha(r4) / 255.0f) * 76.0f)));
                    } else {
                        f2 = f3;
                        if (max >= this.e) {
                            paint.setColor(vm2.o(this.L, (int) ((Color.alpha(r4) / 255.0f) * 76.0f * this.E)));
                            canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                            paint.setColor(vm2.o(this.L, (int) ((Color.alpha(r4) / 255.0f) * 76.0f)));
                        }
                    }
                    canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint);
                }
                max++;
                f3 = f2;
            }
            float f14 = f3;
            boolean z2 = this.h;
            Paint paint2 = this.J;
            if (z2) {
                float f15 = this.d;
                float f16 = this.E;
                float f17 = ((((this.c * f16) + ((f14 - f16) * f15)) * measuredHeight) + f11) - f;
                rectF.set(0.0f, f17 + N, getMeasuredWidth(), (f17 + measuredHeight) - N);
                canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
            } else {
                float f18 = ((this.a * measuredHeight) + f11) - f;
                rectF.set(0.0f, f18 + N, getMeasuredWidth(), (f18 + measuredHeight) - N);
                canvas.drawRoundRect(rectF, measuredWidth, measuredWidth, paint2);
            }
            if (this.N) {
                float measuredWidth2 = getMeasuredWidth();
                float L2 = hl.L(6.0f);
                Paint paint3 = this.G;
                canvas.drawRect(0.0f, 0.0f, measuredWidth2, L2, paint3);
                canvas.drawRect(0.0f, getMeasuredHeight() - hl.L(6.0f), getMeasuredWidth(), getMeasuredHeight(), paint3);
                canvas.translate(0.0f, getMeasuredHeight() - hl.L(6.0f));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), hl.L(6.0f), this.H);
            }
        }
    }
}
