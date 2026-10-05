package ch;

import android.graphics.Canvas;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
