package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.hs;
import org.telegram.messenger.lc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g2 extends View {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final x0 I;
    public final Paint J;
    public final Rect K;
    public final boolean L;
    public final u2[] a;
    public final u2[] b;
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

    public g2(Activity activity, TLRPC.User user, x0 x0Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.J = paint;
        this.K = new Rect();
        boolean e10 = lc.e(512);
        this.L = e10;
        this.I = x0Var;
        if (e10) {
            this.a = new u2[]{new u2(user, this, org.telegram.messenger.g0.L(32.0f)), new u2(user, this, org.telegram.messenger.g0.L(28.0f)), new u2(user, this, org.telegram.messenger.g0.L(35.0f)), new u2(user, this, org.telegram.messenger.g0.L(28.0f)), new u2(user, this, org.telegram.messenger.g0.L(26.0f))};
            this.b = new u2[]{new u2(user, this, org.telegram.messenger.g0.L(32.0f)), new u2(user, this, org.telegram.messenger.g0.L(28.0f)), new u2(user, this, org.telegram.messenger.g0.L(35.0f)), new u2(user, this, org.telegram.messenger.g0.L(28.0f)), new u2(user, this, org.telegram.messenger.g0.L(26.0f))};
            x0Var.a(this);
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
            ofInt.addUpdateListener(new f2(this, 0));
            this.c.setInterpolator(xq.g);
            this.c.setDuration(200L);
            this.c.start();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.L) {
            for (u2 u2Var : this.a) {
                e5 e5Var = u2Var.a;
                if (e5Var != null) {
                    e5Var.a();
                    ValueAnimator valueAnimator = u2Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (u2 u2Var2 : this.b) {
                e5 e5Var2 = u2Var2.a;
                if (e5Var2 != null) {
                    e5Var2.a();
                    ValueAnimator valueAnimator2 = u2Var2.b;
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
            for (u2 u2Var : this.a) {
                e5 e5Var = u2Var.a;
                if (e5Var != null) {
                    ValueAnimator valueAnimator = u2Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        u2Var.b = null;
                    }
                    e5Var.b();
                }
            }
            for (u2 u2Var2 : this.b) {
                e5 e5Var2 = u2Var2.a;
                if (e5Var2 != null) {
                    ValueAnimator valueAnimator2 = u2Var2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        u2Var2.b = null;
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
            float y9 = getY();
            x0 x0Var = this.I;
            x0Var.d(x10, y9);
            int measuredWidth = getMeasuredWidth() / 2;
            u2[] u2VarArr = this.a;
            u2VarArr[0].b((measuredWidth - org.telegram.messenger.g0.L(120.0f)) - this.d, org.telegram.messenger.g0.L(120.0f) - this.r);
            u2VarArr[1].b((measuredWidth - org.telegram.messenger.g0.L(180.0f)) - this.e, org.telegram.messenger.g0.L(150.0f) - this.s);
            u2VarArr[2].b((measuredWidth - org.telegram.messenger.g0.L(150.0f)) - this.f, org.telegram.messenger.g0.L(185.0f) - this.w);
            u2VarArr[3].b((measuredWidth - org.telegram.messenger.g0.L(176.0f)) - this.h, org.telegram.messenger.g0.L(240.0f) - this.x);
            u2VarArr[4].b((measuredWidth - org.telegram.messenger.g0.L(130.0f)) - this.n, org.telegram.messenger.g0.L(265.0f) - this.y);
            for (u2 u2Var : u2VarArr) {
                u2Var.a(canvas);
            }
            u2[] u2VarArr2 = this.b;
            u2VarArr2[0].b(org.telegram.messenger.g0.L(50.0f) + measuredWidth + this.d, org.telegram.messenger.g0.L(120.0f) - this.r);
            u2VarArr2[1].b(org.telegram.messenger.g0.L(110.0f) + measuredWidth + this.e, org.telegram.messenger.g0.L(150.0f) - this.s);
            u2VarArr2[2].b(org.telegram.messenger.g0.L(80.0f) + measuredWidth + this.f, org.telegram.messenger.g0.L(185.0f) - this.w);
            u2VarArr2[3].b(org.telegram.messenger.g0.L(106.0f) + measuredWidth + this.h, org.telegram.messenger.g0.L(240.0f) - this.x);
            u2VarArr2[4].b(org.telegram.messenger.g0.L(60.0f) + measuredWidth + this.n, org.telegram.messenger.g0.L(265.0f) - this.y);
            for (u2 u2Var2 : u2VarArr2) {
                u2Var2.a(canvas);
            }
            int alpha = x0Var.b().getAlpha();
            Paint paint = this.J;
            paint.setAlpha(hs.e4);
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
            x0Var.b().setAlpha(hs.e4);
            canvas.drawRect(rect, x0Var.b());
            x0Var.b().setAlpha(alpha);
            if (x0Var.e) {
                int alpha2 = ((Paint) x0Var.d.a).getAlpha();
                ((Paint) x0Var.d.a).setAlpha(hs.e4);
                canvas.drawRect(rect, (Paint) x0Var.d.a);
                ((Paint) x0Var.d.a).setAlpha(alpha2);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.L) {
            for (u2 u2Var : this.a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                u2Var.o = measuredWidth;
                u2Var.k.invalidate();
            }
            for (u2 u2Var2 : this.b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                u2Var2.o = measuredWidth2;
                u2Var2.k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.H = z10;
        invalidate();
    }
}
