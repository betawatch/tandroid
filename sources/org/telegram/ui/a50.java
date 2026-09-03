package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a50 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.Components.rp q1;
    public final /* synthetic */ d60 r1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a50(d60 d60Var, LaunchActivity launchActivity, org.telegram.ui.Components.rp rpVar) {
        super(launchActivity, null);
        this.r1 = d60Var;
        this.q1 = rpVar;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.rp rpVar = this.q1;
            rpVar.f = alpha;
            rpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.r1).containerView;
            viewGroup.invalidate();
        }
    }
}
