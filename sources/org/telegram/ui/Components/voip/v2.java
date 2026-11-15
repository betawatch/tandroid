package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ns;
import org.telegram.messenger.qc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v2 extends View {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final m1 I;
    public final Paint J;
    public final Rect K;
    public final boolean L;
    public final j3[] a;
    public final j3[] b;
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

    public v2(Activity activity, TLRPC.User user, m1 m1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.J = paint;
        this.K = new Rect();
        boolean e10 = qc.e(512);
        this.L = e10;
        this.I = m1Var;
        if (e10) {
            this.a = new j3[]{new j3(user, this, org.telegram.messenger.g0.L(32.0f)), new j3(user, this, org.telegram.messenger.g0.L(28.0f)), new j3(user, this, org.telegram.messenger.g0.L(35.0f)), new j3(user, this, org.telegram.messenger.g0.L(28.0f)), new j3(user, this, org.telegram.messenger.g0.L(26.0f))};
            this.b = new j3[]{new j3(user, this, org.telegram.messenger.g0.L(32.0f)), new j3(user, this, org.telegram.messenger.g0.L(28.0f)), new j3(user, this, org.telegram.messenger.g0.L(35.0f)), new j3(user, this, org.telegram.messenger.g0.L(28.0f)), new j3(user, this, org.telegram.messenger.g0.L(26.0f))};
            m1Var.a(this);
            setLayerType(2, null);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    public final void a() {
        if (this.L && !this.E) {
            this.E = true;
            int L = org.telegram.messenger.g0.L(12.0f);
            this.G = L;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, L);
            this.c = ofInt;
            ofInt.addUpdateListener(new u2(this, 0));
            this.c.setInterpolator(er.g);
            this.c.setDuration(200L);
            this.c.start();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.L) {
            for (j3 j3Var : this.a) {
                e5 e5Var = j3Var.a;
                if (e5Var != null) {
                    e5Var.a();
                    ValueAnimator valueAnimator = j3Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (j3 j3Var2 : this.b) {
                e5 e5Var2 = j3Var2.a;
                if (e5Var2 != null) {
                    e5Var2.a();
                    ValueAnimator valueAnimator2 = j3Var2.b;
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
        if (this.L) {
            for (j3 j3Var : this.a) {
                e5 e5Var = j3Var.a;
                if (e5Var != null) {
                    ValueAnimator valueAnimator = j3Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        j3Var.b = null;
                    }
                    e5Var.b();
                }
            }
            for (j3 j3Var2 : this.b) {
                e5 e5Var2 = j3Var2.a;
                if (e5Var2 != null) {
                    ValueAnimator valueAnimator2 = j3Var2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        j3Var2.b = null;
                    }
                    e5Var2.b();
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
        if (this.L && !this.H) {
            int width = getWidth();
            int height = getHeight();
            Rect rect = this.K;
            rect.set(0, 0, width, height);
            float x10 = getX();
            float y10 = getY();
            m1 m1Var = this.I;
            m1Var.d(x10, y10);
            int measuredWidth = getMeasuredWidth() / 2;
            j3[] j3VarArr = this.a;
            j3VarArr[0].b((measuredWidth - org.telegram.messenger.g0.L(120.0f)) - this.d, org.telegram.messenger.g0.L(120.0f) - this.r);
            j3VarArr[1].b((measuredWidth - org.telegram.messenger.g0.L(180.0f)) - this.e, org.telegram.messenger.g0.L(150.0f) - this.s);
            j3VarArr[2].b((measuredWidth - org.telegram.messenger.g0.L(150.0f)) - this.f, org.telegram.messenger.g0.L(185.0f) - this.w);
            j3VarArr[3].b((measuredWidth - org.telegram.messenger.g0.L(176.0f)) - this.h, org.telegram.messenger.g0.L(240.0f) - this.x);
            j3VarArr[4].b((measuredWidth - org.telegram.messenger.g0.L(130.0f)) - this.n, org.telegram.messenger.g0.L(265.0f) - this.y);
            for (j3 j3Var : j3VarArr) {
                j3Var.a(canvas);
            }
            j3[] j3VarArr2 = this.b;
            j3VarArr2[0].b(org.telegram.messenger.g0.L(50.0f) + measuredWidth + this.d, org.telegram.messenger.g0.L(120.0f) - this.r);
            j3VarArr2[1].b(org.telegram.messenger.g0.L(110.0f) + measuredWidth + this.e, org.telegram.messenger.g0.L(150.0f) - this.s);
            j3VarArr2[2].b(org.telegram.messenger.g0.L(80.0f) + measuredWidth + this.f, org.telegram.messenger.g0.L(185.0f) - this.w);
            j3VarArr2[3].b(org.telegram.messenger.g0.L(106.0f) + measuredWidth + this.h, org.telegram.messenger.g0.L(240.0f) - this.x);
            j3VarArr2[4].b(org.telegram.messenger.g0.L(60.0f) + measuredWidth + this.n, org.telegram.messenger.g0.L(265.0f) - this.y);
            for (j3 j3Var2 : j3VarArr2) {
                j3Var2.a(canvas);
            }
            int alpha = m1Var.b().getAlpha();
            Paint paint = this.J;
            paint.setAlpha(ns.e4);
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
            m1Var.b().setAlpha(ns.e4);
            canvas.drawRect(rect, m1Var.b());
            m1Var.b().setAlpha(alpha);
            if (m1Var.e) {
                int alpha2 = ((Paint) m1Var.d.a).getAlpha();
                ((Paint) m1Var.d.a).setAlpha(ns.e4);
                canvas.drawRect(rect, (Paint) m1Var.d.a);
                ((Paint) m1Var.d.a).setAlpha(alpha2);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.L) {
            for (j3 j3Var : this.a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                j3Var.o = measuredWidth;
                j3Var.k.invalidate();
            }
            for (j3 j3Var2 : this.b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                j3Var2.o = measuredWidth2;
                j3Var2.k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.H = z10;
        invalidate();
    }
}
