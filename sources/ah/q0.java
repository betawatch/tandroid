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
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.dg0;
import org.telegram.ui.io;
import org.telegram.ui.k30;
import org.telegram.ui.q50;
import org.telegram.ui.qn;
import org.telegram.ui.qv0;
import org.telegram.ui.v31;
import org.telegram.ui.x3;
import org.telegram.ui.x31;
import org.telegram.ui.yc1;
import rg.t2;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
        v31 v31Var;
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
                qn qnVar = (qn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = qnVar.B8;
                if (bitmap != null) {
                    qnVar.C8 = null;
                    qnVar.D8 = null;
                    bitmap.recycle();
                    qnVar.B8 = null;
                }
                u1 u1Var = (u1) this.c;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
                qnVar.tb(null);
                qnVar.M8 = null;
                qnVar.X0.invalidate();
                qnVar.x0.invalidate();
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.c;
                ((io) this.d).N.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 6:
                zm0 zm0Var = (zm0) this.d;
                float f7 = this.b ? 1.0f : 0.0f;
                zm0Var.r = f7;
                zm0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
                zm0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, zm0Var.r));
                zm0Var.y.setAlpha(zm0Var.r);
                zm0Var.s.invalidate();
                zm0Var.v.invalidate();
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
                q50 q50Var = (q50) this.d;
                k30 k30Var = q50Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.c;
                if (tVar3 != null) {
                    tVar3.f = false;
                }
                q50Var.d.getNotificationCenter().onAnimationFinish(q50Var.d3);
                q50Var.c3 = false;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                q50Var.d2 = f10;
                q50Var.a2.n = f10;
                if (z10) {
                    k30Var.setAlpha(1.0f);
                    k30Var.setScaleX(1.0f);
                    k30Var.setScaleY(1.0f);
                    k30Var.setTranslationX(0.0f);
                    k30Var.setTranslationY(0.0f);
                } else {
                    q50Var.W2.setAlpha(0);
                    q50Var.c1();
                    if (q50Var.e2.getParent() != null) {
                        viewGroup2 = ((f3) q50Var).containerView;
                        viewGroup2.removeView(q50Var.e2);
                    }
                    q50Var.e2 = null;
                    k30Var.setVisibility(8);
                    q50Var.f2 = false;
                    q50Var.Y.X = true;
                    q50Var.b2.setVisibility(8);
                    if (q50Var.s0) {
                        q50Var.s0 = false;
                        q50Var.P0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = q50Var.Z2;
                    if (tVar4 != null) {
                        tVar4.a.setRoundCorners(0.0f);
                    }
                }
                q50Var.T0();
                viewGroup = ((f3) q50Var).containerView;
                viewGroup.invalidate();
                q50Var.b.invalidate();
                q50Var.Q.invalidate();
                return;
            case 9:
                qw0 qw0Var = (qw0) this.c;
                dg0 dg0Var = (dg0) this.d;
                if (dg0Var.J == 0 && this.b) {
                    dg0Var.v1(true, true);
                }
                qw0Var.setVisibility(8);
                qw0Var.g();
                qw0Var.setX(0.0f);
                return;
            case 10:
                qv0 qv0Var = (qv0) this.d;
                qv0Var.y = this.b ? 1.0f : 0.0f;
                qv0Var.c.invalidate();
                qv0Var.d.invalidate();
                qv0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 11:
                x31 x31Var = (x31) this.d;
                x31Var.s = this.b ? 1.0f : 0.0f;
                x31Var.b.invalidate();
                x31Var.c.invalidate();
                x31Var.e();
                TextView textView = x31Var.y;
                if (textView != null) {
                    textView.setAlpha(x31Var.s);
                }
                if (x31Var.S) {
                    x31Var.N.invalidate();
                }
                if (!x31Var.S && (v31Var = x31Var.N) != null && v31Var.getSeekBarWaveform() != null) {
                    gp0 seekBarWaveform = x31Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = x31Var.s;
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
                yc1 yc1Var = (yc1) this.d;
                yc1Var.x = this.b ? 1.0f : 0.0f;
                yc1Var.b.invalidate();
                yc1Var.c.invalidate();
                yc1Var.e();
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
                zh.b0 b0Var = (zh.b0) this.d;
                if (b0Var.T == anim) {
                    b0Var.T = null;
                }
                if (this.b) {
                    return;
                }
                ((Runnable) this.c).run();
                return;
            default:
                zh.n0 n0Var = (zh.n0) this.d;
                n0Var.g0();
                n0Var.d.setReveal(this.b ? 1.0f : 0.0f);
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

    public q0(zh.b0 b0Var, Runnable runnable) {
        this.a = 14;
        this.d = b0Var;
        this.c = runnable;
    }

    public q0(ViewGroup viewGroup, boolean z10, androidx.fragment.app.u0 u0Var, androidx.fragment.app.h hVar) {
        this.a = 1;
        this.c = viewGroup;
        this.b = z10;
        this.d = hVar;
    }
}
