package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class ia extends ll0 {
    public int X2;
    public int Y2;
    public int Z2;
    public boolean a3;
    public int b3;
    public boolean c3;

    @Override // org.telegram.ui.Components.ll0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.X2 == 0 || Y0()) {
            super.dispatchDraw(canvas);
        } else {
            canvas.clipRect(0, this.X2, getMeasuredWidth(), getMeasuredHeight() + this.b3);
            super.dispatchDraw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view.getY() + view.getMeasuredHeight() >= this.X2 || this.c3 || Y0()) {
            return super.drawChild(canvas, view, j3);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.ll0, ch.a
    public final void f(Canvas canvas, RectF rectF) {
        this.c3 = true;
        super.f(canvas, rectF);
        this.c3 = false;
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w1();
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        this.a3 = true;
        w1();
        super.setPadding(getPaddingLeft(), this.Y2 + this.X2, getPaddingRight(), getPaddingBottom());
        this.a3 = false;
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.a3) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.Y2 = i11;
        this.Z2 = i13;
        super.setPadding(i10, i11 + this.X2, i12, i13);
    }

    public int v1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void w1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (!SharedConfig.chatBlurEnabled()) {
            this.X2 = 0;
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
        } else {
            this.X2 = v1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.X2;
        }
    }
}
