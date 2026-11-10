package fi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class k6 extends CameraView {
    public final Path a;
    public final /* synthetic */ l6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(l6 l6Var, Context context) {
        super(context, true, false);
        this.b = l6Var;
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
