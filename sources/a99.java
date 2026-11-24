// default package

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a99 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ sm0 a;
    public final /* synthetic */ e99 b;

    public a99(e99 e99Var, sm0 sm0Var) {
        this.b = e99Var;
        this.a = sm0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (surfaceTexture != null) {
            e99 e99Var = this.b;
            if (e99Var.d == null) {
                c99 c99Var = new c99(e99Var, surfaceTexture, this.a);
                e99Var.d = c99Var;
                c99Var.n = i;
                c99Var.r = i2;
                e99Var.i();
                e99Var.post(new z89(this, (byte) 1));
                hw7 hw7Var = e99Var.c;
                if (hw7Var.v) {
                    hw7Var.f.f(new fw7(hw7Var, hw7Var.w, (byte) 0));
                    hw7Var.w = null;
                    hw7Var.v = false;
                }
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e99 e99Var = this.b;
        if (e99Var.d != null && !e99Var.E) {
            hw7 hw7Var = e99Var.c;
            hw7Var.f.f(new bl7(hw7Var, new z89(this, (byte) 2), (byte) 17));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        e99 e99Var = this.b;
        c99 c99Var = e99Var.d;
        if (c99Var == null) {
            return;
        }
        c99Var.n = i;
        c99Var.r = i2;
        e99Var.i();
        c99 c99Var2 = e99Var.d;
        c99Var2.postRunnable(c99Var2.x);
        e99Var.d.postRunnable(new z89(this, (byte) 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
