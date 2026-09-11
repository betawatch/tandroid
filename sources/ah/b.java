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
import bi.a2;
import bi.da;
import bi.h6;
import bi.k5;
import bi.n3;
import bi.w5;
import bi.x8;
import bi.y8;
import di.ba;
import di.e3;
import di.f4;
import di.n6;
import di.q7;
import di.t6;
import di.x3;
import di.z9;
import fi.k3;
import fi.r4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.n01;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                ((a1.e) obj).run();
                break;
            case 1:
                g0 g0Var = (g0) obj;
                g0Var.setVisibility(8);
                f0 f0Var = g0Var.b;
                if (f0Var != null) {
                    g0Var.removeView(f0Var);
                    g0Var.b = null;
                }
                g0Var.e = null;
                break;
            case 2:
                ((b1) obj).x.c();
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
                    ofFloat.addUpdateListener(new d0(this, 6));
                    z0Var.J.setStartDelay(3000L);
                    z0Var.J.setDuration(550L);
                    z0Var.J.setInterpolator(new LinearInterpolator());
                    z0Var.J.start();
                    break;
                }
                break;
            case 6:
                ((a2) obj).I = null;
                break;
            case 7:
                n3 n3Var = (n3) obj;
                n3Var.r5.invalidate();
                n3Var.setAnimatedTop(0);
                n3Var.r5.V2 = true;
                View view = n3Var.F1;
                if (view != null && view.getVisibility() == 0) {
                    n3Var.F1.setTranslationY(((1.0f - n3Var.getTopViewEnterProgress()) * n3Var.F1.getLayoutParams().height) + n3Var.S1);
                }
                n3Var.r5.e2 = null;
                break;
            case 8:
                k5 k5Var = (k5) obj;
                k5Var.c[1].setVisibility(8);
                k5Var.c[0].setAlpha(1.0f);
                k5Var.c[0].setTranslationY(0.0f);
                break;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                n01 n01Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                n01Var.R = 1.0f;
                n01Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 10:
                ((w5) obj).M = null;
                break;
            case 11:
                h6 h6Var = (h6) obj;
                h6Var.w = null;
                h6Var.r = 1.0f;
                h6Var.invalidate();
                break;
            case 12:
            default:
                super.onAnimationEnd(animator);
                break;
            case 13:
                da daVar = (da) obj;
                daVar.H = false;
                daVar.G = 0.0f;
                daVar.invalidate();
                daVar.requestLayout();
                daVar.J.requestLayout();
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
                di.e0 e0Var = d0Var.p;
                if (e0Var.n.contains(d0Var)) {
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
                    e0Var.n.remove(d0Var);
                }
                e0Var.invalidate();
                break;
            case 16:
                x3 x3Var = ((e3) obj).h;
                x3Var.F.setVisibility(8);
                x3Var.d.setVisibility(8);
                break;
            case 17:
                f4 f4Var = (f4) obj;
                f4Var.o0 = 1.0f;
                f4Var.invalidate();
                break;
            case 18:
                super.onAnimationEnd(animator);
                n6 n6Var = (n6) obj;
                ImageView imageView = n6Var.c;
                n6Var.c = n6Var.d;
                n6Var.d = imageView;
                imageView.bringToFront();
                n6Var.d.setVisibility(8);
                n6Var.h = null;
                break;
            case 19:
                super.onAnimationEnd(animator);
                ((t6) obj).w = null;
                break;
            case 20:
                q7 q7Var = (q7) obj;
                if (q7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) q7Var.getParent()).removeView(q7Var);
                    break;
                }
                break;
            case 21:
                ((ba) obj).N = false;
                break;
            case 22:
                z9 z9Var = (z9) obj;
                z9Var.setTranslationY(0.0f);
                z9Var.d = null;
                break;
            case 23:
                fi.y yVar = (fi.y) obj;
                yVar.setVisibility(8);
                yVar.a = null;
                break;
            case 24:
                ((k3) obj).y.setVisibility(8);
                break;
            case 25:
                ((r4) obj).I.setVisibility(8);
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
                y8 y8Var = (y8) this.b;
                xi0 xi0Var = ((x8) y8Var.a.get(y8Var.d)).c;
                xi0Var.M = 2;
                xi0Var.start();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
