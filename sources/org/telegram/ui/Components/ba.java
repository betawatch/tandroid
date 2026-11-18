package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class ba extends ck0 {
    public int f3;
    public int g3;
    public boolean h3;
    public int i3;
    public boolean j3;

    public final void A1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (!org.telegram.messenger.bz.f()) {
            this.f3 = 0;
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
        } else {
            this.f3 = z1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.f3;
        }
    }

    @Override // org.telegram.ui.Components.ck0, eh.a
    public final void d(Canvas canvas, RectF rectF) {
        this.j3 = true;
        super.d(canvas, rectF);
        this.j3 = false;
    }

    @Override // org.telegram.ui.Components.ck0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f3 == 0 || Y0()) {
            super.dispatchDraw(canvas);
        } else {
            canvas.clipRect(0, this.f3, getMeasuredWidth(), getMeasuredHeight() + this.i3);
            super.dispatchDraw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view.getY() + view.getMeasuredHeight() >= this.f3 || this.j3 || Y0()) {
            return super.drawChild(canvas, view, j3);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A1();
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i7, int i10) {
        this.h3 = true;
        A1();
        super.setPadding(getPaddingLeft(), this.g3 + this.f3, getPaddingRight(), getPaddingBottom());
        this.h3 = false;
        super.onMeasure(i7, i10);
    }

    @Override // org.telegram.ui.Components.ck0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.h3) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i7, int i10, int i11, int i12) {
        this.g3 = i10;
        super.setPadding(i7, i10 + this.f3, i11, i12);
    }

    public int z1() {
        return org.telegram.messenger.g0.L(203.0f);
    }
}
