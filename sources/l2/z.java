package l2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import e2.w1;
import java.util.ArrayList;
import org.telegram.ui.Components.b61;
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class z implements d3.h0, n2.s, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ f0 a;

    public z(f0 f0Var) {
        this.a = f0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i10) {
        f0 f0Var = this.a;
        b61 b61Var = f0Var.s0;
        if (b61Var != null) {
            b61Var.execute(new x(this, surfaceTexture, i7, i10, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        f0Var.x1(surface);
        f0Var.U = surface;
        f0Var.q1(i7, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.a;
        ArrayList arrayList = f0Var.t0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            if (((i61) ((w1) obj)).K.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        b61 b61Var = f0Var.s0;
        if (b61Var != null) {
            b61Var.execute(new kg.i0(this, surfaceTexture));
            return true;
        }
        f0Var.x1(null);
        f0Var.q1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i7, int i10) {
        f0 f0Var = this.a;
        b61 b61Var = f0Var.s0;
        if (b61Var != null) {
            b61Var.execute(new jg.q(this, surfaceTexture, i7, i10));
        } else {
            f0Var.q1(i7, i10);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        f0 f0Var = this.a;
        b61 b61Var = f0Var.s0;
        if (b61Var != null) {
            b61Var.execute(new ji.i(17, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = f0Var.t0;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((i61) ((w1) obj)).K.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i10, int i11) {
        this.a.q1(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.a;
        if (f0Var.W) {
            f0Var.x1(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        f0 f0Var = this.a;
        if (f0Var.W) {
            f0Var.x1(null);
        }
        f0Var.q1(0, 0);
    }
}
