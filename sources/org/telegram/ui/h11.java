package org.telegram.ui;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h11 implements org.telegram.ui.Components.s61, org.telegram.ui.Components.o61 {
    public final /* synthetic */ i11 a;

    public /* synthetic */ h11(i11 i11Var) {
        this.a = i11Var;
    }

    @Override // org.telegram.ui.Components.o61
    public void B(boolean z10, float[] fArr) {
        this.a.V.e(z10, fArr);
    }

    @Override // org.telegram.ui.Components.o61
    public boolean k() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public void onStateChanged(boolean z10, int i10) {
        i11 i11Var = this.a;
        if (i10 == 4) {
            i11Var.dismiss();
        } else {
            org.telegram.messenger.i0.r(i11Var.Z);
            org.telegram.messenger.i0.h3(i11Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.s61
    public void onRenderedFirstFrame() {
        org.telegram.messenger.i0.g3(new wv0(this, 16));
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.s61
    public void onError(org.telegram.ui.Components.u61 u61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.s61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
