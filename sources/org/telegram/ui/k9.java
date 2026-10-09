package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v9 b;

    public /* synthetic */ k9(v9 v9Var, int i10) {
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
                    v9Var.R = null;
                    v9Var.N = false;
                    v9Var.e0.run();
                    if (!v9Var.N) {
                        AndroidUtilities.runOnUIThread(new k9(v9Var, 8), 500L);
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
                u9 u9Var = v9Var3.M;
                if (u9Var != null) {
                    u9Var.K(v9Var3.R);
                }
                v9Var3.finishFragment();
                break;
            case 5:
                v9 v9Var4 = this.b;
                v9Var4.U = new pb.c();
                Context context = ApplicationLoader.applicationContext;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                v9Var4.V = new r8.n(new com.google.android.gms.internal.vision.u2(context, x1Var));
                break;
            case 6:
                v9 v9Var5 = this.b;
                if (v9Var5.f.getTag() != null) {
                    v9Var5.f.setTag(null);
                    v9Var5.f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.hs.f).start();
                    break;
                }
                break;
            case 7:
                v9 v9Var6 = this.b;
                CameraView cameraView2 = v9Var6.c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(v9Var6.c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new k9(v9Var6, 4));
                break;
            default:
                v9 v9Var7 = this.b;
                float f7 = v9Var7.Z;
                float f10 = v9Var7.N ? 1.0f : 0.0f;
                v9Var7.a0 = f10;
                if (f7 != f10) {
                    ValueAnimator valueAnimator = v9Var7.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i11 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(v9Var7.Z, v9Var7.a0);
                    v9Var7.Y = ofFloat;
                    ofFloat.addUpdateListener(new n9(v9Var7, i10));
                    v9Var7.Y.setDuration((long) (Math.abs(v9Var7.Z - v9Var7.a0) * 300.0f));
                    v9Var7.Y.setInterpolator(org.telegram.ui.Components.hs.f);
                    v9Var7.Y.start();
                    o1.k kVar = v9Var7.b0;
                    if (kVar != null) {
                        kVar.c();
                    }
                    o1.k kVar2 = new o1.k(new o1.j((v9Var7.N ? v9Var7.c0 : 1.0f - v9Var7.c0) * 500.0f));
                    v9Var7.b0 = kVar2;
                    kVar2.b(new l9(v9Var7, i11));
                    v9Var7.b0.u = new o1.l(500.0f);
                    v9Var7.b0.u.a(1.0f);
                    v9Var7.b0.u.b(500.0f);
                    v9Var7.b0.h();
                    break;
                }
                break;
        }
    }
}
