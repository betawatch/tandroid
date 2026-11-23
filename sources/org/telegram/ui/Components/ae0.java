package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ae0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ba b;
    public final /* synthetic */ de0 c;

    public ae0(de0 de0Var, boolean z10, ba baVar) {
        this.c = de0Var;
        this.a = z10;
        this.b = baVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        de0 de0Var = this.c;
        TextureView textureView = de0Var.j0;
        if (de0Var.m0 != null || surfaceTexture == null) {
            return;
        }
        bz bzVar = new bz(surfaceTexture, de0Var.D0, de0Var.I0, de0Var.x0, this.a, this.b, i7, i10);
        de0Var.m0 = bzVar;
        if (!this.a) {
            bzVar.h(de0Var.K0, de0Var.L0);
            bz bzVar2 = de0Var.m0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            ga gaVar = bzVar2.J;
            if (gaVar != null) {
                Matrix matrix = gaVar.v;
                transform.invert(matrix);
                float f10 = width;
                float f11 = height;
                matrix.preScale(f10, f11);
                matrix.postScale(1.0f / f10, 1.0f / f11);
                gaVar.c(matrix);
                bzVar2.c(false, false, false);
            }
        }
        de0Var.m0.d(de0Var);
        bz bzVar3 = de0Var.m0;
        bzVar3.getClass();
        bzVar3.postRunnable(new xy(bzVar3, i7, i10, 1));
        de0Var.m0.c(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        de0 de0Var = this.c;
        bz bzVar = de0Var.m0;
        if (bzVar == null) {
            return true;
        }
        bzVar.postRunnable(new yy(bzVar, 0));
        de0Var.m0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        de0 de0Var = this.c;
        bz bzVar = de0Var.m0;
        if (bzVar != null) {
            bzVar.postRunnable(new xy(bzVar, i7, i10, 1));
            de0Var.m0.c(false, true, false);
            de0Var.m0.postRunnable(new eb0(this, 5));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
