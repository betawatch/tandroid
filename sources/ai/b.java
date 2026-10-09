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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.l01;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                ((n2) obj).I = null;
                break;
            case 4:
                b4 b4Var = (b4) obj;
                b4Var.s5.invalidate();
                b4Var.setAnimatedTop(0);
                b4Var.s5.V2 = true;
                View view = b4Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    b4Var.G1.setTranslationY(((1.0f - b4Var.getTopViewEnterProgress()) * b4Var.G1.getLayoutParams().height) + b4Var.T1);
                }
                b4Var.s5.e2 = null;
                break;
            case 5:
                b6 b6Var = (b6) obj;
                b6Var.c[1].setVisibility(8);
                b6Var.c[0].setAlpha(1.0f);
                b6Var.c[0].setTranslationY(0.0f);
                break;
            case 6:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                l01 l01Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                l01Var.R = 1.0f;
                l01Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 7:
                ((n6) obj).M = null;
                break;
            case 8:
                z6 z6Var = (z6) obj;
                z6Var.w = null;
                z6Var.r = 1.0f;
                z6Var.invalidate();
                break;
            case 9:
            default:
                super.onAnimationEnd(animator);
                break;
            case 10:
                xa xaVar = (xa) obj;
                xaVar.H = false;
                xaVar.G = 0.0f;
                xaVar.invalidate();
                xaVar.requestLayout();
                xaVar.J.requestLayout();
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
                ci.v3 v3Var = ((ci.c3) obj).h;
                v3Var.F.setVisibility(8);
                v3Var.d.setVisibility(8);
                break;
            case 14:
                ci.d4 d4Var = (ci.d4) obj;
                d4Var.o0 = 1.0f;
                d4Var.invalidate();
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
                ((ei.p4) obj).I.setVisibility(8);
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
                org.telegram.ui.v3 v3Var2 = (org.telegram.ui.v3) obj;
                v3Var2.w = 1.0f;
                v3Var2.n();
                v3Var2.i();
                v3Var2.h();
                v3Var2.a.unlock();
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
                q9 q9Var = (q9) this.b;
                ck0 ck0Var = ((p9) q9Var.a.get(q9Var.d)).c;
                ck0Var.L = 2;
                ck0Var.start();
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
