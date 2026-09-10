package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m51 implements org.telegram.ui.Components.q71, org.telegram.ui.Components.m71 {
    public final /* synthetic */ n51 a;

    public /* synthetic */ m51(n51 n51Var) {
        this.a = n51Var;
    }

    @Override // org.telegram.ui.Components.m71
    public boolean needUpdate() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public void onStateChanged(boolean z10, int i10) {
        n51 n51Var = this.a;
        if (i10 == 4) {
            n51Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(n51Var.Z);
            AndroidUtilities.runOnUIThread(n51Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.m71
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.V.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.q71
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new k01(this, 12));
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.q71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.q71
    public void onError(org.telegram.ui.Components.t71 t71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.q71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
