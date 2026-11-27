// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mb8 extends mgc {
    public final xl0 h0;
    public final /* synthetic */ PhotoViewer i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb8(Context context, PhotoViewer photoViewer) {
        super(context);
        this.i0 = photoViewer;
        this.h0 = new xl0(photoViewer.c0, this, 0, false);
    }

    @Override // mgc
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        float f = -getX();
        PhotoViewer photoViewer = this.i0;
        canvas.translate(f - photoViewer.W7.getX(), (-getY()) - photoViewer.W7.getY());
        photoViewer.P(canvas, this.h0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        byte b;
        if (xea.Z && ((b = this.i0.m4) == 1 || b == 2 || b == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            this.i0.f0.invalidate();
        }
    }
}
