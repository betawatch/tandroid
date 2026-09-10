package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class h71 extends TextureView implements TextureView.SurfaceTextureListener {
    public t71 a;
    public c00 b;
    public final rk0 c;
    public int d;
    public int e;
    public bi.q9 f;
    public g71 h;
    public int n;
    public int r;
    public ia s;

    public h71(Context context, t71 t71Var) {
        super(context);
        this.c = new rk0();
        this.a = t71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        rk0 rk0Var = this.c;
        rk0Var.a = f7;
        rk0Var.b = f10;
        rk0Var.c = f11;
        rk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        oa oaVar;
        c00 c00Var = this.b;
        if (c00Var == null || (oaVar = c00Var.I) == null) {
            return null;
        }
        synchronized (oaVar.n) {
            try {
                if (oaVar.q) {
                    return oaVar.p;
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
        c00 c00Var = new c00(surfaceTexture, new pv(this, 28), this.f, this.s, i10, i11);
        this.b = c00Var;
        c00Var.i(this.n, this.r);
        c00 c00Var2 = this.b;
        ia iaVar = this.s;
        oa oaVar = c00Var2.I;
        if (oaVar != null) {
            ia iaVar2 = oaVar.t;
            if (iaVar2 != null && iaVar2.m != null) {
                iaVar2.m = null;
            }
            oaVar.t = iaVar;
            if (iaVar != null && iaVar.m != oaVar) {
                iaVar.m = oaVar;
                iaVar.d();
            }
        }
        int i13 = this.d;
        if (i13 != 0 && (i12 = this.e) != 0) {
            c00 c00Var3 = this.b;
            c00Var3.getClass();
            c00Var3.postRunnable(new yz(c00Var3, i13, i12, 0));
        }
        this.b.e(true, true, false);
        g71 g71Var = this.h;
        if (g71Var != null) {
            g71Var.c(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        c00 c00Var = this.b;
        if (c00Var == null) {
            return true;
        }
        c00Var.postRunnable(new zz(c00Var, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        c00 c00Var = this.b;
        if (c00Var != null) {
            c00Var.postRunnable(new yz(c00Var, i10, i11, 1));
            this.b.e(false, true, false);
            this.b.postRunnable(new uq0(this, 29));
        }
    }

    public void setDelegate(g71 g71Var) {
        this.h = g71Var;
        c00 c00Var = this.b;
        if (c00Var != null) {
            if (g71Var == null) {
                c00Var.f(null);
            } else {
                g71Var.c(c00Var);
            }
        }
    }

    public void setHDRInfo(bi.q9 q9Var) {
        this.f = q9Var;
        c00 c00Var = this.b;
        if (c00Var != null) {
            c00Var.postRunnable(new hy(5, c00Var, q9Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        c00 c00Var = this.b;
        if (c00Var != null) {
            int width = getWidth();
            int height = getHeight();
            oa oaVar = c00Var.I;
            if (oaVar == null) {
                return;
            }
            Matrix matrix2 = oaVar.v;
            matrix.invert(matrix2);
            float f7 = width;
            float f10 = height;
            matrix2.preScale(f7, f10);
            matrix2.postScale(1.0f / f7, 1.0f / f10);
            oaVar.c(matrix2);
            c00Var.e(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
