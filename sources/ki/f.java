package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class f extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ h a;

    public f(h hVar) {
        this.a = hVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        h hVar = this.a;
        l lVar = hVar.j;
        if (hVar.M) {
            Object tag = captureRequest.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == hVar.Q) {
                hVar.N++;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                boolean z10 = !hVar.L ? !(num == null || num.intValue() == 0) : !(num != null && num.intValue() == 2);
                boolean z11 = !hVar.L || num2 == null || num2.intValue() == 3 || num2.intValue() == 4;
                if (z10 && z11) {
                    lVar.b("torch result confirmed: enabled=" + hVar.L + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + hVar.N + ", retries=" + hVar.O);
                    hVar.M = false;
                } else {
                    int i11 = hVar.N;
                    if (i11 == 3 && (i10 = hVar.O) == 0) {
                        hVar.O = i10 + 1;
                        hVar.N = 0;
                        lVar.b("torch result not applied; rebuilding request: enabled=" + hVar.L + ", resultMode=" + num + ", flashState=" + num2);
                        hVar.a();
                    } else if (i11 >= 6) {
                        lVar.b("torch result failed: enabled=" + hVar.L + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + hVar.O);
                        hVar.M = false;
                    }
                }
            }
        }
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 == null || l4.longValue() <= hVar.y0) {
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (hVar.x0 == 0) {
            hVar.x0 = l4.longValue();
            hVar.z0 = 1L;
        } else {
            long longValue = l4.longValue() - hVar.y0;
            hVar.B0++;
            hVar.C0 += longValue;
            double d = longValue;
            hVar.D0 = (d * d) + hVar.D0;
            long j3 = hVar.E0;
            if (j3 == 0 || longValue < j3) {
                hVar.E0 = longValue;
            }
            hVar.F0 = Math.max(hVar.F0, longValue);
            if (longValue > 50000000) {
                hVar.G0++;
            }
            if (longValue > 100000000) {
                hVar.H0++;
            }
            hVar.z0++;
        }
        long j10 = hVar.A0;
        if (j10 != 0) {
            long j11 = elapsedRealtimeNanos - j10;
            hVar.I0++;
            hVar.J0 += j11;
            hVar.K0 = Math.max(hVar.K0, j11);
        }
        hVar.A0 = elapsedRealtimeNanos;
        hVar.y0 = l4.longValue();
        long longValue2 = l4.longValue() - hVar.x0;
        if (longValue2 < 3000000000L) {
            return;
        }
        float f7 = ((hVar.z0 - 1) * 1.0E9f) / longValue2;
        m0 m0Var = hVar.F;
        int i12 = m0Var == null ? 0 : m0Var.a;
        StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
        sb2.append(f7);
        sb2.append(", requestedFps=");
        sb2.append(hVar.h.a);
        sb2.append(", activeFps=");
        sb2.append(i12 == 0 ? "unknown" : Integer.valueOf(i12));
        sb2.append(", targetMet=");
        sb2.append(i12 == 0 || f7 >= ((float) i12) * 0.85f);
        sb2.append(", fpsRange=");
        sb2.append(hVar.G);
        sb2.append(", sensorIntervalMs={avg=");
        sb2.append(h.c(hVar.C0, hVar.B0));
        sb2.append(", min=");
        sb2.append(hVar.E0 / 1000000.0f);
        sb2.append(", max=");
        sb2.append(hVar.F0 / 1000000.0f);
        sb2.append(", jitter=");
        sb2.append(h.A(hVar.D0, hVar.C0, hVar.B0));
        sb2.append("}, sensorGaps={over50ms=");
        sb2.append(hVar.G0);
        sb2.append(", over100ms=");
        sb2.append(hVar.H0);
        sb2.append("}, callbackIntervalMs={avg=");
        sb2.append(h.c(hVar.J0, hVar.I0));
        sb2.append(", max=");
        sb2.append(hVar.K0 / 1000000.0f);
        sb2.append("}");
        lVar.b(sb2.toString());
        hVar.t();
        hVar.x0 = l4.longValue();
        hVar.y0 = l4.longValue();
        hVar.z0 = 1L;
        hVar.A0 = elapsedRealtimeNanos;
    }
}
