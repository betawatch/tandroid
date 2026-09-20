package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.os.Handler;
import android.util.Range;
import ci.y0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class e extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ h a;

    public e(h hVar) {
        this.a = hVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        h hVar = this.a;
        if (hVar.F == j0.c) {
            hVar.m("60 fps session configuration failed", null);
        } else {
            hVar.s(new IllegalStateException("Camera capture session configuration failed"));
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CameraDevice cameraDevice;
        String str;
        h hVar = this.a;
        if (!hVar.M || (cameraDevice = hVar.x) == null) {
            cameraCaptureSession.close();
            return;
        }
        hVar.y = cameraCaptureSession;
        try {
            boolean z10 = Build.VERSION.SDK_INT >= 23 && (cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession);
            hVar.V = z10;
            int[] iArr = null;
            if (hVar.U && !z10) {
                hVar.m("HAL returned a regular session for a high-speed request", null);
                return;
            }
            hVar.C = hVar.D;
            hVar.z = cameraDevice.createCaptureRequest(3);
            h hVar2 = this.a;
            hVar2.z.addTarget(hVar2.t);
            h hVar3 = this.a;
            hVar3.z.addTarget(hVar3.u);
            h hVar4 = this.a;
            CaptureRequest.Builder builder = hVar4.z;
            CameraCharacteristics cameraCharacteristics = hVar4.p;
            if (cameraCharacteristics != null) {
                iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            }
            if (h.i(iArr, 3)) {
                builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
            }
            h hVar5 = this.a;
            CaptureRequest.Builder builder2 = hVar5.z;
            k kVar = hVar5.j;
            Range range = hVar5.G;
            if (range != null) {
                builder2.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, range);
                kVar.b("capture FPS range selected: " + hVar5.G);
            } else {
                kVar.b("capture FPS range unavailable; HAL default will be used");
            }
            h hVar6 = this.a;
            hVar6.b(hVar6.z);
            h hVar7 = this.a;
            hVar7.a(hVar7.z);
            o oVar = this.a.v;
            if (oVar != null) {
                Handler handler = oVar.k;
                if (oVar.U && handler != null) {
                    handler.post(new m(oVar, 1));
                }
            }
            h hVar8 = this.a;
            boolean z11 = hVar8.P;
            hVar8.P = false;
            hVar8.Q = z11;
            this.a.A();
            k kVar2 = this.a.j;
            StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
            sb2.append(this.a.C);
            sb2.append(", mode=");
            sb2.append(this.a.V ? "CONSTRAINED_HIGH_SPEED" : "REGULAR");
            sb2.append(", fpsRange=");
            sb2.append(this.a.G);
            sb2.append(", elapsedMs=");
            sb2.append(h.l(this.a.Z));
            sb2.append(", segmentElapsedMs=");
            sb2.append(h.l(this.a.X));
            if (z11) {
                str = ", switchElapsedMs=" + h.l(this.a.a0);
            } else {
                str = "";
            }
            sb2.append(str);
            kVar2.b(sb2.toString());
            h hVar9 = this.a;
            hVar9.c.post(new b(hVar9, 6));
            h hVar10 = this.a;
            k2.u uVar = hVar10.k;
            ((o0) uVar.b).h.post(new y0(uVar, new g(hVar10.C, hVar10.E, hVar10.F, hVar10.q, hVar10.r, hVar10.K, hVar10.o()), z11, 7));
            h hVar11 = this.a;
            h0 h0Var = hVar11.B;
            if (h0Var != hVar11.C) {
                hVar11.B(h0Var);
            }
        } catch (Exception e) {
            h hVar12 = this.a;
            if (hVar12.F == j0.c) {
                hVar12.m("60 fps request submission rejected", e);
            } else {
                hVar12.s(e);
            }
        }
    }
}
