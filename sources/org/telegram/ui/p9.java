package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ p9(y9 y9Var, int i10) {
        this.a = i10;
        this.b = y9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        switch (this.a) {
            case 0:
                this.b.Z();
                break;
            case 1:
                y9 y9Var = this.b;
                if (!y9Var.isFinishing()) {
                    y9Var.R = null;
                    y9Var.N = false;
                    y9Var.d0.run();
                    if (!y9Var.N) {
                        AndroidUtilities.runOnUIThread(new p9(y9Var, 8), 500L);
                        break;
                    }
                }
                break;
            case 2:
                y9 y9Var2 = this.b;
                CameraView cameraView = y9Var2.d;
                if (cameraView != null) {
                    y9Var2.d0(cameraView.getTextureView().getBitmap());
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
                y9 y9Var3 = this.b;
                x9 x9Var = y9Var3.M;
                if (x9Var != null) {
                    x9Var.H(y9Var3.R);
                }
                y9Var3.finishFragment();
                break;
            case 5:
                y9 y9Var4 = this.b;
                y9Var4.U = new za.c(28);
                Context context = ApplicationLoader.applicationContext;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                y9Var4.V = new s8.n(new com.google.android.gms.internal.vision.t2(context, x1Var));
                break;
            case 6:
                y9 y9Var5 = this.b;
                if (y9Var5.h.getTag() != null) {
                    y9Var5.h.setTag(null);
                    y9Var5.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.ds.f).start();
                    break;
                }
                break;
            case 7:
                y9 y9Var6 = this.b;
                CameraView cameraView2 = y9Var6.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(y9Var6.d.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new p9(y9Var6, 4));
                break;
            default:
                y9 y9Var7 = this.b;
                float f7 = y9Var7.Y;
                float f10 = y9Var7.N ? 1.0f : 0.0f;
                y9Var7.Z = f10;
                if (f7 != f10) {
                    ValueAnimator valueAnimator = y9Var7.X;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i11 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(y9Var7.Y, y9Var7.Z);
                    y9Var7.X = ofFloat;
                    ofFloat.addUpdateListener(new s9(y9Var7, i10));
                    y9Var7.X.setDuration((long) (Math.abs(y9Var7.Y - y9Var7.Z) * 300.0f));
                    y9Var7.X.setInterpolator(org.telegram.ui.Components.ds.f);
                    y9Var7.X.start();
                    o1.j jVar = y9Var7.a0;
                    if (jVar != null) {
                        jVar.c();
                    }
                    o1.j jVar2 = new o1.j(new ac.a((y9Var7.N ? y9Var7.b0 : 1.0f - y9Var7.b0) * 500.0f));
                    y9Var7.a0 = jVar2;
                    jVar2.b(new q9(y9Var7, i11));
                    y9Var7.a0.u = new o1.k(500.0f);
                    y9Var7.a0.u.a(1.0f);
                    y9Var7.a0.u.b(500.0f);
                    y9Var7.a0.h();
                    break;
                }
                break;
        }
    }
}
