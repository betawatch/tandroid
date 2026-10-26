package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class h81 extends TextureView implements TextureView.SurfaceTextureListener {
    public s81 a;
    public e00 b;
    public final hl0 c;
    public int d;
    public int e;
    public fi.v7 f;
    public g81 h;
    public int n;
    public int r;
    public la s;

    public h81(Context context, s81 s81Var) {
        super(context);
        this.c = new hl0();
        this.a = s81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        hl0 hl0Var = this.c;
        hl0Var.a = f7;
        hl0Var.b = f10;
        hl0Var.c = f11;
        hl0Var.d = f12;
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
        g81 g81Var = this.h;
        if (g81Var != null) {
            g81Var.d(this.b);
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
            this.b.postRunnable(new s51(this, 5));
        }
    }

    public void setDelegate(g81 g81Var) {
        this.h = g81Var;
        e00 e00Var = this.b;
        if (e00Var != null) {
            if (g81Var == null) {
                e00Var.f(null);
            } else {
                g81Var.d(e00Var);
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
