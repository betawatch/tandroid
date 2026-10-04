package ch;

import android.graphics.Canvas;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
