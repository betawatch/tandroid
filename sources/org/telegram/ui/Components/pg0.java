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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pg0 extends g9 implements ru0 {
    public final int G;
    public RadialProgress2 H;
    public ValueAnimator I;
    public float J;
    public long K;
    public boolean L;
    public final int M;
    public final Paint N;
    public Runnable O;
    public final /* synthetic */ ug0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg0(ug0 ug0Var, Context context, int i10, Paint paint) {
        super(context);
        this.P = ug0Var;
        this.G = org.telegram.messenger.i0.L(64.0f);
        this.K = -1L;
        this.M = i10;
        this.N = paint;
        setLayerNum(ug0Var.l1);
    }

    @Override // org.telegram.ui.Components.ru0
    public final void f(Runnable runnable) {
        this.O = runnable;
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.g9, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        ug0 ug0Var = this.P;
        float[] fArr = ug0Var.O0;
        Path path = ug0Var.M0;
        ArrayList arrayList = ug0Var.b1;
        RectF rectF = ug0Var.N0;
        org.telegram.ui.qs0 qs0Var = ug0Var.h1;
        if (qs0Var == null || !qs0Var.n) {
            if (this.H != null) {
                int k10 = ug0Var.D0.k(this.M);
                if (ug0Var.i1) {
                    k10--;
                }
                Drawable t10 = getImageReceiver().t();
                long j10 = 0;
                int i10 = 4;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? t10 == null || (this.L && (!(t10 instanceof s5) || ((s5) t10).d[4] <= 0)) : ((Float) arrayList.get(k10)).floatValue() < 1.0f) {
                    if (this.K < 0) {
                        this.K = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.K;
                        long j11 = this.L ? 250L : 750L;
                        if (currentTimeMillis <= 250 + j11 && currentTimeMillis > j11) {
                            this.H.E = gr.f.getInterpolation((currentTimeMillis - j11) / 250.0f);
                        }
                    }
                    if (ug0Var.g1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                } else if (this.I == null) {
                    RadialProgress2 radialProgress2 = this.H;
                    if ((radialProgress2.c ? radialProgress2.j : radialProgress2.i).w < 1.0f) {
                        radialProgress2.p(true, 1.0f);
                        j10 = 100;
                    }
                    this.J = this.H.E;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setStartDelay(j10);
                    this.I.setDuration((long) (this.J * 250.0f));
                    this.I.setInterpolator(gr.f);
                    this.I.addUpdateListener(new r60(this, i10));
                    this.I.addListener(new bi.d5(this, k10, 10));
                    this.I.start();
                }
                int i11 = ug0Var.m1;
                if (i11 == 0 && ug0Var.n1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.N);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i12 = ug0Var.n1;
                    Paint paint = this.N;
                    if (i11 == i12) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f7 = ug0Var.m1;
                        canvas2.drawRoundRect(rectF, f7, f7, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i13 = 0; i13 < 4; i13++) {
                            fArr[i13] = ug0Var.m1;
                            fArr[i13 + 4] = ug0Var.n1;
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
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.H != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.P.z0.getOccupyStatusBar() ? org.telegram.messenger.i0.m : 0);
            int M = org.telegram.messenger.i0.M(80.0f);
            RadialProgress2 radialProgress2 = this.H;
            int i14 = this.G;
            int i15 = (i11 - currentActionBarHeight) - M;
            radialProgress2.r((i10 - i14) / 2, i0.a.u(i15, i14, 2, currentActionBarHeight), (i10 + i14) / 2, ((i15 + i14) / 2) + currentActionBarHeight);
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
        ug0 ug0Var = this.P;
        if (ug0Var.g1) {
            ug0Var.invalidate();
        }
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
    }
}
