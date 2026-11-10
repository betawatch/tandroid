package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class nf0 extends k9 implements pt0 {
    public final int G;
    public RadialProgress2 H;
    public ValueAnimator I;
    public float J;
    public long K;
    public boolean L;
    public final int M;
    public final Paint N;
    public Runnable O;
    public final /* synthetic */ sf0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nf0(sf0 sf0Var, Context context, int i7, Paint paint) {
        super(context);
        this.P = sf0Var;
        this.G = org.telegram.messenger.g0.L(64.0f);
        this.K = -1L;
        this.M = i7;
        this.N = paint;
        setLayerNum(sf0Var.l1);
    }

    @Override // org.telegram.ui.Components.pt0
    public final void f(Runnable runnable) {
        this.O = runnable;
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        sf0 sf0Var = this.P;
        float[] fArr = sf0Var.O0;
        Path path = sf0Var.M0;
        ArrayList arrayList = sf0Var.b1;
        RectF rectF = sf0Var.N0;
        org.telegram.ui.ir0 ir0Var = sf0Var.h1;
        if (ir0Var == null || !ir0Var.n) {
            if (this.H != null) {
                int k10 = sf0Var.D0.k(this.M);
                if (sf0Var.i1) {
                    k10--;
                }
                Drawable t6 = getImageReceiver().t();
                long j3 = 0;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? t6 == null || (this.L && (!(t6 instanceof u5) || ((u5) t6).d[4] <= 0)) : ((Float) arrayList.get(k10)).floatValue() < 1.0f) {
                    if (this.K < 0) {
                        this.K = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.K;
                        long j10 = this.L ? 250L : 750L;
                        if (currentTimeMillis <= 250 + j10 && currentTimeMillis > j10) {
                            this.H.E = wq.f.getInterpolation((currentTimeMillis - j10) / 250.0f);
                        }
                    }
                    if (sf0Var.g1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                } else if (this.I == null) {
                    RadialProgress2 radialProgress2 = this.H;
                    if ((radialProgress2.c ? radialProgress2.j : radialProgress2.i).w < 1.0f) {
                        radialProgress2.p(true, 1.0f);
                        j3 = 100;
                    }
                    this.J = this.H.E;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setStartDelay(j3);
                    this.I.setDuration((long) (this.J * 250.0f));
                    this.I.setInterpolator(wq.f);
                    this.I.addUpdateListener(new c60(this, 3));
                    this.I.addListener(new hi.m2(this, k10, 11));
                    this.I.start();
                }
                int i7 = sf0Var.m1;
                if (i7 == 0 && sf0Var.n1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.N);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i10 = sf0Var.n1;
                    Paint paint = this.N;
                    if (i7 == i10) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f10 = sf0Var.m1;
                        canvas2.drawRoundRect(rectF, f10, f10, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i11 = 0; i11 < 4; i11++) {
                            fArr[i11] = sf0Var.m1;
                            fArr[i11 + 4] = sf0Var.n1;
                        }
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.drawPath(path, paint);
                    }
                }
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas);
            RadialProgress2 radialProgress22 = this.H;
            if (radialProgress22 == null || radialProgress22.E <= 0.0f) {
                return;
            }
            radialProgress22.draw(canvas2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (this.H != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.P.z0.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
            int M = org.telegram.messenger.g0.M(80.0f);
            RadialProgress2 radialProgress2 = this.H;
            int i13 = this.G;
            int i14 = (i10 - currentActionBarHeight) - M;
            radialProgress2.r((i7 - i13) / 2, jg.g.D(i14, i13, 2, currentActionBarHeight), (i7 + i13) / 2, ((i14 + i13) / 2) + currentActionBarHeight);
        }
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        sf0 sf0Var = this.P;
        if (sf0Var.g1) {
            sf0Var.invalidate();
        }
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
    }
}
