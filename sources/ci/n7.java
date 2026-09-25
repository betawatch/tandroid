package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class n7 extends CameraView {
    public final Path a;
    public final /* synthetic */ o7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(o7 o7Var, Context context) {
        super(context, true, false);
        this.b = o7Var;
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
        ((p) this.b).F.setAmplitude(d);
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final boolean square() {
        return true;
    }
}
