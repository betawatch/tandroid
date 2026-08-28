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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class kx0 extends View implements NotificationCenter.NotificationCenterDelegate {
    public ValueAnimator A;
    public hh.b B;
    public float C;
    public ValueAnimator D;
    public RectF a;
    public jx0[] b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float f;
    public ImageReceiver h;
    public Long n;
    public i6 r;
    public i6 s;
    public CharSequence v;
    public TextPaint w;
    public StaticLayout x;
    public int y;

    public final long a() {
        if (this.b == null) {
            return 0L;
        }
        long j10 = 0;
        for (int i9 = 0; i9 < this.b.length; i9++) {
            long f10 = this.B.f(i9);
            jx0 jx0Var = this.b[i9];
            if (jx0Var != null && (jx0Var.c || f10 > 0)) {
                if (f10 <= 0) {
                    f10 = jx0Var.e;
                }
                j10 += f10;
            }
        }
        return j10;
    }

    public abstract void b();

    public final void c(boolean z10) {
        boolean z11;
        jx0[] jx0VarArr = this.b;
        if (jx0VarArr == null) {
            return;
        }
        long j10 = 0;
        for (int i9 = 0; i9 < jx0VarArr.length; i9++) {
            long f10 = this.B.f(i9);
            jx0 jx0Var = jx0VarArr[i9];
            if (jx0Var != null && (jx0Var.c || f10 > 0)) {
                if (f10 <= 0) {
                    f10 = jx0Var.e;
                }
                j10 += f10;
            }
        }
        this.y = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i10 = 0; i10 < jx0VarArr.length; i10++) {
            long f13 = this.B.f(i10);
            jx0 jx0Var2 = jx0VarArr[i10];
            if (jx0Var2 != null && (jx0Var2.c || f13 > 0)) {
                this.y++;
            }
            if (jx0Var2 == null || (!(z11 = jx0Var2.c) && f13 <= 0)) {
                this.d[i10] = 0.0f;
            } else {
                if (f13 <= 0) {
                    f13 = jx0Var2.e;
                }
                float f14 = f13 / j10;
                if (f14 < 0.02777f) {
                    f14 = 0.02777f;
                }
                f11 += f14;
                if (f14 > f12 && (z11 || f13 > 0)) {
                    f12 = f14;
                }
                this.d[i10] = f14;
            }
        }
        if (f11 > 1.0f) {
            float f15 = 1.0f / f11;
            for (int i11 = 0; i11 < jx0VarArr.length; i11++) {
                if (jx0VarArr[i11] != null) {
                    float[] fArr = this.d;
                    fArr[i11] = fArr[i11] * f15;
                }
            }
        }
        if (!z10) {
            System.arraycopy(this.d, 0, this.c, 0, jx0VarArr.length);
            return;
        }
        System.arraycopy(this.c, 0, this.e, 0, jx0VarArr.length);
        ValueAnimator valueAnimator = this.A;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.A.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A = ofFloat;
        ofFloat.addUpdateListener(new f2.g(12, this, jx0VarArr));
        this.A.addListener(new r60(jx0VarArr, 24));
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
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
        int i9;
        float f10;
        float f11;
        int i10;
        i6 i6Var = this.s;
        ImageReceiver imageReceiver = this.h;
        i6 i6Var2 = this.r;
        RectF rectF = this.a;
        if (this.b == null) {
            return;
        }
        float f12 = 1.0f;
        if (imageReceiver != null) {
            canvas.save();
            if (isPressed()) {
                float f13 = this.C;
                if (f13 != 1.0f) {
                    float min = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f13;
                    this.C = min;
                    this.C = Utilities.clamp(min, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float z10 = e2.c.z(1.0f, this.C, 0.15f, 0.85f);
            canvas.scale(z10, z10, imageReceiver.getCenterX(), imageReceiver.getCenterY());
        }
        if (this.y > 1) {
            float f14 = this.f;
            if (f14 > 0.0f) {
                float f15 = (float) (f14 - 0.04d);
                this.f = f15;
                if (f15 < 0.0f) {
                    this.f = 0.0f;
                }
            }
        } else {
            float f16 = this.f;
            if (f16 < 1.0f) {
                float f17 = (float) (f16 + 0.04d);
                this.f = f17;
                if (f17 > 1.0f) {
                    this.f = 1.0f;
                }
            }
        }
        boolean z11 = false;
        int i11 = 0;
        float f18 = 0.0f;
        while (true) {
            jx0[] jx0VarArr = this.b;
            i9 = 255;
            f10 = 10.0f;
            if (i11 >= jx0VarArr.length) {
                break;
            }
            jx0 jx0Var = jx0VarArr[i11];
            if (jx0Var != null) {
                float f19 = this.c[i11];
                if (f19 != 0.0f) {
                    if (jx0Var.d) {
                        float z12 = e2.c.z(f12, this.f, 10.0f, f19 * (-360.0f));
                        if (z12 > 0.0f) {
                            z12 = 0.0f;
                        }
                        jx0Var.b.setColor(org.telegram.ui.ActionBar.f6.w0(null, jx0Var.a, z11));
                        this.b[i11].b.setAlpha(255);
                        double width = rectF.width() / 2.0f;
                        i10 = i11;
                        if (Math.abs((float) (((3.141592653589793d * width) / 180.0d) * z12)) <= f12) {
                            double d = (-90.0f) - (360.0f * f18);
                            canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * width)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * width)), this.b[i10].b);
                        } else {
                            this.b[i10].b.setStyle(Paint.Style.STROKE);
                            canvas.drawArc(rectF, (-90.0f) - (360.0f * f18), z12, false, this.b[i10].b);
                        }
                    } else {
                        i10 = i11;
                    }
                    f18 += f19;
                    i11 = i10 + 1;
                    f12 = 1.0f;
                    z11 = false;
                }
            }
            i10 = i11;
            i11 = i10 + 1;
            f12 = 1.0f;
            z11 = false;
        }
        int i12 = 0;
        float f20 = 0.0f;
        while (true) {
            jx0[] jx0VarArr2 = this.b;
            if (i12 >= jx0VarArr2.length) {
                break;
            }
            jx0 jx0Var2 = jx0VarArr2[i12];
            if (jx0Var2 != null) {
                float f21 = this.c[i12];
                if (f21 != 0.0f) {
                    if (jx0Var2.d) {
                        f11 = f21;
                    } else {
                        float z13 = e2.c.z(1.0f, this.f, f10, f21 * (-360.0f));
                        if (z13 > 0.0f) {
                            z13 = 0.0f;
                        }
                        jx0Var2.b.setColor(org.telegram.ui.ActionBar.f6.w0(null, jx0Var2.a, false));
                        this.b[i12].b.setAlpha(i9);
                        double width2 = rectF.width() / 2.0f;
                        f11 = f21;
                        if (Math.abs((float) (z13 * ((width2 * 3.141592653589793d) / 180.0d))) <= 1.0f) {
                            double d9 = (-90.0f) - (f20 * 360.0f);
                            canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d9)) * width2)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d9)) * width2)), this.b[i12].b);
                        } else {
                            this.b[i12].b.setStyle(Paint.Style.STROKE);
                            canvas.drawArc(rectF, (-90.0f) - (f20 * 360.0f), z13, false, this.b[i12].b);
                            f20 += f11;
                            i12++;
                            i9 = 255;
                            f10 = 10.0f;
                        }
                    }
                    f20 += f11;
                    i12++;
                    i9 = 255;
                    f10 = 10.0f;
                }
            }
            i12++;
            i9 = 255;
            f10 = 10.0f;
        }
        if (imageReceiver != null) {
            imageReceiver.draw(canvas);
            canvas.restore();
        }
        if (i6Var2 != null) {
            int i13 = org.telegram.ui.ActionBar.f6.j5;
            i6Var2.r(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
            i6Var.r(org.telegram.ui.ActionBar.f6.w0(null, i13, false));
            if (this.n != null) {
                float d10 = i6Var.d() + i6Var2.d() + AndroidUtilities.dp(4.0f);
                float width3 = (getWidth() - d10) / 2.0f;
                i6Var2.setBounds(0, AndroidUtilities.dp(115.0f), (int) (i6Var2.d() + width3), AndroidUtilities.dp(145.0f));
                i6Var.setBounds((int) ((width3 + d10) - i6Var.d()), AndroidUtilities.dp(118.0f), getWidth(), AndroidUtilities.dp(148.0f));
            }
            i6Var2.draw(canvas);
            i6Var.draw(canvas);
        }
        if (this.x != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(148.0f) - ((this.x.getHeight() - AndroidUtilities.dp(13.0f)) / 2.0f));
            this.w.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
            this.x.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.a;
        i6 i6Var = this.s;
        i6 i6Var2 = this.r;
        Long l10 = this.n;
        if (l10 != null) {
            super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(166.0f), TLObject.FLAG_30));
            i11 = org.telegram.messenger.ll.y(110.0f, View.MeasureSpec.getSize(i9), 2);
            rectF.set(AndroidUtilities.dp(3.0f) + i11, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f) + i11, AndroidUtilities.dp(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(110.0f), TLObject.FLAG_30));
            rectF.set(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(107.0f), AndroidUtilities.dp(107.0f));
            i11 = 0;
        }
        gr grVar = gr.h;
        i6Var2.k(0.18f, 300L, grVar);
        i6Var2.t(AndroidUtilities.dp(24.0f));
        i6Var2.u(AndroidUtilities.bold());
        i6Var.k(0.18f, 300L, grVar);
        if (l10 != null) {
            i6Var.t(AndroidUtilities.dp(16.0f));
            i6Var2.b = 5;
            i6Var.b = 3;
        } else {
            i6Var.t(AndroidUtilities.dp(13.0f));
            int textSize = (int) i6Var2.a.getTextSize();
            int textSize2 = (int) i6Var.a.getTextSize();
            int dp = ((AndroidUtilities.dp(110.0f) - textSize) - textSize2) / 2;
            int i12 = textSize + dp;
            i6Var2.setBounds(0, dp, getMeasuredWidth(), i12);
            i6Var.setBounds(0, AndroidUtilities.dp(2.0f) + i12, getMeasuredWidth(), AndroidUtilities.dp(2.0f) + i12 + textSize2);
            i6Var2.b = 17;
            i6Var.b = 17;
        }
        if (this.v != null) {
            if (this.w == null) {
                this.w = new TextPaint(1);
            }
            this.w.setTextSize(AndroidUtilities.dp(13.0f));
            int size = View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(60.0f);
            CharSequence charSequence = this.v;
            TextPaint textPaint = this.w;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.x = rv0.d(charSequence, textPaint, size, false, size, 1);
        }
        if (imageReceiver != null) {
            imageReceiver.setImageCoords(AndroidUtilities.dp(10.0f) + i11, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(90.0f), AndroidUtilities.dp(90.0f));
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
                AndroidUtilities.runOnUIThread(new tp0(this, 10), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(hh.b bVar) {
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
            float f10 = this.C;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.D = ofFloat;
                ofFloat.addUpdateListener(new q60(this, 25));
                this.D.addListener(new r60(this, 25));
                this.D.setInterpolator(new OvershootInterpolator(2.0f));
                this.D.setDuration(350L);
                this.D.start();
            }
        }
    }
}
