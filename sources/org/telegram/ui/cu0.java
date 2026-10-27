package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class cu0 extends sg.d2 {
    public final Path r0;
    public boolean s0;
    public final org.telegram.ui.Components.h6 t0;
    public final /* synthetic */ PhotoViewer u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.v2, photoViewer.b0);
        this.u0 = photoViewer;
        this.r0 = new Path();
        this.t0 = new org.telegram.ui.Components.h6(this, 0L, 420L, org.telegram.ui.Components.ds.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.s0 = z10;
        if (!z11) {
            this.t0.f(z10, true);
        }
        invalidate();
    }

    @Override // sg.d2, fi.d, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.r0;
        path.rewind();
        path.addRoundRect(this.l0, AndroidUtilities.dp(this.p0), AndroidUtilities.dp(this.p0), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.u0;
        if (this == photoViewer.v5 || this == photoViewer.w5) {
            canvas.translate(-photoViewer.u5.getX(), -photoViewer.u5.getY());
        }
        photoViewer.U0(canvas, this.k0, -13948117, 855638016, false, true, false);
        float e = this.t0.e(this.s0);
        if (e > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.y6.o1(e, -1));
        }
        setTextColor(i0.a.f(e, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.r0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
