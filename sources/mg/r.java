package mg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.w71;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r extends w71 {
    public final Path V;
    public final Paint W;
    public boolean a0;
    public boolean b0;
    public final boolean c0;
    public final /* synthetic */ v1 d0;
    public final /* synthetic */ p6 e0;
    public final /* synthetic */ w0 f0;
    public final /* synthetic */ v g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v vVar, Context context, v1 v1Var, p6 p6Var, w0 w0Var) {
        super(context, null);
        this.g0 = vVar;
        this.d0 = v1Var;
        this.e0 = p6Var;
        this.f0 = w0Var;
        this.V = new Path();
        this.W = new Paint(1);
        this.c0 = org.telegram.messenger.i0.Q1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        v vVar = this.g0;
        r rVar = vVar.i1;
        int w02 = t6.w0(t6.h5, this.e0);
        Paint paint = this.W;
        paint.setColor(w02);
        if (!this.a0) {
            if (this.c0 || vVar.k1) {
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            super.dispatchDraw(canvas);
            return;
        }
        int i10 = -org.telegram.messenger.i0.L(16.0f);
        w0 w0Var = this.f0;
        int L = org.telegram.messenger.i0.L(10.0f) + Math.max(i10, w0Var.k2 - (w0Var.l1.getVisibility() == 0 ? org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.m : 0));
        v1 v1Var = this.d0;
        int max = Math.max(0, v1Var.l2 - (v1Var.e2.c == 1.0f ? org.telegram.messenger.i0.m : 0));
        int abs = Math.abs(L - max);
        if (rVar.getCurrentPosition() == 0) {
            float positionAnimated = rVar.getPositionAnimated() * abs;
            f7 = L < max ? L + positionAnimated : L - positionAnimated;
        } else {
            float positionAnimated2 = (1.0f - rVar.getPositionAnimated()) * abs;
            f7 = max < L ? max + positionAnimated2 : max - positionAnimated2;
        }
        int i11 = (int) f7;
        float L2 = org.telegram.messenger.i0.L(14.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, i11, getWidth(), org.telegram.messenger.i0.L(8.0f) + getHeight());
        canvas.drawRoundRect(rectF, L2, L2, paint);
        canvas.save();
        Path path = this.V;
        path.rewind();
        path.addRoundRect(rectF, L2, L2, Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.w71
    public final float getAvailableTranslationX() {
        return (this.c0 || this.g0.k1) ? getMeasuredWidth() : super.getAvailableTranslationX();
    }

    @Override // org.telegram.ui.Components.w71
    public final boolean i(MotionEvent motionEvent) {
        return this.g0.i1.getCurrentPosition() == 1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        boolean z11 = this.b0;
        boolean z12 = this.g0.d;
        if (z11 != z12) {
            this.b0 = z12;
            if (z12) {
                this.d0.j1(true);
            }
        }
    }

    @Override // org.telegram.ui.Components.w71
    public final void u() {
        this.a0 = false;
        this.g0.i1.invalidate();
    }

    @Override // org.telegram.ui.Components.w71
    public final void w(boolean z10) {
        v vVar = this.g0;
        r rVar = vVar.i1;
        float positionAnimated = rVar.getPositionAnimated();
        if (positionAnimated <= 0.0f || positionAnimated >= 1.0f) {
            this.a0 = false;
        } else if (!this.a0) {
            this.a0 = true;
            if (vVar.d) {
                org.telegram.messenger.i0.v1(vVar.j1.b);
            }
        }
        rVar.invalidate();
    }
}
