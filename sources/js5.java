// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class js5 extends FrameLayout {
    public final RectF a;
    public boolean b;
    public Boolean c;
    public final /* synthetic */ xs5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js5(xs5 xs5Var, Context context) {
        super(context);
        this.d = xs5Var;
        this.a = new RectF();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        xs5 xs5Var = this.d;
        int L = (xs5Var.T1 - xs5Var.t0) - gm.L(8.0f);
        int L2 = gm.L(36.0f) + getMeasuredHeight();
        int i2 = xs5Var.t0;
        int i3 = gm.m;
        int i4 = L + i3;
        int i5 = (L2 + i2) - i3;
        if (this.b) {
            int i6 = i3 << 1;
            if (i4 + i2 < i6) {
                int min = Math.min(i3, (i6 - i4) - i2);
                i4 -= min;
                i5 += min;
                f = 1.0f - Math.min(1.0f, (min << 1) / gm.m);
            } else {
                f = 1.0f;
            }
            int i7 = xs5Var.t0;
            int i8 = i4 + i7;
            int i9 = gm.m;
            i = i8 < i9 ? Math.min(i9, (i9 - i4) - i7) : 0;
        } else {
            i = 0;
            f = 1.0f;
        }
        xs5Var.s0.setBounds(0, i4, getMeasuredWidth(), gm.L(10.0f) + i5 + gm.n);
        xs5Var.s0.draw(canvas);
        if (f != 1.0f) {
            cmb.s0.setColor(cmb.w0(null, cmb.g5, false));
            float f2 = xs5Var.u0;
            float f3 = xs5Var.t0 + i4;
            float measuredWidth = getMeasuredWidth() - xs5Var.u0;
            float L3 = gm.L(24.0f) + xs5Var.t0 + i4;
            RectF rectF = this.a;
            rectF.set(f2, f3, measuredWidth, L3);
            canvas.drawRoundRect(rectF, gm.L(12.0f) * f, gm.L(12.0f) * f, cmb.s0);
        }
        if (i > 0) {
            cmb.s0.setColor(cmb.w0(null, cmb.g5, false));
            canvas.drawRect(xs5Var.u0, gm.m - i, getMeasuredWidth() - xs5Var.u0, gm.m, cmb.s0);
        }
        boolean z = i > gm.m / 2;
        Boolean bool = this.c;
        if (bool == null || bool.booleanValue() != z) {
            boolean z2 = gm.B(cmb.v0(cmb.g5, xs5Var.J0)) > 0.721f;
            boolean z3 = gm.B(cmb.v(cmb.v0(cmb.r8, xs5Var.J0), 855638016)) > 0.721f;
            this.c = Boolean.valueOf(z);
            if (!z) {
                z2 = z3;
            }
            gm.n3(xs5Var.getWindow(), z2);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            xs5 xs5Var = this.d;
            if (xs5Var.T1 != 0 && motionEvent.getY() < xs5Var.T1) {
                xs5Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.d.I0();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        xs5 xs5Var = this.d;
        xs5Var.U1 = true;
        int i3 = xs5Var.u0;
        setPadding(i3, gm.m, i3, 0);
        xs5Var.U1 = false;
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
