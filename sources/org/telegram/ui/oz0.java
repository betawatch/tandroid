package org.telegram.ui;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class oz0 implements org.telegram.ui.Components.s51, org.telegram.ui.Components.o51 {
    public final /* synthetic */ pz0 a;

    public /* synthetic */ oz0(pz0 pz0Var) {
        this.a = pz0Var;
    }

    @Override // org.telegram.ui.Components.o51
    public void A(boolean z10, float[] fArr) {
        this.a.W.e(z10, fArr);
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onRenderedFirstFrame(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s51
    public void onStateChanged(boolean z10, int i7) {
        pz0 pz0Var = this.a;
        if (i7 == 4) {
            pz0Var.dismiss();
        } else {
            org.telegram.messenger.g0.r(pz0Var.a0);
            org.telegram.messenger.g0.i3(pz0Var.a0, 16L);
        }
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.o51
    public boolean v() {
        return this.a.W.i != null;
    }

    @Override // org.telegram.ui.Components.s51
    public void onRenderedFirstFrame() {
        org.telegram.messenger.g0.h3(new pu0(this, 14));
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onSeekFinished(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onSeekStarted(m2.a aVar) {
    }

    @Override // org.telegram.ui.Components.s51
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.s51
    public void onError(org.telegram.ui.Components.u51 u51Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.s51
    public void onVideoSizeChanged(int i7, int i10, int i11, float f10) {
    }
}
