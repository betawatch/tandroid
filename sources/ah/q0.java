package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ei.vb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.ym0;
import org.telegram.ui.ad1;
import org.telegram.ui.fg0;
import org.telegram.ui.ko;
import org.telegram.ui.m30;
import org.telegram.ui.s50;
import org.telegram.ui.sn;
import org.telegram.ui.sv0;
import org.telegram.ui.x3;
import org.telegram.ui.x31;
import org.telegram.ui.z31;
import rg.t2;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class q0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 14:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        x31 x31Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(anim);
                t0 t0Var = (t0) this.d;
                t0Var.E.remove((ValueAnimator) this.c);
                t0.a(t0Var, this.b);
                return;
            case 1:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 2:
                ((vb) this.d).m0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
            case 3:
                x3 x3Var = (x3) this.d;
                x3Var.x = this.b ? 1.0f : 0.0f;
                if (!x3Var.n) {
                    x3Var.n();
                }
                x3Var.i();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                }
                x3Var.h();
                return;
            case 4:
                sn snVar = (sn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = snVar.B8;
                if (bitmap != null) {
                    snVar.C8 = null;
                    snVar.D8 = null;
                    bitmap.recycle();
                    snVar.B8 = null;
                }
                u1 u1Var = (u1) this.c;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
                snVar.sb(null);
                snVar.M8 = null;
                snVar.X0.invalidate();
                snVar.x0.invalidate();
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.c;
                ((ko) this.d).N.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 6:
                ym0 ym0Var = (ym0) this.d;
                float f7 = this.b ? 1.0f : 0.0f;
                ym0Var.r = f7;
                ym0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
                ym0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, ym0Var.r));
                ym0Var.y.setAlpha(ym0Var.r);
                ym0Var.s.invalidate();
                ym0Var.v.invalidate();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.c;
                tVar2.setScaleX(1.0f);
                tVar2.setScaleY(1.0f);
                tVar2.setAlpha(1.0f);
                if (this.b) {
                    tVar.x.removeView(tVar2);
                    tVar.e();
                }
                tVar2.setVisibility(8);
                return;
            case 8:
                s50 s50Var = (s50) this.d;
                m30 m30Var = s50Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.c;
                if (tVar3 != null) {
                    tVar3.f = false;
                }
                s50Var.d.getNotificationCenter().onAnimationFinish(s50Var.d3);
                s50Var.c3 = false;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                s50Var.d2 = f10;
                s50Var.a2.n = f10;
                if (z10) {
                    m30Var.setAlpha(1.0f);
                    m30Var.setScaleX(1.0f);
                    m30Var.setScaleY(1.0f);
                    m30Var.setTranslationX(0.0f);
                    m30Var.setTranslationY(0.0f);
                } else {
                    s50Var.W2.setAlpha(0);
                    s50Var.c1();
                    if (s50Var.e2.getParent() != null) {
                        viewGroup2 = ((f3) s50Var).containerView;
                        viewGroup2.removeView(s50Var.e2);
                    }
                    s50Var.e2 = null;
                    m30Var.setVisibility(8);
                    s50Var.f2 = false;
                    s50Var.Y.X = true;
                    s50Var.b2.setVisibility(8);
                    if (s50Var.s0) {
                        s50Var.s0 = false;
                        s50Var.P0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = s50Var.Z2;
                    if (tVar4 != null) {
                        tVar4.a.setRoundCorners(0.0f);
                    }
                }
                s50Var.T0();
                viewGroup = ((f3) s50Var).containerView;
                viewGroup.invalidate();
                s50Var.b.invalidate();
                s50Var.Q.invalidate();
                return;
            case 9:
                ow0 ow0Var = (ow0) this.c;
                fg0 fg0Var = (fg0) this.d;
                if (fg0Var.J == 0 && this.b) {
                    fg0Var.v1(true, true);
                }
                ow0Var.setVisibility(8);
                ow0Var.g();
                ow0Var.setX(0.0f);
                return;
            case 10:
                sv0 sv0Var = (sv0) this.d;
                sv0Var.y = this.b ? 1.0f : 0.0f;
                sv0Var.c.invalidate();
                sv0Var.d.invalidate();
                sv0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 11:
                z31 z31Var = (z31) this.d;
                z31Var.s = this.b ? 1.0f : 0.0f;
                z31Var.b.invalidate();
                z31Var.c.invalidate();
                z31Var.e();
                TextView textView = z31Var.y;
                if (textView != null) {
                    textView.setAlpha(z31Var.s);
                }
                if (z31Var.S) {
                    z31Var.N.invalidate();
                }
                if (!z31Var.S && (x31Var = z31Var.N) != null && x31Var.getSeekBarWaveform() != null) {
                    fp0 seekBarWaveform = z31Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = z31Var.s;
                    u1 u1Var2 = seekBarWaveform.n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                    }
                }
                Runnable runnable4 = (Runnable) this.c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 12:
                ad1 ad1Var = (ad1) this.d;
                ad1Var.x = this.b ? 1.0f : 0.0f;
                ad1Var.b.invalidate();
                ad1Var.c.invalidate();
                ad1Var.e();
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            case 13:
                t2 t2Var = (t2) this.d;
                ai.r rVar = t2Var.c;
                float f11 = this.b ? 1.0f : 0.0f;
                t2Var.y = f11;
                rVar.setAlpha(f11);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                t2Var.b.invalidate();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    AndroidUtilities.runOnUIThread(runnable6);
                    return;
                }
                return;
            case 14:
                zh.w wVar = (zh.w) this.d;
                if (wVar.O == anim) {
                    wVar.O = null;
                }
                if (this.b) {
                    return;
                }
                ((Runnable) this.c).run();
                return;
            default:
                zh.f0 f0Var = (zh.f0) this.d;
                f0Var.g0();
                f0Var.d.setReveal(this.b ? 1.0f : 0.0f);
                ((Runnable) this.c).run();
                return;
        }
    }

    public /* synthetic */ q0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }

    public q0(zh.w wVar, Runnable runnable) {
        this.a = 14;
        this.d = wVar;
        this.c = runnable;
    }

    public q0(ViewGroup viewGroup, boolean z10, androidx.fragment.app.u0 u0Var, androidx.fragment.app.h hVar) {
        this.a = 1;
        this.c = viewGroup;
        this.b = z10;
        this.d = hVar;
    }
}
