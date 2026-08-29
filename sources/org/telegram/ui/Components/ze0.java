package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ze0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ga b;
    public final /* synthetic */ ef0 c;

    public ze0(ef0 ef0Var, boolean z10, ga gaVar) {
        this.c = ef0Var;
        this.a = z10;
        this.b = gaVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        ef0 ef0Var = this.c;
        TextureView textureView = ef0Var.e0;
        if (ef0Var.h0 != null || surfaceTexture == null) {
            return;
        }
        qz qzVar = new qz(surfaceTexture, ef0Var.y0, ef0Var.D0, ef0Var.s0, this.a, this.b, i10, i11);
        ef0Var.h0 = qzVar;
        if (!this.a) {
            qzVar.i(ef0Var.F0, ef0Var.G0);
            qz qzVar2 = ef0Var.h0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            ma maVar = qzVar2.E;
            if (maVar != null) {
                Matrix matrix = maVar.v;
                transform.invert(matrix);
                float f9 = width;
                float f10 = height;
                matrix.preScale(f9, f10);
                matrix.postScale(1.0f / f9, 1.0f / f10);
                maVar.c(matrix);
                qzVar2.e(false, false, false);
            }
        }
        ef0Var.h0.f(ef0Var);
        qz qzVar3 = ef0Var.h0;
        qzVar3.getClass();
        qzVar3.postRunnable(new mz(qzVar3, i10, i11, 1));
        ef0Var.h0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ef0 ef0Var = this.c;
        qz qzVar = ef0Var.h0;
        if (qzVar == null) {
            return true;
        }
        qzVar.postRunnable(new nz(qzVar, 0));
        ef0Var.h0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        ef0 ef0Var = this.c;
        qz qzVar = ef0Var.h0;
        if (qzVar != null) {
            qzVar.postRunnable(new mz(qzVar, i10, i11, 1));
            ef0Var.h0.e(false, true, false);
            ef0Var.h0.postRunnable(new xb0(this, 6));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
