// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class an9 extends CameraView {
    public final Path a;
    public final /* synthetic */ bn9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an9(bn9 bn9Var, Context context) {
        super(context, true, false);
        this.b = bn9Var;
        this.a = new Path();
    }

    @Override // org.telegram.messenger.camera.CameraView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        Path path = this.a;
        path.rewind();
        path.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth() / 2.0f, getHeight() / 2.0f), Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final void receivedAmplitude(double d) {
        ((wc1) this.b).G.setAmplitude(d);
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final boolean square() {
        return true;
    }
}
