// default package

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class da6 implements qr9, TextureView.SurfaceTextureListener {
    public final ne8 a;
    public volatile Surface b;
    public boolean c;

    public da6(ne8 ne8Var) {
        this.a = ne8Var;
        ne8Var.setSurfaceTextureListener(this);
        SurfaceTexture surfaceTexture = ne8Var.getSurfaceTexture();
        if (surfaceTexture != null) {
            this.b = new Surface(surfaceTexture);
        }
    }

    @Override // qr9
    public final boolean b() {
        return true;
    }

    public final void c(SurfaceTexture surfaceTexture) {
        if (this.c) {
            if (surfaceTexture != null) {
                kq9.I(this, new z96(surfaceTexture, (byte) 1));
            }
        } else {
            this.c = true;
            Surface surface = this.b;
            this.b = null;
            kq9.I(this, new ca6(surface, surfaceTexture, (byte) 1));
        }
    }

    @Override // qr9
    public final Surface getSurface() {
        return this.b;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.c) {
            return;
        }
        this.b = new Surface(surfaceTexture);
        kq9.I(this, null);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        if (this.c) {
            return false;
        }
        Surface surface = this.b;
        this.b = null;
        kq9.I(this, new ca6(surface, surfaceTexture, (byte) 0));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // qr9
    public final void a(int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
