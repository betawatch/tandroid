package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class qf0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ka b;
    public final /* synthetic */ vf0 c;

    public qf0(vf0 vf0Var, boolean z10, ka kaVar) {
        this.c = vf0Var;
        this.a = z10;
        this.b = kaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        vf0 vf0Var = this.c;
        TextureView textureView = vf0Var.i0;
        if (vf0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        yz yzVar = new yz(surfaceTexture, vf0Var.C0, vf0Var.H0, vf0Var.w0, this.a, this.b, i10, i11);
        vf0Var.l0 = yzVar;
        if (!this.a) {
            yzVar.i(vf0Var.J0, vf0Var.K0);
            yz yzVar2 = vf0Var.l0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            qa qaVar = yzVar2.I;
            if (qaVar != null) {
                Matrix matrix = qaVar.v;
                transform.invert(matrix);
                float f7 = width;
                float f10 = height;
                matrix.preScale(f7, f10);
                matrix.postScale(1.0f / f7, 1.0f / f10);
                qaVar.c(matrix);
                yzVar2.e(false, false, false);
            }
        }
        vf0Var.l0.f(vf0Var);
        yz yzVar3 = vf0Var.l0;
        yzVar3.getClass();
        yzVar3.postRunnable(new uz(yzVar3, i10, i11, 1));
        vf0Var.l0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vf0 vf0Var = this.c;
        yz yzVar = vf0Var.l0;
        if (yzVar == null) {
            return true;
        }
        yzVar.postRunnable(new vz(yzVar, 0));
        vf0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vf0 vf0Var = this.c;
        yz yzVar = vf0Var.l0;
        if (yzVar != null) {
            yzVar.postRunnable(new uz(yzVar, i10, i11, 1));
            vf0Var.l0.e(false, true, false);
            vf0Var.l0.postRunnable(new lc0(this, 7));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
