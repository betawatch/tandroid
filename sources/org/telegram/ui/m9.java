package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v9 b;

    public /* synthetic */ m9(v9 v9Var, int i10) {
        this.a = i10;
        this.b = v9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        switch (this.a) {
            case 0:
                this.b.Y();
                break;
            case 1:
                v9 v9Var = this.b;
                if (!v9Var.isFinishing()) {
                    v9Var.N = null;
                    v9Var.J = false;
                    v9Var.Z.run();
                    if (!v9Var.J) {
                        AndroidUtilities.runOnUIThread(new m9(v9Var, 8), 500L);
                        break;
                    }
                }
                break;
            case 2:
                v9 v9Var2 = this.b;
                CameraView cameraView = v9Var2.c;
                if (cameraView != null) {
                    v9Var2.c0(cameraView.getTextureView().getBitmap());
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
                v9 v9Var3 = this.b;
                u9 u9Var = v9Var3.I;
                if (u9Var != null) {
                    u9Var.J(v9Var3.N);
                }
                v9Var3.finishFragment();
                break;
            case 5:
                v9 v9Var4 = this.b;
                v9Var4.Q = new org.telegram.ui.Components.ai(14);
                Context context = ApplicationLoader.applicationContext;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                v9Var4.R = new f8.n(new com.google.android.gms.internal.vision.t2(context, x1Var));
                break;
            case 6:
                v9 v9Var5 = this.b;
                if (v9Var5.f.getTag() != null) {
                    v9Var5.f.setTag(null);
                    v9Var5.f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.pr.f).start();
                    break;
                }
                break;
            case 7:
                v9 v9Var6 = this.b;
                CameraView cameraView2 = v9Var6.c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(v9Var6.c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new m9(v9Var6, 4));
                break;
            default:
                v9 v9Var7 = this.b;
                float f10 = v9Var7.U;
                float f11 = v9Var7.J ? 1.0f : 0.0f;
                v9Var7.V = f11;
                if (f10 != f11) {
                    ValueAnimator valueAnimator = v9Var7.T;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i11 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(v9Var7.U, v9Var7.V);
                    v9Var7.T = ofFloat;
                    ofFloat.addUpdateListener(new p9(v9Var7, i10));
                    v9Var7.T.setDuration((long) (Math.abs(v9Var7.U - v9Var7.V) * 300.0f));
                    v9Var7.T.setInterpolator(org.telegram.ui.Components.pr.f);
                    v9Var7.T.start();
                    o1.j jVar = v9Var7.W;
                    if (jVar != null) {
                        jVar.c();
                    }
                    o1.j jVar2 = new o1.j(new kb.a((v9Var7.J ? v9Var7.X : 1.0f - v9Var7.X) * 500.0f));
                    v9Var7.W = jVar2;
                    jVar2.b(new n9(v9Var7, i11));
                    v9Var7.W.u = new o1.k(500.0f);
                    v9Var7.W.u.a(1.0f);
                    v9Var7.W.u.b(500.0f);
                    v9Var7.W.f();
                    break;
                }
                break;
        }
    }
}
