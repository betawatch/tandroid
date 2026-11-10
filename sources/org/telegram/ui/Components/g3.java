package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g3 extends k9 {
    public final Path G;

    public g3(Context context) {
        super(context);
        this.G = new Path();
    }

    @Override // org.telegram.ui.Components.k9, android.view.View
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
