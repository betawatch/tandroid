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
import org.telegram.ui.Components.wt0;
import org.telegram.ui.an;
import org.telegram.ui.c20;
import org.telegram.ui.c40;
import org.telegram.ui.ce0;
import org.telegram.ui.f81;
import org.telegram.ui.pn;
import org.telegram.ui.pz0;
import org.telegram.ui.rz0;
import org.telegram.ui.t3;
import org.telegram.ui.zr0;
import tg.i2;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        pz0 pz0Var;
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
                an anVar = (an) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = anVar.P8;
                if (bitmap != null) {
                    anVar.Q8 = null;
                    anVar.R8 = null;
                    bitmap.recycle();
                    anVar.P8 = null;
                }
                q1 q1Var = (q1) this.c;
                if (q1Var != null) {
                    q1Var.invalidate();
                }
                anVar.Qb(null);
                anVar.a9 = null;
                anVar.l1.invalidate();
                anVar.z0.invalidate();
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.c;
                ((pn) this.d).N.setVisibility(this.b ? 0 : 8);
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
                c40 c40Var = (c40) this.d;
                c20 c20Var = c40Var.t4;
                org.telegram.ui.Components.voip.y yVar3 = (org.telegram.ui.Components.voip.y) this.c;
                if (yVar3 != null) {
                    yVar3.f = false;
                }
                qs.f(c40Var.k1.a).j(c40Var.U4);
                c40Var.T4 = false;
                boolean z9 = this.b;
                float f11 = z9 ? 1.0f : 0.0f;
                c40Var.U3 = f11;
                c40Var.R3.n = f11;
                if (z9) {
                    c20Var.setAlpha(1.0f);
                    c20Var.setScaleX(1.0f);
                    c20Var.setScaleY(1.0f);
                    c20Var.setTranslationX(0.0f);
                    c20Var.setTranslationY(0.0f);
                } else {
                    c40Var.N4.setAlpha(0);
                    c40Var.d1();
                    if (c40Var.V3.getParent() != null) {
                        c40Var.b.removeView(c40Var.V3);
                    }
                    c40Var.V3 = null;
                    c20Var.setVisibility(8);
                    c40Var.W3 = false;
                    c40Var.P1.X = true;
                    c40Var.S3.setVisibility(8);
                    if (c40Var.j2) {
                        c40Var.j2 = false;
                        c40Var.Q0(true);
                    }
                    org.telegram.ui.Components.voip.y yVar4 = c40Var.Q4;
                    if (yVar4 != null) {
                        yVar4.a.setRoundCorners(0.0f);
                    }
                }
                c40Var.U0();
                c40Var.b.invalidate();
                c40Var.i1.invalidate();
                c40Var.H1.invalidate();
                return;
            case 11:
                wt0 wt0Var = (wt0) this.c;
                ce0 ce0Var = (ce0) this.d;
                if (ce0Var.J == 0 && this.b) {
                    ce0Var.N1(true, true);
                }
                wt0Var.setVisibility(8);
                wt0Var.g();
                wt0Var.setX(0.0f);
                return;
            case 12:
                zr0 zr0Var = (zr0) this.d;
                zr0Var.D = this.b ? 1.0f : 0.0f;
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
                rz0 rz0Var = (rz0) this.d;
                rz0Var.s = this.b ? 1.0f : 0.0f;
                rz0Var.b.invalidate();
                rz0Var.c.invalidate();
                rz0Var.e();
                TextView textView = rz0Var.D;
                if (textView != null) {
                    textView.setAlpha(rz0Var.s);
                }
                if (rz0Var.S) {
                    rz0Var.N.invalidate();
                }
                if (!rz0Var.S && (pz0Var = rz0Var.N) != null && pz0Var.getSeekBarWaveform() != null) {
                    pm0 seekBarWaveform = rz0Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = rz0Var.s;
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
                f81 f81Var = (f81) this.d;
                f81Var.y = this.b ? 1.0f : 0.0f;
                f81Var.b.invalidate();
                f81Var.c.invalidate();
                f81Var.e();
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
