package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public class GroupCreateCheckBox extends View implements tjb {
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
        Typeface typeface = gl.a;
        throw null;
    }

    public void setProgress(float f) {
        if (this.a == f) {
            return;
        }
        this.a = f;
        invalidate();
    }

    @Override // tjb
    public final void updateColors() {
        bkb.u0(0);
        throw null;
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }

    public void setCheckScale(float f) {
    }

    public void setInnerRadDiff(int i) {
    }
}
