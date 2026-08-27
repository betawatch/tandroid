package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b41 implements org.telegram.ui.Components.j61, org.telegram.ui.Components.f61 {
    public final /* synthetic */ c41 a;

    public /* synthetic */ b41(c41 c41Var) {
        this.a = c41Var;
    }

    @Override // org.telegram.ui.Components.f61
    public boolean needUpdate() {
        return this.a.R.i != null;
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onStateChanged(boolean z10, int i10) {
        c41 c41Var = this.a;
        if (i10 == 4) {
            c41Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(c41Var.V);
            AndroidUtilities.runOnUIThread(c41Var.V, 16L);
        }
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.f61
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.R.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.j61
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new ky0(this, 14));
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSeekStarted(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onError(org.telegram.ui.Components.m61 m61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
