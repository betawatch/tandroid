package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9 b;

    public /* synthetic */ o9(z9 z9Var, int i10) {
        this.a = i10;
        this.b = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        switch (this.a) {
            case 0:
                this.b.Y();
                break;
            case 1:
                z9 z9Var = this.b;
                if (!z9Var.isFinishing()) {
                    z9Var.R = null;
                    z9Var.N = false;
                    z9Var.e0.run();
                    if (!z9Var.N) {
                        AndroidUtilities.runOnUIThread(new o9(z9Var, 8), 500L);
                        break;
                    }
                }
                break;
            case 2:
                z9 z9Var2 = this.b;
                CameraView cameraView = z9Var2.c;
                if (cameraView != null) {
                    z9Var2.c0(cameraView.getTextureView().getBitmap());
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
                z9 z9Var3 = this.b;
                y9 y9Var = z9Var3.M;
                if (y9Var != null) {
                    y9Var.K(z9Var3.R);
                }
                z9Var3.finishFragment();
                break;
            case 5:
                z9 z9Var4 = this.b;
                z9Var4.U = new a4.l(24);
                Context context = ApplicationLoader.applicationContext;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                z9Var4.V = new r8.n(new com.google.android.gms.internal.vision.t2(context, x1Var));
                break;
            case 6:
                z9 z9Var5 = this.b;
                if (z9Var5.f.getTag() != null) {
                    z9Var5.f.setTag(null);
                    z9Var5.f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.es.f).start();
                    break;
                }
                break;
            case 7:
                z9 z9Var6 = this.b;
                CameraView cameraView2 = z9Var6.c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(z9Var6.c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new o9(z9Var6, 4));
                break;
            default:
                z9 z9Var7 = this.b;
                float f7 = z9Var7.Z;
                float f10 = z9Var7.N ? 1.0f : 0.0f;
                z9Var7.a0 = f10;
                if (f7 != f10) {
                    ValueAnimator valueAnimator = z9Var7.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i11 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(z9Var7.Z, z9Var7.a0);
                    z9Var7.Y = ofFloat;
                    ofFloat.addUpdateListener(new r9(z9Var7, i10));
                    z9Var7.Y.setDuration((long) (Math.abs(z9Var7.Z - z9Var7.a0) * 300.0f));
                    z9Var7.Y.setInterpolator(org.telegram.ui.Components.es.f);
                    z9Var7.Y.start();
                    o1.k kVar = z9Var7.b0;
                    if (kVar != null) {
                        kVar.c();
                    }
                    o1.k kVar2 = new o1.k(new o1.j((z9Var7.N ? z9Var7.c0 : 1.0f - z9Var7.c0) * 500.0f));
                    z9Var7.b0 = kVar2;
                    kVar2.b(new p9(z9Var7, i11));
                    z9Var7.b0.u = new o1.l(500.0f);
                    z9Var7.b0.u.a(1.0f);
                    z9Var7.b0.u.b(500.0f);
                    z9Var7.b0.h();
                    break;
                }
                break;
        }
    }
}
