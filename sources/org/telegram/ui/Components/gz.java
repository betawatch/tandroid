package org.telegram.ui.Components;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.DispatchQueue;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gz implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ DispatchQueue b;

    public /* synthetic */ gz(DispatchQueue dispatchQueue, int i9) {
        this.a = i9;
        this.b = dispatchQueue;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((hz) this.b).e(false, true, true);
                break;
            default:
                ((w40) this.b).requestRender(true, false);
                break;
        }
    }
}
