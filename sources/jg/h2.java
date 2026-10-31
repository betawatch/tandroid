package jg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.t5;
import th.u6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h2 extends j {
    public pu0 q0;
    public u6 r0;
    public u6 s0;
    public sg.f0 t0;
    public sg.f0 u0;
    public sg.o0 v0;
    public t5 w0;
    public t5 x0;
    public boolean y0;
    public float z0;

    @Override // jg.j
    public final i a() {
        g2 g2Var = new g2(this, getContext(), 0);
        g2Var.r = new RectF();
        return g2Var;
    }

    @Override // jg.j, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        pu0 pu0Var = this.q0;
        int padding = getPadding();
        float e = this.x0.e(false, 1.0f);
        if (e == 1.0f) {
            this.s0 = null;
        }
        canvas.save();
        float f7 = this.z0;
        canvas.scale(f7, f7, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        u6 u6Var = this.s0;
        if (u6Var != null) {
            u6Var.e = (int) ((1.0f - e) * 255.0f);
            u6Var.setBounds(padding, padding, ((int) pu0Var.a) - padding, ((int) pu0Var.b) - padding);
            this.s0.draw(canvas);
        }
        u6 u6Var2 = this.r0;
        u6Var2.e = (int) (e * 255.0f);
        u6Var2.setBounds(padding, padding, ((int) pu0Var.a) - padding, ((int) pu0Var.b) - padding);
        this.r0.draw(canvas);
        Rect rect = org.telegram.messenger.i0.Q;
        float width = (this.r0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.r0.getBounds().centerX() - width), (int) (this.r0.getBounds().centerY() - width), (int) (this.r0.getBounds().centerX() + width), (int) (this.r0.getBounds().centerY() + width));
        float e7 = this.w0.e(false, 1.0f);
        this.t0.c(rect);
        this.u0.c(rect);
        this.t0.d(this.r0.a == 1 ? -1 : -16777216);
        if (e7 == 1.0f) {
            this.t0.a(canvas);
        } else {
            canvas.save();
            float f10 = 1.0f - e7;
            canvas.scale(f10, f10, rect.centerX(), rect.top);
            sg.f0 f0Var = this.u0;
            f0Var.h = f10;
            f0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e7, e7, rect.centerX(), rect.bottom);
            sg.f0 f0Var2 = this.t0;
            f0Var2.h = e7;
            f0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public sg.o0 getCurrentReaction() {
        return this.v0;
    }

    @Override // jg.j
    public float getMaxScale() {
        return 1.8f;
    }

    @Override // jg.j
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.q0.b - org.telegram.messenger.i0.L(84.0f)) / 2.0f);
    }

    @Override // jg.j
    public oj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new oj0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f7 = scale / 2.0f;
        float f10 = scale * scaleX;
        return new oj0((getPositionX() - f7) * scaleX, (getPositionY() - f7) * scaleX, f10, f10);
    }

    @Override // jg.j
    public final void k() {
        pu0 pu0Var = this.q0;
        float f7 = pu0Var.a / 2.0f;
        float f10 = pu0Var.b / 2.0f;
        setX(getPositionX() - f7);
        setY(getPositionY() - f10);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.t0.b(true);
        this.u0.b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.t0.b(false);
        this.u0.b(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        pu0 pu0Var = this.q0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) pu0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) pu0Var.b, TLObject.FLAG_30));
    }

    public final void q(boolean z10) {
        if (z10) {
            this.s0 = this.r0;
            u6 u6Var = new u6(this);
            this.r0 = u6Var;
            if (this.s0.a != 1) {
                u6Var.a();
            }
            this.r0.b(this.y0, false);
            this.r0.c(getScaleX());
            this.x0.e(true, 0.0f);
        } else {
            this.r0.a();
        }
        invalidate();
    }

    public final void r(boolean z10) {
        boolean z11 = !this.y0;
        this.y0 = z11;
        if (!z10) {
            this.r0.b(z11, z10);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ag.p2(7, this, zArr));
        ofFloat.addListener(new bg.f(4, this, zArr));
        ofFloat.setInterpolator(gr.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(sg.o0 o0Var, boolean z10) {
        if (Objects.equals(this.v0, o0Var)) {
            return;
        }
        if (!z10) {
            this.v0 = o0Var;
            this.t0.e(o0Var);
            invalidate();
            return;
        }
        this.v0 = o0Var;
        this.u0.e(o0Var);
        sg.f0 f0Var = this.t0;
        this.t0 = this.u0;
        this.u0 = f0Var;
        this.w0.e(true, 0.0f);
        invalidate();
    }

    @Override // android.view.View
    public void setScaleX(float f7) {
        if (getScaleX() != f7) {
            super.setScaleX(f7);
            this.r0.c(f7);
            invalidate();
        }
    }
}
