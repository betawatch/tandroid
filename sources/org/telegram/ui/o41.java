package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class o41 implements org.telegram.ui.Components.f71, org.telegram.ui.Components.b71 {
    public final /* synthetic */ p41 a;

    public /* synthetic */ o41(p41 p41Var) {
        this.a = p41Var;
    }

    @Override // org.telegram.ui.Components.b71
    public boolean needUpdate() {
        return this.a.S.i != null;
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public void onStateChanged(boolean z4, int i10) {
        p41 p41Var = this.a;
        if (i10 == 4) {
            p41Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(p41Var.W);
            AndroidUtilities.runOnUIThread(p41Var.W, 16L);
        }
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.b71
    public void onVisualizerUpdate(boolean z4, boolean z10, float[] fArr) {
        this.a.S.e(z4, true, fArr);
    }

    @Override // org.telegram.ui.Components.f71
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new vy0(this, 14));
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.f71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.f71
    public void onError(org.telegram.ui.Components.i71 i71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.f71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
