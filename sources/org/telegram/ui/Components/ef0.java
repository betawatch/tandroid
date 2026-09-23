package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ef0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ja b;
    public final /* synthetic */ jf0 c;

    public ef0(jf0 jf0Var, boolean z10, ja jaVar) {
        this.c = jf0Var;
        this.a = z10;
        this.b = jaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        jf0 jf0Var = this.c;
        TextureView textureView = jf0Var.i0;
        if (jf0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        wz wzVar = new wz(surfaceTexture, jf0Var.C0, jf0Var.H0, jf0Var.w0, this.a, this.b, i10, i11);
        jf0Var.l0 = wzVar;
        if (!this.a) {
            wzVar.i(jf0Var.J0, jf0Var.K0);
            wz wzVar2 = jf0Var.l0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            pa paVar = wzVar2.I;
            if (paVar != null) {
                Matrix matrix = paVar.v;
                transform.invert(matrix);
                float f7 = width;
                float f10 = height;
                matrix.preScale(f7, f10);
                matrix.postScale(1.0f / f7, 1.0f / f10);
                paVar.c(matrix);
                wzVar2.e(false, false, false);
            }
        }
        jf0Var.l0.f(jf0Var);
        wz wzVar3 = jf0Var.l0;
        wzVar3.getClass();
        wzVar3.postRunnable(new sz(wzVar3, i10, i11, 1));
        jf0Var.l0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jf0 jf0Var = this.c;
        wz wzVar = jf0Var.l0;
        if (wzVar == null) {
            return true;
        }
        wzVar.postRunnable(new tz(wzVar, 0));
        jf0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        jf0 jf0Var = this.c;
        wz wzVar = jf0Var.l0;
        if (wzVar != null) {
            wzVar.postRunnable(new sz(wzVar, i10, i11, 1));
            jf0Var.l0.e(false, true, false);
            jf0Var.l0.postRunnable(new ac0(this, 6));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
