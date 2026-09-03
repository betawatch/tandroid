package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class aa extends rl0 {
    public int U2;
    public int V2;
    public int W2;
    public boolean X2;
    public int Y2;
    public boolean Z2;

    @Override // org.telegram.ui.Components.rl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.U2 == 0 || Y0()) {
            super.dispatchDraw(canvas);
        } else {
            canvas.clipRect(0, this.U2, getMeasuredWidth(), getMeasuredHeight() + this.Y2);
            super.dispatchDraw(canvas);
        }
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        if (view.getY() + view.getMeasuredHeight() >= this.U2 || this.Z2 || Y0()) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.rl0, og.a
    public final void e(Canvas canvas, RectF rectF) {
        this.Z2 = true;
        super.e(canvas, rectF);
        this.Z2 = false;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w1();
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i10, int i11) {
        this.X2 = true;
        w1();
        super.setPadding(getPaddingLeft(), this.V2 + this.U2, getPaddingRight(), getPaddingBottom());
        this.X2 = false;
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.V2 = i11;
        this.W2 = i13;
        super.setPadding(i10, i11 + this.U2, i12, i13);
    }

    public int v1() {
        return AndroidUtilities.dp(203.0f);
    }

    public final void w1() {
        if (getLayoutParams() == null) {
            return;
        }
        if (!SharedConfig.chatBlurEnabled()) {
            this.U2 = 0;
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = 0;
        } else {
            this.U2 = v1();
            ((ViewGroup.MarginLayoutParams) getLayoutParams()).topMargin = -this.U2;
        }
    }
}
