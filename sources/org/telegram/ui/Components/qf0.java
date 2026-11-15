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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class qf0 extends i9 implements pt0 {
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
    public qf0(vf0 vf0Var, Context context, int i7, Paint paint) {
        super(context);
        this.Q = vf0Var;
        this.H = org.telegram.messenger.g0.L(64.0f);
        this.L = -1L;
        this.N = i7;
        this.O = paint;
        setLayerNum(vf0Var.m1);
    }

    @Override // org.telegram.ui.Components.pt0
    public final void d(Runnable runnable) {
        this.P = runnable;
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.i9, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        vf0 vf0Var = this.Q;
        float[] fArr = vf0Var.P0;
        Path path = vf0Var.N0;
        ArrayList arrayList = vf0Var.c1;
        RectF rectF = vf0Var.O0;
        org.telegram.ui.dr0 dr0Var = vf0Var.i1;
        if (dr0Var == null || !dr0Var.n) {
            if (this.I != null) {
                int k10 = vf0Var.E0.k(this.N);
                if (vf0Var.j1) {
                    k10--;
                }
                Drawable t6 = getImageReceiver().t();
                long j3 = 0;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? t6 == null || (this.M && (!(t6 instanceof t5) || ((t5) t6).d[4] <= 0)) : ((Float) arrayList.get(k10)).floatValue() < 1.0f) {
                    if (this.L < 0) {
                        this.L = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.L;
                        long j10 = this.M ? 250L : 750L;
                        if (currentTimeMillis <= 250 + j10 && currentTimeMillis > j10) {
                            this.I.E = er.f.getInterpolation((currentTimeMillis - j10) / 250.0f);
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
                        j3 = 100;
                    }
                    this.K = this.I.E;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J = ofFloat;
                    ofFloat.setStartDelay(j3);
                    this.J.setDuration((long) (this.K * 250.0f));
                    this.J.setInterpolator(er.f);
                    this.J.addUpdateListener(new f60(this, 3));
                    this.J.addListener(new ki.j2(this, k10, 11));
                    this.J.start();
                }
                int i7 = vf0Var.n1;
                if (i7 == 0 && vf0Var.o1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.O);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i10 = vf0Var.o1;
                    Paint paint = this.O;
                    if (i7 == i10) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f10 = vf0Var.n1;
                        canvas2.drawRoundRect(rectF, f10, f10, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i11 = 0; i11 < 4; i11++) {
                            fArr[i11] = vf0Var.n1;
                            fArr[i11 + 4] = vf0Var.o1;
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
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        if (this.I != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.Q.A0.getOccupyStatusBar() ? org.telegram.messenger.g0.m : 0);
            int M = org.telegram.messenger.g0.M(80.0f);
            RadialProgress2 radialProgress2 = this.I;
            int i13 = this.H;
            int i14 = (i10 - currentActionBarHeight) - M;
            radialProgress2.r((i7 - i13) / 2, i5.c.e(i14, i13, 2, currentActionBarHeight), (i7 + i13) / 2, ((i14 + i13) / 2) + currentActionBarHeight);
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
