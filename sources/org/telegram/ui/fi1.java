package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.Iterator;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                ((org.telegram.ui.Wallet.x2) obj).K = null;
                break;
            case 2:
                ((org.telegram.ui.Wallet.d3) obj).f();
                break;
            case 3:
                org.telegram.ui.Wallet.x4 x4Var = (org.telegram.ui.Wallet.x4) obj;
                x4Var.h = false;
                x4Var.n = null;
                x4Var.b.setLayerType(0, null);
                break;
            case 4:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) obj;
                c5Var.J = 0.0f;
                c5Var.K = 0.0f;
                c5Var.R = null;
                break;
            case 5:
                org.telegram.ui.Wallet.o5 o5Var = (org.telegram.ui.Wallet.o5) obj;
                org.telegram.ui.Wallet.j5 j5Var = o5Var.f0;
                j5Var.d = 0.0f;
                j5Var.i = 0.0f;
                o5Var.o0 = null;
                break;
            case 6:
                org.telegram.ui.Wallet.b6 b6Var = (org.telegram.ui.Wallet.b6) obj;
                b6Var.I = null;
                b6Var.i0 = 1.0f;
                b6Var.h0 = 0.0f;
                b6Var.g0 = 0.0f;
                b6Var.e();
                break;
            case 7:
                org.telegram.ui.Wallet.h8 h8Var = (org.telegram.ui.Wallet.h8) obj;
                h8Var.h = null;
                h8Var.c.setVisibility(h8Var.v ? 4 : 0);
                h8Var.e.setVisibility(h8Var.w ? 0 : 4);
                break;
            case 8:
                org.telegram.ui.Components.mg0 mg0Var = (org.telegram.ui.Components.mg0) obj;
                ((yj1) mg0Var.b).getClass();
                ((yj1) mg0Var.b).c.setVisibility(4);
                break;
            case 9:
                ((org.telegram.ui.web.b1) obj).s.setVisibility(8);
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
                y00 y00Var = ((zh.d7) obj).c;
                y00Var.setScaleX(1.0f);
                y00Var.setScaleY(1.0f);
                break;
        }
    }
}
