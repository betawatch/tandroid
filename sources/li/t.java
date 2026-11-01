package li;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((v) this.b).b(false);
                return;
            case 1:
                ((v) this.b).b(true);
                return;
            default:
                z0 z0Var = (z0) this.b;
                synchronized (z0Var.b) {
                    z0Var.m = true;
                    z0Var.b.notifyAll();
                }
                return;
        }
    }
}
