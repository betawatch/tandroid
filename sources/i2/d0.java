package i2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import b2.a2;
import fi.ua;
import hi.u2;
import java.util.ArrayList;
import org.telegram.ui.Components.l81;
import org.telegram.ui.Components.t81;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class d0 implements a3.m0, k2.v, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ j0 a;

    public d0(j0 j0Var) {
        this.a = j0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        j0 j0Var = this.a;
        l81 l81Var = j0Var.s0;
        if (l81Var != null) {
            l81Var.execute(new b0(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        j0Var.x1(surface);
        j0Var.U = surface;
        j0Var.q1(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        j0 j0Var = this.a;
        ArrayList arrayList = j0Var.t0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((t81) ((a2) obj)).J.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        l81 l81Var = j0Var.s0;
        if (l81Var != null) {
            l81Var.execute(new ua(this, surfaceTexture));
            return true;
        }
        j0Var.x1(null);
        j0Var.q1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        j0 j0Var = this.a;
        l81 l81Var = j0Var.s0;
        if (l81Var != null) {
            l81Var.execute(new v(this, surfaceTexture, i10, i11));
        } else {
            j0Var.q1(i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        j0 j0Var = this.a;
        l81 l81Var = j0Var.s0;
        if (l81Var != null) {
            l81Var.execute(new u2(6, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = j0Var.t0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t81) ((a2) obj)).J.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.a.q1(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        j0 j0Var = this.a;
        if (j0Var.W) {
            j0Var.x1(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        j0 j0Var = this.a;
        if (j0Var.W) {
            j0Var.x1(null);
        }
        j0Var.q1(0, 0);
    }
}
