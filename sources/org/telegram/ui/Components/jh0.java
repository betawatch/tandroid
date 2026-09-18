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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class jh0 extends u9 implements nv0 {
    public final int G;
    public RadialProgress2 H;
    public ValueAnimator I;
    public float J;
    public long K;
    public boolean L;
    public final int M;
    public final Paint N;
    public Runnable O;
    public final /* synthetic */ ph0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh0(ph0 ph0Var, Context context, int i10, Paint paint) {
        super(context);
        this.P = ph0Var;
        this.G = AndroidUtilities.dp(64.0f);
        this.K = -1L;
        this.M = i10;
        this.N = paint;
        setLayerNum(ph0Var.l1);
    }

    @Override // org.telegram.ui.Components.nv0
    public final void g(Runnable runnable) {
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

    @Override // org.telegram.ui.Components.u9, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        ph0 ph0Var = this.P;
        float[] fArr = ph0Var.O0;
        Path path = ph0Var.M0;
        ArrayList arrayList = ph0Var.b1;
        RectF rectF = ph0Var.N0;
        org.telegram.ui.rv0 rv0Var = ph0Var.h1;
        if (rv0Var == null || !rv0Var.n) {
            if (this.H != null) {
                int k10 = ph0Var.D0.k(this.M);
                if (ph0Var.i1) {
                    k10--;
                }
                Drawable drawable = getImageReceiver().getDrawable();
                long j3 = 0;
                int i10 = 4;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? drawable == null || (this.L && (!(drawable instanceof b6) || ((b6) drawable).d[4] <= 0)) : ((Float) arrayList.get(k10)).floatValue() < 1.0f) {
                    if (this.K < 0) {
                        this.K = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.K;
                        long j10 = this.L ? 250L : 750L;
                        if (currentTimeMillis <= 250 + j10 && currentTimeMillis > j10) {
                            this.H.E = qr.f.getInterpolation((currentTimeMillis - j10) / 250.0f);
                        }
                    }
                    if (ph0Var.g1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                } else if (this.I == null) {
                    RadialProgress2 radialProgress2 = this.H;
                    if ((radialProgress2.c ? radialProgress2.j : radialProgress2.i).w < 1.0f) {
                        radialProgress2.o(1.0f, true);
                        j3 = 100;
                    }
                    this.J = this.H.E;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setStartDelay(j3);
                    this.I.setDuration((long) (this.J * 250.0f));
                    this.I.setInterpolator(qr.f);
                    this.I.addUpdateListener(new h70(this, i10));
                    this.I.addListener(new ei.v2(this, k10, 8));
                    this.I.start();
                }
                int i11 = ph0Var.m1;
                if (i11 == 0 && ph0Var.n1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.N);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i12 = ph0Var.n1;
                    Paint paint = this.N;
                    if (i11 == i12) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f7 = ph0Var.m1;
                        canvas2.drawRoundRect(rectF, f7, f7, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i13 = 0; i13 < 4; i13++) {
                            fArr[i13] = ph0Var.m1;
                            fArr[i13 + 4] = ph0Var.n1;
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
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.P.z0.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            int dp2 = AndroidUtilities.dp2(80.0f);
            RadialProgress2 radialProgress2 = this.H;
            int i14 = this.G;
            int i15 = (i11 - currentActionBarHeight) - dp2;
            radialProgress2.q((i10 - i14) / 2, hg.k0.C(i15, i14, 2, currentActionBarHeight), (i10 + i14) / 2, ((i15 + i14) / 2) + currentActionBarHeight);
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
        ph0 ph0Var = this.P;
        if (ph0Var.g1) {
            ph0Var.invalidate();
        }
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
    }
}
