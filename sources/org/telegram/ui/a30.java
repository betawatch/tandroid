package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a30 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.Components.jp G1;
    public final /* synthetic */ c40 H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a30(c40 c40Var, LaunchActivity launchActivity, org.telegram.ui.Components.jp jpVar) {
        super(launchActivity, null);
        this.H1 = c40Var;
        this.G1 = jpVar;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - org.telegram.messenger.g0.L(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.jp jpVar = this.G1;
            jpVar.f = alpha;
            jpVar.draw(canvas);
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
