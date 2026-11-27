// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class an0 extends vic {
    public final Path W;
    public final Paint a0;
    public boolean b0;
    public boolean c0;
    public final boolean d0;
    public final /* synthetic */ t2a e0;
    public final /* synthetic */ vnb f0;
    public final /* synthetic */ ao0 g0;
    public final /* synthetic */ dn0 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an0(dn0 dn0Var, Context context, t2a t2aVar, vnb vnbVar, ao0 ao0Var) {
        super(context, null);
        this.h0 = dn0Var;
        this.e0 = t2aVar;
        this.f0 = vnbVar;
        this.g0 = ao0Var;
        this.W = new Path();
        this.a0 = new Paint(1);
        this.d0 = hl.O1();
    }

    @Override // vic
    public final boolean c(MotionEvent motionEvent) {
        return this.h0.l1.getCurrentPosition() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        dn0 dn0Var = this.h0;
        an0 an0Var = dn0Var.l1;
        int v0 = aob.v0(aob.h5, this.f0);
        Paint paint = this.a0;
        paint.setColor(v0);
        if (!this.b0) {
            if (this.d0 || dn0Var.n1) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i = -hl.L(16.0f);
        ao0 ao0Var = this.g0;
        int L = hl.L(10.0f) + Math.max(i, ao0Var.n2 - (ao0Var.o1.getVisibility() == 0 ? hl.L(16.0f) + hl.m : 0));
        t2a t2aVar = this.e0;
        int max = Math.max(0, t2aVar.o2 - (t2aVar.h2.c == 1.0f ? hl.m : 0));
        float abs = Math.abs(L - max);
        if (an0Var.getCurrentPosition() == 0) {
            float positionAnimated = an0Var.getPositionAnimated() * abs;
            f = L < max ? L + positionAnimated : L - positionAnimated;
        } else {
            float positionAnimated2 = (1.0f - an0Var.getPositionAnimated()) * abs;
            f = max < L ? max + positionAnimated2 : max - positionAnimated2;
        }
        int i2 = (int) f;
        float L2 = hl.L(14.0f);
        RectF rectF = hl.P;
        rectF.set(0.0f, i2, getWidth(), hl.L(8.0f) + getHeight());
        canvas.drawRoundRect(rectF, L2, L2, paint);
        canvas.save();
        Path path = this.W;
        path.rewind();
        path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // vic
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
                this.e0.f1(true);
            }
        }
    }

    @Override // vic
    public final void v() {
        this.b0 = false;
        this.h0.l1.invalidate();
    }

    @Override // vic
    public final void x(boolean z) {
        dn0 dn0Var = this.h0;
        an0 an0Var = dn0Var.l1;
        float positionAnimated = an0Var.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.b0 = false;
        } else if (!this.b0) {
            this.b0 = true;
            if (dn0Var.d) {
                hl.t1(dn0Var.m1.b);
            }
        }
        an0Var.invalidate();
    }
}
