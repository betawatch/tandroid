package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import ci.y0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
        if (hVar.R) {
            h hVar2 = this.a;
            if (hVar2.x != null && !hVar2.T && !hVar2.X) {
                h hVar3 = this.a;
                if (hVar3.F == m0.c) {
                    hVar3.m("60 fps session configuration failed", null);
                    return;
                } else {
                    hVar3.s(new IllegalStateException("Camera capture session configuration failed"));
                    return;
                }
            }
        }
        this.a.j.b("stale capture session configuration failure ignored");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        String str;
        if (this.a.R) {
            h hVar = this.a;
            if (hVar.x != null) {
                hVar.y = cameraCaptureSession;
                try {
                    hVar.C = hVar.D;
                    hVar.z = hVar.k(true);
                    q qVar = this.a.v;
                    if (qVar != null) {
                        Handler handler = qVar.l;
                        if (qVar.V && handler != null) {
                            handler.post(new m(qVar, 1));
                        }
                    }
                    h hVar2 = this.a;
                    boolean z10 = hVar2.V;
                    hVar2.V = false;
                    hVar2.W = z10;
                    h hVar3 = this.a;
                    CameraCaptureSession cameraCaptureSession2 = hVar3.y;
                    CaptureRequest.Builder builder = hVar3.z;
                    if (cameraCaptureSession2 != null && builder != null) {
                        cameraCaptureSession2.setRepeatingRequest(builder.build(), hVar3.Q0, hVar3.n);
                    }
                    l lVar = this.a.j;
                    StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                    sb2.append(this.a.C);
                    sb2.append(", fpsRange=");
                    sb2.append(this.a.G);
                    sb2.append(", elapsedMs=");
                    sb2.append(h.l(this.a.g0));
                    sb2.append(", segmentElapsedMs=");
                    sb2.append(h.l(this.a.e0));
                    if (z10) {
                        str = ", switchElapsedMs=" + h.l(this.a.h0);
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    lVar.b(sb2.toString());
                    h hVar4 = this.a;
                    hVar4.c.post(new b(hVar4, 6));
                    h hVar5 = this.a;
                    k2.u uVar = hVar5.k;
                    k0 k0Var = hVar5.C;
                    l0 l0Var = hVar5.E;
                    m0 m0Var = hVar5.F;
                    Size size = hVar5.q;
                    Size size2 = hVar5.r;
                    h hVar6 = this.a;
                    ((r0) uVar.b).h.post(new y0(uVar, new g(k0Var, l0Var, m0Var, size, size2, hVar6.K, hVar6.p()), z10, 7));
                    k0 k0Var2 = this.a.B;
                    h hVar7 = this.a;
                    if (k0Var2 != hVar7.C) {
                        hVar7.E(hVar7.B);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    h hVar8 = this.a;
                    if (hVar8.F == m0.c) {
                        hVar8.m("60 fps request submission rejected", e);
                        return;
                    } else {
                        hVar8.s(e);
                        return;
                    }
                }
            }
        }
        cameraCaptureSession.close();
    }
}
