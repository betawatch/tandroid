package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g50 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.Components.rp u1;
    public final /* synthetic */ k60 v1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g50(k60 k60Var, LaunchActivity launchActivity, org.telegram.ui.Components.rp rpVar) {
        super(launchActivity, null);
        this.v1 = k60Var;
        this.u1 = rpVar;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.rp rpVar = this.u1;
            rpVar.f = alpha;
            rpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.v1).containerView;
            viewGroup.invalidate();
        }
    }
}
