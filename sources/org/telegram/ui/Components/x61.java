package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x61 extends TextureView implements TextureView.SurfaceTextureListener {
    public j71 a;
    public xz b;
    public final sk0 c;
    public int d;
    public int e;
    public qh.q6 f;
    public w61 h;
    public int n;
    public int r;
    public ba s;

    public x61(Context context, j71 j71Var) {
        super(context);
        this.c = new sk0();
        this.a = j71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        sk0 sk0Var = this.c;
        sk0Var.a = f10;
        sk0Var.b = f11;
        sk0Var.c = f12;
        sk0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        xz xzVar = this.b;
        if (xzVar == null || (haVar = xzVar.F) == null) {
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
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        int i12;
        if (this.b != null || surfaceTexture == null || this.a == null) {
            return;
        }
        xz xzVar = new xz(surfaceTexture, new hv(this, 28), this.f, this.s, i10, i11);
        this.b = xzVar;
        xzVar.i(this.n, this.r);
        xz xzVar2 = this.b;
        ba baVar = this.s;
        ha haVar = xzVar2.F;
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
        int i13 = this.d;
        if (i13 != 0 && (i12 = this.e) != 0) {
            xz xzVar3 = this.b;
            xzVar3.getClass();
            xzVar3.postRunnable(new tz(xzVar3, i13, i12, 0));
        }
        this.b.e(true, true, false);
        w61 w61Var = this.h;
        if (w61Var != null) {
            w61Var.b(this.b);
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
            this.b.postRunnable(new nq0(this, 29));
        }
    }

    public void setDelegate(w61 w61Var) {
        this.h = w61Var;
        xz xzVar = this.b;
        if (xzVar != null) {
            if (w61Var == null) {
                xzVar.f(null);
            } else {
                w61Var.b(xzVar);
            }
        }
    }

    public void setHDRInfo(qh.q6 q6Var) {
        this.f = q6Var;
        xz xzVar = this.b;
        if (xzVar != null) {
            xzVar.postRunnable(new eo(18, xzVar, q6Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        xz xzVar = this.b;
        if (xzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = xzVar.F;
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
            xzVar.e(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
