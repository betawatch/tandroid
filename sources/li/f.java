package li;

import android.hardware.camera2.CameraDevice;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                    if (cameraDevice != lVar.t0) {
                        if (!lVar.X) {
                            if (lVar.Y) {
                                lVar.Y = false;
                                if (lVar.V) {
                                    this.b.I();
                                    break;
                                }
                            }
                        } else {
                            lVar.j.b("camera closed for sequential switch: elapsedMs=" + l.z(this.b.C0) + ", switchElapsedMs=" + l.z(this.b.I0));
                            l lVar2 = this.b;
                            lVar2.X = false;
                            if (lVar2.V) {
                                this.b.I();
                                break;
                            }
                        }
                    } else {
                        lVar.t0 = null;
                        lVar.j.b("standby camera closed: id=" + cameraDevice.getId());
                        break;
                    }
                }
                break;
            default:
                l lVar3 = this.b;
                if (!l.d(lVar3, cameraDevice) && !l.e(lVar3, cameraDevice) && cameraDevice == lVar3.t0) {
                    lVar3.t0 = null;
                    lVar3.j.b("standby camera closed: id=" + cameraDevice.getId());
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean z10;
        switch (this.a) {
            case 0:
                l lVar = this.b;
                boolean z11 = false;
                lVar.W = false;
                lVar.j.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.b.G(cameraDevice)) {
                    this.b.j.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                l lVar2 = this.b;
                if (cameraDevice == lVar2.t0) {
                    if (lVar2.n0) {
                        l.b(lVar2, cameraDevice, "disconnected", null);
                        return;
                    }
                    lVar2.t0 = null;
                    lVar2.u0 = cameraDevice;
                    cameraDevice.close();
                    this.b.y("standby device disconnected", null);
                    return;
                }
                if (lVar2.V && !this.b.b0) {
                    l lVar3 = this.b;
                    if (!lVar3.X && !lVar3.Y) {
                        z11 = true;
                    }
                }
                l lVar4 = this.b;
                if (lVar4.z == cameraDevice) {
                    lVar4.q();
                    this.b.z = null;
                }
                cameraDevice.close();
                if (z11) {
                    l lVar5 = this.b;
                    IllegalStateException illegalStateException = new IllegalStateException("Camera device disconnected");
                    o oVar = lVar5.x;
                    if (oVar != null) {
                        synchronized (oVar) {
                            z10 = oVar.E;
                        }
                        if (z10) {
                            lVar5.j.a("camera lost while recording", illegalStateException);
                            a4.l lVar6 = lVar5.k;
                            ((x0) lVar6.b).i.post(new n0(lVar6, illegalStateException, 0));
                            return;
                        }
                    }
                    lVar5.N(illegalStateException);
                    return;
                }
                return;
            default:
                l lVar7 = this.b;
                if (!lVar7.G(cameraDevice)) {
                    l.b(lVar7, cameraDevice, "disconnected", null);
                    return;
                }
                lVar7.j.b("warm camera disconnected while recovery is closing it: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        boolean z10;
        switch (this.a) {
            case 0:
                l lVar = this.b;
                lVar.W = false;
                if (lVar.G(cameraDevice)) {
                    lVar.j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + l.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                }
                if (cameraDevice == lVar.t0) {
                    if (lVar.n0) {
                        l.b(lVar, cameraDevice, "error=" + l.c(i10) + " (" + i10 + ")", null);
                        return;
                    }
                    lVar.t0 = null;
                    lVar.u0 = cameraDevice;
                    cameraDevice.close();
                    lVar.y("standby device error=" + l.c(i10) + " (" + i10 + ")", null);
                    return;
                }
                if (lVar.z == cameraDevice) {
                    lVar.q();
                    lVar.z = null;
                }
                cameraDevice.close();
                IllegalStateException illegalStateException = new IllegalStateException("Camera device error: " + l.c(i10) + " (" + i10 + ")");
                o oVar = lVar.x;
                if (oVar != null) {
                    synchronized (oVar) {
                        z10 = oVar.E;
                    }
                    if (z10) {
                        lVar.j.a("camera lost while recording", illegalStateException);
                        a4.l lVar2 = lVar.k;
                        ((x0) lVar2.b).i.post(new n0(lVar2, illegalStateException, 0));
                        return;
                    }
                }
                lVar.N(illegalStateException);
                return;
            default:
                l lVar3 = this.b;
                if (lVar3.G(cameraDevice)) {
                    lVar3.j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + l.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                }
                l.b(lVar3, cameraDevice, "error=" + l.c(i10) + " (" + i10 + ")", new IllegalStateException("Warm camera device error: " + l.c(i10) + " (" + i10 + ")"));
                return;
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
                sb2.append(l.z(this.b.G0));
                if (this.b.Z) {
                    str = ", switchElapsedMs=" + l.z(this.b.I0);
                } else {
                    str = "";
                }
                sb2.append(str);
                pVar.b(sb2.toString());
                if (this.b.V) {
                    l lVar2 = this.b;
                    if (!lVar2.X) {
                        lVar2.z = cameraDevice;
                        if (!lVar2.n0) {
                            lVar2.u();
                            break;
                        } else if (!lVar2.s0 && lVar2.t0 != null) {
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
                lVar3.s0 = false;
                if (lVar3.V && !this.b.b0) {
                    l lVar4 = this.b;
                    if (!lVar4.m0 && lVar4.x0 != null && cameraDevice.getId().equals(this.b.x0.a)) {
                        l lVar5 = this.b;
                        lVar5.t0 = cameraDevice;
                        lVar5.j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.b.x0.b + ", elapsedMs=" + l.z(this.b.B0));
                        l lVar6 = this.b;
                        if (lVar6.z != null && lVar6.A == null && !lVar6.X) {
                            if (lVar6.n0) {
                                lVar6.j.b("both camera devices opened; configuring dual sessions");
                                l.a(this.b);
                            } else {
                                lVar6.j.b("both camera devices opened; configuring active session");
                                this.b.u();
                            }
                        }
                        l lVar7 = this.b;
                        q0 q0Var = lVar7.y0;
                        if (q0Var != null && q0Var == lVar7.x0.b) {
                            lVar7.y0 = null;
                            if (!lVar7.c0(q0Var)) {
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
