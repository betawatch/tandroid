package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class eg0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ la b;
    public final /* synthetic */ jg0 c;

    public eg0(jg0 jg0Var, boolean z10, la laVar) {
        this.c = jg0Var;
        this.a = z10;
        this.b = laVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        jg0 jg0Var = this.c;
        TextureView textureView = jg0Var.i0;
        if (jg0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        h00 h00Var = new h00(surfaceTexture, jg0Var.C0, jg0Var.H0, jg0Var.w0, this.a, this.b, i10, i11);
        jg0Var.l0 = h00Var;
        if (!this.a) {
            h00Var.i(jg0Var.J0, jg0Var.K0);
            h00 h00Var2 = jg0Var.l0;
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
        jg0Var.l0.f(jg0Var);
        h00 h00Var3 = jg0Var.l0;
        h00Var3.getClass();
        h00Var3.postRunnable(new d00(h00Var3, i10, i11, 1));
        jg0Var.l0.d(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jg0 jg0Var = this.c;
        h00 h00Var = jg0Var.l0;
        if (h00Var == null) {
            return true;
        }
        h00Var.postRunnable(new e00(h00Var, 0));
        jg0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        jg0 jg0Var = this.c;
        h00 h00Var = jg0Var.l0;
        if (h00Var != null) {
            h00Var.postRunnable(new d00(h00Var, i10, i11, 1));
            jg0Var.l0.d(false, true, false);
            jg0Var.l0.postRunnable(new yc0(this, 7));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
