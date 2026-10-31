package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class le0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ s9 b;
    public final /* synthetic */ oe0 c;

    public le0(oe0 oe0Var, boolean z10, s9 s9Var) {
        this.c = oe0Var;
        this.a = z10;
        this.b = s9Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        oe0 oe0Var = this.c;
        TextureView textureView = oe0Var.i0;
        if (oe0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        gz gzVar = new gz(surfaceTexture, oe0Var.C0, oe0Var.H0, oe0Var.w0, this.a, this.b, i10, i11);
        oe0Var.l0 = gzVar;
        if (!this.a) {
            gzVar.h(oe0Var.J0, oe0Var.K0);
            gz gzVar2 = oe0Var.l0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            x9 x9Var = gzVar2.I;
            if (x9Var != null) {
                Matrix matrix = x9Var.v;
                transform.invert(matrix);
                float f7 = width;
                float f10 = height;
                matrix.preScale(f7, f10);
                matrix.postScale(1.0f / f7, 1.0f / f10);
                x9Var.c(matrix);
                gzVar2.c(false, false, false);
            }
        }
        oe0Var.l0.d(oe0Var);
        gz gzVar3 = oe0Var.l0;
        gzVar3.getClass();
        gzVar3.postRunnable(new cz(gzVar3, i10, i11, 1));
        oe0Var.l0.c(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        oe0 oe0Var = this.c;
        gz gzVar = oe0Var.l0;
        if (gzVar == null) {
            return true;
        }
        gzVar.postRunnable(new dz(gzVar, 0));
        oe0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        oe0 oe0Var = this.c;
        gz gzVar = oe0Var.l0;
        if (gzVar != null) {
            gzVar.postRunnable(new cz(gzVar, i10, i11, 1));
            oe0Var.l0.c(false, true, false);
            oe0Var.l0.postRunnable(new eb0(this, 6));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
