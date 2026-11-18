package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ks;
import org.telegram.messenger.pc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m5;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class u2 extends View {
    public boolean E;
    public boolean F;
    public int G;
    public boolean H;
    public final l1 I;
    public final Paint J;
    public final Rect K;
    public final boolean L;
    public final i3[] a;
    public final i3[] b;
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

    public u2(Activity activity, TLRPC.User user, l1 l1Var) {
        super(activity);
        Paint paint = new Paint(1);
        this.J = paint;
        this.K = new Rect();
        boolean e10 = pc.e(512);
        this.L = e10;
        this.I = l1Var;
        if (e10) {
            this.a = new i3[]{new i3(user, this, org.telegram.messenger.g0.L(32.0f)), new i3(user, this, org.telegram.messenger.g0.L(28.0f)), new i3(user, this, org.telegram.messenger.g0.L(35.0f)), new i3(user, this, org.telegram.messenger.g0.L(28.0f)), new i3(user, this, org.telegram.messenger.g0.L(26.0f))};
            this.b = new i3[]{new i3(user, this, org.telegram.messenger.g0.L(32.0f)), new i3(user, this, org.telegram.messenger.g0.L(28.0f)), new i3(user, this, org.telegram.messenger.g0.L(35.0f)), new i3(user, this, org.telegram.messenger.g0.L(28.0f)), new i3(user, this, org.telegram.messenger.g0.L(26.0f))};
            l1Var.a(this);
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
            ofInt.addUpdateListener(new t2(this, 0));
            this.c.setInterpolator(lr.g);
            this.c.setDuration(200L);
            this.c.start();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.L) {
            for (i3 i3Var : this.a) {
                m5 m5Var = i3Var.a;
                if (m5Var != null) {
                    m5Var.a();
                    ValueAnimator valueAnimator = i3Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.start();
                    }
                }
            }
            for (i3 i3Var2 : this.b) {
                m5 m5Var2 = i3Var2.a;
                if (m5Var2 != null) {
                    m5Var2.a();
                    ValueAnimator valueAnimator2 = i3Var2.b;
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
            for (i3 i3Var : this.a) {
                m5 m5Var = i3Var.a;
                if (m5Var != null) {
                    ValueAnimator valueAnimator = i3Var.b;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        i3Var.b = null;
                    }
                    m5Var.b();
                }
            }
            for (i3 i3Var2 : this.b) {
                m5 m5Var2 = i3Var2.a;
                if (m5Var2 != null) {
                    ValueAnimator valueAnimator2 = i3Var2.b;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        i3Var2.b = null;
                    }
                    m5Var2.b();
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
            l1 l1Var = this.I;
            l1Var.d(x10, y10);
            int measuredWidth = getMeasuredWidth() / 2;
            i3[] i3VarArr = this.a;
            i3VarArr[0].b((measuredWidth - org.telegram.messenger.g0.L(120.0f)) - this.d, org.telegram.messenger.g0.L(120.0f) - this.r);
            i3VarArr[1].b((measuredWidth - org.telegram.messenger.g0.L(180.0f)) - this.e, org.telegram.messenger.g0.L(150.0f) - this.s);
            i3VarArr[2].b((measuredWidth - org.telegram.messenger.g0.L(150.0f)) - this.f, org.telegram.messenger.g0.L(185.0f) - this.w);
            i3VarArr[3].b((measuredWidth - org.telegram.messenger.g0.L(176.0f)) - this.h, org.telegram.messenger.g0.L(240.0f) - this.x);
            i3VarArr[4].b((measuredWidth - org.telegram.messenger.g0.L(130.0f)) - this.n, org.telegram.messenger.g0.L(265.0f) - this.y);
            for (i3 i3Var : i3VarArr) {
                i3Var.a(canvas);
            }
            i3[] i3VarArr2 = this.b;
            i3VarArr2[0].b(org.telegram.messenger.g0.L(50.0f) + measuredWidth + this.d, org.telegram.messenger.g0.L(120.0f) - this.r);
            i3VarArr2[1].b(org.telegram.messenger.g0.L(110.0f) + measuredWidth + this.e, org.telegram.messenger.g0.L(150.0f) - this.s);
            i3VarArr2[2].b(org.telegram.messenger.g0.L(80.0f) + measuredWidth + this.f, org.telegram.messenger.g0.L(185.0f) - this.w);
            i3VarArr2[3].b(org.telegram.messenger.g0.L(106.0f) + measuredWidth + this.h, org.telegram.messenger.g0.L(240.0f) - this.x);
            i3VarArr2[4].b(org.telegram.messenger.g0.L(60.0f) + measuredWidth + this.n, org.telegram.messenger.g0.L(265.0f) - this.y);
            for (i3 i3Var2 : i3VarArr2) {
                i3Var2.a(canvas);
            }
            int alpha = l1Var.b().getAlpha();
            Paint paint = this.J;
            paint.setAlpha(ks.e4);
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint, 31);
            l1Var.b().setAlpha(ks.e4);
            canvas.drawRect(rect, l1Var.b());
            l1Var.b().setAlpha(alpha);
            if (l1Var.e) {
                int alpha2 = ((Paint) l1Var.d.a).getAlpha();
                ((Paint) l1Var.d.a).setAlpha(ks.e4);
                canvas.drawRect(rect, (Paint) l1Var.d.a);
                ((Paint) l1Var.d.a).setAlpha(alpha2);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.L) {
            for (i3 i3Var : this.a) {
                int measuredWidth = getMeasuredWidth();
                getMeasuredHeight();
                i3Var.o = measuredWidth;
                i3Var.k.invalidate();
            }
            for (i3 i3Var2 : this.b) {
                int measuredWidth2 = getMeasuredWidth();
                getMeasuredHeight();
                i3Var2.o = measuredWidth2;
                i3Var2.k.invalidate();
            }
        }
    }

    public void setState(boolean z10) {
        this.H = z10;
        invalidate();
    }
}
