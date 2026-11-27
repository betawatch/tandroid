// default package

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class in9 extends CameraDevice.StateCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ on9 b;

    public /* synthetic */ in9(on9 on9Var, byte b) {
        this.a = b;
        this.b = on9Var;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                on9Var.F(cameraDevice);
                break;
            default:
                on9Var.F(cameraDevice);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                this.b.j.b("camera disconnected: id=" + cameraDevice.getId() + ", closing=" + this.b.s0.contains(cameraDevice));
                if (!this.b.s0.contains(cameraDevice)) {
                    on9 on9Var = this.b;
                    if (cameraDevice != on9Var.o0) {
                        boolean z = (!on9Var.U || this.b.Y || this.b.V) ? false : true;
                        on9 on9Var2 = this.b;
                        if (on9Var2.y == cameraDevice) {
                            on9Var2.k();
                            on9Var2 = this.b;
                            on9Var2.y = null;
                        }
                        on9Var2.l(cameraDevice, 1);
                        if (z) {
                            this.b.L(new IllegalStateException("Camera device disconnected"));
                            break;
                        }
                    } else {
                        on9Var.B(cameraDevice, "disconnected", null);
                        break;
                    }
                } else {
                    cameraDevice.close();
                    break;
                }
                break;
            default:
                on9 on9Var3 = this.b;
                sn9 sn9Var = on9Var3.j;
                StringBuilder sb = new StringBuilder("warm camera disconnected: id=");
                sb.append(cameraDevice.getId());
                sb.append(", closing=");
                ArrayList arrayList = on9Var3.s0;
                sb.append(arrayList.contains(cameraDevice));
                sn9Var.b(sb.toString());
                if (!arrayList.contains(cameraDevice)) {
                    on9Var3.B(cameraDevice, "disconnected", null);
                    break;
                } else {
                    cameraDevice.close();
                    break;
                }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        byte b = this.a;
        on9 on9Var = this.b;
        switch (b) {
            case 0:
                sn9 sn9Var = on9Var.j;
                StringBuilder sb = new StringBuilder("camera error: id=");
                sb.append(cameraDevice.getId());
                sb.append(", error=");
                sb.append(on9.e(i));
                sb.append(" (");
                sb.append(i);
                sb.append("), closing=");
                ArrayList arrayList = on9Var.s0;
                sb.append(arrayList.contains(cameraDevice));
                sn9Var.b(sb.toString());
                if (!arrayList.contains(cameraDevice)) {
                    if (cameraDevice != on9Var.o0) {
                        if (on9Var.y == cameraDevice) {
                            on9Var.k();
                            on9Var.y = null;
                        }
                        on9Var.l(cameraDevice, 1);
                        on9Var.L(new IllegalStateException("Camera device error: " + on9.e(i) + " (" + i + ")"));
                        break;
                    } else {
                        on9Var.B(cameraDevice, "error=" + on9.e(i) + " (" + i + ")", null);
                        break;
                    }
                } else {
                    cameraDevice.close();
                    break;
                }
            default:
                sn9 sn9Var2 = on9Var.j;
                StringBuilder sb2 = new StringBuilder("warm camera error: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", error=");
                sb2.append(on9.e(i));
                sb2.append(" (");
                sb2.append(i);
                sb2.append("), closing=");
                ArrayList arrayList2 = on9Var.s0;
                sb2.append(arrayList2.contains(cameraDevice));
                sn9Var2.b(sb2.toString());
                if (!arrayList2.contains(cameraDevice)) {
                    on9Var.B(cameraDevice, "error=" + on9.e(i) + " (" + i + ")", new IllegalStateException("Warm camera device error: " + on9.e(i) + " (" + i + ")"));
                    break;
                } else {
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
                sn9 sn9Var = this.b.j;
                StringBuilder sb = new StringBuilder("camera opened: id=");
                sb.append(cameraDevice.getId());
                sb.append(", elapsedMs=");
                sb.append(on9.x(this.b.D0));
                if (this.b.W) {
                    str = ", switchElapsedMs=" + on9.x(this.b.F0);
                } else {
                    str = "";
                }
                sb.append(str);
                sn9Var.b(sb.toString());
                if (this.b.U) {
                    on9 on9Var = this.b;
                    if (!on9Var.V) {
                        on9Var.y = cameraDevice;
                        if (!on9Var.k0) {
                            on9Var.q();
                            break;
                        } else if (on9Var.v0 == null && on9Var.o0 != null) {
                            on9Var.r();
                            break;
                        } else {
                            on9Var.j.b("active camera opened; waiting for dual peer before sessions");
                            break;
                        }
                    }
                }
                on9 on9Var2 = this.b;
                on9Var2.l(cameraDevice, on9Var2.V ? 2 : 1);
                break;
            default:
                if (this.b.U && !this.b.Y) {
                    on9 on9Var3 = this.b;
                    if (on9Var3.k0 && on9Var3.p0 != null && cameraDevice.getId().equals(this.b.p0.a)) {
                        on9 on9Var4 = this.b;
                        on9Var4.o0 = cameraDevice;
                        on9Var4.j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.b.p0.b + ", elapsedMs=" + on9.x(this.b.y0));
                        on9 on9Var5 = this.b;
                        if (on9Var5.y != null && on9Var5.z == null && !on9Var5.V) {
                            on9Var5.j.b("both camera devices opened; configuring dual sessions");
                            this.b.r();
                            break;
                        }
                    }
                }
                this.b.j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                this.b.l(cameraDevice, 1);
                break;
        }
    }
}
