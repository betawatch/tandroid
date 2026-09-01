package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class y61 extends TextureView implements TextureView.SurfaceTextureListener {
    public k71 a;
    public xz b;
    public final tk0 c;
    public int d;
    public int e;
    public qh.r6 f;
    public x61 h;
    public int n;
    public int r;
    public ba s;

    public y61(Context context, k71 k71Var) {
        super(context);
        this.c = new tk0();
        this.a = k71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        tk0 tk0Var = this.c;
        tk0Var.a = f10;
        tk0Var.b = f11;
        tk0Var.c = f12;
        tk0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        xz xzVar = this.b;
        if (xzVar == null || (haVar = xzVar.F) == null) {
            return null;
        }
        synchronized (haVar.n) {
            try {
                if (haVar.q) {
                    return haVar.p;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getVideoHeight() {
        return this.e;
    }

    public int getVideoWidth() {
        return this.d;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.b != null || surfaceTexture == null || this.a == null) {
            return;
        }
        xz xzVar = new xz(surfaceTexture, new hv(this, 28), this.f, this.s, i10, i11);
        this.b = xzVar;
        xzVar.i(this.n, this.r);
        xz xzVar2 = this.b;
        ba baVar = this.s;
        ha haVar = xzVar2.F;
        if (haVar != null) {
            ba baVar2 = haVar.t;
            if (baVar2 != null && baVar2.m != null) {
                baVar2.m = null;
            }
            haVar.t = baVar;
            if (baVar != null && baVar.m != haVar) {
                baVar.m = haVar;
                baVar.d();
            }
        }
        int i13 = this.d;
        if (i13 != 0 && (i12 = this.e) != 0) {
            xz xzVar3 = this.b;
            xzVar3.getClass();
            xzVar3.postRunnable(new tz(xzVar3, i13, i12, 0));
        }
        this.b.e(true, true, false);
        x61 x61Var = this.h;
        if (x61Var != null) {
            x61Var.b(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        xz xzVar = this.b;
        if (xzVar == null) {
            return true;
        }
        xzVar.postRunnable(new uz(xzVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        xz xzVar = this.b;
        if (xzVar != null) {
            xzVar.postRunnable(new tz(xzVar, i10, i11, 1));
            this.b.e(false, true, false);
            this.b.postRunnable(new oq0(this, 29));
        }
    }

    public void setDelegate(x61 x61Var) {
        this.h = x61Var;
        xz xzVar = this.b;
        if (xzVar != null) {
            if (x61Var == null) {
                xzVar.f(null);
            } else {
                x61Var.b(xzVar);
            }
        }
    }

    public void setHDRInfo(qh.r6 r6Var) {
        this.f = r6Var;
        xz xzVar = this.b;
        if (xzVar != null) {
            xzVar.postRunnable(new gm(19, xzVar, r6Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        xz xzVar = this.b;
        if (xzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = xzVar.F;
            if (haVar == null) {
                return;
            }
            Matrix matrix2 = haVar.v;
            matrix.invert(matrix2);
            float f10 = width;
            float f11 = height;
            matrix2.preScale(f10, f11);
            matrix2.postScale(1.0f / f10, 1.0f / f11);
            haVar.c(matrix2);
            xzVar.e(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
