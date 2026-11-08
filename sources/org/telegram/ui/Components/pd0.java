package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class pd0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ y9 b;
    public final /* synthetic */ sd0 c;

    public pd0(sd0 sd0Var, boolean z9, y9 y9Var) {
        this.c = sd0Var;
        this.a = z9;
        this.b = y9Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        sd0 sd0Var = this.c;
        TextureView textureView = sd0Var.i0;
        if (sd0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        sy syVar = new sy(surfaceTexture, sd0Var.C0, sd0Var.H0, sd0Var.w0, this.a, this.b, i7, i10);
        sd0Var.l0 = syVar;
        if (!this.a) {
            syVar.h(sd0Var.J0, sd0Var.K0);
            sy syVar2 = sd0Var.l0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            da daVar = syVar2.I;
            if (daVar != null) {
                Matrix matrix = daVar.v;
                transform.invert(matrix);
                float f10 = width;
                float f11 = height;
                matrix.preScale(f10, f11);
                matrix.postScale(1.0f / f10, 1.0f / f11);
                daVar.c(matrix);
                syVar2.c(false, false, false);
            }
        }
        sd0Var.l0.d(sd0Var);
        sy syVar3 = sd0Var.l0;
        syVar3.getClass();
        syVar3.postRunnable(new oy(syVar3, i7, i10, 1));
        sd0Var.l0.c(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        sd0 sd0Var = this.c;
        sy syVar = sd0Var.l0;
        if (syVar == null) {
            return true;
        }
        syVar.postRunnable(new py(syVar, 0));
        sd0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        sd0 sd0Var = this.c;
        sy syVar = sd0Var.l0;
        if (syVar != null) {
            syVar.postRunnable(new oy(syVar, i7, i10, 1));
            sd0Var.l0.c(false, true, false);
            sd0Var.l0.postRunnable(new ob0(this, 3));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
