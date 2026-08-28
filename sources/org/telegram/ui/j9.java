package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9 b;

    public /* synthetic */ j9(s9 s9Var, int i9) {
        this.a = i9;
        this.b = s9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = 0;
        switch (this.a) {
            case 0:
                this.b.X();
                break;
            case 1:
                s9 s9Var = this.b;
                if (!s9Var.isFinishing()) {
                    s9Var.M = null;
                    s9Var.I = false;
                    s9Var.Y.run();
                    if (!s9Var.I) {
                        AndroidUtilities.runOnUIThread(new j9(s9Var, 8), 500L);
                        break;
                    }
                }
                break;
            case 2:
                s9 s9Var2 = this.b;
                CameraView cameraView = s9Var2.c;
                if (cameraView != null) {
                    s9Var2.b0(cameraView.getTextureView().getBitmap());
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
                s9 s9Var3 = this.b;
                r9 r9Var = s9Var3.H;
                if (r9Var != null) {
                    r9Var.K(s9Var3.M);
                }
                s9Var3.finishFragment();
                break;
            case 5:
                s9 s9Var4 = this.b;
                s9Var4.P = new m5.c0(9);
                Context context = ApplicationLoader.applicationContext;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                s9Var4.Q = new b8.n(new com.google.android.gms.internal.vision.t2(context, x1Var));
                break;
            case 6:
                s9 s9Var5 = this.b;
                if (s9Var5.f.getTag() != null) {
                    s9Var5.f.setTag(null);
                    s9Var5.f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.gr.f).start();
                    break;
                }
                break;
            case 7:
                s9 s9Var6 = this.b;
                CameraView cameraView2 = s9Var6.c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(s9Var6.c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new j9(s9Var6, 4));
                break;
            default:
                s9 s9Var7 = this.b;
                float f10 = s9Var7.T;
                float f11 = s9Var7.I ? 1.0f : 0.0f;
                s9Var7.U = f11;
                if (f10 != f11) {
                    ValueAnimator valueAnimator = s9Var7.S;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i10 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(s9Var7.T, s9Var7.U);
                    s9Var7.S = ofFloat;
                    ofFloat.addUpdateListener(new m9(s9Var7, i9));
                    s9Var7.S.setDuration((long) (Math.abs(s9Var7.T - s9Var7.U) * 300.0f));
                    s9Var7.S.setInterpolator(org.telegram.ui.Components.gr.f);
                    s9Var7.S.start();
                    o1.j jVar = s9Var7.V;
                    if (jVar != null) {
                        jVar.c();
                    }
                    o1.j jVar2 = new o1.j(new gb.a((s9Var7.I ? s9Var7.W : 1.0f - s9Var7.W) * 500.0f));
                    s9Var7.V = jVar2;
                    jVar2.b(new k9(s9Var7, i10));
                    s9Var7.V.u = new o1.k(500.0f);
                    s9Var7.V.u.a(1.0f);
                    s9Var7.V.u.b(500.0f);
                    s9Var7.V.f();
                    break;
                }
                break;
        }
    }
}
