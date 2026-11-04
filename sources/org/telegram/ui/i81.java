package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import java.util.Iterator;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i81 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i81(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                super.onAnimationEnd(animator);
                ((j81) obj).d = null;
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((k91) obj).setScrollEnabled(true);
                break;
            case 2:
                qa1 qa1Var = (qa1) obj;
                if (animator.equals(qa1Var.d.L)) {
                    qa1Var.d.L = null;
                    break;
                }
                break;
            case 3:
                db1 db1Var = (db1) obj;
                db1Var.d = null;
                db1Var.a = null;
                db1Var.b = false;
                db1Var.f.c.setAllowDrawCursor(true);
                break;
            case 4:
                ((org.telegram.ui.Wallet.u3) obj).L = null;
                break;
            case 5:
                ((org.telegram.ui.Wallet.b4) obj).f();
                break;
            case 6:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) obj;
                if (w5Var.K0 == animator) {
                    w5Var.K0 = null;
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Wallet.u5 u5Var = (org.telegram.ui.Wallet.u5) obj;
                u5Var.h = false;
                u5Var.n = null;
                u5Var.b.setLayerType(0, null);
                break;
            case 8:
                org.telegram.ui.Wallet.a6 a6Var = (org.telegram.ui.Wallet.a6) obj;
                a6Var.O = 0.0f;
                a6Var.P = 0.0f;
                a6Var.c0 = null;
                break;
            case 9:
                org.telegram.ui.Wallet.u6 u6Var = (org.telegram.ui.Wallet.u6) obj;
                u6Var.J = null;
                u6Var.j0 = 1.0f;
                u6Var.i0 = 0.0f;
                u6Var.h0 = 0.0f;
                u6Var.e();
                break;
            case 10:
                org.telegram.ui.Wallet.s8 s8Var = (org.telegram.ui.Wallet.s8) obj;
                EditTextBoldCursor editTextBoldCursor = s8Var.b;
                if (s8Var.s == animator) {
                    s8Var.s = null;
                    s8Var.a.setVisibility(s8Var.y ? 4 : 0);
                    editTextBoldCursor.setVisibility(s8Var.y ? 0 : 4);
                    if (s8Var.y && !s8Var.E) {
                        editTextBoldCursor.requestFocus();
                        org.telegram.messenger.g0.K3(editTextBoldCursor);
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Wallet.l9 l9Var = (org.telegram.ui.Wallet.l9) obj;
                l9Var.n = null;
                l9Var.d.setVisibility(l9Var.x ? 4 : 0);
                l9Var.f.setVisibility(l9Var.y ? 0 : 4);
                break;
            case 12:
                o1 o1Var = (o1) obj;
                ((uc1) o1Var.b).getClass();
                ((uc1) o1Var.b).c.setVisibility(4);
                break;
            case 13:
                ((org.telegram.ui.web.w0) obj).s.setVisibility(8);
                break;
            case 14:
                ((CropAreaView) obj).d0 = null;
                break;
            case 15:
                tg.w wVar = (tg.w) obj;
                wVar.a.getPainting().c(null, wVar.a.getCurrentColor(), true, null);
                wVar.r = null;
                break;
            case 16:
                super.onAnimationEnd(animator);
                ug.e0 e0Var = (ug.e0) obj;
                ImageView imageView = e0Var.c;
                e0Var.c = e0Var.d;
                e0Var.d = imageView;
                imageView.bringToFront();
                e0Var.d.setVisibility(8);
                e0Var.h = null;
                break;
            case 17:
                ug.g1 g1Var = (ug.g1) obj;
                if (animator == g1Var.r) {
                    g1Var.f = g1Var.h;
                    g1Var.h = -1;
                    g1Var.r = null;
                    break;
                }
                break;
            case 18:
                vg.o0 o0Var = (vg.o0) obj;
                o0Var.s = o0Var.r ? 1.0f : 0.0f;
                o0Var.e();
                break;
            case 19:
                vg.w1 w1Var = (vg.w1) ((gi.c0) obj).b;
                w1Var.G = true;
                w1Var.invalidate();
                break;
            case 20:
                wg.e eVar = (wg.e) ((org.telegram.ui.Cells.x9) obj).b;
                int i10 = wg.e.L;
                eVar.d();
                break;
            case 21:
                wg.e eVar2 = (wg.e) obj;
                eVar2.d = null;
                eVar2.e();
                break;
            case 22:
                super.onAnimationEnd(animator);
                wg.m mVar = ((wg.h) obj).b;
                mVar.b.d = 0.0f;
                mVar.e0 = null;
                mVar.j(mVar.M);
                break;
            case 23:
                xg.b bVar = (xg.b) obj;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            default:
                yh.f fVar = (yh.f) obj;
                Iterator it = fVar.h.iterator();
                while (it.hasNext()) {
                    yh.b bVar2 = (yh.b) it.next();
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
