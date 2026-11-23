package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class i71 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i71(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        Object obj = this.b;
        switch (i7) {
            case 0:
                v71 v71Var = ((k71) obj).a;
                if (!v71Var.r1.b()) {
                    v71Var.T1.setVisibility(8);
                    break;
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((s81) obj).d = null;
                break;
            case 2:
                super.onAnimationEnd(animator);
                ((u91) obj).setScrollEnabled(true);
                break;
            case 3:
                ya1 ya1Var = (ya1) obj;
                if (animator.equals(ya1Var.d.L)) {
                    ya1Var.d.L = null;
                    break;
                }
                break;
            case 4:
                lb1 lb1Var = (lb1) obj;
                lb1Var.d = null;
                lb1Var.a = null;
                lb1Var.b = false;
                lb1Var.f.c.setAllowDrawCursor(true);
                break;
            case 5:
                ((org.telegram.ui.Wallet.g4) obj).L = null;
                break;
            case 6:
                ((org.telegram.ui.Wallet.n4) obj).f();
                break;
            case 7:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) obj;
                if (o6Var.N0 == animator) {
                    o6Var.N0 = null;
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Wallet.m6 m6Var = (org.telegram.ui.Wallet.m6) obj;
                m6Var.n = false;
                m6Var.r = null;
                m6Var.c.setLayerType(0, null);
                break;
            case 9:
                org.telegram.ui.Wallet.t6 t6Var = (org.telegram.ui.Wallet.t6) obj;
                t6Var.O = 0.0f;
                t6Var.P = 0.0f;
                t6Var.c0 = null;
                break;
            case 10:
                org.telegram.ui.Wallet.n7 n7Var = (org.telegram.ui.Wallet.n7) obj;
                n7Var.J = null;
                n7Var.j0 = 1.0f;
                n7Var.i0 = 0.0f;
                n7Var.h0 = 0.0f;
                n7Var.e();
                break;
            case 11:
                org.telegram.ui.Wallet.k9 k9Var = (org.telegram.ui.Wallet.k9) obj;
                EditTextBoldCursor editTextBoldCursor = k9Var.b;
                if (k9Var.s == animator) {
                    k9Var.s = null;
                    k9Var.a.setVisibility(k9Var.E ? 4 : 0);
                    editTextBoldCursor.setVisibility(k9Var.E ? 0 : 4);
                    if (k9Var.E && !k9Var.F) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.I3(editTextBoldCursor);
                        break;
                    }
                }
                break;
            case 12:
                org.telegram.ui.Wallet.da daVar = (org.telegram.ui.Wallet.da) obj;
                daVar.n = null;
                daVar.d.setVisibility(daVar.x ? 4 : 0);
                daVar.f.setVisibility(daVar.y ? 0 : 4);
                break;
            case 13:
                n1 n1Var = (n1) obj;
                ((ad1) n1Var.b).getClass();
                ((ad1) n1Var.b).c.setVisibility(4);
                break;
            case 14:
                ((org.telegram.ui.web.v0) obj).s.setVisibility(8);
                break;
            case 15:
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj;
                ziVar.j = false;
                ziVar.i = false;
                break;
            case 16:
                sg.v vVar = (sg.v) obj;
                vVar.a.getPainting().c(null, vVar.a.getCurrentColor(), true, null);
                vVar.r = null;
                break;
            case 17:
                super.onAnimationEnd(animator);
                tg.k0 k0Var = (tg.k0) obj;
                ImageView imageView = k0Var.c;
                k0Var.c = k0Var.d;
                k0Var.d = imageView;
                imageView.bringToFront();
                k0Var.d.setVisibility(8);
                k0Var.h = null;
                break;
            case 18:
                tg.m1 m1Var = (tg.m1) obj;
                if (animator == m1Var.r) {
                    m1Var.f = m1Var.h;
                    m1Var.h = -1;
                    m1Var.r = null;
                    break;
                }
                break;
            case 19:
                ug.r0 r0Var = (ug.r0) obj;
                r0Var.s = r0Var.r ? 1.0f : 0.0f;
                r0Var.e();
                break;
            case 20:
                ug.x1 x1Var = (ug.x1) ((hi.l0) obj).b;
                x1Var.G = true;
                x1Var.invalidate();
                break;
            case 21:
                vg.e eVar = (vg.e) ((org.telegram.ui.Cells.y9) obj).b;
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
