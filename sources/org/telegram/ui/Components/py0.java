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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class py0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public ValueAnimator E;
    public yh.b F;
    public float G;
    public ValueAnimator H;
    public RectF a;
    public oy0[] b;
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
        long j3 = 0;
        for (int i10 = 0; i10 < this.b.length; i10++) {
            long f7 = this.F.f(i10);
            oy0 oy0Var = this.b[i10];
            if (oy0Var != null && (oy0Var.c || f7 > 0)) {
                if (f7 <= 0) {
                    f7 = oy0Var.e;
                }
                j3 += f7;
            }
        }
        return j3;
    }

    public abstract void b();

    public final void c(boolean z10) {
        boolean z11;
        oy0[] oy0VarArr = this.b;
        if (oy0VarArr == null) {
            return;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < oy0VarArr.length; i10++) {
            long f7 = this.F.f(i10);
            oy0 oy0Var = oy0VarArr[i10];
            if (oy0Var != null && (oy0Var.c || f7 > 0)) {
                if (f7 <= 0) {
                    f7 = oy0Var.e;
                }
                j3 += f7;
            }
        }
        this.y = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < oy0VarArr.length; i11++) {
            long f12 = this.F.f(i11);
            oy0 oy0Var2 = oy0VarArr[i11];
            if (oy0Var2 != null && (oy0Var2.c || f12 > 0)) {
                this.y++;
            }
            if (oy0Var2 == null || (!(z11 = oy0Var2.c) && f12 <= 0)) {
                this.d[i11] = 0.0f;
            } else {
                if (f12 <= 0) {
                    f12 = oy0Var2.e;
                }
                float f13 = f12 / j3;
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
            for (int i12 = 0; i12 < oy0VarArr.length; i12++) {
                if (oy0VarArr[i12] != null) {
                    float[] fArr = this.d;
                    fArr[i12] = fArr[i12] * f14;
                }
            }
        }
        if (!z10) {
            System.arraycopy(this.d, 0, this.c, 0, oy0VarArr.length);
            return;
        }
        System.arraycopy(this.c, 0, this.e, 0, oy0VarArr.length);
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.E.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new gg.t1(14, this, oy0VarArr));
        this.E.addListener(new zn0(oy0VarArr, 8));
        this.E.setDuration(450L);
        this.E.setInterpolator(new u1.a());
        this.E.start();
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
        float f7;
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
                float f12 = this.G;
                if (f12 != 1.0f) {
                    float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f12;
                    this.G = min;
                    this.G = Utilities.clamp(min, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.G, 0.15f, 0.85f);
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
            oy0[] oy0VarArr = this.b;
            i10 = 255;
            f7 = 10.0f;
            if (i12 >= oy0VarArr.length) {
                break;
            }
            oy0 oy0Var = oy0VarArr[i12];
            if (oy0Var != null) {
                float f18 = this.c[i12];
                if (f18 != 0.0f) {
                    if (oy0Var.d) {
                        float z12 = com.google.android.gms.internal.vision.e2.z(f11, this.f, 10.0f, f18 * (-360.0f));
                        if (z12 > 0.0f) {
                            z12 = 0.0f;
                        }
                        oy0Var.b.setColor(org.telegram.ui.ActionBar.j6.w0(null, oy0Var.a, z11));
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
            oy0[] oy0VarArr2 = this.b;
            if (i13 >= oy0VarArr2.length) {
                break;
            }
            oy0 oy0Var2 = oy0VarArr2[i13];
            if (oy0Var2 != null) {
                float f20 = this.c[i13];
                if (f20 != 0.0f) {
                    if (oy0Var2.d) {
                        f10 = f20;
                    } else {
                        float z13 = com.google.android.gms.internal.vision.e2.z(1.0f, this.f, f7, f20 * (-360.0f));
                        if (z13 > 0.0f) {
                            z13 = 0.0f;
                        }
                        oy0Var2.b.setColor(org.telegram.ui.ActionBar.j6.w0(null, oy0Var2.a, false));
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
                            f7 = 10.0f;
                        }
                    }
                    f19 += f10;
                    i13++;
                    i10 = 255;
                    f7 = 10.0f;
                }
            }
            i13++;
            i10 = 255;
            f7 = 10.0f;
        }
        if (imageReceiver != null) {
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        if (n6Var2 != null) {
            int i14 = org.telegram.ui.ActionBar.j6.j5;
            n6Var2.r(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
            n6Var.r(org.telegram.ui.ActionBar.j6.w0(null, i14, false));
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
            this.w.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
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
        Long l4 = this.n;
        if (l4 != null) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), TLObject.FLAG_30));
            i12 = org.telegram.messenger.em.y(110.0f, View.MeasureSpec.getSize(i10), 2);
            rectF.set(AndroidUtilities.dp(3.0f) + i12, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f) + i12, AndroidUtilities.dp(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), TLObject.FLAG_30));
            rectF.set(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f), AndroidUtilities.dp(107.0f));
            i12 = 0;
        }
        wr wrVar = wr.h;
        n6Var2.k(0.18f, 300L, wrVar);
        n6Var2.t(AndroidUtilities.dp(24.0f));
        n6Var2.u(AndroidUtilities.bold());
        n6Var.k(0.18f, 300L, wrVar);
        if (l4 != null) {
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
            this.x = uw0.d(charSequence, textPaint, size, false, size, 1);
        }
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(AndroidUtilities.dp(10.0f) + i12, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
            imageReceiver.setRoundRadius(AndroidUtilities.dp(45.0f));
        }
        d();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Long l4;
        ImageReceiver imageReceiver = this.h;
        boolean z10 = imageReceiver != null && (l4 = this.n) != null && l4.longValue() != Long.MAX_VALUE && motionEvent.getX() > imageReceiver.getImageX() && motionEvent.getX() <= imageReceiver.getImageX2() && motionEvent.getY() > imageReceiver.getImageY() && motionEvent.getY() <= imageReceiver.getImageY2();
        if (motionEvent.getAction() == 0) {
            if (z10) {
                setPressed(true);
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (z10 && motionEvent.getAction() != 3) {
                AndroidUtilities.runOnUIThread(new uq0(this, 10), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(yh.b bVar) {
        this.F = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.H) != null) {
                valueAnimator.removeAllListeners();
                this.H.cancel();
            }
            if (z10) {
                return;
            }
            float f7 = this.G;
            if (f7 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                this.H = ofFloat;
                ofFloat.addUpdateListener(new q70(this, 25));
                this.H.addListener(new zn0(this, 9));
                this.H.setInterpolator(new OvershootInterpolator(2.0f));
                this.H.setDuration(350L);
                this.H.start();
            }
        }
    }
}
