package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class i51 extends TextureView implements TextureView.SurfaceTextureListener {
    public u51 a;
    public sy b;
    public final li0 c;
    public int d;
    public int e;
    public fi.d7 f;
    public h51 h;
    public int n;
    public int r;
    public y9 s;

    public i51(Context context, u51 u51Var) {
        super(context);
        this.c = new li0();
        this.a = u51Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        li0 li0Var = this.c;
        li0Var.a = f10;
        li0Var.b = f11;
        li0Var.c = f12;
        li0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        da daVar;
        sy syVar = this.b;
        if (syVar == null || (daVar = syVar.I) == null) {
            return null;
        }
        synchronized (daVar.n) {
            try {
                if (daVar.q) {
                    return daVar.p;
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
        sy syVar = new sy(surfaceTexture, new bx(this, 26), this.f, this.s, i7, i10);
        this.b = syVar;
        syVar.h(this.n, this.r);
        sy syVar2 = this.b;
        y9 y9Var = this.s;
        da daVar = syVar2.I;
        if (daVar != null) {
            y9 y9Var2 = daVar.t;
            if (y9Var2 != null && y9Var2.m != null) {
                y9Var2.m = null;
            }
            daVar.t = y9Var;
            if (y9Var != null && y9Var.m != daVar) {
                y9Var.m = daVar;
                y9Var.d();
            }
        }
        int i12 = this.d;
        if (i12 != 0 && (i11 = this.e) != 0) {
            sy syVar3 = this.b;
            syVar3.getClass();
            syVar3.postRunnable(new oy(syVar3, i12, i11, 0));
        }
        this.b.c(true, true, false);
        h51 h51Var = this.h;
        if (h51Var != null) {
            h51Var.a(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        sy syVar = this.b;
        if (syVar == null) {
            return true;
        }
        syVar.postRunnable(new py(syVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        sy syVar = this.b;
        if (syVar != null) {
            syVar.postRunnable(new oy(syVar, i7, i10, 1));
            this.b.c(false, true, false);
            this.b.postRunnable(new kr0(this, 28));
        }
    }

    public void setDelegate(h51 h51Var) {
        this.h = h51Var;
        sy syVar = this.b;
        if (syVar != null) {
            if (h51Var == null) {
                syVar.d(null);
            } else {
                h51Var.a(syVar);
            }
        }
    }

    public void setHDRInfo(fi.d7 d7Var) {
        this.f = d7Var;
        sy syVar = this.b;
        if (syVar != null) {
            syVar.postRunnable(new fq(16, syVar, d7Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        sy syVar = this.b;
        if (syVar != null) {
            int width = getWidth();
            int height = getHeight();
            da daVar = syVar.I;
            if (daVar == null) {
                return;
            }
            Matrix matrix2 = daVar.v;
            matrix.invert(matrix2);
            float f10 = width;
            float f11 = height;
            matrix2.preScale(f10, f11);
            matrix2.postScale(1.0f / f10, 1.0f / f11);
            daVar.c(matrix2);
            syVar.c(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
