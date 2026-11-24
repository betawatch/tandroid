// default package

import android.graphics.Canvas;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g98 implements iz4, jm0 {
    public final wm0 a;
    public final /* synthetic */ PhotoViewer b;

    public g98(PhotoViewer photoViewer) {
        this.b = photoViewer;
        this.a = new wm0(photoViewer.c0, photoViewer.f0, 0, false);
    }

    @Override // jm0
    public final im0 b() {
        im0 im0Var = new im0(this, this, this);
        this.b.a0.add(im0Var);
        return im0Var;
    }

    @Override // iz4
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        this.b.P(canvas, this.a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override // jm0
    public final void c(im0 im0Var) {
    }
}
