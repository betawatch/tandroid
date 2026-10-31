package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
