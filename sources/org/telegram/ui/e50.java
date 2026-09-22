package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class e50 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.Components.rp t1;
    public final /* synthetic */ i60 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(i60 i60Var, LaunchActivity launchActivity, org.telegram.ui.Components.rp rpVar) {
        super(launchActivity, null);
        this.u1 = i60Var;
        this.t1 = rpVar;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.rp rpVar = this.t1;
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
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.u1).containerView;
            viewGroup.invalidate();
        }
    }
}
