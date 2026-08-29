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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b3 extends View {
    public boolean A;
    public int B;
    public boolean C;
    public final o1 D;
    public final Paint E;
    public final Rect F;
    public final boolean G;
    public final q3[] a;
    public final q3[] b;
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

    public b3(Activity activity, TLRPC.User user, o1 o1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.E = paint;
        this.F = new Rect();
        boolean isEnabled = LiteMode.isEnabled(512);
        this.G = isEnabled;
        this.D = o1Var;
        if (isEnabled) {
            this.a = new q3[]{new q3(user, this, AndroidUtilities.dp(32.0f)), new q3(user, this, AndroidUtilities.dp(28.0f)), new q3(user, this, AndroidUtilities.dp(35.0f)), new q3(user, this, AndroidUtilities.dp(28.0f)), new q3(user, this, AndroidUtilities.dp(26.0f))};
            this.b = new q3[]{new q3(user, this, AndroidUtilities.dp(32.0f)), new q3(user, this, AndroidUtilities.dp(28.0f)), new q3(user, this, AndroidUtilities.dp(35.0f)), new q3(user, this, AndroidUtilities.dp(28.0f)), new q3(user, this, AndroidUtilities.dp(26.0f))};
            o1Var.a(this);
            setLayerType(2, null);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
    }

    public final void a() {
        if (this.G && !this.y) {
            this.y = true;
            int dp = AndroidUtilities.dp(12.0f);
            this.B = dp;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, dp);
            this.c = ofInt;
            ofInt.addUpdateListener(new a3(this, 0));
            this.c.setInterpolator(jr.g);
            this.c.setDuration(200L);
            this.c.start();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.G) {
            for (q3 q3Var : this.a) {
                n5 n5Var = q3Var.a;
                if (n5Var != null) {
                    n5Var.a();
                    ValueAnimator valueAnimator = q3Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (q3 q3Var2 : this.b) {
                n5 n5Var2 = q3Var2.a;
                if (n5Var2 != null) {
                    n5Var2.a();
                    ValueAnimator valueAnimator2 = q3Var2.b;
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
        if (this.G) {
            for (q3 q3Var : this.a) {
                n5 n5Var = q3Var.a;
                if (n5Var != null) {
                    ValueAnimator valueAnimator = q3Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        q3Var.b = null;
                    }
                    n5Var.b();
                }
            }
            for (q3 q3Var2 : this.b) {
                n5 n5Var2 = q3Var2.a;
                if (n5Var2 != null) {
                    ValueAnimator valueAnimator2 = q3Var2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        q3Var2.b = null;
                    }
                    n5Var2.b();
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
        if (this.G && !this.C) {
            int width = getWidth();
            int height = getHeight();
            Rect rect = this.F;
            rect.set(0, 0, width, height);
            float x4 = getX();
            float y8 = getY();
            o1 o1Var = this.D;
            o1Var.d(x4, y8);
            int measuredWidth = getMeasuredWidth() / 2;
            q3[] q3VarArr = this.a;
            q3VarArr[0].b((measuredWidth - AndroidUtilities.dp(120.0f)) - this.d, AndroidUtilities.dp(120.0f) - this.r);
            q3VarArr[1].b((measuredWidth - AndroidUtilities.dp(180.0f)) - this.e, AndroidUtilities.dp(150.0f) - this.s);
            q3VarArr[2].b((measuredWidth - AndroidUtilities.dp(150.0f)) - this.f, AndroidUtilities.dp(185.0f) - this.v);
            q3VarArr[3].b((measuredWidth - AndroidUtilities.dp(176.0f)) - this.h, AndroidUtilities.dp(240.0f) - this.w);
            q3VarArr[4].b((measuredWidth - AndroidUtilities.dp(130.0f)) - this.n, AndroidUtilities.dp(265.0f) - this.x);
            for (q3 q3Var : q3VarArr) {
                q3Var.a(canvas);
            }
            q3[] q3VarArr2 = this.b;
            q3VarArr2[0].b(AndroidUtilities.dp(50.0f) + measuredWidth + this.d, AndroidUtilities.dp(120.0f) - this.r);
            q3VarArr2[1].b(AndroidUtilities.dp(110.0f) + measuredWidth + this.e, AndroidUtilities.dp(150.0f) - this.s);
            q3VarArr2[2].b(AndroidUtilities.dp(80.0f) + measuredWidth + this.f, AndroidUtilities.dp(185.0f) - this.v);
            q3VarArr2[3].b(AndroidUtilities.dp(106.0f) + measuredWidth + this.h, AndroidUtilities.dp(240.0f) - this.w);
            q3VarArr2[4].b(AndroidUtilities.dp(60.0f) + measuredWidth + this.n, AndroidUtilities.dp(265.0f) - this.x);
            for (q3 q3Var2 : q3VarArr2) {
                q3Var2.a(canvas);
            }
            int alpha = o1Var.b().getAlpha();
            Paint paint = this.E;
            paint.setAlpha(255);
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
            o1Var.b().setAlpha(255);
            canvas.drawRect(rect, o1Var.b());
            o1Var.b().setAlpha(alpha);
            if (o1Var.e) {
                int alpha2 = ((Paint) o1Var.d.d).getAlpha();
                ((Paint) o1Var.d.d).setAlpha(255);
                canvas.drawRect(rect, (Paint) o1Var.d.d);
                ((Paint) o1Var.d.d).setAlpha(alpha2);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.G) {
            for (q3 q3Var : this.a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                q3Var.o = measuredWidth;
                q3Var.k.invalidate();
            }
            for (q3 q3Var2 : this.b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                q3Var2.o = measuredWidth2;
                q3Var2.k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.C = z10;
        invalidate();
    }
}
