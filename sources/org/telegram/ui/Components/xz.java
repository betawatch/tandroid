package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xz implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ DispatchQueue b;

    public /* synthetic */ xz(DispatchQueue dispatchQueue, int i10) {
        this.a = i10;
        this.b = dispatchQueue;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((yz) this.b).e(false, true, true);
                break;
            default:
                ((q50) this.b).requestRender(true, false);
                break;
        }
    }
}
