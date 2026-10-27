package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ag0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ la b;
    public final /* synthetic */ fg0 c;

    public ag0(fg0 fg0Var, boolean z10, la laVar) {
        this.c = fg0Var;
        this.a = z10;
        this.b = laVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        fg0 fg0Var = this.c;
        TextureView textureView = fg0Var.i0;
        if (fg0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        e00 e00Var = new e00(surfaceTexture, fg0Var.C0, fg0Var.H0, fg0Var.w0, this.a, this.b, i10, i11);
        fg0Var.l0 = e00Var;
        if (!this.a) {
            e00Var.i(fg0Var.J0, fg0Var.K0);
            e00 e00Var2 = fg0Var.l0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            ra raVar = e00Var2.I;
            if (raVar != null) {
                Matrix matrix = raVar.v;
                transform.invert(matrix);
                float f7 = width;
                float f10 = height;
                matrix.preScale(f7, f10);
                matrix.postScale(1.0f / f7, 1.0f / f10);
                raVar.c(matrix);
                e00Var2.d(false, false, false);
            }
        }
        fg0Var.l0.f(fg0Var);
        e00 e00Var3 = fg0Var.l0;
        e00Var3.getClass();
        e00Var3.postRunnable(new a00(e00Var3, i10, i11, 1));
        fg0Var.l0.d(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        fg0 fg0Var = this.c;
        e00 e00Var = fg0Var.l0;
        if (e00Var == null) {
            return true;
        }
        e00Var.postRunnable(new b00(e00Var, 0));
        fg0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        fg0 fg0Var = this.c;
        e00 e00Var = fg0Var.l0;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            fg0Var.l0.d(false, true, false);
            fg0Var.l0.postRunnable(new xa0(this, 8));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
