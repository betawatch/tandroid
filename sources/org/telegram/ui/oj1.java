package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class oj1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oj1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 3:
                ((r0.m0) this.b).a();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        switch (this.a) {
            case 0:
                fg.i iVar = (fg.i) this.b;
                ((qj1) iVar.b).getClass();
                ((qj1) iVar.b).c.setVisibility(4);
                break;
            case 1:
                ((org.telegram.ui.web.d1) this.b).s.setVisibility(8);
                break;
            case 2:
                qg.d0 d0Var = (qg.d0) this.b;
                d0Var.a.getPainting().c(null, d0Var.a.getCurrentColor(), true, null);
                d0Var.r = null;
                break;
            case 3:
                ((r0.m0) this.b).c();
                break;
            case 4:
                super.onAnimationEnd(animator);
                rg.n0 n0Var = (rg.n0) this.b;
                ImageView imageView = n0Var.c;
                n0Var.c = n0Var.d;
                n0Var.d = imageView;
                imageView.bringToFront();
                n0Var.d.setVisibility(8);
                n0Var.h = null;
                break;
            case 5:
                rg.t1 t1Var = (rg.t1) this.b;
                if (animator == t1Var.r) {
                    t1Var.f = t1Var.h;
                    t1Var.h = -1;
                    t1Var.r = null;
                    break;
                }
                break;
            case 6:
                sg.r0 r0Var = (sg.r0) this.b;
                r0Var.n = r0Var.h ? 1.0f : 0.0f;
                r0Var.e();
                break;
            case 7:
                sg.c2 c2Var = (sg.c2) ((di.c0) this.b).b;
                c2Var.F = true;
                c2Var.invalidate();
                break;
            case 8:
                super.onAnimationEnd(animator);
                tg.e eVar = (tg.e) ((bi.t5) this.b).b;
                eVar.b.d = 0.0f;
                eVar.T = null;
                eVar.h(eVar.I);
                break;
            case 9:
                ug.b bVar = (ug.b) this.b;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 10:
                wh.h hVar = (wh.h) this.b;
                Iterator it = hVar.h.iterator();
                while (it.hasNext()) {
                    wh.c cVar = (wh.c) it.next();
                    if (hVar.c.size() < hVar.d) {
                        hVar.c.push(cVar);
                    }
                    it.remove();
                }
                Runnable runnable = hVar.q;
                if (runnable != null) {
                    runnable.run();
                    hVar.q = null;
                }
                hVar.r = null;
                hVar.invalidateSelf();
                break;
            case 11:
                ((yh.h0) this.b).b.w.setVisibility(8);
                break;
            case 12:
                zh.q2 q2Var = (zh.q2) this.b;
                q2Var.E = 1.0f;
                q2Var.F = -1;
                zh.p2 p2Var = q2Var.H;
                if (p2Var != null && (z10 = p2Var.l) && z10) {
                    p2Var.l = false;
                    p2Var.b();
                }
                q2Var.G = null;
                break;
            default:
                s00 s00Var = ((zh.j7) this.b).c;
                s00Var.setScaleX(1.0f);
                s00Var.setScaleY(1.0f);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 3:
                ((r0.m0) this.b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public oj1(r0.m0 m0Var, View view) {
        this.a = 3;
        this.b = m0Var;
    }
}
