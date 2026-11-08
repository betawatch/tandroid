package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h3 extends l9 {
    public final Path G;

    public h3(Context context) {
        super(context);
        this.G = new Path();
    }

    @Override // org.telegram.ui.Components.l9, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.G;
        path.rewind();
        path.addCircle(org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.g0.L(53.0f), org.telegram.messenger.g0.L(14.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        super.onDraw(canvas);
        canvas.restore();
    }
}
