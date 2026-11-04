package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class no0 extends org.telegram.ui.Components.w51 {
    public final org.telegram.ui.Components.ba h0;
    public final /* synthetic */ PhotoViewer i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.i0 = photoViewer;
        new Path();
        this.h0 = new org.telegram.ui.Components.ba(photoViewer.c0, this, 0, false);
    }

    @Override // org.telegram.ui.Components.w51
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        float f10 = -getX();
        PhotoViewer photoViewer = this.i0;
        canvas.translate(f10 - photoViewer.S7.getX(), (-getY()) - photoViewer.S7.getY());
        photoViewer.U0(canvas, this.h0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i3;
        if (org.telegram.messenger.az.c0 && ((i3 = this.i0.o4) == 1 || i3 == 2 || i3 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.i0.f0.invalidate();
        }
    }
}
