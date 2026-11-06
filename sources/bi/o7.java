package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.qs;
import org.telegram.messenger.ye;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.n30;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class o7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o7(Object obj, float f10, Runnable runnable, int i7) {
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
                p7 p7Var = (p7) obj;
                p7Var.D = f10;
                p7Var.invalidate();
                if (animator == p7Var.E && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                di.q1 q1Var = (di.q1) obj;
                q1Var.n = f10;
                q1Var.invalidate();
                if (animator == q1Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                fi.p2 p2Var = (fi.p2) obj;
                p2Var.h = f10;
                p2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                fi.va vaVar = (fi.va) obj;
                vaVar.L = null;
                vaVar.I = f10;
                vaVar.j();
                vaVar.r.invalidate();
                vaVar.n.invalidate();
                runnable.run();
                vaVar.P.e();
                qs.e().k(99, 512);
                qs.e().o();
                vaVar.n();
                Runnable runnable2 = vaVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    vaVar.Q = null;
                }
                vaVar.r.invalidate();
                vaVar.h0.invalidate();
                break;
            case 4:
                n30 n30Var = (n30) obj;
                n30Var.h = f10;
                n30Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.o6 = null;
                photoViewer.e6 = 0.0f;
                photoViewer.a6 = 0.0f;
                photoViewer.f6 = 0.0f;
                float o22 = photoViewer.o2(false);
                photoViewer.d6 = o22;
                photoViewer.Z5 = o22;
                photoViewer.e0.invalidate();
                CropAreaView cropAreaView = photoViewer.C1.b.a;
                float o23 = photoViewer.o2(false);
                cropAreaView.n0 = 0.0f;
                cropAreaView.o0 = o23;
                cropAreaView.p0 = 0.0f;
                cropAreaView.q0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.C1.c.setRotated(false);
                if (Math.abs(f10) > 0.0f) {
                    fd0 fd0Var = photoViewer.C1;
                    og.f fVar = fd0Var.c;
                    if (fVar != null) {
                        fVar.b(0.0f);
                        fVar.setRotated(false);
                    }
                    if (fd0Var.b.m(f10)) {
                        org.telegram.ui.ActionBar.r6.t(photoViewer.b1, org.telegram.ui.ActionBar.k6.ng, photoViewer.v2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.b1.setColorFilter((ColorFilter) null);
                    }
                }
                ye yeVar = photoViewer.W4.c;
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
        }
    }
}
