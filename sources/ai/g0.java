package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import di.db;
import di.eb;
import di.u4;
import di.v4;
import fi.f4;
import fi.r4;
import fi.t6;
import fi.v3;
import fi.w7;
import hi.b3;
import hi.d9;
import hi.f9;
import hi.m3;
import hi.s5;
import hi.s6;
import hi.u3;
import hi.y5;
import ki.t2;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.tl;
import org.telegram.ui.vv0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        tl tlVar;
        boolean z10;
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                l0 l0Var = (l0) obj;
                if (l0Var.F0 <= 0.0f && (tlVar = l0Var.E0) != null && l0Var.G0 == animator) {
                    tlVar.q0(l0Var.H0);
                    l0Var.E0 = null;
                    break;
                }
                break;
            case 1:
                ((bi.g1) obj).b.w1.setVisibility(8);
                break;
            case 2:
                ((c1.a) obj).run();
                break;
            case 3:
                ((ch.p) obj).w.setVisibility(4);
                break;
            case 4:
                ch.s sVar = (ch.s) obj;
                sVar.setVisibility(8);
                ch.r rVar = sVar.b;
                if (rVar != null) {
                    sVar.removeView(rVar);
                    sVar.b = null;
                }
                sVar.e = null;
                break;
            case 5:
                ((ch.i0) obj).y.c();
                break;
            case 6:
                v4 v4Var = (v4) obj;
                v4Var.F = 1.0f;
                v4Var.G = -1;
                u4 u4Var = v4Var.I;
                if (u4Var != null && (z10 = u4Var.l) && z10) {
                    u4Var.l = false;
                    u4Var.b();
                }
                v4Var.H = null;
                break;
            case 7:
                db dbVar = ((eb) obj).c;
                dbVar.setScaleX(1.0f);
                dbVar.setScaleY(1.0f);
                break;
            case 8:
                fi.a aVar = (fi.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                break;
            case 9:
                super.onAnimationEnd(animator);
                ((fi.p) obj).P.p = false;
                break;
            case 10:
                fi.m0 m0Var = (fi.m0) obj;
                fi.r0 r0Var = m0Var.L;
                if (r0Var != null && m0Var.J == r0Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    m0Var.K = ofFloat;
                    ofFloat.addUpdateListener(new ah.g(this, 17));
                    m0Var.K.setStartDelay(3000L);
                    m0Var.K.setDuration(550L);
                    m0Var.K.setInterpolator(new LinearInterpolator());
                    m0Var.K.start();
                    break;
                }
                break;
            case 11:
                fi.i2 i2Var = (fi.i2) obj;
                i2Var.x7.invalidate();
                i2Var.setAnimatedTop(0);
                i2Var.x7.F2 = true;
                View view = i2Var.w2;
                if (view != null && view.getVisibility() == 0) {
                    i2Var.w2.setTranslationY(((1.0f - i2Var.getTopViewEnterProgress()) * i2Var.w2.getLayoutParams().height) + i2Var.J2);
                }
                i2Var.x7.O1 = null;
                break;
            case 12:
                v3 v3Var = (v3) obj;
                v3Var.c[1].setVisibility(8);
                v3Var.c[0].setAlpha(1.0f);
                v3Var.c[0].setTranslationY(0.0f);
                break;
            case 13:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                vv0 vv0Var = profileStoriesView.h;
                profileStoriesView.H = 1.0f;
                vv0Var.S = 1.0f;
                vv0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 14:
                ((f4) obj).N = null;
                break;
            case 15:
                r4 r4Var = (r4) obj;
                r4Var.x = null;
                r4Var.r = 1.0f;
                r4Var.invalidate();
                break;
            case 16:
            default:
                super.onAnimationEnd(animator);
                break;
            case 17:
                w7 w7Var = (w7) obj;
                w7Var.I = false;
                w7Var.H = 0.0f;
                w7Var.invalidate();
                w7Var.requestLayout();
                w7Var.K.requestLayout();
                break;
            case 18:
                hi.n nVar = ((hi.h) obj).d0;
                if (nVar.g0 == animator) {
                    nVar.g0 = null;
                    nVar.f.getEditText().setScrollY(nVar.c0);
                    break;
                }
                break;
            case 19:
                hi.m0 m0Var2 = (hi.m0) obj;
                m0Var2.l = 1.0f;
                hi.n0 n0Var = m0Var2.p;
                if (n0Var.n.contains(m0Var2)) {
                    m0Var2.c.S();
                    hi.l0 l0Var2 = m0Var2.d;
                    if (l0Var2 != null) {
                        l0Var2.pause();
                        m0Var2.d.release(null);
                        m0Var2.d = null;
                    }
                    TextureView textureView = m0Var2.e;
                    if (textureView != null) {
                        org.telegram.messenger.g0.E2(textureView);
                        m0Var2.e = null;
                    }
                    m0Var2.f = false;
                    n0Var.n.remove(m0Var2);
                }
                n0Var.invalidate();
                break;
            case 20:
                m3 m3Var = (m3) ((b3) obj).c;
                m3Var.G.setVisibility(8);
                m3Var.d.setVisibility(8);
                break;
            case 21:
                u3 u3Var = (u3) obj;
                u3Var.A0 = 1.0f;
                u3Var.invalidate();
                break;
            case 22:
                org.telegram.messenger.g0.E2((xi0) obj);
                break;
            case 23:
                super.onAnimationEnd(animator);
                s5 s5Var = (s5) obj;
                ImageView imageView = s5Var.c;
                s5Var.c = s5Var.d;
                s5Var.d = imageView;
                imageView.bringToFront();
                s5Var.d.setVisibility(8);
                s5Var.h = null;
                break;
            case 24:
                super.onAnimationEnd(animator);
                ((y5) obj).x = null;
                break;
            case 25:
                s6 s6Var = (s6) obj;
                if (s6Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) s6Var.getParent()).removeView(s6Var);
                    break;
                }
                break;
            case 26:
                ((f9) obj).O = false;
                break;
            case 27:
                d9 d9Var = (d9) obj;
                d9Var.setTranslationY(0.0f);
                d9Var.d = null;
                break;
            case 28:
                ki.u uVar = (ki.u) obj;
                uVar.setVisibility(8);
                uVar.a = null;
                break;
            case 29:
                ((t2) obj).F.setVisibility(8);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 16:
                super.onAnimationStart(animator);
                t6 t6Var = (t6) this.b;
                nh0 nh0Var = ((fi.s6) t6Var.a.get(t6Var.d)).c;
                nh0Var.M = 2;
                nh0Var.start();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
