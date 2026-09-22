package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        k kVar = hVar.j;
        if (hVar.M) {
            Object tag = captureRequest.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == hVar.Q) {
                hVar.N++;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                boolean z10 = !hVar.L ? !(num == null || num.intValue() == 0) : !(num != null && num.intValue() == 2);
                boolean z11 = !hVar.L || num2 == null || num2.intValue() == 3 || num2.intValue() == 4;
                if (z10 && z11) {
                    kVar.b("torch result confirmed: enabled=" + hVar.L + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + hVar.N + ", retries=" + hVar.O);
                    hVar.M = false;
                } else {
                    int i11 = hVar.N;
                    if (i11 == 3 && (i10 = hVar.O) == 0) {
                        hVar.O = i10 + 1;
                        hVar.N = 0;
                        kVar.b("torch result not applied; rebuilding request: enabled=" + hVar.L + ", resultMode=" + num + ", flashState=" + num2);
                        hVar.a();
                    } else if (i11 >= 6) {
                        kVar.b("torch result failed: enabled=" + hVar.L + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + hVar.O);
                        hVar.M = false;
                    }
                }
            }
        }
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 == null || l4.longValue() <= hVar.x0) {
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (hVar.w0 == 0) {
            hVar.w0 = l4.longValue();
            hVar.y0 = 1L;
        } else {
            long longValue = l4.longValue() - hVar.x0;
            hVar.A0++;
            hVar.B0 += longValue;
            double d = longValue;
            hVar.C0 = (d * d) + hVar.C0;
            long j3 = hVar.D0;
            if (j3 == 0 || longValue < j3) {
                hVar.D0 = longValue;
            }
            hVar.E0 = Math.max(hVar.E0, longValue);
            if (longValue > 50000000) {
                hVar.F0++;
            }
            if (longValue > 100000000) {
                hVar.G0++;
            }
            hVar.y0++;
        }
        long j10 = hVar.z0;
        if (j10 != 0) {
            long j11 = elapsedRealtimeNanos - j10;
            hVar.H0++;
            hVar.I0 += j11;
            hVar.J0 = Math.max(hVar.J0, j11);
        }
        hVar.z0 = elapsedRealtimeNanos;
        hVar.x0 = l4.longValue();
        long longValue2 = l4.longValue() - hVar.w0;
        if (longValue2 < 3000000000L) {
            return;
        }
        float f7 = ((hVar.y0 - 1) * 1.0E9f) / longValue2;
        k0 k0Var = hVar.F;
        int i12 = k0Var == null ? 0 : k0Var.a;
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
        sb2.append(", mode=");
        sb2.append(hVar.b0 ? "CONSTRAINED_HIGH_SPEED" : "REGULAR");
        sb2.append(", sensorIntervalMs={avg=");
        sb2.append(h.c(hVar.B0, hVar.A0));
        sb2.append(", min=");
        sb2.append(hVar.D0 / 1000000.0f);
        sb2.append(", max=");
        sb2.append(hVar.E0 / 1000000.0f);
        sb2.append(", jitter=");
        sb2.append(h.C(hVar.C0, hVar.B0, hVar.A0));
        sb2.append("}, sensorGaps={over50ms=");
        sb2.append(hVar.F0);
        sb2.append(", over100ms=");
        sb2.append(hVar.G0);
        sb2.append("}, callbackIntervalMs={avg=");
        sb2.append(h.c(hVar.I0, hVar.H0));
        sb2.append(", max=");
        sb2.append(hVar.J0 / 1000000.0f);
        sb2.append("}");
        kVar.b(sb2.toString());
        hVar.v();
        hVar.w0 = l4.longValue();
        hVar.x0 = l4.longValue();
        hVar.y0 = 1L;
        hVar.z0 = elapsedRealtimeNanos;
    }
}
