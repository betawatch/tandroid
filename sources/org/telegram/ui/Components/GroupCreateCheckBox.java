package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class GroupCreateCheckBox extends View implements org.telegram.ui.ActionBar.a6 {
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
        if (getVisibility() == 0 && this.a != 0.0f) {
            getMeasuredWidth();
            getMeasuredHeight();
            org.telegram.messenger.g0.L(30.0f);
            throw null;
        }
    }

    public void setProgress(float f10) {
        if (this.a == f10) {
            return;
        }
        this.a = f10;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        org.telegram.ui.ActionBar.k6.v0(0);
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCheckScale(float f10) {
    }

    public void setInnerRadDiff(int i7) {
    }
}
