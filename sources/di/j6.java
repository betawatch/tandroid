package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.ks;
import org.telegram.messenger.we;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.p30;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class j6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j6(Object obj, float f10, Runnable runnable, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = f10;
        this.c = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        Runnable runnable = this.c;
        float f10 = this.b;
        Object obj = this.d;
        switch (i7) {
            case 0:
                k6 k6Var = (k6) obj;
                k6Var.E = f10;
                k6Var.invalidate();
                if (animator == k6Var.F && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                fi.m1 m1Var = (fi.m1) obj;
                m1Var.n = f10;
                m1Var.invalidate();
                if (animator == m1Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                hi.w2 w2Var = (hi.w2) obj;
                w2Var.h = f10;
                w2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                hi.nb nbVar = (hi.nb) obj;
                nbVar.M = null;
                nbVar.J = f10;
                nbVar.j();
                nbVar.r.invalidate();
                nbVar.n.invalidate();
                runnable.run();
                nbVar.Q.e();
                ks.e().k(99, 512);
                ks.e().o();
                nbVar.n();
                Runnable runnable2 = nbVar.R;
                if (runnable2 != null) {
                    runnable2.run();
                    nbVar.R = null;
                }
                nbVar.r.invalidate();
                nbVar.i0.invalidate();
                break;
            case 4:
                p30 p30Var = (p30) obj;
                p30Var.h = f10;
                p30Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.p6 = null;
                photoViewer.f6 = 0.0f;
                photoViewer.b6 = 0.0f;
                photoViewer.g6 = 0.0f;
                float q22 = photoViewer.q2(false);
                photoViewer.e6 = q22;
                photoViewer.a6 = q22;
                photoViewer.f0.invalidate();
                CropAreaView cropAreaView = photoViewer.D1.b.a;
                float q23 = photoViewer.q2(false);
                cropAreaView.o0 = 0.0f;
                cropAreaView.p0 = q23;
                cropAreaView.q0 = 0.0f;
                cropAreaView.r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.c.setRotated(false);
                if (Math.abs(f10) > 0.0f) {
                    qd0 qd0Var = photoViewer.D1;
                    og.f fVar = qd0Var.c;
                    if (fVar != null) {
                        fVar.b(0.0f);
                        fVar.setRotated(false);
                    }
                    if (qd0Var.b.m(f10)) {
                        org.telegram.ui.ActionBar.u6.s(photoViewer.c1, org.telegram.ui.ActionBar.n6.qg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.c1.setColorFilter((ColorFilter) null);
                    }
                }
                we weVar = photoViewer.X4.c;
                if (weVar != null) {
                    weVar.b = 0.0f;
                    weVar.a = 0.0f;
                    weVar.f = 1.0f;
                    weVar.e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
