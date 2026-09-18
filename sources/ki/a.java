package ki;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ a(g gVar, int i10) {
        this.a = i10;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar;
        boolean z10;
        switch (this.a) {
            case 0:
                g gVar = this.b;
                Handler handler = gVar.j;
                if (handler != null) {
                    handler.post(new a(gVar, 1));
                    return;
                }
                return;
            case 1:
                g gVar2 = this.b;
                if (!gVar2.B || gVar2.u == null || (iVar = gVar2.s) == null) {
                    return;
                }
                synchronized (iVar) {
                    z10 = iVar.s;
                }
                if (z10) {
                    return;
                }
                try {
                    gVar2.s.n();
                    m mVar = gVar2.r;
                    if (mVar != null) {
                        long j3 = gVar2.s.t;
                        if (j3 <= 0) {
                            throw new IllegalArgumentException("Invalid recording time origin");
                        }
                        mVar.f = j3;
                        mVar.y = -1L;
                        mVar.z = 0L;
                        mVar.A = -1L;
                        mVar.U = true;
                    }
                    gVar2.f.b("first camera frame received; codecs started: segmentElapsedMs=" + g.g(gVar2.I));
                    h0 h0Var = (h0) gVar2.g.b;
                    h0Var.h.post(new w(h0Var, 3));
                    return;
                } catch (RuntimeException e) {
                    gVar2.k(e);
                    return;
                }
            case 2:
                this.b.i();
                return;
            case 3:
                g gVar3 = this.b;
                CameraCaptureSession cameraCaptureSession = gVar3.u;
                CaptureRequest.Builder builder = gVar3.v;
                if (!gVar3.B || cameraCaptureSession == null || builder == null) {
                    return;
                }
                try {
                    gVar3.b(builder);
                    builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf((gVar3.A && gVar3.h()) ? 2 : 0));
                    cameraCaptureSession.setRepeatingRequest(builder.build(), null, gVar3.j);
                    return;
                } catch (CameraAccessException e7) {
                    gVar3.k(e7);
                    return;
                }
            case 4:
                g gVar4 = this.b;
                gVar4.B = false;
                gVar4.f();
                i iVar2 = gVar4.s;
                if (iVar2 != null) {
                    iVar2.o();
                    gVar4.s = null;
                }
                gVar4.F = false;
                h0 h0Var2 = (h0) gVar4.g.b;
                h0Var2.h.post(new w(h0Var2, 2));
                return;
            default:
                this.b.s();
                return;
        }
    }
}
