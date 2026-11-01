package org.telegram.ui;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g11 implements org.telegram.ui.Components.t61, org.telegram.ui.Components.p61 {
    public final /* synthetic */ h11 a;

    public /* synthetic */ g11(h11 h11Var) {
        this.a = h11Var;
    }

    @Override // org.telegram.ui.Components.p61
    public void B(boolean z10, float[] fArr) {
        this.a.V.e(z10, fArr);
    }

    @Override // org.telegram.ui.Components.p61
    public boolean k() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.t61
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.t61
    public void onStateChanged(boolean z10, int i10) {
        h11 h11Var = this.a;
        if (i10 == 4) {
            h11Var.dismiss();
        } else {
            org.telegram.messenger.i0.r(h11Var.Z);
            org.telegram.messenger.i0.h3(h11Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.t61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.t61
    public void onRenderedFirstFrame() {
        org.telegram.messenger.i0.g3(new vv0(this, 16));
    }

    @Override // org.telegram.ui.Components.t61
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.t61
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.t61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.t61
    public void onError(org.telegram.ui.Components.v61 v61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.t61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
