package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class a51 implements org.telegram.ui.Components.p71, org.telegram.ui.Components.l71 {
    public final /* synthetic */ b51 a;

    public /* synthetic */ a51(b51 b51Var) {
        this.a = b51Var;
    }

    @Override // org.telegram.ui.Components.l71
    public boolean needUpdate() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.p71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.p71
    public void onStateChanged(boolean z10, int i10) {
        b51 b51Var = this.a;
        if (i10 == 4) {
            b51Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(b51Var.Z);
            AndroidUtilities.runOnUIThread(b51Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.p71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.l71
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.V.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.p71
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new vz0(this, 12));
    }

    @Override // org.telegram.ui.Components.p71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.p71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.p71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.p71
    public void onError(org.telegram.ui.Components.s71 s71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.p71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
