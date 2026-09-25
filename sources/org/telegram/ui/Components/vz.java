package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vz implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ DispatchQueue b;

    public /* synthetic */ vz(DispatchQueue dispatchQueue, int i10) {
        this.a = i10;
        this.b = dispatchQueue;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((wz) this.b).e(false, true, true);
                break;
            default:
                ((n50) this.b).requestRender(true, false);
                break;
        }
    }
}
