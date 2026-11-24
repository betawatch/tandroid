// default package

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class fn9 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ on9 a;

    public fn9(on9 on9Var) {
        this.a = on9Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        on9 on9Var = this.a;
        on9Var.r0 = surface;
        on9Var.v();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        on9 on9Var = this.a;
        Surface surface = on9Var.r0;
        on9Var.r0 = null;
        y76 y76Var = new y76(surface, surfaceTexture, (byte) 3);
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (!on9Var.s0 || sharedInstance == null) {
            on9Var.s0 = false;
            y76Var.run();
        } else {
            on9Var.s0 = false;
            sharedInstance.setRtmpStreamVideoOutput(null, y76Var);
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        on9 on9Var = this.a;
        if (on9Var.u0) {
            return;
        }
        on9Var.u0 = true;
        gl.r(on9Var.M0);
        on9Var.w.setVisibility(8);
        on9Var.x.setVisibility(8);
        on9Var.p();
        on9Var.j();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
