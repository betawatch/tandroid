package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
