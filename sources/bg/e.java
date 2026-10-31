package bg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import ig.a0;
import java.util.HashMap;
import java.util.Iterator;
import jg.p0;
import jg.y1;
import kg.j2;
import kg.k2;
import kg.x0;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.dj;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.ru;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.h1;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.ActionBar.q3;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.Components.u61;
import org.telegram.ui.e8;
import org.telegram.ui.h4;
import org.telegram.ui.h8;
import org.telegram.ui.q4;
import org.telegram.ui.t5;
import org.telegram.ui.u3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 12:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.w = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                super.onAnimationEnd(animator);
                i iVar = (i) obj;
                if (!iVar.i1) {
                    iVar.u0 = false;
                    iVar.t0.setVisibility(8);
                    iVar.invalidate();
                }
                iVar.f0 = false;
                break;
            case 1:
                dj djVar = (dj) obj;
                djVar.j = false;
                djVar.i = false;
                break;
            case 2:
                ((dg.f) obj).h.setVisibility(8);
                break;
            case 3:
                ((CropAreaView) obj).c0 = null;
                break;
            case 4:
                a0 a0Var = (a0) obj;
                a0Var.a.getPainting().c(null, a0Var.a.getCurrentColor(), true, null);
                a0Var.r = null;
                break;
            case 5:
                super.onAnimationEnd(animator);
                p0 p0Var = (p0) obj;
                ImageView imageView = p0Var.c;
                p0Var.c = p0Var.d;
                p0Var.d = imageView;
                imageView.bringToFront();
                p0Var.d.setVisibility(8);
                p0Var.h = null;
                break;
            case 6:
                y1 y1Var = (y1) obj;
                if (animator == y1Var.r) {
                    y1Var.f = y1Var.h;
                    y1Var.h = -1;
                    y1Var.r = null;
                    break;
                }
                break;
            case 7:
                x0 x0Var = (x0) obj;
                x0Var.s = x0Var.r ? 1.0f : 0.0f;
                x0Var.e();
                break;
            case 8:
                k2 k2Var = (k2) ((j2) obj).b;
                k2Var.F = true;
                k2Var.invalidate();
                break;
            case 9:
                lg.g gVar = (lg.g) ((lg.f) obj).b;
                int i11 = lg.g.K;
                gVar.d();
                break;
            case 10:
                lg.g gVar2 = (lg.g) obj;
                gVar2.d = null;
                gVar2.e();
                break;
            case 11:
                super.onAnimationEnd(animator);
                lg.q qVar = ((lg.l) obj).b;
                qVar.b.d = 0.0f;
                qVar.d0 = null;
                qVar.j(qVar.L);
                break;
            case 12:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.M = null;
                actionBarOverlayLayout.w = false;
                break;
            case 13:
                mg.b bVar = (mg.b) obj;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 14:
                nh.i iVar2 = (nh.i) obj;
                Iterator it = iVar2.h.iterator();
                while (it.hasNext()) {
                    nh.d dVar = (nh.d) it.next();
                    if (iVar2.c.size() < iVar2.d) {
                        iVar2.c.push(dVar);
                    }
                    it.remove();
                }
                Runnable runnable = iVar2.q;
                if (runnable != null) {
                    runnable.run();
                    iVar2.q = null;
                }
                iVar2.r = null;
                iVar2.invalidateSelf();
                break;
            case 15:
                HashMap hashMap = i0.l0;
                if (hashMap != null) {
                    hashMap.remove((Window) obj);
                    break;
                }
                break;
            case 16:
                u61 u61Var = ((MediaController) obj).i0;
                if (u61Var != null) {
                    u61Var.g0();
                    break;
                }
                break;
            case 17:
                try {
                    ((u61) obj).m0();
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 18:
                super.onAnimationEnd(animator);
                ((ru) obj).w = null;
                break;
            case 19:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                actionBarPopupWindow$ActionBarPopupWindowLayout.n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i12 = 0; i12 < itemsCount; i12++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i12);
                    if (!(childAt instanceof h1)) {
                        childAt.setTranslationY(0.0f);
                        childAt.setAlpha(childAt.isEnabled() ? 1.0f : 0.5f);
                    }
                }
                break;
            case 20:
                m1 m1Var = (m1) obj;
                if (!m1Var.e) {
                    m1Var.j();
                    break;
                }
                break;
            case 21:
                i3 i3Var = (i3) obj;
                if (i3Var.F == animator) {
                    i3Var.G = i3Var.H;
                    Iterator it2 = i3Var.I.iterator();
                    while (it2.hasNext()) {
                        ((Runnable) it2.next()).run();
                    }
                    break;
                }
                break;
            case 22:
                q3 q3Var = (q3) obj;
                i3 i3Var2 = q3Var.a;
                if (i3Var2 != null) {
                    i3Var2.b = true;
                    i3Var2.invalidate();
                }
                q3Var.V = q3Var.U ? 1.0f : 0.0f;
                q3Var.invalidate();
                if (!q3Var.U) {
                    q3Var.R.clear();
                    break;
                }
                break;
            case 23:
                super.onAnimationEnd(animator);
                Runnable runnable2 = (Runnable) obj;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            case 24:
                h4 h4Var = (h4) obj;
                Runnable runnable3 = h4Var.a0;
                if (runnable3 != null) {
                    runnable3.run();
                    h4Var.a0 = null;
                    break;
                }
                break;
            case 25:
                u3 u3Var = (u3) obj;
                u3Var.x = 1.0f;
                u3Var.A();
                u3Var.u();
                u3Var.r();
                u3Var.a.e();
                break;
            case 26:
                q4 q4Var = (q4) obj;
                q4Var.getClass();
                q4Var.setVisibility(8);
                break;
            case 27:
                ig.s sVar = (ig.s) obj;
                sVar.b = false;
                sVar.invalidate();
                break;
            case 28:
                ((t5) obj).h0.setVisibility(8);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 26:
                ((q4) this.b).setVisibility(0);
                break;
            case 29:
                h8 h8Var = (h8) this.b;
                for (int i10 = 0; i10 < h8Var.b.getChildCount(); i10++) {
                    e8.a((e8) h8Var.b.getChildAt(i10), h8Var.P, h8Var.Q);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
