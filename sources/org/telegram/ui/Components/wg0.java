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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wg0 extends n9 implements wu0 {
    public final int C;
    public RadialProgress2 D;
    public ValueAnimator E;
    public float F;
    public long G;
    public boolean H;
    public final int I;
    public final Paint J;
    public Runnable K;
    public final /* synthetic */ ch0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg0(ch0 ch0Var, Context context, int i10, Paint paint) {
        super(context);
        this.L = ch0Var;
        this.C = AndroidUtilities.dp(64.0f);
        this.G = -1L;
        this.I = i10;
        this.J = paint;
        setLayerNum(ch0Var.h1);
    }

    @Override // org.telegram.ui.Components.wu0
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

    @Override // org.telegram.ui.Components.n9, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        ch0 ch0Var = this.L;
        float[] fArr = ch0Var.K0;
        Path path = ch0Var.I0;
        ArrayList arrayList = ch0Var.X0;
        RectF rectF = ch0Var.J0;
        org.telegram.ui.ou0 ou0Var = ch0Var.d1;
        if (ou0Var == null || !ou0Var.n) {
            if (this.D != null) {
                int k10 = ch0Var.z0.k(this.I);
                if (ch0Var.e1) {
                    k10--;
                }
                Drawable drawable = getImageReceiver().getDrawable();
                long j10 = 0;
                int i10 = 4;
                if (k10 >= arrayList.size() || arrayList.get(k10) == null ? drawable == null || (this.H && (!(drawable instanceof x5) || ((x5) drawable).d[4] <= 0)) : ((Float) arrayList.get(k10)).floatValue() < 1.0f) {
                    if (this.G < 0) {
                        this.G = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.G;
                        long j11 = this.H ? 250L : 750L;
                        if (currentTimeMillis <= 250 + j11 && currentTimeMillis > j11) {
                            this.D.E = er.f.getInterpolation((currentTimeMillis - j11) / 250.0f);
                        }
                    }
                    if (ch0Var.c1) {
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
                    this.E.setInterpolator(er.f);
                    this.E.addUpdateListener(new v60(this, i10));
                    this.E.addListener(new nh.n2(this, k10, 7));
                    this.E.start();
                }
                int i11 = ch0Var.i1;
                if (i11 == 0 && ch0Var.j1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.J);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    int i12 = ch0Var.j1;
                    Paint paint = this.J;
                    if (i11 == i12) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f10 = ch0Var.i1;
                        canvas2.drawRoundRect(rectF, f10, f10, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i13 = 0; i13 < 4; i13++) {
                            fArr[i13] = ch0Var.i1;
                            fArr[i13 + 4] = ch0Var.j1;
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
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (this.L.v0.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            int dp2 = AndroidUtilities.dp2(80.0f);
            RadialProgress2 radialProgress2 = this.D;
            int i14 = this.C;
            int i15 = (i11 - currentActionBarHeight) - dp2;
            radialProgress2.q((i10 - i14) / 2, i0.a.B(i15, i14, 2, currentActionBarHeight), (i10 + i14) / 2, ((i15 + i14) / 2) + currentActionBarHeight);
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
        ch0 ch0Var = this.L;
        if (ch0Var.c1) {
            ch0Var.invalidate();
        }
        Runnable runnable = this.K;
        if (runnable != null) {
            runnable.run();
        }
    }
}
