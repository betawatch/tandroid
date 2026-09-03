package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class w61 extends TextureView implements TextureView.SurfaceTextureListener {
    public i71 a;
    public vz b;
    public final rk0 c;
    public int d;
    public int e;
    public ph.s6 f;
    public v61 h;
    public int n;
    public int r;
    public ba s;

    public w61(Context context, i71 i71Var) {
        super(context);
        this.c = new rk0();
        this.a = i71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f10, float f11, float f12, float f13) {
        rk0 rk0Var = this.c;
        rk0Var.a = f10;
        rk0Var.b = f11;
        rk0Var.c = f12;
        rk0Var.d = f13;
    }

    public Bitmap getUiBlurBitmap() {
        ha haVar;
        vz vzVar = this.b;
        if (vzVar == null || (haVar = vzVar.F) == null) {
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
        vz vzVar = new vz(surfaceTexture, new ev(this, 28), this.f, this.s, i10, i11);
        this.b = vzVar;
        vzVar.i(this.n, this.r);
        vz vzVar2 = this.b;
        ba baVar = this.s;
        ha haVar = vzVar2.F;
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
            vz vzVar3 = this.b;
            vzVar3.getClass();
            vzVar3.postRunnable(new rz(vzVar3, i13, i12, 0));
        }
        this.b.e(true, true, false);
        v61 v61Var = this.h;
        if (v61Var != null) {
            v61Var.b(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vz vzVar = this.b;
        if (vzVar == null) {
            return true;
        }
        vzVar.postRunnable(new sz(vzVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        vz vzVar = this.b;
        if (vzVar != null) {
            vzVar.postRunnable(new rz(vzVar, i10, i11, 1));
            this.b.e(false, true, false);
            this.b.postRunnable(new nq0(this, 29));
        }
    }

    public void setDelegate(v61 v61Var) {
        this.h = v61Var;
        vz vzVar = this.b;
        if (vzVar != null) {
            if (v61Var == null) {
                vzVar.f(null);
            } else {
                v61Var.b(vzVar);
            }
        }
    }

    public void setHDRInfo(ph.s6 s6Var) {
        this.f = s6Var;
        vz vzVar = this.b;
        if (vzVar != null) {
            vzVar.postRunnable(new em(19, vzVar, s6Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.b;
        if (vzVar != null) {
            int width = getWidth();
            int height = getHeight();
            ha haVar = vzVar.F;
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
            vzVar.e(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
