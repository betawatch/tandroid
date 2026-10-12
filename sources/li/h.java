package li;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class h extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ l a;

    public h(l lVar) {
        this.a = lVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        l lVar = this.a;
        p pVar = lVar.j;
        if (cameraCaptureSession != lVar.A) {
            return;
        }
        if (lVar.Q) {
            Object tag = captureRequest.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == lVar.U) {
                lVar.R++;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                boolean z10 = !lVar.P ? !(num == null || num.intValue() == 0) : !(num != null && num.intValue() == 2);
                boolean z11 = !lVar.P || num2 == null || num2.intValue() == 3 || num2.intValue() == 4;
                if (z10 && z11) {
                    pVar.b("torch result confirmed: enabled=" + lVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + lVar.R + ", retries=" + lVar.S);
                    lVar.Q = false;
                } else {
                    int i11 = lVar.R;
                    if (i11 == 3 && (i10 = lVar.S) == 0) {
                        lVar.S = i10 + 1;
                        lVar.R = 0;
                        pVar.b("torch result not applied; rebuilding request: enabled=" + lVar.P + ", resultMode=" + num + ", flashState=" + num2);
                        lVar.g();
                    } else if (i11 >= 6) {
                        pVar.b("torch result failed: enabled=" + lVar.P + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + lVar.S);
                        lVar.Q = false;
                    }
                }
            }
        }
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 == null || l4.longValue() <= lVar.Y0) {
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (lVar.X0 == 0) {
            lVar.X0 = l4.longValue();
            lVar.Z0 = 1L;
        } else {
            long longValue = l4.longValue() - lVar.Y0;
            lVar.b1++;
            lVar.c1 += longValue;
            double d = longValue;
            lVar.d1 = (d * d) + lVar.d1;
            long j10 = lVar.e1;
            if (j10 == 0 || longValue < j10) {
                lVar.e1 = longValue;
            }
            lVar.f1 = Math.max(lVar.f1, longValue);
            if (longValue > 50000000) {
                lVar.g1++;
            }
            if (longValue > 100000000) {
                lVar.h1++;
            }
            lVar.Z0++;
        }
        long j11 = lVar.a1;
        if (j11 != 0) {
            long j12 = elapsedRealtimeNanos - j11;
            lVar.i1++;
            lVar.j1 += j12;
            lVar.k1 = Math.max(lVar.k1, j12);
        }
        lVar.a1 = elapsedRealtimeNanos;
        lVar.Y0 = l4.longValue();
        long longValue2 = l4.longValue() - lVar.X0;
        if (longValue2 < 3000000000L) {
            return;
        }
        float f7 = ((lVar.Z0 - 1) * 1.0E9f) / longValue2;
        p0 p0Var = lVar.J;
        int i12 = p0Var == null ? 0 : p0Var.a;
        StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
        sb2.append(f7);
        sb2.append(", requestedFps=");
        sb2.append(lVar.h.a);
        sb2.append(", activeFps=");
        sb2.append(i12 == 0 ? "unknown" : Integer.valueOf(i12));
        sb2.append(", targetMet=");
        sb2.append(i12 == 0 || f7 >= ((float) i12) * 0.85f);
        sb2.append(", fpsRange=");
        sb2.append(lVar.K);
        sb2.append(", sensorIntervalMs={avg=");
        sb2.append(l.j(lVar.c1, lVar.b1));
        sb2.append(", min=");
        sb2.append(lVar.e1 / 1000000.0f);
        sb2.append(", max=");
        sb2.append(lVar.f1 / 1000000.0f);
        sb2.append(", jitter=");
        sb2.append(l.W(lVar.d1, lVar.c1, lVar.b1));
        sb2.append("}, sensorGaps={over50ms=");
        sb2.append(lVar.g1);
        sb2.append(", over100ms=");
        sb2.append(lVar.h1);
        sb2.append("}, callbackIntervalMs={avg=");
        sb2.append(l.j(lVar.j1, lVar.i1));
        sb2.append(", max=");
        sb2.append(lVar.k1 / 1000000.0f);
        sb2.append("}");
        pVar.b(sb2.toString());
        lVar.O();
        lVar.X0 = l4.longValue();
        lVar.Y0 = l4.longValue();
        lVar.Z0 = 1L;
        lVar.a1 = elapsedRealtimeNanos;
    }
}
