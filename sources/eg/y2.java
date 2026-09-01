package eg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import oh.o8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.z5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class y2 extends j {
    public kv0 n0;
    public o8 o0;
    public o8 p0;
    public ng.h0 q0;
    public ng.h0 r0;
    public ng.q0 s0;
    public z5 t0;
    public z5 u0;
    public boolean v0;
    public float w0;

    @Override // eg.j
    public final i a() {
        x2 x2Var = new x2(this, getContext(), 0);
        x2Var.r = new RectF();
        return x2Var;
    }

    @Override // eg.j, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        kv0 kv0Var = this.n0;
        int padding = getPadding();
        float d = this.u0.d(1.0f, false);
        if (d == 1.0f) {
            this.p0 = null;
        }
        canvas.save();
        float f10 = this.w0;
        canvas.scale(f10, f10, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        o8 o8Var = this.p0;
        if (o8Var != null) {
            o8Var.e = (int) ((1.0f - d) * 255.0f);
            o8Var.setBounds(padding, padding, ((int) kv0Var.a) - padding, ((int) kv0Var.b) - padding);
            this.p0.draw(canvas);
        }
        o8 o8Var2 = this.o0;
        o8Var2.e = (int) (d * 255.0f);
        o8Var2.setBounds(padding, padding, ((int) kv0Var.a) - padding, ((int) kv0Var.b) - padding);
        this.o0.draw(canvas);
        Rect rect = AndroidUtilities.rectTmp2;
        float width = (this.o0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.o0.getBounds().centerX() - width), (int) (this.o0.getBounds().centerY() - width), (int) (this.o0.getBounds().centerX() + width), (int) (this.o0.getBounds().centerY() + width));
        float d10 = this.t0.d(1.0f, false);
        this.q0.c(rect);
        this.r0.c(rect);
        this.q0.d(this.o0.a == 1 ? -1 : -16777216);
        if (d10 == 1.0f) {
            this.q0.a(canvas);
        } else {
            canvas.save();
            float f11 = 1.0f - d10;
            canvas.scale(f11, f11, rect.centerX(), rect.top);
            ng.h0 h0Var = this.r0;
            h0Var.h = f11;
            h0Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(d10, d10, rect.centerX(), rect.bottom);
            ng.h0 h0Var2 = this.q0;
            h0Var2.h = d10;
            h0Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public ng.q0 getCurrentReaction() {
        return this.s0;
    }

    @Override // eg.j
    public float getMaxScale() {
        return 1.8f;
    }

    @Override // eg.j
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.n0.b - AndroidUtilities.dp(84.0f)) / 2.0f);
    }

    @Override // eg.j
    public tk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new tk0();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new tk0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    @Override // eg.j
    public final void k() {
        kv0 kv0Var = this.n0;
        float f10 = kv0Var.a / 2.0f;
        float f11 = kv0Var.b / 2.0f;
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q0.b(true);
        this.r0.b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q0.b(false);
        this.r0.b(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        kv0 kv0Var = this.n0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) kv0Var.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) kv0Var.b, TLObject.FLAG_30));
    }

    public final void q(boolean z4) {
        if (z4) {
            this.p0 = this.o0;
            o8 o8Var = new o8(this);
            this.o0 = o8Var;
            if (this.p0.a != 1) {
                o8Var.a();
            }
            this.o0.b(this.v0, false);
            this.o0.c(getScaleX());
            this.u0.d(0.0f, true);
        } else {
            this.o0.a();
        }
        invalidate();
    }

    public final void r(boolean z4) {
        int i10 = 1;
        boolean z10 = !this.v0;
        this.v0 = z10;
        if (!z4) {
            this.o0.b(z10, z4);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new bg.a(i10, this, zArr));
        ofFloat.addListener(new w2(0, this, zArr));
        ofFloat.setInterpolator(pr.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(ng.q0 q0Var, boolean z4) {
        if (Objects.equals(this.s0, q0Var)) {
            return;
        }
        if (!z4) {
            this.s0 = q0Var;
            this.q0.e(q0Var);
            invalidate();
            return;
        }
        this.s0 = q0Var;
        this.r0.e(q0Var);
        ng.h0 h0Var = this.q0;
        this.q0 = this.r0;
        this.r0 = h0Var;
        this.t0.d(0.0f, true);
        invalidate();
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        if (getScaleX() != f10) {
            super.setScaleX(f10);
            this.o0.c(f10);
            invalidate();
        }
    }
}
