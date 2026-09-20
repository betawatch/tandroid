package ki;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ b(h hVar, int i10) {
        this.a = i10;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar;
        boolean z10;
        switch (this.a) {
            case 0:
                h hVar = this.b;
                Handler handler = hVar.n;
                if (handler != null) {
                    handler.post(new b(hVar, 2));
                    return;
                }
                return;
            case 1:
                this.b.j();
                return;
            case 2:
                h hVar2 = this.b;
                if (!hVar2.M || hVar2.y == null || (jVar = hVar2.w) == null) {
                    return;
                }
                synchronized (jVar) {
                    z10 = jVar.t;
                }
                if (z10) {
                    return;
                }
                try {
                    hVar2.w.n();
                    o oVar = hVar2.v;
                    if (oVar != null) {
                        long j3 = hVar2.w.u;
                        if (j3 <= 0) {
                            throw new IllegalArgumentException("Invalid recording time origin");
                        }
                        oVar.g = j3;
                        oVar.z = -1L;
                        oVar.A = 0L;
                        oVar.B = -1L;
                        oVar.V = true;
                    }
                    hVar2.j.b("first camera frame received; codecs started: segmentElapsedMs=" + h.l(hVar2.X));
                    o0 o0Var = (o0) hVar2.k.b;
                    o0Var.h.post(new y(o0Var, 3));
                    return;
                } catch (RuntimeException e) {
                    hVar2.s(e);
                    return;
                }
            case 3:
                h hVar3 = this.b;
                CameraCaptureSession cameraCaptureSession = hVar3.y;
                CaptureRequest.Builder builder = hVar3.z;
                if (!hVar3.M || cameraCaptureSession == null || builder == null) {
                    return;
                }
                try {
                    hVar3.b(builder);
                    hVar3.a(builder);
                    hVar3.A();
                    return;
                } catch (CameraAccessException | IllegalArgumentException e7) {
                    if (hVar3.F == j0.c) {
                        hVar3.m("60 fps updated request rejected", e7);
                        return;
                    } else {
                        hVar3.s(e7);
                        return;
                    }
                }
            case 4:
                this.b.q();
                return;
            case 5:
                h hVar4 = this.b;
                hVar4.M = false;
                hVar4.h();
                j jVar2 = hVar4.w;
                if (jVar2 != null) {
                    jVar2.o();
                    hVar4.w = null;
                }
                hVar4.R = false;
                o0 o0Var2 = (o0) hVar4.k.b;
                o0Var2.h.post(new y(o0Var2, 2));
                return;
            default:
                this.b.C();
                return;
        }
    }
}
