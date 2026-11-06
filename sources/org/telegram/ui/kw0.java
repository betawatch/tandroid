package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.View;
import java.util.Arrays;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class kw0 extends View implements org.telegram.ui.Components.of0 {
    public final float[] D;
    public boolean E;
    public float F;
    public float G;
    public float[] H;
    public long I;
    public float J;
    public int K;
    public float L;
    public int M;
    public float N;
    public int O;
    public final /* synthetic */ ProfileActivity P;
    public final int a;
    public final Rect b;
    public final Rect c;
    public final RectF d;
    public final GradientDrawable e;
    public final GradientDrawable f;
    public final ValueAnimator h;
    public final float[] n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final GradientDrawable[] x;
    public final boolean[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kw0(ProfileActivity profileActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        int i10;
        boolean z9;
        this.P = profileActivity;
        kVar = ((org.telegram.ui.ActionBar.f2) profileActivity).actionBar;
        if (kVar.getOccupyStatusBar()) {
            z9 = ((org.telegram.ui.ActionBar.f2) profileActivity).inBubbleMode;
            if (!z9) {
                i7 = org.telegram.messenger.g0.m;
                this.a = i7;
                this.b = new Rect();
                this.c = new Rect();
                this.d = new RectF();
                this.n = new float[]{0.0f, 1.0f};
                this.x = new GradientDrawable[2];
                this.y = new boolean[2];
                this.D = new float[2];
                this.G = 0.0f;
                this.H = null;
                this.K = -1;
                this.O = 1;
                setVisibility(8);
                Paint paint = new Paint(1);
                this.s = paint;
                paint.setColor(1442840575);
                Paint paint2 = new Paint(1);
                this.w = paint2;
                paint2.setColor(-1);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
                this.e = gradientDrawable;
                gradientDrawable.setShape(0);
                GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
                this.f = gradientDrawable2;
                gradientDrawable2.setShape(0);
                i10 = 0;
                while (i10 < 2) {
                    this.x[i10] = new GradientDrawable(i10 == 0 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
                    this.x[i10].setShape(0);
                    i10++;
                }
                Paint paint3 = new Paint(1);
                this.r = paint3;
                paint3.setColor(-16777216);
                paint3.setAlpha(66);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.Components.xq.j);
                ofFloat.addUpdateListener(new a3(this, 26));
                ofFloat.addListener(new d30(this, 22));
            }
        }
        i7 = 0;
        this.a = i7;
        this.b = new Rect();
        this.c = new Rect();
        this.d = new RectF();
        this.n = new float[]{0.0f, 1.0f};
        this.x = new GradientDrawable[2];
        this.y = new boolean[2];
        this.D = new float[2];
        this.G = 0.0f;
        this.H = null;
        this.K = -1;
        this.O = 1;
        setVisibility(8);
        Paint paint4 = new Paint(1);
        this.s = paint4;
        paint4.setColor(1442840575);
        Paint paint22 = new Paint(1);
        this.w = paint22;
        paint22.setColor(-1);
        GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.e = gradientDrawable3;
        gradientDrawable3.setShape(0);
        GradientDrawable gradientDrawable22 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.f = gradientDrawable22;
        gradientDrawable22.setShape(0);
        i10 = 0;
        while (i10 < 2) {
        }
        Paint paint32 = new Paint(1);
        this.r = paint32;
        paint32.setColor(-16777216);
        paint32.setAlpha(66);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat2;
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(org.telegram.ui.Components.xq.j);
        ofFloat2.addUpdateListener(new a3(this, 26));
        ofFloat2.addListener(new d30(this, 22));
    }

    @Override // org.telegram.ui.Components.of0
    public final void a() {
        Arrays.fill(this.y, false);
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.of0
    public final void b(boolean z9) {
        this.y[!z9 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.of0
    public final void c() {
        RectF rectF = ProfileActivity.S6;
        this.P.I5(false);
    }

    @Override // org.telegram.ui.Components.of0
    public final void d() {
        invalidate();
    }

    public final void e(boolean z9, float f10) {
        int i7 = (int) (255.0f * f10);
        this.e.setAlpha(i7);
        this.f.setAlpha(i7);
        this.r.setAlpha((int) (66.0f * f10));
        this.s.setAlpha((int) (85.0f * f10));
        this.w.setAlpha(i7);
        this.G = f10;
        if (!z9) {
            this.F = f10;
        }
        invalidate();
    }

    public final void f(boolean z9, float f10) {
        if (z9 != this.E) {
            this.E = z9;
            ValueAnimator valueAnimator = this.h;
            valueAnimator.cancel();
            float f11 = this.F;
            float[] fArr = this.n;
            float U1 = org.telegram.messenger.g0.U1(f11, fArr);
            if (z9) {
                valueAnimator.setDuration((long) (((1.0f - U1) * 250.0f) / f10));
            } else {
                valueAnimator.setDuration((long) ((250.0f * U1) / f10));
            }
            fArr[0] = U1;
            fArr[1] = z9 ? 1.0f : 0.0f;
            valueAnimator.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float[] fArr;
        float f10;
        float[] fArr2;
        float f11;
        boolean z9;
        boolean z10;
        Paint paint;
        float[] fArr3;
        int i7;
        int i10;
        long j3;
        float f12;
        int i11 = 0;
        while (true) {
            fArr = this.D;
            f10 = 0.0f;
            if (i11 >= 2) {
                break;
            }
            float f13 = fArr[i11];
            if (f13 > 0.0f) {
                GradientDrawable[] gradientDrawableArr = this.x;
                gradientDrawableArr[i11].setAlpha((int) (f13 * 255.0f));
                gradientDrawableArr[i11].draw(canvas);
            }
            i11++;
        }
        this.e.draw(canvas);
        this.f.draw(canvas);
        Rect rect = this.b;
        Paint paint2 = this.r;
        canvas.drawRect(rect, paint2);
        canvas.drawRect(this.c, paint2);
        ProfileActivity profileActivity = this.P;
        int realCount = profileActivity.n0.getRealCount();
        this.M = profileActivity.n0.getRealPosition();
        float[] fArr4 = this.H;
        if (fArr4 == null || fArr4.length != realCount) {
            float[] fArr5 = new float[realCount];
            this.H = fArr5;
            Arrays.fill(fArr5, 0.0f);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.I;
        if (j10 < 0 || j10 > 20) {
            j10 = 17;
        }
        this.I = elapsedRealtime;
        float f14 = 1.0f;
        if (realCount <= 1 || realCount > 20) {
            fArr2 = fArr;
            f11 = 180.0f;
            z9 = false;
        } else {
            int i12 = profileActivity.A0;
            if (i12 == 0) {
                this.G = 0.0f;
                profileActivity.A0 = 3;
            } else if (i12 == 1) {
                this.G = 0.0f;
                profileActivity.A0 = 2;
            }
            int i13 = profileActivity.A0;
            Paint paint3 = this.w;
            Paint paint4 = this.s;
            if (i13 == 2) {
                paint4.setAlpha((int) (this.G * 85.0f));
                paint3.setAlpha((int) (this.G * 255.0f));
            }
            f11 = 180.0f;
            int y10 = org.telegram.messenger.camera.q.y((realCount - 1) * 2, getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f), realCount);
            int L = org.telegram.messenger.g0.L(1.0f);
            z10 = ((org.telegram.ui.ActionBar.f2) profileActivity).inBubbleMode;
            int i14 = L + (!z10 ? org.telegram.messenger.g0.m : 0);
            int i15 = 0;
            z9 = false;
            while (i15 < realCount) {
                int L2 = (y10 * i15) + org.telegram.messenger.g0.L((i15 * 2) + 5);
                int i16 = this.K;
                float f15 = f10;
                RectF rectF = this.d;
                if (i15 != i16 || Math.abs(this.J - f14) <= 1.0E-4f) {
                    paint = paint3;
                    fArr3 = fArr;
                    i7 = realCount;
                    float f16 = f14;
                    i10 = 85;
                    if (i15 != this.M) {
                        j3 = j10;
                    } else if (profileActivity.n0.I()) {
                        f12 = profileActivity.n0.getCurrentItemProgress();
                        this.L = f12;
                        if ((f12 > f15 || !profileActivity.n0.J()) && this.N <= f15) {
                            j3 = j10;
                        } else {
                            float f17 = this.N;
                            int i17 = this.O;
                            j3 = j10;
                            float f18 = ((i17 * j3) / 500.0f) + f17;
                            this.N = f18;
                            if (f18 > f16) {
                                this.N = f16;
                                this.O = i17 * (-1);
                            } else if (f18 <= f15) {
                                this.N = f15;
                                this.O = i17 * (-1);
                            }
                        }
                        rectF.set(L2, i14, L2 + y10, org.telegram.messenger.g0.L(2.0f) + i14);
                        paint4.setAlpha((int) (((this.N * 48.0f) + 85.0f) * this.G));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint4);
                    } else {
                        j3 = j10;
                        this.L = f16;
                    }
                    f12 = 1.0f;
                    float f19 = L2;
                    rectF.set(f19, i14, (y10 * f12) + f19, org.telegram.messenger.g0.L(2.0f) + i14);
                    if (i15 != this.M) {
                        this.H[i15] = 0.75f;
                    } else if (profileActivity.A0 == 3) {
                        paint4.setAlpha((int) (org.telegram.messenger.g0.W1(org.telegram.ui.Components.xq.j.getInterpolation(this.H[i15]), i10, org.telegram.messenger.qs.e4) * this.G));
                    }
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), i15 != this.M ? paint : paint4);
                    i15++;
                    paint3 = paint;
                    fArr = fArr3;
                    realCount = i7;
                    j10 = j3;
                    f10 = 0.0f;
                    f14 = 1.0f;
                } else {
                    float f20 = this.J;
                    canvas.save();
                    float f21 = f14;
                    float f22 = L2;
                    paint = paint3;
                    fArr3 = fArr;
                    float f23 = i14;
                    i7 = realCount;
                    float f24 = L2 + y10;
                    canvas.clipRect((y10 * f20) + f22, f23, f24, org.telegram.messenger.g0.L(2.0f) + i14);
                    rectF.set(f22, f23, f24, org.telegram.messenger.g0.L(2.0f) + i14);
                    paint4.setAlpha((int) (this.G * 85.0f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f21), org.telegram.messenger.g0.L(f21), paint4);
                    canvas.restore();
                    j3 = j10;
                    f12 = f20;
                }
                i10 = 80;
                z9 = true;
                float f192 = L2;
                rectF.set(f192, i14, (y10 * f12) + f192, org.telegram.messenger.g0.L(2.0f) + i14);
                if (i15 != this.M) {
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), i15 != this.M ? paint : paint4);
                i15++;
                paint3 = paint;
                fArr = fArr3;
                realCount = i7;
                j10 = j3;
                f10 = 0.0f;
                f14 = 1.0f;
            }
            fArr2 = fArr;
            long j11 = j10;
            int i18 = profileActivity.A0;
            if (i18 == 2) {
                float f25 = this.G;
                if (f25 < 1.0f) {
                    j10 = j11;
                    float f26 = (j10 / 180.0f) + f25;
                    this.G = f26;
                    if (f26 > 1.0f) {
                        this.G = 1.0f;
                    }
                    z9 = true;
                } else {
                    j10 = j11;
                    profileActivity.A0 = 3;
                }
            } else {
                j10 = j11;
                if (i18 == 3) {
                    int i19 = 0;
                    while (true) {
                        float[] fArr6 = this.H;
                        if (i19 >= fArr6.length) {
                            break;
                        }
                        if (i19 != this.M) {
                            float f27 = fArr6[i19];
                            if (f27 > 0.0f) {
                                float f28 = f27 - (j10 / 500.0f);
                                fArr6[i19] = f28;
                                if (f28 <= 0.0f) {
                                    fArr6[i19] = 0.0f;
                                    if (i19 == this.K) {
                                        this.K = -1;
                                    }
                                }
                                z9 = true;
                                i19++;
                            }
                        }
                        if (i19 == this.K) {
                            this.K = -1;
                        }
                        i19++;
                    }
                }
            }
        }
        for (int i20 = 0; i20 < 2; i20++) {
            if (this.y[i20]) {
                float f29 = fArr2[i20];
                if (f29 < 1.0f) {
                    float f30 = (j10 / f11) + f29;
                    fArr2[i20] = f30;
                    if (f30 > 1.0f) {
                        fArr2[i20] = 1.0f;
                    }
                    z9 = true;
                }
            } else {
                float f31 = fArr2[i20];
                if (f31 > 0.0f) {
                    float f32 = f31 - (j10 / f11);
                    fArr2[i20] = f32;
                    if (f32 < 0.0f) {
                        fArr2[i20] = 0.0f;
                    }
                    z9 = true;
                }
            }
        }
        if (z9) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.a;
        Rect rect = this.b;
        rect.set(0, 0, i7, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.c;
        rect2.set(0, (int) (i10 - (org.telegram.messenger.g0.L(72.0f) * 0.5f)), i7, i10);
        this.e.setBounds(0, rect.bottom, i7, org.telegram.messenger.g0.L(16.0f) + currentActionBarHeight);
        RectF rectF = ProfileActivity.S6;
        this.f.setBounds(0, ((i10 - this.P.e4()) - org.telegram.messenger.g0.L(72.0f)) - org.telegram.messenger.g0.L(24.0f), i7, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.x;
        int i13 = i7 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i13, i10);
        gradientDrawableArr[1].setBounds(i7 - i13, 0, i7, i10);
    }
}
