package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class op0 implements hi.a, tg.a {
    public final org.telegram.ui.Components.w9 a;
    public final /* synthetic */ PhotoViewer b;

    public op0(PhotoViewer photoViewer) {
        this.b = photoViewer;
        this.a = new org.telegram.ui.Components.w9(photoViewer.b0, photoViewer.e0, 0, false);
    }

    @Override // tg.a
    public final vg.f b() {
        vg.f fVar = new vg.f(this, this, this);
        this.b.Z.add(fVar);
        return fVar;
    }

    @Override // hi.a
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        this.b.U0(canvas, this.a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override // tg.a
    public final /* synthetic */ void c(vg.f fVar) {
    }
}
