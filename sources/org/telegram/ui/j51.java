package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class j51 implements org.telegram.ui.Components.e71, org.telegram.ui.Components.a71 {
    public final /* synthetic */ k51 a;

    public /* synthetic */ j51(k51 k51Var) {
        this.a = k51Var;
    }

    @Override // org.telegram.ui.Components.a71
    public boolean needUpdate() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.e71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.e71
    public void onStateChanged(boolean z10, int i10) {
        k51 k51Var = this.a;
        if (i10 == 4) {
            k51Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(k51Var.Z);
            AndroidUtilities.runOnUIThread(k51Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.e71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.a71
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.V.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.e71
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new g01(this, 12));
    }

    @Override // org.telegram.ui.Components.e71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.e71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.e71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.e71
    public void onError(org.telegram.ui.Components.h71 h71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.e71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
