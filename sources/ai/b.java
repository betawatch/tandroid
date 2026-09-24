package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.d01;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
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
            case 26:
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
                c cVar = (c) obj;
                cVar.h = 1.0f;
                cVar.invalidate();
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((a0) obj).O.p = false;
                break;
            case 2:
                h1 h1Var = (h1) obj;
                m1 m1Var = h1Var.K;
                if (m1Var != null && h1Var.I == m1Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    h1Var.J = ofFloat;
                    ofFloat.addUpdateListener(new a(this, 5));
                    h1Var.J.setStartDelay(3000L);
                    h1Var.J.setDuration(550L);
                    h1Var.J.setInterpolator(new LinearInterpolator());
                    h1Var.J.start();
                    break;
                }
                break;
            case 3:
                ((m2) obj).I = null;
                break;
            case 4:
                a4 a4Var = (a4) obj;
                a4Var.s5.invalidate();
                a4Var.setAnimatedTop(0);
                a4Var.s5.V2 = true;
                View view = a4Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    a4Var.G1.setTranslationY(((1.0f - a4Var.getTopViewEnterProgress()) * a4Var.G1.getLayoutParams().height) + a4Var.T1);
                }
                a4Var.s5.e2 = null;
                break;
            case 5:
                a6 a6Var = (a6) obj;
                a6Var.c[1].setVisibility(8);
                a6Var.c[0].setAlpha(1.0f);
                a6Var.c[0].setTranslationY(0.0f);
                break;
            case 6:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                d01 d01Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                d01Var.R = 1.0f;
                d01Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 7:
                ((m6) obj).M = null;
                break;
            case 8:
                y6 y6Var = (y6) obj;
                y6Var.w = null;
                y6Var.r = 1.0f;
                y6Var.invalidate();
                break;
            case 9:
            default:
                super.onAnimationEnd(animator);
                break;
            case 10:
                wa waVar = (wa) obj;
                waVar.H = false;
                waVar.G = 0.0f;
                waVar.invalidate();
                waVar.requestLayout();
                waVar.J.requestLayout();
                break;
            case 11:
                ci.m mVar = ((ci.g) obj).c0;
                if (mVar.g0 == animator) {
                    mVar.g0 = null;
                    mVar.f.getEditText().setScrollY(mVar.b0);
                    break;
                }
                break;
            case 12:
                ci.d0 d0Var = (ci.d0) obj;
                d0Var.l = 1.0f;
                ci.e0 e0Var = d0Var.p;
                if (e0Var.n.contains(d0Var)) {
                    d0Var.c.onDetachedFromWindow();
                    ci.c0 c0Var = d0Var.d;
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
            case 13:
                ci.w3 w3Var = ((ci.d3) obj).h;
                w3Var.F.setVisibility(8);
                w3Var.d.setVisibility(8);
                break;
            case 14:
                ci.e4 e4Var = (ci.e4) obj;
                e4Var.o0 = 1.0f;
                e4Var.invalidate();
                break;
            case 15:
                super.onAnimationEnd(animator);
                ci.n6 n6Var = (ci.n6) obj;
                ImageView imageView = n6Var.c;
                n6Var.c = n6Var.d;
                n6Var.d = imageView;
                imageView.bringToFront();
                n6Var.d.setVisibility(8);
                n6Var.h = null;
                break;
            case 16:
                super.onAnimationEnd(animator);
                ((ci.t6) obj).w = null;
                break;
            case 17:
                ci.o7 o7Var = (ci.o7) obj;
                if (o7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) o7Var.getParent()).removeView(o7Var);
                    break;
                }
                break;
            case 18:
                ((ci.y9) obj).N = false;
                break;
            case 19:
                ci.w9 w9Var = (ci.w9) obj;
                w9Var.setTranslationY(0.0f);
                w9Var.d = null;
                break;
            case 20:
                ei.y yVar = (ei.y) obj;
                yVar.setVisibility(8);
                yVar.a = null;
                break;
            case 21:
                ((ei.k3) obj).y.setVisibility(8);
                break;
            case 22:
                ((ei.q4) obj).I.setVisibility(8);
                break;
            case 23:
                super.onAnimationEnd(animator);
                ig.g gVar = (ig.g) obj;
                if (!gVar.i1) {
                    gVar.u0 = false;
                    gVar.t0.setVisibility(8);
                    gVar.invalidate();
                }
                gVar.f0 = false;
                break;
            case 24:
                ((kg.e) obj).h.setVisibility(8);
                break;
            case 25:
                ((CropAreaView) obj).c0 = null;
                break;
            case 26:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.v = false;
                break;
            case 27:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj;
                Runnable runnable = i4Var.a0;
                if (runnable != null) {
                    runnable.run();
                    i4Var.a0 = null;
                    break;
                }
                break;
            case 28:
                org.telegram.ui.v3 v3Var = (org.telegram.ui.v3) obj;
                v3Var.w = 1.0f;
                v3Var.n();
                v3Var.i();
                v3Var.h();
                v3Var.a.unlock();
                break;
            case 29:
                org.telegram.ui.q4 q4Var = (org.telegram.ui.q4) obj;
                q4Var.getClass();
                q4Var.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 9:
                super.onAnimationStart(animator);
                p9 p9Var = (p9) this.b;
                ij0 ij0Var = ((o9) p9Var.a.get(p9Var.d)).c;
                ij0Var.L = 2;
                ij0Var.start();
                break;
            case 29:
                ((org.telegram.ui.q4) this.b).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
