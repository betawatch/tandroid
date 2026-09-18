package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class nf0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ja b;
    public final /* synthetic */ sf0 c;

    public nf0(sf0 sf0Var, boolean z10, ja jaVar) {
        this.c = sf0Var;
        this.a = z10;
        this.b = jaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        sf0 sf0Var = this.c;
        TextureView textureView = sf0Var.i0;
        if (sf0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        vz vzVar = new vz(surfaceTexture, sf0Var.C0, sf0Var.H0, sf0Var.w0, this.a, this.b, i10, i11);
        sf0Var.l0 = vzVar;
        if (!this.a) {
            vzVar.i(sf0Var.J0, sf0Var.K0);
            vz vzVar2 = sf0Var.l0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            pa paVar = vzVar2.I;
            if (paVar != null) {
                Matrix matrix = paVar.v;
                transform.invert(matrix);
                float f7 = width;
                float f10 = height;
                matrix.preScale(f7, f10);
                matrix.postScale(1.0f / f7, 1.0f / f10);
                paVar.c(matrix);
                vzVar2.e(false, false, false);
            }
        }
        sf0Var.l0.f(sf0Var);
        vz vzVar3 = sf0Var.l0;
        vzVar3.getClass();
        vzVar3.postRunnable(new rz(vzVar3, i10, i11, 1));
        sf0Var.l0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        sf0 sf0Var = this.c;
        vz vzVar = sf0Var.l0;
        if (vzVar == null) {
            return true;
        }
        vzVar.postRunnable(new sz(vzVar, 0));
        sf0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        sf0 sf0Var = this.c;
        vz vzVar = sf0Var.l0;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            sf0Var.l0.e(false, true, false);
            sf0Var.l0.postRunnable(new kc0(this, 6));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
