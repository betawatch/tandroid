package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import bi.a9;
import bi.b2;
import bi.b9;
import bi.ga;
import bi.k6;
import bi.m5;
import bi.q3;
import bi.y5;
import di.c3;
import di.d4;
import di.l6;
import di.n7;
import di.r6;
import di.v3;
import di.v9;
import di.x9;
import fi.k3;
import fi.q4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.r01;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class b extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 28:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((a1.f) obj).run();
                break;
            case 1:
                f0 f0Var = (f0) obj;
                f0Var.setVisibility(8);
                e0 e0Var = f0Var.b;
                if (e0Var != null) {
                    f0Var.removeView(e0Var);
                    f0Var.b = null;
                }
                f0Var.e = null;
                break;
            case 2:
                ((a1) obj).x.c();
                break;
            case 3:
                bi.a aVar = (bi.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                break;
            case 4:
                super.onAnimationEnd(animator);
                ((bi.u) obj).O.p = false;
                break;
            case 5:
                bi.z0 z0Var = (bi.z0) obj;
                bi.e1 e1Var = z0Var.K;
                if (e1Var != null && z0Var.I == e1Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    z0Var.J = ofFloat;
                    ofFloat.addUpdateListener(new c0(this, 6));
                    z0Var.J.setStartDelay(3000L);
                    z0Var.J.setDuration(550L);
                    z0Var.J.setInterpolator(new LinearInterpolator());
                    z0Var.J.start();
                    break;
                }
                break;
            case 6:
                ((b2) obj).I = null;
                break;
            case 7:
                q3 q3Var = (q3) obj;
                q3Var.s5.invalidate();
                q3Var.setAnimatedTop(0);
                q3Var.s5.V2 = true;
                View view = q3Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    q3Var.G1.setTranslationY(((1.0f - q3Var.getTopViewEnterProgress()) * q3Var.G1.getLayoutParams().height) + q3Var.T1);
                }
                q3Var.s5.e2 = null;
                break;
            case 8:
                m5 m5Var = (m5) obj;
                m5Var.c[1].setVisibility(8);
                m5Var.c[0].setAlpha(1.0f);
                m5Var.c[0].setTranslationY(0.0f);
                break;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                r01 r01Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                r01Var.R = 1.0f;
                r01Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 10:
                ((y5) obj).M = null;
                break;
            case 11:
                k6 k6Var = (k6) obj;
                k6Var.w = null;
                k6Var.r = 1.0f;
                k6Var.invalidate();
                break;
            case 12:
            default:
                super.onAnimationEnd(animator);
                break;
            case 13:
                ga gaVar = (ga) obj;
                gaVar.H = false;
                gaVar.G = 0.0f;
                gaVar.invalidate();
                gaVar.requestLayout();
                gaVar.J.requestLayout();
                break;
            case 14:
                di.m mVar = ((di.g) obj).c0;
                if (mVar.g0 == animator) {
                    mVar.g0 = null;
                    mVar.f.getEditText().setScrollY(mVar.b0);
                    break;
                }
                break;
            case 15:
                di.d0 d0Var = (di.d0) obj;
                d0Var.l = 1.0f;
                di.e0 e0Var2 = d0Var.p;
                if (e0Var2.n.contains(d0Var)) {
                    d0Var.c.onDetachedFromWindow();
                    di.c0 c0Var = d0Var.d;
                    if (c0Var != null) {
                        c0Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        d0Var.e = null;
                    }
                    d0Var.f = false;
                    e0Var2.n.remove(d0Var);
                }
                e0Var2.invalidate();
                break;
            case 16:
                v3 v3Var = ((c3) obj).h;
                v3Var.F.setVisibility(8);
                v3Var.d.setVisibility(8);
                break;
            case 17:
                d4 d4Var = (d4) obj;
                d4Var.o0 = 1.0f;
                d4Var.invalidate();
                break;
            case 18:
                super.onAnimationEnd(animator);
                l6 l6Var = (l6) obj;
                ImageView imageView = l6Var.c;
                l6Var.c = l6Var.d;
                l6Var.d = imageView;
                imageView.bringToFront();
                l6Var.d.setVisibility(8);
                l6Var.h = null;
                break;
            case 19:
                super.onAnimationEnd(animator);
                ((r6) obj).w = null;
                break;
            case 20:
                n7 n7Var = (n7) obj;
                if (n7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) n7Var.getParent()).removeView(n7Var);
                    break;
                }
                break;
            case 21:
                ((x9) obj).N = false;
                break;
            case 22:
                v9 v9Var = (v9) obj;
                v9Var.setTranslationY(0.0f);
                v9Var.d = null;
                break;
            case 23:
                fi.x xVar = (fi.x) obj;
                xVar.setVisibility(8);
                xVar.a = null;
                break;
            case 24:
                ((k3) obj).y.setVisibility(8);
                break;
            case 25:
                ((q4) obj).I.setVisibility(8);
                break;
            case 26:
                super.onAnimationEnd(animator);
                jg.g gVar = (jg.g) obj;
                if (!gVar.i1) {
                    gVar.u0 = false;
                    gVar.t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f0 = false;
                break;
            case 27:
                ((lg.e) obj).h.setVisibility(8);
                break;
            case 28:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                break;
            case 29:
                ((CropAreaView) obj).c0 = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 12:
                super.onAnimationStart(animator);
                b9 b9Var = (b9) this.b;
                yj0 yj0Var = ((a9) b9Var.a.get(b9Var.d)).c;
                yj0Var.L = 2;
                yj0Var.start();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
