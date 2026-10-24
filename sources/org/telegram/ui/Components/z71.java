package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class z71 extends TextureView implements TextureView.SurfaceTextureListener {
    public j81 a;
    public e00 b;
    public final il0 c;
    public int d;
    public int e;
    public ei.z7 f;
    public y71 h;
    public int n;
    public int r;
    public ja s;

    public z71(Context context, j81 j81Var) {
        super(context);
        this.c = new il0();
        this.a = j81Var;
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
        pa paVar;
        e00 e00Var = this.b;
        if (e00Var == null || (paVar = e00Var.I) == null) {
            return null;
        }
        synchronized (paVar.n) {
            try {
                if (paVar.q) {
                    return paVar.p;
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
        ja jaVar = this.s;
        pa paVar = e00Var2.I;
        if (paVar != null) {
            ja jaVar2 = paVar.t;
            if (jaVar2 != null && jaVar2.m != null) {
                jaVar2.m = null;
            }
            paVar.t = jaVar;
            if (jaVar != null && jaVar.m != paVar) {
                jaVar.m = paVar;
                jaVar.d();
            }
        }
        int i13 = this.d;
        if (i13 != 0 && (i12 = this.e) != 0) {
            e00 e00Var3 = this.b;
            e00Var3.getClass();
            e00Var3.postRunnable(new a00(e00Var3, i13, i12, 0));
        }
        this.b.d(true, true, false);
        y71 y71Var = this.h;
        if (y71Var != null) {
            y71Var.b(this.b);
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
            this.b.postRunnable(new x71(this, 0));
        }
    }

    public void setDelegate(y71 y71Var) {
        this.h = y71Var;
        e00 e00Var = this.b;
        if (e00Var != null) {
            if (y71Var == null) {
                e00Var.f(null);
            } else {
                y71Var.b(e00Var);
            }
        }
    }

    public void setHDRInfo(ei.z7 z7Var) {
        this.f = z7Var;
        e00 e00Var = this.b;
        if (e00Var != null) {
            e00Var.postRunnable(new yt(9, e00Var, z7Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        e00 e00Var = this.b;
        if (e00Var != null) {
            int width = getWidth();
            int height = getHeight();
            pa paVar = e00Var.I;
            if (paVar == null) {
                return;
            }
            Matrix matrix2 = paVar.v;
            matrix.invert(matrix2);
            float f7 = width;
            float f10 = height;
            matrix2.preScale(f7, f10);
            matrix2.postScale(1.0f / f7, 1.0f / f10);
            paVar.c(matrix2);
            e00Var.d(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
