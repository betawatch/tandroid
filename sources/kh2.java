// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class kh2 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kh2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a aVar;
        a aVar2;
        qu1 qu1Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                CheckBoxBase checkBoxBase = (CheckBoxBase) obj;
                if (animator.equals(checkBoxBase.p)) {
                    checkBoxBase.p = null;
                }
                if (!checkBoxBase.q) {
                    checkBoxBase.C = null;
                    break;
                }
                break;
            case 1:
                bm2 bm2Var = (bm2) obj;
                bm2Var.l = 1.0f;
                cm2 cm2Var = bm2Var.p;
                if (cm2Var.n.contains(bm2Var)) {
                    bm2Var.c.K();
                    am2 am2Var = bm2Var.d;
                    if (am2Var != null) {
                        am2Var.pause();
                        bm2Var.d.release(null);
                        bm2Var.d = null;
                    }
                    TextureView textureView = bm2Var.e;
                    if (textureView != null) {
                        gm.B2(textureView);
                        bm2Var.e = null;
                    }
                    bm2Var.f = false;
                    cm2Var.n.remove(bm2Var);
                }
                cm2Var.invalidate();
                break;
            case 2:
                vn2 vn2Var = (vn2) obj;
                vn2Var.h = 1.0f;
                vn2Var.invalidate();
                break;
            case 3:
                ty2 ty2Var = (ty2) obj;
                ty2Var.l = 1.0f;
                ty2Var.o = null;
                ty2Var.p = null;
                ty2Var.q = null;
                View view = ty2Var.G;
                if (view != null) {
                    if (ty2Var.h == 0 && ty2Var.F) {
                        view.setVisibility(8);
                    }
                    ty2Var.G.invalidate();
                }
                ty2Var.c = -1;
                break;
            case 4:
                ((CropAreaView) obj).d0 = null;
                break;
            case 5:
                AnimatorSet[] animatorSetArr = (AnimatorSet[]) obj;
                if (animator.equals(animatorSetArr[0])) {
                    animatorSetArr[0] = null;
                    break;
                }
                break;
            case 6:
                AnimatorSet[] animatorSetArr2 = ((h73) obj).n;
                if (animator.equals(animatorSetArr2[0])) {
                    animatorSetArr2[0] = null;
                    break;
                }
                break;
            case 7:
                sg3 sg3Var = (sg3) obj;
                ug3 ug3Var = sg3Var.n;
                ug3Var.h = null;
                boolean z = ug3Var.s;
                tg3[] tg3VarArr = ug3Var.f;
                if (z) {
                    tg3VarArr[1].setVisibility(8);
                } else {
                    tg3 tg3Var = tg3VarArr[0];
                    tg3VarArr[0] = tg3VarArr[1];
                    tg3VarArr[1] = tg3Var;
                    tg3Var.setVisibility(8);
                    ug3Var.x = ug3Var.f[0].f == ug3Var.e.getFirstTabId();
                    ug3Var.e.i(1.0f, ug3Var.f[0].f);
                }
                ug3Var.n = false;
                sg3Var.c = false;
                sg3Var.b = false;
                aVar = ((d) ug3Var).actionBar;
                aVar.setEnabled(true);
                ug3Var.e.setEnabled(true);
                break;
            case 8:
                super.onAnimationEnd(animator);
                ((hh3) obj).P.p = false;
                break;
            case 9:
                mi3 mi3Var = (mi3) obj;
                mi3Var.M.a5(mi3Var.L, 0.0f);
                break;
            case 10:
                nk3 nk3Var = (nk3) obj;
                boolean z2 = nk3Var.H0;
                nk3Var.I0 = z2 ? 1.0f : 0.0f;
                if (!z2) {
                    nk3Var.F0.setVisibility(8);
                }
                View view2 = nk3Var.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 11:
                nk3 nk3Var2 = ((gk3) obj).u0;
                nk3Var2.i3 = null;
                if (!nk3Var2.m3) {
                    mk3[] mk3VarArr = nk3Var2.f0;
                    mk3 mk3Var = mk3VarArr[0];
                    mk3 mk3Var2 = mk3VarArr[1];
                    mk3VarArr[0] = mk3Var2;
                    mk3VarArr[1] = mk3Var;
                    nk3Var2.A0.h(1.0f, mk3Var2.h);
                    nk3Var2.p5(false);
                    nk3Var2.F5(-1, true);
                    nk3Var2.f0[0].d.getClass();
                    nk3Var2.f0[1].d.getClass();
                }
                nk3Var2.f0[1].setVisibility(8);
                nk3Var2.j5(true);
                nk3Var2.j3 = false;
                nk3Var2.p3 = false;
                aVar2 = ((d) nk3Var2).actionBar;
                aVar2.setEnabled(true);
                nk3Var2.A0.setEnabled(true);
                nk3Var2.M2(nk3Var2.f0[0]);
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((jk3) obj).setScrollEnabled(true);
                break;
            case 13:
                sm3 sm3Var = (sm3) ((rm3) obj).b;
                int i = sm3.L;
                sm3Var.c();
                break;
            case 14:
                sm3 sm3Var2 = (sm3) obj;
                sm3Var2.d = null;
                sm3Var2.e();
                break;
            case 15:
                un3 un3Var = (un3) obj;
                if (un3Var.F0 <= 0.0f && (qu1Var = un3Var.E0) != null && un3Var.G0 == animator) {
                    qu1Var.r0(un3Var.H0);
                    un3Var.E0 = null;
                    break;
                }
                break;
            case 16:
                cv3 cv3Var = (cv3) obj;
                cv3Var.P = false;
                cv3Var.d.setTranslationY(0.0f);
                cv3Var.d.setAlpha(0.0f);
                cv3Var.c(0.0f);
                cv3Var.S = 0.0f;
                cv3Var.j();
                break;
            case 17:
                ((wv3) obj).a.I1 = false;
                break;
            case 18:
                super.onAnimationEnd(animator);
                ((ty3) obj).d = null;
                break;
            case 19:
                ((e34) obj).a0 = null;
                break;
            case 20:
                super.onAnimationEnd(animator);
                ((n24) obj).n = null;
                break;
            case 21:
                w34 w34Var = (w34) obj;
                if (w34Var.w == animator) {
                    w34Var.w = null;
                    break;
                }
                break;
            case 22:
                de4 de4Var = (de4) obj;
                FrameLayout frameLayout = de4Var.b;
                a91 a91Var = (a91) de4Var.c;
                if (a91Var.getParent() != null) {
                    frameLayout.removeView(a91Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((fb) de4Var.d);
                break;
            case 23:
                ((gg4) obj).a();
                break;
            case 24:
                ((tl4) obj).v = null;
                break;
            case 25:
                hn4 hn4Var = (hn4) obj;
                hn4Var.w = 1.0f;
                hn4Var.invalidate();
                break;
            case 26:
                super.onAnimationEnd(animator);
                ft4 ft4Var = ((at4) obj).b;
                ft4Var.b.d = 0.0f;
                ft4Var.e0 = null;
                ft4Var.j(ft4Var.M);
                break;
            case 27:
                tt4 tt4Var = (tt4) ((cn0) obj).c;
                tt4Var.G.setVisibility(8);
                tt4Var.d.setVisibility(8);
                break;
            case 28:
                ((cw4) obj).b.v1.setVisibility(8);
                break;
            default:
                g95 g95Var = ((k85) obj).o;
                g95 g95Var2 = g95.s5;
                g95Var.R0();
                g95Var.b.invalidate();
                g95Var.J1.invalidate();
                if (g95Var.l2) {
                    g95Var.l2 = false;
                    g95Var.D0(true);
                    break;
                }
                break;
        }
    }
}
