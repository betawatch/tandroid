package i2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import b2.w1;
import ci.rc;
import gg.x1;
import java.util.ArrayList;
import org.telegram.ui.Components.s71;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class c0 implements a3.l0, k2.j, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ f0 a;

    public c0(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        f0 f0Var = this.a;
        org.telegram.messenger.d1 d1Var = f0Var.m0;
        if (d1Var != null) {
            d1Var.execute(new a0(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        f0Var.t1(surface);
        f0Var.S = surface;
        f0Var.m1(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.a;
        ArrayList arrayList = f0Var.n0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((s71) ((w1) obj)).J.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        org.telegram.messenger.d1 d1Var = f0Var.m0;
        if (d1Var != null) {
            d1Var.execute(new rc(this, surfaceTexture));
            return true;
        }
        f0Var.t1(null);
        f0Var.m1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        f0 f0Var = this.a;
        org.telegram.messenger.d1 d1Var = f0Var.m0;
        if (d1Var != null) {
            d1Var.execute(new gg.n(this, surfaceTexture, i10, i11));
        } else {
            f0Var.m1(i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.a;
        org.telegram.messenger.d1 d1Var = f0Var.m0;
        if (d1Var != null) {
            d1Var.execute(new x1(10, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = f0Var.n0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((s71) ((w1) obj)).J.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.a.m1(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.a;
        if (f0Var.U) {
            f0Var.t1(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.a;
        if (f0Var.U) {
            f0Var.t1(null);
        }
        f0Var.m1(0, 0);
    }
}
