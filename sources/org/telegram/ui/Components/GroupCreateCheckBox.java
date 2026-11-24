package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class GroupCreateCheckBox extends View implements vlb {
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
        Typeface typeface = gm.a;
        throw null;
    }

    public void setProgress(float f) {
        if (this.a == f) {
            return;
        }
        this.a = f;
        invalidate();
    }

    @Override // vlb
    public final void updateColors() {
        cmb.u0(0);
        throw null;
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckScale(float f) {
    }

    public void setInnerRadDiff(int i) {
    }
}
