package androidx.fragment.app;

import ai.l2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import hi.nb;
import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.bn;
import org.telegram.ui.d20;
import org.telegram.ui.de0;
import org.telegram.ui.e40;
import org.telegram.ui.g81;
import org.telegram.ui.qz0;
import org.telegram.ui.rn;
import org.telegram.ui.sz0;
import org.telegram.ui.t3;
import org.telegram.ui.zr0;
import tg.o2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
        qz0 qz0Var;
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
                ci.b0 b0Var2 = (ci.b0) this.d;
                if (b0Var2.U == anim) {
                    b0Var2.U = null;
                }
                if (this.b) {
                    return;
                }
                ((Runnable) this.c).run();
                return;
            case 3:
                ci.j0 j0Var = (ci.j0) this.d;
                j0Var.l0();
                j0Var.d.setReveal(this.b ? 1.0f : 0.0f);
                ((Runnable) this.c).run();
                return;
            case 4:
                ((nb) this.d).m0();
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
                bn bnVar = (bn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = bnVar.R8;
                if (bitmap != null) {
                    bnVar.S8 = null;
                    bnVar.T8 = null;
                    bitmap.recycle();
                    bnVar.R8 = null;
                }
                r1 r1Var = (r1) this.c;
                if (r1Var != null) {
                    r1Var.invalidate();
                }
                bnVar.Ub(null);
                bnVar.c9 = null;
                bnVar.m1.invalidate();
                bnVar.A0.invalidate();
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.c;
                ((rn) this.d).O.setVisibility(this.b ? 0 : 8);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).setTranslationY(0.0f);
                }
                return;
            case 8:
                yk0 yk0Var = (yk0) this.d;
                float f10 = this.b ? 1.0f : 0.0f;
                yk0Var.r = f10;
                yk0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                yk0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, yk0Var.r));
                yk0Var.E.setAlpha(yk0Var.r);
                yk0Var.s.invalidate();
                yk0Var.w.invalidate();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    org.telegram.messenger.g0.g3(runnable2);
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
                e40 e40Var = (e40) this.d;
                d20 d20Var = e40Var.B4;
                org.telegram.ui.Components.voip.z zVar3 = (org.telegram.ui.Components.voip.z) this.c;
                if (zVar3 != null) {
                    zVar3.f = false;
                }
                ks.f(e40Var.o1.a).j(e40Var.c5);
                e40Var.b5 = false;
                boolean z10 = this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                e40Var.c4 = f11;
                e40Var.Z3.n = f11;
                if (z10) {
                    d20Var.setAlpha(1.0f);
                    d20Var.setScaleX(1.0f);
                    d20Var.setScaleY(1.0f);
                    d20Var.setTranslationX(0.0f);
                    d20Var.setTranslationY(0.0f);
                } else {
                    e40Var.V4.setAlpha(0);
                    e40Var.e1();
                    if (e40Var.d4.getParent() != null) {
                        e40Var.b.removeView(e40Var.d4);
                    }
                    e40Var.d4 = null;
                    d20Var.setVisibility(8);
                    e40Var.e4 = false;
                    e40Var.T1.X = true;
                    e40Var.a4.setVisibility(8);
                    if (e40Var.n2) {
                        e40Var.n2 = false;
                        e40Var.R0(true);
                    }
                    org.telegram.ui.Components.voip.z zVar4 = e40Var.Y4;
                    if (zVar4 != null) {
                        zVar4.a.setRoundCorners(0.0f);
                    }
                }
                e40Var.V0();
                e40Var.b.invalidate();
                e40Var.m1.invalidate();
                e40Var.L1.invalidate();
                return;
            case 11:
                hu0 hu0Var = (hu0) this.c;
                de0 de0Var = (de0) this.d;
                if (de0Var.K == 0 && this.b) {
                    de0Var.N1(true, true);
                }
                hu0Var.setVisibility(8);
                hu0Var.g();
                hu0Var.setX(0.0f);
                return;
            case 12:
                zr0 zr0Var = (zr0) this.d;
                zr0Var.E = this.b ? 1.0f : 0.0f;
                zr0Var.c.invalidate();
                zr0Var.d.invalidate();
                zr0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 13:
                sz0 sz0Var = (sz0) this.d;
                sz0Var.s = this.b ? 1.0f : 0.0f;
                sz0Var.b.invalidate();
                sz0Var.c.invalidate();
                sz0Var.e();
                TextView textView = sz0Var.E;
                if (textView != null) {
                    textView.setAlpha(sz0Var.s);
                }
                if (sz0Var.T) {
                    sz0Var.O.invalidate();
                }
                if (!sz0Var.T && (qz0Var = sz0Var.O) != null && qz0Var.getSeekBarWaveform() != null) {
                    dn0 seekBarWaveform = sz0Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = sz0Var.s;
                    r1 r1Var2 = seekBarWaveform.n;
                    if (r1Var2 != null) {
                        r1Var2.invalidate();
                    }
                }
                Runnable runnable4 = (Runnable) this.c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 14:
                g81 g81Var = (g81) this.d;
                g81Var.y = this.b ? 1.0f : 0.0f;
                g81Var.b.invalidate();
                g81Var.c.invalidate();
                g81Var.e();
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                o2 o2Var = (o2) this.d;
                l2 l2Var = o2Var.c;
                float f12 = this.b ? 1.0f : 0.0f;
                o2Var.E = f12;
                l2Var.setAlpha(f12);
                l2Var.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, o2Var.E));
                l2Var.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, o2Var.E));
                o2Var.b.invalidate();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    org.telegram.messenger.g0.g3(runnable6);
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

    public g(ci.b0 b0Var, Runnable runnable) {
        this.a = 2;
        this.d = b0Var;
        this.c = runnable;
    }

    public g(ViewGroup viewGroup, boolean z10, u0 u0Var, h hVar) {
        this.a = 0;
        this.c = viewGroup;
        this.b = z10;
        this.d = hVar;
    }
}
