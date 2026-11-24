// default package

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class na6 implements TextureView.SurfaceTextureListener {
    public final TextureView.SurfaceTextureListener a;
    public final /* synthetic */ qa6 b;

    public na6(qa6 qa6Var, TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.b = qa6Var;
        this.a = surfaceTextureListener;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.a;
        return surfaceTextureListener == null || surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        qw4 qw4Var;
        TextureView.SurfaceTextureListener surfaceTextureListener = this.a;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
        qw4Var = ((d) this.b).glassEngine;
        qw4Var.g();
    }
}
