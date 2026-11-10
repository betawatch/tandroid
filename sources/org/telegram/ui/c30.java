package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c30 extends org.telegram.ui.ActionBar.l {
    public final /* synthetic */ org.telegram.ui.Components.ap F1;
    public final /* synthetic */ f40 G1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(f40 f40Var, LaunchActivity launchActivity, org.telegram.ui.Components.ap apVar) {
        super(launchActivity, null);
        this.G1 = f40Var;
        this.F1 = apVar;
    }

    @Override // org.telegram.ui.ActionBar.l, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - org.telegram.messenger.g0.L(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.ap apVar = this.F1;
            apVar.f = alpha;
            apVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.G1.b.invalidate();
        }
    }
}
