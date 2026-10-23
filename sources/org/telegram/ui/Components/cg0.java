package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class cg0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ja b;
    public final /* synthetic */ hg0 c;

    public cg0(hg0 hg0Var, boolean z10, ja jaVar) {
        this.c = hg0Var;
        this.a = z10;
        this.b = jaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        hg0 hg0Var = this.c;
        TextureView textureView = hg0Var.i0;
        if (hg0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        e00 e00Var = new e00(surfaceTexture, hg0Var.C0, hg0Var.H0, hg0Var.w0, this.a, this.b, i10, i11);
        hg0Var.l0 = e00Var;
        if (!this.a) {
            e00Var.i(hg0Var.J0, hg0Var.K0);
            e00 e00Var2 = hg0Var.l0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            pa paVar = e00Var2.I;
            if (paVar != null) {
                Matrix matrix = paVar.v;
                transform.invert(matrix);
                float f7 = width;
                float f10 = height;
                matrix.preScale(f7, f10);
                matrix.postScale(1.0f / f7, 1.0f / f10);
                paVar.c(matrix);
                e00Var2.d(false, false, false);
            }
        }
        hg0Var.l0.f(hg0Var);
        e00 e00Var3 = hg0Var.l0;
        e00Var3.getClass();
        e00Var3.postRunnable(new a00(e00Var3, i10, i11, 1));
        hg0Var.l0.d(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        hg0 hg0Var = this.c;
        e00 e00Var = hg0Var.l0;
        if (e00Var == null) {
            return true;
        }
        e00Var.postRunnable(new b00(e00Var, 0));
        hg0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        hg0 hg0Var = this.c;
        e00 e00Var = hg0Var.l0;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            hg0Var.l0.d(false, true, false);
            hg0Var.l0.postRunnable(new yb0(this, 7));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
