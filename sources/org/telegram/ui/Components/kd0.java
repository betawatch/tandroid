package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class kd0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ x9 b;
    public final /* synthetic */ nd0 c;

    public kd0(nd0 nd0Var, boolean z10, x9 x9Var) {
        this.c = nd0Var;
        this.a = z10;
        this.b = x9Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        nd0 nd0Var = this.c;
        TextureView textureView = nd0Var.j0;
        if (nd0Var.m0 != null || surfaceTexture == null) {
            return;
        }
        py pyVar = new py(surfaceTexture, nd0Var.D0, nd0Var.I0, nd0Var.x0, this.a, this.b, i3, i10);
        nd0Var.m0 = pyVar;
        if (!this.a) {
            pyVar.h(nd0Var.K0, nd0Var.L0);
            py pyVar2 = nd0Var.m0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            ca caVar = pyVar2.J;
            if (caVar != null) {
                Matrix matrix = caVar.v;
                transform.invert(matrix);
                float f10 = width;
                float f11 = height;
                matrix.preScale(f10, f11);
                matrix.postScale(1.0f / f10, 1.0f / f11);
                caVar.c(matrix);
                pyVar2.c(false, false, false);
            }
        }
        nd0Var.m0.e(nd0Var);
        py pyVar3 = nd0Var.m0;
        pyVar3.getClass();
        pyVar3.postRunnable(new ly(pyVar3, i3, i10, 1));
        nd0Var.m0.c(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        nd0 nd0Var = this.c;
        py pyVar = nd0Var.m0;
        if (pyVar == null) {
            return true;
        }
        pyVar.postRunnable(new my(pyVar, 0));
        nd0Var.m0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        nd0 nd0Var = this.c;
        py pyVar = nd0Var.m0;
        if (pyVar != null) {
            pyVar.postRunnable(new ly(pyVar, i3, i10, 1));
            nd0Var.m0.c(false, true, false);
            nd0Var.m0.postRunnable(new jb0(this, 3));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
