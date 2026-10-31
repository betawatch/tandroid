package li;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
