package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class vx0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public ValueAnimator A;
    public kh.b B;
    public float C;
    public ValueAnimator D;
    public RectF a;
    public ux0[] b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float f;
    public ImageReceiver h;
    public Long n;
    public n6 r;
    public n6 s;
    public CharSequence v;
    public TextPaint w;
    public StaticLayout x;
    public int y;

    public final long a() {
        if (this.b == null) {
            return 0L;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < this.b.length; i10++) {
            long f9 = this.B.f(i10);
            ux0 ux0Var = this.b[i10];
            if (ux0Var != null && (ux0Var.c || f9 > 0)) {
                if (f9 <= 0) {
                    f9 = ux0Var.e;
                }
                j10 += f9;
            }
        }
        return j10;
    }

    public abstract void b();

    public final void c(boolean z10) {
        boolean z11;
        ux0[] ux0VarArr = this.b;
        if (ux0VarArr == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < ux0VarArr.length; i10++) {
            long f9 = this.B.f(i10);
            ux0 ux0Var = ux0VarArr[i10];
            if (ux0Var != null && (ux0Var.c || f9 > 0)) {
                if (f9 <= 0) {
                    f9 = ux0Var.e;
                }
                j10 += f9;
            }
        }
        this.y = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < ux0VarArr.length; i11++) {
            long f12 = this.B.f(i11);
            ux0 ux0Var2 = ux0VarArr[i11];
            if (ux0Var2 != null && (ux0Var2.c || f12 > 0)) {
                this.y++;
            }
            if (ux0Var2 == null || (!(z11 = ux0Var2.c) && f12 <= 0)) {
                this.d[i11] = 0.0f;
            } else {
                if (f12 <= 0) {
                    f12 = ux0Var2.e;
                }
                float f13 = f12 / j10;
                if (f13 < 0.02777f) {
                    f13 = 0.02777f;
                }
                f10 += f13;
                if (f13 > f11 && (z11 || f12 > 0)) {
                    f11 = f13;
                }
                this.d[i11] = f13;
            }
        }
        if (f10 > 1.0f) {
            float f14 = 1.0f / f10;
            for (int i12 = 0; i12 < ux0VarArr.length; i12++) {
                if (ux0VarArr[i12] != null) {
                    float[] fArr = this.d;
                    fArr[i12] = fArr[i12] * f14;
                }
            }
        }
        if (!z10) {
            System.arraycopy(this.d, 0, this.c, 0, ux0VarArr.length);
            return;
        }
        System.arraycopy(this.c, 0, this.e, 0, ux0VarArr.length);
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.A.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new bg.b3(14, this, ux0VarArr));
        this.A.addListener(new zz(ux0VarArr, 26));
        this.A.setDuration(450L);
        this.A.setInterpolator(new u1.a());
        this.A.start();
    }

    public final long d() {
        long a2 = a();
        String[] split = AndroidUtilities.formatFileSize(a2).split(" ");
        if (split.length > 1) {
            this.r.q(a2 == 0 ? " " : split[0], true, false);
            this.s.q(a2 != 0 ? split[1] : " ", true, false);
        }
        return a2;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        float f9;
        float f10;
        int i11;
        n6 n6Var = this.s;
        ImageReceiver imageReceiver = this.h;
        n6 n6Var2 = this.r;
        RectF rectF = this.a;
        if (this.b == null) {
            return;
        }
        float f11 = 1.0f;
        if (imageReceiver != null) {
            canvas.save();
            if (isPressed()) {
                float f12 = this.C;
                if (f12 != 1.0f) {
                    float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f12;
                    this.C = min;
                    this.C = Utilities.clamp(min, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float z10 = com.google.android.recaptcha.internal.a.z(1.0f, this.C, 0.15f, 0.85f);
            canvas.scale(z10, z10, imageReceiver.getCenterX(), imageReceiver.getCenterY());
        }
        if (this.y > 1) {
            float f13 = this.f;
            if (f13 > 0.0f) {
                float f14 = (float) (f13 - 0.04d);
                this.f = f14;
                if (f14 < 0.0f) {
                    this.f = 0.0f;
                }
            }
        } else {
            float f15 = this.f;
            if (f15 < 1.0f) {
                float f16 = (float) (f15 + 0.04d);
                this.f = f16;
                if (f16 > 1.0f) {
                    this.f = 1.0f;
                }
            }
        }
        boolean z11 = false;
        int i12 = 0;
        float f17 = 0.0f;
        while (true) {
            ux0[] ux0VarArr = this.b;
            i10 = 255;
            f9 = 10.0f;
            if (i12 >= ux0VarArr.length) {
                break;
            }
            ux0 ux0Var = ux0VarArr[i12];
            if (ux0Var != null) {
                float f18 = this.c[i12];
                if (f18 != 0.0f) {
                    if (ux0Var.d) {
                        float z12 = com.google.android.recaptcha.internal.a.z(f11, this.f, 10.0f, f18 * (-360.0f));
                        if (z12 > 0.0f) {
                            z12 = 0.0f;
                        }
                        ux0Var.b.setColor(org.telegram.ui.ActionBar.g6.w0(null, ux0Var.a, z11));
                        this.b[i12].b.setAlpha(255);
                        double width = rectF.width() / 2.0f;
                        i11 = i12;
                        if (Math.abs((float) (((3.141592653589793d * width) / 180.0d) * z12)) <= f11) {
                            double d = (-90.0f) - (360.0f * f17);
                            canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * width)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * width)), this.b[i11].b);
                        } else {
                            this.b[i11].b.setStyle(Paint.Style.STROKE);
                            canvas.drawArc(rectF, (-90.0f) - (360.0f * f17), z12, false, this.b[i11].b);
                        }
                    } else {
                        i11 = i12;
                    }
                    f17 += f18;
                    i12 = i11 + 1;
                    f11 = 1.0f;
                    z11 = false;
                }
            }
            i11 = i12;
            i12 = i11 + 1;
            f11 = 1.0f;
            z11 = false;
        }
        int i13 = 0;
        float f19 = 0.0f;
        while (true) {
            ux0[] ux0VarArr2 = this.b;
            if (i13 >= ux0VarArr2.length) {
                break;
            }
            ux0 ux0Var2 = ux0VarArr2[i13];
            if (ux0Var2 != null) {
                float f20 = this.c[i13];
                if (f20 != 0.0f) {
                    if (ux0Var2.d) {
                        f10 = f20;
                    } else {
                        float z13 = com.google.android.recaptcha.internal.a.z(1.0f, this.f, f9, f20 * (-360.0f));
                        if (z13 > 0.0f) {
                            z13 = 0.0f;
                        }
                        ux0Var2.b.setColor(org.telegram.ui.ActionBar.g6.w0(null, ux0Var2.a, false));
                        this.b[i13].b.setAlpha(i10);
                        double width2 = rectF.width() / 2.0f;
                        f10 = f20;
                        if (Math.abs((float) (z13 * ((width2 * 3.141592653589793d) / 180.0d))) <= 1.0f) {
                            double d10 = (-90.0f) - (f19 * 360.0f);
                            canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d10)) * width2)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d10)) * width2)), this.b[i13].b);
                        } else {
                            this.b[i13].b.setStyle(Paint.Style.STROKE);
                            canvas.drawArc(rectF, (-90.0f) - (f19 * 360.0f), z13, false, this.b[i13].b);
                            f19 += f10;
                            i13++;
                            i10 = 255;
                            f9 = 10.0f;
                        }
                    }
                    f19 += f10;
                    i13++;
                    i10 = 255;
                    f9 = 10.0f;
                }
            }
            i13++;
            i10 = 255;
            f9 = 10.0f;
        }
        if (imageReceiver != null) {
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        if (n6Var2 != null) {
            int i14 = org.telegram.ui.ActionBar.g6.j5;
            n6Var2.r(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            n6Var.r(org.telegram.ui.ActionBar.g6.w0(null, i14, false));
            if (this.n != null) {
                float d11 = n6Var.d() + n6Var2.d() + AndroidUtilities.dp(4.0f);
                float width3 = (getWidth() - d11) / 2.0f;
                n6Var2.setBounds(0, AndroidUtilities.dp(115.0f), (int) (n6Var2.d() + width3), AndroidUtilities.dp(145.0f));
                n6Var.setBounds((int) ((width3 + d11) - n6Var.d()), AndroidUtilities.dp(118.0f), getWidth(), AndroidUtilities.dp(148.0f));
            }
            n6Var2.draw(canvas);
            n6Var.draw(canvas);
        }
        if (this.x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(148.0f) - ((this.x.getHeight() - AndroidUtilities.dp(13.0f)) / 2.0f));
            this.w.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
            this.x.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.a;
        n6 n6Var = this.s;
        n6 n6Var2 = this.r;
        Long l10 = this.n;
        if (l10 != null) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), TLObject.FLAG_30));
            i12 = org.telegram.ui.b.x(110.0f, View.MeasureSpec.getSize(i10), 2);
            rectF.set(AndroidUtilities.dp(3.0f) + i12, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f) + i12, AndroidUtilities.dp(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), TLObject.FLAG_30));
            rectF.set(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f), AndroidUtilities.dp(107.0f));
            i12 = 0;
        }
        jr jrVar = jr.h;
        n6Var2.k(0.18f, 300L, jrVar);
        n6Var2.t(AndroidUtilities.dp(24.0f));
        n6Var2.u(AndroidUtilities.bold());
        n6Var.k(0.18f, 300L, jrVar);
        if (l10 != null) {
            n6Var.t(AndroidUtilities.dp(16.0f));
            n6Var2.b = 5;
            n6Var.b = 3;
        } else {
            n6Var.t(AndroidUtilities.dp(13.0f));
            int textSize = (int) n6Var2.a.getTextSize();
            int textSize2 = (int) n6Var.a.getTextSize();
            int dp = ((AndroidUtilities.dp(110.0f) - textSize) - textSize2) / 2;
            int i13 = textSize + dp;
            n6Var2.setBounds(0, dp, getMeasuredWidth(), i13);
            n6Var.setBounds(0, AndroidUtilities.dp(2.0f) + i13, getMeasuredWidth(), AndroidUtilities.dp(2.0f) + i13 + textSize2);
            n6Var2.b = 17;
            n6Var.b = 17;
        }
        if (this.v != null) {
            if (this.w == null) {
                this.w = new TextPaint(1);
            }
            this.w.setTextSize(AndroidUtilities.dp(13.0f));
            int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(60.0f);
            CharSequence charSequence = this.v;
            TextPaint textPaint = this.w;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.x = bw0.d(charSequence, textPaint, size, false, size, 1);
        }
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(AndroidUtilities.dp(10.0f) + i12, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            imageReceiver.setRoundRadius(AndroidUtilities.dp(45.0f));
        }
        d();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Long l10;
        ImageReceiver imageReceiver = this.h;
        boolean z10 = imageReceiver != null && (l10 = this.n) != null && l10.longValue() != Long.MAX_VALUE && motionEvent.getX() > imageReceiver.getImageX() && motionEvent.getX() <= imageReceiver.getImageX2() && motionEvent.getY() > imageReceiver.getImageY() && motionEvent.getY() <= imageReceiver.getImageY2();
        if (motionEvent.getAction() == 0) {
            if (z10) {
                setPressed(true);
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (z10 && motionEvent.getAction() != 3) {
                AndroidUtilities.runOnUIThread(new fq0(this, 10), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(kh.b bVar) {
        this.B = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.D) != null) {
                valueAnimator.removeAllListeners();
                this.D.cancel();
            }
            if (z10) {
                return;
            }
            float f9 = this.C;
            if (f9 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, 0.0f);
                this.D = ofFloat;
                ofFloat.addUpdateListener(new d70(this, 25));
                this.D.addListener(new zz(this, 27));
                this.D.setInterpolator(new OvershootInterpolator(2.0f));
                this.D.setDuration(350L);
                this.D.start();
            }
        }
    }
}
