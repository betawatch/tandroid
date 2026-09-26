package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class fu0 extends qg.d2 {
    public final Path o0;
    public boolean p0;
    public final org.telegram.ui.Components.e6 q0;
    public final /* synthetic */ PhotoViewer r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.v2, photoViewer.b0);
        this.r0 = photoViewer;
        this.o0 = new Path();
        this.q0 = new org.telegram.ui.Components.e6(this, 0L, 420L, org.telegram.ui.Components.rr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.p0 = z10;
        if (!z11) {
            this.q0.f(z10, true);
        }
        invalidate();
    }

    @Override // qg.d2, ci.d, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.o0;
        path.rewind();
        path.addRoundRect(this.i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.r0;
        if (this == photoViewer.v5 || this == photoViewer.w5) {
            canvas.translate(-photoViewer.u5.getX(), -photoViewer.u5.getY());
        }
        photoViewer.T0(canvas, this.h0, -13948117, 855638016, false, true, false);
        float e = this.q0.e(this.p0);
        if (e > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.h6.l1(e, -1));
        }
        setTextColor(i0.a.d(e, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
