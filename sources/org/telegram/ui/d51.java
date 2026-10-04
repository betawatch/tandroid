package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class d51 implements org.telegram.ui.Components.a81, org.telegram.ui.Components.w71 {
    public final /* synthetic */ e51 a;

    public /* synthetic */ d51(e51 e51Var) {
        this.a = e51Var;
    }

    @Override // org.telegram.ui.Components.w71
    public boolean needUpdate() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.a81
    public void onStateChanged(boolean z10, int i10) {
        e51 e51Var = this.a;
        if (i10 == 4) {
            e51Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(e51Var.Z);
            AndroidUtilities.runOnUIThread(e51Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.w71
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.V.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.a81
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new hz0(this, 13));
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.a81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.a81
    public void onError(org.telegram.ui.Components.d81 d81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.a81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
