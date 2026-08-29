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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class eh0 extends t9 implements ev0 {
    public final int C;
    public RadialProgress2 D;
    public ValueAnimator E;
    public float F;
    public long G;
    public boolean H;
    public final int I;
    public final Paint J;
    public Runnable K;
    public final /* synthetic */ kh0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh0(kh0 kh0Var, Context context, int i10, Paint paint) {
        super(context);
        this.L = kh0Var;
        this.C = AndroidUtilities.dp(64.0f);
        this.G = -1L;
        this.I = i10;
        this.J = paint;
        setLayerNum(kh0Var.h1);
    }

    @Override // org.telegram.ui.Components.ev0
    public final void g(Runnable runnable) {
        this.K = runnable;
    }

    @Override // android.view.View
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        Runnable runnable = this.K;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        kh0 kh0Var = this.L;
        float[] fArr = kh0Var.K0;
        Path path = kh0Var.I0;
        ArrayList arrayList = kh0Var.X0;
        RectF rectF = kh0Var.J0;
        org.telegram.ui.lu0 lu0Var = kh0Var.d1;
        if (lu0Var == null || !lu0Var.n) {
            if (this.D != null) {
                int k9 = kh0Var.z0.k(this.I);
                if (kh0Var.e1) {
                    k9--;
                }
                Drawable drawable = getImageReceiver().getDrawable();
                long j10 = 0;
                int i10 = 4;
                if (k9 >= arrayList.size() || arrayList.get(k9) == null ? drawable == null || (this.H && (!(drawable instanceof c6) || ((c6) drawable).d[4] <= 0)) : ((Float) arrayList.get(k9)).floatValue() < 1.0f) {
                    if (this.G < 0) {
                        this.G = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.G;
                        long j11 = this.H ? 250L : 750L;
                        if (currentTimeMillis <= 250 + j11 && currentTimeMillis > j11) {
                            this.D.E = jr.f.getInterpolation((currentTimeMillis - j11) / 250.0f);
                        }
                    }
                    if (kh0Var.c1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                } else if (this.E == null) {
                    RadialProgress2 radialProgress2 = this.D;
                    if ((radialProgress2.c ? radialProgress2.j : radialProgress2.i).w < 1.0f) {
                        radialProgress2.o(1.0f, true);
                        j10 = 100;
                    }
                    this.F = this.D.E;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.E = ofFloat;
                    ofFloat.setStartDelay(j10);
                    this.E.setDuration((long) (this.F * 250.0f));
                    this.E.setInterpolator(jr.f);
                    this.E.addUpdateListener(new d70(this, i10));
                    this.E.addListener(new org.telegram.ui.Cells.z3(this, k9, 5));
                    this.E.start();
                }
                int i11 = kh0Var.i1;
                if (i11 == 0 && kh0Var.j1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.J);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i12 = kh0Var.j1;
                    Paint paint = this.J;
                    if (i11 == i12) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f9 = kh0Var.i1;
                        canvas2.drawRoundRect(rectF, f9, f9, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i13 = 0; i13 < 4; i13++) {
                            fArr[i13] = kh0Var.i1;
                            fArr[i13 + 4] = kh0Var.j1;
                        }
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.drawPath(path, paint);
                    }
                }
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas);
            RadialProgress2 radialProgress22 = this.D;
            if (radialProgress22 == null || radialProgress22.E <= 0.0f) {
                return;
            }
            radialProgress22.draw(canvas2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.D != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + (this.L.v0.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            int dp2 = AndroidUtilities.dp2(80.0f);
            RadialProgress2 radialProgress2 = this.D;
            int i14 = this.C;
            int i15 = (i11 - currentActionBarHeight) - dp2;
            radialProgress2.q((i10 - i14) / 2, j7.l1.e(i15, i14, 2, currentActionBarHeight), (i10 + i14) / 2, ((i15 + i14) / 2) + currentActionBarHeight);
        }
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.K;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        kh0 kh0Var = this.L;
        if (kh0Var.c1) {
            kh0Var.invalidate();
        }
        Runnable runnable = this.K;
        if (runnable != null) {
            runnable.run();
        }
    }
}
