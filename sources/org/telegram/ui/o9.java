package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9 b;

    public /* synthetic */ o9(x9 x9Var, int i10) {
        this.a = i10;
        this.b = x9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        switch (this.a) {
            case 0:
                this.b.Y();
                break;
            case 1:
                x9 x9Var = this.b;
                if (!x9Var.isFinishing()) {
                    x9Var.N = null;
                    x9Var.J = false;
                    x9Var.Z.run();
                    if (!x9Var.J) {
                        AndroidUtilities.runOnUIThread(new o9(x9Var, 8), 500L);
                        break;
                    }
                }
                break;
            case 2:
                x9 x9Var2 = this.b;
                CameraView cameraView = x9Var2.c;
                if (cameraView != null) {
                    x9Var2.c0(cameraView.getTextureView().getBitmap());
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
                x9 x9Var3 = this.b;
                w9 w9Var = x9Var3.I;
                if (w9Var != null) {
                    w9Var.K(x9Var3.N);
                }
                x9Var3.finishFragment();
                break;
            case 5:
                x9 x9Var4 = this.b;
                x9Var4.Q = new o2.i(18);
                Context context = ApplicationLoader.applicationContext;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                x9Var4.R = new f8.n(new com.google.android.gms.internal.vision.t2(context, x1Var));
                break;
            case 6:
                x9 x9Var5 = this.b;
                if (x9Var5.f.getTag() != null) {
                    x9Var5.f.setTag(null);
                    x9Var5.f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.mr.f).start();
                    break;
                }
                break;
            case 7:
                x9 x9Var6 = this.b;
                CameraView cameraView2 = x9Var6.c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(x9Var6.c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new o9(x9Var6, 4));
                break;
            default:
                x9 x9Var7 = this.b;
                float f10 = x9Var7.U;
                float f11 = x9Var7.J ? 1.0f : 0.0f;
                x9Var7.V = f11;
                if (f10 != f11) {
                    ValueAnimator valueAnimator = x9Var7.T;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i11 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(x9Var7.U, x9Var7.V);
                    x9Var7.T = ofFloat;
                    ofFloat.addUpdateListener(new r9(x9Var7, i10));
                    x9Var7.T.setDuration((long) (Math.abs(x9Var7.U - x9Var7.V) * 300.0f));
                    x9Var7.T.setInterpolator(org.telegram.ui.Components.mr.f);
                    x9Var7.T.start();
                    o1.j jVar = x9Var7.W;
                    if (jVar != null) {
                        jVar.c();
                    }
                    o1.j jVar2 = new o1.j(new kb.a((x9Var7.J ? x9Var7.X : 1.0f - x9Var7.X) * 500.0f));
                    x9Var7.W = jVar2;
                    jVar2.b(new p9(x9Var7, i11));
                    x9Var7.W.u = new o1.k(500.0f);
                    x9Var7.W.u.a(1.0f);
                    x9Var7.W.u.b(500.0f);
                    x9Var7.W.f();
                    break;
                }
                break;
        }
    }
}
