package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class GroupCreateCheckBox extends View {
    public static final /* synthetic */ int b = 0;
    public float a;

    public float getProgress() {
        return this.a;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.g6.u0(0);
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

    public void setProgress(float f9) {
        if (this.a == f9) {
            return;
        }
        this.a = f9;
        invalidate();
    }

    public void setCheckScale(float f9) {
    }

    public void setInnerRadDiff(int i10) {
    }
}
