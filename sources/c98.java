// default package

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class c98 extends vya {
    public final Path t0;
    public boolean u0;
    public final lm v0;
    public final /* synthetic */ PhotoViewer w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c98(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.F, photoViewer.w2, photoViewer.c0);
        this.w0 = photoViewer;
        this.t0 = new Path();
        this.v0 = new lm(this, 0L, 420L, s33.h);
    }

    public final void m(boolean z, boolean z2) {
        this.u0 = z;
        if (!z2) {
            this.v0.f(z, true);
        }
        invalidate();
    }

    @Override // vya, u41, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.t0;
        path.rewind();
        path.addRoundRect(this.n0, gl.L(this.r0), gl.L(this.r0), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.w0;
        if (this == photoViewer.v5 || this == photoViewer.w5) {
            canvas.translate(-photoViewer.u5.getX(), -photoViewer.u5.getY());
        }
        photoViewer.Q(canvas, this.m0, -13948117, 855638016, false, true, false);
        float d = this.v0.d(this.u0);
        if (d > 0.0f) {
            canvas.drawColor(bkb.p1(d, -1));
        }
        setTextColor(bm2.f(d, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.t0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
