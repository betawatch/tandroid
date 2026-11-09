package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jq0 extends tg.s1 {
    public final Path r0;
    public boolean s0;
    public final org.telegram.ui.Components.w5 t0;
    public final /* synthetic */ PhotoViewer u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq0(PhotoViewer photoViewer) {
        super(photoViewer.o5, photoViewer.E, photoViewer.v2, photoViewer.b0);
        this.u0 = photoViewer;
        this.r0 = new Path();
        this.t0 = new org.telegram.ui.Components.w5(this, 0L, 420L, org.telegram.ui.Components.xq.h);
    }

    public final void m(boolean z9, boolean z10) {
        this.s0 = z9;
        if (!z10) {
            this.t0.f(z9, true);
        }
        invalidate();
    }

    @Override // tg.s1, fi.d, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.r0;
        path.rewind();
        path.addRoundRect(this.l0, org.telegram.messenger.g0.L(this.p0), org.telegram.messenger.g0.L(this.p0), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.u0;
        if (this == photoViewer.u5 || this == photoViewer.v5) {
            canvas.translate(-photoViewer.t5.getX(), -photoViewer.t5.getY());
        }
        photoViewer.N0(canvas, this.k0, -13948117, 855638016, false, true, false);
        float d = this.t0.d(this.s0);
        if (d > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.l6.r1(d, -1));
        }
        setTextColor(i0.a.f(d, -1, -16777216));
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
