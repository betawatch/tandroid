package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class gs0 extends org.telegram.ui.Components.l81 {
    public final org.telegram.ui.Components.na g0;
    public final /* synthetic */ PhotoViewer h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.h0 = photoViewer;
        new Path();
        this.g0 = new org.telegram.ui.Components.na(photoViewer.b0, this, 0, false);
    }

    @Override // org.telegram.ui.Components.l81
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        float f7 = -getX();
        PhotoViewer photoViewer = this.h0;
        canvas.translate(f7 - photoViewer.R7.getX(), (-getY()) - photoViewer.R7.getY());
        photoViewer.U0(canvas, this.g0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.h0.n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.h0.e0.invalidate();
        }
    }
}
