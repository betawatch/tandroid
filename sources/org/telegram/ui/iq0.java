package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class iq0 extends tg.x1 {
    public final Path t0;
    public boolean u0;
    public final org.telegram.ui.Components.c6 v0;
    public final /* synthetic */ PhotoViewer w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.F, photoViewer.w2, photoViewer.c0);
        this.w0 = photoViewer;
        this.t0 = new Path();
        this.v0 = new org.telegram.ui.Components.c6(this, 0L, 420L, org.telegram.ui.Components.kr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.u0 = z10;
        if (!z11) {
            this.v0.f(z10, true);
        }
        invalidate();
    }

    @Override // tg.x1, hi.e, android.view.View
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
            canvas.drawColor(org.telegram.ui.ActionBar.n6.r1(d, -1));
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
