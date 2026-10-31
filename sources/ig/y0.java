package ig;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.s9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ s9 a;
    public final /* synthetic */ c1 b;

    public y0(c1 c1Var, s9 s9Var) {
        this.b = c1Var;
        this.a = s9Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            c1 c1Var = this.b;
            if (c1Var.d != null) {
                return;
            }
            a1 a1Var = new a1(c1Var, surfaceTexture, this.a);
            c1Var.d = a1Var;
            a1Var.n = i10;
            a1Var.r = i11;
            c1Var.i();
            c1Var.post(new x0(this, 1));
            q0 q0Var = c1Var.c;
            if (q0Var.v) {
                q0Var.f.f(new n0(q0Var, q0Var.w, 0));
                q0Var.w = null;
                q0Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c1 c1Var = this.b;
        if (c1Var.d != null && !c1Var.D) {
            q0 q0Var = c1Var.c;
            q0Var.f.f(new d1.e(17, q0Var, new x0(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        c1 c1Var = this.b;
        a1 a1Var = c1Var.d;
        if (a1Var == null) {
            return;
        }
        a1Var.n = i10;
        a1Var.r = i11;
        c1Var.i();
        a1 a1Var2 = c1Var.d;
        a1Var2.postRunnable(a1Var2.x);
        c1Var.d.postRunnable(new x0(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
