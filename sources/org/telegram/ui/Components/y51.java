package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class y51 extends TextureView implements TextureView.SurfaceTextureListener {
    public i61 a;
    public ez b;
    public final aj0 c;
    public int d;
    public int e;
    public hi.b7 f;
    public x51 h;
    public int n;
    public int r;
    public ca s;

    public y51(Context context, i61 i61Var) {
        super(context);
        this.c = new aj0();
        this.a = i61Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        aj0 aj0Var = this.c;
        aj0Var.a = f10;
        aj0Var.b = f11;
        aj0Var.c = f12;
        aj0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        ez ezVar = this.b;
        if (ezVar == null || (haVar = ezVar.J) == null) {
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
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        int i11;
        if (this.b != null || surfaceTexture == null || this.a == null) {
            return;
        }
        ez ezVar = new ez(surfaceTexture, new ky(this, 25), this.f, this.s, i7, i10);
        this.b = ezVar;
        ezVar.h(this.n, this.r);
        ez ezVar2 = this.b;
        ca caVar = this.s;
        ha haVar = ezVar2.J;
        if (haVar != null) {
            ca caVar2 = haVar.t;
            if (caVar2 != null && caVar2.m != null) {
                caVar2.m = null;
            }
            haVar.t = caVar;
            if (caVar != null && caVar.m != haVar) {
                caVar.m = haVar;
                caVar.d();
            }
        }
        int i12 = this.d;
        if (i12 != 0 && (i11 = this.e) != 0) {
            ez ezVar3 = this.b;
            ezVar3.getClass();
            ezVar3.postRunnable(new az(ezVar3, i12, i11, 0));
        }
        this.b.c(true, true, false);
        x51 x51Var = this.h;
        if (x51Var != null) {
            x51Var.a(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ez ezVar = this.b;
        if (ezVar == null) {
            return true;
        }
        ezVar.postRunnable(new bz(ezVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        ez ezVar = this.b;
        if (ezVar != null) {
            ezVar.postRunnable(new az(ezVar, i7, i10, 1));
            this.b.c(false, true, false);
            this.b.postRunnable(new w51(this, 0));
        }
    }

    public void setDelegate(x51 x51Var) {
        this.h = x51Var;
        ez ezVar = this.b;
        if (ezVar != null) {
            if (x51Var == null) {
                ezVar.d(null);
            } else {
                x51Var.a(ezVar);
            }
        }
    }

    public void setHDRInfo(hi.b7 b7Var) {
        this.f = b7Var;
        ez ezVar = this.b;
        if (ezVar != null) {
            ezVar.postRunnable(new ou(8, ezVar, b7Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        ez ezVar = this.b;
        if (ezVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = ezVar.J;
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
            ezVar.c(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
