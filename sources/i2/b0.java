package i2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import b2.w1;
import ci.uc;
import gg.x1;
import java.util.ArrayList;
import org.telegram.ui.Components.v71;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class b0 implements a3.l0, k2.k, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ e0 a;

    public b0(e0 e0Var) {
        this.a = e0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        e0 e0Var = this.a;
        org.telegram.messenger.c1 c1Var = e0Var.m0;
        if (c1Var != null) {
            c1Var.execute(new z(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        e0Var.t1(surface);
        e0Var.S = surface;
        e0Var.m1(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        e0 e0Var = this.a;
        ArrayList arrayList = e0Var.n0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((v71) ((w1) obj)).J.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        org.telegram.messenger.c1 c1Var = e0Var.m0;
        if (c1Var != null) {
            c1Var.execute(new uc(this, surfaceTexture));
            return true;
        }
        e0Var.t1(null);
        e0Var.m1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        e0 e0Var = this.a;
        org.telegram.messenger.c1 c1Var = e0Var.m0;
        if (c1Var != null) {
            c1Var.execute(new gg.n(this, surfaceTexture, i10, i11));
        } else {
            e0Var.m1(i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        e0 e0Var = this.a;
        org.telegram.messenger.c1 c1Var = e0Var.m0;
        if (c1Var != null) {
            c1Var.execute(new x1(10, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = e0Var.n0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((v71) ((w1) obj)).J.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.a.m1(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        e0 e0Var = this.a;
        if (e0Var.U) {
            e0Var.t1(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        e0 e0Var = this.a;
        if (e0Var.U) {
            e0Var.t1(null);
        }
        e0Var.m1(0, 0);
    }
}
