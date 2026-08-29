package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e41 implements org.telegram.ui.Components.u61, org.telegram.ui.Components.q61 {
    public final /* synthetic */ f41 a;

    public /* synthetic */ e41(f41 f41Var) {
        this.a = f41Var;
    }

    @Override // org.telegram.ui.Components.q61
    public boolean needUpdate() {
        return this.a.R.i != null;
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public void onStateChanged(boolean z10, int i10) {
        f41 f41Var = this.a;
        if (i10 == 4) {
            f41Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(f41Var.V);
            AndroidUtilities.runOnUIThread(f41Var.V, 16L);
        }
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.q61
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.R.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.u61
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new ky0(this, 14));
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.u61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.u61
    public void onError(org.telegram.ui.Components.x61 x61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.u61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f9) {
    }
}
