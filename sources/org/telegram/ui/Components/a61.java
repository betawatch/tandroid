package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a61 extends TextureView implements TextureView.SurfaceTextureListener {
    public m61 a;
    public jz b;
    public final yj0 c;
    public int d;
    public int e;
    public lh.y7 f;
    public z51 h;
    public int n;
    public int r;
    public z9 s;

    public a61(Context context, m61 m61Var) {
        super(context);
        this.c = new yj0();
        this.a = m61Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        yj0 yj0Var = this.c;
        yj0Var.a = f10;
        yj0Var.b = f11;
        yj0Var.c = f12;
        yj0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        fa faVar;
        jz jzVar = this.b;
        if (jzVar == null || (faVar = jzVar.E) == null) {
            return null;
        }
        synchronized (faVar.n) {
            try {
                if (faVar.q) {
                    return faVar.p;
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
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.b != null || surfaceTexture == null || this.a == null) {
            return;
        }
        jz jzVar = new jz(surfaceTexture, new vu(this, 28), this.f, this.s, i10, i11);
        this.b = jzVar;
        jzVar.i(this.n, this.r);
        jz jzVar2 = this.b;
        z9 z9Var = this.s;
        fa faVar = jzVar2.E;
        if (faVar != null) {
            z9 z9Var2 = faVar.t;
            if (z9Var2 != null && z9Var2.m != null) {
                z9Var2.m = null;
            }
            faVar.t = z9Var;
            if (z9Var != null && z9Var.m != faVar) {
                z9Var.m = faVar;
                z9Var.d();
            }
        }
        int i13 = this.d;
        if (i13 != 0 && (i12 = this.e) != 0) {
            jz jzVar3 = this.b;
            jzVar3.getClass();
            jzVar3.postRunnable(new fz(jzVar3, i13, i12, 0));
        }
        this.b.e(true, true, false);
        z51 z51Var = this.h;
        if (z51Var != null) {
            z51Var.c(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jz jzVar = this.b;
        if (jzVar == null) {
            return true;
        }
        jzVar.postRunnable(new gz(jzVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        jz jzVar = this.b;
        if (jzVar != null) {
            jzVar.postRunnable(new fz(jzVar, i10, i11, 1));
            this.b.e(false, true, false);
            this.b.postRunnable(new up0(this, 29));
        }
    }

    public void setDelegate(z51 z51Var) {
        this.h = z51Var;
        jz jzVar = this.b;
        if (jzVar != null) {
            if (z51Var == null) {
                jzVar.f(null);
            } else {
                z51Var.c(jzVar);
            }
        }
    }

    public void setHDRInfo(lh.y7 y7Var) {
        this.f = y7Var;
        jz jzVar = this.b;
        if (jzVar != null) {
            jzVar.postRunnable(new xq(14, jzVar, y7Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        jz jzVar = this.b;
        if (jzVar != null) {
            int width = getWidth();
            int height = getHeight();
            fa faVar = jzVar.E;
            if (faVar == null) {
                return;
            }
            Matrix matrix2 = faVar.v;
            matrix.invert(matrix2);
            float f10 = width;
            float f11 = height;
            matrix2.preScale(f10, f11);
            matrix2.postScale(1.0f / f10, 1.0f / f11);
            faVar.c(matrix2);
            jzVar.e(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
