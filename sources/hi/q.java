package hi;

import android.content.Context;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class q extends j6 {
    public final /* synthetic */ s G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, Context context) {
        super(context);
        this.G = sVar;
    }

    @Override // hi.j6
    public final void c() {
        org.telegram.messenger.g0.r(this.h);
        if (this.c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.a.getCameraSessionRecording(), false, false);
        }
        s sVar = this.G;
        if (sVar.O1) {
            sVar.z(true, false);
        }
    }
}
