package ki;

import android.hardware.camera2.CameraDevice;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class d extends CameraDevice.StateCallback {
    public final /* synthetic */ h a;

    public d(h hVar) {
        this.a = hVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        h hVar = this.a;
        if (hVar.T) {
            hVar.T = false;
            if (hVar.R) {
                hVar.s();
                return;
            }
            return;
        }
        if (hVar.U) {
            hVar.U = false;
            if (hVar.R) {
                hVar.s();
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        h hVar = this.a;
        hVar.S = false;
        hVar.j.b("camera disconnected: id=" + cameraDevice.getId());
        if (hVar.x == cameraDevice) {
            hVar.i();
            hVar.x = null;
        }
        cameraDevice.close();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        h hVar = this.a;
        hVar.S = false;
        if (hVar.x == cameraDevice) {
            hVar.i();
            hVar.x = null;
        }
        cameraDevice.close();
        StringBuilder sb2 = new StringBuilder("Camera device error: ");
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "CAMERA_SERVICE" : "CAMERA_DEVICE" : "CAMERA_DISABLED" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE");
        sb2.append(" (");
        sb2.append(i10);
        sb2.append(")");
        hVar.u(new IllegalStateException(sb2.toString()));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        h hVar = this.a;
        hVar.S = false;
        hVar.j.b("camera opened: id=" + cameraDevice.getId() + ", elapsedMs=" + h.n(hVar.e0));
        if (!hVar.R || hVar.T) {
            cameraDevice.close();
        } else {
            hVar.x = cameraDevice;
            hVar.k();
        }
    }
}
