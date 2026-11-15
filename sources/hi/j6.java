package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j6 extends CameraView {
    public final Path a;
    public final /* synthetic */ k6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(k6 k6Var, Context context) {
        super(context, true, false);
        this.b = k6Var;
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
        ((p) this.b).G.setAmplitude(d);
    }

    @Override // org.telegram.messenger.camera.CameraView
    public final boolean square() {
        return true;
    }
}
