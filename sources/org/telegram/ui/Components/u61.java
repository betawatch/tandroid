package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class u61 extends TextureView implements TextureView.SurfaceTextureListener {
    public g71 a;
    public vz b;
    public final hk0 c;
    public int d;
    public int e;
    public ci.n8 f;
    public t61 h;
    public int n;
    public int r;
    public ha s;

    public u61(Context context, g71 g71Var) {
        super(context);
        this.c = new hk0();
        this.a = g71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        hk0 hk0Var = this.c;
        hk0Var.a = f7;
        hk0Var.b = f10;
        hk0Var.c = f11;
        hk0Var.d = f12;
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
        t61 t61Var = this.h;
        if (t61Var != null) {
            t61Var.b(this.b);
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
            this.b.postRunnable(new jq0(this, 29));
        }
    }

    public void setDelegate(t61 t61Var) {
        this.h = t61Var;
        vz vzVar = this.b;
        if (vzVar != null) {
            if (t61Var == null) {
                vzVar.f(null);
            } else {
                t61Var.b(vzVar);
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
