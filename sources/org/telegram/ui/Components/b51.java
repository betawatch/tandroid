package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b51 extends TextureView implements TextureView.SurfaceTextureListener {
    public m51 a;
    public py b;
    public final ni0 c;
    public int d;
    public int e;
    public gi.e7 f;
    public a51 h;
    public int n;
    public int r;
    public x9 s;

    public b51(Context context, m51 m51Var) {
        super(context);
        this.c = new ni0();
        this.a = m51Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        ni0 ni0Var = this.c;
        ni0Var.a = f10;
        ni0Var.b = f11;
        ni0Var.c = f12;
        ni0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ca caVar;
        py pyVar = this.b;
        if (pyVar == null || (caVar = pyVar.J) == null) {
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
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i3, int i10) {
        int i11;
        if (this.b != null || surfaceTexture == null || this.a == null) {
            return;
        }
        py pyVar = new py(surfaceTexture, new zw(this, 26), this.f, this.s, i3, i10);
        this.b = pyVar;
        pyVar.h(this.n, this.r);
        py pyVar2 = this.b;
        x9 x9Var = this.s;
        ca caVar = pyVar2.J;
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
            py pyVar3 = this.b;
            pyVar3.getClass();
            pyVar3.postRunnable(new ly(pyVar3, i12, i11, 0));
        }
        this.b.c(true, true, false);
        a51 a51Var = this.h;
        if (a51Var != null) {
            a51Var.a(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        py pyVar = this.b;
        if (pyVar == null) {
            return true;
        }
        pyVar.postRunnable(new my(pyVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i3, int i10) {
        py pyVar = this.b;
        if (pyVar != null) {
            pyVar.postRunnable(new ly(pyVar, i3, i10, 1));
            this.b.c(false, true, false);
            this.b.postRunnable(new sp0(this, 29));
        }
    }

    public void setDelegate(a51 a51Var) {
        this.h = a51Var;
        py pyVar = this.b;
        if (pyVar != null) {
            if (a51Var == null) {
                pyVar.e(null);
            } else {
                a51Var.a(pyVar);
            }
        }
    }

    public void setHDRInfo(gi.e7 e7Var) {
        this.f = e7Var;
        py pyVar = this.b;
        if (pyVar != null) {
            pyVar.postRunnable(new cl(21, pyVar, e7Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        py pyVar = this.b;
        if (pyVar != null) {
            int width = getWidth();
            int height = getHeight();
            ca caVar = pyVar.J;
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
            pyVar.c(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
