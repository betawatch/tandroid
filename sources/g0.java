// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.w = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                h0 h0Var = (h0) obj;
                h0Var.O = null;
                h0Var.M = h0Var.N;
                h0Var.requestLayout();
                break;
            case 1:
                s1 s1Var = (s1) obj;
                ((fq8) s1Var).f0.e.c.r = false;
                FrameLayout frameLayout = s1Var.K;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(s1Var.L);
                    break;
                }
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.w = false;
                break;
            case 3:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                actionBarPopupWindow$ActionBarPopupWindowLayout.n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i = 0; i < itemsCount; i++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i);
                    if (!(childAt instanceof j8)) {
                        childAt.setTranslationY(0.0f);
                        childAt.setAlpha(childAt.isEnabled() ? 1.0f : 0.5f);
                    }
                }
                break;
            case 4:
                ((mv2) obj).run();
                break;
            case 5:
                gb gbVar = (gb) obj;
                if (!gbVar.e) {
                    gbVar.j();
                    break;
                }
                break;
            case 6:
                ic icVar = (ic) obj;
                if (icVar.d == animator) {
                    icVar.d = null;
                    icVar.a();
                    break;
                }
                break;
            case 7:
                ((rc) obj).h = 0.0f;
                break;
            case 8:
                HashMap hashMap = gm.l0;
                if (hashMap != null) {
                    hashMap.remove((Window) obj);
                    break;
                }
                break;
            case 9:
                qn qnVar = (qn) obj;
                qnVar.d = null;
                qnVar.b.clear();
                break;
            case 10:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) obj;
                animatedPhoneNumberEditText.S1 = null;
                animatedPhoneNumberEditText.Q1.clear();
                break;
            case 11:
                super.onAnimationEnd(animator);
                ho hoVar = (ho) obj;
                hoVar.b();
                hoVar.o = null;
                hoVar.j = 0.0f;
                hoVar.m = 0.0f;
                hoVar.l = 0.0f;
                hoVar.k = 0.0f;
                hoVar.r = 0.0f;
                hoVar.q = 0.0f;
                hoVar.invalidateSelf();
                Runnable runnable = hoVar.c0;
                if (runnable != null) {
                    runnable.run();
                }
                hoVar.t = null;
                CharSequence charSequence = hoVar.u;
                if (charSequence != null) {
                    hoVar.t(charSequence, true, hoVar.v);
                    hoVar.u = null;
                    hoVar.v = false;
                    break;
                } else {
                    b1 b1Var = hoVar.J;
                    if (b1Var != null) {
                        b1Var.run();
                        break;
                    }
                }
                break;
            case 12:
                et etVar = (et) obj;
                Button button = etVar.n;
                mu8 mu8Var = etVar.f;
                if (button == mu8Var) {
                    etVar.e.setVisibility(4);
                    break;
                } else {
                    mu8Var.setVisibility(4);
                    break;
                }
            case 13:
                super.onAnimationEnd(animator);
                eu euVar = (eu) obj;
                if (euVar != null) {
                    euVar.run();
                    break;
                }
                break;
            case 14:
                o oVar = (o) obj;
                Runnable runnable2 = oVar.b0;
                if (runnable2 != null) {
                    runnable2.run();
                    oVar.b0 = null;
                    break;
                }
                break;
            case 15:
                sx sxVar = (sx) obj;
                sxVar.x = 1.0f;
                sxVar.A();
                sxVar.u();
                sxVar.r();
                sxVar.a.e();
                break;
            case 16:
                bf0 bf0Var = (bf0) obj;
                bf0Var.setVisibility(8);
                bf0Var.setImageDrawable(null);
                bf0Var.setAlpha(1.0f);
                break;
            case 17:
                mc0 mc0Var = (mc0) ((yb0) obj).m1;
                mc0Var.f = false;
                mc0Var.e.setVisibility(8);
                break;
            case 18:
                ((qc0) obj).setVisibility(8);
                break;
            case 19:
                tc0 tc0Var = (tc0) obj;
                tc0Var.c = false;
                tc0Var.invalidate();
                break;
            case 20:
                gd0 gd0Var = (gd0) obj;
                if (gd0Var.f != null) {
                    gd0Var.e = 1.0f;
                    gd0Var.k();
                    if (gd0Var.g) {
                        gd0Var.g = false;
                        Runnable runnable3 = gd0Var.j;
                        if (runnable3 != null) {
                            runnable3.run();
                        }
                    }
                    gd0Var.d();
                }
                gd0Var.f = null;
                break;
            case 21:
                super.onAnimationEnd(animator);
                ng0 ng0Var = (ng0) obj;
                if (!ng0Var.j1) {
                    ng0Var.v0 = false;
                    ng0Var.u0.setVisibility(8);
                    ng0Var.invalidate();
                }
                ng0Var.g0 = false;
                break;
            case 22:
                mn0 mn0Var = (mn0) obj;
                mn0Var.b = 1.0f;
                mn0Var.invalidate();
                break;
            case 23:
                ((lp0) obj).i0.setVisibility(8);
                break;
            case 24:
                super.onAnimationEnd(animator);
                ((wp0) obj).x = null;
                break;
            case 25:
                aq0 aq0Var = (aq0) obj;
                aq0Var.setVisibility(8);
                aq0Var.a = null;
                break;
            case 26:
                ((qw0) obj).s.setVisibility(8);
                break;
            case 27:
                ((wx0) obj).F.setVisibility(8);
                break;
            case 28:
                xy0 xy0Var = (xy0) obj;
                if (xy0Var.G == animator) {
                    xy0Var.H = xy0Var.I;
                    Iterator it = xy0Var.J.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    break;
                }
                break;
            default:
                fz0 fz0Var = (fz0) obj;
                xy0 xy0Var2 = fz0Var.a;
                if (xy0Var2 != null) {
                    xy0Var2.b = true;
                    xy0Var2.invalidate();
                }
                fz0Var.W = fz0Var.V ? 1.0f : 0.0f;
                fz0Var.invalidate();
                if (!fz0Var.V) {
                    fz0Var.S.clear();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((fq8) ((s1) obj)).f0.e.c.r = true;
                break;
            case 18:
                ((qc0) obj).setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
