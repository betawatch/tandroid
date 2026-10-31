package i2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import b2.a2;
import java.util.ArrayList;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c0 implements a3.m0, k2.w, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ i0 a;

    public c0(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        i0 i0Var = this.a;
        n61 n61Var = i0Var.s0;
        if (n61Var != null) {
            n61Var.execute(new a0(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        i0Var.x1(surface);
        i0Var.U = surface;
        i0Var.q1(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        i0 i0Var = this.a;
        ArrayList arrayList = i0Var.t0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((u61) ((a2) obj)).J.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        n61 n61Var = i0Var.s0;
        if (n61Var != null) {
            n61Var.execute(new gg.c(this, surfaceTexture));
            return true;
        }
        i0Var.x1(null);
        i0Var.q1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        i0 i0Var = this.a;
        n61 n61Var = i0Var.s0;
        if (n61Var != null) {
            n61Var.execute(new u(this, surfaceTexture, i10, i11));
        } else {
            i0Var.q1(i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        i0 i0Var = this.a;
        n61 n61Var = i0Var.s0;
        if (n61Var != null) {
            n61Var.execute(new d1.e(16, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = i0Var.t0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((u61) ((a2) obj)).J.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.a.q1(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        i0 i0Var = this.a;
        if (i0Var.W) {
            i0Var.x1(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        i0 i0Var = this.a;
        if (i0Var.W) {
            i0Var.x1(null);
        }
        i0Var.q1(0, 0);
    }
}
