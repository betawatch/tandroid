package h3;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import org.telegram.messenger.DispatchQueue;
import org.telegram.ui.Components.m61;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h0 implements j3.o, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ k0 a;

    public h0(k0 k0Var) {
        this.a = k0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        k0 k0Var = this.a;
        DispatchQueue dispatchQueue = k0Var.l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new f0(this, surfaceTexture, i10, i11, 0));
            return;
        }
        Surface surface = new Surface(surfaceTexture);
        k0Var.g0(surface);
        k0Var.S = surface;
        k0Var.a0(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        k0 k0Var = this.a;
        ArrayList arrayList = k0Var.m0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((m61) ((e5.s) obj)).F.onSurfaceDestroyed(surfaceTexture)) {
                return false;
            }
        }
        DispatchQueue dispatchQueue = k0Var.l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new f2.r(this, surfaceTexture));
            return true;
        }
        k0Var.g0(null);
        k0Var.a0(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        k0 k0Var = this.a;
        DispatchQueue dispatchQueue = k0Var.l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new z(this, surfaceTexture, i10, i11));
        } else {
            k0Var.a0(i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        k0 k0Var = this.a;
        DispatchQueue dispatchQueue = k0Var.l0;
        if (dispatchQueue != null) {
            dispatchQueue.postRunnable(new d5.u(17, this, surfaceTexture));
            return;
        }
        ArrayList arrayList = k0Var.m0;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m61) ((e5.s) obj)).F.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.a.a0(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        k0 k0Var = this.a;
        if (k0Var.U) {
            k0Var.g0(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        k0 k0Var = this.a;
        if (k0Var.U) {
            k0Var.g0(null);
        }
        k0Var.a0(0, 0);
    }
}
