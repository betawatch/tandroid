package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nf0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ia b;
    public final /* synthetic */ sf0 c;

    public nf0(sf0 sf0Var, boolean z10, ia iaVar) {
        this.c = sf0Var;
        this.a = z10;
        this.b = iaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        sf0 sf0Var = this.c;
        TextureView textureView = sf0Var.i0;
        if (sf0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        c00 c00Var = new c00(surfaceTexture, sf0Var.C0, sf0Var.H0, sf0Var.w0, this.a, this.b, i10, i11);
        sf0Var.l0 = c00Var;
        if (!this.a) {
            c00Var.i(sf0Var.J0, sf0Var.K0);
            c00 c00Var2 = sf0Var.l0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            oa oaVar = c00Var2.I;
            if (oaVar != null) {
                Matrix matrix = oaVar.v;
                transform.invert(matrix);
                float f7 = width;
                float f10 = height;
                matrix.preScale(f7, f10);
                matrix.postScale(1.0f / f7, 1.0f / f10);
                oaVar.c(matrix);
                c00Var2.e(false, false, false);
            }
        }
        sf0Var.l0.f(sf0Var);
        c00 c00Var3 = sf0Var.l0;
        c00Var3.getClass();
        c00Var3.postRunnable(new yz(c00Var3, i10, i11, 1));
        sf0Var.l0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        sf0 sf0Var = this.c;
        c00 c00Var = sf0Var.l0;
        if (c00Var == null) {
            return true;
        }
        c00Var.postRunnable(new zz(c00Var, 0));
        sf0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        sf0 sf0Var = this.c;
        c00 c00Var = sf0Var.l0;
        if (c00Var != null) {
            c00Var.postRunnable(new yz(c00Var, i10, i11, 1));
            sf0Var.l0.e(false, true, false);
            sf0Var.l0.postRunnable(new kc0(this, 6));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
