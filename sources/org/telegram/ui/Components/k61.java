package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k61 extends TextureView implements TextureView.SurfaceTextureListener {
    public u61 a;
    public gz b;
    public final oj0 c;
    public int d;
    public int e;
    public vh.m5 f;
    public j61 h;
    public int n;
    public int r;
    public s9 s;

    public k61(Context context, u61 u61Var) {
        super(context);
        this.c = new oj0();
        this.a = u61Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        oj0 oj0Var = this.c;
        oj0Var.a = f7;
        oj0Var.b = f10;
        oj0Var.c = f11;
        oj0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        x9 x9Var;
        gz gzVar = this.b;
        if (gzVar == null || (x9Var = gzVar.I) == null) {
            return null;
        }
        synchronized (x9Var.n) {
            try {
                if (x9Var.q) {
                    return x9Var.p;
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
        gz gzVar = new gz(surfaceTexture, new px(this, 26), this.f, this.s, i10, i11);
        this.b = gzVar;
        gzVar.h(this.n, this.r);
        gz gzVar2 = this.b;
        s9 s9Var = this.s;
        x9 x9Var = gzVar2.I;
        if (x9Var != null) {
            s9 s9Var2 = x9Var.t;
            if (s9Var2 != null && s9Var2.m != null) {
                s9Var2.m = null;
            }
            x9Var.t = s9Var;
            if (s9Var != null && s9Var.m != x9Var) {
                s9Var.m = x9Var;
                s9Var.d();
            }
        }
        int i13 = this.d;
        if (i13 != 0 && (i12 = this.e) != 0) {
            gz gzVar3 = this.b;
            gzVar3.getClass();
            gzVar3.postRunnable(new cz(gzVar3, i13, i12, 0));
        }
        this.b.c(true, true, false);
        j61 j61Var = this.h;
        if (j61Var != null) {
            j61Var.b(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        gz gzVar = this.b;
        if (gzVar == null) {
            return true;
        }
        gzVar.postRunnable(new dz(gzVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        gz gzVar = this.b;
        if (gzVar != null) {
            gzVar.postRunnable(new cz(gzVar, i10, i11, 1));
            this.b.c(false, true, false);
            this.b.postRunnable(new j51(this, 2));
        }
    }

    public void setDelegate(j61 j61Var) {
        this.h = j61Var;
        gz gzVar = this.b;
        if (gzVar != null) {
            if (j61Var == null) {
                gzVar.d(null);
            } else {
                j61Var.b(gzVar);
            }
        }
    }

    public void setHDRInfo(vh.m5 m5Var) {
        this.f = m5Var;
        gz gzVar = this.b;
        if (gzVar != null) {
            gzVar.postRunnable(new at(10, gzVar, m5Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        gz gzVar = this.b;
        if (gzVar != null) {
            int width = getWidth();
            int height = getHeight();
            x9 x9Var = gzVar.I;
            if (x9Var == null) {
                return;
            }
            Matrix matrix2 = x9Var.v;
            matrix.invert(matrix2);
            float f7 = width;
            float f10 = height;
            matrix2.preScale(f7, f10);
            matrix2.postScale(1.0f / f7, 1.0f / f10);
            x9Var.c(matrix2);
            gzVar.c(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
