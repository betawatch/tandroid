package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class k51 implements org.telegram.ui.Components.q71, org.telegram.ui.Components.m71 {
    public final /* synthetic */ l51 a;

    public /* synthetic */ k51(l51 l51Var) {
        this.a = l51Var;
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
        l51 l51Var = this.a;
        if (i10 == 4) {
            l51Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(l51Var.Z);
            AndroidUtilities.runOnUIThread(l51Var.Z, 16L);
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
        AndroidUtilities.runOnUIThread(new e01(this, 12));
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
