package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class x51 extends TextureView implements TextureView.SurfaceTextureListener {
    public h61 a;
    public bz b;
    public final aj0 c;
    public int d;
    public int e;
    public hi.w7 f;
    public w51 h;
    public int n;
    public int r;
    public ba s;

    public x51(Context context, h61 h61Var) {
        super(context);
        this.c = new aj0();
        this.a = h61Var;
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
        ga gaVar;
        bz bzVar = this.b;
        if (bzVar == null || (gaVar = bzVar.J) == null) {
            return null;
        }
        synchronized (gaVar.n) {
            try {
                if (gaVar.q) {
                    return gaVar.p;
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
        bz bzVar = new bz(surfaceTexture, new hy(this, 25), this.f, this.s, i7, i10);
        this.b = bzVar;
        bzVar.h(this.n, this.r);
        bz bzVar2 = this.b;
        ba baVar = this.s;
        ga gaVar = bzVar2.J;
        if (gaVar != null) {
            ba baVar2 = gaVar.t;
            if (baVar2 != null && baVar2.m != null) {
                baVar2.m = null;
            }
            gaVar.t = baVar;
            if (baVar != null && baVar.m != gaVar) {
                baVar.m = gaVar;
                baVar.d();
            }
        }
        int i12 = this.d;
        if (i12 != 0 && (i11 = this.e) != 0) {
            bz bzVar3 = this.b;
            bzVar3.getClass();
            bzVar3.postRunnable(new xy(bzVar3, i12, i11, 0));
        }
        this.b.c(true, true, false);
        w51 w51Var = this.h;
        if (w51Var != null) {
            w51Var.a(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        bz bzVar = this.b;
        if (bzVar == null) {
            return true;
        }
        bzVar.postRunnable(new yy(bzVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        bz bzVar = this.b;
        if (bzVar != null) {
            bzVar.postRunnable(new xy(bzVar, i7, i10, 1));
            this.b.c(false, true, false);
            this.b.postRunnable(new v51(this, 0));
        }
    }

    public void setDelegate(w51 w51Var) {
        this.h = w51Var;
        bz bzVar = this.b;
        if (bzVar != null) {
            if (w51Var == null) {
                bzVar.d(null);
            } else {
                w51Var.a(bzVar);
            }
        }
    }

    public void setHDRInfo(hi.w7 w7Var) {
        this.f = w7Var;
        bz bzVar = this.b;
        if (bzVar != null) {
            bzVar.postRunnable(new bt(10, bzVar, w7Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        bz bzVar = this.b;
        if (bzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ga gaVar = bzVar.J;
            if (gaVar == null) {
                return;
            }
            Matrix matrix2 = gaVar.v;
            matrix.invert(matrix2);
            float f10 = width;
            float f11 = height;
            matrix2.preScale(f10, f11);
            matrix2.postScale(1.0f / f10, 1.0f / f11);
            gaVar.c(matrix2);
            bzVar.c(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
