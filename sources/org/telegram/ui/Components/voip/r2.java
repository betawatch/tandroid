package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.qs;
import org.telegram.messenger.sc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class r2 extends View {
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public final i1 H;
    public final Paint I;
    public final Rect J;
    public final boolean K;
    public final f3[] a;
    public final f3[] b;
    public ValueAnimator c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public r2(Activity activity, TLRPC.User user, i1 i1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.I = paint;
        this.J = new Rect();
        boolean e10 = sc.e(512);
        this.K = e10;
        this.H = i1Var;
        if (e10) {
            this.a = new f3[]{new f3(user, this, org.telegram.messenger.g0.L(32.0f)), new f3(user, this, org.telegram.messenger.g0.L(28.0f)), new f3(user, this, org.telegram.messenger.g0.L(35.0f)), new f3(user, this, org.telegram.messenger.g0.L(28.0f)), new f3(user, this, org.telegram.messenger.g0.L(26.0f))};
            this.b = new f3[]{new f3(user, this, org.telegram.messenger.g0.L(32.0f)), new f3(user, this, org.telegram.messenger.g0.L(28.0f)), new f3(user, this, org.telegram.messenger.g0.L(35.0f)), new f3(user, this, org.telegram.messenger.g0.L(28.0f)), new f3(user, this, org.telegram.messenger.g0.L(26.0f))};
            i1Var.a(this);
            setLayerType(2, null);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    public final void a() {
        if (this.K && !this.D) {
            this.D = true;
            int L = org.telegram.messenger.g0.L(12.0f);
            this.F = L;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, L);
            this.c = ofInt;
            ofInt.addUpdateListener(new q2(this, 0));
            this.c.setInterpolator(xq.g);
            this.c.setDuration(200L);
            this.c.start();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.K) {
            for (f3 f3Var : this.a) {
                g5 g5Var = f3Var.a;
                if (g5Var != null) {
                    g5Var.a();
                    ValueAnimator valueAnimator = f3Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (f3 f3Var2 : this.b) {
                g5 g5Var2 = f3Var2.a;
                if (g5Var2 != null) {
                    g5Var2.a();
                    ValueAnimator valueAnimator2 = f3Var2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.start();
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.K) {
            for (f3 f3Var : this.a) {
                g5 g5Var = f3Var.a;
                if (g5Var != null) {
                    ValueAnimator valueAnimator = f3Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        f3Var.b = null;
                    }
                    g5Var.b();
                }
            }
            for (f3 f3Var2 : this.b) {
                g5 g5Var2 = f3Var2.a;
                if (g5Var2 != null) {
                    ValueAnimator valueAnimator2 = f3Var2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        f3Var2.b = null;
                    }
                    g5Var2.b();
                }
            }
            ValueAnimator valueAnimator3 = this.c;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.K && !this.G) {
            int width = getWidth();
            int height = getHeight();
            Rect rect = this.J;
            rect.set(0, 0, width, height);
            float x10 = getX();
            float y10 = getY();
            i1 i1Var = this.H;
            i1Var.d(x10, y10);
            int measuredWidth = getMeasuredWidth() / 2;
            f3[] f3VarArr = this.a;
            f3VarArr[0].b((measuredWidth - org.telegram.messenger.g0.L(120.0f)) - this.d, org.telegram.messenger.g0.L(120.0f) - this.r);
            f3VarArr[1].b((measuredWidth - org.telegram.messenger.g0.L(180.0f)) - this.e, org.telegram.messenger.g0.L(150.0f) - this.s);
            f3VarArr[2].b((measuredWidth - org.telegram.messenger.g0.L(150.0f)) - this.f, org.telegram.messenger.g0.L(185.0f) - this.w);
            f3VarArr[3].b((measuredWidth - org.telegram.messenger.g0.L(176.0f)) - this.h, org.telegram.messenger.g0.L(240.0f) - this.x);
            f3VarArr[4].b((measuredWidth - org.telegram.messenger.g0.L(130.0f)) - this.n, org.telegram.messenger.g0.L(265.0f) - this.y);
            for (f3 f3Var : f3VarArr) {
                f3Var.a(canvas);
            }
            f3[] f3VarArr2 = this.b;
            f3VarArr2[0].b(org.telegram.messenger.g0.L(50.0f) + measuredWidth + this.d, org.telegram.messenger.g0.L(120.0f) - this.r);
            f3VarArr2[1].b(org.telegram.messenger.g0.L(110.0f) + measuredWidth + this.e, org.telegram.messenger.g0.L(150.0f) - this.s);
            f3VarArr2[2].b(org.telegram.messenger.g0.L(80.0f) + measuredWidth + this.f, org.telegram.messenger.g0.L(185.0f) - this.w);
            f3VarArr2[3].b(org.telegram.messenger.g0.L(106.0f) + measuredWidth + this.h, org.telegram.messenger.g0.L(240.0f) - this.x);
            f3VarArr2[4].b(org.telegram.messenger.g0.L(60.0f) + measuredWidth + this.n, org.telegram.messenger.g0.L(265.0f) - this.y);
            for (f3 f3Var2 : f3VarArr2) {
                f3Var2.a(canvas);
            }
            int alpha = i1Var.b().getAlpha();
            Paint paint = this.I;
            paint.setAlpha(qs.e4);
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
            i1Var.b().setAlpha(qs.e4);
            canvas.drawRect(rect, i1Var.b());
            i1Var.b().setAlpha(alpha);
            if (i1Var.e) {
                int alpha2 = ((Paint) i1Var.d.a).getAlpha();
                ((Paint) i1Var.d.a).setAlpha(qs.e4);
                canvas.drawRect(rect, (Paint) i1Var.d.a);
                ((Paint) i1Var.d.a).setAlpha(alpha2);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.K) {
            for (f3 f3Var : this.a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                f3Var.o = measuredWidth;
                f3Var.k.invalidate();
            }
            for (f3 f3Var2 : this.b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                f3Var2.o = measuredWidth2;
                f3Var2.k.invalidate();
            }
        }
    }

    public void setState(boolean z9) {
        this.G = z9;
        invalidate();
    }
}
