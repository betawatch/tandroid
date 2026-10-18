package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ n9(y9 y9Var, int i10) {
        this.a = i10;
        this.b = y9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        switch (this.a) {
            case 0:
                this.b.Y();
                break;
            case 1:
                y9 y9Var = this.b;
                if (!y9Var.isFinishing()) {
                    y9Var.S = null;
                    y9Var.O = false;
                    y9Var.f0.run();
                    if (!y9Var.O) {
                        AndroidUtilities.runOnUIThread(new n9(y9Var, 8), 500L);
                        break;
                    }
                }
                break;
            case 2:
                y9 y9Var2 = this.b;
                CameraView cameraView = y9Var2.d;
                if (cameraView != null) {
                    y9Var2.c0(cameraView.getTextureView().getBitmap());
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
                y9 y9Var3 = this.b;
                x9 x9Var = y9Var3.N;
                if (x9Var != null) {
                    x9Var.E(y9Var3.S);
                }
                y9Var3.finishFragment();
                break;
            case 5:
                y9 y9Var4 = this.b;
                y9Var4.V = new a6.i(23);
                Context context = ApplicationLoader.applicationContext;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                y9Var4.W = new r8.n(new com.google.android.gms.internal.vision.t2(context, x1Var));
                break;
            case 6:
                y9 y9Var5 = this.b;
                if (y9Var5.h.getTag() != null) {
                    y9Var5.h.setTag(null);
                    y9Var5.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.bs.f).start();
                    break;
                }
                break;
            case 7:
                y9 y9Var6 = this.b;
                CameraView cameraView2 = y9Var6.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(y9Var6.d.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new n9(y9Var6, 4));
                break;
            default:
                y9 y9Var7 = this.b;
                float f7 = y9Var7.a0;
                float f10 = y9Var7.O ? 1.0f : 0.0f;
                y9Var7.b0 = f10;
                if (f7 != f10) {
                    ValueAnimator valueAnimator = y9Var7.Z;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i11 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(y9Var7.a0, y9Var7.b0);
                    y9Var7.Z = ofFloat;
                    ofFloat.addUpdateListener(new q9(y9Var7, i10));
                    y9Var7.Z.setDuration((long) (Math.abs(y9Var7.a0 - y9Var7.b0) * 300.0f));
                    y9Var7.Z.setInterpolator(org.telegram.ui.Components.bs.f);
                    y9Var7.Z.start();
                    o1.k kVar = y9Var7.c0;
                    if (kVar != null) {
                        kVar.c();
                    }
                    o1.k kVar2 = new o1.k(new o1.j((y9Var7.O ? y9Var7.d0 : 1.0f - y9Var7.d0) * 500.0f));
                    y9Var7.c0 = kVar2;
                    kVar2.b(new o9(y9Var7, i11));
                    y9Var7.c0.u = new o1.l(500.0f);
                    y9Var7.c0.u.a(1.0f);
                    y9Var7.c0.u.b(500.0f);
                    y9Var7.c0.h();
                    break;
                }
                break;
        }
    }
}
