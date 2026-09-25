package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class of0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ja b;
    public final /* synthetic */ tf0 c;

    public of0(tf0 tf0Var, boolean z10, ja jaVar) {
        this.c = tf0Var;
        this.a = z10;
        this.b = jaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        tf0 tf0Var = this.c;
        TextureView textureView = tf0Var.i0;
        if (tf0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        wz wzVar = new wz(surfaceTexture, tf0Var.C0, tf0Var.H0, tf0Var.w0, this.a, this.b, i10, i11);
        tf0Var.l0 = wzVar;
        if (!this.a) {
            wzVar.i(tf0Var.J0, tf0Var.K0);
            wz wzVar2 = tf0Var.l0;
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
        tf0Var.l0.f(tf0Var);
        wz wzVar3 = tf0Var.l0;
        wzVar3.getClass();
        wzVar3.postRunnable(new sz(wzVar3, i10, i11, 1));
        tf0Var.l0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        tf0 tf0Var = this.c;
        wz wzVar = tf0Var.l0;
        if (wzVar == null) {
            return true;
        }
        wzVar.postRunnable(new tz(wzVar, 0));
        tf0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        tf0 tf0Var = this.c;
        wz wzVar = tf0Var.l0;
        if (wzVar != null) {
            wzVar.postRunnable(new sz(wzVar, i10, i11, 1));
            tf0Var.l0.e(false, true, false);
            tf0Var.l0.postRunnable(new ic0(this, 7));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
