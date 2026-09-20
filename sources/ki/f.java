package ki;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class f extends CameraCaptureSession.CaptureCallback {
    public final /* synthetic */ h a;

    public f(h hVar) {
        this.a = hVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        Long l4 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l4 != null) {
            long longValue = l4.longValue();
            h hVar = this.a;
            if (longValue <= hVar.e0) {
                return;
            }
            if (hVar.d0 == 0) {
                hVar.d0 = l4.longValue();
                hVar.f0 = 1L;
            } else {
                hVar.f0++;
            }
            hVar.e0 = l4.longValue();
            long longValue2 = l4.longValue() - hVar.d0;
            if (longValue2 < 3000000000L) {
                return;
            }
            float f7 = ((hVar.f0 - 1) * 1.0E9f) / longValue2;
            j0 j0Var = hVar.F;
            int i10 = j0Var == null ? 0 : j0Var.a;
            k kVar = hVar.j;
            StringBuilder sb2 = new StringBuilder("camera capture rate: measuredFps=");
            sb2.append(f7);
            sb2.append(", requestedFps=");
            sb2.append(hVar.h.a);
            sb2.append(", activeFps=");
            sb2.append(i10 == 0 ? "unknown" : Integer.valueOf(i10));
            sb2.append(", targetMet=");
            sb2.append(i10 == 0 || f7 >= ((float) i10) * 0.85f);
            sb2.append(", fpsRange=");
            sb2.append(hVar.G);
            sb2.append(", mode=");
            sb2.append(hVar.V ? "CONSTRAINED_HIGH_SPEED" : "REGULAR");
            kVar.b(sb2.toString());
            hVar.d0 = l4.longValue();
            hVar.f0 = 1L;
        }
    }
}
