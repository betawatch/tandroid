package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class p extends q7 {
    public final /* synthetic */ r F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, Context context) {
        super(context);
        this.F = rVar;
    }

    @Override // ci.q7
    public final void c() {
        AndroidUtilities.cancelRunOnUIThread(this.h);
        if (this.c <= 0) {
            a(true);
        } else {
            CameraController.getInstance().stopVideoRecording(this.a.getCameraSessionRecording(), false, false);
        }
        r rVar = this.F;
        if (rVar.O1) {
            rVar.z(true, false);
        }
    }
}
