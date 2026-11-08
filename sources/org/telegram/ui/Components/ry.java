package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ry implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.q5 b;

    public /* synthetic */ ry(org.telegram.messenger.q5 q5Var, int i7) {
        this.a = i7;
        this.b = q5Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((sy) this.b).c(false, true, true);
                break;
            default:
                ((a40) this.b).requestRender(true, false);
                break;
        }
    }
}
