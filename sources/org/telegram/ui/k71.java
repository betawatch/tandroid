package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class k71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k71(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                x71 x71Var = ((m71) obj).a;
                if (!x71Var.r1.d()) {
                    x71Var.T1.setVisibility(8);
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((u81) obj).d = null;
                break;
            case 2:
                super.onAnimationEnd(animator);
                ((w91) obj).setScrollEnabled(true);
                break;
            case 3:
                ab1 ab1Var = (ab1) obj;
                if (animator.equals(ab1Var.d.L)) {
                    ab1Var.d.L = null;
                    break;
                }
                break;
            case 4:
                nb1 nb1Var = (nb1) obj;
                nb1Var.d = null;
                nb1Var.a = null;
                nb1Var.b = false;
                nb1Var.f.c.setAllowDrawCursor(true);
                break;
            case 5:
                ((org.telegram.ui.Wallet.f4) obj).L = null;
                break;
            case 6:
                ((org.telegram.ui.Wallet.m4) obj).f();
                break;
            case 7:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) obj;
                if (n6Var.N0 == animator) {
                    n6Var.N0 = null;
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Wallet.l6 l6Var = (org.telegram.ui.Wallet.l6) obj;
                l6Var.n = false;
                l6Var.r = null;
                l6Var.c.setLayerType(0, null);
                break;
            case 9:
                org.telegram.ui.Wallet.s6 s6Var = (org.telegram.ui.Wallet.s6) obj;
                s6Var.O = 0.0f;
                s6Var.P = 0.0f;
                s6Var.c0 = null;
                break;
            case 10:
                org.telegram.ui.Wallet.m7 m7Var = (org.telegram.ui.Wallet.m7) obj;
                m7Var.J = null;
                m7Var.j0 = 1.0f;
                m7Var.i0 = 0.0f;
                m7Var.h0 = 0.0f;
                m7Var.e();
                break;
            case 11:
                org.telegram.ui.Wallet.j9 j9Var = (org.telegram.ui.Wallet.j9) obj;
                EditTextBoldCursor editTextBoldCursor = j9Var.b;
                if (j9Var.s == animator) {
                    j9Var.s = null;
                    j9Var.a.setVisibility(j9Var.E ? 4 : 0);
                    editTextBoldCursor.setVisibility(j9Var.E ? 0 : 4);
                    if (j9Var.E && !j9Var.F) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.I3(editTextBoldCursor);
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.Wallet.ca caVar = (org.telegram.ui.Wallet.ca) obj;
                caVar.n = null;
                caVar.d.setVisibility(caVar.x ? 4 : 0);
                caVar.f.setVisibility(caVar.y ? 0 : 4);
                break;
            case 13:
                n1 n1Var = (n1) obj;
                ((cd1) n1Var.b).getClass();
                ((cd1) n1Var.b).c.setVisibility(4);
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
                tg.g0 g0Var = (tg.g0) obj;
                ImageView imageView = g0Var.c;
                g0Var.c = g0Var.d;
                g0Var.d = imageView;
                imageView.bringToFront();
                g0Var.d.setVisibility(8);
                g0Var.h = null;
                break;
            case 18:
                tg.i1 i1Var = (tg.i1) obj;
                if (animator == i1Var.r) {
                    i1Var.f = i1Var.h;
                    i1Var.h = -1;
                    i1Var.r = null;
                    break;
                }
                break;
            case 19:
                ug.r0 r0Var = (ug.r0) obj;
                r0Var.s = r0Var.r ? 1.0f : 0.0f;
                r0Var.e();
                break;
            case 20:
                ug.w1 w1Var = (ug.w1) ((hi.e0) obj).b;
                w1Var.G = true;
                w1Var.invalidate();
                break;
            case 21:
                vg.e eVar = (vg.e) ((org.telegram.ui.Cells.z9) obj).b;
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
