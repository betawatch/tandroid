package org.telegram.ui;

import android.graphics.Canvas;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hw extends org.telegram.ui.Components.n5 {
    @Override // org.telegram.ui.Components.n5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(org.telegram.messenger.g0.L(-2.0f), org.telegram.messenger.g0.L(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
