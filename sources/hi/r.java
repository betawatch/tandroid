package hi;

import android.content.Context;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
