package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class az implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.r5 b;

    public /* synthetic */ az(org.telegram.messenger.r5 r5Var, int i7) {
        this.a = i7;
        this.b = r5Var;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((bz) this.b).c(false, true, true);
                break;
            default:
                ((l40) this.b).requestRender(true, false);
                break;
        }
    }
}
