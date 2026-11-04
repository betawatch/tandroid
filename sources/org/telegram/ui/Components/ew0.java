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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ew0 extends View implements org.telegram.messenger.cs {
    public int E;
    public ValueAnimator F;
    public di.c G;
    public float H;
    public ValueAnimator I;
    public RectF a;
    public dw0[] b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float f;
    public ImageReceiver h;
    public Long n;
    public g6 r;
    public g6 s;
    public CharSequence w;
    public TextPaint x;
    public StaticLayout y;

    public final long a() {
        if (this.b == null) {
            return 0L;
        }
        long j10 = 0;
        for (int i3 = 0; i3 < this.b.length; i3++) {
            long f10 = this.G.f(i3);
            dw0 dw0Var = this.b[i3];
            if (dw0Var != null && (dw0Var.c || f10 > 0)) {
                if (f10 <= 0) {
                    f10 = dw0Var.a;
                }
                j10 += f10;
            }
        }
        return j10;
    }

    public abstract void b();

    public final void c(boolean z10) {
        boolean z11;
        dw0[] dw0VarArr = this.b;
        if (dw0VarArr == null) {
            return;
        }
        long j10 = 0;
        for (int i3 = 0; i3 < dw0VarArr.length; i3++) {
            long f10 = this.G.f(i3);
            dw0 dw0Var = dw0VarArr[i3];
            if (dw0Var != null && (dw0Var.c || f10 > 0)) {
                if (f10 <= 0) {
                    f10 = dw0Var.a;
                }
                j10 += f10;
            }
        }
        this.E = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (int i10 = 0; i10 < dw0VarArr.length; i10++) {
            long f13 = this.G.f(i10);
            dw0 dw0Var2 = dw0VarArr[i10];
            if (dw0Var2 != null && (dw0Var2.c || f13 > 0)) {
                this.E++;
            }
            if (dw0Var2 == null || (!(z11 = dw0Var2.c) && f13 <= 0)) {
                this.d[i10] = 0.0f;
            } else {
                if (f13 <= 0) {
                    f13 = dw0Var2.a;
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
            for (int i11 = 0; i11 < dw0VarArr.length; i11++) {
                if (dw0VarArr[i11] != null) {
                    float[] fArr = this.d;
                    fArr[i11] = fArr[i11] * f15;
                }
            }
        }
        if (!z10) {
            System.arraycopy(this.d, 0, this.c, 0, dw0VarArr.length);
            return;
        }
        System.arraycopy(this.c, 0, this.e, 0, dw0VarArr.length);
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.F.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new ci.uc(17, this, dw0VarArr));
        this.F.addListener(new a60(dw0VarArr, 25));
        this.F.setDuration(450L);
        this.F.setInterpolator(new w1.a());
        this.F.start();
    }

    public final long d() {
        long a10 = a();
        String[] split = org.telegram.messenger.g0.i0(a10, false, false).split(" ");
        if (split.length > 1) {
            this.r.t(a10 == 0 ? " " : split[0], true, false);
            this.s.t(a10 != 0 ? split[1] : " ", true, false);
        }
        return a10;
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.i4) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.P();
        }
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.i4);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.R();
        }
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.i4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i3;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        int i11;
        g6 g6Var = this.s;
        ImageReceiver imageReceiver = this.h;
        g6 g6Var2 = this.r;
        RectF rectF = this.a;
        if (this.b == null) {
            return;
        }
        float f14 = 1.0f;
        float f15 = 0.0f;
        if (imageReceiver != null) {
            canvas.save();
            if (isPressed()) {
                float f16 = this.H;
                if (f16 != 1.0f) {
                    float min = (Math.min(40.0f, 1000.0f / org.telegram.messenger.g0.r) / 100.0f) + f16;
                    this.H = min;
                    this.H = Utilities.i(min, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float y9 = com.google.android.recaptcha.internal.a.y(1.0f, this.H, 0.15f, 0.85f);
            canvas.scale(y9, y9, imageReceiver.r(), imageReceiver.s());
        }
        if (this.E > 1) {
            float f17 = this.f;
            if (f17 > 0.0f) {
                float f18 = (float) (f17 - 0.04d);
                this.f = f18;
                if (f18 < 0.0f) {
                    this.f = 0.0f;
                }
            }
        } else {
            float f19 = this.f;
            if (f19 < 1.0f) {
                float f20 = (float) (f19 + 0.04d);
                this.f = f20;
                if (f20 > 1.0f) {
                    this.f = 1.0f;
                }
            }
        }
        boolean z10 = false;
        float f21 = 0.0f;
        int i12 = 0;
        while (true) {
            dw0[] dw0VarArr = this.b;
            int length = dw0VarArr.length;
            i3 = org.telegram.messenger.hs.e4;
            f10 = 10.0f;
            f11 = f15;
            if (i12 >= length) {
                break;
            }
            dw0 dw0Var = dw0VarArr[i12];
            if (dw0Var != null) {
                float f22 = this.c[i12];
                if (f22 != f11) {
                    if (dw0Var.d) {
                        float y10 = com.google.android.recaptcha.internal.a.y(f14, this.f, 10.0f, f22 * (-360.0f));
                        if (y10 > f11) {
                            y10 = f11;
                        }
                        ((Paint) dw0Var.e).setColor(org.telegram.ui.ActionBar.k6.x0(null, dw0Var.b, z10));
                        ((Paint) this.b[i12].e).setAlpha(org.telegram.messenger.hs.e4);
                        double width = rectF.width() / 2.0f;
                        i11 = i12;
                        if (Math.abs((float) (((3.141592653589793d * width) / 180.0d) * y10)) <= f14) {
                            double d = (-90.0f) - (360.0f * f21);
                            canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * width)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * width)), (Paint) this.b[i11].e);
                        } else {
                            ((Paint) this.b[i11].e).setStyle(Paint.Style.STROKE);
                            canvas.drawArc(rectF, (-90.0f) - (360.0f * f21), y10, false, (Paint) this.b[i11].e);
                        }
                    } else {
                        i11 = i12;
                    }
                    f21 += f22;
                    i12 = i11 + 1;
                    f15 = f11;
                    f14 = 1.0f;
                    z10 = false;
                }
            }
            i11 = i12;
            i12 = i11 + 1;
            f15 = f11;
            f14 = 1.0f;
            z10 = false;
        }
        float f23 = f11;
        int i13 = 0;
        while (true) {
            dw0[] dw0VarArr2 = this.b;
            if (i13 >= dw0VarArr2.length) {
                break;
            }
            dw0 dw0Var2 = dw0VarArr2[i13];
            if (dw0Var2 != null) {
                float f24 = this.c[i13];
                if (f24 != f11) {
                    if (dw0Var2.d) {
                        i10 = i3;
                        f12 = f10;
                        f13 = f24;
                    } else {
                        float y11 = com.google.android.recaptcha.internal.a.y(1.0f, this.f, f10, f24 * (-360.0f));
                        if (y11 > f11) {
                            y11 = f11;
                        }
                        ((Paint) dw0Var2.e).setColor(org.telegram.ui.ActionBar.k6.x0(null, dw0Var2.b, false));
                        ((Paint) this.b[i13].e).setAlpha(i3);
                        double width2 = rectF.width() / 2.0f;
                        f13 = f24;
                        if (Math.abs((float) (y11 * ((width2 * 3.141592653589793d) / 180.0d))) <= 1.0f) {
                            double d10 = (-90.0f) - (f23 * 360.0f);
                            canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d10)) * width2)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d10)) * width2)), (Paint) this.b[i13].e);
                            f12 = 10.0f;
                            i10 = org.telegram.messenger.hs.e4;
                        } else {
                            ((Paint) this.b[i13].e).setStyle(Paint.Style.STROKE);
                            Paint paint = (Paint) this.b[i13].e;
                            f12 = 10.0f;
                            i10 = org.telegram.messenger.hs.e4;
                            canvas.drawArc(rectF, (-90.0f) - (f23 * 360.0f), y11, false, paint);
                        }
                    }
                    f23 += f13;
                    i13++;
                    f10 = f12;
                    i3 = i10;
                }
            }
            i10 = i3;
            f12 = f10;
            i13++;
            f10 = f12;
            i3 = i10;
        }
        if (imageReceiver != null) {
            imageReceiver.h(canvas, null);
            canvas.restore();
        }
        if (g6Var2 != null) {
            int i14 = org.telegram.ui.ActionBar.k6.j5;
            g6Var2.u(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
            g6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i14, false));
            if (this.n != null) {
                float c2 = g6Var.c() + g6Var2.c() + org.telegram.messenger.g0.L(4.0f);
                float width3 = (getWidth() - c2) / 2.0f;
                g6Var2.setBounds(0, org.telegram.messenger.g0.L(115.0f), (int) (g6Var2.c() + width3), org.telegram.messenger.g0.L(145.0f));
                g6Var.setBounds((int) ((width3 + c2) - g6Var.c()), org.telegram.messenger.g0.L(118.0f), getWidth(), org.telegram.messenger.g0.L(148.0f));
            }
            g6Var2.draw(canvas);
            g6Var.draw(canvas);
        }
        if (this.y != null) {
            canvas.save();
            canvas.translate(org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(148.0f) - ((this.y.getHeight() - org.telegram.messenger.g0.L(13.0f)) / 2.0f));
            this.x.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.j5, false));
            this.y.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int i11;
        CharSequence charSequence = this.w;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.a;
        g6 g6Var = this.s;
        g6 g6Var2 = this.r;
        Long l10 = this.n;
        if (l10 != null) {
            super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(166.0f), TLObject.FLAG_30));
            i11 = org.telegram.messenger.camera.q.y(110.0f, View.MeasureSpec.getSize(i3), 2);
            rectF.set(org.telegram.messenger.g0.L(3.0f) + i11, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(107.0f) + i11, org.telegram.messenger.g0.L(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(110.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(110.0f), TLObject.FLAG_30));
            rectF.set(org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(107.0f), org.telegram.messenger.g0.L(107.0f));
            i11 = 0;
        }
        xq xqVar = xq.h;
        g6Var2.n(0.18f, 300L, xqVar);
        g6Var2.w(org.telegram.messenger.g0.L(24.0f));
        g6Var2.x(org.telegram.messenger.g0.o());
        g6Var.n(0.18f, 300L, xqVar);
        if (l10 != null) {
            g6Var.w(org.telegram.messenger.g0.L(16.0f));
            g6Var2.b = 5;
            g6Var.b = 3;
        } else {
            g6Var.w(org.telegram.messenger.g0.L(13.0f));
            int textSize = (int) g6Var2.a.getTextSize();
            int textSize2 = (int) g6Var.a.getTextSize();
            int L = ((org.telegram.messenger.g0.L(110.0f) - textSize) - textSize2) / 2;
            int i12 = textSize + L;
            g6Var2.setBounds(0, L, getMeasuredWidth(), i12);
            g6Var.setBounds(0, org.telegram.messenger.g0.L(2.0f) + i12, getMeasuredWidth(), org.telegram.messenger.g0.L(2.0f) + i12 + textSize2);
            g6Var2.b = 17;
            g6Var.b = 17;
        }
        if (charSequence != null) {
            if (this.x == null) {
                this.x = new TextPaint(1);
            }
            this.x.setTextSize(org.telegram.messenger.g0.L(13.0f));
            int size = View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(60.0f);
            TextPaint textPaint = this.x;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.y = lu0.d(charSequence, textPaint, false, size, 1);
        }
        if (imageReceiver != null) {
            imageReceiver.y0(org.telegram.messenger.g0.L(10.0f) + i11, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(90.0f), org.telegram.messenger.g0.L(90.0f));
            imageReceiver.J0(org.telegram.messenger.g0.L(45.0f));
        }
        d();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Long l10;
        ImageReceiver imageReceiver = this.h;
        boolean z10 = imageReceiver != null && (l10 = this.n) != null && l10.longValue() != Long.MAX_VALUE && motionEvent.getX() > imageReceiver.L0 && motionEvent.getX() <= imageReceiver.y() && motionEvent.getY() > imageReceiver.M0 && motionEvent.getY() <= imageReceiver.A();
        if (motionEvent.getAction() == 0) {
            if (z10) {
                setPressed(true);
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (z10 && motionEvent.getAction() != 3) {
                org.telegram.messenger.g0.i3(new sp0(this, 10), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(di.c cVar) {
        this.G = cVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.I) != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            if (z10) {
                return;
            }
            float f10 = this.H;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.I = ofFloat;
                ofFloat.addUpdateListener(new y50(this, 24));
                this.I.addListener(new a60(this, 26));
                org.telegram.messenger.camera.q.i(2.0f, this.I);
                this.I.setDuration(350L);
                this.I.start();
            }
        }
    }
}
