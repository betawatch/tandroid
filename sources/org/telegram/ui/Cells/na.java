package org.telegram.ui.Cells;

import android.graphics.Canvas;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class na extends org.telegram.ui.Components.h5 {
    @Override // org.telegram.ui.Components.h5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
