package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class b41 implements org.telegram.ui.Components.p81, org.telegram.ui.Components.l81 {
    public final /* synthetic */ c41 a;

    public /* synthetic */ b41(c41 c41Var) {
        this.a = c41Var;
    }

    @Override // org.telegram.ui.Components.l81
    public boolean needUpdate() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.p81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.p81
    public void onStateChanged(boolean z10, int i10) {
        c41 c41Var = this.a;
        if (i10 == 4) {
            c41Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(c41Var.Z);
            AndroidUtilities.runOnUIThread(c41Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.p81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.l81
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.V.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.p81
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new my0(this, 15));
    }

    @Override // org.telegram.ui.Components.p81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.p81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.p81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.p81
    public void onError(org.telegram.ui.Components.s81 s81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.p81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
