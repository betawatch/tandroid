package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class f50 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.Components.qp t1;
    public final /* synthetic */ j60 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f50(j60 j60Var, LaunchActivity launchActivity, org.telegram.ui.Components.qp qpVar) {
        super(launchActivity, null);
        this.u1 = j60Var;
        this.t1 = qpVar;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.qp qpVar = this.t1;
            qpVar.f = alpha;
            qpVar.draw(canvas);
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
