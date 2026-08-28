package org.telegram.ui;

import android.graphics.Canvas;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class k40 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.Components.hp p1;
    public final /* synthetic */ o50 q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(o50 o50Var, LaunchActivity launchActivity, org.telegram.ui.Components.hp hpVar) {
        super(launchActivity, null);
        this.q1 = o50Var;
        this.p1 = hpVar;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - AndroidUtilities.dp(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.hp hpVar = this.p1;
            hpVar.f = alpha;
            hpVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            viewGroup = ((org.telegram.ui.ActionBar.f3) this.q1).containerView;
            viewGroup.invalidate();
        }
    }
}
