package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qe0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ z9 b;
    public final /* synthetic */ ve0 c;

    public qe0(ve0 ve0Var, boolean z10, z9 z9Var) {
        this.c = ve0Var;
        this.a = z10;
        this.b = z9Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        ve0 ve0Var = this.c;
        TextureView textureView = ve0Var.e0;
        if (ve0Var.h0 != null || surfaceTexture == null) {
            return;
        }
        jz jzVar = new jz(surfaceTexture, ve0Var.y0, ve0Var.D0, ve0Var.s0, this.a, this.b, i10, i11);
        ve0Var.h0 = jzVar;
        if (!this.a) {
            jzVar.i(ve0Var.F0, ve0Var.G0);
            jz jzVar2 = ve0Var.h0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            fa faVar = jzVar2.E;
            if (faVar != null) {
                Matrix matrix = faVar.v;
                transform.invert(matrix);
                float f10 = width;
                float f11 = height;
                matrix.preScale(f10, f11);
                matrix.postScale(1.0f / f10, 1.0f / f11);
                faVar.c(matrix);
                jzVar2.e(false, false, false);
            }
        }
        ve0Var.h0.f(ve0Var);
        jz jzVar3 = ve0Var.h0;
        jzVar3.getClass();
        jzVar3.postRunnable(new fz(jzVar3, i10, i11, 1));
        ve0Var.h0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ve0 ve0Var = this.c;
        jz jzVar = ve0Var.h0;
        if (jzVar == null) {
            return true;
        }
        jzVar.postRunnable(new gz(jzVar, 0));
        ve0Var.h0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        ve0 ve0Var = this.c;
        jz jzVar = ve0Var.h0;
        if (jzVar != null) {
            jzVar.postRunnable(new fz(jzVar, i10, i11, 1));
            ve0Var.h0.e(false, true, false);
            ve0Var.h0.postRunnable(new mb0(this, 6));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
