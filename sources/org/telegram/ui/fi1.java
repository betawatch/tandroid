package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.Iterator;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fi1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fi1(Object obj, int i10) {
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
                gi1 gi1Var = (gi1) obj;
                gi1Var.d = null;
                gi1Var.a = null;
                gi1Var.b = false;
                gi1Var.f.c.setAllowDrawCursor(true);
                break;
            case 1:
                ((org.telegram.ui.Wallet.y2) obj).K = null;
                break;
            case 2:
                ((org.telegram.ui.Wallet.e3) obj).f();
                break;
            case 3:
                org.telegram.ui.Wallet.y4 y4Var = (org.telegram.ui.Wallet.y4) obj;
                y4Var.h = false;
                y4Var.n = null;
                y4Var.b.setLayerType(0, null);
                break;
            case 4:
                org.telegram.ui.Wallet.d5 d5Var = (org.telegram.ui.Wallet.d5) obj;
                d5Var.J = 0.0f;
                d5Var.K = 0.0f;
                d5Var.R = null;
                break;
            case 5:
                org.telegram.ui.Wallet.p5 p5Var = (org.telegram.ui.Wallet.p5) obj;
                org.telegram.ui.Wallet.l5 l5Var = p5Var.f0;
                l5Var.d = 0.0f;
                l5Var.i = 0.0f;
                p5Var.o0 = null;
                break;
            case 6:
                org.telegram.ui.Wallet.c6 c6Var = (org.telegram.ui.Wallet.c6) obj;
                c6Var.I = null;
                c6Var.i0 = 1.0f;
                c6Var.h0 = 0.0f;
                c6Var.g0 = 0.0f;
                c6Var.e();
                break;
            case 7:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) obj;
                i8Var.h = null;
                i8Var.c.setVisibility(i8Var.v ? 4 : 0);
                i8Var.e.setVisibility(i8Var.w ? 0 : 4);
                break;
            case 8:
                org.telegram.ui.Components.ng0 ng0Var = (org.telegram.ui.Components.ng0) obj;
                ((xj1) ng0Var.b).getClass();
                ((xj1) ng0Var.b).c.setVisibility(4);
                break;
            case 9:
                ((org.telegram.ui.web.c1) obj).s.setVisibility(8);
                break;
            case 10:
                qg.d0 d0Var = (qg.d0) obj;
                d0Var.a.getPainting().c(null, d0Var.a.getCurrentColor(), true, null);
                d0Var.r = null;
                break;
            case 11:
                super.onAnimationEnd(animator);
                rg.n0 n0Var = (rg.n0) obj;
                ImageView imageView = n0Var.c;
                n0Var.c = n0Var.d;
                n0Var.d = imageView;
                imageView.bringToFront();
                n0Var.d.setVisibility(8);
                n0Var.h = null;
                break;
            case 12:
                rg.t1 t1Var = (rg.t1) obj;
                if (animator == t1Var.r) {
                    t1Var.f = t1Var.h;
                    t1Var.h = -1;
                    t1Var.r = null;
                    break;
                }
                break;
            case 13:
                sg.q0 q0Var = (sg.q0) obj;
                q0Var.n = q0Var.h ? 1.0f : 0.0f;
                q0Var.e();
                break;
            case 14:
                sg.a2 a2Var = (sg.a2) ((di.c0) obj).b;
                a2Var.F = true;
                a2Var.invalidate();
                break;
            case 15:
                tg.f fVar = (tg.f) ((tg.e) obj).b;
                int i11 = tg.f.K;
                fVar.d();
                break;
            case 16:
                tg.f fVar2 = (tg.f) obj;
                fVar2.d = null;
                fVar2.e();
                break;
            case 17:
                super.onAnimationEnd(animator);
                tg.n nVar = ((tg.i) obj).b;
                nVar.b.d = 0.0f;
                nVar.a0 = null;
                nVar.k(nVar.L);
                break;
            case 18:
                ug.b bVar = (ug.b) obj;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 19:
                wh.g gVar = (wh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    wh.c cVar = (wh.c) it.next();
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
            case 20:
                ((yh.i0) obj).b.w.setVisibility(8);
                break;
            case 21:
                zh.l2 l2Var = (zh.l2) obj;
                l2Var.E = 1.0f;
                l2Var.F = -1;
                zh.k2 k2Var = l2Var.H;
                if (k2Var != null && (z10 = k2Var.l) && z10) {
                    k2Var.l = false;
                    k2Var.b();
                }
                l2Var.G = null;
                break;
            default:
                x00 x00Var = ((zh.d7) obj).c;
                x00Var.setScaleX(1.0f);
                x00Var.setScaleY(1.0f);
                break;
        }
    }
}
