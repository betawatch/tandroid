// default package

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class e09 extends l34 {
    public boolean A0;
    public float B0;
    public via s0;
    public b6b t0;
    public b6b u0;
    public b09 v0;
    public b09 w0;
    public h19 x0;
    public lm y0;
    public lm z0;

    @Override // l34, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        via viaVar = this.s0;
        int padding = getPadding();
        float e = this.z0.e(false, 1.0f);
        if (e == 1.0f) {
            this.u0 = null;
        }
        canvas.save();
        float f = this.B0;
        canvas.scale(f, f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        b6b b6bVar = this.u0;
        if (b6bVar != null) {
            b6bVar.e = (int) ((1.0f - e) * 255.0f);
            b6bVar.setBounds(padding, padding, ((int) viaVar.a) - padding, ((int) viaVar.b) - padding);
            this.u0.draw(canvas);
        }
        b6b b6bVar2 = this.t0;
        b6bVar2.e = (int) (e * 255.0f);
        b6bVar2.setBounds(padding, padding, ((int) viaVar.a) - padding, ((int) viaVar.b) - padding);
        this.t0.draw(canvas);
        Rect rect = gl.Q;
        float width = (this.t0.getBounds().width() * 0.61f) / 2.0f;
        rect.set((int) (this.t0.getBounds().centerX() - width), (int) (this.t0.getBounds().centerY() - width), (int) (this.t0.getBounds().centerX() + width), (int) (this.t0.getBounds().centerY() + width));
        float e2 = this.y0.e(false, 1.0f);
        this.v0.c(rect);
        this.w0.c(rect);
        this.v0.d(this.t0.a == 1 ? -1 : -16777216);
        if (e2 == 1.0f) {
            this.v0.a(canvas);
        } else {
            canvas.save();
            float f2 = 1.0f - e2;
            canvas.scale(f2, f2, rect.centerX(), rect.top);
            b09 b09Var = this.w0;
            b09Var.h = f2;
            b09Var.a(canvas);
            canvas.restore();
            canvas.save();
            canvas.scale(e2, e2, rect.centerX(), rect.bottom);
            b09 b09Var2 = this.v0;
            b09Var2.h = e2;
            b09Var2.a(canvas);
            canvas.restore();
        }
        canvas.restore();
    }

    public h19 getCurrentReaction() {
        return this.x0;
    }

    @Override // l34
    public float getMaxScale() {
        return 1.8f;
    }

    @Override // l34
    public float getMinScale() {
        return 0.5f;
    }

    public int getPadding() {
        return (int) ((this.s0.b - gl.L(84.0f)) / 2.0f);
    }

    @Override // l34
    public l29 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new l29();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.4f) * getMeasuredWidth();
        float f = scale / 2.0f;
        float f2 = scale * scaleX;
        return new l29((getPositionX() - f) * scaleX, (getPositionY() - f) * scaleX, f2, f2);
    }

    @Override // l34
    public final void k() {
        via viaVar = this.s0;
        float f = viaVar.a / 2.0f;
        float f2 = viaVar.b / 2.0f;
        setX(getPositionX() - f);
        setY(getPositionY() - f2);
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v0.b(true);
        this.w0.b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0.b(false);
        this.w0.b(false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        via viaVar = this.s0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) viaVar.a, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) viaVar.b, TLObject.FLAG_30));
    }

    public final void q(boolean z) {
        b6b b6bVar = this.t0;
        if (z) {
            this.u0 = b6bVar;
            b6b b6bVar2 = new b6b(this);
            this.t0 = b6bVar2;
            if (this.u0.a != 1) {
                b6bVar2.a();
            }
            this.t0.b(this.A0, false);
            this.t0.c(getScaleX());
            this.z0.e(true, 0.0f);
        } else {
            b6bVar.a();
        }
        invalidate();
    }

    public final void r(boolean z) {
        boolean z2 = !this.A0;
        this.A0 = z2;
        if (!z) {
            this.t0.b(z2, z);
            return;
        }
        boolean[] zArr = {false};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new pk(this, zArr, (byte) 23));
        ofFloat.addListener(new eh8((Object) this, (Object) zArr, (byte) 4));
        ofFloat.setInterpolator(s33.g);
        ofFloat.setDuration(350L);
        ofFloat.start();
    }

    public final void s(h19 h19Var, boolean z) {
        if (Objects.equals(this.x0, h19Var)) {
            return;
        }
        if (!z) {
            this.x0 = h19Var;
            this.v0.e(h19Var);
            invalidate();
            return;
        }
        this.x0 = h19Var;
        this.w0.e(h19Var);
        b09 b09Var = this.v0;
        this.v0 = this.w0;
        this.w0 = b09Var;
        this.y0.e(true, 0.0f);
        invalidate();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (getScaleX() != f) {
            super.setScaleX(f);
            this.t0.c(f);
            invalidate();
        }
    }
}
