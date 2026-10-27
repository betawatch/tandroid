package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e41 implements org.telegram.ui.Components.q81, org.telegram.ui.Components.m81 {
    public final /* synthetic */ f41 a;

    public /* synthetic */ e41(f41 f41Var) {
        this.a = f41Var;
    }

    @Override // org.telegram.ui.Components.m81
    public boolean needUpdate() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public void onStateChanged(boolean z10, int i10) {
        f41 f41Var = this.a;
        if (i10 == 4) {
            f41Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(f41Var.Z);
            AndroidUtilities.runOnUIThread(f41Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.m81
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.V.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.q81
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new oy0(this, 15));
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.q81
    public void onError(org.telegram.ui.Components.t81 t81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.q81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
