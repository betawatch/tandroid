package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y51 extends TextureView implements TextureView.SurfaceTextureListener {
    public k61 a;
    public hz b;
    public final wj0 c;
    public int d;
    public int e;
    public kh.z7 f;
    public x51 h;
    public int n;
    public int r;
    public ba s;

    public y51(Context context, k61 k61Var) {
        super(context);
        this.c = new wj0();
        this.a = k61Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        wj0 wj0Var = this.c;
        wj0Var.a = f10;
        wj0Var.b = f11;
        wj0Var.c = f12;
        wj0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        hz hzVar = this.b;
        if (hzVar == null || (haVar = hzVar.E) == null) {
            return null;
        }
        synchronized (haVar.n) {
            try {
                if (haVar.q) {
                    return haVar.p;
                }
                return null;
            } catch (Throwable th) {
                throw th;
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
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        int i11;
        if (this.b != null || surfaceTexture == null || this.a == null) {
            return;
        }
        hz hzVar = new hz(surfaceTexture, new wu(this, 28), this.f, this.s, i9, i10);
        this.b = hzVar;
        hzVar.i(this.n, this.r);
        hz hzVar2 = this.b;
        ba baVar = this.s;
        ha haVar = hzVar2.E;
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
        int i12 = this.d;
        if (i12 != 0 && (i11 = this.e) != 0) {
            hz hzVar3 = this.b;
            hzVar3.getClass();
            hzVar3.postRunnable(new dz(hzVar3, i12, i11, 0));
        }
        this.b.e(true, true, false);
        x51 x51Var = this.h;
        if (x51Var != null) {
            x51Var.c(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        hz hzVar = this.b;
        if (hzVar == null) {
            return true;
        }
        hzVar.postRunnable(new ez(hzVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        hz hzVar = this.b;
        if (hzVar != null) {
            hzVar.postRunnable(new dz(hzVar, i9, i10, 1));
            this.b.e(false, true, false);
            this.b.postRunnable(new tp0(this, 29));
        }
    }

    public void setDelegate(x51 x51Var) {
        this.h = x51Var;
        hz hzVar = this.b;
        if (hzVar != null) {
            if (x51Var == null) {
                hzVar.f(null);
            } else {
                x51Var.c(hzVar);
            }
        }
    }

    public void setHDRInfo(kh.z7 z7Var) {
        this.f = z7Var;
        hz hzVar = this.b;
        if (hzVar != null) {
            hzVar.postRunnable(new zq(14, hzVar, z7Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        hz hzVar = this.b;
        if (hzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = hzVar.E;
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
            hzVar.e(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
