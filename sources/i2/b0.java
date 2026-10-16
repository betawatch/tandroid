package i2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import b2.a2;
import di.x8;
import fi.q3;
import java.util.ArrayList;
import org.telegram.ui.Components.i81;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class b0 implements a3.m0, k2.u, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ h0 a;

    public b0(h0 h0Var) {
        this.a = h0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        h0 h0Var = this.a;
        org.telegram.messenger.f1 f1Var = h0Var.s0;
        if (f1Var != null) {
            f1Var.execute(new z(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        h0Var.x1(surface);
        h0Var.U = surface;
        h0Var.q1(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        h0 h0Var = this.a;
        ArrayList arrayList = h0Var.t0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((i81) ((a2) obj)).J.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        org.telegram.messenger.f1 f1Var = h0Var.s0;
        if (f1Var != null) {
            f1Var.execute(new x8(this, surfaceTexture));
            return true;
        }
        h0Var.x1(null);
        h0Var.q1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        h0 h0Var = this.a;
        org.telegram.messenger.f1 f1Var = h0Var.s0;
        if (f1Var != null) {
            f1Var.execute(new hg.n(this, surfaceTexture, i10, i11));
        } else {
            h0Var.q1(i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        h0 h0Var = this.a;
        org.telegram.messenger.f1 f1Var = h0Var.s0;
        if (f1Var != null) {
            f1Var.execute(new q3(13, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = h0Var.t0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((i81) ((a2) obj)).J.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.a.q1(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        h0 h0Var = this.a;
        if (h0Var.W) {
            h0Var.x1(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        h0 h0Var = this.a;
        if (h0Var.W) {
            h0Var.x1(null);
        }
        h0Var.q1(0, 0);
    }
}
