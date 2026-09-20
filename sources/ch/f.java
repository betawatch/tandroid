package ch;

import android.graphics.Canvas;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class f extends d {
    public final fh.a G;

    public f(fh.a aVar) {
        this.G = aVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c(canvas, this.G);
    }

    @Override // ch.d
    public final fh.a i() {
        return this.G;
    }
}
