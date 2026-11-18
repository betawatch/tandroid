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
import org.telegram.ui.q30;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
                hi.o2 o2Var = (hi.o2) obj;
                o2Var.h = f10;
                o2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                hi.ta taVar = (hi.ta) obj;
                taVar.M = null;
                taVar.J = f10;
                taVar.j();
                taVar.r.invalidate();
                taVar.n.invalidate();
                runnable.run();
                taVar.Q.e();
                ks.e().k(99, 512);
                ks.e().o();
                taVar.n();
                Runnable runnable2 = taVar.R;
                if (runnable2 != null) {
                    runnable2.run();
                    taVar.R = null;
                }
                taVar.r.invalidate();
                taVar.i0.invalidate();
                break;
            case 4:
                q30 q30Var = (q30) obj;
                q30Var.h = f10;
                q30Var.a.invalidate();
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
                float p22 = photoViewer.p2(false);
                photoViewer.e6 = p22;
                photoViewer.a6 = p22;
                photoViewer.f0.invalidate();
                CropAreaView cropAreaView = photoViewer.D1.b.a;
                float p23 = photoViewer.p2(false);
                cropAreaView.o0 = 0.0f;
                cropAreaView.p0 = p23;
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
