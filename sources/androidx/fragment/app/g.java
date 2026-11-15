package androidx.fragment.app;

import ai.q2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import hi.sa;
import java.util.ArrayList;
import org.telegram.messenger.ns;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.tm0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.an;
import org.telegram.ui.b20;
import org.telegram.ui.c40;
import org.telegram.ui.ce0;
import org.telegram.ui.e81;
import org.telegram.ui.nz0;
import org.telegram.ui.pz0;
import org.telegram.ui.qn;
import org.telegram.ui.t3;
import org.telegram.ui.xr0;
import tg.m2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, boolean z10, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        nz0 nz0Var;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 1:
                super.onAnimationEnd(anim);
                ch.b0 b0Var = (ch.b0) this.d;
                b0Var.E.remove((ValueAnimator) this.c);
                ch.b0.a(b0Var, this.b);
                return;
            case 2:
                ci.a0 a0Var = (ci.a0) this.d;
                if (a0Var.U == anim) {
                    a0Var.U = null;
                }
                if (this.b) {
                    return;
                }
                ((Runnable) this.c).run();
                return;
            case 3:
                ci.i0 i0Var = (ci.i0) this.d;
                i0Var.l0();
                i0Var.d.setReveal(this.b ? 1.0f : 0.0f);
                ((Runnable) this.c).run();
                return;
            case 4:
                ((sa) this.d).m0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
            case 5:
                t3 t3Var = (t3) this.d;
                t3Var.y = this.b ? 1.0f : 0.0f;
                if (!t3Var.n) {
                    t3Var.A();
                }
                t3Var.u();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                }
                t3Var.r();
                return;
            case 6:
                an anVar = (an) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = anVar.Q8;
                if (bitmap != null) {
                    anVar.R8 = null;
                    anVar.S8 = null;
                    bitmap.recycle();
                    anVar.Q8 = null;
                }
                q1 q1Var = (q1) this.c;
                if (q1Var != null) {
                    q1Var.invalidate();
                }
                anVar.Ub(null);
                anVar.b9 = null;
                anVar.m1.invalidate();
                anVar.A0.invalidate();
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.c;
                ((qn) this.d).O.setVisibility(this.b ? 0 : 8);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).setTranslationY(0.0f);
                }
                return;
            case 8:
                ok0 ok0Var = (ok0) this.d;
                float f10 = this.b ? 1.0f : 0.0f;
                ok0Var.r = f10;
                ok0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                ok0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, ok0Var.r));
                ok0Var.E.setAlpha(ok0Var.r);
                ok0Var.s.invalidate();
                ok0Var.w.invalidate();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    org.telegram.messenger.g0.h3(runnable2);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.z zVar = (org.telegram.ui.Components.voip.z) this.d;
                org.telegram.ui.Components.voip.z zVar2 = (org.telegram.ui.Components.voip.z) this.c;
                zVar2.setScaleX(1.0f);
                zVar2.setScaleY(1.0f);
                zVar2.setAlpha(1.0f);
                if (this.b) {
                    zVar.y.removeView(zVar2);
                    zVar.e();
                }
                zVar2.setVisibility(8);
                return;
            case 10:
                c40 c40Var = (c40) this.d;
                b20 b20Var = c40Var.B4;
                org.telegram.ui.Components.voip.z zVar3 = (org.telegram.ui.Components.voip.z) this.c;
                if (zVar3 != null) {
                    zVar3.f = false;
                }
                ns.f(c40Var.o1.a).j(c40Var.c5);
                c40Var.b5 = false;
                boolean z10 = this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                c40Var.c4 = f11;
                c40Var.Z3.n = f11;
                if (z10) {
                    b20Var.setAlpha(1.0f);
                    b20Var.setScaleX(1.0f);
                    b20Var.setScaleY(1.0f);
                    b20Var.setTranslationX(0.0f);
                    b20Var.setTranslationY(0.0f);
                } else {
                    c40Var.V4.setAlpha(0);
                    c40Var.d1();
                    if (c40Var.d4.getParent() != null) {
                        c40Var.b.removeView(c40Var.d4);
                    }
                    c40Var.d4 = null;
                    b20Var.setVisibility(8);
                    c40Var.e4 = false;
                    c40Var.T1.X = true;
                    c40Var.a4.setVisibility(8);
                    if (c40Var.n2) {
                        c40Var.n2 = false;
                        c40Var.Q0(true);
                    }
                    org.telegram.ui.Components.voip.z zVar4 = c40Var.Y4;
                    if (zVar4 != null) {
                        zVar4.a.setRoundCorners(0.0f);
                    }
                }
                c40Var.U0();
                c40Var.b.invalidate();
                c40Var.m1.invalidate();
                c40Var.L1.invalidate();
                return;
            case 11:
                xt0 xt0Var = (xt0) this.c;
                ce0 ce0Var = (ce0) this.d;
                if (ce0Var.K == 0 && this.b) {
                    ce0Var.N1(true, true);
                }
                xt0Var.setVisibility(8);
                xt0Var.g();
                xt0Var.setX(0.0f);
                return;
            case 12:
                xr0 xr0Var = (xr0) this.d;
                xr0Var.E = this.b ? 1.0f : 0.0f;
                xr0Var.c.invalidate();
                xr0Var.d.invalidate();
                xr0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 13:
                pz0 pz0Var = (pz0) this.d;
                pz0Var.s = this.b ? 1.0f : 0.0f;
                pz0Var.b.invalidate();
                pz0Var.c.invalidate();
                pz0Var.e();
                TextView textView = pz0Var.E;
                if (textView != null) {
                    textView.setAlpha(pz0Var.s);
                }
                if (pz0Var.T) {
                    pz0Var.O.invalidate();
                }
                if (!pz0Var.T && (nz0Var = pz0Var.O) != null && nz0Var.getSeekBarWaveform() != null) {
                    tm0 seekBarWaveform = pz0Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = pz0Var.s;
                    q1 q1Var2 = seekBarWaveform.n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                    }
                }
                Runnable runnable4 = (Runnable) this.c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 14:
                e81 e81Var = (e81) this.d;
                e81Var.y = this.b ? 1.0f : 0.0f;
                e81Var.b.invalidate();
                e81Var.c.invalidate();
                e81Var.e();
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                m2 m2Var = (m2) this.d;
                q2 q2Var = m2Var.c;
                float f12 = this.b ? 1.0f : 0.0f;
                m2Var.E = f12;
                q2Var.setAlpha(f12);
                q2Var.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, m2Var.E));
                q2Var.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, m2Var.E));
                m2Var.b.invalidate();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    org.telegram.messenger.g0.h3(runnable6);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g(Object obj, boolean z10, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }

    public g(ci.a0 a0Var, Runnable runnable) {
        this.a = 2;
        this.d = a0Var;
        this.c = runnable;
    }

    public g(ViewGroup viewGroup, boolean z10, u0 u0Var, h hVar) {
        this.a = 0;
        this.c = viewGroup;
        this.b = z10;
        this.d = hVar;
    }
}
