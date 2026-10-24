package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class a41 implements org.telegram.ui.Components.g81, org.telegram.ui.Components.c81 {
    public final /* synthetic */ b41 a;

    public /* synthetic */ a41(b41 b41Var) {
        this.a = b41Var;
    }

    @Override // org.telegram.ui.Components.c81
    public boolean needUpdate() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g81
    public void onStateChanged(boolean z10, int i10) {
        b41 b41Var = this.a;
        if (i10 == 4) {
            b41Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(b41Var.Z);
            AndroidUtilities.runOnUIThread(b41Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.c81
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.V.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.g81
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new my0(this, 14));
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.g81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.g81
    public void onError(org.telegram.ui.Components.j81 j81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.g81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
