package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import jg.d3;
import jg.z2;
import org.telegram.messenger.at;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.a30;
import org.telegram.ui.a50;
import org.telegram.ui.f11;
import org.telegram.ui.gf0;
import org.telegram.ui.h11;
import org.telegram.ui.jt0;
import org.telegram.ui.oo;
import org.telegram.ui.u3;
import org.telegram.ui.un;
import org.telegram.ui.v91;
import vh.o8;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 12:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        f11 f11Var;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 1:
                d3 d3Var = (d3) this.d;
                z2 z2Var = d3Var.c;
                float f7 = this.b ? 1.0f : 0.0f;
                d3Var.D = f7;
                z2Var.setAlpha(f7);
                z2Var.setScaleX(org.telegram.messenger.i0.T1(0.9f, 1.0f, d3Var.D));
                z2Var.setScaleY(org.telegram.messenger.i0.T1(0.9f, 1.0f, d3Var.D));
                d3Var.b.invalidate();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    org.telegram.messenger.i0.g3(runnable);
                    return;
                }
                return;
            case 2:
                u3 u3Var = (u3) this.d;
                u3Var.y = this.b ? 1.0f : 0.0f;
                if (!u3Var.n) {
                    u3Var.A();
                }
                u3Var.u();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    runnable2.run();
                }
                u3Var.r();
                return;
            case 3:
                un unVar = (un) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = unVar.P8;
                if (bitmap != null) {
                    unVar.Q8 = null;
                    unVar.R8 = null;
                    bitmap.recycle();
                    unVar.P8 = null;
                }
                q1 q1Var = (q1) this.c;
                if (q1Var != null) {
                    q1Var.invalidate();
                }
                unVar.Lb(null);
                unVar.a9 = null;
                unVar.l1.invalidate();
                unVar.z0.invalidate();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.c;
                ((oo) this.d).N.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 5:
                ol0 ol0Var = (ol0) this.d;
                float f10 = this.b ? 1.0f : 0.0f;
                ol0Var.r = f10;
                ol0Var.D.setScaleX(org.telegram.messenger.i0.T1(0.8f, 1.0f, f10));
                ol0Var.D.setScaleY(org.telegram.messenger.i0.T1(0.8f, 1.0f, ol0Var.r));
                ol0Var.D.setAlpha(ol0Var.r);
                ol0Var.s.invalidate();
                ol0Var.w.invalidate();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    org.telegram.messenger.i0.g3(runnable3);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) this.d;
                org.telegram.ui.Components.voip.r rVar2 = (org.telegram.ui.Components.voip.r) this.c;
                rVar2.setScaleX(1.0f);
                rVar2.setScaleY(1.0f);
                rVar2.setAlpha(1.0f);
                if (this.b) {
                    rVar.y.removeView(rVar2);
                    rVar.e();
                }
                rVar2.setVisibility(8);
                return;
            case 7:
                a50 a50Var = (a50) this.d;
                a30 a30Var = a50Var.t4;
                org.telegram.ui.Components.voip.r rVar3 = (org.telegram.ui.Components.voip.r) this.c;
                if (rVar3 != null) {
                    rVar3.f = false;
                }
                at.f(a50Var.k1.a).j(a50Var.U4);
                a50Var.T4 = false;
                boolean z10 = this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                a50Var.U3 = f11;
                a50Var.R3.n = f11;
                if (z10) {
                    a30Var.setAlpha(1.0f);
                    a30Var.setScaleX(1.0f);
                    a30Var.setScaleY(1.0f);
                    a30Var.setTranslationX(0.0f);
                    a30Var.setTranslationY(0.0f);
                } else {
                    a50Var.N4.setAlpha(0);
                    a50Var.d1();
                    if (a50Var.V3.getParent() != null) {
                        a50Var.b.removeView(a50Var.V3);
                    }
                    a50Var.V3 = null;
                    a30Var.setVisibility(8);
                    a50Var.W3 = false;
                    a50Var.P1.X = true;
                    a50Var.S3.setVisibility(8);
                    if (a50Var.j2) {
                        a50Var.j2 = false;
                        a50Var.Q0(true);
                    }
                    org.telegram.ui.Components.voip.r rVar4 = a50Var.Q4;
                    if (rVar4 != null) {
                        rVar4.a.setRoundCorners(0.0f);
                    }
                }
                a50Var.U0();
                a50Var.b.invalidate();
                a50Var.i1.invalidate();
                a50Var.H1.invalidate();
                return;
            case 8:
                av0 av0Var = (av0) this.c;
                gf0 gf0Var = (gf0) this.d;
                if (gf0Var.J == 0 && this.b) {
                    gf0Var.E1(true, true);
                }
                av0Var.setVisibility(8);
                av0Var.g();
                av0Var.setX(0.0f);
                return;
            case 9:
                jt0 jt0Var = (jt0) this.d;
                jt0Var.D = this.b ? 1.0f : 0.0f;
                jt0Var.c.invalidate();
                jt0Var.d.invalidate();
                jt0Var.e();
                Runnable runnable4 = (Runnable) this.c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 10:
                h11 h11Var = (h11) this.d;
                h11Var.s = this.b ? 1.0f : 0.0f;
                h11Var.b.invalidate();
                h11Var.c.invalidate();
                h11Var.e();
                TextView textView = h11Var.D;
                if (textView != null) {
                    textView.setAlpha(h11Var.s);
                }
                if (h11Var.S) {
                    h11Var.N.invalidate();
                }
                if (!h11Var.S && (f11Var = h11Var.N) != null && f11Var.getSeekBarWaveform() != null) {
                    rn0 seekBarWaveform = h11Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = h11Var.s;
                    q1 q1Var2 = seekBarWaveform.n;
                    if (q1Var2 != null) {
                        q1Var2.invalidate();
                    }
                }
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            case 11:
                v91 v91Var = (v91) this.d;
                v91Var.y = this.b ? 1.0f : 0.0f;
                v91Var.b.invalidate();
                v91Var.c.invalidate();
                v91Var.e();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    runnable6.run();
                    return;
                }
                return;
            case 12:
                qh.y yVar = (qh.y) this.d;
                if (yVar.T == anim) {
                    yVar.T = null;
                }
                if (this.b) {
                    return;
                }
                ((Runnable) this.c).run();
                return;
            case 13:
                qh.i0 i0Var = (qh.i0) this.d;
                i0Var.l0();
                i0Var.d.setReveal(this.b ? 1.0f : 0.0f);
                ((Runnable) this.c).run();
                return;
            case 14:
                super.onAnimationEnd(anim);
                sg.b0 b0Var = (sg.b0) this.d;
                b0Var.E.remove((ValueAnimator) this.c);
                sg.b0.a(b0Var, this.b);
                return;
            default:
                ((o8) this.d).m0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
        }
    }

    public /* synthetic */ g(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }

    public g(qh.y yVar, Runnable runnable) {
        this.a = 12;
        this.d = yVar;
        this.c = runnable;
    }

    public g(ViewGroup viewGroup, boolean z10, u0 u0Var, h hVar) {
        this.a = 0;
        this.c = viewGroup;
        this.b = z10;
        this.d = hVar;
    }
}
