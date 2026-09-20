package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class mf0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ia b;
    public final /* synthetic */ rf0 c;

    public mf0(rf0 rf0Var, boolean z10, ia iaVar) {
        this.c = rf0Var;
        this.a = z10;
        this.b = iaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        rf0 rf0Var = this.c;
        TextureView textureView = rf0Var.i0;
        if (rf0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        vz vzVar = new vz(surfaceTexture, rf0Var.C0, rf0Var.H0, rf0Var.w0, this.a, this.b, i10, i11);
        rf0Var.l0 = vzVar;
        if (!this.a) {
            vzVar.i(rf0Var.J0, rf0Var.K0);
            vz vzVar2 = rf0Var.l0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            oa oaVar = vzVar2.I;
            if (oaVar != null) {
                Matrix matrix = oaVar.v;
                transform.invert(matrix);
                float f7 = width;
                float f10 = height;
                matrix.preScale(f7, f10);
                matrix.postScale(1.0f / f7, 1.0f / f10);
                oaVar.c(matrix);
                vzVar2.e(false, false, false);
            }
        }
        rf0Var.l0.f(rf0Var);
        vz vzVar3 = rf0Var.l0;
        vzVar3.getClass();
        vzVar3.postRunnable(new rz(vzVar3, i10, i11, 1));
        rf0Var.l0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        rf0 rf0Var = this.c;
        vz vzVar = rf0Var.l0;
        if (vzVar == null) {
            return true;
        }
        vzVar.postRunnable(new sz(vzVar, 0));
        rf0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        rf0 rf0Var = this.c;
        vz vzVar = rf0Var.l0;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            rf0Var.l0.e(false, true, false);
            rf0Var.l0.postRunnable(new jc0(this, 6));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
