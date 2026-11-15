package org.telegram.ui.Cells;

import android.graphics.Canvas;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class na extends org.telegram.ui.Components.f5 {
    @Override // org.telegram.ui.Components.f5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, org.telegram.messenger.g0.L(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
