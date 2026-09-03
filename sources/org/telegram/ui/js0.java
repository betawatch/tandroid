package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class js0 extends org.telegram.ui.Components.u71 {
    public final org.telegram.ui.Components.fa d0;
    public final /* synthetic */ PhotoViewer e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.e0 = photoViewer;
        new Path();
        this.d0 = new org.telegram.ui.Components.fa(photoViewer.Y, this, 0, false);
    }

    @Override // org.telegram.ui.Components.u71
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        float f10 = -getX();
        PhotoViewer photoViewer = this.e0;
        canvas.translate(f10 - photoViewer.N7.getX(), (-getY()) - photoViewer.N7.getY());
        photoViewer.T0(canvas, this.d0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.e0.k4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.e0.b0.invalidate();
        }
    }
}
