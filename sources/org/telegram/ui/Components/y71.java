package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class y71 extends TextureView implements TextureView.SurfaceTextureListener {
    public i81 a;
    public h00 b;
    public final il0 c;
    public int d;
    public int e;
    public di.j8 f;
    public x71 h;
    public int n;
    public int r;
    public la s;

    public y71(Context context, i81 i81Var) {
        super(context);
        this.c = new il0();
        this.a = i81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        il0 il0Var = this.c;
        il0Var.a = f7;
        il0Var.b = f10;
        il0Var.c = f11;
        il0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        ra raVar;
        h00 h00Var = this.b;
        if (h00Var == null || (raVar = h00Var.I) == null) {
            return null;
        }
        synchronized (raVar.n) {
            try {
                if (raVar.q) {
                    return raVar.p;
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
        h00 h00Var = new h00(surfaceTexture, new xv(this, 29), this.f, this.s, i10, i11);
        this.b = h00Var;
        h00Var.i(this.n, this.r);
        h00 h00Var2 = this.b;
        la laVar = this.s;
        ra raVar = h00Var2.I;
        if (raVar != null) {
            la laVar2 = raVar.t;
            if (laVar2 != null && laVar2.m != null) {
                laVar2.m = null;
            }
            raVar.t = laVar;
            if (laVar != null && laVar.m != raVar) {
                laVar.m = raVar;
                laVar.d();
            }
        }
        int i13 = this.d;
        if (i13 != 0 && (i12 = this.e) != 0) {
            h00 h00Var3 = this.b;
            h00Var3.getClass();
            h00Var3.postRunnable(new d00(h00Var3, i13, i12, 0));
        }
        this.b.d(true, true, false);
        x71 x71Var = this.h;
        if (x71Var != null) {
            x71Var.c(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        h00 h00Var = this.b;
        if (h00Var == null) {
            return true;
        }
        h00Var.postRunnable(new e00(h00Var, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        h00 h00Var = this.b;
        if (h00Var != null) {
            h00Var.postRunnable(new d00(h00Var, i10, i11, 1));
            this.b.d(false, true, false);
            this.b.postRunnable(new w71(this, 0));
        }
    }

    public void setDelegate(x71 x71Var) {
        this.h = x71Var;
        h00 h00Var = this.b;
        if (h00Var != null) {
            if (x71Var == null) {
                h00Var.f(null);
            } else {
                x71Var.c(h00Var);
            }
        }
    }

    public void setHDRInfo(di.j8 j8Var) {
        this.f = j8Var;
        h00 h00Var = this.b;
        if (h00Var != null) {
            h00Var.postRunnable(new vm(20, h00Var, j8Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        h00 h00Var = this.b;
        if (h00Var != null) {
            int width = getWidth();
            int height = getHeight();
            ra raVar = h00Var.I;
            if (raVar == null) {
                return;
            }
            Matrix matrix2 = raVar.v;
            matrix.invert(matrix2);
            float f7 = width;
            float f10 = height;
            matrix2.preScale(f7, f10);
            matrix2.postScale(1.0f / f7, 1.0f / f10);
            raVar.c(matrix2);
            h00Var.d(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
