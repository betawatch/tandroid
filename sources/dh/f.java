package dh;

import android.graphics.Canvas;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class f extends d {
    public final gh.a G;

    public f(gh.a aVar) {
        this.G = aVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        c(canvas, this.G);
    }

    @Override // dh.d
    public final gh.a i() {
        return this.G;
    }
}
