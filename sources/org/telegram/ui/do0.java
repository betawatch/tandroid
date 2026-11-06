package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class do0 implements ri.a, dh.b {
    public final org.telegram.ui.Components.ca a;
    public final /* synthetic */ PhotoViewer b;

    public do0(PhotoViewer photoViewer) {
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
