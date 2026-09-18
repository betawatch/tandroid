package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ef0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ha b;
    public final /* synthetic */ jf0 c;

    public ef0(jf0 jf0Var, boolean z10, ha haVar) {
        this.c = jf0Var;
        this.a = z10;
        this.b = haVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        jf0 jf0Var = this.c;
        TextureView textureView = jf0Var.i0;
        if (jf0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        vz vzVar = new vz(surfaceTexture, jf0Var.C0, jf0Var.H0, jf0Var.w0, this.a, this.b, i10, i11);
        jf0Var.l0 = vzVar;
        if (!this.a) {
            vzVar.i(jf0Var.J0, jf0Var.K0);
            vz vzVar2 = jf0Var.l0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            na naVar = vzVar2.I;
            if (naVar != null) {
                Matrix matrix = naVar.v;
                transform.invert(matrix);
                float f7 = width;
                float f10 = height;
                matrix.preScale(f7, f10);
                matrix.postScale(1.0f / f7, 1.0f / f10);
                naVar.c(matrix);
                vzVar2.e(false, false, false);
            }
        }
        jf0Var.l0.f(jf0Var);
        vz vzVar3 = jf0Var.l0;
        vzVar3.getClass();
        vzVar3.postRunnable(new rz(vzVar3, i10, i11, 1));
        jf0Var.l0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jf0 jf0Var = this.c;
        vz vzVar = jf0Var.l0;
        if (vzVar == null) {
            return true;
        }
        vzVar.postRunnable(new sz(vzVar, 0));
        jf0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        jf0 jf0Var = this.c;
        vz vzVar = jf0Var.l0;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            jf0Var.l0.e(false, true, false);
            jf0Var.l0.postRunnable(new bc0(this, 6));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
