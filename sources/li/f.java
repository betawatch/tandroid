package li;

import android.hardware.camera2.CameraDevice;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class f extends CameraDevice.StateCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ f(l lVar, int i10) {
        this.a = i10;
        this.b = lVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                if (!l.d(this.b, cameraDevice) && !l.e(this.b, cameraDevice)) {
                    l lVar = this.b;
                    if (cameraDevice != lVar.s0) {
                        if (!lVar.X) {
                            if (lVar.Y) {
                                lVar.Y = false;
                                if (lVar.V) {
                                    this.b.I();
                                    break;
                                }
                            }
                        } else {
                            lVar.j.b("camera closed for sequential switch: elapsedMs=" + l.z(this.b.B0) + ", switchElapsedMs=" + l.z(this.b.H0));
                            l lVar2 = this.b;
                            lVar2.X = false;
                            if (lVar2.V) {
                                this.b.I();
                                break;
                            }
                        }
                    } else {
                        lVar.s0 = null;
                        lVar.j.b("standby camera closed: id=" + cameraDevice.getId());
                        break;
                    }
                }
                break;
            default:
                l lVar3 = this.b;
                if (!l.d(lVar3, cameraDevice) && !l.e(lVar3, cameraDevice) && cameraDevice == lVar3.s0) {
                    lVar3.s0 = null;
                    lVar3.j.b("standby camera closed: id=" + cameraDevice.getId());
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                boolean z10 = false;
                lVar.W = false;
                lVar.j.b("camera disconnected: id=" + cameraDevice.getId());
                if (!this.b.G(cameraDevice)) {
                    l lVar2 = this.b;
                    if (cameraDevice != lVar2.s0) {
                        if (lVar2.V && !this.b.b0) {
                            l lVar3 = this.b;
                            if (!lVar3.X && !lVar3.Y) {
                                z10 = true;
                            }
                        }
                        l lVar4 = this.b;
                        if (lVar4.z == cameraDevice) {
                            lVar4.q();
                            this.b.z = null;
                        }
                        cameraDevice.close();
                        if (z10) {
                            this.b.N(new IllegalStateException("Camera device disconnected"));
                            break;
                        }
                    } else if (!lVar2.m0) {
                        lVar2.s0 = null;
                        lVar2.t0 = cameraDevice;
                        cameraDevice.close();
                        this.b.y("standby device disconnected", null);
                        break;
                    } else {
                        l.b(lVar2, cameraDevice, "disconnected", null);
                        break;
                    }
                } else {
                    this.b.j.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    break;
                }
                break;
            default:
                l lVar5 = this.b;
                if (!lVar5.G(cameraDevice)) {
                    l.b(lVar5, cameraDevice, "disconnected", null);
                    break;
                } else {
                    lVar5.j.b("warm camera disconnected while recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    break;
                }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                lVar.W = false;
                if (!lVar.G(cameraDevice)) {
                    if (cameraDevice != lVar.s0) {
                        if (lVar.z == cameraDevice) {
                            lVar.q();
                            lVar.z = null;
                        }
                        cameraDevice.close();
                        lVar.N(new IllegalStateException("Camera device error: " + l.c(i10) + " (" + i10 + ")"));
                        break;
                    } else if (!lVar.m0) {
                        lVar.s0 = null;
                        lVar.t0 = cameraDevice;
                        cameraDevice.close();
                        lVar.y("standby device error=" + l.c(i10) + " (" + i10 + ")", null);
                        break;
                    } else {
                        l.b(lVar, cameraDevice, "error=" + l.c(i10) + " (" + i10 + ")", null);
                        break;
                    }
                } else {
                    lVar.j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + l.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    break;
                }
            default:
                l lVar2 = this.b;
                if (!lVar2.G(cameraDevice)) {
                    l.b(lVar2, cameraDevice, "error=" + l.c(i10) + " (" + i10 + ")", new IllegalStateException("Warm camera device error: " + l.c(i10) + " (" + i10 + ")"));
                    break;
                } else {
                    lVar2.j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + l.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    break;
                }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        switch (this.a) {
            case 0:
                l lVar = this.b;
                lVar.W = false;
                p pVar = lVar.j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(l.z(this.b.F0));
                if (this.b.Z) {
                    str = ", switchElapsedMs=" + l.z(this.b.H0);
                } else {
                    str = "";
                }
                sb2.append(str);
                pVar.b(sb2.toString());
                if (this.b.V) {
                    l lVar2 = this.b;
                    if (!lVar2.X) {
                        lVar2.z = cameraDevice;
                        if (!lVar2.m0) {
                            lVar2.u();
                            break;
                        } else if (!lVar2.r0 && lVar2.s0 != null) {
                            l.a(lVar2);
                            break;
                        } else {
                            lVar2.j.b("active camera opened; waiting for dual peer before sessions");
                            break;
                        }
                    }
                }
                cameraDevice.close();
                break;
            default:
                l lVar3 = this.b;
                lVar3.r0 = false;
                if (lVar3.V && !this.b.b0) {
                    l lVar4 = this.b;
                    if (!lVar4.l0 && lVar4.w0 != null && cameraDevice.getId().equals(this.b.w0.a)) {
                        l lVar5 = this.b;
                        lVar5.s0 = cameraDevice;
                        lVar5.j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.b.w0.b + ", elapsedMs=" + l.z(this.b.A0));
                        l lVar6 = this.b;
                        if (lVar6.z != null && lVar6.A == null && !lVar6.X) {
                            if (lVar6.m0) {
                                lVar6.j.b("both camera devices opened; configuring dual sessions");
                                l.a(this.b);
                            } else {
                                lVar6.j.b("both camera devices opened; configuring active session");
                                this.b.u();
                            }
                        }
                        l lVar7 = this.b;
                        n0 n0Var = lVar7.x0;
                        if (n0Var != null && n0Var == lVar7.w0.b) {
                            lVar7.x0 = null;
                            if (!lVar7.c0(n0Var)) {
                                this.b.t();
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
