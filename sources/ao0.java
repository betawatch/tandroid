// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ao0 extends wgc {
    public final Path W;
    public final Paint a0;
    public boolean b0;
    public boolean c0;
    public final boolean d0;
    public final /* synthetic */ b1a e0;
    public final /* synthetic */ ylb f0;
    public final /* synthetic */ ap0 g0;
    public final /* synthetic */ do0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao0(do0 do0Var, Context context, b1a b1aVar, ylb ylbVar, ap0 ap0Var) {
        super(context, null);
        this.h0 = do0Var;
        this.e0 = b1aVar;
        this.f0 = ylbVar;
        this.g0 = ap0Var;
        this.W = new Path();
        this.a0 = new Paint(1);
        this.d0 = gm.O1();
    }

    @Override // wgc
    public final boolean c(MotionEvent motionEvent) {
        return this.h0.l1.getCurrentPosition() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        do0 do0Var = this.h0;
        ao0 ao0Var = do0Var.l1;
        int v0 = cmb.v0(cmb.g5, this.f0);
        Paint paint = this.a0;
        paint.setColor(v0);
        if (!this.b0) {
            if (this.d0 || do0Var.n1) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i = -gm.L(16.0f);
        ap0 ap0Var = this.g0;
        int L = gm.L(10.0f) + Math.max(i, ap0Var.n2 - (ap0Var.o1.getVisibility() == 0 ? gm.L(16.0f) + gm.m : 0));
        b1a b1aVar = this.e0;
        int max = Math.max(0, b1aVar.o2 - (b1aVar.h2.c == 1.0f ? gm.m : 0));
        float abs = Math.abs(L - max);
        if (ao0Var.getCurrentPosition() == 0) {
            float positionAnimated = ao0Var.getPositionAnimated() * abs;
            f = L < max ? L + positionAnimated : L - positionAnimated;
        } else {
            float positionAnimated2 = (1.0f - ao0Var.getPositionAnimated()) * abs;
            f = max < L ? max + positionAnimated2 : max - positionAnimated2;
        }
        int i2 = (int) f;
        float L2 = gm.L(14.0f);
        RectF rectF = gm.P;
        rectF.set(0.0f, i2, getWidth(), gm.L(8.0f) + getHeight());
        canvas.drawRoundRect(rectF, L2, L2, paint);
        canvas.save();
        Path path = this.W;
        path.rewind();
        path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // wgc
    public final float getAvailableTranslationX() {
        return (this.d0 || this.h0.n1) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = this.c0;
        boolean z3 = this.h0.d;
        if (z2 != z3) {
            this.c0 = z3;
            if (z3) {
                this.e0.e1(true);
            }
        }
    }

    @Override // wgc
    public final void t() {
        this.b0 = false;
        this.h0.l1.invalidate();
    }

    @Override // wgc
    public final void w(boolean z) {
        do0 do0Var = this.h0;
        ao0 ao0Var = do0Var.l1;
        float positionAnimated = ao0Var.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.b0 = false;
        } else if (!this.b0) {
            this.b0 = true;
            if (do0Var.d) {
                gm.t1(do0Var.m1.b);
            }
        }
        ao0Var.invalidate();
    }
}
