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
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class z2 extends View {
    public boolean B;
    public int C;
    public boolean D;
    public final n1 E;
    public final Paint F;
    public final Rect G;
    public final boolean H;
    public final o3[] a;
    public final o3[] b;
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

    public z2(Activity activity, TLRPC.User user, n1 n1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.F = paint;
        this.G = new Rect();
        boolean isEnabled = LiteMode.isEnabled(512);
        this.H = isEnabled;
        this.E = n1Var;
        if (isEnabled) {
            this.a = new o3[]{new o3(user, this, AndroidUtilities.dp(32.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(35.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(26.0f))};
            this.b = new o3[]{new o3(user, this, AndroidUtilities.dp(32.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(35.0f)), new o3(user, this, AndroidUtilities.dp(28.0f)), new o3(user, this, AndroidUtilities.dp(26.0f))};
            n1Var.a(this);
            setLayerType(2, null);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    public final void a() {
        if (this.H && !this.y) {
            this.y = true;
            int dp = AndroidUtilities.dp(12.0f);
            this.C = dp;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, dp);
            this.c = ofInt;
            ofInt.addUpdateListener(new y2(this, 0));
            this.c.setInterpolator(mr.g);
            this.c.setDuration(200L);
            this.c.start();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.H) {
            for (o3 o3Var : this.a) {
                j5 j5Var = o3Var.a;
                if (j5Var != null) {
                    j5Var.a();
                    ValueAnimator valueAnimator = o3Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (o3 o3Var2 : this.b) {
                j5 j5Var2 = o3Var2.a;
                if (j5Var2 != null) {
                    j5Var2.a();
                    ValueAnimator valueAnimator2 = o3Var2.b;
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
        if (this.H) {
            for (o3 o3Var : this.a) {
                j5 j5Var = o3Var.a;
                if (j5Var != null) {
                    ValueAnimator valueAnimator = o3Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        o3Var.b = null;
                    }
                    j5Var.b();
                }
            }
            for (o3 o3Var2 : this.b) {
                j5 j5Var2 = o3Var2.a;
                if (j5Var2 != null) {
                    ValueAnimator valueAnimator2 = o3Var2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        o3Var2.b = null;
                    }
                    j5Var2.b();
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
        if (this.H && !this.D) {
            int width = getWidth();
            int height = getHeight();
            Rect rect = this.G;
            rect.set(0, 0, width, height);
            float x10 = getX();
            float y10 = getY();
            n1 n1Var = this.E;
            n1Var.d(x10, y10);
            int measuredWidth = getMeasuredWidth() / 2;
            o3[] o3VarArr = this.a;
            o3VarArr[0].b((measuredWidth - AndroidUtilities.dp(120.0f)) - this.d, AndroidUtilities.dp(120.0f) - this.r);
            o3VarArr[1].b((measuredWidth - AndroidUtilities.dp(180.0f)) - this.e, AndroidUtilities.dp(150.0f) - this.s);
            o3VarArr[2].b((measuredWidth - AndroidUtilities.dp(150.0f)) - this.f, AndroidUtilities.dp(185.0f) - this.v);
            o3VarArr[3].b((measuredWidth - AndroidUtilities.dp(176.0f)) - this.h, AndroidUtilities.dp(240.0f) - this.w);
            o3VarArr[4].b((measuredWidth - AndroidUtilities.dp(130.0f)) - this.n, AndroidUtilities.dp(265.0f) - this.x);
            for (o3 o3Var : o3VarArr) {
                o3Var.a(canvas);
            }
            o3[] o3VarArr2 = this.b;
            o3VarArr2[0].b(AndroidUtilities.dp(50.0f) + measuredWidth + this.d, AndroidUtilities.dp(120.0f) - this.r);
            o3VarArr2[1].b(AndroidUtilities.dp(110.0f) + measuredWidth + this.e, AndroidUtilities.dp(150.0f) - this.s);
            o3VarArr2[2].b(AndroidUtilities.dp(80.0f) + measuredWidth + this.f, AndroidUtilities.dp(185.0f) - this.v);
            o3VarArr2[3].b(AndroidUtilities.dp(106.0f) + measuredWidth + this.h, AndroidUtilities.dp(240.0f) - this.w);
            o3VarArr2[4].b(AndroidUtilities.dp(60.0f) + measuredWidth + this.n, AndroidUtilities.dp(265.0f) - this.x);
            for (o3 o3Var2 : o3VarArr2) {
                o3Var2.a(canvas);
            }
            int alpha = n1Var.b().getAlpha();
            Paint paint = this.F;
            paint.setAlpha(255);
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
            n1Var.b().setAlpha(255);
            canvas.drawRect(rect, n1Var.b());
            n1Var.b().setAlpha(alpha);
            if (n1Var.e) {
                int alpha2 = ((Paint) n1Var.d.a).getAlpha();
                ((Paint) n1Var.d.a).setAlpha(255);
                canvas.drawRect(rect, (Paint) n1Var.d.a);
                ((Paint) n1Var.d.a).setAlpha(alpha2);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.H) {
            for (o3 o3Var : this.a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                o3Var.o = measuredWidth;
                o3Var.k.invalidate();
            }
            for (o3 o3Var2 : this.b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                o3Var2.o = measuredWidth2;
                o3Var2.k.invalidate();
            }
        }
    }

    public void setState(boolean z4) {
        this.D = z4;
        invalidate();
    }
}
