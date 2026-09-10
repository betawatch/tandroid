package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class f50 extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ org.telegram.ui.Components.xp t1;
    public final /* synthetic */ j60 u1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f50(j60 j60Var, LaunchActivity launchActivity, org.telegram.ui.Components.xp xpVar) {
        super(launchActivity, null);
        this.u1 = j60Var;
        this.t1 = xpVar;
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.xp xpVar = this.t1;
            xpVar.f = alpha;
            xpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            viewGroup = ((org.telegram.ui.ActionBar.h3) this.u1).containerView;
            viewGroup.invalidate();
        }
    }
}
