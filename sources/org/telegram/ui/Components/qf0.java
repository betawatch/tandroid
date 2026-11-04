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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qf0 extends k9 implements nt0 {
    public final int H;
    public RadialProgress2 I;
    public ValueAnimator J;
    public float K;
    public long L;
    public boolean M;
    public final int N;
    public final Paint O;
    public Runnable P;
    public final /* synthetic */ vf0 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf0(vf0 vf0Var, Context context, int i3, Paint paint) {
        super(context);
        this.Q = vf0Var;
        this.H = org.telegram.messenger.g0.L(64.0f);
        this.L = -1L;
        this.N = i3;
        this.O = paint;
        setLayerNum(vf0Var.m1);
    }

    @Override // org.telegram.ui.Components.nt0
    public final void f(Runnable runnable) {
        this.P = runnable;
    }

    @Override // android.view.View
    public final void invalidate(int i3, int i10, int i11, int i12) {
        super.invalidate(i3, i10, i11, i12);
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        vf0 vf0Var = this.Q;
        float[] fArr = vf0Var.P0;
        Path path = vf0Var.N0;
        ArrayList arrayList = vf0Var.c1;
        RectF rectF = vf0Var.O0;
        org.telegram.ui.vq0 vq0Var = vf0Var.i1;
        if (vq0Var == null || !vq0Var.n) {
            if (this.I != null) {
                int k10 = vf0Var.E0.k(this.N);
                if (vf0Var.j1) {
                    k10--;
                }
                Drawable t10 = getImageReceiver().t();
                long j10 = 0;
                int i3 = 4;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? t10 == null || (this.M && (!(t10 instanceof t5) || ((t5) t10).d[4] <= 0)) : ((Float) arrayList.get(k10)).floatValue() < 1.0f) {
                    if (this.L < 0) {
                        this.L = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.L;
                        long j11 = this.M ? 250L : 750L;
                        if (currentTimeMillis <= 250 + j11 && currentTimeMillis > j11) {
                            this.I.E = xq.f.getInterpolation((currentTimeMillis - j11) / 250.0f);
                        }
                    }
                    if (vf0Var.h1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                } else if (this.J == null) {
                    RadialProgress2 radialProgress2 = this.I;
                    if ((radialProgress2.c ? radialProgress2.j : radialProgress2.i).w < 1.0f) {
                        radialProgress2.p(true, 1.0f);
                        j10 = 100;
                    }
                    this.K = this.I.E;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J = ofFloat;
                    ofFloat.setStartDelay(j10);
                    this.J.setDuration((long) (this.K * 250.0f));
                    this.J.setInterpolator(xq.f);
                    this.J.addUpdateListener(new y50(this, i3));
                    this.J.addListener(new ii.m2(this, k10, 11));
                    this.J.start();
                }
                int i10 = vf0Var.n1;
                if (i10 == 0 && vf0Var.o1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.O);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i11 = vf0Var.o1;
                    Paint paint = this.O;
                    if (i10 == i11) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f10 = vf0Var.n1;
                        canvas2.drawRoundRect(rectF, f10, f10, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i12 = 0; i12 < 4; i12++) {
                            fArr[i12] = vf0Var.n1;
                            fArr[i12 + 4] = vf0Var.o1;
                        }
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.drawPath(path, paint);
                    }
                }
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas);
            RadialProgress2 radialProgress22 = this.I;
            if (radialProgress22 == null || radialProgress22.E <= 0.0f) {
                return;
            }
            radialProgress22.draw(canvas2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        if (this.I != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.Q.A0.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
            int M = org.telegram.messenger.g0.M(80.0f);
            RadialProgress2 radialProgress2 = this.I;
            int i13 = this.H;
            int i14 = (i10 - currentActionBarHeight) - M;
            radialProgress2.r((i3 - i13) / 2, k2.p1.e(i14, i13, 2, currentActionBarHeight), (i3 + i13) / 2, ((i14 + i13) / 2) + currentActionBarHeight);
        }
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        vf0 vf0Var = this.Q;
        if (vf0Var.h1) {
            vf0Var.invalidate();
        }
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }
}
