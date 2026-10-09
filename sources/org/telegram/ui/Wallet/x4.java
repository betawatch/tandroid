package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.rj1;
import org.telegram.ui.s00;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class x4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                y4 y4Var = (y4) obj;
                y4Var.h = false;
                y4Var.n = null;
                y4Var.b.setLayerType(0, null);
                break;
            case 1:
                d5 d5Var = (d5) obj;
                d5Var.J = 0.0f;
                d5Var.K = 0.0f;
                d5Var.R = null;
                break;
            case 2:
                p5 p5Var = (p5) obj;
                k5 k5Var = p5Var.f0;
                k5Var.d = 0.0f;
                k5Var.i = 0.0f;
                p5Var.o0 = null;
                break;
            case 3:
                c6 c6Var = (c6) obj;
                c6Var.I = null;
                c6Var.i0 = 1.0f;
                c6Var.h0 = 0.0f;
                c6Var.g0 = 0.0f;
                c6Var.e();
                break;
            case 4:
                i8 i8Var = (i8) obj;
                i8Var.h = null;
                i8Var.c.setVisibility(i8Var.v ? 4 : 0);
                i8Var.e.setVisibility(i8Var.w ? 0 : 4);
                break;
            case 5:
                oi.i iVar = (oi.i) obj;
                ((rj1) iVar.b).getClass();
                ((rj1) iVar.b).c.setVisibility(4);
                break;
            case 6:
                ((org.telegram.ui.web.b1) obj).s.setVisibility(8);
                break;
            case 7:
                pg.d0 d0Var = (pg.d0) obj;
                d0Var.a.getPainting().c(null, d0Var.a.getCurrentColor(), true, null);
                d0Var.r = null;
                break;
            case 8:
                super.onAnimationEnd(animator);
                qg.l0 l0Var = (qg.l0) obj;
                ImageView imageView = l0Var.c;
                l0Var.c = l0Var.d;
                l0Var.d = imageView;
                imageView.bringToFront();
                l0Var.d.setVisibility(8);
                l0Var.h = null;
                break;
            case 9:
                qg.r1 r1Var = (qg.r1) obj;
                if (animator == r1Var.r) {
                    r1Var.f = r1Var.h;
                    r1Var.h = -1;
                    r1Var.r = null;
                    break;
                }
                break;
            case 10:
                rg.p0 p0Var = (rg.p0) obj;
                p0Var.n = p0Var.h ? 1.0f : 0.0f;
                p0Var.e();
                break;
            case 11:
                rg.a2 a2Var = (rg.a2) ((ci.c0) obj).b;
                a2Var.F = true;
                a2Var.invalidate();
                break;
            case 12:
                sg.f fVar = (sg.f) ((sg.e) obj).b;
                int i11 = sg.f.K;
                fVar.d();
                break;
            case 13:
                sg.f fVar2 = (sg.f) obj;
                fVar2.d = null;
                fVar2.e();
                break;
            case 14:
                super.onAnimationEnd(animator);
                sg.n nVar = ((sg.i) obj).b;
                nVar.b.d = 0.0f;
                nVar.a0 = null;
                nVar.k(nVar.L);
                break;
            case 15:
                tg.b bVar = (tg.b) obj;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 16:
                vh.g gVar = (vh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    vh.c cVar = (vh.c) it.next();
                    if (gVar.c.size() < gVar.d) {
                        gVar.c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = gVar.q;
                if (runnable != null) {
                    runnable.run();
                    gVar.q = null;
                }
                gVar.r = null;
                gVar.invalidateSelf();
                break;
            case 17:
                ((xh.j0) obj).b.w.setVisibility(8);
                break;
            case 18:
                yh.m2 m2Var = (yh.m2) obj;
                m2Var.E = 1.0f;
                m2Var.F = -1;
                yh.l2 l2Var = m2Var.H;
                if (l2Var != null && (z10 = l2Var.l) && z10) {
                    l2Var.l = false;
                    l2Var.b();
                }
                m2Var.G = null;
                break;
            case 19:
                s00 s00Var = ((yh.d7) obj).c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                break;
            case 20:
                ((yh.t5) obj).run();
                break;
            case 21:
                zg.t tVar = (zg.t) obj;
                tVar.setVisibility(8);
                zg.s sVar = tVar.b;
                if (sVar != null) {
                    tVar.removeView(sVar);
                    tVar.b = null;
                }
                tVar.e = null;
                break;
            default:
                ((zg.g0) obj).x.c();
                break;
        }
    }
}
