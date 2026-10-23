package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                    w9Var.R = null;
                    w9Var.N = false;
                    w9Var.d0.run();
                    if (!w9Var.N) {
                        AndroidUtilities.runOnUIThread(new n9(w9Var, 8), 500L);
                        break;
                    }
                }
                break;
            case 2:
                w9 w9Var2 = this.b;
                CameraView cameraView = w9Var2.d;
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
                v9 v9Var = w9Var3.M;
                if (v9Var != null) {
                    v9Var.E(w9Var3.R);
                }
                w9Var3.finishFragment();
                break;
            case 5:
                w9 w9Var4 = this.b;
                w9Var4.U = new a6.i(23);
                Context context = ApplicationLoader.applicationContext;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                w9Var4.V = new r8.n(new com.google.android.gms.internal.vision.t2(context, x1Var));
                break;
            case 6:
                w9 w9Var5 = this.b;
                if (w9Var5.h.getTag() != null) {
                    w9Var5.h.setTag(null);
                    w9Var5.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.bs.f).start();
                    break;
                }
                break;
            case 7:
                w9 w9Var6 = this.b;
                CameraView cameraView2 = w9Var6.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(w9Var6.d.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new n9(w9Var6, 4));
                break;
            default:
                w9 w9Var7 = this.b;
                float f7 = w9Var7.Y;
                float f10 = w9Var7.N ? 1.0f : 0.0f;
                w9Var7.Z = f10;
                if (f7 != f10) {
                    ValueAnimator valueAnimator = w9Var7.X;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i11 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(w9Var7.Y, w9Var7.Z);
                    w9Var7.X = ofFloat;
                    ofFloat.addUpdateListener(new q9(w9Var7, i10));
                    w9Var7.X.setDuration((long) (Math.abs(w9Var7.Y - w9Var7.Z) * 300.0f));
                    w9Var7.X.setInterpolator(org.telegram.ui.Components.bs.f);
                    w9Var7.X.start();
                    o1.k kVar = w9Var7.a0;
                    if (kVar != null) {
                        kVar.c();
                    }
                    o1.k kVar2 = new o1.k(new o1.j((w9Var7.N ? w9Var7.b0 : 1.0f - w9Var7.b0) * 500.0f));
                    w9Var7.a0 = kVar2;
                    kVar2.b(new o9(w9Var7, i11));
                    w9Var7.a0.u = new o1.l(500.0f);
                    w9Var7.a0.u.a(1.0f);
                    w9Var7.a0.u.b(500.0f);
                    w9Var7.a0.h();
                    break;
                }
                break;
        }
    }
}
