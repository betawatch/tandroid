package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public class GroupCreateCheckBox extends View implements org.telegram.ui.ActionBar.b6 {
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
            AndroidUtilities.dp(30.0f);
            throw null;
        }
    }

    public void setProgress(float f7) {
        if (this.a == f7) {
            return;
        }
        this.a = f7;
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.k6.v0(0);
        throw null;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }

    public void setCheckScale(float f7) {
    }

    public void setInnerRadDiff(int i10) {
    }
}
