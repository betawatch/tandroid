package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraView;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9 b;

    public /* synthetic */ j9(s9 s9Var, int i7) {
        this.a = i7;
        this.b = s9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = 0;
        switch (this.a) {
            case 0:
                this.b.d0();
                break;
            case 1:
                s9 s9Var = this.b;
                if (!s9Var.isFinishing()) {
                    s9Var.R = null;
                    s9Var.N = false;
                    s9Var.d0.run();
                    if (!s9Var.N) {
                        org.telegram.messenger.g0.i3(new j9(s9Var, 8), 500L);
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
                r9 r9Var = s9Var3.M;
                if (r9Var != null) {
                    r9Var.M(s9Var3.R);
                }
                s9Var3.finishFragment();
                break;
            case 5:
                s9 s9Var4 = this.b;
                s9Var4.U = new aa.n(20);
                Context context = org.telegram.messenger.t0.b;
                com.google.android.gms.internal.vision.x1 x1Var = new com.google.android.gms.internal.vision.x1();
                x1Var.a = 256;
                s9Var4.V = new u8.n(new com.google.android.gms.internal.vision.t2(context, x1Var));
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
                org.telegram.messenger.g0.h3(new j9(s9Var6, 4));
                break;
            default:
                s9 s9Var7 = this.b;
                float f10 = s9Var7.Y;
                float f11 = s9Var7.N ? 1.0f : 0.0f;
                s9Var7.Z = f11;
                if (f10 != f11) {
                    ValueAnimator valueAnimator = s9Var7.X;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    int i10 = 1;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(s9Var7.Y, s9Var7.Z);
                    s9Var7.X = ofFloat;
                    ofFloat.addUpdateListener(new m9(s9Var7, i7));
                    s9Var7.X.setDuration((long) (Math.abs(s9Var7.Y - s9Var7.Z) * 300.0f));
                    s9Var7.X.setInterpolator(org.telegram.ui.Components.xq.f);
                    s9Var7.X.start();
                    r1.g gVar = s9Var7.a0;
                    if (gVar != null) {
                        gVar.d();
                    }
                    r1.g gVar2 = new r1.g(new r1.f((s9Var7.N ? s9Var7.b0 : 1.0f - s9Var7.b0) * 500.0f));
                    s9Var7.a0 = gVar2;
                    gVar2.b(new k9(s9Var7, i10));
                    s9Var7.a0.m = new r1.h(500.0f);
                    s9Var7.a0.m.a(1.0f);
                    s9Var7.a0.m.b(500.0f);
                    s9Var7.a0.h();
                    break;
                }
                break;
        }
    }
}
