package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class k71 extends TextureView implements TextureView.SurfaceTextureListener {
    public u71 a;
    public xz b;
    public final uk0 c;
    public int d;
    public int e;
    public ci.k8 f;
    public j71 h;
    public int n;
    public int r;
    public ja s;

    public k71(Context context, u71 u71Var) {
        super(context);
        this.c = new uk0();
        this.a = u71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        uk0 uk0Var = this.c;
        uk0Var.a = f7;
        uk0Var.b = f10;
        uk0Var.c = f11;
        uk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        xz xzVar = this.b;
        if (xzVar == null || (paVar = xzVar.I) == null) {
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
        xz xzVar = new xz(surfaceTexture, new nv(this, 29), this.f, this.s, i10, i11);
        this.b = xzVar;
        xzVar.i(this.n, this.r);
        xz xzVar2 = this.b;
        ja jaVar = this.s;
        pa paVar = xzVar2.I;
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
            xz xzVar3 = this.b;
            xzVar3.getClass();
            xzVar3.postRunnable(new tz(xzVar3, i13, i12, 0));
        }
        this.b.e(true, true, false);
        j71 j71Var = this.h;
        if (j71Var != null) {
            j71Var.c(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        xz xzVar = this.b;
        if (xzVar == null) {
            return true;
        }
        xzVar.postRunnable(new uz(xzVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        xz xzVar = this.b;
        if (xzVar != null) {
            xzVar.postRunnable(new tz(xzVar, i10, i11, 1));
            this.b.e(false, true, false);
            this.b.postRunnable(new i71(this, 0));
        }
    }

    public void setDelegate(j71 j71Var) {
        this.h = j71Var;
        xz xzVar = this.b;
        if (xzVar != null) {
            if (j71Var == null) {
                xzVar.f(null);
            } else {
                j71Var.c(xzVar);
            }
        }
    }

    public void setHDRInfo(ci.k8 k8Var) {
        this.f = k8Var;
        xz xzVar = this.b;
        if (xzVar != null) {
            xzVar.postRunnable(new ww(7, xzVar, k8Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        xz xzVar = this.b;
        if (xzVar != null) {
            int width = getWidth();
            int height = getHeight();
            pa paVar = xzVar.I;
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
            xzVar.e(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
