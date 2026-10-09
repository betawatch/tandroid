package ki;

import android.hardware.camera2.CameraDevice;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class e extends CameraDevice.StateCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ e(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                if (cameraDevice != jVar.l0) {
                    if (cameraDevice != jVar.k0) {
                        if (!jVar.U) {
                            if (jVar.V) {
                                jVar.V = false;
                                if (jVar.S) {
                                    this.b.y();
                                    break;
                                }
                            }
                        } else {
                            jVar.j.b("camera closed for sequential switch: elapsedMs=" + j.s(this.b.p0) + ", switchElapsedMs=" + j.s(this.b.v0));
                            j jVar2 = this.b;
                            jVar2.U = false;
                            if (jVar2.S) {
                                this.b.y();
                                break;
                            }
                        }
                    } else {
                        jVar.k0 = null;
                        jVar.j.b("standby camera closed: id=" + cameraDevice.getId());
                        break;
                    }
                } else {
                    jVar.l0 = null;
                    jVar.j.b("standby camera closed: id=" + cameraDevice.getId());
                    break;
                }
                break;
            default:
                j jVar3 = this.b;
                if (cameraDevice != jVar3.l0) {
                    if (cameraDevice == jVar3.k0) {
                        jVar3.k0 = null;
                        jVar3.j.b("standby camera closed: id=" + cameraDevice.getId());
                        break;
                    }
                } else {
                    jVar3.l0 = null;
                    jVar3.j.b("standby camera closed: id=" + cameraDevice.getId());
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                boolean z10 = false;
                jVar.T = false;
                jVar.j.b("camera disconnected: id=" + cameraDevice.getId());
                j jVar2 = this.b;
                if (cameraDevice != jVar2.k0) {
                    if (jVar2.S && !this.b.Y) {
                        j jVar3 = this.b;
                        if (!jVar3.U && !jVar3.V) {
                            z10 = true;
                        }
                    }
                    j jVar4 = this.b;
                    if (jVar4.y == cameraDevice) {
                        jVar4.m();
                        this.b.y = null;
                    }
                    cameraDevice.close();
                    if (z10) {
                        this.b.C(new IllegalStateException("Camera device disconnected"));
                        break;
                    }
                } else {
                    jVar2.k0 = null;
                    jVar2.l0 = cameraDevice;
                    cameraDevice.close();
                    this.b.r("standby device disconnected", null);
                    break;
                }
                break;
            default:
                j.b(this.b, cameraDevice, "disconnected", null);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                jVar.T = false;
                if (cameraDevice != jVar.k0) {
                    if (jVar.y == cameraDevice) {
                        jVar.m();
                        jVar.y = null;
                    }
                    cameraDevice.close();
                    jVar.C(new IllegalStateException("Camera device error: " + j.a(i10) + " (" + i10 + ")"));
                    break;
                } else {
                    jVar.k0 = null;
                    jVar.l0 = cameraDevice;
                    cameraDevice.close();
                    jVar.r("standby device error=" + j.a(i10) + " (" + i10 + ")", null);
                    break;
                }
            default:
                j.b(this.b, cameraDevice, "error=" + j.a(i10) + " (" + i10 + ")", new IllegalStateException("Warm camera device error: " + j.a(i10) + " (" + i10 + ")"));
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        switch (this.a) {
            case 0:
                j jVar = this.b;
                jVar.T = false;
                n nVar = jVar.j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(j.s(this.b.t0));
                if (this.b.W) {
                    str = ", switchElapsedMs=" + j.s(this.b.v0);
                } else {
                    str = "";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                if (this.b.S) {
                    j jVar2 = this.b;
                    if (!jVar2.U) {
                        jVar2.y = cameraDevice;
                        if (!jVar2.h0 || !jVar2.j0) {
                            jVar2.o();
                            break;
                        } else {
                            jVar2.j.b("active camera opened; waiting for warm camera before session");
                            break;
                        }
                    }
                }
                cameraDevice.close();
                break;
            default:
                j jVar3 = this.b;
                jVar3.j0 = false;
                if (jVar3.S && !this.b.Y) {
                    j jVar4 = this.b;
                    if (!jVar4.i0 && jVar4.m0 != null && cameraDevice.getId().equals(this.b.m0.a)) {
                        j jVar5 = this.b;
                        jVar5.k0 = cameraDevice;
                        jVar5.j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.b.m0.b + ", elapsedMs=" + j.s(this.b.o0));
                        j jVar6 = this.b;
                        if (jVar6.y != null && jVar6.z == null && !jVar6.U) {
                            jVar6.j.b("both camera devices opened; configuring active session");
                            this.b.o();
                        }
                        j jVar7 = this.b;
                        m0 m0Var = jVar7.n0;
                        if (m0Var != null && m0Var == jVar7.m0.b) {
                            jVar7.n0 = null;
                            if (!jVar7.P(m0Var)) {
                                this.b.n();
                                break;
                            }
                        }
                    }
                }
                this.b.j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                break;
        }
    }
}
