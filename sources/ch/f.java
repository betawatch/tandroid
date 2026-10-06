package ch;

import android.graphics.Canvas;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
