package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class le0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ba b;
    public final /* synthetic */ qe0 c;

    public le0(qe0 qe0Var, boolean z10, ba baVar) {
        this.c = qe0Var;
        this.a = z10;
        this.b = baVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        qe0 qe0Var = this.c;
        TextureView textureView = qe0Var.e0;
        if (qe0Var.h0 != null || surfaceTexture == null) {
            return;
        }
        hz hzVar = new hz(surfaceTexture, qe0Var.y0, qe0Var.D0, qe0Var.s0, this.a, this.b, i9, i10);
        qe0Var.h0 = hzVar;
        if (!this.a) {
            hzVar.i(qe0Var.F0, qe0Var.G0);
            hz hzVar2 = qe0Var.h0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            ha haVar = hzVar2.E;
            if (haVar != null) {
                Matrix matrix = haVar.v;
                transform.invert(matrix);
                float f10 = width;
                float f11 = height;
                matrix.preScale(f10, f11);
                matrix.postScale(1.0f / f10, 1.0f / f11);
                haVar.c(matrix);
                hzVar2.e(false, false, false);
            }
        }
        qe0Var.h0.f(qe0Var);
        hz hzVar3 = qe0Var.h0;
        hzVar3.getClass();
        hzVar3.postRunnable(new dz(hzVar3, i9, i10, 1));
        qe0Var.h0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        qe0 qe0Var = this.c;
        hz hzVar = qe0Var.h0;
        if (hzVar == null) {
            return true;
        }
        hzVar.postRunnable(new ez(hzVar, 0));
        qe0Var.h0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        qe0 qe0Var = this.c;
        hz hzVar = qe0Var.h0;
        if (hzVar != null) {
            hzVar.postRunnable(new dz(hzVar, i9, i10, 1));
            qe0Var.h0.e(false, true, false);
            qe0Var.h0.postRunnable(new ib0(this, 6));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
