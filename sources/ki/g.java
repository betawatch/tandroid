package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.SystemClock;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class g extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ i a;

    public g(i iVar) {
        this.a = iVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        int i10;
        i iVar = this.a;
        m mVar = iVar.j;
        if (iVar.N) {
            Object tag = captureRequest.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == iVar.R) {
                iVar.O++;
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.FLASH_MODE);
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.FLASH_STATE);
                boolean z10 = !iVar.M ? !(num == null || num.intValue() == 0) : !(num != null && num.intValue() == 2);
                boolean z11 = !iVar.M || num2 == null || num2.intValue() == 3 || num2.intValue() == 4;
                if (z10 && z11) {
                    mVar.b("torch result confirmed: enabled=" + iVar.M + ", resultMode=" + num + ", flashState=" + num2 + ", frames=" + iVar.O + ", retries=" + iVar.P);
                    iVar.N = false;
                } else {
                    int i11 = iVar.O;
                    if (i11 == 3 && (i10 = iVar.P) == 0) {
                        iVar.P = i10 + 1;
                        iVar.O = 0;
                        mVar.b("torch result not applied; rebuilding request: enabled=" + iVar.M + ", resultMode=" + num + ", flashState=" + num2);
                        iVar.a();
                    } else if (i11 >= 6) {
                        mVar.b("torch result failed: enabled=" + iVar.M + ", resultMode=" + num + ", flashState=" + num2 + ", retries=" + iVar.P);
                        iVar.N = false;
                    }
                }
            }
        }
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 == null || l4.longValue() <= iVar.z0) {
            return;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (iVar.y0 == 0) {
            iVar.y0 = l4.longValue();
            iVar.A0 = 1L;
        } else {
            long longValue = l4.longValue() - iVar.z0;
            iVar.C0++;
            iVar.D0 += longValue;
            double d = longValue;
            iVar.E0 = (d * d) + iVar.E0;
            long j3 = iVar.F0;
            if (j3 == 0 || longValue < j3) {
                iVar.F0 = longValue;
            }
            iVar.G0 = Math.max(iVar.G0, longValue);
            if (longValue > 50000000) {
                iVar.H0++;
            }
            if (longValue > 100000000) {
                iVar.I0++;
            }
            iVar.A0++;
        }
        long j10 = iVar.B0;
        if (j10 != 0) {
            long j11 = elapsedRealtimeNanos - j10;
            iVar.J0++;
            iVar.K0 += j11;
            iVar.L0 = Math.max(iVar.L0, j11);
        }
        iVar.B0 = elapsedRealtimeNanos;
        iVar.z0 = l4.longValue();
        long longValue2 = l4.longValue() - iVar.y0;
        if (longValue2 < 3000000000L) {
            return;
        }
        float f7 = ((iVar.A0 - 1) * 1.0E9f) / longValue2;
        n0 n0Var = iVar.G;
        int i12 = n0Var == null ? 0 : n0Var.a;
        StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
        sb2.append(f7);
        sb2.append(", requestedFps=");
        sb2.append(iVar.h.a);
        sb2.append(", activeFps=");
        sb2.append(i12 == 0 ? "unknown" : Integer.valueOf(i12));
        sb2.append(", targetMet=");
        sb2.append(i12 == 0 || f7 >= ((float) i12) * 0.85f);
        sb2.append(", fpsRange=");
        sb2.append(iVar.H);
        sb2.append(", sensorIntervalMs={avg=");
        sb2.append(i.c(iVar.D0, iVar.C0));
        sb2.append(", min=");
        sb2.append(iVar.F0 / 1000000.0f);
        sb2.append(", max=");
        sb2.append(iVar.G0 / 1000000.0f);
        sb2.append(", jitter=");
        sb2.append(i.B(iVar.E0, iVar.D0, iVar.C0));
        sb2.append("}, sensorGaps={over50ms=");
        sb2.append(iVar.H0);
        sb2.append(", over100ms=");
        sb2.append(iVar.I0);
        sb2.append("}, callbackIntervalMs={avg=");
        sb2.append(i.c(iVar.K0, iVar.J0));
        sb2.append(", max=");
        sb2.append(iVar.L0 / 1000000.0f);
        sb2.append("}");
        mVar.b(sb2.toString());
        iVar.u();
        iVar.y0 = l4.longValue();
        iVar.z0 = l4.longValue();
        iVar.A0 = 1L;
        iVar.B0 = elapsedRealtimeNanos;
    }
}
