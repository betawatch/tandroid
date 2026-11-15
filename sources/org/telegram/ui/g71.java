package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class g71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g71(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                t71 t71Var = ((i71) obj).a;
                if (!t71Var.r1.a()) {
                    t71Var.T1.setVisibility(8);
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((q81) obj).d = null;
                break;
            case 2:
                super.onAnimationEnd(animator);
                ((s91) obj).setScrollEnabled(true);
                break;
            case 3:
                wa1 wa1Var = (wa1) obj;
                if (animator.equals(wa1Var.d.L)) {
                    wa1Var.d.L = null;
                    break;
                }
                break;
            case 4:
                jb1 jb1Var = (jb1) obj;
                jb1Var.d = null;
                jb1Var.a = null;
                jb1Var.b = false;
                jb1Var.f.c.setAllowDrawCursor(true);
                break;
            case 5:
                ((org.telegram.ui.Wallet.v3) obj).L = null;
                break;
            case 6:
                ((org.telegram.ui.Wallet.c4) obj).f();
                break;
            case 7:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) obj;
                if (y5Var.K0 == animator) {
                    y5Var.K0 = null;
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) obj;
                w5Var.n = false;
                w5Var.r = null;
                w5Var.c.setLayerType(0, null);
                break;
            case 9:
                org.telegram.ui.Wallet.c6 c6Var = (org.telegram.ui.Wallet.c6) obj;
                c6Var.O = 0.0f;
                c6Var.P = 0.0f;
                c6Var.c0 = null;
                break;
            case 10:
                org.telegram.ui.Wallet.w6 w6Var = (org.telegram.ui.Wallet.w6) obj;
                w6Var.J = null;
                w6Var.j0 = 1.0f;
                w6Var.i0 = 0.0f;
                w6Var.h0 = 0.0f;
                w6Var.e();
                break;
            case 11:
                org.telegram.ui.Wallet.u8 u8Var = (org.telegram.ui.Wallet.u8) obj;
                EditTextBoldCursor editTextBoldCursor = u8Var.b;
                if (u8Var.s == animator) {
                    u8Var.s = null;
                    u8Var.a.setVisibility(u8Var.y ? 4 : 0);
                    editTextBoldCursor.setVisibility(u8Var.y ? 0 : 4);
                    if (u8Var.y && !u8Var.E) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.J3(editTextBoldCursor);
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.Wallet.o9 o9Var = (org.telegram.ui.Wallet.o9) obj;
                o9Var.n = null;
                o9Var.d.setVisibility(o9Var.x ? 4 : 0);
                o9Var.f.setVisibility(o9Var.y ? 0 : 4);
                break;
            case 13:
                n1 n1Var = (n1) obj;
                ((zc1) n1Var.b).getClass();
                ((zc1) n1Var.b).c.setVisibility(4);
                break;
            case 14:
                ((org.telegram.ui.web.v0) obj).s.setVisibility(8);
                break;
            case 15:
                org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) obj;
                ajVar.j = false;
                ajVar.i = false;
                break;
            case 16:
                sg.v vVar = (sg.v) obj;
                vVar.a.getPainting().c(null, vVar.a.getCurrentColor(), true, null);
                vVar.r = null;
                break;
            case 17:
                super.onAnimationEnd(animator);
                tg.f0 f0Var = (tg.f0) obj;
                ImageView imageView = f0Var.c;
                f0Var.c = f0Var.d;
                f0Var.d = imageView;
                imageView.bringToFront();
                f0Var.d.setVisibility(8);
                f0Var.h = null;
                break;
            case 18:
                tg.h1 h1Var = (tg.h1) obj;
                if (animator == h1Var.r) {
                    h1Var.f = h1Var.h;
                    h1Var.h = -1;
                    h1Var.r = null;
                    break;
                }
                break;
            case 19:
                ug.q0 q0Var = (ug.q0) obj;
                q0Var.s = q0Var.r ? 1.0f : 0.0f;
                q0Var.e();
                break;
            case 20:
                ug.w1 w1Var = (ug.w1) ((hi.c0) obj).b;
                w1Var.G = true;
                w1Var.invalidate();
                break;
            case 21:
                vg.e eVar = (vg.e) ((org.telegram.ui.Cells.x9) obj).b;
                int i10 = vg.e.L;
                eVar.d();
                break;
            case 22:
                vg.e eVar2 = (vg.e) obj;
                eVar2.d = null;
                eVar2.e();
                break;
            case 23:
                super.onAnimationEnd(animator);
                vg.m mVar = ((vg.h) obj).b;
                mVar.b.d = 0.0f;
                mVar.e0 = null;
                mVar.j(mVar.M);
                break;
            case 24:
                wg.b bVar = (wg.b) obj;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 25:
                ((wi.h) obj).v = null;
                break;
            default:
                xh.f fVar = (xh.f) obj;
                Iterator it = fVar.h.iterator();
                while (it.hasNext()) {
                    xh.b bVar2 = (xh.b) it.next();
                    if (fVar.c.size() < fVar.d) {
                        fVar.c.push(bVar2);
                    }
                    it.remove();
                }
                Runnable runnable = fVar.q;
                if (runnable != null) {
                    runnable.run();
                    fVar.q = null;
                }
                fVar.r = null;
                fVar.invalidateSelf();
                break;
        }
    }
}
