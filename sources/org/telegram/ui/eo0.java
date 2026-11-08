package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class eo0 implements ri.a, dh.b {
    public final org.telegram.ui.Components.ca a;
    public final /* synthetic */ PhotoViewer b;

    public eo0(PhotoViewer photoViewer) {
        this.b = photoViewer;
        this.a = new org.telegram.ui.Components.ca(photoViewer.b0, photoViewer.e0, 0, false);
    }

    @Override // dh.b
    public final fh.g b() {
        fh.g gVar = new fh.g(this, this, this);
        this.b.Z.add(gVar);
        return gVar;
    }

    @Override // ri.a
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
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
