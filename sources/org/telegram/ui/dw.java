package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class dw extends org.telegram.ui.Components.h5 {
    @Override // org.telegram.ui.Components.h5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
