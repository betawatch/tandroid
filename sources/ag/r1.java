package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import hh.ca;
import hh.da;
import hh.m5;
import hh.y3;
import hh.z3;
import java.util.Iterator;
import jh.a4;
import jh.i4;
import jh.s4;
import jh.v6;
import jh.w6;
import jh.z7;
import lh.c6;
import lh.d7;
import lh.h6;
import lh.k9;
import lh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 0:
                s1 s1Var = (s1) obj;
                s1Var.n = s1Var.h ? 1.0f : 0.0f;
                s1Var.e();
                break;
            case 1:
                p3 p3Var = (p3) ((o3) obj).b;
                p3Var.B = true;
                p3Var.invalidate();
                break;
            case 2:
                super.onAnimationEnd(animator);
                bg.i iVar = (bg.i) ((bg.e) obj).b;
                iVar.b.d = 0.0f;
                iVar.P = null;
                iVar.h(iVar.E);
                break;
            case 3:
                cg.b bVar = (cg.b) obj;
                bVar.b = 1.0f;
                bVar.invalidate();
                break;
            case 4:
                eh.k kVar = (eh.k) obj;
                Iterator it = kVar.h.iterator();
                while (it.hasNext()) {
                    eh.e eVar = (eh.e) it.next();
                    if (kVar.c.size() < kVar.d) {
                        kVar.c.push(eVar);
                    }
                    it.remove();
                }
                Runnable runnable = kVar.q;
                if (runnable != null) {
                    runnable.run();
                    kVar.q = null;
                }
                kVar.r = null;
                kVar.invalidateSelf();
                break;
            case 5:
                ((gh.u0) obj).b.w.setVisibility(8);
                break;
            case 6:
                z3 z3Var = (z3) obj;
                z3Var.A = 1.0f;
                z3Var.B = -1;
                y3 y3Var = z3Var.D;
                if (y3Var != null && (z10 = y3Var.l) && z10) {
                    y3Var.l = false;
                    y3Var.b();
                }
                z3Var.C = null;
                break;
            case 7:
                ca caVar = ((da) obj).c;
                caVar.setScaleX(1.0f);
                caVar.setScaleY(1.0f);
                break;
            case 8:
                ((m5) obj).run();
                break;
            case 9:
                ig.v vVar = (ig.v) obj;
                vVar.setVisibility(8);
                ig.u uVar = vVar.b;
                if (uVar != null) {
                    vVar.removeView(uVar);
                    vVar.b = null;
                }
                vVar.e = null;
                break;
            case 10:
                ((ig.j0) obj).x.c();
                break;
            case 11:
                jh.a aVar = (jh.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((jh.o) obj).K.p = false;
                break;
            case 13:
                jh.n0 n0Var = (jh.n0) obj;
                jh.s0 s0Var = n0Var.G;
                if (s0Var != null && n0Var.E == s0Var.a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n0Var.F = ofFloat;
                    ofFloat.addUpdateListener(new u(this, 18));
                    n0Var.F.setStartDelay(3000L);
                    n0Var.F.setDuration(550L);
                    n0Var.F.setInterpolator(new LinearInterpolator());
                    n0Var.F.start();
                    break;
                }
                break;
            case 14:
                ((jh.i1) obj).E = null;
                break;
            case 15:
                jh.o2 o2Var = (jh.o2) obj;
                o2Var.n5.invalidate();
                o2Var.setAnimatedTop(0);
                o2Var.n5.R2 = true;
                View view = o2Var.B1;
                if (view != null && view.getVisibility() == 0) {
                    o2Var.B1.setTranslationY(((1.0f - o2Var.getTopViewEnterProgress()) * o2Var.B1.getLayoutParams().height) + o2Var.O1);
                }
                o2Var.n5.a2 = null;
                break;
            case 16:
                a4 a4Var = (a4) obj;
                a4Var.c[1].setVisibility(8);
                a4Var.c[0].setAlpha(1.0f);
                a4Var.c[0].setTranslationY(0.0f);
                break;
            case 17:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                iz0 iz0Var = profileStoriesView.h;
                profileStoriesView.C = 1.0f;
                iz0Var.N = 1.0f;
                iz0Var.invalidate();
                profileStoriesView.invalidate();
                break;
            case 18:
                ((i4) obj).I = null;
                break;
            case 19:
                s4 s4Var = (s4) obj;
                s4Var.w = null;
                s4Var.r = 1.0f;
                s4Var.invalidate();
                break;
            case 20:
            default:
                super.onAnimationEnd(animator);
                break;
            case 21:
                z7 z7Var = (z7) obj;
                z7Var.D = false;
                z7Var.C = 0.0f;
                z7Var.invalidate();
                z7Var.requestLayout();
                z7Var.F.requestLayout();
                break;
            case 22:
                lh.m mVar = ((lh.g) obj).V;
                if (mVar.c0 == animator) {
                    mVar.c0 = null;
                    mVar.f.getEditText().setScrollY(mVar.U);
                    break;
                }
                break;
            case 23:
                lh.d0 d0Var = (lh.d0) obj;
                d0Var.l = 1.0f;
                lh.e0 e0Var = d0Var.p;
                if (e0Var.n.contains(d0Var)) {
                    d0Var.c.onDetachedFromWindow();
                    o3 o3Var = d0Var.d;
                    if (o3Var != null) {
                        o3Var.pause();
                        d0Var.d.release(null);
                        d0Var.d = null;
                    }
                    TextureView textureView = d0Var.e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        d0Var.e = null;
                    }
                    d0Var.f = false;
                    e0Var.n.remove(d0Var);
                }
                e0Var.invalidate();
                break;
            case 24:
                lh.p3 p3Var2 = ((lh.x2) obj).h;
                p3Var2.B.setVisibility(8);
                p3Var2.d.setVisibility(8);
                break;
            case 25:
                w3 w3Var = (w3) obj;
                w3Var.k0 = 1.0f;
                w3Var.invalidate();
                break;
            case 26:
                super.onAnimationEnd(animator);
                c6 c6Var = (c6) obj;
                ImageView imageView = c6Var.c;
                c6Var.c = c6Var.d;
                c6Var.d = imageView;
                imageView.bringToFront();
                c6Var.d.setVisibility(8);
                c6Var.h = null;
                break;
            case 27:
                super.onAnimationEnd(animator);
                ((h6) obj).w = null;
                break;
            case 28:
                d7 d7Var = (d7) obj;
                if (d7Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) d7Var.getParent()).removeView(d7Var);
                    break;
                }
                break;
            case 29:
                ((k9) obj).J = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 20:
                super.onAnimationStart(animator);
                w6 w6Var = (w6) this.b;
                oi0 oi0Var = ((v6) w6Var.a.get(w6Var.d)).c;
                oi0Var.I = 2;
                oi0Var.start();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
