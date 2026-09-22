package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class l71 extends TextureView implements TextureView.SurfaceTextureListener {
    public v71 a;
    public vz b;
    public final uk0 c;
    public int d;
    public int e;
    public ci.n8 f;
    public k71 h;
    public int n;
    public int r;
    public ia s;

    public l71(Context context, v71 v71Var) {
        super(context);
        this.c = new uk0();
        this.a = v71Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        uk0 uk0Var = this.c;
        uk0Var.a = f7;
        uk0Var.b = f10;
        uk0Var.c = f11;
        uk0Var.d = f12;
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
        k71 k71Var = this.h;
        if (k71Var != null) {
            k71Var.b(this.b);
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
            this.b.postRunnable(new j71(this, 0));
        }
    }

    public void setDelegate(k71 k71Var) {
        this.h = k71Var;
        vz vzVar = this.b;
        if (vzVar != null) {
            if (k71Var == null) {
                vzVar.f(null);
            } else {
                k71Var.b(vzVar);
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
