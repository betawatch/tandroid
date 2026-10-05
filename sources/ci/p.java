package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class p extends o7 {
    public final /* synthetic */ r F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, Context context) {
        super(context);
        this.F = rVar;
    }

    @Override // ci.o7
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
