package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class z71 extends TextureView implements TextureView.SurfaceTextureListener {
    public k81 a;
    public l00 b;
    public final ml0 c;
    public int d;
    public int e;
    public ci.k8 f;
    public y71 h;
    public int n;
    public int r;
    public ma s;

    public z71(Context context, k81 k81Var) {
        super(context);
        this.c = new ml0();
        this.a = k81Var;
        setSurfaceTextureListener(this);
    }

    public final void a(float f7, float f10, float f11, float f12) {
        ml0 ml0Var = this.c;
        ml0Var.a = f7;
        ml0Var.b = f10;
        ml0Var.c = f11;
        ml0Var.d = f12;
    }

    public Bitmap getUiBlurBitmap() {
        sa saVar;
        l00 l00Var = this.b;
        if (l00Var == null || (saVar = l00Var.I) == null) {
            return null;
        }
        synchronized (saVar.n) {
            try {
                if (saVar.q) {
                    return saVar.p;
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
        l00 l00Var = new l00(surfaceTexture, new bw(this, 29), this.f, this.s, i10, i11);
        this.b = l00Var;
        l00Var.i(this.n, this.r);
        l00 l00Var2 = this.b;
        ma maVar = this.s;
        sa saVar = l00Var2.I;
        if (saVar != null) {
            ma maVar2 = saVar.t;
            if (maVar2 != null && maVar2.m != null) {
                maVar2.m = null;
            }
            saVar.t = maVar;
            if (maVar != null && maVar.m != saVar) {
                maVar.m = saVar;
                maVar.d();
            }
        }
        int i13 = this.d;
        if (i13 != 0 && (i12 = this.e) != 0) {
            l00 l00Var3 = this.b;
            l00Var3.getClass();
            l00Var3.postRunnable(new h00(l00Var3, i13, i12, 0));
        }
        this.b.e(true, true, false);
        y71 y71Var = this.h;
        if (y71Var != null) {
            y71Var.b(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        l00 l00Var = this.b;
        if (l00Var == null) {
            return true;
        }
        l00Var.postRunnable(new i00(l00Var, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        l00 l00Var = this.b;
        if (l00Var != null) {
            l00Var.postRunnable(new h00(l00Var, i10, i11, 1));
            this.b.e(false, true, false);
            this.b.postRunnable(new or0(this, 29));
        }
    }

    public void setDelegate(y71 y71Var) {
        this.h = y71Var;
        l00 l00Var = this.b;
        if (l00Var != null) {
            if (y71Var == null) {
                l00Var.f(null);
            } else {
                y71Var.b(l00Var);
            }
        }
    }

    public void setHDRInfo(ci.k8 k8Var) {
        this.f = k8Var;
        l00 l00Var = this.b;
        if (l00Var != null) {
            l00Var.postRunnable(new zr(14, l00Var, k8Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        l00 l00Var = this.b;
        if (l00Var != null) {
            int width = getWidth();
            int height = getHeight();
            sa saVar = l00Var.I;
            if (saVar == null) {
                return;
            }
            Matrix matrix2 = saVar.v;
            matrix.invert(matrix2);
            float f7 = width;
            float f10 = height;
            matrix2.preScale(f7, f10);
            matrix2.postScale(1.0f / f7, 1.0f / f10);
            saVar.c(matrix2);
            l00Var.e(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
