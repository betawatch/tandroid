package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class qd0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ y9 b;
    public final /* synthetic */ td0 c;

    public qd0(td0 td0Var, boolean z9, y9 y9Var) {
        this.c = td0Var;
        this.a = z9;
        this.b = y9Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        td0 td0Var = this.c;
        TextureView textureView = td0Var.i0;
        if (td0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        sy syVar = new sy(surfaceTexture, td0Var.C0, td0Var.H0, td0Var.w0, this.a, this.b, i7, i10);
        td0Var.l0 = syVar;
        if (!this.a) {
            syVar.h(td0Var.J0, td0Var.K0);
            sy syVar2 = td0Var.l0;
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
        td0Var.l0.d(td0Var);
        sy syVar3 = td0Var.l0;
        syVar3.getClass();
        syVar3.postRunnable(new oy(syVar3, i7, i10, 1));
        td0Var.l0.c(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        td0 td0Var = this.c;
        sy syVar = td0Var.l0;
        if (syVar == null) {
            return true;
        }
        syVar.postRunnable(new py(syVar, 0));
        td0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        td0 td0Var = this.c;
        sy syVar = td0Var.l0;
        if (syVar != null) {
            syVar.postRunnable(new oy(syVar, i7, i10, 1));
            td0Var.l0.c(false, true, false);
            td0Var.l0.postRunnable(new pb0(this, 3));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
