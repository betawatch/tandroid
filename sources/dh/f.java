package dh;

import android.graphics.Canvas;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
