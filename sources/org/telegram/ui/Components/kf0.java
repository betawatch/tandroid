package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kf0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ba b;
    public final /* synthetic */ pf0 c;

    public kf0(pf0 pf0Var, boolean z4, ba baVar) {
        this.c = pf0Var;
        this.a = z4;
        this.b = baVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        pf0 pf0Var = this.c;
        TextureView textureView = pf0Var.f0;
        if (pf0Var.i0 != null || surfaceTexture == null) {
            return;
        }
        xz xzVar = new xz(surfaceTexture, pf0Var.z0, pf0Var.E0, pf0Var.t0, this.a, this.b, i10, i11);
        pf0Var.i0 = xzVar;
        if (!this.a) {
            xzVar.i(pf0Var.G0, pf0Var.H0);
            xz xzVar2 = pf0Var.i0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            ha haVar = xzVar2.F;
            if (haVar != null) {
                Matrix matrix = haVar.v;
                transform.invert(matrix);
                float f10 = width;
                float f11 = height;
                matrix.preScale(f10, f11);
                matrix.postScale(1.0f / f10, 1.0f / f11);
                haVar.c(matrix);
                xzVar2.e(false, false, false);
            }
        }
        pf0Var.i0.f(pf0Var);
        xz xzVar3 = pf0Var.i0;
        xzVar3.getClass();
        xzVar3.postRunnable(new tz(xzVar3, i10, i11, 1));
        pf0Var.i0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        pf0 pf0Var = this.c;
        xz xzVar = pf0Var.i0;
        if (xzVar == null) {
            return true;
        }
        xzVar.postRunnable(new uz(xzVar, 0));
        pf0Var.i0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        pf0 pf0Var = this.c;
        xz xzVar = pf0Var.i0;
        if (xzVar != null) {
            xzVar.postRunnable(new tz(xzVar, i10, i11, 1));
            pf0Var.i0.e(false, true, false);
            pf0Var.i0.postRunnable(new ec0(this, 6));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
