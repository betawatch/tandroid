package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class x9 extends pj0 {
    public int e3;
    public int f3;
    public boolean g3;
    public int h3;
    public boolean i3;

    public final void A1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (!org.telegram.messenger.iz.f()) {
            this.e3 = 0;
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
        } else {
            this.e3 = z1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.e3;
        }
    }

    @Override // org.telegram.ui.Components.pj0, eh.a
    public final void d(Canvas canvas, RectF rectF) {
        this.i3 = true;
        super.d(canvas, rectF);
        this.i3 = false;
    }

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.e3 == 0 || Y0()) {
            super.dispatchDraw(canvas);
        } else {
            canvas.clipRect(0, this.e3, getMeasuredWidth(), getMeasuredHeight() + this.h3);
            super.dispatchDraw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view.getY() + view.getMeasuredHeight() >= this.e3 || this.i3 || Y0()) {
            return super.drawChild(canvas, view, j3);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A1();
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i7, int i10) {
        this.g3 = true;
        A1();
        super.setPadding(getPaddingLeft(), this.f3 + this.e3, getPaddingRight(), getPaddingBottom());
        this.g3 = false;
        super.onMeasure(i7, i10);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.g3) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.f3 = i10;
        super.setPadding(i7, i10 + this.e3, i11, i12);
    }

    public int z1() {
        return org.telegram.messenger.g0.L(203.0f);
    }
}
