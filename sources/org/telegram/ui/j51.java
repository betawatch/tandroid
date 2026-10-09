package org.telegram.ui;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class j51 implements org.telegram.ui.Components.h81, org.telegram.ui.Components.d81 {
    public final /* synthetic */ k51 a;

    public /* synthetic */ j51(k51 k51Var) {
        this.a = k51Var;
    }

    @Override // org.telegram.ui.Components.d81
    public boolean needUpdate() {
        return this.a.V.i != null;
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.h81
    public void onStateChanged(boolean z10, int i10) {
        k51 k51Var = this.a;
        if (i10 == 4) {
            k51Var.dismiss();
        } else {
            AndroidUtilities.cancelRunOnUIThread(k51Var.Z);
            AndroidUtilities.runOnUIThread(k51Var.Z, 16L);
        }
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.d81
    public void onVisualizerUpdate(boolean z10, boolean z11, float[] fArr) {
        this.a.V.e(z10, true, fArr);
    }

    @Override // org.telegram.ui.Components.h81
    public void onRenderedFirstFrame() {
        AndroidUtilities.runOnUIThread(new nz0(this, 13));
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.h81
    public void onError(org.telegram.ui.Components.k81 k81Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.h81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
