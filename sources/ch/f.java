package ch;

import android.graphics.Canvas;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
