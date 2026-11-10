package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qy implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.q5 b;

    public /* synthetic */ qy(org.telegram.messenger.q5 q5Var, int i7) {
        this.a = i7;
        this.b = q5Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((ry) this.b).c(false, true, true);
                break;
            default:
                ((a40) this.b).requestRender(true, false);
                break;
        }
    }
}
