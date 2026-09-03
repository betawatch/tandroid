package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jf0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ba b;
    public final /* synthetic */ of0 c;

    public jf0(of0 of0Var, boolean z4, ba baVar) {
        this.c = of0Var;
        this.a = z4;
        this.b = baVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        of0 of0Var = this.c;
        TextureView textureView = of0Var.f0;
        if (of0Var.i0 != null || surfaceTexture == null) {
            return;
        }
        vz vzVar = new vz(surfaceTexture, of0Var.z0, of0Var.E0, of0Var.t0, this.a, this.b, i10, i11);
        of0Var.i0 = vzVar;
        if (!this.a) {
            vzVar.i(of0Var.G0, of0Var.H0);
            vz vzVar2 = of0Var.i0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            ha haVar = vzVar2.F;
            if (haVar != null) {
                Matrix matrix = haVar.v;
                transform.invert(matrix);
                float f10 = width;
                float f11 = height;
                matrix.preScale(f10, f11);
                matrix.postScale(1.0f / f10, 1.0f / f11);
                haVar.c(matrix);
                vzVar2.e(false, false, false);
            }
        }
        of0Var.i0.f(of0Var);
        vz vzVar3 = of0Var.i0;
        vzVar3.getClass();
        vzVar3.postRunnable(new rz(vzVar3, i10, i11, 1));
        of0Var.i0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        of0 of0Var = this.c;
        vz vzVar = of0Var.i0;
        if (vzVar == null) {
            return true;
        }
        vzVar.postRunnable(new sz(vzVar, 0));
        of0Var.i0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        of0 of0Var = this.c;
        vz vzVar = of0Var.i0;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            of0Var.i0.e(false, true, false);
            of0Var.i0.postRunnable(new dc0(this, 6));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
