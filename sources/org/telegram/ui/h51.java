package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class h51 implements org.telegram.ui.Components.r71, org.telegram.ui.Components.n71 {
    public final /* synthetic */ i51 a;

    public /* synthetic */ h51(i51 i51Var) {
        this.a = i51Var;
    }

    @Override // org.telegram.ui.Components.n71
    public boolean needUpdate() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.r71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r71
    public void onStateChanged(boolean z10, int i10) {
        i51 i51Var = this.a;
        if (i10 == 4) {
            i51Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(i51Var.Z);
            AndroidUtilities.runOnUIThread(i51Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.r71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.n71
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.V.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.r71
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new e01(this, 12));
    }

    @Override // org.telegram.ui.Components.r71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.r71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.r71
    public void onError(org.telegram.ui.Components.u71 u71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.r71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
