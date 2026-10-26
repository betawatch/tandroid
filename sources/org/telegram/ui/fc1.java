package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fc1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fc1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                tc1 tc1Var = ((hc1) obj).a;
                if (!tc1Var.q1.a()) {
                    tc1Var.S1.setVisibility(8);
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((ud1) obj).a = null;
                break;
            case 2:
                super.onAnimationEnd(animator);
                ((ye1) obj).setScrollEnabled(true);
                break;
            case 3:
                cg1 cg1Var = (cg1) obj;
                if (animator.equals(cg1Var.d.K)) {
                    cg1Var.d.K = null;
                    break;
                }
                break;
            case 4:
                rg1 rg1Var = (rg1) obj;
                rg1Var.d = null;
                rg1Var.a = null;
                rg1Var.b = false;
                rg1Var.f.c.setAllowDrawCursor(true);
                break;
            case 5:
                ((org.telegram.ui.Wallet.f3) obj).K = null;
                break;
            case 6:
                ((org.telegram.ui.Wallet.m3) obj).f();
                break;
            case 7:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) obj;
                if (m5Var.J0 == animator) {
                    m5Var.J0 = null;
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Wallet.k5 k5Var = (org.telegram.ui.Wallet.k5) obj;
                k5Var.h = false;
                k5Var.n = null;
                k5Var.b.setLayerType(0, null);
                break;
            case 9:
                org.telegram.ui.Wallet.r5 r5Var = (org.telegram.ui.Wallet.r5) obj;
                r5Var.N = 0.0f;
                r5Var.O = 0.0f;
                r5Var.b0 = null;
                break;
            case 10:
                org.telegram.ui.Wallet.l6 l6Var = (org.telegram.ui.Wallet.l6) obj;
                l6Var.I = null;
                l6Var.i0 = 1.0f;
                l6Var.h0 = 0.0f;
                l6Var.g0 = 0.0f;
                l6Var.e();
                break;
            case 11:
                org.telegram.ui.Wallet.n8 n8Var = (org.telegram.ui.Wallet.n8) obj;
                EditTextBoldCursor editTextBoldCursor = n8Var.b;
                if (n8Var.s == animator) {
                    n8Var.s = null;
                    n8Var.a.setVisibility(n8Var.x ? 4 : 0);
                    editTextBoldCursor.setVisibility(n8Var.x ? 0 : 4);
                    if (n8Var.x && !n8Var.y) {
                        editTextBoldCursor.requestFocus();
                        AndroidUtilities.showKeyboard(editTextBoldCursor);
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) obj;
                h9Var.n = null;
                h9Var.d.setVisibility(h9Var.w ? 4 : 0);
                h9Var.f.setVisibility(h9Var.x ? 0 : 4);
                break;
            case 13:
                org.telegram.ui.Components.ig0 ig0Var = (org.telegram.ui.Components.ig0) obj;
                ((ni1) ig0Var.b).getClass();
                ((ni1) ig0Var.b).c.setVisibility(4);
                break;
            case 14:
                ((org.telegram.ui.web.a1) obj).s.setVisibility(8);
                break;
            case 15:
                rg.e0 e0Var = (rg.e0) obj;
                e0Var.a.getPainting().c(null, e0Var.a.getCurrentColor(), true, null);
                e0Var.r = null;
                break;
            case 16:
                super.onAnimationEnd(animator);
                sg.m0 m0Var = (sg.m0) obj;
                ImageView imageView = m0Var.c;
                m0Var.c = m0Var.d;
                m0Var.d = imageView;
                imageView.bringToFront();
                m0Var.d.setVisibility(8);
                m0Var.h = null;
                break;
            case 17:
                sg.t1 t1Var = (sg.t1) obj;
                if (animator == t1Var.r) {
                    t1Var.f = t1Var.h;
                    t1Var.h = -1;
                    t1Var.r = null;
                    break;
                }
                break;
            case 18:
                tg.p0 p0Var = (tg.p0) obj;
                p0Var.s = p0Var.r ? 1.0f : 0.0f;
                p0Var.e();
                break;
            case 19:
                tg.a2 a2Var = (tg.a2) ((fi.c0) obj).b;
                a2Var.F = true;
                a2Var.invalidate();
                break;
            case 20:
                ug.f fVar = (ug.f) ((ug.e) obj).b;
                int i11 = ug.f.K;
                fVar.d();
                break;
            case 21:
                ug.f fVar2 = (ug.f) obj;
                fVar2.d = null;
                fVar2.e();
                break;
            case 22:
                super.onAnimationEnd(animator);
                ug.n nVar = ((ug.i) obj).b;
                nVar.b.d = 0.0f;
                nVar.d0 = null;
                nVar.j(nVar.L);
                break;
            case 23:
                vg.b bVar = (vg.b) obj;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 24:
                xh.g gVar = (xh.g) obj;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    xh.c cVar = (xh.c) it.next();
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
            default:
                ((zh.g0) obj).b.w.setVisibility(8);
                break;
        }
    }
}
