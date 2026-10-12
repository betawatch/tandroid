package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class dg0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ la b;
    public final /* synthetic */ ig0 c;

    public dg0(ig0 ig0Var, boolean z10, la laVar) {
        this.c = ig0Var;
        this.a = z10;
        this.b = laVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        ig0 ig0Var = this.c;
        TextureView textureView = ig0Var.i0;
        if (ig0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        h00 h00Var = new h00(surfaceTexture, ig0Var.C0, ig0Var.H0, ig0Var.w0, this.a, this.b, i10, i11);
        ig0Var.l0 = h00Var;
        if (!this.a) {
            h00Var.i(ig0Var.J0, ig0Var.K0);
            h00 h00Var2 = ig0Var.l0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            ra raVar = h00Var2.I;
            if (raVar != null) {
                Matrix matrix = raVar.v;
                transform.invert(matrix);
                float f7 = width;
                float f10 = height;
                matrix.preScale(f7, f10);
                matrix.postScale(1.0f / f7, 1.0f / f10);
                raVar.c(matrix);
                h00Var2.d(false, false, false);
            }
        }
        ig0Var.l0.f(ig0Var);
        h00 h00Var3 = ig0Var.l0;
        h00Var3.getClass();
        h00Var3.postRunnable(new d00(h00Var3, i10, i11, 1));
        ig0Var.l0.d(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ig0 ig0Var = this.c;
        h00 h00Var = ig0Var.l0;
        if (h00Var == null) {
            return true;
        }
        h00Var.postRunnable(new e00(h00Var, 0));
        ig0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        ig0 ig0Var = this.c;
        h00 h00Var = ig0Var.l0;
        if (h00Var != null) {
            h00Var.postRunnable(new d00(h00Var, i10, i11, 1));
            ig0Var.l0.d(false, true, false);
            ig0Var.l0.postRunnable(new yc0(this, 7));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
