package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class d30 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ org.telegram.ui.Components.qp G1;
    public final /* synthetic */ f40 H1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d30(f40 f40Var, LaunchActivity launchActivity, org.telegram.ui.Components.qp qpVar) {
        super(launchActivity, null);
        this.H1 = f40Var;
        this.G1 = qpVar;
    }

    @Override // org.telegram.ui.ActionBar.k, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getAdditionalSubtitleTextView().getVisibility() == 0) {
            canvas.save();
            canvas.translate(getSubtitleTextView().getLeft(), getSubtitleTextView().getY() - org.telegram.messenger.g0.L(1.0f));
            int alpha = (int) (getAdditionalSubtitleTextView().getAlpha() * 255.0f);
            org.telegram.ui.Components.qp qpVar = this.G1;
            qpVar.f = alpha;
            qpVar.draw(canvas);
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
