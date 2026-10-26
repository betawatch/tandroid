package bh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import bi.qc;
import bi.r5;
import bi.rc;
import bi.s5;
import di.i5;
import di.k7;
import di.l7;
import di.m4;
import di.o1;
import di.o8;
import di.u2;
import di.w4;
import fi.b6;
import fi.b7;
import fi.e9;
import fi.g9;
import fi.h6;
import fi.o3;
import fi.v3;
import fi.w2;
import hi.m3;
import hi.o4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.wz0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((a1.f) obj).run();
                break;
            case 1:
                ((u) obj).v.setVisibility(4);
                break;
            case 2:
                x xVar = (x) obj;
                xVar.setVisibility(8);
                w wVar = xVar.b;
                if (wVar != null) {
                    xVar.removeView(wVar);
                    xVar.b = null;
                }
                xVar.e = null;
                break;
            case 3:
                ((p0) obj).x.c();
                break;
            case 4:
                s5 s5Var = (s5) obj;
                s5Var.E = 1.0f;
                s5Var.F = -1;
                r5 r5Var = s5Var.H;
                if (r5Var != null && (z10 = r5Var.l) && z10) {
                    r5Var.l = false;
                    r5Var.b();
                }
                s5Var.G = null;
                break;
            case 5:
                qc qcVar = ((rc) obj).c;
                qcVar.setScaleX(1.0f);
                qcVar.setScaleY(1.0f);
                break;
            case 6:
                di.a aVar = (di.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                break;
            case 7:
                super.onAnimationEnd(animator);
                ((di.q) obj).O.p = false;
                break;
            case 8:
                di.q0 q0Var = (di.q0) obj;
                di.v0 v0Var = q0Var.K;
                if (v0Var != null && q0Var.I == v0Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    q0Var.J = ofFloat;
                    ofFloat.addUpdateListener(new ai.g0(this, 15));
                    q0Var.J.setStartDelay(3000L);
                    q0Var.J.setDuration(550L);
                    q0Var.J.setInterpolator(new LinearInterpolator());
                    q0Var.J.start();
                    break;
                }
                break;
            case 9:
                ((o1) obj).I = null;
                break;
            case 10:
                u2 u2Var = (u2) obj;
                u2Var.w5.invalidate();
                u2Var.setAnimatedTop(0);
                u2Var.w5.K2 = true;
                View view = u2Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    u2Var.G1.setTranslationY(((1.0f - u2Var.getTopViewEnterProgress()) * u2Var.G1.getLayoutParams().height) + u2Var.T1);
                }
                u2Var.w5.T1 = null;
                break;
            case 11:
                m4 m4Var = (m4) obj;
                m4Var.c[1].setVisibility(8);
                m4Var.c[0].setAlpha(1.0f);
                m4Var.c[0].setTranslationY(0.0f);
                break;
            case 12:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                wz0 wz0Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                wz0Var.R = 1.0f;
                wz0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 13:
                ((w4) obj).M = null;
                break;
            case 14:
                i5 i5Var = (i5) obj;
                i5Var.w = null;
                i5Var.r = 1.0f;
                i5Var.invalidate();
                break;
            case 15:
            default:
                super.onAnimationEnd(animator);
                break;
            case 16:
                o8 o8Var = (o8) obj;
                o8Var.H = false;
                o8Var.G = 0.0f;
                o8Var.invalidate();
                o8Var.requestLayout();
                o8Var.J.requestLayout();
                break;
            case 17:
                fi.m mVar = ((fi.g) obj).c0;
                if (mVar.g0 == animator) {
                    mVar.g0 = null;
                    mVar.f.getEditText().setScrollY(mVar.b0);
                    break;
                }
                break;
            case 18:
                fi.d0 d0Var = (fi.d0) obj;
                d0Var.l = 1.0f;
                fi.e0 e0Var = d0Var.p;
                if (e0Var.n.contains(d0Var)) {
                    d0Var.c.onDetachedFromWindow();
                    fi.c0 c0Var = d0Var.d;
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
            case 19:
                o3 o3Var = ((w2) obj).b;
                o3Var.F.setVisibility(8);
                o3Var.d.setVisibility(8);
                break;
            case 20:
                v3 v3Var = (v3) obj;
                v3Var.o0 = 1.0f;
                v3Var.invalidate();
                break;
            case 21:
                super.onAnimationEnd(animator);
                b6 b6Var = (b6) obj;
                ImageView imageView = b6Var.c;
                b6Var.c = b6Var.d;
                b6Var.d = imageView;
                imageView.bringToFront();
                b6Var.d.setVisibility(8);
                b6Var.h = null;
                break;
            case 22:
                super.onAnimationEnd(animator);
                ((h6) obj).w = null;
                break;
            case 23:
                b7 b7Var = (b7) obj;
                if (b7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) b7Var.getParent()).removeView(b7Var);
                    break;
                }
                break;
            case 24:
                ((g9) obj).N = false;
                break;
            case 25:
                e9 e9Var = (e9) obj;
                e9Var.setTranslationY(0.0f);
                e9Var.d = null;
                break;
            case 26:
                hi.p pVar = (hi.p) obj;
                if (pVar.d == animator) {
                    pVar.d = null;
                    pVar.a();
                    break;
                }
                break;
            case 27:
                hi.e0 e0Var2 = (hi.e0) obj;
                e0Var2.setVisibility(8);
                e0Var2.a = null;
                break;
            case 28:
                ((m3) obj).E.setVisibility(8);
                break;
            case 29:
                ((o4) obj).I.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 15:
                super.onAnimationStart(animator);
                l7 l7Var = (l7) this.b;
                xj0 xj0Var = ((k7) l7Var.a.get(l7Var.d)).c;
                xj0Var.L = 2;
                xj0Var.start();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
