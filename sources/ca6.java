// default package

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ca6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Surface b;
    public final /* synthetic */ SurfaceTexture c;

    public /* synthetic */ ca6(Surface surface, SurfaceTexture surfaceTexture, byte b) {
        this.a = b;
        this.b = surface;
        this.c = surfaceTexture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        SurfaceTexture surfaceTexture = this.c;
        Surface surface = this.b;
        switch (b) {
            case 0:
                if (surface != null) {
                    surface.release();
                }
                surfaceTexture.release();
                break;
            case 1:
                if (surface != null) {
                    surface.release();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    break;
                }
                break;
            case 2:
                if (surface != null) {
                    surface.release();
                }
                surfaceTexture.release();
                break;
            case 3:
                hl.c3(new ca6(surface, surfaceTexture, (byte) 4));
                break;
            default:
                if (surface != null) {
                    surface.release();
                }
                surfaceTexture.release();
                break;
        }
    }
}
