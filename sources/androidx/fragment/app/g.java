package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import gi.va;
import java.util.ArrayList;
import org.telegram.messenger.hs;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.gz0;
import org.telegram.ui.iz0;
import org.telegram.ui.ln;
import org.telegram.ui.pr0;
import org.telegram.ui.u3;
import org.telegram.ui.w71;
import org.telegram.ui.wm;
import org.telegram.ui.x10;
import org.telegram.ui.x30;
import org.telegram.ui.xd0;
import ug.j2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, boolean z10, int i3) {
        this.a = i3;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        gz0 gz0Var;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 1:
                bi.a0 a0Var = (bi.a0) this.d;
                if (a0Var.U == anim) {
                    a0Var.U = null;
                }
                if (this.b) {
                    return;
                }
                ((Runnable) this.c).run();
                return;
            case 2:
                bi.j0 j0Var = (bi.j0) this.d;
                j0Var.l0();
                j0Var.d.setReveal(this.b ? 1.0f : 0.0f);
                ((Runnable) this.c).run();
                return;
            case 3:
                super.onAnimationEnd(anim);
                dh.a0 a0Var2 = (dh.a0) this.d;
                a0Var2.E.remove((ValueAnimator) this.c);
                dh.a0.a(a0Var2, this.b);
                return;
            case 4:
                ((va) this.d).m0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
            case 5:
                u3 u3Var = (u3) this.d;
                u3Var.y = this.b ? 1.0f : 0.0f;
                if (!u3Var.n) {
                    u3Var.A();
                }
                u3Var.u();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                }
                u3Var.r();
                return;
            case 6:
                wm wmVar = (wm) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = wmVar.Q8;
                if (bitmap != null) {
                    wmVar.R8 = null;
                    wmVar.S8 = null;
                    bitmap.recycle();
                    wmVar.Q8 = null;
                }
                q1 q1Var = (q1) this.c;
                if (q1Var != null) {
                    q1Var.invalidate();
                }
                wmVar.Qb(null);
                wmVar.b9 = null;
                wmVar.m1.invalidate();
                wmVar.A0.invalidate();
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.c;
                ((ln) this.d).O.setVisibility(this.b ? 0 : 8);
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((View) arrayList.get(i3)).setTranslationY(0.0f);
                }
                return;
            case 8:
                nk0 nk0Var = (nk0) this.d;
                float f10 = this.b ? 1.0f : 0.0f;
                nk0Var.r = f10;
                nk0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                nk0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, nk0Var.r));
                nk0Var.E.setAlpha(nk0Var.r);
                nk0Var.s.invalidate();
                nk0Var.w.invalidate();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    org.telegram.messenger.g0.h3(runnable2);
                    return;
                }
                return;
            case 9:
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
            case 10:
                x30 x30Var = (x30) this.d;
                x10 x10Var = x30Var.u4;
                org.telegram.ui.Components.voip.r rVar3 = (org.telegram.ui.Components.voip.r) this.c;
                if (rVar3 != null) {
                    rVar3.f = false;
                }
                hs.f(x30Var.l1.a).j(x30Var.V4);
                x30Var.U4 = false;
                boolean z10 = this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                x30Var.V3 = f11;
                x30Var.S3.n = f11;
                if (z10) {
                    x10Var.setAlpha(1.0f);
                    x10Var.setScaleX(1.0f);
                    x10Var.setScaleY(1.0f);
                    x10Var.setTranslationX(0.0f);
                    x10Var.setTranslationY(0.0f);
                } else {
                    x30Var.O4.setAlpha(0);
                    x30Var.d1();
                    if (x30Var.W3.getParent() != null) {
                        x30Var.b.removeView(x30Var.W3);
                    }
                    x30Var.W3 = null;
                    x10Var.setVisibility(8);
                    x30Var.X3 = false;
                    x30Var.Q1.X = true;
                    x30Var.T3.setVisibility(8);
                    if (x30Var.k2) {
                        x30Var.k2 = false;
                        x30Var.Q0(true);
                    }
                    org.telegram.ui.Components.voip.r rVar4 = x30Var.R4;
                    if (rVar4 != null) {
                        rVar4.a.setRoundCorners(0.0f);
                    }
                }
                x30Var.U0();
                x30Var.b.invalidate();
                x30Var.j1.invalidate();
                x30Var.I1.invalidate();
                return;
            case 11:
                vt0 vt0Var = (vt0) this.c;
                xd0 xd0Var = (xd0) this.d;
                if (xd0Var.K == 0 && this.b) {
                    xd0Var.E1(true, true);
                }
                vt0Var.setVisibility(8);
                vt0Var.g();
                vt0Var.setX(0.0f);
                return;
            case 12:
                pr0 pr0Var = (pr0) this.d;
                pr0Var.E = this.b ? 1.0f : 0.0f;
                pr0Var.c.invalidate();
                pr0Var.d.invalidate();
                pr0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 13:
                iz0 iz0Var = (iz0) this.d;
                iz0Var.s = this.b ? 1.0f : 0.0f;
                iz0Var.b.invalidate();
                iz0Var.c.invalidate();
                iz0Var.e();
                TextView textView = iz0Var.E;
                if (textView != null) {
                    textView.setAlpha(iz0Var.s);
                }
                if (iz0Var.T) {
                    iz0Var.O.invalidate();
                }
                if (!iz0Var.T && (gz0Var = iz0Var.O) != null && gz0Var.getSeekBarWaveform() != null) {
                    sm0 seekBarWaveform = iz0Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = iz0Var.s;
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
                w71 w71Var = (w71) this.d;
                w71Var.y = this.b ? 1.0f : 0.0f;
                w71Var.b.invalidate();
                w71Var.c.invalidate();
                w71Var.e();
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                j2 j2Var = (j2) this.d;
                ci.q qVar = j2Var.c;
                float f12 = this.b ? 1.0f : 0.0f;
                j2Var.E = f12;
                qVar.setAlpha(f12);
                qVar.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, j2Var.E));
                qVar.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, j2Var.E));
                j2Var.b.invalidate();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    org.telegram.messenger.g0.h3(runnable6);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g(Object obj, boolean z10, Object obj2, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }

    public g(bi.a0 a0Var, Runnable runnable) {
        this.a = 1;
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
