package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class q41 implements org.telegram.ui.Components.h71, org.telegram.ui.Components.d71 {
    public final /* synthetic */ r41 a;

    public /* synthetic */ q41(r41 r41Var) {
        this.a = r41Var;
    }

    @Override // org.telegram.ui.Components.d71
    public boolean needUpdate() {
        return this.a.S.i != null;
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ void onRenderedFirstFrame(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h71
    public void onStateChanged(boolean z4, int i10) {
        r41 r41Var = this.a;
        if (i10 == 4) {
            r41Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(r41Var.W);
            AndroidUtilities.runOnUIThread(r41Var.W, 16L);
        }
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.d71
    public void onVisualizerUpdate(boolean z4, boolean z10, float[] fArr) {
        this.a.S.e(z4, true, fArr);
    }

    @Override // org.telegram.ui.Components.h71
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new xy0(this, 13));
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ void onSeekFinished(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ void onSeekStarted(k3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.h71
    public void onError(org.telegram.ui.Components.k71 k71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.h71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
