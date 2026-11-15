package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t9 b;

    public /* synthetic */ j9(t9 t9Var, int i7) {
        this.a = i7;
        this.b = t9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 0;
        switch (this.a) {
            case 0:
                this.b.d0();
                break;
            case 1:
                t9 t9Var = this.b;
                if (!t9Var.isFinishing()) {
                    t9Var.S = null;
                    t9Var.O = false;
                    t9Var.e0.run();
                    if (!t9Var.O) {
                        org.telegram.messenger.g0.i3(new j9(t9Var, 8), 500L);
                        break;
                    }
                }
                break;
            case 2:
                t9 t9Var2 = this.b;
                CameraView cameraView = t9Var2.d;
                if (cameraView != null) {
                    t9Var2.h0(cameraView.getTextureView().getBitmap());
                    break;
                }
                break;
            case 3:
                this.b.finishFragment();
                break;
            case 4:
                t9 t9Var3 = this.b;
                s9 s9Var = t9Var3.N;
                if (s9Var != null) {
                    s9Var.M(t9Var3.S);
                }
                t9Var3.finishFragment();
                break;
            case 5:
                t9 t9Var4 = this.b;
                t9Var4.V = new cb.c(24);
                Context context = org.telegram.messenger.t0.b;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                t9Var4.W = new u8.n(new com.google.android.gms.internal.vision.u2(context, x1Var));
                break;
            case 6:
                t9 t9Var5 = this.b;
                if (t9Var5.h.getTag() != null) {
                    t9Var5.h.setTag(null);
                    t9Var5.h.animate().setDuration(200L).alpha(0.0f).setInterpolator(org.telegram.ui.Components.er.f).start();
                    break;
                }
                break;
            case 7:
                t9 t9Var6 = this.b;
                CameraView cameraView2 = t9Var6.d;
                if (cameraView2 != null && cameraView2.getCameraSession() != null) {
                    CameraController.getInstance().stopPreview(t9Var6.d.getCameraSession());
                }
                org.telegram.messenger.g0.h3(new j9(t9Var6, 4));
                break;
            default:
                t9 t9Var7 = this.b;
                float f10 = t9Var7.Z;
                float f11 = t9Var7.O ? 1.0f : 0.0f;
                t9Var7.a0 = f11;
                if (f10 != f11) {
                    ValueAnimator valueAnimator = t9Var7.Y;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i10 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(t9Var7.Z, t9Var7.a0);
                    t9Var7.Y = ofFloat;
                    ofFloat.addUpdateListener(new m9(t9Var7, i7));
                    t9Var7.Y.setDuration((long) (Math.abs(t9Var7.Z - t9Var7.a0) * 300.0f));
                    t9Var7.Y.setInterpolator(org.telegram.ui.Components.er.f);
                    t9Var7.Y.start();
                    r1.g gVar = t9Var7.b0;
                    if (gVar != null) {
                        gVar.d();
                    }
                    r1.g gVar2 = new r1.g(new r1.f((t9Var7.O ? t9Var7.c0 : 1.0f - t9Var7.c0) * 500.0f));
                    t9Var7.b0 = gVar2;
                    gVar2.b(new k9(t9Var7, i10));
                    t9Var7.b0.m = new r1.h(500.0f);
                    t9Var7.b0.m.a(1.0f);
                    t9Var7.b0.m.b(500.0f);
                    t9Var7.b0.h();
                    break;
                }
                break;
        }
    }
}
