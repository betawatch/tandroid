package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dz implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.r5 b;

    public /* synthetic */ dz(org.telegram.messenger.r5 r5Var, int i7) {
        this.a = i7;
        this.b = r5Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((ez) this.b).c(false, true, true);
                break;
            default:
                ((o40) this.b).requestRender(true, false);
                break;
        }
    }
}
