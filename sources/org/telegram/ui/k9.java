package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u9 b;

    public /* synthetic */ k9(u9 u9Var, int i10) {
        this.a = i10;
        this.b = u9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 0;
        switch (this.a) {
            case 0:
                this.b.c0();
                break;
            case 1:
                u9 u9Var = this.b;
                if (!u9Var.isFinishing()) {
                    u9Var.R = null;
                    u9Var.N = false;
                    u9Var.d0.run();
                    if (!u9Var.N) {
                        org.telegram.messenger.i0.h3(new k9(u9Var, 8), 500L);
                        break;
                    }
                }
                break;
            case 2:
                u9 u9Var2 = this.b;
                CameraView cameraView = u9Var2.d;
                if (cameraView != null) {
                    u9Var2.g0(cameraView.getTextureView().getBitmap());
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
                u9 u9Var3 = this.b;
                t9 t9Var = u9Var3.M;
                if (t9Var != null) {
                    t9Var.L(u9Var3.R);
                }
                u9Var3.finishFragment();
                break;
            case 5:
                u9 u9Var4 = this.b;
                u9Var4.U = new vh.w3();
                Context context = org.telegram.messenger.w0.b;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                u9Var4.V = new r8.n(new com.google.android.gms.internal.vision.t2(context, x1Var));
                break;
            case 6:
                u9 u9Var5 = this.b;
                if (u9Var5.h.getTag() != null) {
                    u9Var5.h.setTag(null);
                    u9Var5.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.gr.f).start();
                    break;
                }
                break;
            case 7:
                u9 u9Var6 = this.b;
                CameraView cameraView2 = u9Var6.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(u9Var6.d.getCameraSession());
                }
                org.telegram.messenger.i0.g3(new k9(u9Var6, 4));
                break;
            default:
                u9 u9Var7 = this.b;
                float f7 = u9Var7.Y;
                float f10 = u9Var7.N ? 1.0f : 0.0f;
                u9Var7.Z = f10;
                if (f7 != f10) {
                    ValueAnimator valueAnimator = u9Var7.X;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i11 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(u9Var7.Y, u9Var7.Z);
                    u9Var7.X = ofFloat;
                    ofFloat.addUpdateListener(new n9(u9Var7, i10));
                    u9Var7.X.setDuration((long) (Math.abs(u9Var7.Y - u9Var7.Z) * 300.0f));
                    u9Var7.X.setInterpolator(org.telegram.ui.Components.gr.f);
                    u9Var7.X.start();
                    o1.j jVar = u9Var7.a0;
                    if (jVar != null) {
                        jVar.d();
                    }
                    o1.j jVar2 = new o1.j(new o1.i((u9Var7.N ? u9Var7.b0 : 1.0f - u9Var7.b0) * 500.0f));
                    u9Var7.a0 = jVar2;
                    jVar2.b(new l9(u9Var7, i11));
                    u9Var7.a0.m = new o1.k(500.0f);
                    u9Var7.a0.m.a(1.0f);
                    u9Var7.a0.m.b(500.0f);
                    u9Var7.a0.h();
                    break;
                }
                break;
        }
    }
}
