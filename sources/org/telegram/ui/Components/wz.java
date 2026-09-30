package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wz implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ DispatchQueue b;

    public /* synthetic */ wz(DispatchQueue dispatchQueue, int i10) {
        this.a = i10;
        this.b = dispatchQueue;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((xz) this.b).e(false, true, true);
                break;
            default:
                ((p50) this.b).requestRender(true, false);
                break;
        }
    }
}
