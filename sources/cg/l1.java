package cg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ba;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l1 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ ba a;
    public final /* synthetic */ p1 b;

    public l1(p1 p1Var, ba baVar) {
        this.b = p1Var;
        this.a = baVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            p1 p1Var = this.b;
            if (p1Var.d != null) {
                return;
            }
            n1 n1Var = new n1(p1Var, surfaceTexture, this.a);
            p1Var.d = n1Var;
            n1Var.n = i10;
            n1Var.r = i11;
            p1Var.i();
            p1Var.post(new k1(this, 1));
            d1 d1Var = p1Var.c;
            if (d1Var.v) {
                d1Var.f.f(new a1(d1Var, d1Var.w, 0));
                d1Var.w = null;
                d1Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        p1 p1Var = this.b;
        if (p1Var.d != null && !p1Var.y) {
            d1 d1Var = p1Var.c;
            d1Var.f.f(new a1.e(10, d1Var, new k1(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        p1 p1Var = this.b;
        n1 n1Var = p1Var.d;
        if (n1Var == null) {
            return;
        }
        n1Var.n = i10;
        n1Var.r = i11;
        p1Var.i();
        n1 n1Var2 = p1Var.d;
        n1Var2.postRunnable(n1Var2.w);
        p1Var.d.postRunnable(new k1(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
