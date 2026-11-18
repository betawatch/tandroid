package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bz implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.r5 b;

    public /* synthetic */ bz(org.telegram.messenger.r5 r5Var, int i7) {
        this.a = i7;
        this.b = r5Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((cz) this.b).c(false, true, true);
                break;
            default:
                ((l40) this.b).requestRender(true, false);
                break;
        }
    }
}
