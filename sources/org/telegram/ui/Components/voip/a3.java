package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class a3 extends View {
    public boolean E;
    public int F;
    public boolean G;
    public final r1 H;
    public final Paint I;
    public final Rect J;
    public final boolean K;
    public final p3[] a;
    public final p3[] b;
    public ValueAnimator c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int v;
    public int w;
    public int x;
    public boolean y;

    public a3(Activity activity, TLRPC.User user, r1 r1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.I = paint;
        this.J = new Rect();
        boolean isEnabled = LiteMode.isEnabled(512);
        this.K = isEnabled;
        this.H = r1Var;
        if (isEnabled) {
            this.a = new p3[]{new p3(user, this, AndroidUtilities.dp(32.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(35.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(26.0f))};
            this.b = new p3[]{new p3(user, this, AndroidUtilities.dp(32.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(35.0f)), new p3(user, this, AndroidUtilities.dp(28.0f)), new p3(user, this, AndroidUtilities.dp(26.0f))};
            r1Var.a(this);
            setLayerType(2, null);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    public final void a() {
        if (this.K && !this.y) {
            this.y = true;
            int dp = AndroidUtilities.dp(12.0f);
            this.F = dp;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, dp);
            this.c = ofInt;
            ofInt.addUpdateListener(new z2(this, 0));
            this.c.setInterpolator(rr.g);
            this.c.setDuration(200L);
            this.c.start();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.K) {
            for (p3 p3Var : this.a) {
                o5 o5Var = p3Var.a;
                if (o5Var != null) {
                    o5Var.a();
                    ValueAnimator valueAnimator = p3Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (p3 p3Var2 : this.b) {
                o5 o5Var2 = p3Var2.a;
                if (o5Var2 != null) {
                    o5Var2.a();
                    ValueAnimator valueAnimator2 = p3Var2.b;
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
            for (p3 p3Var : this.a) {
                o5 o5Var = p3Var.a;
                if (o5Var != null) {
                    ValueAnimator valueAnimator = p3Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        p3Var.b = null;
                    }
                    o5Var.b();
                }
            }
            for (p3 p3Var2 : this.b) {
                o5 o5Var2 = p3Var2.a;
                if (o5Var2 != null) {
                    ValueAnimator valueAnimator2 = p3Var2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        p3Var2.b = null;
                    }
                    o5Var2.b();
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
            r1 r1Var = this.H;
            r1Var.d(x10, y3);
            int measuredWidth = getMeasuredWidth() / 2;
            p3[] p3VarArr = this.a;
            p3VarArr[0].b((measuredWidth - AndroidUtilities.dp(120.0f)) - this.d, AndroidUtilities.dp(120.0f) - this.r);
            p3VarArr[1].b((measuredWidth - AndroidUtilities.dp(180.0f)) - this.e, AndroidUtilities.dp(150.0f) - this.s);
            p3VarArr[2].b((measuredWidth - AndroidUtilities.dp(150.0f)) - this.f, AndroidUtilities.dp(185.0f) - this.v);
            p3VarArr[3].b((measuredWidth - AndroidUtilities.dp(176.0f)) - this.h, AndroidUtilities.dp(240.0f) - this.w);
            p3VarArr[4].b((measuredWidth - AndroidUtilities.dp(130.0f)) - this.n, AndroidUtilities.dp(265.0f) - this.x);
            for (p3 p3Var : p3VarArr) {
                p3Var.a(canvas);
            }
            p3[] p3VarArr2 = this.b;
            p3VarArr2[0].b(AndroidUtilities.dp(50.0f) + measuredWidth + this.d, AndroidUtilities.dp(120.0f) - this.r);
            p3VarArr2[1].b(AndroidUtilities.dp(110.0f) + measuredWidth + this.e, AndroidUtilities.dp(150.0f) - this.s);
            p3VarArr2[2].b(AndroidUtilities.dp(80.0f) + measuredWidth + this.f, AndroidUtilities.dp(185.0f) - this.v);
            p3VarArr2[3].b(AndroidUtilities.dp(106.0f) + measuredWidth + this.h, AndroidUtilities.dp(240.0f) - this.w);
            p3VarArr2[4].b(AndroidUtilities.dp(60.0f) + measuredWidth + this.n, AndroidUtilities.dp(265.0f) - this.x);
            for (p3 p3Var2 : p3VarArr2) {
                p3Var2.a(canvas);
            }
            int alpha = r1Var.b().getAlpha();
            Paint paint = this.I;
            paint.setAlpha(255);
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
            r1Var.b().setAlpha(255);
            canvas.drawRect(rect, r1Var.b());
            r1Var.b().setAlpha(alpha);
            if (r1Var.e) {
                int alpha2 = ((Paint) r1Var.d.a).getAlpha();
                ((Paint) r1Var.d.a).setAlpha(255);
                canvas.drawRect(rect, (Paint) r1Var.d.a);
                ((Paint) r1Var.d.a).setAlpha(alpha2);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.K) {
            for (p3 p3Var : this.a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                p3Var.o = measuredWidth;
                p3Var.k.invalidate();
            }
            for (p3 p3Var2 : this.b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                p3Var2.o = measuredWidth2;
                p3Var2.k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.G = z10;
        invalidate();
    }
}
