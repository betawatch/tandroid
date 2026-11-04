package org.telegram.ui;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hz0 implements org.telegram.ui.Components.k51, org.telegram.ui.Components.g51 {
    public final /* synthetic */ iz0 a;

    public /* synthetic */ hz0(iz0 iz0Var) {
        this.a = iz0Var;
    }

    @Override // org.telegram.ui.Components.g51
    public boolean b() {
        return this.a.W.i != null;
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onRenderedFirstFrame(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onStateChanged(boolean z10, int i3) {
        iz0 iz0Var = this.a;
        if (i3 == 4) {
            iz0Var.dismiss();
        } else {
            org.telegram.messenger.g0.r(iz0Var.a0);
            org.telegram.messenger.g0.i3(iz0Var.a0, 16L);
        }
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.g51
    public void r(boolean z10, float[] fArr) {
        this.a.W.e(z10, fArr);
    }

    @Override // org.telegram.ui.Components.k51
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.h3(new pu0(this, 13));
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekFinished(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSeekStarted(l2.a aVar) {
    }

    @Override // org.telegram.ui.Components.k51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onError(org.telegram.ui.Components.m51 m51Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.k51
    public void onVideoSizeChanged(int i3, int i10, int i11, float f10) {
    }
}
