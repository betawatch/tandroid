package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u9 b;

    public /* synthetic */ l9(u9 u9Var, int i10) {
        this.a = i10;
        this.b = u9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        switch (this.a) {
            case 0:
                this.b.Y();
                break;
            case 1:
                u9 u9Var = this.b;
                if (!u9Var.isFinishing()) {
                    u9Var.Q = null;
                    u9Var.M = false;
                    u9Var.c0.run();
                    if (!u9Var.M) {
                        AndroidUtilities.runOnUIThread(new l9(u9Var, 8), 500L);
                        break;
                    }
                }
                break;
            case 2:
                u9 u9Var2 = this.b;
                CameraView cameraView = u9Var2.c;
                if (cameraView != null) {
                    u9Var2.c0(cameraView.getTextureView().getBitmap());
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
                u9 u9Var3 = this.b;
                t9 t9Var = u9Var3.L;
                if (t9Var != null) {
                    t9Var.K(u9Var3.Q);
                }
                u9Var3.finishFragment();
                break;
            case 5:
                u9 u9Var4 = this.b;
                u9Var4.T = new a6.m(20);
                Context context = ApplicationLoader.applicationContext;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                u9Var4.U = new r8.n(new com.google.android.gms.internal.vision.u2(context, x1Var));
                break;
            case 6:
                u9 u9Var5 = this.b;
                if (u9Var5.f.getTag() != null) {
                    u9Var5.f.setTag(null);
                    u9Var5.f.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.pr.f).start();
                    break;
                }
                break;
            case 7:
                u9 u9Var6 = this.b;
                CameraView cameraView2 = u9Var6.c;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(u9Var6.c.getCameraSession());
                }
                AndroidUtilities.runOnUIThread(new l9(u9Var6, 4));
                break;
            default:
                u9 u9Var7 = this.b;
                float f7 = u9Var7.X;
                float f10 = u9Var7.M ? 1.0f : 0.0f;
                u9Var7.Y = f10;
                if (f7 != f10) {
                    ValueAnimator valueAnimator = u9Var7.W;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i11 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(u9Var7.X, u9Var7.Y);
                    u9Var7.W = ofFloat;
                    ofFloat.addUpdateListener(new o9(u9Var7, i10));
                    u9Var7.W.setDuration((long) (Math.abs(u9Var7.X - u9Var7.Y) * 300.0f));
                    u9Var7.W.setInterpolator(org.telegram.ui.Components.pr.f);
                    u9Var7.W.start();
                    o1.k kVar = u9Var7.Z;
                    if (kVar != null) {
                        kVar.c();
                    }
                    o1.k kVar2 = new o1.k(new o1.j((u9Var7.M ? u9Var7.a0 : 1.0f - u9Var7.a0) * 500.0f));
                    u9Var7.Z = kVar2;
                    kVar2.b(new m9(u9Var7, i11));
                    u9Var7.Z.u = new o1.l(500.0f);
                    u9Var7.Z.u.a(1.0f);
                    u9Var7.Z.u.b(500.0f);
                    u9Var7.Z.f();
                    break;
                }
                break;
        }
    }
}
