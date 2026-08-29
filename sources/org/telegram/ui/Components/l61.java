package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l61 extends TextureView implements TextureView.SurfaceTextureListener {
    public x61 a;
    public qz b;
    public final hk0 c;
    public int d;
    public int e;
    public nh.n7 f;
    public k61 h;
    public int n;
    public int r;
    public ga s;

    public l61(Context context, x61 x61Var) {
        super(context);
        this.c = new hk0();
        this.a = x61Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f9, float f10, float f11, float f12) {
        hk0 hk0Var = this.c;
        hk0Var.a = f9;
        hk0Var.b = f10;
        hk0Var.c = f11;
        hk0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        ma maVar;
        qz qzVar = this.b;
        if (qzVar == null || (maVar = qzVar.E) == null) {
            return null;
        }
        synchronized (maVar.n) {
            try {
                if (maVar.q) {
                    return maVar.p;
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
        qz qzVar = new qz(surfaceTexture, new cv(this, 28), this.f, this.s, i10, i11);
        this.b = qzVar;
        qzVar.i(this.n, this.r);
        qz qzVar2 = this.b;
        ga gaVar = this.s;
        ma maVar = qzVar2.E;
        if (maVar != null) {
            ga gaVar2 = maVar.t;
            if (gaVar2 != null && gaVar2.m != null) {
                gaVar2.m = null;
            }
            maVar.t = gaVar;
            if (gaVar != null && gaVar.m != maVar) {
                gaVar.m = maVar;
                gaVar.d();
            }
        }
        int i13 = this.d;
        if (i13 != 0 && (i12 = this.e) != 0) {
            qz qzVar3 = this.b;
            qzVar3.getClass();
            qzVar3.postRunnable(new mz(qzVar3, i13, i12, 0));
        }
        this.b.e(true, true, false);
        k61 k61Var = this.h;
        if (k61Var != null) {
            k61Var.b(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        qz qzVar = this.b;
        if (qzVar == null) {
            return true;
        }
        qzVar.postRunnable(new nz(qzVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        qz qzVar = this.b;
        if (qzVar != null) {
            qzVar.postRunnable(new mz(qzVar, i10, i11, 1));
            this.b.e(false, true, false);
            this.b.postRunnable(new fq0(this, 29));
        }
    }

    public void setDelegate(k61 k61Var) {
        this.h = k61Var;
        qz qzVar = this.b;
        if (qzVar != null) {
            if (k61Var == null) {
                qzVar.f(null);
            } else {
                k61Var.b(qzVar);
            }
        }
    }

    public void setHDRInfo(nh.n7 n7Var) {
        this.f = n7Var;
        qz qzVar = this.b;
        if (qzVar != null) {
            qzVar.postRunnable(new gt(11, qzVar, n7Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        qz qzVar = this.b;
        if (qzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ma maVar = qzVar.E;
            if (maVar == null) {
                return;
            }
            Matrix matrix2 = maVar.v;
            matrix.invert(matrix2);
            float f9 = width;
            float f10 = height;
            matrix2.preScale(f9, f10);
            matrix2.postScale(1.0f / f9, 1.0f / f10);
            maVar.c(matrix2);
            qzVar.e(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
