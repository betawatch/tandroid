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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qh0 extends p9 implements nv0 {
    public final int D;
    public RadialProgress2 E;
    public ValueAnimator F;
    public float G;
    public long H;
    public boolean I;
    public final int J;
    public final Paint K;
    public Runnable L;
    public final /* synthetic */ wh0 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh0(wh0 wh0Var, Context context, int i10, Paint paint) {
        super(context);
        this.M = wh0Var;
        this.D = AndroidUtilities.dp(64.0f);
        this.H = -1L;
        this.J = i10;
        this.K = paint;
        setLayerNum(wh0Var.i1);
    }

    @Override // org.telegram.ui.Components.nv0
    public final void g(Runnable runnable) {
        this.L = runnable;
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.L;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        wh0 wh0Var = this.M;
        float[] fArr = wh0Var.L0;
        Path path = wh0Var.J0;
        ArrayList arrayList = wh0Var.Y0;
        RectF rectF = wh0Var.K0;
        org.telegram.ui.cv0 cv0Var = wh0Var.e1;
        if (cv0Var == null || !cv0Var.n) {
            if (this.E != null) {
                int k10 = wh0Var.A0.k(this.J);
                if (wh0Var.f1) {
                    k10--;
                }
                Drawable drawable = getImageReceiver().getDrawable();
                long j10 = 0;
                int i10 = 4;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? drawable == null || (this.I && (!(drawable instanceof y5) || ((y5) drawable).d[4] <= 0)) : ((Float) arrayList.get(k10)).floatValue() < 1.0f) {
                    if (this.H < 0) {
                        this.H = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.H;
                        long j11 = this.I ? 250L : 750L;
                        if (currentTimeMillis <= 250 + j11 && currentTimeMillis > j11) {
                            this.E.E = mr.f.getInterpolation((currentTimeMillis - j11) / 250.0f);
                        }
                    }
                    if (wh0Var.d1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                } else if (this.F == null) {
                    RadialProgress2 radialProgress2 = this.E;
                    if ((radialProgress2.c ? radialProgress2.j : radialProgress2.i).w < 1.0f) {
                        radialProgress2.o(1.0f, true);
                        j10 = 100;
                    }
                    this.G = this.E.E;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.F = ofFloat;
                    ofFloat.setStartDelay(j10);
                    this.F.setDuration((long) (this.G * 250.0f));
                    this.F.setInterpolator(mr.f);
                    this.F.addUpdateListener(new j70(this, i10));
                    this.F.addListener(new org.telegram.ui.Cells.a4(this, k10, 5));
                    this.F.start();
                }
                int i11 = wh0Var.j1;
                if (i11 == 0 && wh0Var.k1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.K);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i12 = wh0Var.k1;
                    Paint paint = this.K;
                    if (i11 == i12) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f10 = wh0Var.j1;
                        canvas2.drawRoundRect(rectF, f10, f10, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i13 = 0; i13 < 4; i13++) {
                            fArr[i13] = wh0Var.j1;
                            fArr[i13 + 4] = wh0Var.k1;
                        }
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.drawPath(path, paint);
                    }
                }
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas);
            RadialProgress2 radialProgress22 = this.E;
            if (radialProgress22 == null || radialProgress22.E <= 0.0f) {
                return;
            }
            radialProgress22.draw(canvas2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.E != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.M.w0.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            int dp2 = AndroidUtilities.dp2(80.0f);
            RadialProgress2 radialProgress2 = this.E;
            int i14 = this.D;
            int i15 = (i11 - currentActionBarHeight) - dp2;
            radialProgress2.q((i10 - i14) / 2, kf.k0.d(i15, i14, 2, currentActionBarHeight), (i10 + i14) / 2, ((i15 + i14) / 2) + currentActionBarHeight);
        }
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.L;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        wh0 wh0Var = this.M;
        if (wh0Var.d1) {
            wh0Var.invalidate();
        }
        Runnable runnable = this.L;
        if (runnable != null) {
            runnable.run();
        }
    }
}
