// default package

import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class la9 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ tl0 a;
    public final /* synthetic */ pa9 b;

    public la9(pa9 pa9Var, tl0 tl0Var) {
        this.b = pa9Var;
        this.a = tl0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (surfaceTexture != null) {
            pa9 pa9Var = this.b;
            if (pa9Var.d == null) {
                na9 na9Var = new na9(pa9Var, surfaceTexture, this.a);
                pa9Var.d = na9Var;
                na9Var.n = i;
                na9Var.r = i2;
                pa9Var.i();
                pa9Var.post(new ka9(this, (byte) 1));
                nx7 nx7Var = pa9Var.c;
                if (nx7Var.v) {
                    nx7Var.f.f(new lx7(nx7Var, nx7Var.w, (byte) 0));
                    nx7Var.w = null;
                    nx7Var.v = false;
                }
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        pa9 pa9Var = this.b;
        if (pa9Var.d != null && !pa9Var.E) {
            nx7 nx7Var = pa9Var.c;
            nx7Var.f.f(new ql7(nx7Var, new ka9(this, (byte) 2), (byte) 15));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        pa9 pa9Var = this.b;
        na9 na9Var = pa9Var.d;
        if (na9Var == null) {
            return;
        }
        na9Var.n = i;
        na9Var.r = i2;
        pa9Var.i();
        na9 na9Var2 = pa9Var.d;
        na9Var2.postRunnable(na9Var2.x);
        pa9Var.d.postRunnable(new ka9(this, (byte) 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
