// default package

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class da1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ la1 b;

    public /* synthetic */ da1(la1 la1Var, byte b) {
        this.a = b;
        this.b = la1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        byte b3 = 0;
        la1 la1Var = this.b;
        switch (b) {
            case 0:
                CameraView cameraView = la1Var.d;
                if (cameraView != null && cameraView.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(la1Var.d.getCameraSession());
                }
                hl.c3(new da1(la1Var, (byte) 5));
                break;
            case 1:
                float f = la1Var.Z;
                float f2 = la1Var.O ? 1.0f : 0.0f;
                la1Var.a0 = f2;
                if (f != f2) {
                    ValueAnimator valueAnimator = la1Var.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(la1Var.Z, la1Var.a0);
                    la1Var.Y = ofFloat;
                    ofFloat.addUpdateListener(new ea1(la1Var, b3));
                    la1Var.Y.setDuration((long) (Math.abs(la1Var.Z - la1Var.a0) * 300.0f));
                    la1Var.Y.setInterpolator(k43.f);
                    la1Var.Y.start();
                    vpa vpaVar = la1Var.b0;
                    if (vpaVar != null) {
                        vpaVar.d();
                    }
                    boolean z = la1Var.O;
                    float f3 = la1Var.c0;
                    if (!z) {
                        f3 = 1.0f - f3;
                    }
                    vpa vpaVar2 = new vpa(new xk4(f3 * 500.0f));
                    la1Var.b0 = vpaVar2;
                    vpaVar2.b(new fa1(la1Var, b3));
                    la1Var.b0.m = new wpa(500.0f);
                    la1Var.b0.m.a(1.0f);
                    la1Var.b0.m.b(500.0f);
                    la1Var.b0.h();
                    break;
                }
                break;
            case 2:
                if (!la1Var.isFinishing()) {
                    la1Var.S = null;
                    la1Var.O = false;
                    la1Var.e0.run();
                    if (!la1Var.O) {
                        hl.d3(new da1(la1Var, b2), 500L);
                        break;
                    }
                }
                break;
            case 3:
                CameraView cameraView2 = la1Var.d;
                if (cameraView2 != null) {
                    la1Var.g0(cameraView2.getTextureView().getBitmap());
                    break;
                }
                break;
            case 4:
                la1Var.finishFragment();
                break;
            case 5:
                ka1 ka1Var = la1Var.N;
                if (ka1Var != null) {
                    ka1Var.q(la1Var.S);
                }
                la1Var.finishFragment();
                break;
            case 6:
                la1Var.c0();
                break;
            case 7:
                la1Var.V = new aj3((byte) 29);
                Context context = a.b;
                qwe qweVar = new qwe();
                qweVar.a = 256;
                la1Var.W = new af0(new cgd(context, qweVar));
                break;
            default:
                if (la1Var.h.getTag() != null) {
                    la1Var.h.setTag(null);
                    la1Var.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(k43.f).start();
                    break;
                }
                break;
        }
    }
}
