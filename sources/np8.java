// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class np8 extends be0 implements zia {
    public final int H;
    public RadialProgress2 I;
    public ValueAnimator J;
    public float K;
    public long L;
    public boolean M;
    public final int N;
    public final Paint O;
    public Runnable P;
    public final /* synthetic */ sp8 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np8(sp8 sp8Var, Context context, int i, Paint paint) {
        super(context);
        this.Q = sp8Var;
        this.H = gl.L(64.0f);
        this.L = -1L;
        this.N = i;
        this.O = paint;
        setLayerNum(sp8Var.m1);
    }

    @Override // zia
    public final void d(Runnable runnable) {
        this.P = runnable;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        sp8 sp8Var = this.Q;
        if (sp8Var.h1) {
            sp8Var.invalidate();
        }
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // be0, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        sp8 sp8Var = this.Q;
        float[] fArr = sp8Var.P0;
        Path path = sp8Var.N0;
        ArrayList arrayList = sp8Var.c1;
        RectF rectF = sp8Var.O0;
        ma8 ma8Var = sp8Var.i1;
        if (ma8Var == null || !ma8Var.n) {
            if (this.I != null) {
                int k = sp8Var.E0.k(this.N);
                if (sp8Var.j1) {
                    k--;
                }
                Drawable t = getImageReceiver().t();
                long j = 0;
                if (k >= arrayList.size() || arrayList.get(k) == null ? t == null || (this.M && (!(t instanceof km) || ((km) t).d[4] <= 0)) : ((Float) arrayList.get(k)).floatValue() < 1.0f) {
                    if (this.L < 0) {
                        this.L = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.L;
                        long j2 = this.M ? 250L : 750L;
                        if (currentTimeMillis <= 250 + j2 && currentTimeMillis > j2) {
                            this.I.E = s33.f.getInterpolation((currentTimeMillis - j2) / 250.0f);
                        }
                    }
                    if (sp8Var.h1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                } else if (this.J == null) {
                    RadialProgress2 radialProgress2 = this.I;
                    if ((radialProgress2.c ? radialProgress2.j : radialProgress2.i).w < 1.0f) {
                        radialProgress2.o(true, 1.0f);
                        j = 100;
                    }
                    this.K = this.I.E;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J = ofFloat;
                    ofFloat.setStartDelay(j);
                    this.J.setDuration((long) (this.K * 250.0f));
                    this.J.setInterpolator(s33.f);
                    this.J.addUpdateListener(new u28(this, (byte) 17));
                    this.J.addListener(new cn(this, k, (byte) 8));
                    this.J.start();
                }
                int i = sp8Var.n1;
                Paint paint = this.O;
                if (i == 0 && sp8Var.o1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    if (i == sp8Var.o1) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f = sp8Var.n1;
                        canvas2.drawRoundRect(rectF, f, f, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i2 = 0; i2 < 4; i2++) {
                            fArr[i2] = sp8Var.n1;
                            fArr[i2 + 4] = sp8Var.o1;
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
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.I != null) {
            int currentActionBarHeight = a.getCurrentActionBarHeight() + (this.Q.A0.getOccupyStatusBar() ? gl.m : 0);
            int M = gl.M(80.0f);
            RadialProgress2 radialProgress2 = this.I;
            int i5 = this.H;
            int i6 = (i2 - currentActionBarHeight) - M;
            radialProgress2.p((i - i5) / 2, ug8.g(i6, i5, 2, currentActionBarHeight), (i + i5) / 2, ((i6 + i5) / 2) + currentActionBarHeight);
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
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }
}
