package ki;

import android.hardware.camera2.CameraDevice;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                this.a.q();
                return;
            }
            return;
        }
        if (hVar.U) {
            hVar.U = false;
            if (hVar.R) {
                this.a.q();
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        h hVar = this.a;
        boolean z10 = false;
        hVar.S = false;
        hVar.j.b("camera disconnected: id=" + cameraDevice.getId());
        if (this.a.R && !this.a.X) {
            h hVar2 = this.a;
            if (!hVar2.T && !hVar2.U) {
                z10 = true;
            }
        }
        h hVar3 = this.a;
        if (hVar3.x == cameraDevice) {
            hVar3.h();
            this.a.x = null;
        }
        cameraDevice.close();
        if (z10) {
            this.a.s(new IllegalStateException("Camera device disconnected"));
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        h hVar = this.a;
        hVar.S = false;
        if (hVar.x == cameraDevice) {
            hVar.h();
            hVar.x = null;
        }
        cameraDevice.close();
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
        hVar.S = false;
        hVar.j.b("camera opened: id=" + cameraDevice.getId() + ", elapsedMs=" + h.l(this.a.f0));
        if (this.a.R) {
            h hVar2 = this.a;
            if (!hVar2.T) {
                hVar2.x = cameraDevice;
                hVar2.i();
                return;
            }
        }
        cameraDevice.close();
    }
}
