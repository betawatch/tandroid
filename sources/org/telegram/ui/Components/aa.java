package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class aa extends wk0 {
    public int T2;
    public int U2;
    public int V2;
    public boolean W2;
    public int X2;
    public boolean Y2;

    @Override // org.telegram.ui.Components.wk0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.T2 == 0 || Z0()) {
            super.dispatchDraw(canvas);
        } else {
            canvas.clipRect(0, this.T2, getMeasuredWidth(), getMeasuredHeight() + this.X2);
            super.dispatchDraw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view.getY() + view.getMeasuredHeight() >= this.T2 || this.Y2 || Z0()) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.wk0, jg.a
    public final void e(Canvas canvas, RectF rectF) {
        this.Y2 = true;
        super.e(canvas, rectF);
        this.Y2 = false;
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x1();
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i9, int i10) {
        this.W2 = true;
        x1();
        super.setPadding(getPaddingLeft(), this.U2 + this.T2, getPaddingRight(), getPaddingBottom());
        this.W2 = false;
        super.onMeasure(i9, i10);
    }

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.W2) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i9, int i10, int i11, int i12) {
        this.U2 = i10;
        this.V2 = i12;
        super.setPadding(i9, i10 + this.T2, i11, i12);
    }

    public int w1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void x1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (!SharedConfig.chatBlurEnabled()) {
            this.T2 = 0;
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
        } else {
            this.T2 = w1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.T2;
        }
    }
}
