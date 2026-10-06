package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public abstract class ja extends zl0 {
    public int e3;
    public int f3;
    public int g3;
    public boolean h3;
    public int i3;
    public boolean j3;

    @Override // org.telegram.ui.Components.zl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.e3 == 0 || Z0()) {
            super.dispatchDraw(canvas);
        } else {
            canvas.clipRect(0, this.e3, getMeasuredWidth(), getMeasuredHeight() + this.i3);
            super.dispatchDraw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view.getY() + view.getMeasuredHeight() >= this.e3 || this.j3 || Z0()) {
            return super.drawChild(canvas, view, j3);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.zl0, bh.a
    public final void f(Canvas canvas, RectF rectF) {
        this.j3 = true;
        super.f(canvas, rectF);
        this.j3 = false;
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y1();
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        this.h3 = true;
        y1();
        super.setPadding(getPaddingLeft(), this.f3 + this.e3, getPaddingRight(), getPaddingBottom());
        this.h3 = false;
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.zl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.h3) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f3 = i11;
        this.g3 = i13;
        super.setPadding(i10, i11 + this.e3, i12, i13);
    }

    public int x1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void y1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (!SharedConfig.chatBlurEnabled()) {
            this.e3 = 0;
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
        } else {
            this.e3 = x1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.e3;
        }
    }
}
