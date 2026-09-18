package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class v61 extends TextureView implements TextureView.SurfaceTextureListener {
    public h71 a;
    public vz b;
    public final ik0 c;
    public int d;
    public int e;
    public ci.n8 f;
    public u61 h;
    public int n;
    public int r;
    public ha s;

    public v61(Context context, h71 h71Var) {
        super(context);
        this.c = new ik0();
        this.a = h71Var;
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
        na naVar;
        vz vzVar = this.b;
        if (vzVar == null || (naVar = vzVar.I) == null) {
            return null;
        }
        synchronized (naVar.n) {
            try {
                if (naVar.q) {
                    return naVar.p;
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
        vz vzVar = new vz(surfaceTexture, new lv(this, 28), this.f, this.s, i10, i11);
        this.b = vzVar;
        vzVar.i(this.n, this.r);
        vz vzVar2 = this.b;
        ha haVar = this.s;
        na naVar = vzVar2.I;
        if (naVar != null) {
            ha haVar2 = naVar.t;
            if (haVar2 != null && haVar2.m != null) {
                haVar2.m = null;
            }
            naVar.t = haVar;
            if (haVar != null && haVar.m != naVar) {
                haVar.m = naVar;
                haVar.d();
            }
        }
        int i13 = this.d;
        if (i13 != 0 && (i12 = this.e) != 0) {
            vz vzVar3 = this.b;
            vzVar3.getClass();
            vzVar3.postRunnable(new rz(vzVar3, i13, i12, 0));
        }
        this.b.e(true, true, false);
        u61 u61Var = this.h;
        if (u61Var != null) {
            u61Var.b(this.b);
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
            this.b.postRunnable(new kq0(this, 29));
        }
    }

    public void setDelegate(u61 u61Var) {
        this.h = u61Var;
        vz vzVar = this.b;
        if (vzVar != null) {
            if (u61Var == null) {
                vzVar.f(null);
            } else {
                u61Var.b(vzVar);
            }
        }
    }

    public void setHDRInfo(ci.n8 n8Var) {
        this.f = n8Var;
        vz vzVar = this.b;
        if (vzVar != null) {
            vzVar.postRunnable(new ny(2, vzVar, n8Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.b;
        if (vzVar != null) {
            int width = getWidth();
            int height = getHeight();
            na naVar = vzVar.I;
            if (naVar == null) {
                return;
            }
            Matrix matrix2 = naVar.v;
            matrix.invert(matrix2);
            float f7 = width;
            float f10 = height;
            matrix2.preScale(f7, f10);
            matrix2.postScale(1.0f / f7, 1.0f / f10);
            naVar.c(matrix2);
            vzVar.e(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
