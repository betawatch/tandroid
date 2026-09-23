package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class t61 extends TextureView implements TextureView.SurfaceTextureListener {
    public f71 a;
    public wz b;
    public final ik0 c;
    public int d;
    public int e;
    public ci.k8 f;
    public s61 h;
    public int n;
    public int r;
    public ja s;

    public t61(Context context, f71 f71Var) {
        super(context);
        this.c = new ik0();
        this.a = f71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        ik0 ik0Var = this.c;
        ik0Var.a = f7;
        ik0Var.b = f10;
        ik0Var.c = f11;
        ik0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        pa paVar;
        wz wzVar = this.b;
        if (wzVar == null || (paVar = wzVar.I) == null) {
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
        wz wzVar = new wz(surfaceTexture, new mv(this, 28), this.f, this.s, i10, i11);
        this.b = wzVar;
        wzVar.i(this.n, this.r);
        wz wzVar2 = this.b;
        ja jaVar = this.s;
        pa paVar = wzVar2.I;
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
            wz wzVar3 = this.b;
            wzVar3.getClass();
            wzVar3.postRunnable(new sz(wzVar3, i13, i12, 0));
        }
        this.b.e(true, true, false);
        s61 s61Var = this.h;
        if (s61Var != null) {
            s61Var.b(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        wz wzVar = this.b;
        if (wzVar == null) {
            return true;
        }
        wzVar.postRunnable(new tz(wzVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        wz wzVar = this.b;
        if (wzVar != null) {
            wzVar.postRunnable(new sz(wzVar, i10, i11, 1));
            this.b.e(false, true, false);
            this.b.postRunnable(new jq0(this, 29));
        }
    }

    public void setDelegate(s61 s61Var) {
        this.h = s61Var;
        wz wzVar = this.b;
        if (wzVar != null) {
            if (s61Var == null) {
                wzVar.f(null);
            } else {
                s61Var.b(wzVar);
            }
        }
    }

    public void setHDRInfo(ci.k8 k8Var) {
        this.f = k8Var;
        wz wzVar = this.b;
        if (wzVar != null) {
            wzVar.postRunnable(new oy(2, wzVar, k8Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        wz wzVar = this.b;
        if (wzVar != null) {
            int width = getWidth();
            int height = getHeight();
            pa paVar = wzVar.I;
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
            wzVar.e(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
