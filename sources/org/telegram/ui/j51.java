package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class j51 implements org.telegram.ui.Components.d71, org.telegram.ui.Components.z61 {
    public final /* synthetic */ k51 a;

    public /* synthetic */ j51(k51 k51Var) {
        this.a = k51Var;
    }

    @Override // org.telegram.ui.Components.z61
    public boolean needUpdate() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onStateChanged(boolean z10, int i10) {
        k51 k51Var = this.a;
        if (i10 == 4) {
            k51Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(k51Var.Z);
            AndroidUtilities.runOnUIThread(k51Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.z61
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.V.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.d71
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new f01(this, 12));
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onError(org.telegram.ui.Components.g71 g71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
