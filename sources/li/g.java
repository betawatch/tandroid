package li;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import di.x0;
import ji.d4;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class g extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ g(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                if (lVar.B == cameraCaptureSession) {
                    lVar.B = null;
                    lVar.D = null;
                    lVar.p0 = false;
                    break;
                }
                break;
            default:
                l lVar2 = this.b;
                if (lVar2.A == cameraCaptureSession) {
                    lVar2.A = null;
                    lVar2.C = null;
                    lVar2.Q = false;
                    lVar2.j.b("capture session closed");
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                cameraCaptureSession.close();
                l lVar = this.b;
                if (lVar.m0 && lVar.s0 != null && cameraCaptureSession.getDevice() == lVar.s0) {
                    lVar.A("standby session configuration failed", null, true);
                    break;
                }
                break;
            default:
                cameraCaptureSession.close();
                if (this.b.z != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    l lVar2 = this.b;
                    if (device == lVar2.z) {
                        if (lVar2.A == cameraCaptureSession) {
                            lVar2.A = null;
                            lVar2.C = null;
                        }
                        if (lVar2.V) {
                            l lVar3 = this.b;
                            if (lVar3.z != null && !lVar3.b0) {
                                l lVar4 = this.b;
                                if (!lVar4.m0) {
                                    if (lVar4.s0 != null && !lVar4.l0) {
                                        if (!lVar4.X || !lVar4.D0) {
                                            lVar4.j.b("camera session configuration failed with warm device open");
                                            this.b.R("session configuration failed", null);
                                            break;
                                        } else {
                                            lVar4.L("session configuration failed", null);
                                            break;
                                        }
                                    } else if (lVar4.J != p0.c) {
                                        lVar4.N(new IllegalStateException("Camera capture session configuration failed"));
                                        break;
                                    } else {
                                        lVar4.B("60 fps session configuration failed", null);
                                        break;
                                    }
                                } else {
                                    lVar4.A("active session configuration failed", null, false);
                                    break;
                                }
                            }
                        }
                        this.b.j.b("stale capture session configuration failure ignored");
                        break;
                    }
                }
                this.b.j.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface surface;
        j jVar;
        String str;
        switch (this.a) {
            case 0:
                if (this.b.V) {
                    l lVar = this.b;
                    if (lVar.m0 && lVar.s0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        l lVar2 = this.b;
                        CameraDevice cameraDevice = lVar2.s0;
                        if (device == cameraDevice && (surface = lVar2.v) != null && (jVar = lVar2.w0) != null) {
                            try {
                                lVar2.B = cameraCaptureSession;
                                lVar2.D = lVar2.x(cameraDevice, surface, jVar, false, true);
                                CaptureRequest build = this.b.D.build();
                                l lVar3 = this.b;
                                cameraCaptureSession.setRepeatingRequest(build, lVar3.t1, lVar3.n);
                                l lVar4 = this.b;
                                lVar4.p0 = true;
                                lVar4.j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + l.z(this.b.G0));
                                l.f(this.b);
                                return;
                            } catch (Exception e) {
                                this.b.A("standby request submission failed", e, true);
                                return;
                            }
                        }
                    }
                }
                this.b.j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.b.V && this.b.z != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    l lVar5 = this.b;
                    CameraDevice cameraDevice2 = lVar5.z;
                    if (device2 == cameraDevice2) {
                        lVar5.A = cameraCaptureSession;
                        try {
                            lVar5.G = lVar5.H;
                            if (cameraDevice2 == null || lVar5.u == null) {
                                throw new IllegalStateException("Camera request surfaces are unavailable");
                            }
                            lVar5.C = lVar5.x(cameraDevice2, lVar5.u, lVar5.l(), true, true);
                            u uVar = this.b.w;
                            if (uVar != null) {
                                Handler handler = uVar.u;
                                if (uVar.r0 && handler != null) {
                                    handler.post(new q(uVar, 1));
                                }
                            }
                            l lVar6 = this.b;
                            boolean z10 = lVar6.m0 && lVar6.x0 != null;
                            boolean z11 = lVar6.Z && !z10;
                            CameraCaptureSession cameraCaptureSession2 = lVar6.A;
                            CaptureRequest.Builder builder = lVar6.C;
                            if (cameraCaptureSession2 != null && builder != null) {
                                cameraCaptureSession2.setRepeatingRequest(builder.build(), lVar6.t1, lVar6.n);
                            }
                            l lVar7 = this.b;
                            if (lVar7.m0) {
                                lVar7.o0 = true;
                            }
                            if (!z10) {
                                lVar7.Z = false;
                            }
                            if (z11) {
                                lVar7.X = false;
                            }
                            lVar7.a0 = z11;
                            p pVar = this.b.j;
                            StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                            sb2.append(this.b.G);
                            sb2.append(", fpsRange=");
                            sb2.append(this.b.K);
                            sb2.append(", elapsedMs=");
                            sb2.append(l.z(this.b.G0));
                            sb2.append(", segmentElapsedMs=");
                            sb2.append(l.z(this.b.E0));
                            if (z11) {
                                StringBuilder sb3 = new StringBuilder(", switchPath=");
                                sb3.append(this.b.D0 ? "WARM_DEVICE" : "SEQUENTIAL");
                                sb3.append(", switchElapsedMs=");
                                sb3.append(l.z(this.b.H0));
                                str = sb3.toString();
                            } else {
                                str = "";
                            }
                            sb2.append(str);
                            pVar.b(sb2.toString());
                            l lVar8 = this.b;
                            lVar8.c.post(new a(lVar8, 8));
                            l lVar9 = this.b;
                            d4 d4Var = lVar9.k;
                            n0 n0Var = lVar9.G;
                            o0 o0Var = lVar9.I;
                            p0 p0Var = lVar9.J;
                            Size size = lVar9.q;
                            Size size2 = lVar9.r;
                            l lVar10 = this.b;
                            ((u0) d4Var.b).i.post(new x0(d4Var, new i(n0Var, o0Var, p0Var, size, size2, lVar10.O, lVar10.F()), z11, 8));
                            if (z10) {
                                l.f(this.b);
                                return;
                            }
                            n0 n0Var2 = this.b.F;
                            l lVar11 = this.b;
                            if (n0Var2 != lVar11.G) {
                                lVar11.a0(lVar11.F);
                                return;
                            }
                            return;
                        } catch (Exception e7) {
                            l lVar12 = this.b;
                            if (lVar12.m0) {
                                lVar12.A("active request submission failed", e7, false);
                                return;
                            }
                            if (lVar12.X && lVar12.D0) {
                                lVar12.L("request submission failed", e7);
                                return;
                            } else if (lVar12.J == p0.c) {
                                lVar12.B("60 fps request submission rejected", e7);
                                return;
                            } else {
                                lVar12.N(e7);
                                return;
                            }
                        }
                    }
                }
                this.b.j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}
