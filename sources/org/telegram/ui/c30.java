package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c30 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.Components.pp G1;
    public final /* synthetic */ e40 H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(e40 e40Var, LaunchActivity launchActivity, org.telegram.ui.Components.pp ppVar) {
        super(launchActivity, null);
        this.H1 = e40Var;
        this.G1 = ppVar;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - org.telegram.messenger.g0.L(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.pp ppVar = this.G1;
            ppVar.f = alpha;
            ppVar.draw(canvas);
            canvas.restore();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.H1.b.invalidate();
        }
    }
}
