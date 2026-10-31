package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l40 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l40(Object obj, float f7, Runnable runnable, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = f7;
        this.c = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Runnable runnable = this.c;
        float f7 = this.b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                m40 m40Var = (m40) obj;
                m40Var.h = f7;
                m40Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.p6 = null;
                photoViewer.f6 = 0.0f;
                photoViewer.b6 = 0.0f;
                photoViewer.g6 = 0.0f;
                float u22 = photoViewer.u2(false);
                photoViewer.e6 = u22;
                photoViewer.a6 = u22;
                photoViewer.e0.invalidate();
                CropAreaView cropAreaView = photoViewer.C1.b.a;
                float u23 = photoViewer.u2(false);
                cropAreaView.n0 = 0.0f;
                cropAreaView.o0 = u23;
                cropAreaView.p0 = 0.0f;
                cropAreaView.q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.c.setRotated(false);
                if (Math.abs(f7) > 0.0f) {
                    org.telegram.ui.Components.be0 be0Var = photoViewer.C1;
                    eg.f fVar = be0Var.c;
                    if (fVar != null) {
                        fVar.b(0.0f);
                        fVar.setRotated(false);
                    }
                    if (be0Var.b.m(f7)) {
                        org.telegram.ui.ActionBar.a7.t(photoViewer.b1, org.telegram.ui.ActionBar.t6.ng, photoViewer.v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.b1.setColorFilter((ColorFilter) null);
                    }
                }
                org.telegram.messenger.ye yeVar = photoViewer.X4.c;
                if (yeVar != null) {
                    yeVar.b = 0.0f;
                    yeVar.a = 0.0f;
                    yeVar.f = 1.0f;
                    yeVar.e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                rh.i4 i4Var = (rh.i4) obj;
                i4Var.D = f7;
                i4Var.invalidate();
                if (animator == i4Var.E && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                th.d1 d1Var = (th.d1) obj;
                d1Var.n = f7;
                d1Var.invalidate();
                if (animator == d1Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 4:
                vh.z1 z1Var = (vh.z1) obj;
                z1Var.h = f7;
                z1Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                vh.o8 o8Var = (vh.o8) obj;
                o8Var.L = null;
                o8Var.I = f7;
                o8Var.j();
                o8Var.r.invalidate();
                o8Var.n.invalidate();
                runnable.run();
                o8Var.P.e();
                org.telegram.messenger.zs.e().k(99, 512);
                org.telegram.messenger.zs.e().o();
                o8Var.n();
                Runnable runnable2 = o8Var.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    o8Var.Q = null;
                }
                o8Var.r.invalidate();
                o8Var.h0.invalidate();
                break;
        }
    }
}
