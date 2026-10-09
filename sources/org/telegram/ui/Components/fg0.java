package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class fg0 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ma b;
    public final /* synthetic */ kg0 c;

    public fg0(kg0 kg0Var, boolean z10, ma maVar) {
        this.c = kg0Var;
        this.a = z10;
        this.b = maVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        kg0 kg0Var = this.c;
        TextureView textureView = kg0Var.i0;
        if (kg0Var.l0 != null || surfaceTexture == null) {
            return;
        }
        l00 l00Var = new l00(surfaceTexture, kg0Var.C0, kg0Var.H0, kg0Var.w0, this.a, this.b, i10, i11);
        kg0Var.l0 = l00Var;
        if (!this.a) {
            l00Var.i(kg0Var.J0, kg0Var.K0);
            l00 l00Var2 = kg0Var.l0;
            Matrix transform = textureView.getTransform(null);
            int width = textureView.getWidth();
            int height = textureView.getHeight();
            sa saVar = l00Var2.I;
            if (saVar != null) {
                Matrix matrix = saVar.v;
                transform.invert(matrix);
                float f7 = width;
                float f10 = height;
                matrix.preScale(f7, f10);
                matrix.postScale(1.0f / f7, 1.0f / f10);
                saVar.c(matrix);
                l00Var2.e(false, false, false);
            }
        }
        kg0Var.l0.f(kg0Var);
        l00 l00Var3 = kg0Var.l0;
        l00Var3.getClass();
        l00Var3.postRunnable(new h00(l00Var3, i10, i11, 1));
        kg0Var.l0.e(true, true, false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        kg0 kg0Var = this.c;
        l00 l00Var = kg0Var.l0;
        if (l00Var == null) {
            return true;
        }
        l00Var.postRunnable(new i00(l00Var, 0));
        kg0Var.l0 = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        kg0 kg0Var = this.c;
        l00 l00Var = kg0Var.l0;
        if (l00Var != null) {
            l00Var.postRunnable(new h00(l00Var, i10, i11, 1));
            kg0Var.l0.e(false, true, false);
            kg0Var.l0.postRunnable(new bd0(this, 6));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
