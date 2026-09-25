package ki;

import android.hardware.camera2.CameraDevice;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class e extends CameraDevice.StateCallback {
    public final /* synthetic */ i a;

    public e(i iVar) {
        this.a = iVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        i iVar = this.a;
        if (iVar.U) {
            iVar.U = false;
            if (iVar.S) {
                this.a.r();
                return;
            }
            return;
        }
        if (iVar.V) {
            iVar.V = false;
            if (iVar.S) {
                this.a.r();
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        i iVar = this.a;
        boolean z10 = false;
        iVar.T = false;
        iVar.j.b("camera disconnected: id=" + cameraDevice.getId());
        if (this.a.S && !this.a.Y) {
            i iVar2 = this.a;
            if (!iVar2.U && !iVar2.V) {
                z10 = true;
            }
        }
        i iVar3 = this.a;
        if (iVar3.y == cameraDevice) {
            iVar3.i();
            this.a.y = null;
        }
        cameraDevice.close();
        if (z10) {
            this.a.t(new IllegalStateException("Camera device disconnected"));
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        i iVar = this.a;
        iVar.T = false;
        if (iVar.y == cameraDevice) {
            iVar.i();
            iVar.y = null;
        }
        cameraDevice.close();
        StringBuilder sb2 = new StringBuilder("Camera device error: ");
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "CAMERA_SERVICE" : "CAMERA_DEVICE" : "CAMERA_DISABLED" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE");
        sb2.append(" (");
        sb2.append(i10);
        sb2.append(")");
        iVar.t(new IllegalStateException(sb2.toString()));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        i iVar = this.a;
        iVar.T = false;
        iVar.j.b("camera opened: id=" + cameraDevice.getId() + ", elapsedMs=" + i.m(this.a.g0));
        if (this.a.S) {
            i iVar2 = this.a;
            if (!iVar2.U) {
                iVar2.y = cameraDevice;
                iVar2.j();
                return;
            }
        }
        cameraDevice.close();
    }
}
