package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class g extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ j a;

    public g(j jVar) {
        this.a = jVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        j jVar = this.a;
        n nVar = jVar.j;
        if (jVar.N) {
            Object tag = captureRequest.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == jVar.R) {
                jVar.O++;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                boolean z10 = !jVar.M ? !(num == null || num.intValue() == 0) : !(num != null && num.intValue() == 2);
                boolean z11 = !jVar.M || num2 == null || num2.intValue() == 3 || num2.intValue() == 4;
                if (z10 && z11) {
                    nVar.b("torch result confirmed: enabled=" + jVar.M + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + jVar.O + ", retries=" + jVar.P);
                    jVar.N = false;
                } else {
                    int i11 = jVar.O;
                    if (i11 == 3 && (i10 = jVar.P) == 0) {
                        jVar.P = i10 + 1;
                        jVar.O = 0;
                        nVar.b("torch result not applied; rebuilding request: enabled=" + jVar.M + ", resultMode=" + num + ", flashState=" + num2);
                        jVar.c();
                    } else if (i11 >= 6) {
                        nVar.b("torch result failed: enabled=" + jVar.M + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + jVar.P);
                        jVar.N = false;
                    }
                }
            }
        }
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 == null || l4.longValue() <= jVar.M0) {
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (jVar.L0 == 0) {
            jVar.L0 = l4.longValue();
            jVar.N0 = 1L;
        } else {
            long longValue = l4.longValue() - jVar.M0;
            jVar.P0++;
            jVar.Q0 += longValue;
            double d = longValue;
            jVar.R0 = (d * d) + jVar.R0;
            long j3 = jVar.S0;
            if (j3 == 0 || longValue < j3) {
                jVar.S0 = longValue;
            }
            jVar.T0 = Math.max(jVar.T0, longValue);
            if (longValue > 50000000) {
                jVar.U0++;
            }
            if (longValue > 100000000) {
                jVar.V0++;
            }
            jVar.N0++;
        }
        long j10 = jVar.O0;
        if (j10 != 0) {
            long j11 = elapsedRealtimeNanos - j10;
            jVar.W0++;
            jVar.X0 += j11;
            jVar.Y0 = Math.max(jVar.Y0, j11);
        }
        jVar.O0 = elapsedRealtimeNanos;
        jVar.M0 = l4.longValue();
        long longValue2 = l4.longValue() - jVar.L0;
        if (longValue2 < 3000000000L) {
            return;
        }
        float f7 = ((jVar.N0 - 1) * 1.0E9f) / longValue2;
        o0 o0Var = jVar.G;
        int i12 = o0Var == null ? 0 : o0Var.a;
        StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
        sb2.append(f7);
        sb2.append(", requestedFps=");
        sb2.append(jVar.h.a);
        sb2.append(", activeFps=");
        sb2.append(i12 == 0 ? "unknown" : Integer.valueOf(i12));
        sb2.append(", targetMet=");
        sb2.append(i12 == 0 || f7 >= ((float) i12) * 0.85f);
        sb2.append(", fpsRange=");
        sb2.append(jVar.H);
        sb2.append(", sensorIntervalMs={avg=");
        sb2.append(j.f(jVar.Q0, jVar.P0));
        sb2.append(", min=");
        sb2.append(jVar.S0 / 1000000.0f);
        sb2.append(", max=");
        sb2.append(jVar.T0 / 1000000.0f);
        sb2.append(", jitter=");
        sb2.append(j.K(jVar.R0, jVar.Q0, jVar.P0));
        sb2.append("}, sensorGaps={over50ms=");
        sb2.append(jVar.U0);
        sb2.append(", over100ms=");
        sb2.append(jVar.V0);
        sb2.append("}, callbackIntervalMs={avg=");
        sb2.append(j.f(jVar.X0, jVar.W0));
        sb2.append(", max=");
        sb2.append(jVar.Y0 / 1000000.0f);
        sb2.append("}");
        nVar.b(sb2.toString());
        jVar.D();
        jVar.L0 = l4.longValue();
        jVar.M0 = l4.longValue();
        jVar.N0 = 1L;
        jVar.O0 = elapsedRealtimeNanos;
    }
}
