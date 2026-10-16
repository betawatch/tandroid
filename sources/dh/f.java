package dh;

import android.graphics.Canvas;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
