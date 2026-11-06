package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
