package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zf0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ la b;
    public final /* synthetic */ eg0 c;

    public zf0(eg0 eg0Var, boolean z10, la laVar) {
        this.c = eg0Var;
        this.a = z10;
        this.b = laVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        eg0 eg0Var = this.c;
        TextureView textureView = eg0Var.i0;
        if (eg0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        e00 e00Var = new e00(surfaceTexture, eg0Var.C0, eg0Var.H0, eg0Var.w0, this.a, this.b, i10, i11);
        eg0Var.l0 = e00Var;
        if (!this.a) {
            e00Var.i(eg0Var.J0, eg0Var.K0);
            e00 e00Var2 = eg0Var.l0;
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
        eg0Var.l0.f(eg0Var);
        e00 e00Var3 = eg0Var.l0;
        e00Var3.getClass();
        e00Var3.postRunnable(new a00(e00Var3, i10, i11, 1));
        eg0Var.l0.d(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        eg0 eg0Var = this.c;
        e00 e00Var = eg0Var.l0;
        if (e00Var == null) {
            return true;
        }
        e00Var.postRunnable(new b00(e00Var, 0));
        eg0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        eg0 eg0Var = this.c;
        e00 e00Var = eg0Var.l0;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            eg0Var.l0.d(false, true, false);
            eg0Var.l0.postRunnable(new wa0(this, 8));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
