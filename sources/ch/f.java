package ch;

import android.graphics.Canvas;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class f extends d {
    public final fh.a H;

    public f(fh.a aVar) {
        this.H = aVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        n(canvas, this.H);
    }

    @Override // ch.d
    public final fh.a t() {
        return this.H;
    }
}
