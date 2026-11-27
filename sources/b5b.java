// default package

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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class b5b extends View implements fn7 {
    public int E;
    public ValueAnimator F;
    public d71 G;
    public float H;
    public ValueAnimator I;
    public RectF a;
    public j35[] b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float f;
    public ImageReceiver h;
    public Long n;
    public hn r;
    public hn s;
    public CharSequence w;
    public TextPaint x;
    public StaticLayout y;

    public final long a() {
        if (this.b == null) {
            return 0L;
        }
        long j = 0;
        for (int i = 0; i < this.b.length; i++) {
            long f = this.G.f(i);
            j35 j35Var = this.b[i];
            if (j35Var != null && (j35Var.b || f > 0)) {
                if (f <= 0) {
                    f = j35Var.d;
                }
                j += f;
            }
        }
        return j;
    }

    public abstract void b();

    public final void c(boolean z) {
        boolean z2;
        j35[] j35VarArr = this.b;
        if (j35VarArr == null) {
            return;
        }
        long j = 0;
        for (int i = 0; i < j35VarArr.length; i++) {
            long f = this.G.f(i);
            j35 j35Var = j35VarArr[i];
            if (j35Var != null && (j35Var.b || f > 0)) {
                if (f <= 0) {
                    f = j35Var.d;
                }
                j += f;
            }
        }
        this.E = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i2 = 0; i2 < j35VarArr.length; i2++) {
            long f4 = this.G.f(i2);
            j35 j35Var2 = j35VarArr[i2];
            if (j35Var2 != null && (j35Var2.b || f4 > 0)) {
                this.E++;
            }
            if (j35Var2 == null || (!(z2 = j35Var2.b) && f4 <= 0)) {
                this.d[i2] = 0.0f;
            } else {
                if (f4 <= 0) {
                    f4 = j35Var2.d;
                }
                float f5 = f4 / j;
                if (f5 < 0.02777f) {
                    f5 = 0.02777f;
                }
                f2 += f5;
                if (f5 > f3 && (z2 || f4 > 0)) {
                    f3 = f5;
                }
                this.d[i2] = f5;
            }
        }
        if (f2 > 1.0f) {
            float f6 = 1.0f / f2;
            for (int i3 = 0; i3 < j35VarArr.length; i3++) {
                if (j35VarArr[i3] != null) {
                    float[] fArr = this.d;
                    fArr[i3] = fArr[i3] * f6;
                }
            }
        }
        if (!z) {
            System.arraycopy(this.d, 0, this.c, 0, j35VarArr.length);
            return;
        }
        System.arraycopy(this.c, 0, this.e, 0, j35VarArr.length);
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.F.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.F = ofFloat;
        ofFloat.addUpdateListener(new lk(this, j35VarArr, (byte) 27));
        this.F.addListener(new po9((Object) j35VarArr, (byte) 23));
        this.F.setDuration(450L);
        this.F.setInterpolator(new x84());
        this.F.start();
    }

    public final long d() {
        long a = a();
        String[] split = hl.i0(a, false, false).split(" ");
        if (split.length > 1) {
            this.r.t(a == 0 ? " " : split[0], true, false);
            this.s.t(a != 0 ? split[1] : " ", true, false);
        }
        return a;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.I();
        }
        jn7.e().b(this, jn7.l4);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.K();
        }
        jn7.e().n(this, jn7.l4);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        int i3;
        hn hnVar = this.s;
        ImageReceiver imageReceiver = this.h;
        hn hnVar2 = this.r;
        RectF rectF = this.a;
        if (this.b != null) {
            float f5 = 1.0f;
            float f6 = 0.0f;
            if (imageReceiver != null) {
                canvas.save();
                if (isPressed()) {
                    float f7 = this.H;
                    if (f7 != 1.0f) {
                        float min = (Math.min(40.0f, 1000.0f / hl.r) / 100.0f) + f7;
                        this.H = min;
                        this.H = Utilities.i(min, 1.0f, 0.0f);
                        invalidate();
                    }
                }
                float A = qd4.A(1.0f, this.H, 0.15f, 0.85f);
                canvas.scale(A, A, imageReceiver.r(), imageReceiver.s());
            }
            int i4 = this.E;
            float f8 = this.f;
            if (i4 > 1) {
                if (f8 > 0.0f) {
                    float f9 = (float) (f8 - 0.04d);
                    this.f = f9;
                    if (f9 < 0.0f) {
                        this.f = 0.0f;
                    }
                }
            } else if (f8 < 1.0f) {
                float f10 = (float) (f8 + 0.04d);
                this.f = f10;
                if (f10 > 1.0f) {
                    this.f = 1.0f;
                }
            }
            boolean z = false;
            float f11 = 0.0f;
            int i5 = 0;
            while (true) {
                j35[] j35VarArr = this.b;
                int length = j35VarArr.length;
                i = jn7.d4;
                f = 10.0f;
                f2 = f6;
                if (i5 >= length) {
                    break;
                }
                j35 j35Var = j35VarArr[i5];
                if (j35Var != null) {
                    float f12 = this.c[i5];
                    if (f12 != f2) {
                        if (j35Var.c) {
                            float A2 = qd4.A(1.0f, this.f, 10.0f, f12 * (-360.0f));
                            if (A2 > f2) {
                                A2 = f2;
                            }
                            ((Paint) j35Var.e).setColor(aob.w0(null, j35Var.a, z));
                            ((Paint) this.b[i5].e).setAlpha(jn7.d4);
                            double width = rectF.width() / 2.0f;
                            i3 = i5;
                            if (Math.abs((float) (A2 * ((3.141592653589793d * width) / 180.0d))) <= 1.0f) {
                                double d = (-90.0f) - (360.0f * f11);
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d)) * width)), rectF.centerY() + ((float) (Math.sin(Math.toRadians(d)) * width)), (Paint) this.b[i3].e);
                            } else {
                                ((Paint) this.b[i3].e).setStyle(Paint.Style.STROKE);
                                canvas.drawArc(rectF, (-90.0f) - (360.0f * f11), A2, false, (Paint) this.b[i3].e);
                            }
                        } else {
                            i3 = i5;
                        }
                        f11 += f12;
                        i5 = i3 + 1;
                        f6 = f2;
                        z = false;
                    }
                }
                i3 = i5;
                i5 = i3 + 1;
                f6 = f2;
                z = false;
            }
            float f13 = f2;
            int i6 = 0;
            while (true) {
                j35[] j35VarArr2 = this.b;
                if (i6 >= j35VarArr2.length) {
                    break;
                }
                j35 j35Var2 = j35VarArr2[i6];
                if (j35Var2 != null) {
                    float f14 = this.c[i6];
                    if (f14 != f2) {
                        if (j35Var2.c) {
                            i2 = i;
                            f3 = f;
                            f4 = f5;
                        } else {
                            float A3 = qd4.A(f5, this.f, f, f14 * (-360.0f));
                            if (A3 > f2) {
                                A3 = f2;
                            }
                            ((Paint) j35Var2.e).setColor(aob.w0(null, j35Var2.a, false));
                            ((Paint) this.b[i6].e).setAlpha(i);
                            double width2 = rectF.width() / 2.0f;
                            f4 = f5;
                            if (Math.abs((float) (A3 * ((width2 * 3.141592653589793d) / 180.0d))) <= f4) {
                                double d2 = (-90.0f) - (f13 * 360.0f);
                                RectF rectF2 = rectF;
                                canvas.drawPoint(rectF.centerX() + ((float) (Math.cos(Math.toRadians(d2)) * width2)), rectF2.centerY() + ((float) (Math.sin(Math.toRadians(d2)) * width2)), (Paint) this.b[i6].e);
                                rectF = rectF2;
                                f3 = 10.0f;
                                i2 = jn7.d4;
                            } else {
                                ((Paint) this.b[i6].e).setStyle(Paint.Style.STROKE);
                                Paint paint = (Paint) this.b[i6].e;
                                rectF = rectF;
                                f3 = 10.0f;
                                i2 = jn7.d4;
                                canvas.drawArc(rectF, (-90.0f) - (f13 * 360.0f), A3, false, paint);
                            }
                        }
                        f13 += f14;
                        i6++;
                        f = f3;
                        i = i2;
                        f5 = f4;
                    }
                }
                i2 = i;
                f3 = f;
                f4 = f5;
                i6++;
                f = f3;
                i = i2;
                f5 = f4;
            }
            if (imageReceiver != null) {
                imageReceiver.h(canvas, null);
                canvas.restore();
            }
            if (hnVar2 != null) {
                int i7 = aob.j5;
                hnVar2.u(aob.w0(null, i7, false));
                hnVar.u(aob.w0(null, i7, false));
                if (this.n != null) {
                    float c = hnVar.c() + hnVar2.c() + hl.L(4.0f);
                    float width3 = (getWidth() - c) / 2.0f;
                    hnVar2.setBounds(0, hl.L(115.0f), (int) (hnVar2.c() + width3), hl.L(145.0f));
                    hnVar.setBounds((int) ((width3 + c) - hnVar.c()), hl.L(118.0f), getWidth(), hl.L(148.0f));
                }
                hnVar2.draw(canvas);
                hnVar.draw(canvas);
            }
            if (this.y != null) {
                canvas.save();
                uh9.n(this.y.getHeight() - hl.L(13.0f), 2.0f, hl.L(148.0f), hl.L(30.0f), canvas);
                this.x.setColor(aob.w0(null, aob.j5, false));
                this.y.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        CharSequence charSequence = this.w;
        ImageReceiver imageReceiver = this.h;
        RectF rectF = this.a;
        hn hnVar = this.s;
        hn hnVar2 = this.r;
        Long l = this.n;
        if (l != null) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(166.0f), TLObject.FLAG_30));
            i3 = ik8.D(110.0f, View.MeasureSpec.getSize(i), 2);
            rectF.set(hl.L(3.0f) + i3, hl.L(3.0f), hl.L(107.0f) + i3, hl.L(107.0f));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(110.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(110.0f), TLObject.FLAG_30));
            rectF.set(hl.L(3.0f), hl.L(3.0f), hl.L(107.0f), hl.L(107.0f));
            i3 = 0;
        }
        k43 k43Var = k43.h;
        hnVar2.n(0.18f, 300L, k43Var);
        hnVar2.w(hl.L(24.0f));
        hnVar2.x(hl.o());
        hnVar.n(0.18f, 300L, k43Var);
        if (l != null) {
            hnVar.w(hl.L(16.0f));
            hnVar2.b = 5;
            hnVar.b = 3;
        } else {
            hnVar.w(hl.L(13.0f));
            int textSize = (int) hnVar2.a.getTextSize();
            int textSize2 = (int) hnVar.a.getTextSize();
            int L = ((hl.L(110.0f) - textSize) - textSize2) / 2;
            int i4 = textSize + L;
            hnVar2.setBounds(0, L, getMeasuredWidth(), i4);
            hnVar.setBounds(0, hl.L(2.0f) + i4, getMeasuredWidth(), hl.L(2.0f) + i4 + textSize2);
            hnVar2.b = 17;
            hnVar.b = 17;
        }
        if (charSequence != null) {
            TextPaint textPaint = this.x;
            if (textPaint == null) {
                textPaint = new TextPaint(1);
                this.x = textPaint;
            }
            textPaint.setTextSize(hl.L(13.0f));
            int size = View.MeasureSpec.getSize(i) - hl.L(60.0f);
            TextPaint textPaint2 = this.x;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.y = o0b.d(charSequence, textPaint2, false, size, 1);
        }
        if (imageReceiver != null) {
            imageReceiver.i0(hl.L(10.0f) + i3, hl.L(10.0f), hl.L(90.0f), hl.L(90.0f));
            imageReceiver.q0(hl.L(45.0f));
        }
        d();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Long l;
        ImageReceiver imageReceiver = this.h;
        boolean z = imageReceiver != null && (l = this.n) != null && l.longValue() != Long.MAX_VALUE && motionEvent.getX() > imageReceiver.L0 && motionEvent.getX() <= imageReceiver.w() && motionEvent.getY() > imageReceiver.M0 && motionEvent.getY() <= imageReceiver.x();
        if (motionEvent.getAction() == 0) {
            if (z) {
                setPressed(true);
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (z && motionEvent.getAction() != 3) {
                hl.d3(new uoa((Object) this, (byte) 20), 80L);
            }
            setPressed(false);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCacheModel(d71 d71Var) {
        this.G = d71Var;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        ValueAnimator valueAnimator;
        if (isPressed() != z) {
            super.setPressed(z);
            invalidate();
            if (z && (valueAnimator = this.I) != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            if (z) {
                return;
            }
            float f = this.H;
            if (f != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
                this.I = ofFloat;
                ofFloat.addUpdateListener(new ija(this, (byte) 14));
                this.I.addListener(new po9((Object) this, (byte) 24));
                c00.o(2.0f, this.I);
                this.I.setDuration(350L);
                this.I.start();
            }
        }
    }
}
