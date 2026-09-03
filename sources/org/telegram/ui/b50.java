package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b50 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.Components.op q1;
    public final /* synthetic */ e60 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b50(e60 e60Var, LaunchActivity launchActivity, org.telegram.ui.Components.op opVar) {
        super(launchActivity, null);
        this.r1 = e60Var;
        this.q1 = opVar;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.op opVar = this.q1;
            opVar.f = alpha;
            opVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            viewGroup = ((org.telegram.ui.ActionBar.g3) this.r1).containerView;
            viewGroup.invalidate();
        }
    }
}
