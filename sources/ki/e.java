package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.os.Build;
import android.os.Handler;
import ci.y0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class e extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ h a;

    public e(h hVar) {
        this.a = hVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        h hVar = this.a;
        if (hVar.y != cameraCaptureSession) {
            return;
        }
        hVar.y = null;
        hVar.z = null;
        hVar.M = false;
        hVar.j.b("capture session closed");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        h hVar = this.a;
        if (hVar.y == cameraCaptureSession) {
            hVar.y = null;
            hVar.z = null;
        }
        if (!hVar.R || hVar.x == null || hVar.T || hVar.X) {
            hVar.j.b("stale capture session configuration failure ignored");
        } else if (hVar.F == k0.c) {
            hVar.o("60 fps session configuration failed", null);
        } else {
            hVar.u(new IllegalStateException("Camera capture session configuration failed"));
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        String str;
        h hVar = this.a;
        if (!hVar.R || hVar.x == null) {
            cameraCaptureSession.close();
            return;
        }
        hVar.y = cameraCaptureSession;
        try {
            boolean z10 = Build.VERSION.SDK_INT >= 23 && (cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession);
            hVar.b0 = z10;
            if (hVar.a0 && !z10) {
                hVar.o("HAL returned a regular session for a high-speed request", null);
                return;
            }
            hVar.C = hVar.D;
            hVar.z = hVar.l(true);
            o oVar = this.a.v;
            if (oVar != null) {
                Handler handler = oVar.k;
                if (oVar.U && handler != null) {
                    handler.post(new m(oVar, 1));
                }
            }
            h hVar2 = this.a;
            boolean z11 = hVar2.V;
            hVar2.V = false;
            hVar2.W = z11;
            this.a.F();
            k kVar = this.a.j;
            StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
            sb2.append(this.a.C);
            sb2.append(", mode=");
            sb2.append(this.a.b0 ? "CONSTRAINED_HIGH_SPEED" : "REGULAR");
            sb2.append(", fpsRange=");
            sb2.append(this.a.G);
            sb2.append(", elapsedMs=");
            sb2.append(h.n(this.a.f0));
            sb2.append(", segmentElapsedMs=");
            sb2.append(h.n(this.a.d0));
            if (z11) {
                str = ", switchElapsedMs=" + h.n(this.a.g0);
            } else {
                str = "";
            }
            sb2.append(str);
            kVar.b(sb2.toString());
            h hVar3 = this.a;
            hVar3.c.post(new b(hVar3, 6));
            h hVar4 = this.a;
            e0 e0Var = hVar4.k;
            ((q0) e0Var.b).h.post(new y0(e0Var, new g(hVar4.C, hVar4.E, hVar4.F, hVar4.q, hVar4.r, hVar4.K, hVar4.q()), z11, 7));
            h hVar5 = this.a;
            i0 i0Var = hVar5.B;
            if (i0Var != hVar5.C) {
                hVar5.G(i0Var);
            }
        } catch (Exception e) {
            h hVar6 = this.a;
            if (hVar6.F == k0.c) {
                hVar6.o("60 fps request submission rejected", e);
            } else {
                hVar6.u(e);
            }
        }
    }
}
