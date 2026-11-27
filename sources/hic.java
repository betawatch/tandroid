// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class hic extends vic {
    public boolean W;
    public final Path a0;
    public final /* synthetic */ iic b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hic(iic iicVar, Context context) {
        super(context, null);
        this.b0 = iicVar;
        this.a0 = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.W) {
            Path path = this.a0;
            path.rewind();
            float N = hl.N(24.0f);
            RectF rectF = hl.P;
            rectF.set(0.0f, hl.m, getWidth(), getHeight());
            path.addRoundRect(rectF, N, N, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        if (this.W) {
            canvas.restore();
        }
    }

    @Override // vic
    public final boolean f(MotionEvent motionEvent) {
        Object b0 = ((fj6) this.b0).b0();
        if (b0 instanceof ej6) {
            return ((ej6) b0).W(motionEvent, false);
        }
        return false;
    }

    @Override // vic
    public float getAvailableTranslationX() {
        return getMeasuredWidth();
    }

    @Override // vic
    public long getManualScrollDuration() {
        return 320L;
    }

    @Override // vic
    public final boolean i(MotionEvent motionEvent) {
        Object b0 = ((fj6) this.b0).b0();
        if (b0 instanceof ej6) {
            return ((ej6) b0).W(motionEvent, true);
        }
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setTabletLayout(boolean z) {
        if (this.W == z) {
            return;
        }
        this.W = z;
        invalidate();
    }

    @Override // vic
    public final void t(View view, View view2, int i, int i2) {
        this.b0.Y();
    }

    @Override // vic
    public final void v() {
        uj3 uj3Var;
        iic iicVar = this.b0;
        fj6 fj6Var = (fj6) iicVar;
        if (fj6Var.I != null) {
            fj6Var.t0(fj6Var.c.getCurrentPosition(), true);
            fj6Var.u0(false, 0.0f);
        }
        fj6Var.c0();
        hic hicVar = fj6Var.c;
        if (hicVar != null) {
            int currentPosition = hicVar.getCurrentPosition();
            fj6Var.h0(true);
            if (currentPosition != 3) {
                fj6Var.a0(3);
            }
            Integer num = fj6Var.L;
            if (num != null && currentPosition == 0 && (uj3Var = fj6Var.M) != null) {
                uj3Var.Q4(num.intValue());
                fj6Var.L = null;
            }
        }
        iicVar.Y();
    }

    @Override // vic
    public final void x(boolean z) {
        iic iicVar = this.b0;
        fj6 fj6Var = (fj6) iicVar;
        boolean z2 = !z;
        if (fj6Var.I != null) {
            float positionAnimated = fj6Var.c.getPositionAnimated();
            fj6Var.u0(z2, positionAnimated);
            if (!z) {
                fj6Var.t0(Math.round(positionAnimated), true);
            }
        }
        fj6Var.i0();
        fj6Var.c0();
        fj6Var.b.invalidate();
        iicVar.Y();
        iicVar.checkSystemBarColors();
    }
}
