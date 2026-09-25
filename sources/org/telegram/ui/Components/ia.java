package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public abstract class ia extends wl0 {
    public int X2;
    public int Y2;
    public int Z2;
    public boolean a3;
    public int b3;
    public boolean c3;

    @Override // org.telegram.ui.Components.wl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.X2 == 0 || Z0()) {
            super.dispatchDraw(canvas);
        } else {
            canvas.clipRect(0, this.X2, getMeasuredWidth(), getMeasuredHeight() + this.b3);
            super.dispatchDraw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        if (view.getY() + view.getMeasuredHeight() >= this.X2 || this.c3 || Z0()) {
            return super.drawChild(canvas, view, j3);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.wl0, bh.a
    public final void f(Canvas canvas, RectF rectF) {
        this.c3 = true;
        super.f(canvas, rectF);
        this.c3 = false;
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x1();
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        this.a3 = true;
        x1();
        super.setPadding(getPaddingLeft(), this.Y2 + this.X2, getPaddingRight(), getPaddingBottom());
        this.a3 = false;
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
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

    public int w1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void x1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (!SharedConfig.chatBlurEnabled()) {
            this.X2 = 0;
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
        } else {
            this.X2 = w1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.X2;
        }
    }
}
