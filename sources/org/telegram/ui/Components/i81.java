package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i81 extends TextureView implements TextureView.SurfaceTextureListener {
    public t81 a;
    public e00 b;
    public final il0 c;
    public int d;
    public int e;
    public fi.v7 f;
    public h81 h;
    public int n;
    public int r;
    public la s;

    public i81(Context context, t81 t81Var) {
        super(context);
        this.c = new il0();
        this.a = t81Var;
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
        e00 e00Var = this.b;
        if (e00Var == null || (raVar = e00Var.I) == null) {
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
        e00 e00Var = new e00(surfaceTexture, new tv(this, 29), this.f, this.s, i10, i11);
        this.b = e00Var;
        e00Var.i(this.n, this.r);
        e00 e00Var2 = this.b;
        la laVar = this.s;
        ra raVar = e00Var2.I;
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
            e00 e00Var3 = this.b;
            e00Var3.getClass();
            e00Var3.postRunnable(new a00(e00Var3, i13, i12, 0));
        }
        this.b.d(true, true, false);
        h81 h81Var = this.h;
        if (h81Var != null) {
            h81Var.d(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e00 e00Var = this.b;
        if (e00Var == null) {
            return true;
        }
        e00Var.postRunnable(new b00(e00Var, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e00 e00Var = this.b;
        if (e00Var != null) {
            e00Var.postRunnable(new a00(e00Var, i10, i11, 1));
            this.b.d(false, true, false);
            this.b.postRunnable(new t51(this, 5));
        }
    }

    public void setDelegate(h81 h81Var) {
        this.h = h81Var;
        e00 e00Var = this.b;
        if (e00Var != null) {
            if (h81Var == null) {
                e00Var.f(null);
            } else {
                h81Var.d(e00Var);
            }
        }
    }

    public void setHDRInfo(fi.v7 v7Var) {
        this.f = v7Var;
        e00 e00Var = this.b;
        if (e00Var != null) {
            e00Var.postRunnable(new so(19, e00Var, v7Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        e00 e00Var = this.b;
        if (e00Var != null) {
            int width = getWidth();
            int height = getHeight();
            ra raVar = e00Var.I;
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
            e00Var.d(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
