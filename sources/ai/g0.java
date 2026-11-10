package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.va;
import java.util.ArrayList;
import org.telegram.messenger.qs;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.xt0;
import org.telegram.ui.cn;
import org.telegram.ui.cs0;
import org.telegram.ui.f20;
import org.telegram.ui.f40;
import org.telegram.ui.fe0;
import org.telegram.ui.i81;
import org.telegram.ui.rn;
import org.telegram.ui.t3;
import org.telegram.ui.tz0;
import org.telegram.ui.vz0;
import tg.i2;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g0(Object obj, Object obj2, boolean z9, int i7) {
        this.a = i7;
        this.d = obj;
        this.c = obj2;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        tz0 tz0Var;
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) this.d;
                if (i0Var.T == anim) {
                    i0Var.T = null;
                }
                if (this.b) {
                    return;
                }
                ((Runnable) this.c).run();
                return;
            case 1:
                s0 s0Var = (s0) this.d;
                s0Var.l0();
                s0Var.d.setReveal(this.b ? 1.0f : 0.0f);
                ((Runnable) this.c).run();
                return;
            case 2:
                kotlin.jvm.internal.j.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 3:
                super.onAnimationEnd(anim);
                ch.b0 b0Var = (ch.b0) this.d;
                b0Var.E.remove((ValueAnimator) this.c);
                ch.b0.a(b0Var, this.b);
                return;
            case 4:
                ((va) this.d).m0();
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
                cn cnVar = (cn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = cnVar.P8;
                if (bitmap != null) {
                    cnVar.Q8 = null;
                    cnVar.R8 = null;
                    bitmap.recycle();
                    cnVar.P8 = null;
                }
                q1 q1Var = (q1) this.c;
                if (q1Var != null) {
                    q1Var.invalidate();
                }
                cnVar.Tb(null);
                cnVar.a9 = null;
                cnVar.l1.invalidate();
                cnVar.z0.invalidate();
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.c;
                ((rn) this.d).N.setVisibility(this.b ? 0 : 8);
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    ((View) arrayList.get(i7)).setTranslationY(0.0f);
                }
                return;
            case 8:
                jk0 jk0Var = (jk0) this.d;
                float f10 = this.b ? 1.0f : 0.0f;
                jk0Var.r = f10;
                jk0Var.D.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                jk0Var.D.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, jk0Var.r));
                jk0Var.D.setAlpha(jk0Var.r);
                jk0Var.s.invalidate();
                jk0Var.w.invalidate();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    org.telegram.messenger.g0.h3(runnable2);
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
                f20 f20Var = f40Var.w4;
                org.telegram.ui.Components.voip.y yVar3 = (org.telegram.ui.Components.voip.y) this.c;
                if (yVar3 != null) {
                    yVar3.f = false;
                }
                qs.f(f40Var.n1.a).j(f40Var.X4);
                f40Var.W4 = false;
                boolean z9 = this.b;
                float f11 = z9 ? 1.0f : 0.0f;
                f40Var.X3 = f11;
                f40Var.U3.n = f11;
                if (z9) {
                    f20Var.setAlpha(1.0f);
                    f20Var.setScaleX(1.0f);
                    f20Var.setScaleY(1.0f);
                    f20Var.setTranslationX(0.0f);
                    f20Var.setTranslationY(0.0f);
                } else {
                    f40Var.Q4.setAlpha(0);
                    f40Var.d1();
                    if (f40Var.Y3.getParent() != null) {
                        f40Var.b.removeView(f40Var.Y3);
                    }
                    f40Var.Y3 = null;
                    f20Var.setVisibility(8);
                    f40Var.Z3 = false;
                    f40Var.S1.X = true;
                    f40Var.V3.setVisibility(8);
                    if (f40Var.m2) {
                        f40Var.m2 = false;
                        f40Var.Q0(true);
                    }
                    org.telegram.ui.Components.voip.y yVar4 = f40Var.T4;
                    if (yVar4 != null) {
                        yVar4.a.setRoundCorners(0.0f);
                    }
                }
                f40Var.U0();
                f40Var.b.invalidate();
                f40Var.l1.invalidate();
                f40Var.K1.invalidate();
                return;
            case 11:
                xt0 xt0Var = (xt0) this.c;
                fe0 fe0Var = (fe0) this.d;
                if (fe0Var.J == 0 && this.b) {
                    fe0Var.N1(true, true);
                }
                xt0Var.setVisibility(8);
                xt0Var.g();
                xt0Var.setX(0.0f);
                return;
            case 12:
                cs0 cs0Var = (cs0) this.d;
                cs0Var.D = this.b ? 1.0f : 0.0f;
                cs0Var.c.invalidate();
                cs0Var.d.invalidate();
                cs0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 13:
                vz0 vz0Var = (vz0) this.d;
                vz0Var.s = this.b ? 1.0f : 0.0f;
                vz0Var.b.invalidate();
                vz0Var.c.invalidate();
                vz0Var.e();
                TextView textView = vz0Var.D;
                if (textView != null) {
                    textView.setAlpha(vz0Var.s);
                }
                if (vz0Var.S) {
                    vz0Var.N.invalidate();
                }
                if (!vz0Var.S && (tz0Var = vz0Var.N) != null && tz0Var.getSeekBarWaveform() != null) {
                    pm0 seekBarWaveform = vz0Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = vz0Var.s;
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
                i2 i2Var = (i2) this.d;
                bi.t tVar = i2Var.c;
                float f12 = this.b ? 1.0f : 0.0f;
                i2Var.D = f12;
                tVar.setAlpha(f12);
                tVar.setScaleX(org.telegram.messenger.g0.T1(0.9f, 1.0f, i2Var.D));
                tVar.setScaleY(org.telegram.messenger.g0.T1(0.9f, 1.0f, i2Var.D));
                i2Var.b.invalidate();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    org.telegram.messenger.g0.h3(runnable6);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g0(Object obj, boolean z9, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = z9;
        this.c = obj2;
    }

    public g0(i0 i0Var, Runnable runnable) {
        this.a = 0;
        this.d = i0Var;
        this.c = runnable;
    }

    public g0(ViewGroup viewGroup, boolean z9, androidx.fragment.app.t0 t0Var, androidx.fragment.app.g gVar) {
        this.a = 2;
        this.c = viewGroup;
        this.b = z9;
        this.d = gVar;
    }
}
