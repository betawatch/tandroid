package j3;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.telegram.ui.Components.i71;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class c0 implements l3.q, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ f0 a;

    public c0(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        f0 f0Var = this.a;
        Executor executor = f0Var.i0;
        if (executor != null) {
            executor.execute(new b0(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        f0Var.Z(surface);
        f0Var.Q = surface;
        f0Var.T(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.a;
        ArrayList arrayList = f0Var.j0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((i71) ((i5.t) obj)).G.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        Executor executor = f0Var.i0;
        if (executor != null) {
            executor.execute(new ef.e(this, surfaceTexture));
            return true;
        }
        f0Var.Z(null);
        f0Var.T(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        f0 f0Var = this.a;
        Executor executor = f0Var.i0;
        if (executor != null) {
            executor.execute(new v(this, surfaceTexture, i10, i11));
        } else {
            f0Var.T(i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.a;
        Executor executor = f0Var.i0;
        if (executor != null) {
            executor.execute(new gf.c(18, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = f0Var.j0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i71) ((i5.t) obj)).G.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.a.T(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.a;
        if (f0Var.S) {
            f0Var.Z(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.a;
        if (f0Var.S) {
            f0Var.Z(null);
        }
        f0Var.T(0, 0);
    }
}
