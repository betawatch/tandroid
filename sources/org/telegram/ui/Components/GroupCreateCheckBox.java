package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class GroupCreateCheckBox extends View implements snb {
    public float a;

    public float getProgress() {
        return this.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateColors();
        throw null;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getVisibility() != 0 || this.a == 0.0f) {
            return;
        }
        getMeasuredWidth();
        getMeasuredHeight();
        Typeface typeface = hl.a;
        throw null;
    }

    public void setProgress(float f) {
        if (this.a == f) {
            return;
        }
        this.a = f;
        invalidate();
    }

    @Override // snb
    public final void updateColors() {
        aob.u0(0);
        throw null;
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckScale(float f) {
    }

    public void setInnerRadDiff(int i) {
    }
}
