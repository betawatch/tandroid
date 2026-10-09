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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public abstract class ez0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public ValueAnimator E;
    public zh.b F;
    public float G;
    public ValueAnimator H;
    public RectF a;
    public dz0[] b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float f;
    public ImageReceiver h;
    public Long n;
    public q6 r;
    public q6 s;
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
            dz0 dz0Var = this.b[i10];
            if (dz0Var != null && (dz0Var.c || f7 > 0)) {
                if (f7 <= 0) {
                    f7 = dz0Var.a;
                }
                j3 += f7;
            }
        }
        return j3;
    }

    public abstract void b();

    public final void c(boolean z10) {
        boolean z11;
        dz0[] dz0VarArr = this.b;
        if (dz0VarArr == null) {
            return;
        }
        long j3 = 0;
        for (int i10 = 0; i10 < dz0VarArr.length; i10++) {
            long f7 = this.F.f(i10);
            dz0 dz0Var = dz0VarArr[i10];
            if (dz0Var != null && (dz0Var.c || f7 > 0)) {
                if (f7 <= 0) {
                    f7 = dz0Var.a;
                }
                j3 += f7;
            }
        }
        this.y = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i11 = 0; i11 < dz0VarArr.length; i11++) {
            long f12 = this.F.f(i11);
            dz0 dz0Var2 = dz0VarArr[i11];
            if (dz0Var2 != null && (dz0Var2.c || f12 > 0)) {
                this.y++;
            }
            if (dz0Var2 == null || (!(z11 = dz0Var2.c) && f12 <= 0)) {
                this.d[i11] = 0.0f;
            } else {
                if (f12 <= 0) {
                    f12 = dz0Var2.a;
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
            for (int i12 = 0; i12 < dz0VarArr.length; i12++) {
                if (dz0VarArr[i12] != null) {
                    float[] fArr = this.d;
                    fArr[i12] = fArr[i12] * f14;
                }
            }
        }
        if (!z10) {
            System.arraycopy(this.d, 0, this.c, 0, dz0VarArr.length);
            return;
        }
        System.arraycopy(this.c, 0, this.e, 0, dz0VarArr.length);
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.E.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new ai.x(16, this, dz0VarArr));
        this.E.addListener(new vd0(dz0VarArr, 19));
        this.E.setDuration(450L);
        this.E.setInterpolator(new u1.a());
        this.E.start();
    }

    public final long d() {
        long a2 = a();
        String[] split = AndroidUtilities.formatFileSize(a2).split(" ");
        if (split.length > 1) {
            this.r.t(a2 == 0 ? " " : split[0], true, false);
            this.s.t(a2 != 0 ? split[1] : " ", true, false);
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
        float f11;
        float f12;
        int i12;
        q6 q6Var = this.s;
        ImageReceiver imageReceiver = this.h;
        q6 q6Var2 = this.r;
        RectF rectF = this.a;
        if (this.b == null) {
            return;
        }
        float f13 = 1.0f;
        float f14 = 0.0f;
        if (imageReceiver != null) {
            canvas.save();
            if (isPressed()) {
                float f15 = this.G;
                if (f15 != 1.0f) {
                    float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f15;
                    this.G = min;
                    this.G = Utilities.clamp(min, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float y3 = com.google.android.gms.internal.vision.e2.y(1.0f, this.G, 0.15f, 0.85f);
            canvas.scale(y3, y3, imageReceiver.getCenterX(), imageReceiver.getCenterY());
        }
        if (this.y > 1) {
            float f16 = this.f;
            if (f16 > 0.0f) {
                float f17 = (float) (f16 - 0.04d);
                this.f = f17;
                if (f17 < 0.0f) {
                    this.f = 0.0f;
                }
            }
        } else {
            float f18 = this.f;
            if (f18 < 1.0f) {
                float f19 = (float) (f18 + 0.04d);
                this.f = f19;
                if (f19 > 1.0f) {
                    this.f = 1.0f;
                }
            }
        }
        boolean z10 = false;
        float f20 = 0.0f;
        int i13 = 0;
        while (true) {
            dz0[] dz0VarArr = this.b;
            i10 = 255;
            f7 = 10.0f;
            f10 = f14;
            if (i13 >= dz0VarArr.length) {
                break;
            }
            dz0 dz0Var = dz0VarArr[i13];
            if (dz0Var != null) {
                float f21 = this.c[i13];
                if (f21 != f10) {
                    if (dz0Var.d) {
                        float y10 = com.google.android.gms.internal.vision.e2.y(f13, this.f, 10.0f, f21 * (-360.0f));
                        if (y10 > f10) {
                            y10 = f10;
                        }
                        ((Paint) dz0Var.e).setColor(org.telegram.ui.ActionBar.i6.x0(null, dz0Var.b, z10));
                        ((Paint) this.b[i13].e).setAlpha(255);
                        double width = rectF.width() / 2.0f;
                        i12 = i13;
                        if (Math.abs((float) (((3.141592653589793d * width) / 180.0d) * y10)) <= f13) {
                            double d = (-90.0f) - (360.0f * f20);
                            canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * width)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * width)), (Paint) this.b[i12].e);
                        } else {
                            ((Paint) this.b[i12].e).setStyle(Paint.Style.STROKE);
                            canvas.drawArc(rectF, (-90.0f) - (360.0f * f20), y10, false, (Paint) this.b[i12].e);
                        }
                    } else {
                        i12 = i13;
                    }
                    f20 += f21;
                    i13 = i12 + 1;
                    f14 = f10;
                    f13 = 1.0f;
                    z10 = false;
                }
            }
            i12 = i13;
            i13 = i12 + 1;
            f14 = f10;
            f13 = 1.0f;
            z10 = false;
        }
        float f22 = f10;
        int i14 = 0;
        while (true) {
            dz0[] dz0VarArr2 = this.b;
            if (i14 >= dz0VarArr2.length) {
                break;
            }
            dz0 dz0Var2 = dz0VarArr2[i14];
            if (dz0Var2 != null) {
                float f23 = this.c[i14];
                if (f23 != f10) {
                    if (dz0Var2.d) {
                        i11 = i10;
                        f11 = f7;
                        f12 = f23;
                    } else {
                        float y11 = com.google.android.gms.internal.vision.e2.y(1.0f, this.f, f7, f23 * (-360.0f));
                        if (y11 > f10) {
                            y11 = f10;
                        }
                        ((Paint) dz0Var2.e).setColor(org.telegram.ui.ActionBar.i6.x0(null, dz0Var2.b, false));
                        ((Paint) this.b[i14].e).setAlpha(i10);
                        double width2 = rectF.width() / 2.0f;
                        f12 = f23;
                        if (Math.abs((float) (y11 * ((width2 * 3.141592653589793d) / 180.0d))) <= 1.0f) {
                            double d10 = (-90.0f) - (f22 * 360.0f);
                            canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d10)) * width2)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d10)) * width2)), (Paint) this.b[i14].e);
                            f11 = 10.0f;
                            i11 = 255;
                        } else {
                            ((Paint) this.b[i14].e).setStyle(Paint.Style.STROKE);
                            f11 = 10.0f;
                            i11 = 255;
                            canvas.drawArc(rectF, (-90.0f) - (f22 * 360.0f), y11, false, (Paint) this.b[i14].e);
                        }
                    }
                    f22 += f12;
                    i14++;
                    f7 = f11;
                    i10 = i11;
                }
            }
            i11 = i10;
            f11 = f7;
            i14++;
            f7 = f11;
            i10 = i11;
        }
        if (imageReceiver != null) {
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        if (q6Var2 != null) {
            int i15 = org.telegram.ui.ActionBar.i6.j5;
            q6Var2.u(org.telegram.ui.ActionBar.i6.x0(null, i15, false));
            q6Var.u(org.telegram.ui.ActionBar.i6.x0(null, i15, false));
            if (this.n != null) {
                float c10 = q6Var.c() + q6Var2.c() + AndroidUtilities.dp(4.0f);
                float width3 = (getWidth() - c10) / 2.0f;
                q6Var2.setBounds(0, AndroidUtilities.dp(115.0f), (int) (q6Var2.c() + width3), AndroidUtilities.dp(145.0f));
                q6Var.setBounds((int) ((width3 + c10) - q6Var.c()), AndroidUtilities.dp(118.0f), getWidth(), AndroidUtilities.dp(148.0f));
            }
            q6Var2.draw(canvas);
            q6Var.draw(canvas);
        }
        if (this.x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(148.0f) - ((this.x.getHeight() - AndroidUtilities.dp(13.0f)) / 2.0f));
            this.w.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.j5, false));
            this.x.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        CharSequence charSequence = this.v;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.a;
        q6 q6Var = this.s;
        q6 q6Var2 = this.r;
        Long l4 = this.n;
        if (l4 != null) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), TLObject.FLAG_30));
            i12 = org.telegram.messenger.bi.A(110.0f, View.MeasureSpec.getSize(i10), 2);
            rectF.set(AndroidUtilities.dp(3.0f) + i12, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f) + i12, AndroidUtilities.dp(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), TLObject.FLAG_30));
            rectF.set(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f), AndroidUtilities.dp(107.0f));
            i12 = 0;
        }
        hs hsVar = hs.h;
        q6Var2.n(0.18f, 300L, hsVar);
        q6Var2.w(AndroidUtilities.dp(24.0f));
        q6Var2.x(AndroidUtilities.bold());
        q6Var.n(0.18f, 300L, hsVar);
        if (l4 != null) {
            q6Var.w(AndroidUtilities.dp(16.0f));
            q6Var2.b = 5;
            q6Var.b = 3;
        } else {
            q6Var.w(AndroidUtilities.dp(13.0f));
            int textSize = (int) q6Var2.a.getTextSize();
            int textSize2 = (int) q6Var.a.getTextSize();
            int dp = ((AndroidUtilities.dp(110.0f) - textSize) - textSize2) / 2;
            int i13 = textSize + dp;
            q6Var2.setBounds(0, dp, getMeasuredWidth(), i13);
            q6Var.setBounds(0, AndroidUtilities.dp(2.0f) + i13, getMeasuredWidth(), AndroidUtilities.dp(2.0f) + i13 + textSize2);
            q6Var2.b = 17;
            q6Var.b = 17;
        }
        if (charSequence != null) {
            if (this.w == null) {
                this.w = new TextPaint(1);
            }
            this.w.setTextSize(AndroidUtilities.dp(13.0f));
            int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(60.0f);
            TextPaint textPaint = this.w;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.x = mx0.d(charSequence, textPaint, false, size, 1);
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
                AndroidUtilities.runOnUIThread(new or0(this, 10), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(zh.b bVar) {
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
                ofFloat.addUpdateListener(new j80(this, 26));
                this.H.addListener(new vd0(this, 20));
                org.telegram.messenger.bi.l(2.0f, this.H);
                this.H.setDuration(350L);
                this.H.start();
            }
        }
    }
}
