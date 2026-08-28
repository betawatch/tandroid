package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class lt0 extends yf.c2 {
    public final Path k0;
    public boolean l0;
    public final org.telegram.ui.Components.y5 m0;
    public final /* synthetic */ PhotoViewer n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt0(PhotoViewer photoViewer) {
        super(photoViewer.l5, photoViewer.A, photoViewer.r2, photoViewer.X);
        this.n0 = photoViewer;
        this.k0 = new Path();
        this.m0 = new org.telegram.ui.Components.y5(this, 0L, 420L, org.telegram.ui.Components.gr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.l0 = z10;
        if (!z11) {
            this.m0.f(z10, true);
        }
        invalidate();
    }

    @Override // yf.c2, kh.d, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.k0;
        path.rewind();
        path.addRoundRect(this.e0, AndroidUtilities.dp(this.i0), AndroidUtilities.dp(this.i0), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.n0;
        if (this == photoViewer.r5 || this == photoViewer.s5) {
            canvas.translate(-photoViewer.q5.getX(), -photoViewer.q5.getY());
        }
        photoViewer.T0(canvas, this.d0, -13948117, 855638016, false, true, false);
        float e10 = this.m0.e(this.l0);
        if (e10 > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.f6.l1(e10, -1));
        }
        setTextColor(i0.a.d(e10, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.k0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
