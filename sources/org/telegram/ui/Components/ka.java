package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class ka extends nm0 {
    public int f3;
    public int g3;
    public boolean h3;
    public int i3;
    public boolean j3;

    public int C1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void D1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (!SharedConfig.chatBlurEnabled()) {
            this.f3 = 0;
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
        } else {
            this.f3 = C1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.f3;
        }
    }

    @Override // org.telegram.ui.Components.nm0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f3 == 0 || Z0()) {
            super.dispatchDraw(canvas);
        } else {
            canvas.clipRect(0, this.f3, getMeasuredWidth(), getMeasuredHeight() + this.i3);
            super.dispatchDraw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view.getY() + view.getMeasuredHeight() >= this.f3 || this.j3 || Z0()) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.nm0, dh.a
    public final void f(Canvas canvas, RectF rectF) {
        this.j3 = true;
        super.f(canvas, rectF);
        this.j3 = false;
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        D1();
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        this.h3 = true;
        D1();
        super.setPadding(getPaddingLeft(), this.g3 + this.f3, getPaddingRight(), getPaddingBottom());
        this.h3 = false;
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.h3) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.g3 = i11;
        super.setPadding(i10, i11 + this.f3, i12, i13);
    }
}
