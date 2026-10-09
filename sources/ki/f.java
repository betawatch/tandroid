package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import ci.x0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class f extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ j a;

    public f(j jVar) {
        this.a = jVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        j jVar = this.a;
        if (jVar.z != cameraCaptureSession) {
            return;
        }
        jVar.z = null;
        jVar.A = null;
        jVar.N = false;
        jVar.j.b("capture session closed");
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        cameraCaptureSession.close();
        if (this.a.y != null) {
            CameraDevice device = cameraCaptureSession.getDevice();
            j jVar = this.a;
            if (device == jVar.y) {
                if (jVar.z == cameraCaptureSession) {
                    jVar.z = null;
                    jVar.A = null;
                }
                if (jVar.S) {
                    j jVar2 = this.a;
                    if (jVar2.y != null && !jVar2.Y) {
                        j jVar3 = this.a;
                        if (jVar3.k0 == null || jVar3.i0) {
                            if (jVar3.G == o0.c) {
                                jVar3.t("60 fps session configuration failed", null);
                                return;
                            } else {
                                jVar3.C(new IllegalStateException("Camera capture session configuration failed"));
                                return;
                            }
                        }
                        jVar3.j.b("camera session configuration failed with warm device open; retrying with standby device closed");
                        j jVar4 = this.a;
                        if (jVar4.U) {
                            jVar4.r0 = false;
                        }
                        jVar4.r("session configuration failed", null);
                        this.a.o();
                        return;
                    }
                }
                this.a.j.b("stale capture session configuration failure ignored");
                return;
            }
        }
        this.a.j.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        String str;
        if (this.a.S && this.a.y != null) {
            CameraDevice device = cameraCaptureSession.getDevice();
            j jVar = this.a;
            if (device == jVar.y) {
                jVar.z = cameraCaptureSession;
                try {
                    jVar.D = jVar.E;
                    jVar.A = jVar.q(true);
                    r rVar = this.a.v;
                    if (rVar != null) {
                        Handler handler = rVar.m;
                        if (rVar.Z && handler != null) {
                            handler.post(new o(rVar, 1));
                        }
                    }
                    j jVar2 = this.a;
                    boolean z10 = jVar2.W;
                    jVar2.W = false;
                    if (z10) {
                        jVar2.U = false;
                    }
                    jVar2.X = z10;
                    j jVar3 = this.a;
                    CameraCaptureSession cameraCaptureSession2 = jVar3.z;
                    CaptureRequest.Builder builder = jVar3.A;
                    if (cameraCaptureSession2 != null && builder != null) {
                        cameraCaptureSession2.setRepeatingRequest(builder.build(), jVar3.g1, jVar3.n);
                    }
                    n nVar = this.a.j;
                    StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                    sb2.append(this.a.D);
                    sb2.append(", fpsRange=");
                    sb2.append(this.a.H);
                    sb2.append(", elapsedMs=");
                    sb2.append(j.s(this.a.u0));
                    sb2.append(", segmentElapsedMs=");
                    sb2.append(j.s(this.a.s0));
                    if (z10) {
                        StringBuilder sb3 = new StringBuilder(", switchPath=");
                        sb3.append(this.a.r0 ? "WARM_DEVICE" : "SEQUENTIAL");
                        sb3.append(", switchElapsedMs=");
                        sb3.append(j.s(this.a.v0));
                        str = sb3.toString();
                    } else {
                        str = "";
                    }
                    sb2.append(str);
                    nVar.b(sb2.toString());
                    j jVar4 = this.a;
                    jVar4.c.post(new a(jVar4, 7));
                    j jVar5 = this.a;
                    xa.d dVar = jVar5.k;
                    m0 m0Var = jVar5.D;
                    n0 n0Var = jVar5.F;
                    o0 o0Var = jVar5.G;
                    Size size = jVar5.q;
                    Size size2 = jVar5.r;
                    j jVar6 = this.a;
                    ((t0) dVar.b).i.post(new x0(dVar, new h(m0Var, n0Var, o0Var, size, size2, jVar6.L, jVar6.x()), z10, 7));
                    m0 m0Var2 = this.a.C;
                    j jVar7 = this.a;
                    if (m0Var2 != jVar7.D) {
                        jVar7.O(jVar7.C);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    j jVar8 = this.a;
                    if (jVar8.G == o0.c) {
                        jVar8.t("60 fps request submission rejected", e7);
                        return;
                    } else {
                        jVar8.C(e7);
                        return;
                    }
                }
            }
        }
        this.a.j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
        cameraCaptureSession.close();
    }
}
