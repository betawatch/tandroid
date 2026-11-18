package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class v51 extends TextureView implements TextureView.SurfaceTextureListener {
    public f61 a;
    public cz b;
    public final yi0 c;
    public int d;
    public int e;
    public hi.c7 f;
    public u51 h;
    public int n;
    public int r;
    public ca s;

    public v51(Context context, f61 f61Var) {
        super(context);
        this.c = new yi0();
        this.a = f61Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        yi0 yi0Var = this.c;
        yi0Var.a = f10;
        yi0Var.b = f11;
        yi0Var.c = f12;
        yi0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        cz czVar = this.b;
        if (czVar == null || (haVar = czVar.J) == null) {
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
        cz czVar = new cz(surfaceTexture, new iy(this, 25), this.f, this.s, i7, i10);
        this.b = czVar;
        czVar.h(this.n, this.r);
        cz czVar2 = this.b;
        ca caVar = this.s;
        ha haVar = czVar2.J;
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
            cz czVar3 = this.b;
            czVar3.getClass();
            czVar3.postRunnable(new yy(czVar3, i12, i11, 0));
        }
        this.b.c(true, true, false);
        u51 u51Var = this.h;
        if (u51Var != null) {
            u51Var.a(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        cz czVar = this.b;
        if (czVar == null) {
            return true;
        }
        czVar.postRunnable(new zy(czVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        cz czVar = this.b;
        if (czVar != null) {
            czVar.postRunnable(new yy(czVar, i7, i10, 1));
            this.b.c(false, true, false);
            this.b.postRunnable(new t51(this, 0));
        }
    }

    public void setDelegate(u51 u51Var) {
        this.h = u51Var;
        cz czVar = this.b;
        if (czVar != null) {
            if (u51Var == null) {
                czVar.d(null);
            } else {
                u51Var.a(czVar);
            }
        }
    }

    public void setHDRInfo(hi.c7 c7Var) {
        this.f = c7Var;
        cz czVar = this.b;
        if (czVar != null) {
            czVar.postRunnable(new dw(6, czVar, c7Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        cz czVar = this.b;
        if (czVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = czVar.J;
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
            czVar.c(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
