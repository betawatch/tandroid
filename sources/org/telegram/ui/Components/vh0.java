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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class vh0 extends v9 implements zv0 {
    public final int G;
    public RadialProgress2 H;
    public ValueAnimator I;
    public float J;
    public long K;
    public boolean L;
    public final int M;
    public final Paint N;
    public Runnable O;
    public final /* synthetic */ bi0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh0(bi0 bi0Var, Context context, int i10, Paint paint) {
        super(context);
        this.P = bi0Var;
        this.G = AndroidUtilities.dp(64.0f);
        this.K = -1L;
        this.M = i10;
        this.N = paint;
        setLayerNum(bi0Var.l1);
    }

    @Override // org.telegram.ui.Components.zv0
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

    @Override // org.telegram.ui.Components.v9, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        bi0 bi0Var = this.P;
        float[] fArr = bi0Var.O0;
        Path path = bi0Var.M0;
        ArrayList arrayList = bi0Var.b1;
        RectF rectF = bi0Var.N0;
        org.telegram.ui.pv0 pv0Var = bi0Var.h1;
        if (pv0Var == null || !pv0Var.n) {
            if (this.H != null) {
                int k10 = bi0Var.D0.k(this.M);
                if (bi0Var.i1) {
                    k10--;
                }
                Drawable drawable = getImageReceiver().getDrawable();
                long j3 = 0;
                int i10 = 4;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? drawable == null || (this.L && (!(drawable instanceof c6) || ((c6) drawable).d[4] <= 0)) : ((Float) arrayList.get(k10)).floatValue() < 1.0f) {
                    if (this.K < 0) {
                        this.K = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.K;
                        long j10 = this.L ? 250L : 750L;
                        if (currentTimeMillis <= 250 + j10 && currentTimeMillis > j10) {
                            this.H.E = qr.f.getInterpolation((currentTimeMillis - j10) / 250.0f);
                        }
                    }
                    if (bi0Var.g1) {
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
                    this.I.addUpdateListener(new s70(this, i10));
                    this.I.addListener(new ei.v2(this, k10, 8));
                    this.I.start();
                }
                int i11 = bi0Var.m1;
                if (i11 == 0 && bi0Var.n1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.N);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i12 = bi0Var.n1;
                    Paint paint = this.N;
                    if (i11 == i12) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f7 = bi0Var.m1;
                        canvas2.drawRoundRect(rectF, f7, f7, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i13 = 0; i13 < 4; i13++) {
                            fArr[i13] = bi0Var.m1;
                            fArr[i13 + 4] = bi0Var.n1;
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
            radialProgress2.q((i10 - i14) / 2, hg.k0.z(i15, i14, 2, currentActionBarHeight), (i10 + i14) / 2, ((i15 + i14) / 2) + currentActionBarHeight);
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
        bi0 bi0Var = this.P;
        if (bi0Var.g1) {
            bi0Var.invalidate();
        }
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
    }
}
