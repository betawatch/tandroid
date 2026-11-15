package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class gq0 extends tg.s1 {
    public final Path s0;
    public boolean t0;
    public final org.telegram.ui.Components.u5 u0;
    public final /* synthetic */ PhotoViewer v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.F, photoViewer.w2, photoViewer.c0);
        this.v0 = photoViewer;
        this.s0 = new Path();
        this.u0 = new org.telegram.ui.Components.u5(this, 0L, 420L, org.telegram.ui.Components.er.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.t0 = z10;
        if (!z11) {
            this.u0.f(z10, true);
        }
        invalidate();
    }

    @Override // tg.s1, hi.d, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.s0;
        path.rewind();
        path.addRoundRect(this.m0, org.telegram.messenger.g0.L(this.q0), org.telegram.messenger.g0.L(this.q0), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.v0;
        if (this == photoViewer.v5 || this == photoViewer.w5) {
            canvas.translate(-photoViewer.u5.getX(), -photoViewer.u5.getY());
        }
        photoViewer.N0(canvas, this.l0, -13948117, 855638016, false, true, false);
        float d = this.u0.d(this.t0);
        if (d > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.j6.r1(d, -1));
        }
        setTextColor(i0.a.f(d, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.s0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
