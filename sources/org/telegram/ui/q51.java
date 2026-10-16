package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class q51 implements org.telegram.ui.Components.f81, org.telegram.ui.Components.b81 {
    public final /* synthetic */ r51 a;

    public /* synthetic */ q51(r51 r51Var) {
        this.a = r51Var;
    }

    @Override // org.telegram.ui.Components.b81
    public boolean needUpdate() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f81
    public void onStateChanged(boolean z10, int i10) {
        r51 r51Var = this.a;
        if (i10 == 4) {
            r51Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(r51Var.Z);
            AndroidUtilities.runOnUIThread(r51Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.b81
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.V.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.f81
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new tz0(this, 13));
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.f81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.f81
    public void onError(org.telegram.ui.Components.i81 i81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.f81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
