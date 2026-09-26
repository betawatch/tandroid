package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import ci.y0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class f extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ i a;

    public f(i iVar) {
        this.a = iVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        i iVar = this.a;
        if (iVar.z != cameraCaptureSession) {
            return;
        }
        iVar.z = null;
        iVar.A = null;
        iVar.N = false;
        iVar.j.b("capture session closed");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        i iVar = this.a;
        if (iVar.z == cameraCaptureSession) {
            iVar.z = null;
            iVar.A = null;
        }
        if (iVar.S) {
            i iVar2 = this.a;
            if (iVar2.y != null && !iVar2.U && !iVar2.Y) {
                i iVar3 = this.a;
                if (iVar3.G == n0.c) {
                    iVar3.n("60 fps session configuration failed", null);
                    return;
                } else {
                    iVar3.t(new IllegalStateException("Camera capture session configuration failed"));
                    return;
                }
            }
        }
        this.a.j.b("stale capture session configuration failure ignored");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        String str;
        if (this.a.S) {
            i iVar = this.a;
            if (iVar.y != null) {
                iVar.z = cameraCaptureSession;
                try {
                    iVar.D = iVar.E;
                    iVar.A = iVar.l(true);
                    q qVar = this.a.v;
                    if (qVar != null) {
                        Handler handler = qVar.m;
                        if (qVar.Z && handler != null) {
                            handler.post(new n(qVar, 1));
                        }
                    }
                    i iVar2 = this.a;
                    boolean z10 = iVar2.W;
                    iVar2.W = false;
                    iVar2.X = z10;
                    i iVar3 = this.a;
                    CameraCaptureSession cameraCaptureSession2 = iVar3.z;
                    CaptureRequest.Builder builder = iVar3.A;
                    if (cameraCaptureSession2 != null && builder != null) {
                        cameraCaptureSession2.setRepeatingRequest(builder.build(), iVar3.S0, iVar3.n);
                    }
                    m mVar = this.a.j;
                    StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                    sb2.append(this.a.D);
                    sb2.append(", fpsRange=");
                    sb2.append(this.a.H);
                    sb2.append(", elapsedMs=");
                    sb2.append(i.m(this.a.h0));
                    sb2.append(", segmentElapsedMs=");
                    sb2.append(i.m(this.a.f0));
                    if (z10) {
                        str = ", switchElapsedMs=" + i.m(this.a.i0);
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    mVar.b(sb2.toString());
                    i iVar4 = this.a;
                    iVar4.c.post(new a(iVar4, 7));
                    i iVar5 = this.a;
                    k2.u uVar = iVar5.k;
                    l0 l0Var = iVar5.D;
                    m0 m0Var = iVar5.F;
                    n0 n0Var = iVar5.G;
                    Size size = iVar5.q;
                    Size size2 = iVar5.r;
                    i iVar6 = this.a;
                    ((s0) uVar.b).h.post(new y0(uVar, new h(l0Var, m0Var, n0Var, size, size2, iVar6.L, iVar6.q()), z10, 7));
                    l0 l0Var2 = this.a.C;
                    i iVar7 = this.a;
                    if (l0Var2 != iVar7.D) {
                        iVar7.F(iVar7.C);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    i iVar8 = this.a;
                    if (iVar8.G == n0.c) {
                        iVar8.n("60 fps request submission rejected", e);
                        return;
                    } else {
                        iVar8.t(e);
                        return;
                    }
                }
            }
        }
        cameraCaptureSession.close();
    }
}
