package jg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.oj0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v0 extends j {
    public final t0 q0;
    public int r0;
    public int s0;
    public boolean t0;
    public s0 u0;

    public v0(Context context, PointF pointF, int i10, s0 s0Var, float f7, int i11) {
        super(context, pointF);
        t0 t0Var = new t0(context, f7);
        this.q0 = t0Var;
        t0Var.setMaxWidth(i11);
        this.u0 = s0Var;
        t0Var.b(i10, s0Var, false);
        m();
        this.s0 = 3;
        t0Var.c(3, this.r0);
        addView(t0Var, b6.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    @Override // jg.j
    public final i a() {
        return new u0(this, getContext());
    }

    public int getColor() {
        return this.r0;
    }

    @Override // jg.j
    public float getMaxScale() {
        return 1.5f;
    }

    public int getNextType() {
        int i10 = this.s0 + 1;
        return i10 == 4 ? !this.t0 ? 1 : 0 : i10;
    }

    @Override // jg.j
    public oj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new oj0();
        }
        float scaleX = viewGroup.getScaleX();
        float L = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float L2 = (org.telegram.messenger.i0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float x10 = z20.x(L, 2.0f, getPositionX(), scaleX);
        return new oj0(x10, z20.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override // jg.j
    public float getStickyPaddingBottom() {
        return this.q0.h;
    }

    @Override // jg.j
    public float getStickyPaddingLeft() {
        return this.q0.f;
    }

    @Override // jg.j
    public float getStickyPaddingRight() {
        return this.q0.f;
    }

    @Override // jg.j
    public float getStickyPaddingTop() {
        return this.q0.h;
    }

    public int getType() {
        return this.s0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public void setColor(int i10) {
        this.t0 = true;
        this.r0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.s0 = i10;
        this.q0.c(i10, this.r0);
    }
}
