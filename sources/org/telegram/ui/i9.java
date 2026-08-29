package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r9 b;

    public /* synthetic */ i9(r9 r9Var, int i10) {
        this.a = i10;
        this.b = r9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        switch (this.a) {
            case 0:
                this.b.Y();
                break;
            case 1:
                r9 r9Var = this.b;
                if (!r9Var.isFinishing()) {
                    r9Var.M = null;
                    r9Var.I = false;
                    r9Var.Y.run();
                    if (!r9Var.I) {
                        AndroidUtilities.runOnUIThread(new i9(r9Var, 8), 500L);
                        break;
                    }
                }
                break;
            case 2:
                r9 r9Var2 = this.b;
                CameraView cameraView = r9Var2.c;
                if (cameraView != null) {
                    r9Var2.c0(cameraView.getTextureView().getBitmap());
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
                r9 r9Var3 = this.b;
                q9 q9Var = r9Var3.H;
                if (q9Var != null) {
                    q9Var.J(r9Var3.M);
                }
                r9Var3.finishFragment();
                break;
            case 5:
                r9 r9Var4 = this.b;
                r9Var4.P = new nh.d6(19);
                Context context = ApplicationLoader.applicationContext;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                r9Var4.Q = new d8.n(new com.google.android.gms.internal.vision.t2(context, x1Var));
                break;
            case 6:
                r9 r9Var5 = this.b;
                if (r9Var5.f.getTag() != null) {
                    r9Var5.f.setTag(null);
                    r9Var5.f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.jr.f).start();
                    break;
                }
                break;
            case 7:
                r9 r9Var6 = this.b;
                CameraView cameraView2 = r9Var6.c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(r9Var6.c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new i9(r9Var6, 4));
                break;
            default:
                r9 r9Var7 = this.b;
                float f9 = r9Var7.T;
                float f10 = r9Var7.I ? 1.0f : 0.0f;
                r9Var7.U = f10;
                if (f9 != f10) {
                    ValueAnimator valueAnimator = r9Var7.S;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i11 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(r9Var7.T, r9Var7.U);
                    r9Var7.S = ofFloat;
                    ofFloat.addUpdateListener(new l9(r9Var7, i10));
                    r9Var7.S.setDuration((long) (Math.abs(r9Var7.T - r9Var7.U) * 300.0f));
                    r9Var7.S.setInterpolator(org.telegram.ui.Components.jr.f);
                    r9Var7.S.start();
                    o1.k kVar = r9Var7.V;
                    if (kVar != null) {
                        kVar.c();
                    }
                    o1.k kVar2 = new o1.k(new ib.a((r9Var7.I ? r9Var7.W : 1.0f - r9Var7.W) * 500.0f));
                    r9Var7.V = kVar2;
                    kVar2.b(new j9(r9Var7, i11));
                    r9Var7.V.u = new o1.l(500.0f);
                    r9Var7.V.u.a(1.0f);
                    r9Var7.V.u.b(500.0f);
                    r9Var7.V.f();
                    break;
                }
                break;
        }
    }
}
