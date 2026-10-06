package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class u71 extends TextureView implements TextureView.SurfaceTextureListener {
    public e81 a;
    public yz b;
    public final uk0 c;
    public int d;
    public int e;
    public ci.j8 f;
    public t71 h;
    public int n;
    public int r;
    public ka s;

    public u71(Context context, e81 e81Var) {
        super(context);
        this.c = new uk0();
        this.a = e81Var;
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
        qa qaVar;
        yz yzVar = this.b;
        if (yzVar == null || (qaVar = yzVar.I) == null) {
            return null;
        }
        synchronized (qaVar.n) {
            try {
                if (qaVar.q) {
                    return qaVar.p;
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
        yz yzVar = new yz(surfaceTexture, new pv(this, 28), this.f, this.s, i10, i11);
        this.b = yzVar;
        yzVar.i(this.n, this.r);
        yz yzVar2 = this.b;
        ka kaVar = this.s;
        qa qaVar = yzVar2.I;
        if (qaVar != null) {
            ka kaVar2 = qaVar.t;
            if (kaVar2 != null && kaVar2.m != null) {
                kaVar2.m = null;
            }
            qaVar.t = kaVar;
            if (kaVar != null && kaVar.m != qaVar) {
                kaVar.m = qaVar;
                kaVar.d();
            }
        }
        int i13 = this.d;
        if (i13 != 0 && (i12 = this.e) != 0) {
            yz yzVar3 = this.b;
            yzVar3.getClass();
            yzVar3.postRunnable(new uz(yzVar3, i13, i12, 0));
        }
        this.b.e(true, true, false);
        t71 t71Var = this.h;
        if (t71Var != null) {
            t71Var.c(this.b);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        yz yzVar = this.b;
        if (yzVar == null) {
            return true;
        }
        yzVar.postRunnable(new vz(yzVar, 0));
        this.b = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        yz yzVar = this.b;
        if (yzVar != null) {
            yzVar.postRunnable(new uz(yzVar, i10, i11, 1));
            this.b.e(false, true, false);
            this.b.postRunnable(new q61(this, 2));
        }
    }

    public void setDelegate(t71 t71Var) {
        this.h = t71Var;
        yz yzVar = this.b;
        if (yzVar != null) {
            if (t71Var == null) {
                yzVar.f(null);
            } else {
                t71Var.c(yzVar);
            }
        }
    }

    public void setHDRInfo(ci.j8 j8Var) {
        this.f = j8Var;
        yz yzVar = this.b;
        if (yzVar != null) {
            yzVar.postRunnable(new yw(6, yzVar, j8Var));
        }
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        super.setTransform(matrix);
        yz yzVar = this.b;
        if (yzVar != null) {
            int width = getWidth();
            int height = getHeight();
            qa qaVar = yzVar.I;
            if (qaVar == null) {
                return;
            }
            Matrix matrix2 = qaVar.v;
            matrix.invert(matrix2);
            float f7 = width;
            float f10 = height;
            matrix2.preScale(f7, f10);
            matrix2.postScale(1.0f / f7, 1.0f / f10);
            qaVar.c(matrix2);
            yzVar.e(false, false, false);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
