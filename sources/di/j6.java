package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import org.telegram.messenger.ks;
import org.telegram.messenger.we;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.q30;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
                ks.e().k(99, 512);
                ks.e().o();
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
                    rd0 rd0Var = photoViewer.D1;
                    og.f fVar = rd0Var.c;
                    if (fVar != null) {
                        fVar.b(0.0f);
                        fVar.setRotated(false);
                    }
                    if (rd0Var.b.m(f10)) {
                        org.telegram.ui.ActionBar.t6.s(photoViewer.c1, org.telegram.ui.ActionBar.m6.qg, photoViewer.w2, PorterDuff.Mode.MULTIPLY);
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
