package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.ns;
import org.telegram.messenger.xe;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.n30;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class g6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g6(Object obj, float f10, Runnable runnable, int i7) {
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
                h6 h6Var = (h6) obj;
                h6Var.E = f10;
                h6Var.invalidate();
                if (animator == h6Var.F && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                fi.o1 o1Var = (fi.o1) obj;
                o1Var.n = f10;
                o1Var.invalidate();
                if (animator == o1Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                hi.n2 n2Var = (hi.n2) obj;
                n2Var.h = f10;
                n2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                hi.sa saVar = (hi.sa) obj;
                saVar.M = null;
                saVar.J = f10;
                saVar.j();
                saVar.r.invalidate();
                saVar.n.invalidate();
                runnable.run();
                saVar.Q.e();
                ns.e().k(99, 512);
                ns.e().o();
                saVar.n();
                Runnable runnable2 = saVar.R;
                if (runnable2 != null) {
                    runnable2.run();
                    saVar.R = null;
                }
                saVar.r.invalidate();
                saVar.i0.invalidate();
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
                    gd0 gd0Var = photoViewer.D1;
                    og.f fVar = gd0Var.c;
                    if (fVar != null) {
                        fVar.b(0.0f);
                        fVar.setRotated(false);
                    }
                    if (gd0Var.b.m(f10)) {
                        org.telegram.ui.ActionBar.q6.s(photoViewer.c1, org.telegram.ui.ActionBar.j6.qg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.c1.setColorFilter((ColorFilter) null);
                    }
                }
                xe xeVar = photoViewer.X4.c;
                if (xeVar != null) {
                    xeVar.b = 0.0f;
                    xeVar.a = 0.0f;
                    xeVar.f = 1.0f;
                    xeVar.e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
