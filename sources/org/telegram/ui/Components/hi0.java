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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hi0 extends y9 implements sw0 {
    public final int G;
    public RadialProgress2 H;
    public ValueAnimator I;
    public float J;
    public long K;
    public boolean L;
    public final int M;
    public final Paint N;
    public Runnable O;
    public final /* synthetic */ ni0 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi0(ni0 ni0Var, Context context, int i10, Paint paint) {
        super(context);
        this.P = ni0Var;
        this.G = AndroidUtilities.dp(64.0f);
        this.K = -1L;
        this.M = i10;
        this.N = paint;
        setLayerNum(ni0Var.l1);
    }

    @Override // org.telegram.ui.Components.sw0
    public final void e(Runnable runnable) {
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

    @Override // org.telegram.ui.Components.y9, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        ni0 ni0Var = this.P;
        float[] fArr = ni0Var.O0;
        Path path = ni0Var.M0;
        ArrayList arrayList = ni0Var.b1;
        RectF rectF = ni0Var.N0;
        org.telegram.ui.cv0 cv0Var = ni0Var.h1;
        if (cv0Var == null || !cv0Var.n) {
            if (this.H != null) {
                int k10 = ni0Var.D0.k(this.M);
                if (ni0Var.i1) {
                    k10--;
                }
                Drawable drawable = getImageReceiver().getDrawable();
                long j10 = 0;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? drawable == null || (this.L && (!(drawable instanceof g6) || ((g6) drawable).d[4] <= 0)) : ((Float) arrayList.get(k10)).floatValue() < 1.0f) {
                    if (this.K < 0) {
                        this.K = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.K;
                        long j11 = this.L ? 250L : 750L;
                        if (currentTimeMillis <= 250 + j11 && currentTimeMillis > j11) {
                            this.H.E = ds.f.getInterpolation((currentTimeMillis - j11) / 250.0f);
                        }
                    }
                    if (ni0Var.g1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                } else if (this.I == null) {
                    RadialProgress2 radialProgress2 = this.H;
                    if ((radialProgress2.c ? radialProgress2.j : radialProgress2.i).w < 1.0f) {
                        radialProgress2.p(1.0f, true);
                        j10 = 100;
                    }
                    this.J = this.H.E;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setStartDelay(j10);
                    this.I.setDuration((long) (this.J * 250.0f));
                    this.I.setInterpolator(ds.f);
                    this.I.addUpdateListener(new e80(this, 5));
                    this.I.addListener(new hi.y2(this, k10, 9));
                    this.I.start();
                }
                int i10 = ni0Var.m1;
                if (i10 == 0 && ni0Var.n1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.N);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i11 = ni0Var.n1;
                    Paint paint = this.N;
                    if (i10 == i11) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f7 = ni0Var.m1;
                        canvas2.drawRoundRect(rectF, f7, f7, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i12 = 0; i12 < 4; i12++) {
                            fArr[i12] = ni0Var.m1;
                            fArr[i12 + 4] = ni0Var.n1;
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
            radialProgress2.r((i10 - i14) / 2, ic.a.A(i15, i14, 2, currentActionBarHeight), (i10 + i14) / 2, ((i15 + i14) / 2) + currentActionBarHeight);
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
        ni0 ni0Var = this.P;
        if (ni0Var.g1) {
            ni0Var.invalidate();
        }
        Runnable runnable = this.O;
        if (runnable != null) {
            runnable.run();
        }
    }
}
