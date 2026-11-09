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
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.bs0;
import org.telegram.ui.cn;
import org.telegram.ui.e20;
import org.telegram.ui.e40;
import org.telegram.ui.ee0;
import org.telegram.ui.h81;
import org.telegram.ui.rn;
import org.telegram.ui.sz0;
import org.telegram.ui.t3;
import org.telegram.ui.uz0;
import tg.i2;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        sz0 sz0Var;
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
                kk0 kk0Var = (kk0) this.d;
                float f10 = this.b ? 1.0f : 0.0f;
                kk0Var.r = f10;
                kk0Var.D.setScaleX(org.telegram.messenger.g0.T1(0.8f, 1.0f, f10));
                kk0Var.D.setScaleY(org.telegram.messenger.g0.T1(0.8f, 1.0f, kk0Var.r));
                kk0Var.D.setAlpha(kk0Var.r);
                kk0Var.s.invalidate();
                kk0Var.w.invalidate();
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
                e40 e40Var = (e40) this.d;
                e20 e20Var = e40Var.t4;
                org.telegram.ui.Components.voip.y yVar3 = (org.telegram.ui.Components.voip.y) this.c;
                if (yVar3 != null) {
                    yVar3.f = false;
                }
                qs.f(e40Var.k1.a).j(e40Var.U4);
                e40Var.T4 = false;
                boolean z9 = this.b;
                float f11 = z9 ? 1.0f : 0.0f;
                e40Var.U3 = f11;
                e40Var.R3.n = f11;
                if (z9) {
                    e20Var.setAlpha(1.0f);
                    e20Var.setScaleX(1.0f);
                    e20Var.setScaleY(1.0f);
                    e20Var.setTranslationX(0.0f);
                    e20Var.setTranslationY(0.0f);
                } else {
                    e40Var.N4.setAlpha(0);
                    e40Var.d1();
                    if (e40Var.V3.getParent() != null) {
                        e40Var.b.removeView(e40Var.V3);
                    }
                    e40Var.V3 = null;
                    e20Var.setVisibility(8);
                    e40Var.W3 = false;
                    e40Var.P1.X = true;
                    e40Var.S3.setVisibility(8);
                    if (e40Var.j2) {
                        e40Var.j2 = false;
                        e40Var.Q0(true);
                    }
                    org.telegram.ui.Components.voip.y yVar4 = e40Var.Q4;
                    if (yVar4 != null) {
                        yVar4.a.setRoundCorners(0.0f);
                    }
                }
                e40Var.U0();
                e40Var.b.invalidate();
                e40Var.i1.invalidate();
                e40Var.H1.invalidate();
                return;
            case 11:
                yt0 yt0Var = (yt0) this.c;
                ee0 ee0Var = (ee0) this.d;
                if (ee0Var.J == 0 && this.b) {
                    ee0Var.N1(true, true);
                }
                yt0Var.setVisibility(8);
                yt0Var.g();
                yt0Var.setX(0.0f);
                return;
            case 12:
                bs0 bs0Var = (bs0) this.d;
                bs0Var.D = this.b ? 1.0f : 0.0f;
                bs0Var.c.invalidate();
                bs0Var.d.invalidate();
                bs0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 13:
                uz0 uz0Var = (uz0) this.d;
                uz0Var.s = this.b ? 1.0f : 0.0f;
                uz0Var.b.invalidate();
                uz0Var.c.invalidate();
                uz0Var.e();
                TextView textView = uz0Var.D;
                if (textView != null) {
                    textView.setAlpha(uz0Var.s);
                }
                if (uz0Var.S) {
                    uz0Var.N.invalidate();
                }
                if (!uz0Var.S && (sz0Var = uz0Var.N) != null && sz0Var.getSeekBarWaveform() != null) {
                    qm0 seekBarWaveform = uz0Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = uz0Var.s;
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
                h81 h81Var = (h81) this.d;
                h81Var.y = this.b ? 1.0f : 0.0f;
                h81Var.b.invalidate();
                h81Var.c.invalidate();
                h81Var.e();
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
