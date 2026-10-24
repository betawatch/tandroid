package ei;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.camera.CameraController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class p extends e7 {
    public final /* synthetic */ r F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(r rVar, Context context) {
        super(context);
        this.F = rVar;
    }

    @Override // ei.e7
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
