package kh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class q extends e7 {
    public final /* synthetic */ s B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(s sVar, Context context) {
        super(context);
        this.B = sVar;
    }

    @Override // kh.e7
    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.a.getCameraSessionRecording(), false, false);
        }
        s sVar = this.B;
        if (sVar.K1) {
            sVar.z(true, false);
        }
    }
}
