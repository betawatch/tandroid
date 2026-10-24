package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public abstract class ia extends mm0 {
    public int Y2;
    public int Z2;
    public int a3;
    public boolean b3;
    public int c3;
    public boolean d3;

    public int C1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void D1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (!SharedConfig.chatBlurEnabled()) {
            this.Y2 = 0;
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
        } else {
            this.Y2 = C1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.Y2;
        }
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.Y2 == 0 || a1()) {
            super.dispatchDraw(canvas);
        } else {
            canvas.clipRect(0, this.Y2, getMeasuredWidth(), getMeasuredHeight() + this.c3);
            super.dispatchDraw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view.getY() + view.getMeasuredHeight() >= this.Y2 || this.d3 || a1()) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.mm0, ch.a
    public final void f(Canvas canvas, RectF rectF) {
        this.d3 = true;
        super.f(canvas, rectF);
        this.d3 = false;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        D1();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        this.b3 = true;
        D1();
        super.setPadding(getPaddingLeft(), this.Z2 + this.Y2, getPaddingRight(), getPaddingBottom());
        this.b3 = false;
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.b3) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.Z2 = i11;
        this.a3 = i13;
        super.setPadding(i10, i11 + this.Y2, i12, i13);
    }
}
