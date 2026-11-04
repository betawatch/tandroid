package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.hs;
import org.telegram.messenger.re;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.i30;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p6(Object obj, float f10, Runnable runnable, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = f10;
        this.c = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.a;
        Runnable runnable = this.c;
        float f10 = this.b;
        Object obj = this.d;
        switch (i3) {
            case 0:
                q6 q6Var = (q6) obj;
                q6Var.E = f10;
                q6Var.invalidate();
                if (animator == q6Var.F && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                ei.v1 v1Var = (ei.v1) obj;
                v1Var.n = f10;
                v1Var.invalidate();
                if (animator == v1Var.r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                gi.n2 n2Var = (gi.n2) obj;
                n2Var.h = f10;
                n2Var.i();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                gi.va vaVar = (gi.va) obj;
                vaVar.M = null;
                vaVar.J = f10;
                vaVar.j();
                vaVar.r.invalidate();
                vaVar.n.invalidate();
                runnable.run();
                vaVar.Q.e();
                hs.e().k(99, 512);
                hs.e().o();
                vaVar.n();
                Runnable runnable2 = vaVar.R;
                if (runnable2 != null) {
                    runnable2.run();
                    vaVar.R = null;
                }
                vaVar.r.invalidate();
                vaVar.i0.invalidate();
                break;
            case 4:
                i30 i30Var = (i30) obj;
                i30Var.h = f10;
                i30Var.a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                photoViewer.q6 = null;
                photoViewer.g6 = 0.0f;
                photoViewer.c6 = 0.0f;
                photoViewer.h6 = 0.0f;
                float u22 = photoViewer.u2(false);
                photoViewer.f6 = u22;
                photoViewer.b6 = u22;
                photoViewer.f0.invalidate();
                CropAreaView cropAreaView = photoViewer.D1.b.a;
                float u23 = photoViewer.u2(false);
                cropAreaView.o0 = 0.0f;
                cropAreaView.p0 = u23;
                cropAreaView.q0 = 0.0f;
                cropAreaView.r0 = 0.0f;
                cropAreaView.invalidate();
                photoViewer.D1.c.setRotated(false);
                if (Math.abs(f10) > 0.0f) {
                    ad0 ad0Var = photoViewer.D1;
                    pg.e eVar = ad0Var.c;
                    if (eVar != null) {
                        eVar.b(0.0f);
                        eVar.setRotated(false);
                    }
                    if (ad0Var.b.m(f10)) {
                        org.telegram.ui.ActionBar.r6.t(photoViewer.c1, org.telegram.ui.ActionBar.k6.ng, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
                    } else {
                        photoViewer.c1.setColorFilter((ColorFilter) null);
                    }
                }
                re reVar = photoViewer.Y4.c;
                if (reVar != null) {
                    reVar.b = 0.0f;
                    reVar.a = 0.0f;
                    reVar.f = 1.0f;
                    reVar.e = 1.0f;
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
