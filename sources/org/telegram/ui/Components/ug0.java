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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ug0 extends o9 implements uu0 {
    public final int C;
    public RadialProgress2 D;
    public ValueAnimator E;
    public float F;
    public long G;
    public boolean H;
    public final int I;
    public final Paint J;
    public Runnable K;
    public final /* synthetic */ ah0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug0(ah0 ah0Var, Context context, int i9, Paint paint) {
        super(context);
        this.L = ah0Var;
        this.C = AndroidUtilities.dp(64.0f);
        this.G = -1L;
        this.I = i9;
        this.J = paint;
        setLayerNum(ah0Var.h1);
    }

    @Override // org.telegram.ui.Components.uu0
    public final void g(Runnable runnable) {
        this.K = runnable;
    }

    @Override // android.view.View
    public final void invalidate(int i9, int i10, int i11, int i12) {
        super.invalidate(i9, i10, i11, i12);
        Runnable runnable = this.K;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.ui.Components.o9, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        ah0 ah0Var = this.L;
        float[] fArr = ah0Var.K0;
        Path path = ah0Var.I0;
        ArrayList arrayList = ah0Var.X0;
        RectF rectF = ah0Var.J0;
        org.telegram.ui.nu0 nu0Var = ah0Var.d1;
        if (nu0Var == null || !nu0Var.n) {
            if (this.D != null) {
                int k10 = ah0Var.z0.k(this.I);
                if (ah0Var.e1) {
                    k10--;
                }
                Drawable drawable = getImageReceiver().getDrawable();
                long j10 = 0;
                int i9 = 4;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? drawable == null || (this.H && (!(drawable instanceof x5) || ((x5) drawable).d[4] <= 0)) : ((Float) arrayList.get(k10)).floatValue() < 1.0f) {
                    if (this.G < 0) {
                        this.G = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.G;
                        long j11 = this.H ? 250L : 750L;
                        if (currentTimeMillis <= 250 + j11 && currentTimeMillis > j11) {
                            this.D.E = gr.f.getInterpolation((currentTimeMillis - j11) / 250.0f);
                        }
                    }
                    if (ah0Var.c1) {
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
                    this.E.setInterpolator(gr.f);
                    this.E.addUpdateListener(new q60(this, i9));
                    this.E.addListener(new mh.o2(this, k10, 7));
                    this.E.start();
                }
                int i10 = ah0Var.i1;
                if (i10 == 0 && ah0Var.j1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.J);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i11 = ah0Var.j1;
                    Paint paint = this.J;
                    if (i10 == i11) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f10 = ah0Var.i1;
                        canvas2.drawRoundRect(rectF, f10, f10, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i12 = 0; i12 < 4; i12++) {
                            fArr[i12] = ah0Var.i1;
                            fArr[i12 + 4] = ah0Var.j1;
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
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (this.D != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.L.v0.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            int dp2 = AndroidUtilities.dp2(80.0f);
            RadialProgress2 radialProgress2 = this.D;
            int i13 = this.C;
            int i14 = (i10 - currentActionBarHeight) - dp2;
            radialProgress2.q((i9 - i13) / 2, j3.r0.d(i14, i13, 2, currentActionBarHeight), (i9 + i13) / 2, ((i14 + i13) / 2) + currentActionBarHeight);
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
        ah0 ah0Var = this.L;
        if (ah0Var.c1) {
            ah0Var.invalidate();
        }
        Runnable runnable = this.K;
        if (runnable != null) {
            runnable.run();
        }
    }
}
