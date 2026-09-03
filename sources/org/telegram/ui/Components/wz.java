package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ((r50) this.b).requestRender(true, false);
                break;
        }
    }
}
