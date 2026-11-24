// default package

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class am9 extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ bm9 f;

    public am9(bm9 bm9Var, CameraDevice.StateCallback stateCallback, boolean z) {
        this.f = bm9Var;
        this.a = stateCallback;
        this.b = z;
        bm9Var.w0++;
    }

    public final void a() {
        boolean z = this.b;
        bm9 bm9Var = this.f;
        if (z) {
            if (bm9Var.v0 == this) {
                bm9Var.v0 = null;
            }
        } else if (bm9Var.u0 == this) {
            bm9Var.u0 = null;
        }
    }

    public final boolean b() {
        if (this.f.t0) {
            return false;
        }
        boolean z = this.b;
        bm9 bm9Var = this.f;
        return (z ? bm9Var.v0 : bm9Var.u0) == this;
    }

    public final void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        bm9 bm9Var = this.f;
        int i = bm9Var.w0 - 1;
        bm9Var.w0 = i;
        HandlerThread handlerThread = bm9Var.x0;
        if (i > 0 || handlerThread == null) {
            return;
        }
        bm9Var.x0 = null;
        bm9Var.j.b("camera open results settled after release; quitting thread");
        handlerThread.quitSafely();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        if (!this.e || this.f.t0) {
            return;
        }
        this.a.onClosed(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b = b();
        c();
        if (this.f.t0 || !(this.d || b)) {
            cameraDevice.close();
            return;
        }
        a();
        this.e = true;
        this.a.onDisconnected(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        boolean b = b();
        c();
        if (!this.f.t0 && (this.d || b)) {
            a();
            this.e = true;
            this.a.onError(cameraDevice, i);
            return;
        }
        this.f.j.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + bm9.e(i) + ", warm=" + this.b);
        cameraDevice.close();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b = b();
        a();
        c();
        if (b) {
            this.d = true;
            this.e = true;
            this.f.r0.add(cameraDevice);
            this.a.onOpened(cameraDevice);
            return;
        }
        this.f.j.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.b + ", released=" + this.f.t0);
        cameraDevice.close();
    }
}
