package ag;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ga;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class n1 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ ga a;
    public final /* synthetic */ t1 b;

    public n1(t1 t1Var, ga gaVar) {
        this.b = t1Var;
        this.a = gaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            t1 t1Var = this.b;
            if (t1Var.d != null) {
                return;
            }
            r1 r1Var = new r1(t1Var, surfaceTexture, this.a);
            t1Var.d = r1Var;
            r1Var.n = i10;
            r1Var.r = i11;
            t1Var.i();
            t1Var.post(new m1(this, 1));
            f1 f1Var = t1Var.c;
            if (f1Var.v) {
                f1Var.f.f(new c1(f1Var, f1Var.w, 0));
                f1Var.w = null;
                f1Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        t1 t1Var = this.b;
        if (t1Var.d != null && !t1Var.y) {
            f1 f1Var = t1Var.c;
            f1Var.f.f(new a1.e(4, f1Var, new m1(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        t1 t1Var = this.b;
        r1 r1Var = t1Var.d;
        if (r1Var == null) {
            return;
        }
        r1Var.n = i10;
        r1Var.r = i11;
        t1Var.i();
        r1 r1Var2 = t1Var.d;
        r1Var2.postRunnable(r1Var2.w);
        t1Var.d.postRunnable(new m1(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
