package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bm;
import org.telegram.ui.Components.fi;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.sk;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.xg;
import org.telegram.ui.Components.yi;
import org.telegram.ui.bq;
import org.telegram.ui.cd;
import org.telegram.ui.cm;
import org.telegram.ui.dr;
import org.telegram.ui.ec;
import org.telegram.ui.fj;
import org.telegram.ui.il;
import org.telegram.ui.jm;
import org.telegram.ui.nc;
import org.telegram.ui.ok;
import org.telegram.ui.om;
import org.telegram.ui.pm;
import org.telegram.ui.rq;
import org.telegram.ui.wb;
import org.telegram.ui.wr;
import org.telegram.ui.zi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class v5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v5(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                r7 r7Var = (r7) this.b;
                AnimatorSet animatorSet = r7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    r7Var.h = null;
                    break;
                }
                break;
            case 14:
                rq rqVar = (rq) this.b;
                rqVar.h.b(rqVar.H ? 1.0f : 0.0f);
                rqVar.h.invalidateSelf();
                break;
            case 29:
                ((bm) this.b).a.O = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(((w5) this.b).e, 1000L);
                break;
            case 1:
                r7 r7Var = (r7) this.b;
                AnimatorSet animatorSet = r7Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    r7Var.h = null;
                    break;
                }
                break;
            case 2:
                u7 u7Var = (u7) this.b;
                u7Var.n.isMediaSpoilersRevealedInSharedMedia = true;
                u7Var.invalidate();
                break;
            case 3:
                super.onAnimationEnd(animator);
                ha haVar = (ha) this.b;
                ((ia) haVar.b).a.getTransitionParams().j();
                ((ia) haVar.b).a.getTransitionParams().g = false;
                ((ia) haVar.b).a.getTransitionParams().K1 = 1.0f;
                break;
            case 4:
                org.telegram.ui.j3 j3Var = (org.telegram.ui.j3) this.b;
                if (animator.equals(((wb) j3Var.b).V)) {
                    ((wb) j3Var.b).V = null;
                    break;
                }
                break;
            case 5:
                wb wbVar = (wb) this.b;
                if (animator.equals(wbVar.V)) {
                    wbVar.V = null;
                    break;
                }
                break;
            case 6:
                ((ec) this.b).I.setVisibility(8);
                break;
            case 7:
                cd cdVar = (cd) this.b;
                nc ncVar = cdVar.m0;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) cdVar.m0.getParent()).removeView(cdVar.m0);
                    }
                    cdVar.m0 = null;
                }
                cdVar.o0 = null;
                super.onAnimationEnd(animator);
                break;
            case 8:
                ok okVar = (ok) this.b;
                okVar.setAnimatedTop(0);
                View view = okVar.F1;
                if (view != null && view.getVisibility() == 0) {
                    okVar.F1.setTranslationY(((1.0f - okVar.getTopViewEnterProgress()) * okVar.F1.getLayoutParams().height) + okVar.S1);
                }
                okVar.q5.p9 = null;
                break;
            case 9:
                s40 s40Var = ((zi) this.b).b.e2;
                if (s40Var != null) {
                    s40Var.setVisibility(8);
                    break;
                }
                break;
            case 10:
                cm cmVar = (cm) this.b;
                if (cmVar.a) {
                    cmVar.d.setTranslationY(0.0f);
                }
                if (cmVar.b) {
                    cmVar.e.setTranslationY(0.0f);
                }
                if (cmVar.f) {
                    cmVar.h.setTranslationY(0.0f);
                }
                org.telegram.ui.Components.w9 w9Var = cmVar.c;
                if (w9Var != null) {
                    w9Var.setTranslationY(0.0f);
                }
                cmVar.n.H2[1] = null;
                break;
            case 11:
                jm jmVar = (jm) ((bi.u3) this.b).c;
                il ilVar = ((pm) jmVar.c).Q.b3;
                if (ilVar != null) {
                    ilVar.setIsMessageTransition(false);
                    ((pm) jmVar.c).Q.b3.h(true);
                    ((pm) jmVar.c).Q.b3.setVisibility(4);
                    break;
                }
                break;
            case 12:
                om omVar = (om) this.b;
                pm pmVar = omVar.b;
                ArrayList arrayList = pmVar.Q.n6;
                t1 t1Var = omVar.a;
                arrayList.remove(t1Var);
                View view2 = pmVar.Q.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    pmVar.Q.x0.invalidate();
                }
                t1Var.setAlpha(1.0f);
                t1Var.getTransitionParams().x0 = false;
                break;
            case 13:
                bq bqVar = (bq) this.b;
                bqVar.L = 0.0f;
                bqVar.K = 1.0f;
                View view3 = bqVar.a0;
                if (view3 != null) {
                    view3.invalidate();
                }
                bqVar.T.invalidate();
                fj fjVar = bqVar.Y;
                if (fjVar != null) {
                    fjVar.run();
                    bqVar.Y = null;
                    break;
                }
                break;
            case 14:
            default:
                super.onAnimationEnd(animator);
                break;
            case 15:
                dr drVar = (dr) this.b;
                View view4 = drVar.b;
                view4.setAlpha(1.0f);
                s4.o0.x0(view4);
                ((wr) drVar.d).c.removeView(view4);
                break;
            case 16:
                org.telegram.ui.Components.g6 g6Var = (org.telegram.ui.Components.g6) this.b;
                g6Var.d = null;
                g6Var.b.clear();
                break;
            case 17:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.b;
                animatedPhoneNumberEditText.n = null;
                animatedPhoneNumberEditText.f.clear();
                break;
            case 18:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.b;
                n6Var.c();
                n6Var.k = null;
                n6Var.h = 0.0f;
                n6Var.m = 0.0f;
                n6Var.invalidateSelf();
                Runnable runnable = n6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                n6Var.o = null;
                CharSequence charSequence = n6Var.p;
                if (charSequence == null) {
                    rg rgVar = n6Var.C;
                    if (rgVar != null) {
                        rgVar.run();
                        break;
                    }
                } else {
                    n6Var.q(charSequence, true, n6Var.q);
                    n6Var.p = null;
                    n6Var.q = false;
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Components.w9 w9Var2 = (org.telegram.ui.Components.w9) this.b;
                w9Var2.setVisibility(8);
                w9Var2.setImageDrawable(null);
                w9Var2.setAlpha(1.0f);
                break;
            case 20:
                org.telegram.ui.Components.d9 d9Var = ((org.telegram.ui.Components.r8) this.b).b;
                d9Var.f = false;
                d9Var.e.setVisibility(8);
                break;
            case 21:
                org.telegram.ui.Components.i9 i9Var = (org.telegram.ui.Components.i9) this.b;
                if (i9Var.f != null) {
                    i9Var.e = 1.0f;
                    i9Var.n();
                    if (i9Var.g) {
                        i9Var.g = false;
                        Runnable runnable2 = i9Var.j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    i9Var.f();
                }
                i9Var.f = null;
                break;
            case 22:
                ((tf) this.b).f.b0.setVisibility(8);
                break;
            case 23:
                ((xg) this.b).d0 = 1.0f;
                break;
            case 24:
                ((fi) this.b).c.s.setVisibility(8);
                break;
            case 25:
                ((hi) this.b).d.v.setVisibility(8);
                break;
            case 26:
                yi yiVar = (yi) this.b;
                yiVar.Z0 = null;
                if (!yiVar.q1) {
                    if (yiVar.X0.getTag() == null && yiVar.Q0 == 0 && !yiVar.T0) {
                        yiVar.a1.setVisibility(4);
                    }
                    yiVar.i1.setVisibility(4);
                    break;
                } else {
                    org.telegram.ui.ActionBar.w0 w0Var = yiVar.e1;
                    if (w0Var != null) {
                        w0Var.setVisibility(4);
                        break;
                    }
                }
                break;
            case 27:
                super.onAnimationEnd(animator);
                tk tkVar = (tk) this.b;
                tkVar.s.setVisibility(8);
                tkVar.n = 0;
                ik ikVar = tkVar.r;
                ikVar.setAlpha(1.0f);
                ikVar.setScaleX(1.0f);
                ikVar.setScaleY(1.0f);
                ikVar.setTranslationX(0.0f);
                ikVar.invalidate();
                break;
            case 28:
                sk skVar = (sk) this.b;
                if (skVar.X.H.getTag() == null) {
                    skVar.X.H.setVisibility(4);
                }
                skVar.X.I = null;
                break;
            case 29:
                bm bmVar = (bm) this.b;
                if (animator.equals(bmVar.a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = bmVar.a;
                    chatAttachAlertPhotoLayout.c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    break;
                }
                break;
        }
    }

    public v5(dr drVar, s4.o0 o0Var) {
        this.a = 15;
        this.b = drVar;
    }
}
