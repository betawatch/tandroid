package ki;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import java.util.Arrays;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class d extends CameraDevice.StateCallback {
    public final /* synthetic */ g a;

    public d(g gVar) {
        this.a = gVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        g gVar = this.a;
        if (gVar.D) {
            gVar.D = false;
            if (gVar.B) {
                gVar.i();
            }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        g gVar = this.a;
        gVar.C = false;
        gVar.f.b("camera disconnected: id=" + cameraDevice.getId());
        cameraDevice.close();
        if (gVar.t == cameraDevice) {
            gVar.t = null;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        g gVar = this.a;
        gVar.C = false;
        cameraDevice.close();
        if (gVar.t == cameraDevice) {
            gVar.t = null;
        }
        StringBuilder sb2 = new StringBuilder("Camera device error: ");
        sb2.append(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN" : "CAMERA_SERVICE" : "CAMERA_DEVICE" : "CAMERA_DISABLED" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE");
        sb2.append(" (");
        sb2.append(i10);
        sb2.append(")");
        gVar.k(new IllegalStateException(sb2.toString()));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        g gVar = this.a;
        gVar.C = false;
        j jVar = gVar.f;
        jVar.b("camera opened: id=" + cameraDevice.getId() + ", elapsedMs=" + g.g(gVar.J));
        if (!gVar.B || gVar.D) {
            cameraDevice.close();
            return;
        }
        gVar.t = cameraDevice;
        if (gVar.p == null || gVar.q == null) {
            return;
        }
        try {
            gVar.K = SystemClock.elapsedRealtimeNanos();
            jVar.b("capture session requested: preview=" + gVar.m + ", recording=" + gVar.n);
            cameraDevice.createCaptureSession(Arrays.asList(gVar.p, gVar.q), gVar.Q, gVar.j);
        } catch (CameraAccessException e) {
            gVar.k(e);
        }
    }
}
