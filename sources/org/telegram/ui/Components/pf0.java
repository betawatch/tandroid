package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class pf0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ia b;
    public final /* synthetic */ uf0 c;

    public pf0(uf0 uf0Var, boolean z10, ia iaVar) {
        this.c = uf0Var;
        this.a = z10;
        this.b = iaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        uf0 uf0Var = this.c;
        TextureView textureView = uf0Var.i0;
        if (uf0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        vz vzVar = new vz(surfaceTexture, uf0Var.C0, uf0Var.H0, uf0Var.w0, this.a, this.b, i10, i11);
        uf0Var.l0 = vzVar;
        if (!this.a) {
            vzVar.i(uf0Var.J0, uf0Var.K0);
            vz vzVar2 = uf0Var.l0;
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
        uf0Var.l0.f(uf0Var);
        vz vzVar3 = uf0Var.l0;
        vzVar3.getClass();
        vzVar3.postRunnable(new rz(vzVar3, i10, i11, 1));
        uf0Var.l0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        uf0 uf0Var = this.c;
        vz vzVar = uf0Var.l0;
        if (vzVar == null) {
            return true;
        }
        vzVar.postRunnable(new sz(vzVar, 0));
        uf0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        uf0 uf0Var = this.c;
        vz vzVar = uf0Var.l0;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            uf0Var.l0.e(false, true, false);
            uf0Var.l0.postRunnable(new jc0(this, 7));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
