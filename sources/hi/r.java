package hi;

import android.content.Context;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class r extends i6 {
    public final /* synthetic */ t G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, Context context) {
        super(context);
        this.G = tVar;
    }

    @Override // hi.i6
    public final void c() {
        org.telegram.messenger.g0.r(this.h);
        if (this.c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.a.getCameraSessionRecording(), false, false);
        }
        t tVar = this.G;
        if (tVar.O1) {
            tVar.z(true, false);
        }
    }
}
