package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.sc;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f2 extends View {
    public boolean D;
    public boolean E;
    public int F;
    public boolean G;
    public final x0 H;
    public final Paint I;
    public final Rect J;
    public final boolean K;
    public final v2[] a;
    public final v2[] b;
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

    public f2(Activity activity, TLRPC.User user, x0 x0Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.I = paint;
        this.J = new Rect();
        boolean e = sc.e(512);
        this.K = e;
        this.H = x0Var;
        if (e) {
            this.a = new v2[]{new v2(user, this, org.telegram.messenger.i0.L(32.0f)), new v2(user, this, org.telegram.messenger.i0.L(28.0f)), new v2(user, this, org.telegram.messenger.i0.L(35.0f)), new v2(user, this, org.telegram.messenger.i0.L(28.0f)), new v2(user, this, org.telegram.messenger.i0.L(26.0f))};
            this.b = new v2[]{new v2(user, this, org.telegram.messenger.i0.L(32.0f)), new v2(user, this, org.telegram.messenger.i0.L(28.0f)), new v2(user, this, org.telegram.messenger.i0.L(35.0f)), new v2(user, this, org.telegram.messenger.i0.L(28.0f)), new v2(user, this, org.telegram.messenger.i0.L(26.0f))};
            x0Var.a(this);
            setLayerType(2, null);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    public final void a() {
        if (this.K && !this.D) {
            this.D = true;
            int L = org.telegram.messenger.i0.L(12.0f);
            this.F = L;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, L);
            this.c = ofInt;
            ofInt.addUpdateListener(new e2(this, 0));
            this.c.setInterpolator(gr.g);
            this.c.setDuration(200L);
            this.c.start();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.K) {
            for (v2 v2Var : this.a) {
                d5 d5Var = v2Var.a;
                if (d5Var != null) {
                    d5Var.a();
                    ValueAnimator valueAnimator = v2Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (v2 v2Var2 : this.b) {
                d5 d5Var2 = v2Var2.a;
                if (d5Var2 != null) {
                    d5Var2.a();
                    ValueAnimator valueAnimator2 = v2Var2.b;
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
            for (v2 v2Var : this.a) {
                d5 d5Var = v2Var.a;
                if (d5Var != null) {
                    ValueAnimator valueAnimator = v2Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        v2Var.b = null;
                    }
                    d5Var.b();
                }
            }
            for (v2 v2Var2 : this.b) {
                d5 d5Var2 = v2Var2.a;
                if (d5Var2 != null) {
                    ValueAnimator valueAnimator2 = v2Var2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        v2Var2.b = null;
                    }
                    d5Var2.b();
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
            float y3 = getY();
            x0 x0Var = this.H;
            x0Var.d(x10, y3);
            int measuredWidth = getMeasuredWidth() / 2;
            v2[] v2VarArr = this.a;
            v2VarArr[0].b((measuredWidth - org.telegram.messenger.i0.L(120.0f)) - this.d, org.telegram.messenger.i0.L(120.0f) - this.r);
            v2VarArr[1].b((measuredWidth - org.telegram.messenger.i0.L(180.0f)) - this.e, org.telegram.messenger.i0.L(150.0f) - this.s);
            v2VarArr[2].b((measuredWidth - org.telegram.messenger.i0.L(150.0f)) - this.f, org.telegram.messenger.i0.L(185.0f) - this.w);
            v2VarArr[3].b((measuredWidth - org.telegram.messenger.i0.L(176.0f)) - this.h, org.telegram.messenger.i0.L(240.0f) - this.x);
            v2VarArr[4].b((measuredWidth - org.telegram.messenger.i0.L(130.0f)) - this.n, org.telegram.messenger.i0.L(265.0f) - this.y);
            for (v2 v2Var : v2VarArr) {
                v2Var.a(canvas);
            }
            v2[] v2VarArr2 = this.b;
            v2VarArr2[0].b(org.telegram.messenger.i0.L(50.0f) + measuredWidth + this.d, org.telegram.messenger.i0.L(120.0f) - this.r);
            v2VarArr2[1].b(org.telegram.messenger.i0.L(110.0f) + measuredWidth + this.e, org.telegram.messenger.i0.L(150.0f) - this.s);
            v2VarArr2[2].b(org.telegram.messenger.i0.L(80.0f) + measuredWidth + this.f, org.telegram.messenger.i0.L(185.0f) - this.w);
            v2VarArr2[3].b(org.telegram.messenger.i0.L(106.0f) + measuredWidth + this.h, org.telegram.messenger.i0.L(240.0f) - this.x);
            v2VarArr2[4].b(org.telegram.messenger.i0.L(60.0f) + measuredWidth + this.n, org.telegram.messenger.i0.L(265.0f) - this.y);
            for (v2 v2Var2 : v2VarArr2) {
                v2Var2.a(canvas);
            }
            int alpha = x0Var.b().getAlpha();
            Paint paint = this.I;
            paint.setAlpha(zs.e4);
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
            x0Var.b().setAlpha(zs.e4);
            canvas.drawRect(rect, x0Var.b());
            x0Var.b().setAlpha(alpha);
            if (x0Var.e) {
                int alpha2 = ((Paint) x0Var.d.a).getAlpha();
                ((Paint) x0Var.d.a).setAlpha(zs.e4);
                canvas.drawRect(rect, (Paint) x0Var.d.a);
                ((Paint) x0Var.d.a).setAlpha(alpha2);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.K) {
            for (v2 v2Var : this.a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                v2Var.o = measuredWidth;
                v2Var.k.invalidate();
            }
            for (v2 v2Var2 : this.b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                v2Var2.o = measuredWidth2;
                v2Var2.k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.G = z10;
        invalidate();
    }
}
