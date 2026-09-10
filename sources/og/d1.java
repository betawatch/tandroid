package og;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ia;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d1 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ ia a;
    public final /* synthetic */ h1 b;

    public d1(h1 h1Var, ia iaVar) {
        this.b = h1Var;
        this.a = iaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            h1 h1Var = this.b;
            if (h1Var.d != null) {
                return;
            }
            f1 f1Var = new f1(h1Var, surfaceTexture, this.a);
            h1Var.d = f1Var;
            f1Var.n = i10;
            f1Var.r = i11;
            h1Var.i();
            h1Var.post(new c1(this, 1));
            v0 v0Var = h1Var.c;
            if (v0Var.v) {
                v0Var.f.f(new s0(v0Var, v0Var.w, 0));
                v0Var.w = null;
                v0Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        h1 h1Var = this.b;
        if (h1Var.d != null && !h1Var.y) {
            v0 v0Var = h1Var.c;
            v0Var.f.f(new m4.w(9, v0Var, new c1(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        h1 h1Var = this.b;
        f1 f1Var = h1Var.d;
        if (f1Var == null) {
            return;
        }
        f1Var.n = i10;
        f1Var.r = i11;
        h1Var.i();
        f1 f1Var2 = h1Var.d;
        f1Var2.postRunnable(f1Var2.w);
        h1Var.d.postRunnable(new c1(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
