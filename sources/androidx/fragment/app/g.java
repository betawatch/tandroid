package androidx.fragment.app;

import ai.r2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import hi.ta;
import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.fu0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.as0;
import org.telegram.ui.bn;
import org.telegram.ui.e20;
import org.telegram.ui.ee0;
import org.telegram.ui.f40;
import org.telegram.ui.i81;
import org.telegram.ui.rn;
import org.telegram.ui.rz0;
import org.telegram.ui.t3;
import org.telegram.ui.tz0;
import tg.k2;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        rz0 rz0Var;
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
                ((ta) this.d).m0();
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
                wk0 wk0Var = (wk0) this.d;
                float f10 = this.b ? 1.0f : 0.0f;
                wk0Var.r = f10;
                wk0Var.E.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                wk0Var.E.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, wk0Var.r));
                wk0Var.E.setAlpha(wk0Var.r);
                wk0Var.s.invalidate();
                wk0Var.w.invalidate();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    org.telegram.messenger.g0.g3(runnable2);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.Components.voip.y yVar = (org.telegram.ui.Components.voip.y) this.d;
                org.telegram.ui.Components.voip.y yVar2 = (org.telegram.ui.Components.voip.y) this.c;
                yVar2.setScaleX(1.0f);
                yVar2.setScaleY(1.0f);
                yVar2.setAlpha(1.0f);
                if (this.b) {
                    yVar.y.removeView(yVar2);
                    yVar.e();
                }
                yVar2.setVisibility(8);
                return;
            case 10:
                f40 f40Var = (f40) this.d;
                e20 e20Var = f40Var.B4;
                org.telegram.ui.Components.voip.y yVar3 = (org.telegram.ui.Components.voip.y) this.c;
                if (yVar3 != null) {
                    yVar3.f = false;
                }
                ks.f(f40Var.o1.a).j(f40Var.c5);
                f40Var.b5 = false;
                boolean z10 = this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                f40Var.c4 = f11;
                f40Var.Z3.n = f11;
                if (z10) {
                    e20Var.setAlpha(1.0f);
                    e20Var.setScaleX(1.0f);
                    e20Var.setScaleY(1.0f);
                    e20Var.setTranslationX(0.0f);
                    e20Var.setTranslationY(0.0f);
                } else {
                    f40Var.V4.setAlpha(0);
                    f40Var.e1();
                    if (f40Var.d4.getParent() != null) {
                        f40Var.b.removeView(f40Var.d4);
                    }
                    f40Var.d4 = null;
                    e20Var.setVisibility(8);
                    f40Var.e4 = false;
                    f40Var.T1.X = true;
                    f40Var.a4.setVisibility(8);
                    if (f40Var.n2) {
                        f40Var.n2 = false;
                        f40Var.R0(true);
                    }
                    org.telegram.ui.Components.voip.y yVar4 = f40Var.Y4;
                    if (yVar4 != null) {
                        yVar4.a.setRoundCorners(0.0f);
                    }
                }
                f40Var.V0();
                f40Var.b.invalidate();
                f40Var.m1.invalidate();
                f40Var.L1.invalidate();
                return;
            case 11:
                fu0 fu0Var = (fu0) this.c;
                ee0 ee0Var = (ee0) this.d;
                if (ee0Var.K == 0 && this.b) {
                    ee0Var.N1(true, true);
                }
                fu0Var.setVisibility(8);
                fu0Var.g();
                fu0Var.setX(0.0f);
                return;
            case 12:
                as0 as0Var = (as0) this.d;
                as0Var.E = this.b ? 1.0f : 0.0f;
                as0Var.c.invalidate();
                as0Var.d.invalidate();
                as0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 13:
                tz0 tz0Var = (tz0) this.d;
                tz0Var.s = this.b ? 1.0f : 0.0f;
                tz0Var.b.invalidate();
                tz0Var.c.invalidate();
                tz0Var.e();
                TextView textView = tz0Var.E;
                if (textView != null) {
                    textView.setAlpha(tz0Var.s);
                }
                if (tz0Var.T) {
                    tz0Var.O.invalidate();
                }
                if (!tz0Var.T && (rz0Var = tz0Var.O) != null && rz0Var.getSeekBarWaveform() != null) {
                    bn0 seekBarWaveform = tz0Var.O.getSeekBarWaveform();
                    seekBarWaveform.L = tz0Var.s;
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
                i81 i81Var = (i81) this.d;
                i81Var.y = this.b ? 1.0f : 0.0f;
                i81Var.b.invalidate();
                i81Var.c.invalidate();
                i81Var.e();
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                k2 k2Var = (k2) this.d;
                r2 r2Var = k2Var.c;
                float f12 = this.b ? 1.0f : 0.0f;
                k2Var.E = f12;
                r2Var.setAlpha(f12);
                r2Var.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, k2Var.E));
                r2Var.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, k2Var.E));
                k2Var.b.invalidate();
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
