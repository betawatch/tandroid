package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class qf0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ja b;
    public final /* synthetic */ vf0 c;

    public qf0(vf0 vf0Var, boolean z10, ja jaVar) {
        this.c = vf0Var;
        this.a = z10;
        this.b = jaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        vf0 vf0Var = this.c;
        TextureView textureView = vf0Var.i0;
        if (vf0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        xz xzVar = new xz(surfaceTexture, vf0Var.C0, vf0Var.H0, vf0Var.w0, this.a, this.b, i10, i11);
        vf0Var.l0 = xzVar;
        if (!this.a) {
            xzVar.i(vf0Var.J0, vf0Var.K0);
            xz xzVar2 = vf0Var.l0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            pa paVar = xzVar2.I;
            if (paVar != null) {
                Matrix matrix = paVar.v;
                transform.invert(matrix);
                float f7 = width;
                float f10 = height;
                matrix.preScale(f7, f10);
                matrix.postScale(1.0f / f7, 1.0f / f10);
                paVar.c(matrix);
                xzVar2.e(false, false, false);
            }
        }
        vf0Var.l0.f(vf0Var);
        xz xzVar3 = vf0Var.l0;
        xzVar3.getClass();
        xzVar3.postRunnable(new tz(xzVar3, i10, i11, 1));
        vf0Var.l0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vf0 vf0Var = this.c;
        xz xzVar = vf0Var.l0;
        if (xzVar == null) {
            return true;
        }
        xzVar.postRunnable(new uz(xzVar, 0));
        vf0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vf0 vf0Var = this.c;
        xz xzVar = vf0Var.l0;
        if (xzVar != null) {
            xzVar.postRunnable(new tz(xzVar, i10, i11, 1));
            vf0Var.l0.e(false, true, false);
            vf0Var.l0.postRunnable(new kc0(this, 7));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
