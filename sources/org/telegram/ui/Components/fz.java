package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fz implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.s5 b;

    public /* synthetic */ fz(org.telegram.messenger.s5 s5Var, int i10) {
        this.a = i10;
        this.b = s5Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((gz) this.b).c(false, true, true);
                break;
            default:
                ((r40) this.b).requestRender(true, false);
                break;
        }
    }
}
