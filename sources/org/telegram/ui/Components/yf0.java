package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class yf0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ja b;
    public final /* synthetic */ dg0 c;

    public yf0(dg0 dg0Var, boolean z10, ja jaVar) {
        this.c = dg0Var;
        this.a = z10;
        this.b = jaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        dg0 dg0Var = this.c;
        TextureView textureView = dg0Var.i0;
        if (dg0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        e00 e00Var = new e00(surfaceTexture, dg0Var.C0, dg0Var.H0, dg0Var.w0, this.a, this.b, i10, i11);
        dg0Var.l0 = e00Var;
        if (!this.a) {
            e00Var.i(dg0Var.J0, dg0Var.K0);
            e00 e00Var2 = dg0Var.l0;
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
        dg0Var.l0.f(dg0Var);
        e00 e00Var3 = dg0Var.l0;
        e00Var3.getClass();
        e00Var3.postRunnable(new a00(e00Var3, i10, i11, 1));
        dg0Var.l0.d(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        dg0 dg0Var = this.c;
        e00 e00Var = dg0Var.l0;
        if (e00Var == null) {
            return true;
        }
        e00Var.postRunnable(new b00(e00Var, 0));
        dg0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        dg0 dg0Var = this.c;
        e00 e00Var = dg0Var.l0;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            dg0Var.l0.d(false, true, false);
            dg0Var.l0.postRunnable(new rc0(this, 6));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
