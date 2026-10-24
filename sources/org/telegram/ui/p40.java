package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class p40 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.Components.cq v1;
    public final /* synthetic */ u50 w1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p40(u50 u50Var, LaunchActivity launchActivity, org.telegram.ui.Components.cq cqVar) {
        super(launchActivity, null);
        this.w1 = u50Var;
        this.v1 = cqVar;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.cq cqVar = this.v1;
            cqVar.f = alpha;
            cqVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.w1).containerView;
            viewGroup.invalidate();
        }
    }
}
