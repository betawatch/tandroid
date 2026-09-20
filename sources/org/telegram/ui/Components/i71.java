package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class i71 extends TextureView implements TextureView.SurfaceTextureListener {
    public t71 a;
    public vz b;
    public final rk0 c;
    public int d;
    public int e;
    public ci.n8 f;
    public h71 h;
    public int n;
    public int r;
    public ia s;

    public i71(Context context, t71 t71Var) {
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
        vz vzVar = this.b;
        if (vzVar == null || (oaVar = vzVar.I) == null) {
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
        vz vzVar = new vz(surfaceTexture, new mv(this, 29), this.f, this.s, i10, i11);
        this.b = vzVar;
        vzVar.i(this.n, this.r);
        vz vzVar2 = this.b;
        ia iaVar = this.s;
        oa oaVar = vzVar2.I;
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
            vz vzVar3 = this.b;
            vzVar3.getClass();
            vzVar3.postRunnable(new rz(vzVar3, i13, i12, 0));
        }
        this.b.e(true, true, false);
        h71 h71Var = this.h;
        if (h71Var != null) {
            h71Var.c(this.b);
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
            this.b.postRunnable(new wq0(this, 29));
        }
    }

    public void setDelegate(h71 h71Var) {
        this.h = h71Var;
        vz vzVar = this.b;
        if (vzVar != null) {
            if (h71Var == null) {
                vzVar.f(null);
            } else {
                h71Var.c(vzVar);
            }
        }
    }

    public void setHDRInfo(ci.n8 n8Var) {
        this.f = n8Var;
        vz vzVar = this.b;
        if (vzVar != null) {
            vzVar.postRunnable(new bv(8, vzVar, n8Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        vz vzVar = this.b;
        if (vzVar != null) {
            int width = getWidth();
            int height = getHeight();
            oa oaVar = vzVar.I;
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
            vzVar.e(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
