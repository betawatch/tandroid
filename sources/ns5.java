// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ns5 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public Boolean c;
    public final /* synthetic */ bt5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns5(bt5 bt5Var, Context context) {
        super(context);
        this.d = bt5Var;
        this.a = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        bt5 bt5Var = this.d;
        int L = (bt5Var.T1 - bt5Var.t0) - hl.L(8.0f);
        int L2 = hl.L(36.0f) + getMeasuredHeight();
        int i2 = bt5Var.t0;
        int i3 = hl.m;
        int i4 = L + i3;
        int i5 = (L2 + i2) - i3;
        if (this.b) {
            int i6 = i3 << 1;
            if (i4 + i2 < i6) {
                int min = Math.min(i3, (i6 - i4) - i2);
                i4 -= min;
                i5 += min;
                f = 1.0f - Math.min(1.0f, (min << 1) / hl.m);
            } else {
                f = 1.0f;
            }
            int i7 = bt5Var.t0;
            int i8 = i4 + i7;
            int i9 = hl.m;
            i = i8 < i9 ? Math.min(i9, (i9 - i4) - i7) : 0;
        } else {
            i = 0;
            f = 1.0f;
        }
        bt5Var.s0.setBounds(0, i4, getMeasuredWidth(), hl.L(10.0f) + i5 + hl.n);
        bt5Var.s0.draw(canvas);
        if (f != 1.0f) {
            aob.s0.setColor(aob.w0(null, aob.h5, false));
            float f2 = bt5Var.u0;
            float f3 = bt5Var.t0 + i4;
            float measuredWidth = getMeasuredWidth() - bt5Var.u0;
            float L3 = hl.L(24.0f) + bt5Var.t0 + i4;
            RectF rectF = this.a;
            rectF.set(f2, f3, measuredWidth, L3);
            canvas.drawRoundRect(rectF, hl.L(12.0f) * f, hl.L(12.0f) * f, aob.s0);
        }
        if (i > 0) {
            aob.s0.setColor(aob.w0(null, aob.h5, false));
            canvas.drawRect(bt5Var.u0, hl.m - i, getMeasuredWidth() - bt5Var.u0, hl.m, aob.s0);
        }
        boolean z = i > hl.m / 2;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z) {
            boolean z2 = hl.B(aob.v0(aob.h5, bt5Var.J0)) > 0.721f;
            boolean z3 = hl.B(aob.v(aob.v0(aob.s8, bt5Var.J0), 855638016)) > 0.721f;
            this.c = Boolean.valueOf(z);
            if (!z) {
                z2 = z3;
            }
            hl.n3(bt5Var.getWindow(), z2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            bt5 bt5Var = this.d;
            if (bt5Var.T1 != 0 && motionEvent.getY() < bt5Var.T1) {
                bt5Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.d.J0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        bt5 bt5Var = this.d;
        bt5Var.U1 = true;
        int i3 = bt5Var.u0;
        setPadding(i3, hl.m, i3, 0);
        bt5Var.U1 = false;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30));
        this.b = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.d.J && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d.U1) {
            return;
        }
        super.requestLayout();
    }
}
