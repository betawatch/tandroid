package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class iq0 extends tg.u1 {
    public final Path t0;
    public boolean u0;
    public final org.telegram.ui.Components.d6 v0;
    public final /* synthetic */ PhotoViewer w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.F, photoViewer.w2, photoViewer.c0);
        this.w0 = photoViewer;
        this.t0 = new Path();
        this.v0 = new org.telegram.ui.Components.d6(this, 0L, 420L, org.telegram.ui.Components.nr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.u0 = z10;
        if (!z11) {
            this.v0.f(z10, true);
        }
        invalidate();
    }

    @Override // tg.u1, hi.e, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.t0;
        path.rewind();
        path.addRoundRect(this.n0, org.telegram.messenger.g0.L(this.r0), org.telegram.messenger.g0.L(this.r0), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.w0;
        if (this == photoViewer.v5 || this == photoViewer.w5) {
            canvas.translate(-photoViewer.u5.getX(), -photoViewer.u5.getY());
        }
        photoViewer.N0(canvas, this.m0, -13948117, 855638016, false, true, false);
        float d = this.v0.d(this.u0);
        if (d > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.m6.r1(d, -1));
        }
        setTextColor(i0.a.f(d, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.t0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
