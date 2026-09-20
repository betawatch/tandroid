package ki;

import android.hardware.camera2.CameraDevice;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class d extends CameraDevice.StateCallback {
    public final /* synthetic */ h a;

    public d(h hVar) {
        this.a = hVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        h hVar = this.a;
        if (hVar.O) {
            hVar.O = false;
            if (hVar.M) {
                hVar.q();
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        h hVar = this.a;
        hVar.N = false;
        hVar.j.b("camera disconnected: id=" + cameraDevice.getId());
        cameraDevice.close();
        if (hVar.x == cameraDevice) {
            hVar.x = null;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        h hVar = this.a;
        hVar.N = false;
        cameraDevice.close();
        if (hVar.x == cameraDevice) {
            hVar.x = null;
        }
        StringBuilder sb2 = new StringBuilder("Camera device error: ");
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "CAMERA_SERVICE" : "CAMERA_DEVICE" : "CAMERA_DISABLED" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE");
        sb2.append(" (");
        sb2.append(i10);
        sb2.append(")");
        hVar.s(new IllegalStateException(sb2.toString()));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        h hVar = this.a;
        hVar.N = false;
        hVar.j.b("camera opened: id=" + cameraDevice.getId() + ", elapsedMs=" + h.l(hVar.Y));
        if (!hVar.M || hVar.O) {
            cameraDevice.close();
        } else {
            hVar.x = cameraDevice;
            hVar.j();
        }
    }
}
