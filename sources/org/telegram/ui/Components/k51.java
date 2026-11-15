package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k51 extends TextureView implements TextureView.SurfaceTextureListener {
    public u51 a;
    public wy b;
    public final pi0 c;
    public int d;
    public int e;
    public hi.c7 f;
    public j51 h;
    public int n;
    public int r;
    public u9 s;

    public k51(Context context, u51 u51Var) {
        super(context);
        this.c = new pi0();
        this.a = u51Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        pi0 pi0Var = this.c;
        pi0Var.a = f10;
        pi0Var.b = f11;
        pi0Var.c = f12;
        pi0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        z9 z9Var;
        wy wyVar = this.b;
        if (wyVar == null || (z9Var = wyVar.J) == null) {
            return null;
        }
        synchronized (z9Var.n) {
            try {
                if (z9Var.q) {
                    return z9Var.p;
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
        wy wyVar = new wy(surfaceTexture, new gx(this, 26), this.f, this.s, i7, i10);
        this.b = wyVar;
        wyVar.h(this.n, this.r);
        wy wyVar2 = this.b;
        u9 u9Var = this.s;
        z9 z9Var = wyVar2.J;
        if (z9Var != null) {
            u9 u9Var2 = z9Var.t;
            if (u9Var2 != null && u9Var2.m != null) {
                u9Var2.m = null;
            }
            z9Var.t = u9Var;
            if (u9Var != null && u9Var.m != z9Var) {
                u9Var.m = z9Var;
                u9Var.d();
            }
        }
        int i12 = this.d;
        if (i12 != 0 && (i11 = this.e) != 0) {
            wy wyVar3 = this.b;
            wyVar3.getClass();
            wyVar3.postRunnable(new sy(wyVar3, i12, i11, 0));
        }
        this.b.c(true, true, false);
        j51 j51Var = this.h;
        if (j51Var != null) {
            j51Var.b(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        wy wyVar = this.b;
        if (wyVar == null) {
            return true;
        }
        wyVar.postRunnable(new ty(wyVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        wy wyVar = this.b;
        if (wyVar != null) {
            wyVar.postRunnable(new sy(wyVar, i7, i10, 1));
            this.b.c(false, true, false);
            this.b.postRunnable(new w41(this, 1));
        }
    }

    public void setDelegate(j51 j51Var) {
        this.h = j51Var;
        wy wyVar = this.b;
        if (wyVar != null) {
            if (j51Var == null) {
                wyVar.d(null);
            } else {
                j51Var.b(wyVar);
            }
        }
    }

    public void setHDRInfo(hi.c7 c7Var) {
        this.f = c7Var;
        wy wyVar = this.b;
        if (wyVar != null) {
            wyVar.postRunnable(new vs(10, wyVar, c7Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        wy wyVar = this.b;
        if (wyVar != null) {
            int width = getWidth();
            int height = getHeight();
            z9 z9Var = wyVar.J;
            if (z9Var == null) {
                return;
            }
            Matrix matrix2 = z9Var.v;
            matrix.invert(matrix2);
            float f10 = width;
            float f11 = height;
            matrix2.preScale(f10, f11);
            matrix2.postScale(1.0f / f10, 1.0f / f11);
            z9Var.c(matrix2);
            wyVar.c(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
