package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c41 implements org.telegram.ui.Components.h61, org.telegram.ui.Components.d61 {
    public final /* synthetic */ d41 a;

    public /* synthetic */ c41(d41 d41Var) {
        this.a = d41Var;
    }

    @Override // org.telegram.ui.Components.d61
    public boolean needUpdate() {
        return this.a.R.i != null;
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public void onStateChanged(boolean z10, int i9) {
        d41 d41Var = this.a;
        if (i9 == 4) {
            d41Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(d41Var.V);
            AndroidUtilities.runOnUIThread(d41Var.V, 16L);
        }
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.d61
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.R.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.h61
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new ky0(this, 14));
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onSeekStarted(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.h61
    public void onError(org.telegram.ui.Components.k61 k61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.h61
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
    }
}
