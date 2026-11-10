package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i51 extends TextureView implements TextureView.SurfaceTextureListener {
    public t51 a;
    public ry b;
    public final ki0 c;
    public int d;
    public int e;
    public fi.d7 f;
    public h51 h;
    public int n;
    public int r;
    public x9 s;

    public i51(Context context, t51 t51Var) {
        super(context);
        this.c = new ki0();
        this.a = t51Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        ki0 ki0Var = this.c;
        ki0Var.a = f10;
        ki0Var.b = f11;
        ki0Var.c = f12;
        ki0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ca caVar;
        ry ryVar = this.b;
        if (ryVar == null || (caVar = ryVar.I) == null) {
            return null;
        }
        synchronized (caVar.n) {
            try {
                if (caVar.q) {
                    return caVar.p;
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
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        int i11;
        if (this.b != null || surfaceTexture == null || this.a == null) {
            return;
        }
        ry ryVar = new ry(surfaceTexture, new ax(this, 26), this.f, this.s, i7, i10);
        this.b = ryVar;
        ryVar.h(this.n, this.r);
        ry ryVar2 = this.b;
        x9 x9Var = this.s;
        ca caVar = ryVar2.I;
        if (caVar != null) {
            x9 x9Var2 = caVar.t;
            if (x9Var2 != null && x9Var2.m != null) {
                x9Var2.m = null;
            }
            caVar.t = x9Var;
            if (x9Var != null && x9Var.m != caVar) {
                x9Var.m = caVar;
                x9Var.d();
            }
        }
        int i12 = this.d;
        if (i12 != 0 && (i11 = this.e) != 0) {
            ry ryVar3 = this.b;
            ryVar3.getClass();
            ryVar3.postRunnable(new ny(ryVar3, i12, i11, 0));
        }
        this.b.c(true, true, false);
        h51 h51Var = this.h;
        if (h51Var != null) {
            h51Var.a(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ry ryVar = this.b;
        if (ryVar == null) {
            return true;
        }
        ryVar.postRunnable(new oy(ryVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.postRunnable(new ny(ryVar, i7, i10, 1));
            this.b.c(false, true, false);
            this.b.postRunnable(new jr0(this, 28));
        }
    }

    public void setDelegate(h51 h51Var) {
        this.h = h51Var;
        ry ryVar = this.b;
        if (ryVar != null) {
            if (h51Var == null) {
                ryVar.d(null);
            } else {
                h51Var.a(ryVar);
            }
        }
    }

    public void setHDRInfo(fi.d7 d7Var) {
        this.f = d7Var;
        ry ryVar = this.b;
        if (ryVar != null) {
            ryVar.postRunnable(new ro(17, ryVar, d7Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        ry ryVar = this.b;
        if (ryVar != null) {
            int width = getWidth();
            int height = getHeight();
            ca caVar = ryVar.I;
            if (caVar == null) {
                return;
            }
            Matrix matrix2 = caVar.v;
            matrix.invert(matrix2);
            float f10 = width;
            float f11 = height;
            matrix2.preScale(f10, f11);
            matrix2.postScale(1.0f / f10, 1.0f / f11);
            caVar.c(matrix2);
            ryVar.c(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
