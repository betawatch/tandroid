package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class ho0 implements ui.a, dh.b {
    public final org.telegram.ui.Components.ga a;
    public final /* synthetic */ PhotoViewer b;

    public ho0(PhotoViewer photoViewer) {
        this.b = photoViewer;
        this.a = new org.telegram.ui.Components.ga(photoViewer.c0, photoViewer.f0, 0, false);
    }

    @Override // dh.b
    public final fh.g b() {
        fh.g gVar = new fh.g(this, this, this);
        this.b.a0.add(gVar);
        return gVar;
    }

    @Override // ui.a
    public final void o(float f10, float f11, float f12, float f13, Canvas canvas) {
        canvas.save();
        canvas.clipRect(f10, f11, f12, f13);
        this.b.N0(canvas, this.a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override // dh.b
    public final /* synthetic */ void c(fh.g gVar) {
    }
}
