package dg;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import org.telegram.ui.Components.ba;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k1 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ ba a;
    public final /* synthetic */ o1 b;

    public k1(o1 o1Var, ba baVar) {
        this.b = o1Var;
        this.a = baVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (surfaceTexture != null) {
            o1 o1Var = this.b;
            if (o1Var.d != null) {
                return;
            }
            m1 m1Var = new m1(o1Var, surfaceTexture, this.a);
            o1Var.d = m1Var;
            m1Var.n = i10;
            m1Var.r = i11;
            o1Var.i();
            o1Var.post(new j1(this, 1));
            c1 c1Var = o1Var.c;
            if (c1Var.v) {
                c1Var.f.f(new z0(c1Var, c1Var.w, 0));
                c1Var.w = null;
                c1Var.v = false;
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        o1 o1Var = this.b;
        if (o1Var.d != null && !o1Var.y) {
            c1 c1Var = o1Var.c;
            c1Var.f.f(new a1.e(15, c1Var, new j1(this, 2)));
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        o1 o1Var = this.b;
        m1 m1Var = o1Var.d;
        if (m1Var == null) {
            return;
        }
        m1Var.n = i10;
        m1Var.r = i11;
        o1Var.i();
        m1 m1Var2 = o1Var.d;
        m1Var2.postRunnable(m1Var2.w);
        o1Var.d.postRunnable(new j1(this, 0));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
