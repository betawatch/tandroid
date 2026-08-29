package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n40 extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ org.telegram.ui.Components.lp p1;
    public final /* synthetic */ r50 q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n40(r50 r50Var, LaunchActivity launchActivity, org.telegram.ui.Components.lp lpVar) {
        super(launchActivity, null);
        this.q1 = r50Var;
        this.p1 = lpVar;
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.lp lpVar = this.p1;
            lpVar.f = alpha;
            lpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f9) {
        ViewGroup viewGroup;
        if (getAlpha() != f9) {
            super.setAlpha(f9);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.q1).containerView;
            viewGroup.invalidate();
        }
    }
}
