package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class if0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ba b;
    public final /* synthetic */ nf0 c;

    public if0(nf0 nf0Var, boolean z4, ba baVar) {
        this.c = nf0Var;
        this.a = z4;
        this.b = baVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        nf0 nf0Var = this.c;
        TextureView textureView = nf0Var.f0;
        if (nf0Var.i0 != null || surfaceTexture == null) {
            return;
        }
        vz vzVar = new vz(surfaceTexture, nf0Var.z0, nf0Var.E0, nf0Var.t0, this.a, this.b, i10, i11);
        nf0Var.i0 = vzVar;
        if (!this.a) {
            vzVar.i(nf0Var.G0, nf0Var.H0);
            vz vzVar2 = nf0Var.i0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            ha haVar = vzVar2.F;
            if (haVar != null) {
                Matrix matrix = haVar.v;
                transform.invert(matrix);
                float f10 = width;
                float f11 = height;
                matrix.preScale(f10, f11);
                matrix.postScale(1.0f / f10, 1.0f / f11);
                haVar.c(matrix);
                vzVar2.e(false, false, false);
            }
        }
        nf0Var.i0.f(nf0Var);
        vz vzVar3 = nf0Var.i0;
        vzVar3.getClass();
        vzVar3.postRunnable(new rz(vzVar3, i10, i11, 1));
        nf0Var.i0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        nf0 nf0Var = this.c;
        vz vzVar = nf0Var.i0;
        if (vzVar == null) {
            return true;
        }
        vzVar.postRunnable(new sz(vzVar, 0));
        nf0Var.i0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        nf0 nf0Var = this.c;
        vz vzVar = nf0Var.i0;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            nf0Var.i0.e(false, true, false);
            nf0Var.i0.postRunnable(new cc0(this, 6));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
