package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import ci.y0;
import hg.k0;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class e extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ g a;

    public e(g gVar) {
        this.a = gVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        this.a.k(new IllegalStateException("Camera capture session configuration failed"));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        CameraDevice cameraDevice;
        String str;
        g gVar = this.a;
        if (!gVar.B || (cameraDevice = gVar.t) == null) {
            cameraCaptureSession.close();
            return;
        }
        gVar.u = cameraCaptureSession;
        try {
            gVar.v = cameraDevice.createCaptureRequest(3);
            g gVar2 = this.a;
            gVar2.v.addTarget(gVar2.p);
            g gVar3 = this.a;
            gVar3.v.addTarget(gVar3.q);
            g gVar4 = this.a;
            CaptureRequest.Builder builder = gVar4.v;
            CameraCharacteristics cameraCharacteristics = gVar4.l;
            int[] iArr = cameraCharacteristics == null ? null : (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr != null) {
                int length = iArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    if (iArr[i10] == 3) {
                        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
                        break;
                    }
                    i10++;
                }
            }
            g gVar5 = this.a;
            g.a(gVar5, gVar5.v);
            g gVar6 = this.a;
            gVar6.b(gVar6.v);
            g gVar7 = this.a;
            gVar7.v.set(CaptureRequest.FLASH_MODE, Integer.valueOf((gVar7.A && gVar7.h()) ? 2 : 0));
            m mVar = this.a.r;
            if (mVar != null) {
                Handler handler = mVar.j;
                if (mVar.T && handler != null) {
                    handler.post(new k(mVar, 1));
                }
            }
            cameraCaptureSession.setRepeatingRequest(this.a.v.build(), null, this.a.j);
            g gVar8 = this.a;
            boolean z10 = gVar8.E;
            gVar8.E = false;
            gVar8.U = gVar8.V;
            j jVar = gVar8.f;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("capture session configured: facing=");
            sb2.append(k0.z(this.a.U));
            sb2.append(", elapsedMs=");
            sb2.append(g.g(this.a.K));
            sb2.append(", segmentElapsedMs=");
            sb2.append(g.g(this.a.I));
            if (z10) {
                str = ", switchElapsedMs=" + g.g(this.a.L);
            } else {
                str = "";
            }
            sb2.append(str);
            jVar.b(sb2.toString());
            g gVar9 = this.a;
            gVar9.c.post(new a(gVar9, 5));
            g gVar10 = this.a;
            k2.u uVar = gVar10.g;
            ((h0) uVar.b).h.post(new y0(uVar, new f(gVar10.U, gVar10.W, gVar10.m, gVar10.n, gVar10.z, gVar10.h()), z10, 7));
            g gVar11 = this.a;
            int i11 = gVar11.T;
            if (i11 != gVar11.U) {
                gVar11.r(i11);
            }
        } catch (Exception e) {
            this.a.k(e);
        }
    }
}
