package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class be0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ca b;
    public final /* synthetic */ ee0 c;

    public be0(ee0 ee0Var, boolean z10, ca caVar) {
        this.c = ee0Var;
        this.a = z10;
        this.b = caVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        ee0 ee0Var = this.c;
        TextureView textureView = ee0Var.j0;
        if (ee0Var.m0 != null || surfaceTexture == null) {
            return;
        }
        ez ezVar = new ez(surfaceTexture, ee0Var.D0, ee0Var.I0, ee0Var.x0, this.a, this.b, i7, i10);
        ee0Var.m0 = ezVar;
        if (!this.a) {
            ezVar.h(ee0Var.K0, ee0Var.L0);
            ez ezVar2 = ee0Var.m0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            ha haVar = ezVar2.J;
            if (haVar != null) {
                Matrix matrix = haVar.v;
                transform.invert(matrix);
                float f10 = width;
                float f11 = height;
                matrix.preScale(f10, f11);
                matrix.postScale(1.0f / f10, 1.0f / f11);
                haVar.c(matrix);
                ezVar2.c(false, false, false);
            }
        }
        ee0Var.m0.d(ee0Var);
        ez ezVar3 = ee0Var.m0;
        ezVar3.getClass();
        ezVar3.postRunnable(new az(ezVar3, i7, i10, 1));
        ee0Var.m0.c(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ee0 ee0Var = this.c;
        ez ezVar = ee0Var.m0;
        if (ezVar == null) {
            return true;
        }
        ezVar.postRunnable(new bz(ezVar, 0));
        ee0Var.m0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        ee0 ee0Var = this.c;
        ez ezVar = ee0Var.m0;
        if (ezVar != null) {
            ezVar.postRunnable(new az(ezVar, i7, i10, 1));
            ee0Var.m0.c(false, true, false);
            ee0Var.m0.postRunnable(new hb0(this, 5));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
