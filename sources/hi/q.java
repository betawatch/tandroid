package hi;

import android.content.Context;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
