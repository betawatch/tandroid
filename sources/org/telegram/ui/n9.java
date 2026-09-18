package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w9 b;

    public /* synthetic */ n9(w9 w9Var, int i10) {
        this.a = i10;
        this.b = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        switch (this.a) {
            case 0:
                this.b.Y();
                break;
            case 1:
                w9 w9Var = this.b;
                if (!w9Var.isFinishing()) {
                    w9Var.Q = null;
                    w9Var.M = false;
                    w9Var.c0.run();
                    if (!w9Var.M) {
                        AndroidUtilities.runOnUIThread(new n9(w9Var, 8), 500L);
                        break;
                    }
                }
                break;
            case 2:
                w9 w9Var2 = this.b;
                CameraView cameraView = w9Var2.c;
                if (cameraView != null) {
                    w9Var2.c0(cameraView.getTextureView().getBitmap());
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
                w9 w9Var3 = this.b;
                v9 v9Var = w9Var3.L;
                if (v9Var != null) {
                    v9Var.K(w9Var3.Q);
                }
                w9Var3.finishFragment();
                break;
            case 5:
                w9 w9Var4 = this.b;
                w9Var4.T = new a4.m(15);
                Context context = ApplicationLoader.applicationContext;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                w9Var4.U = new r8.n(new com.google.android.gms.internal.vision.u2(context, x1Var));
                break;
            case 6:
                w9 w9Var5 = this.b;
                if (w9Var5.f.getTag() != null) {
                    w9Var5.f.setTag(null);
                    w9Var5.f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.qr.f).start();
                    break;
                }
                break;
            case 7:
                w9 w9Var6 = this.b;
                CameraView cameraView2 = w9Var6.c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(w9Var6.c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new n9(w9Var6, 4));
                break;
            default:
                w9 w9Var7 = this.b;
                float f7 = w9Var7.X;
                float f10 = w9Var7.M ? 1.0f : 0.0f;
                w9Var7.Y = f10;
                if (f7 != f10) {
                    ValueAnimator valueAnimator = w9Var7.W;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i11 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(w9Var7.X, w9Var7.Y);
                    w9Var7.W = ofFloat;
                    ofFloat.addUpdateListener(new q9(w9Var7, i10));
                    w9Var7.W.setDuration((long) (Math.abs(w9Var7.X - w9Var7.Y) * 300.0f));
                    w9Var7.W.setInterpolator(org.telegram.ui.Components.qr.f);
                    w9Var7.W.start();
                    o1.k kVar = w9Var7.Z;
                    if (kVar != null) {
                        kVar.c();
                    }
                    o1.k kVar2 = new o1.k(new o1.j((w9Var7.M ? w9Var7.a0 : 1.0f - w9Var7.a0) * 500.0f));
                    w9Var7.Z = kVar2;
                    kVar2.b(new o9(w9Var7, i11));
                    w9Var7.Z.u = new o1.l(500.0f);
                    w9Var7.Z.u.a(1.0f);
                    w9Var7.Z.u.b(500.0f);
                    w9Var7.Z.f();
                    break;
                }
                break;
        }
    }
}
