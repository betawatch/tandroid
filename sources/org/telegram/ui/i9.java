package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9 b;

    public /* synthetic */ i9(s9 s9Var, int i3) {
        this.a = i3;
        this.b = s9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = 0;
        switch (this.a) {
            case 0:
                this.b.d0();
                break;
            case 1:
                s9 s9Var = this.b;
                if (!s9Var.isFinishing()) {
                    s9Var.S = null;
                    s9Var.O = false;
                    s9Var.e0.run();
                    if (!s9Var.O) {
                        org.telegram.messenger.g0.i3(new i9(s9Var, 8), 500L);
                        break;
                    }
                }
                break;
            case 2:
                s9 s9Var2 = this.b;
                CameraView cameraView = s9Var2.d;
                if (cameraView != null) {
                    s9Var2.h0(cameraView.getTextureView().getBitmap());
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
                s9 s9Var3 = this.b;
                r9 r9Var = s9Var3.N;
                if (r9Var != null) {
                    r9Var.M(s9Var3.S);
                }
                s9Var3.finishFragment();
                break;
            case 5:
                s9 s9Var4 = this.b;
                s9Var4.V = new c6.i(9);
                Context context = org.telegram.messenger.t0.b;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                s9Var4.W = new t8.n(new com.google.android.gms.internal.vision.t2(context, x1Var));
                break;
            case 6:
                s9 s9Var5 = this.b;
                if (s9Var5.h.getTag() != null) {
                    s9Var5.h.setTag(null);
                    s9Var5.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.xq.f).start();
                    break;
                }
                break;
            case 7:
                s9 s9Var6 = this.b;
                CameraView cameraView2 = s9Var6.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(s9Var6.d.getCameraSession());
                }
                org.telegram.messenger.g0.h3(new i9(s9Var6, 4));
                break;
            default:
                s9 s9Var7 = this.b;
                float f10 = s9Var7.Z;
                float f11 = s9Var7.O ? 1.0f : 0.0f;
                s9Var7.a0 = f11;
                if (f10 != f11) {
                    ValueAnimator valueAnimator = s9Var7.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i10 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(s9Var7.Z, s9Var7.a0);
                    s9Var7.Y = ofFloat;
                    ofFloat.addUpdateListener(new l9(s9Var7, i3));
                    s9Var7.Y.setDuration((long) (Math.abs(s9Var7.Z - s9Var7.a0) * 300.0f));
                    s9Var7.Y.setInterpolator(org.telegram.ui.Components.xq.f);
                    s9Var7.Y.start();
                    q1.g gVar = s9Var7.b0;
                    if (gVar != null) {
                        gVar.d();
                    }
                    q1.g gVar2 = new q1.g(new q1.f((s9Var7.O ? s9Var7.c0 : 1.0f - s9Var7.c0) * 500.0f));
                    s9Var7.b0 = gVar2;
                    gVar2.b(new j9(s9Var7, i10));
                    s9Var7.b0.m = new q1.h(500.0f);
                    s9Var7.b0.m.a(1.0f);
                    s9Var7.b0.m.b(500.0f);
                    s9Var7.b0.h();
                    break;
                }
                break;
        }
    }
}
